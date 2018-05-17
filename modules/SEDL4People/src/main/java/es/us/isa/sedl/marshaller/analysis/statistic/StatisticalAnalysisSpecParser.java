/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.marshaller.analysis.statistic;

import es.us.isa.sedl.core.analysis.datasetspecification.DatasetSpecification;
import es.us.isa.sedl.core.analysis.statistic.CentralTendencyMeasure;
import es.us.isa.sedl.core.analysis.statistic.ConfidenceInterval;
import es.us.isa.sedl.core.analysis.statistic.CorrelationCoeficient;
import es.us.isa.sedl.core.analysis.statistic.DescriptiveStatistic;
import es.us.isa.sedl.core.analysis.statistic.InterquartileRange;
import es.us.isa.sedl.core.analysis.statistic.Mean;
import es.us.isa.sedl.core.analysis.statistic.Median;
import es.us.isa.sedl.core.analysis.statistic.Mode;
import es.us.isa.sedl.core.analysis.statistic.NHST;
import es.us.isa.sedl.core.analysis.statistic.NamedStatisticalTestAssertion;
import es.us.isa.sedl.core.analysis.statistic.Range;
import es.us.isa.sedl.core.analysis.statistic.Ranking;
import es.us.isa.sedl.core.analysis.statistic.StandardDeviation;
import es.us.isa.sedl.core.analysis.statistic.StatisticalTestAssertion;
import es.us.isa.sedl.core.analysis.statistic.VariabilityMeasure;
import es.us.isa.sedl.core.design.StatisticalAnalysisSpec;
import es.us.isa.sedl.core.design.Variable;
import es.us.isa.sedl.grammar.SEDL4PeopleLexer;
import es.us.isa.sedl.grammar.SEDL4PeopleParser;
import es.us.isa.sedl.marshaller.Parser;
import es.us.isa.sedl.marshaller.SEDL4PeopleExtendedListener;
import java.util.ArrayList;
import java.util.List;
import static es.us.isa.sedl.grammar.SEDL4PeopleParser.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.log4j.Logger;

/**
 *
 * @author José Antonio Parejo
 */
public class StatisticalAnalysisSpecParser implements Parser<StatisticalAnalysisSpec, SEDL4PeopleParser.StatisticFunctionContext> {

    private final static Logger log = Logger.getLogger(StatisticalAnalysisSpecParser.class);
    
    private DatasetSpecificationParser datasetSpecParser=new DatasetSpecificationParser();

    private double DEFAULT_ASSUMPTIONS_ALPHA = 0.05;
    private String DEFAULT_NORMALITY_TEST =getTokenName(KOLMOGOROV_SMIRNOV);
    private String DEFAULT_HOMOCEDASTICITY_TEST=getTokenName(LEVENE);

    @Override
    public StatisticalAnalysisSpec parse(SEDL4PeopleParser.StatisticFunctionContext context, SEDL4PeopleExtendedListener listener) {
        StatisticalAnalysisSpec result = new StatisticalAnalysisSpec();
        String functionType = context.getChild(0).getText();
        if (context.nhstSF() != null) {            
            List<NHST> nhstList = parseNHST(context.nhstSF(),listener);            
            result.getStatistic().addAll(nhstList);
        } else if (context.correlationCoeficientSF() != null) {
            List<CorrelationCoeficient> corCoefList=parseCorrelationCoeficient(context.correlationCoeficientSF(),listener);                        
            result.getStatistic().addAll(corCoefList);
        } else if (context.confidenceIntervalSF() != null) {
            // Se necesitan atributos NAME en estas clases, o en Statistic para guardar
            List<ConfidenceInterval> confIntervals = parseConfidenceInterval(context.confidenceIntervalSF(),listener);
            result.getStatistic().addAll(confIntervals);
        } else if (context.variabilityMeasureSF() != null) {
            List<VariabilityMeasure> varMeasures = parseVariabilityMeasure(context.variabilityMeasureSF(),listener);
            result.getStatistic().addAll(varMeasures);
        } else if (context.centralTendencyMeasurementSF() != null) {
            List<CentralTendencyMeasure> centralTendencyMeasures = parseCentralTendencyMeasure(context.centralTendencyMeasurementSF(),listener);
            result.getStatistic().addAll(centralTendencyMeasures);
        } else if (context.rankingSF() != null) {
            List<Ranking> rankings = parseRankings(context.rankingSF(),listener);            
            result.getStatistic().addAll(rankings);
        } else {
            System.out.println("Statistic Function unknown: " + context.getText());
        }
        return result;
    }

