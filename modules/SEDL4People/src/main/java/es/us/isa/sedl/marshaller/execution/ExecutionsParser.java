/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.marshaller.execution;

import es.us.isa.sedl.core.BasicExperiment;
import es.us.isa.sedl.core.analysis.AnalysisResult;
import es.us.isa.sedl.core.analysis.datasetspecification.DatasetSpecification;
import es.us.isa.sedl.core.analysis.statistic.ConfidenceIntervalValue;
import es.us.isa.sedl.core.analysis.statistic.CorrelationValue;
import es.us.isa.sedl.core.analysis.statistic.DescriptiveStatisticValue;
import es.us.isa.sedl.core.analysis.statistic.CorrelationCoeficient;
import es.us.isa.sedl.core.analysis.statistic.NHST;
import es.us.isa.sedl.core.analysis.statistic.PValue;
import es.us.isa.sedl.core.analysis.statistic.Rank;
import es.us.isa.sedl.core.analysis.statistic.RankingResult;
import es.us.isa.sedl.core.analysis.statistic.Statistic;
import es.us.isa.sedl.core.analysis.statistic.StatisticalAnalysisSpec;
import es.us.isa.sedl.core.configuration.ExperimentalSetting;
import es.us.isa.sedl.core.configuration.File;
import es.us.isa.sedl.core.configuration.FileFormatSpecification;
import es.us.isa.sedl.core.design.AnalysisSpecification;
import es.us.isa.sedl.core.execution.Execution;
import es.us.isa.sedl.core.execution.ExperimentalResult;
import es.us.isa.sedl.core.execution.ResultsFile;
import es.us.isa.sedl.grammar.SEDL4PeopleLexer;
import es.us.isa.sedl.grammar.SEDL4PeopleParser;
import es.us.isa.sedl.marshaller.Parser;
import es.us.isa.sedl.marshaller.SEDL4PeopleExtendedListener;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import static es.us.isa.sedl.grammar.SEDL4PeopleParser.*;
import es.us.isa.sedl.marshaller.analysis.statistic.DatasetSpecificationParser;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.InvalidParameterException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author JosÃ© Antonio Parejo
 */
public class ExecutionsParser implements Parser<List<Execution>, SEDL4PeopleParser.ExecutionContext> {

    private final static Logger log = Logger.getLogger(ExecutionsParser.class);
    /*
    private static Map<Class,List<String>> analysisSpecsPerStatisticalFunction;
    
    static{
        analysisSpecsPerStatisticalFunction=new HashMap<Class, List<String>>();
        analysisSpecsPerStatisticalFunction.put(, Lists.newArrayList(ruleNames));
    }
    */
    
    @Override
    public List<Execution> parse(SEDL4PeopleParser.ExecutionContext exeCtx, SEDL4PeopleExtendedListener listener) {
        List<Execution> result = new ArrayList<Execution>();
        List<SEDL4PeopleParser.ExecutionBlockContext> blocks = exeCtx.executionBlock();
        Execution exec = null;
        for (SEDL4PeopleParser.ExecutionBlockContext block : blocks) {
            exec = parseExecution(block, listener);
            result.add(exec);
        }
        return result;
    }