    public List<NHST> parseNHST(SEDL4PeopleParser.NhstSFContext ctx, SEDL4PeopleExtendedListener listener) {
            List<NHST> result=new ArrayList<NHST>();            
            String name=ctx.nhstFunction().getText();
            NHST nhst=null;
            if (ctx.statisticFunctionParam() == null || ctx.statisticFunctionParam().isEmpty()) {
                nhst=new NHST();
                nhst.setName(name);
                nhst.setDatasetSpecification(datasetSpecParser.defaultDatsetSpecification(listener,NHST.class,name));
                generateAssumpions(name,nhst.getAssumptions(),nhst.getDatasetSpecification());
                result.add(nhst);
            } else {
                DatasetSpecification dataset = null;      
                
                nhst = new NHST();
                nhst.setName(name);
                if(!ctx.statisticFunctionParam(0).getText().equals("")){
                	dataset=datasetSpecParser.parse(ctx.statisticFunctionParam(0), listener);
                }
                nhst.setDatasetSpecification(dataset);
                if(!ctx.statisticFunctionParam(1).getText().equals("")){
                	nhst.setAlpha(Double.parseDouble(ctx.statisticFunctionParam(1).getText()));
                }
                generateAssumpions(name,nhst.getAssumptions(),nhst.getDatasetSpecification());
                result.add(nhst);                                                  
            }
            return result;
    }

    private List<CorrelationCoeficient> parseCorrelationCoeficient(SEDL4PeopleParser.CorrelationCoeficientSFContext ctx, SEDL4PeopleExtendedListener listener) {
        List<CorrelationCoeficient> result=new ArrayList<CorrelationCoeficient>();
        CorrelationCoeficient corrCoef=null;
        String name=ctx.ccFunction().getText();
        if (ctx.statisticFunctionParam() == null || ctx.statisticFunctionParam().isEmpty()) {
                corrCoef=new CorrelationCoeficient();        
                corrCoef.setName(name);
                corrCoef.setDatasetSpecification(datasetSpecParser.defaultDatsetSpecification(listener,corrCoef.getClass(),name));
                result.add(corrCoef);
            } else {
                DatasetSpecification dataset = null;                
                for (SEDL4PeopleParser.StatisticFunctionParamContext paramCtx : ctx.statisticFunctionParam()) {                    
                    corrCoef=new CorrelationCoeficient();        
                    corrCoef.setName(name);
                    dataset=datasetSpecParser.parse(paramCtx, listener);
                    corrCoef.setDatasetSpecification(dataset);
                    result.add(corrCoef);
                }                                                    
            }        
        return result;
    }

    private List<ConfidenceInterval> parseConfidenceInterval(SEDL4PeopleParser.ConfidenceIntervalSFContext confidenceIntervalSF, SEDL4PeopleExtendedListener listener) {
        List<ConfidenceInterval> result=new ArrayList<ConfidenceInterval>();        
        ConfidenceInterval confInt=new ConfidenceInterval();
        DatasetSpecification dataset = datasetSpecParser.defaultDatsetSpecification(listener, ConfidenceInterval.class,null);
        confInt.setDatasetSpecification(dataset);
        result.add(confInt);
        return result;
    }

    private List<VariabilityMeasure> parseVariabilityMeasure(SEDL4PeopleParser.VariabilityMeasureSFContext ctx, SEDL4PeopleExtendedListener listener) {
        List<VariabilityMeasure> result=new ArrayList<VariabilityMeasure>();                
        String function=ctx.vmFunction().getText();        
        if (ctx.statisticFunctionParam() == null || ctx.statisticFunctionParam().isEmpty()) {
            VariabilityMeasure varMeasure=createVariabilityMeasure(function);
            DatasetSpecification datasetSpec=datasetSpecParser.defaultDatsetSpecification(listener, varMeasure.getClass(), function);
            varMeasure.setDatasetSpecification(datasetSpec);
            result.add(varMeasure);
        } else{
                DatasetSpecification dataset = null;                
                for (SEDL4PeopleParser.StatisticFunctionParamContext paramCtx : ctx.statisticFunctionParam()) {                    
                    VariabilityMeasure varMeasure=createVariabilityMeasure(function);
                    DatasetSpecification datasetSpec=datasetSpecParser.parse(paramCtx,listener);
                    varMeasure.setDatasetSpecification(datasetSpec);
                    result.add(varMeasure);
                }
        }        
        return result;
    }
    
    private VariabilityMeasure createVariabilityMeasure(String function)
    {
        VariabilityMeasure varMeasure=null;
        if(function.equals(clear(tokenNames[STDDEV]))){  // STDDEV
            varMeasure=new StandardDeviation();            
        }else if(function.equals(clear(tokenNames[RANGE]))){ //RANGE
            varMeasure=new Range();
        }else if(function.equals(clear(tokenNames[IQR]))){ //IQR
            varMeasure=new InterquartileRange();
       }
        return varMeasure;
    }