    private Execution parseExecution(SEDL4PeopleParser.ExecutionBlockContext block, SEDL4PeopleExtendedListener listener) {
        Execution result = new Execution();
        List<AnalysisResult> analResult = new ArrayList<AnalysisResult>();
        List<ExperimentalResult> expResult = new ArrayList<ExperimentalResult>();
        List<ExperimentalSetting> expSettings = new ArrayList<ExperimentalSetting>();
        List<String> annotations = new ArrayList<String>();
        List<String> notes = new ArrayList<String>();
        AnalysisResult analysis = null;
        ExperimentalResult exp = new ExperimentalResult();
        ExperimentalSetting sett = new ExperimentalSetting();
        String analysisId = null;
        //Analysis Result
        for (SEDL4PeopleParser.AnalysesExecBlockContext a : block.executionConf().analysesExecution().analysesExecBlock()) {

            log.info(" AnalysesExecBlockContext: " + a.id().getText());
            analysisId = a.id().getText();//ID
            String lastfunction = "";            
            analResult.addAll(parseAnalysisResult(a, listener));
        }
        result.setId(block.id().getText());

        //ResultFile
        ResultsFile results_file = new ResultsFile();
        File f = new File();
        String path = block.executionConf().resultExecution().fileExec().get(0).getText();
        log.info("Path: " + path);
        f.setPath(path);
        f.setName(path.split("/")[path.split("/").length - 1].split("\\.")[0]);
        FileFormatSpecification filef = new FileFormatSpecification() {

            @Override
            public Object createNewInstance() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        filef.setType(path.split("/")[path.split("/").length - 1].split("\\.")[1]);
        f.setFileformatspecification(filef);
        f.setPath(path);
        results_file.setFile(f);

        result.getResults().add(results_file);
        result.getAnalysisResults().addAll(analResult);
        expResult.add(exp);

        result.getResults().addAll(expResult);
        return result;
    }

    private List<AnalysisResult> parseAnalysisResult(SEDL4PeopleParser.AnalysesExecBlockContext a, SEDL4PeopleExtendedListener listener) {
        List<AnalysisResult> result = new ArrayList<AnalysisResult>();
        String actualFunction = null;
        String lastfunction = null;
        for (SEDL4PeopleParser.ExeFunctionContext exe : a.analFunctions().exeFunction()) {
            try {
                actualFunction = exe.exeFunctionTypes().getText();
                result = createAnalysisResult(actualFunction, a, exe, listener);
                log.info(" Method: " + actualFunction);
                lastfunction = actualFunction;
            } catch (Exception e) {
                result = createAnalysisResult(lastfunction, a, exe, listener);
                log.info(" Methos: " + lastfunction);
            }
        }

        return result;

    }

    private List<AnalysisResult> createAnalysisResult(String actualFunction, SEDL4PeopleParser.AnalysesExecBlockContext a, SEDL4PeopleParser.ExeFunctionContext exe, SEDL4PeopleExtendedListener listener) {
        List<AnalysisResult> result = null;
        if (actualFunction.equals(tokenNames[MEAN]) || actualFunction.equals(tokenNames[MODE])
                || actualFunction.equals(tokenNames[MEDIAN]) || actualFunction.equals(tokenNames[STDDEV])
                || actualFunction.equals(tokenNames[VARIANCE]) || actualFunction.equals(tokenNames[IQR])
                || actualFunction.equals(tokenNames[RANGE])) {
            result = parseDescriptiveAnalysisResult(actualFunction, a, exe, listener);
        } else if (actualFunction.equals(tokenNames[CONFIDENCE_INTERVAL])) {
            result = parseConfidenceIntervalResult(actualFunction, a, exe, listener);
        } else if (actualFunction.equals(tokenNames[RANKING])) {
            result = parseRankingResult(actualFunction, a, exe, listener);
        } else if (actualFunction.equals(tokenNames[PEARSON]) || actualFunction.equals(tokenNames[SPEARMAN]) || actualFunction.equals(tokenNames[KENDALL])) {
            result = parseCorrelationResult(actualFunction, a, exe, listener);
        } else { // We assume a NHST otherwise:
            result = parseNSHTResult(actualFunction, a, exe, listener);
        }
        return result;
    }

    private List<AnalysisResult> parseDescriptiveAnalysisResult(String actualFunction, AnalysesExecBlockContext a, SEDL4PeopleParser.ExeFunctionContext exe, SEDL4PeopleExtendedListener listener) {
        List<AnalysisResult> result = new ArrayList<AnalysisResult>();
        DatasetSpecification dataSpec = parseDatasetSpecification(actualFunction, a, exe, listener);
        DescriptiveStatisticValue dsv = null;
        for (ValueContext vc : exe.values().value()) {
            dsv = new DescriptiveStatisticValue();
            dsv.setDescriptiveStatistic(actualFunction);
            dsv.setId(a.id().getText());
            dsv.setValue(vc.getText());
            dsv.setDatasetSpecification(dataSpec);
            result.add(dsv);
        }
        return result;
    }

    private List<AnalysisResult> parseConfidenceIntervalResult(String actualFunction, AnalysesExecBlockContext a, SEDL4PeopleParser.ExeFunctionContext exe, SEDL4PeopleExtendedListener listener) {
        List<AnalysisResult> result = new ArrayList<AnalysisResult>();
        ConfidenceIntervalValue civ = null;
        DatasetSpecification dataSpec = parseDatasetSpecification(actualFunction, a, exe, listener);
        int i = 0;
        while (i < exe.values().value().size()) {
            civ = new ConfidenceIntervalValue();
            civ.setId(a.id().getText());
            civ.setMin(Double.parseDouble(exe.values().value(i).getText()));
            i++;
            if (i < exe.values().value().size()) {
                civ.setMax(Double.parseDouble(exe.values().value(i).getText()));
            } else {
                throw new InvalidParameterException("For a confidence interval you should provide both a minimum and a maximum");
            }
            i++;
            civ.setDatasetSpecification(null);
            result.add(civ);
        }
        return result;
    }

    private List<AnalysisResult> parseRankingResult(String actualFunction, AnalysesExecBlockContext a, SEDL4PeopleParser.ExeFunctionContext exe, SEDL4PeopleExtendedListener listener) {
        RankingResult rankingResult = new RankingResult();
        rankingResult.setId(a.id().getText());
        DatasetSpecification dataSpec = parseDatasetSpecification(actualFunction, a, exe, listener);
        rankingResult.setDatasetSpecification(dataSpec);
        List<AnalysisResult> result = new ArrayList<AnalysisResult>();
        result.add(rankingResult);
        Rank rank = null;
        for (ValueContext vc : exe.values().value()) {
            rank = new Rank();
            rank.setLevel(vc.getText());
            rankingResult.getRanks().add(rank);
        }
        return result;
    }

    private List<AnalysisResult> parseCorrelationResult(String actualFunction, AnalysesExecBlockContext a, SEDL4PeopleParser.ExeFunctionContext exe, SEDL4PeopleExtendedListener listener) {
        List<AnalysisResult> result = new ArrayList<AnalysisResult>();
        DatasetSpecification dataSpec = parseDatasetSpecification(actualFunction, a, exe, listener);
        CorrelationValue cv = null;
        for (ValueContext vc : exe.values().value()) {
            cv = new CorrelationValue();
            cv.setId(a.id().getText());
            cv.setValue(Double.parseDouble(vc.getText()));
            cv.setCorrelationCoeficient(actualFunction);
            cv.setDatasetSpecification(dataSpec);
            result.add(cv);
        }
        return result;
    }

    private List<AnalysisResult> parseNSHTResult(String actualFunction, AnalysesExecBlockContext a, SEDL4PeopleParser.ExeFunctionContext exe, SEDL4PeopleExtendedListener listener) {
        List<AnalysisResult> result = new ArrayList<AnalysisResult>();
        PValue pvalue = null;
        DatasetSpecification dataSpec = parseDatasetSpecification(actualFunction, a, exe, listener);
        for (ValueContext vc : exe.values().value()) {
            pvalue = new PValue();
            pvalue.setNHST(actualFunction);
            pvalue.setValue(Double.parseDouble(vc.getText()));
            pvalue.setId(a.id().getText());
            pvalue.setDescription(exe.friedmanFunction().exeDescription().getText());
            pvalue.setValue(Double.parseDouble(exe.friedmanFunction().freedom_degrees().value().getText()));
            pvalue.setDatasetSpecification(dataSpec);
            result.add(pvalue);
        }
        return result;
    }

    private DatasetSpecification parseDatasetSpecification(String actualFunction, AnalysesExecBlockContext a, ExeFunctionContext exe, SEDL4PeopleExtendedListener listener) {
        DatasetSpecification result=new DatasetSpecification();
        String analysisId=a.id().getText();
        BasicExperiment exp=(BasicExperiment)listener.getExperimentModel();
        AnalysisSpecification spec=exp.getDesign().getAnalysisSpecById(analysisId);        
        Statistic  statistic=null;
        if(spec instanceof StatisticalAnalysisSpec){
            statistic=findApropiateStatistic((StatisticalAnalysisSpec)spec,actualFunction);            
            result=statistic.getDatasetSpecification();
        }
        return result;
    }

    private Statistic findApropiateStatistic(StatisticalAnalysisSpec statisticalAnalysisSpec,String actualFunction) {
        Statistic result=null;
        for(Statistic statistic:statisticalAnalysisSpec.getStatistic())
        {
            if(statistic instanceof NHST){
                if(((NHST)statistic).getName().toUpperCase().equals(actualFunction))
                    result=statistic;
            }else if(statistic instanceof CorrelationCoeficient){
                if(((CorrelationCoeficient)statistic).getName().toUpperCase().equals(
                    actualFunction))
                        result=statistic;
            }else if(statistic.getClass().getSimpleName().toUpperCase().equals(
                        actualFunction)){
                    result=statistic;
            }
            if(result!=null)
                break;
        }
        return result;
    }

    @Override
    public List<Execution> parse(String s, SEDL4PeopleExtendedListener listener) {
        List<Execution> result=null;
        try {
            ByteArrayInputStream stream=new ByteArrayInputStream( s.getBytes() );
            SEDL4PeopleLexer lexer = new SEDL4PeopleLexer(new ANTLRInputStream(stream));
            //lexer.addErrorListener(errorListener);
            CommonTokenStream tokens = new CommonTokenStream(lexer);            
            SEDL4PeopleParser parser = new SEDL4PeopleParser(tokens);            
            //parser.addErrorListener(errorListener);                       
            result=parse(parser.execution(),listener);            
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(DatasetSpecificationParser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return result;
    }

    

}