    private List<CentralTendencyMeasure> parseCentralTendencyMeasure(CentralTendencyMeasurementSFContext ctx, SEDL4PeopleExtendedListener listener) {
        List<CentralTendencyMeasure> result=new ArrayList<>();
        String function=ctx.ctmFunction().getText();
        if (ctx.statisticFunctionParam() == null || ctx.statisticFunctionParam().isEmpty()) {
            CentralTendencyMeasure ctMeasure=createCentralTendencyMeasure(function);
            DatasetSpecification datasetSpec=datasetSpecParser.defaultDatsetSpecification(listener, ctMeasure.getClass(), function);
            ctMeasure.setDatasetSpecification(datasetSpec);
            result.add(ctMeasure);
        } else {
                DatasetSpecification dataset = null;                
                for (SEDL4PeopleParser.StatisticFunctionParamContext paramCtx : ctx.statisticFunctionParam()) {                    
                    CentralTendencyMeasure ctMeasure=createCentralTendencyMeasure(function);
                    DatasetSpecification datasetSpec=datasetSpecParser.parse(paramCtx,listener);
                    ctMeasure.setDatasetSpecification(datasetSpec);
                    result.add(ctMeasure);
                }
        }        
        return result;
    }
    
    private CentralTendencyMeasure createCentralTendencyMeasure(String function)
    {
        CentralTendencyMeasure result=null;
        if(function.equals(clear(tokenNames[MEAN]))){  // MEAN
            result=new Mean();
        }else if(function.equals(clear(tokenNames[MEDIAN]))){  // MEDIAN
            result=new Median();
        }else if(function.equals(clear(tokenNames[MODE]))){  // MODE
            result=new Mode();
        }
        return result;
    }

    private List<Ranking> parseRankings(RankingSFContext ctx, SEDL4PeopleExtendedListener listener) {
        List<Ranking> result=new ArrayList<>();
        RFunctionContext rfunctx=ctx.rFunction();
        String rankingVariable=ctx.id().getText();
        DescriptiveStatistic descStatistic=null;
        if(ctx.centralTendencyMeasurementSF()!=null)
            descStatistic=parseCentralTendencyMeasure(ctx.centralTendencyMeasurementSF(), listener).get(0);
        else if(ctx.variabilityMeasureSF()!=null)        
            descStatistic=parseVariabilityMeasure(ctx.variabilityMeasureSF(), listener).get(0);
        Ranking ranking=new Ranking();
        ranking.setRankingVariable(listener.findVariableById(rankingVariable,true,Variable.class).getName());
        ranking.setRankingCriterion(descStatistic);
        result.add(ranking);
        return result;
    }

    private String clear(String tokenName) {
        return tokenName.replace("'", "");
    }

    @Override
    public StatisticalAnalysisSpec parse(String s, SEDL4PeopleExtendedListener listener) {
        StatisticalAnalysisSpec result=null;
        try {
            ByteArrayInputStream stream=new ByteArrayInputStream( s.getBytes() );
            SEDL4PeopleLexer lexer = new SEDL4PeopleLexer(new ANTLRInputStream(stream));
            //lexer.addErrorListener(errorListener);
            CommonTokenStream tokens = new CommonTokenStream(lexer);            
            SEDL4PeopleParser parser = new SEDL4PeopleParser(tokens);            
            //parser.addErrorListener(errorListener);                       
            result=parse(parser.statisticFunction(),listener);            
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(DatasetSpecificationParser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return result;        
    }

    private void generateAssumpions(String name, List<StatisticalTestAssertion> assumptions,DatasetSpecification spec) {        
        if(getTokenName(TTEST).equals(name)){            
            assumptions.add(generateNormalityAssumption(spec));
            assumptions.add(generateHomocedasticityAssumption(spec));
        }else if(getTokenName(ANOVA).equals(name)){
            assumptions.add(generateNormalityAssumption(spec));
            assumptions.add(generateHomocedasticityAssumption(spec));
        }
    }
    
    private NamedStatisticalTestAssertion generateNormalityAssumption(DatasetSpecification spec){        
        NHST test=new NHST();
        test.setName(DEFAULT_NORMALITY_TEST);
        test.setAlpha(DEFAULT_ASSUMPTIONS_ALPHA);
        test.setDatasetSpecification(spec);
        NamedStatisticalTestAssertion assertion=new NamedStatisticalTestAssertion("Normality",test,false);
        return assertion;
    }
    
    private NamedStatisticalTestAssertion generateHomocedasticityAssumption(DatasetSpecification spec){ 
        NHST test=new NHST();
        test.setName(DEFAULT_HOMOCEDASTICITY_TEST);
        test.setAlpha(DEFAULT_ASSUMPTIONS_ALPHA);
        test.setDatasetSpecification(spec);
        NamedStatisticalTestAssertion assertion=new NamedStatisticalTestAssertion("Homocedasticity (equality of variances)",test,false);
        return assertion;
    }

    private String getTokenName(int token) {
        String tk = SEDL4PeopleLexer.tokenNames[token];
        return tk.substring(1, tk.length() - 1).trim();
    }
}
