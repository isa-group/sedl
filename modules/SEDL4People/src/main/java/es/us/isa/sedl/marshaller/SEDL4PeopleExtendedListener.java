package es.us.isa.sedl.marshaller;

import static es.us.isa.sedl.grammar.SEDL4PeopleParser.ADDITIONAL_EVIDENCE;
import static es.us.isa.sedl.grammar.SEDL4PeopleParser.MAIN_RESULT;
import static es.us.isa.sedl.grammar.SEDL4PeopleParser.MISCELLANEOUS;
import static es.us.isa.sedl.grammar.SEDL4PeopleParser.tokenNames;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.RuleNode;
import org.apache.log4j.Logger;

import es.us.isa.sedl.core.BasicExperiment;
import es.us.isa.sedl.core.Experiment;
import es.us.isa.sedl.core.ExtensionPointElement;
import es.us.isa.sedl.core.analysis.datasetspecification.DatasetSpecification;
import es.us.isa.sedl.core.analysis.statistic.CentralTendencyMeasure;
import es.us.isa.sedl.core.analysis.statistic.InterquartileRange;
import es.us.isa.sedl.core.analysis.statistic.Mean;
import es.us.isa.sedl.core.analysis.statistic.Median;
import es.us.isa.sedl.core.analysis.statistic.Mode;
import es.us.isa.sedl.core.analysis.statistic.NHST;
import es.us.isa.sedl.core.analysis.statistic.Range;
import es.us.isa.sedl.core.analysis.statistic.StandardDeviation;
import es.us.isa.sedl.core.analysis.statistic.Statistic;
import es.us.isa.sedl.core.analysis.statistic.VariabilityMeasure;
import es.us.isa.sedl.core.configuration.CommandExperimentalTask;
import es.us.isa.sedl.core.configuration.ComplexParameter;
import es.us.isa.sedl.core.configuration.ComputationEnvironment;
import es.us.isa.sedl.core.configuration.Configuration;
import es.us.isa.sedl.core.configuration.ExperimentalInputs;
import es.us.isa.sedl.core.configuration.ExperimentalOutputs;
import es.us.isa.sedl.core.configuration.ExperimentalProcedure;
import es.us.isa.sedl.core.configuration.ExperimentalSetting;
import es.us.isa.sedl.core.configuration.ExperimentalTask;
import es.us.isa.sedl.core.configuration.ExperimentalTaskType;
import es.us.isa.sedl.core.configuration.File;
import es.us.isa.sedl.core.configuration.FileSpecification;
import es.us.isa.sedl.core.configuration.InputDataSource;
import es.us.isa.sedl.core.configuration.Library;
import es.us.isa.sedl.core.configuration.Measurement;
import es.us.isa.sedl.core.configuration.OutputDataSource;
import es.us.isa.sedl.core.configuration.OutputDataSourceRole;
import es.us.isa.sedl.core.configuration.Postprocessing;
import es.us.isa.sedl.core.configuration.Preprocessing;
import es.us.isa.sedl.core.configuration.Runtime;
import es.us.isa.sedl.core.configuration.SimpleParameter;
import es.us.isa.sedl.core.configuration.SoftwarePlatform;
import es.us.isa.sedl.core.configuration.Treatment;
import es.us.isa.sedl.core.context.Context;
import es.us.isa.sedl.core.design.AnalysisSpecificationGroup;
import es.us.isa.sedl.core.design.AssignmentMethod;
import es.us.isa.sedl.core.design.ControllableFactor;
import es.us.isa.sedl.core.design.Design;
import es.us.isa.sedl.core.design.ExperimentalDesign;
import es.us.isa.sedl.core.design.ExperimentalProtocol;
import es.us.isa.sedl.core.design.ExperimentalProtocolStep;
import es.us.isa.sedl.core.design.ExtensionDomain;
import es.us.isa.sedl.core.design.Factor;
import es.us.isa.sedl.core.design.FullySpecifiedExperimentalDesign;
import es.us.isa.sedl.core.design.FundamentalSet;
import es.us.isa.sedl.core.design.FundamentalSetConstraint;
import es.us.isa.sedl.core.design.Group;
import es.us.isa.sedl.core.design.IntensionDomain;
import es.us.isa.sedl.core.design.IntervalConstraint;
import es.us.isa.sedl.core.design.Level;
import es.us.isa.sedl.core.design.Literal;
import es.us.isa.sedl.core.design.NonControllableFactor;
import es.us.isa.sedl.core.design.Nuisance;
import es.us.isa.sedl.core.design.Outcome;
import es.us.isa.sedl.core.design.Population;
import es.us.isa.sedl.core.design.ProtocolScheme;
import es.us.isa.sedl.core.design.SamplingMethod;
import es.us.isa.sedl.core.design.StatisticalAnalysisSpec;
import es.us.isa.sedl.core.design.Variable;
import es.us.isa.sedl.core.design.VariableKind;
import es.us.isa.sedl.core.design.VariableValuation;
import es.us.isa.sedl.core.design.Variables;
import es.us.isa.sedl.core.execution.Execution;
import es.us.isa.sedl.core.execution.ResultsFile;
import es.us.isa.sedl.core.hypothesis.AssociationalHypothesis;
import es.us.isa.sedl.core.hypothesis.DescriptiveHypothesis;
import es.us.isa.sedl.core.hypothesis.DifferentialHypothesis;
import es.us.isa.sedl.core.hypothesis.Hypothesis;
import es.us.isa.sedl.core.hypothesis.LinearRelation;
import es.us.isa.sedl.core.hypothesis.LogisticRelation;
import es.us.isa.sedl.core.hypothesis.MonotonicRelation;
import es.us.isa.sedl.error.SEDL4PeopleError;
import es.us.isa.sedl.error.SEDL4PeopleErrorListener;
import es.us.isa.sedl.grammar.SEDL4PeopleBaseListener;
import es.us.isa.sedl.grammar.SEDL4PeopleParser;
import es.us.isa.sedl.grammar.SEDL4PeopleParser.EnumDeclarationContext;
import es.us.isa.sedl.grammar.SEDL4PeopleParser.ExperimentalProcedureContext;
import es.us.isa.sedl.grammar.SEDL4PeopleParser.FactorDeclarationRangeContext;
import es.us.isa.sedl.grammar.SEDL4PeopleParser.FactorDeclarationTypeContext;
import es.us.isa.sedl.grammar.SEDL4PeopleParser.FactorsContext;
import es.us.isa.sedl.grammar.SEDL4PeopleParser.FieldContext;
import es.us.isa.sedl.grammar.SEDL4PeopleParser.FilesContext;
import es.us.isa.sedl.grammar.SEDL4PeopleParser.IdContext;
import es.us.isa.sedl.grammar.SEDL4PeopleParser.LibraryContext;
import es.us.isa.sedl.grammar.SEDL4PeopleParser.NcfactorsContext;
import es.us.isa.sedl.grammar.SEDL4PeopleParser.OutcomeDeclarationContext;
import es.us.isa.sedl.grammar.SEDL4PeopleParser.RolesContext;
import es.us.isa.sedl.grammar.SEDL4PeopleParser.RuntimeContext;
import es.us.isa.sedl.grammar.SEDL4PeopleParser.SettingsContext;
import es.us.isa.sedl.grammar.SEDL4PeopleParser.SizingSentenceContext;
import es.us.isa.sedl.grammar.SEDL4PeopleParser.StatisticFunctionContext;
import es.us.isa.sedl.grammar.SEDL4PeopleParser.StructValueContext;
import es.us.isa.sedl.marshaller.analysis.statistic.StatisticalAnalysisSpecParser;
import java.math.BigInteger;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;

public class SEDL4PeopleExtendedListener extends SEDL4PeopleBaseListener {

    private final static Logger log = Logger.getLogger(SEDL4PeopleExtendedListener.class);
    public static final int COMMENTS = 2;

    private static final String RANDOM = "Random";
    private static final String SEQUENTIAL = "Sequential";

    // Statistic
    private BasicExperiment experiment;
    private Context context;
    private Variables variables;
    private Design design;
    private Population population;
    private ExperimentalDesign experimentalDesign;
    SamplingMethod samplingMethod;
    List<IdContext> blockingVariables;
    ExperimentalProtocol protocol;
    Map<StatisticFunctionContext, Statistic> ctxStatistic;
    SEDL4PeopleErrorListener errorListener;
    CommonTokenStream tokens;

    public SEDL4PeopleExtendedListener(SEDL4PeopleErrorListener errorListener, CommonTokenStream comments) {
        this.errorListener = errorListener;
        this.tokens = comments;
    }

    // Repasar y añadir al Map en cada funcion
    private Map<Object, RuleNode> objectNodeMap = new IdentityHashMap<Object, RuleNode>();

    // ExtensionPoints:
    private Map<String, List<ExtensionPointElement>> extensionPointsInstantiations = new HashMap<String, List<ExtensionPointElement>>();

    // Parsers específicos por secciones:
    private StatisticalAnalysisSpecParser statAnalysisSpecParser = new StatisticalAnalysisSpecParser();

    // Document
    @Override
    public void enterDocument(@NotNull SEDL4PeopleParser.DocumentContext ctx) {
        log.info("Entering document");
        experiment = new BasicExperiment();
        context = new Context();
        population = new Population();
        setExperimentalDesign(new FullySpecifiedExperimentalDesign());
        experiment.setContext(context);
        setDesign(new Design());
        experiment.setDesign(getDesign());
        blockingVariables = new ArrayList<IdContext>();
        objectNodeMap.put(experiment, ctx);

    }

    @Override
    public void exitDocument(@NotNull SEDL4PeopleParser.DocumentContext ctx) {
        log.info("Exiting document");
    }

    // Experiment Preamble
    @Override
    public void enterExperimentPreamble(@NotNull SEDL4PeopleParser.ExperimentPreambleContext ctx) {
        try {
            //	
            if (tokens != null) {
                List<Token> tokensComments = getComments(0, ctx.getStart().getTokenIndex());
                for (Token t : tokensComments) {
                    experiment.getNotes().add(t.getText().replace("//", "").replace("/*","").replace("*/", ""));
                }
            }
            if (ctx.id() != null) {
                final String id = ctx.id().getText();
                experiment.setId(id);
                experiment.setName(id);
            }
            if (ctx.versionNumber() != null) {
                final String versionNumber = ctx.versionNumber().getText();
                experiment.setVersion(versionNumber);
            }
            if (ctx.repUrl() != null) {
                final String repUrl = ctx.repUrl().getText();
                experiment.setMetaid(repUrl);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private List<Token> getComments(int start, int end) {
        List<Token> result = new ArrayList<>();
        for (Token t : tokens.get(start, end)) {
            if (t.getChannel() == COMMENTS) {
                result.add(t);
            }
        }
        return result;
    }

    // Experiment Context
    @Override
    public void enterExperimentContext(@NotNull SEDL4PeopleParser.ExperimentContextContext ctx) {
        objectNodeMap.put(context, ctx);
        ctxStatistic = new HashMap<SEDL4PeopleParser.StatisticFunctionContext, Statistic>();
    }

    @Override
    public void enterNotes(@NotNull SEDL4PeopleParser.NotesContext ctx) {
        for (int i = 2; i < ctx.getChildCount(); i++) {
//			context.getNotes().add(ctx.getChild(i).getText());
            experiment.getNotes().add(ctx.getChild(i).getText());
        }
        objectNodeMap.put(context.getNotes(), ctx);
    }

    @Override
    public void enterAnnotations(@NotNull SEDL4PeopleParser.AnnotationsContext ctx) {
        for (int i = 2; i < ctx.getChildCount(); i++) {
//			context.getAnnotations().add(ctx.getChild(i).getText());
            experiment.getAnnotations().add(ctx.getChild(i).getText());
        }
        objectNodeMap.put(context.getAnnotations(), ctx);
    }

    @Override
    public void enterPopulation(@NotNull SEDL4PeopleParser.PopulationContext ctx) {
        String populationString = ctx.getChild(2).getText();
        population.setObjectivePopulation(populationString);
        experiment.getDesign().setPopulation(population);
        objectNodeMap.put(population, ctx);
    }

    @Override
    public void enterObject(@NotNull SEDL4PeopleParser.ObjectContext ctx) {
        final String individualDescription = ctx.getChild(2).getText();
        population.setIndividualDescription(individualDescription);
        // mapeo correcto?
        objectNodeMap.put(population.getIndividualDescription(), ctx);
    }

    // Constants
    // El constants block contiene las constantes, que son parámetros del design
    @Override
    public void enterConstantsBlock(@NotNull SEDL4PeopleParser.ConstantsBlockContext ctx) {
        for (FieldContext field : ctx.field()) {
            if (field.structValue() == null) {
                SimpleParameter parameter = new SimpleParameter();
                parameter.setName(field.id().getText());
                parameter.setValue(field.value().getText());
                getDesign().getDesignParameters().add(parameter);
            } else {
                ComplexParameter parameter = new ComplexParameter();
                parameter.setName(field.id().getText());

                StructValueContext structCtx = field.structValue();
                for (FieldContext f : structCtx.fields().field()) {
                    SimpleParameter param = new SimpleParameter();
                    param.setName(f.id().getText());
                    param.setValue(f.value().getText());
                    parameter.getParameters().add(param);
                }
                getDesign().getDesignParameters().add(parameter);
            }
        }

    }

    // Variables
    @Override
    public void enterVariablesBlock(@NotNull SEDL4PeopleParser.VariablesBlockContext ctx) {

        setVariables(new Variables());
        objectNodeMap.put(getVariables(), ctx);

    }

    @Override
    public void enterFactorDeclaration(@NotNull SEDL4PeopleParser.FactorDeclarationContext ctx) {

        Variables aux = getVariables();

        Variable variable = new ControllableFactor();

        if (ctx.getParent() instanceof FactorsContext) {

        }

        if (ctx.getParent() instanceof NcfactorsContext) {
            variable = new NonControllableFactor();
        }

        if (ctx.getParent() instanceof OutcomeDeclarationContext) {
            variable = new Outcome();
        }

        variable.setName(ctx.id().getText());
        variable.setKind(VariableKind.SCALAR);

        if (ctx.factorDeclarationUnits() != null) {
            String units = ctx.factorDeclarationUnits().id().getText();
            variable.setUnits(units);
        }

        if (ctx.factorDeclarationType() != null) {

            FactorDeclarationTypeContext typeContext = ctx.factorDeclarationType();

            if (typeContext.ORDERED() != null) {
                variable.setKind(VariableKind.ORDINAL);
            } else if (typeContext.ENUM() != null) {
                variable.setKind(VariableKind.NOMINAL);
            }

            //
            if (typeContext.numericSet() != null) { //INTENSION DOMAIN
                IntensionDomain domain = new IntensionDomain();
                FundamentalSetConstraint fsc = new FundamentalSetConstraint();
                String fundamentalSet = ctx.factorDeclarationType().numericSet().getText();
                fsc.setFundamentalSet(FundamentalSet.valueOf(fundamentalSet));
                domain.getConstraint().add(fsc);
                if (ctx.factorDeclarationRange() != null) {

                    FactorDeclarationRangeContext rangeContext = ctx.factorDeclarationRange();

                    IntervalConstraint ic = new IntervalConstraint();

                    if (rangeContext.getChild(2) != null) {
                        ic.setMax(rangeContext.getChild(4).getChild(0).toString());
                    } else {
                        ic.setMax("");
                    }

                    if (rangeContext.getChild(4) != null) {
                        ic.setMin(rangeContext.getChild(2).getChild(0).toString());
                    } else {
                        ic.setMin("");
                    }

                    domain.getConstraint().add(ic);
                }
                variable.setDomain(domain);
            } else if (ctx.factorDeclarationType().type() != null) {
                String type = ctx.factorDeclarationType().type().getText();
                IntensionDomain domain = new IntensionDomain();
                FundamentalSetConstraint fsc = new FundamentalSetConstraint();
                if (type.equalsIgnoreCase("integer")) {
                    fsc.setFundamentalSet(FundamentalSet.Z);
                } else if (type.equalsIgnoreCase("float")) {
                    fsc.setFundamentalSet(FundamentalSet.R);
                } else if (type.equalsIgnoreCase("bool") || type.equalsIgnoreCase("boolean")) {
                    fsc.setFundamentalSet(FundamentalSet.B);
                }
                domain.getConstraint().add(fsc);
                if (ctx.factorDeclarationRange() != null) {

                    FactorDeclarationRangeContext rangeContext = ctx.factorDeclarationRange();

                    IntervalConstraint ic = new IntervalConstraint();
                    ic.setMin(rangeContext.intervalLiteral(0).getText());
                    ic.setMax(rangeContext.intervalLiteral(1).getText());

                    if (rangeContext.MIN() != null) {
                        ic.setMin(rangeContext.intervalLiteral(0).getText());
                    } else if (rangeContext.MAX() != null) {
                        ic.setMin(rangeContext.intervalLiteral(0).getText());
                    }
                    domain.getConstraint().add(ic);
                }
                variable.setDomain(domain);
            } else { //EXTENSION DOMAIN
                ExtensionDomain domain = new ExtensionDomain();
                for (int i = 0; i < typeContext.enumDeclaration().getChildCount(); i++) {
                    EnumDeclarationContext enumCtx = (EnumDeclarationContext) typeContext.enumDeclaration();
                    if (!enumCtx.getChild(i).getText().equals(",")) {
                        Level l = createLevel(enumCtx.getChild(i).getText());
                        domain.getLevels().add(l);
                    }
                }
                variable.setDomain(domain);
            }

            aux.getVariable().add(variable);

        }
        setVariables(aux);
    }

//	@Override 
//	public void enterStatisticFunction(@NotNull SEDL4PeopleParser.StatisticFunctionContext ctx) { 
//		System.out.println("[+]\tStatistic Function: " + ctx.getText());
//		
//	}
    // Hypothesis
    
    @Override
    public void exitHypothesisDeclaration(SEDL4PeopleParser.HypothesisDeclarationContext ctx) { 
        if(ctx.id()!=null){
            if(!isUniqueHypothesisIdentifier(ctx.id().getText())){
                        
                    SEDL4PeopleError error = new SEDL4PeopleError(ctx.id().getStart().getLine() - 1,
                        ctx.id().getStart().getStartIndex(),
                        ctx.id().getStart().getStopIndex(),
                        es.us.isa.sedl.core.util.Error.ERROR_SEVERITY.ERROR,
                        "The hypthesis identifiers should be unique, " + ctx.id().getText() + " is repeated valid!"
                    );
                    if (errorListener != null) {
                        errorListener.getErrors().add(error);
                    }            
            }
            experiment.getHypotheses().get(experiment.getHypotheses().size()-1).setId(ctx.id().getText());
            
        }else{
            experiment.getHypotheses().get(experiment.getHypotheses().size()-1).setId(generateHypothesisId());
        }
    }
    public String generateHypothesisId(){
        int i=0;
        String result="";
        boolean isUnique=false;
        do{
            i++;
            result="H"+i;
        }while(!isUniqueHypothesisIdentifier(result));
        return result;
    }
    
    private boolean isUniqueHypothesisIdentifier(String id){
        boolean result=true;
        for(Hypothesis h:experiment.getHypotheses()){
                if(id.equals(h.getId())){
                    result=false;
                    break;
                }
            }
        return result;
    }
    
    
    @Override
    public void enterImplicitDifferentialHypothesis(SEDL4PeopleParser.ImplicitDifferentialHypothesisContext ctx) {
        DifferentialHypothesis dh = null;        
        Variables vars = experiment.getDesign().getVariables();
        if (vars == null) {
            vars = variables;
        }
        for (Variable outcome : vars.getVariablesByType(Outcome.class)) {
            dh = new DifferentialHypothesis();
            dh.setDependentVariable(outcome.getName());
            for (Variable factor : vars.getVariablesByType(ControllableFactor.class)) {
                dh.getIndependentVariables().add(factor.getName());
            }
            experiment.getHypotheses().add(dh);
        }
    }

    @Override
    public void enterExplicitDifferentialHypothesis(SEDL4PeopleParser.ExplicitDifferentialHypothesisContext ctx) {
        DifferentialHypothesis dh = null;
        dh = new DifferentialHypothesis();
        Variable var = findVariableById(ctx.outcome().id(), true, Outcome.class);
        if (var != null) {
            dh.setDependentVariable(var.getName());
            for (SEDL4PeopleParser.IdContext factorid : ctx.factorList().idList().id()) {
                var = findVariableById(factorid, true, Factor.class);
                if (var != null) {
                    dh.getIndependentVariables().add(var.getName());
                }
            }
            experiment.getHypotheses().add(dh);
        }
    }

    @Override
    public void enterFactorList(SEDL4PeopleParser.FactorListContext ctx) {
        for (SEDL4PeopleParser.IdContext id : ctx.idList().id()) {
            findVariableById(id, true, Factor.class);
        }
    }

    @Override
    public void enterOutcomeList(SEDL4PeopleParser.OutcomeListContext ctx) {
        for (SEDL4PeopleParser.IdContext id : ctx.idList().id()) {
            findVariableById(id, true, Outcome.class);
        }
    }

    @Override
    public void enterImplicitAssociationalHypothesis(SEDL4PeopleParser.ImplicitAssociationalHypothesisContext ctx) {
        AssociationalHypothesis ah = null;
        for (Variable outcome : experiment.getDesign().getVariables().getVariablesByType(Outcome.class)) {
            ah = new AssociationalHypothesis();
            ah.setDependentVariable(outcome.getName());
            for (Variable factor : experiment.getDesign().getVariables().getVariablesByType(ControllableFactor.class)) {
                ah.getIndependentVariables().add(factor.getName());
            }
            ah.setRelation(new LinearRelation());
            experiment.getHypotheses().add(ah);
        }
    }

    @Override
    public void enterExplicitAssociationalHypothesis(SEDL4PeopleParser.ExplicitAssociationalHypothesisContext ctx) {
        AssociationalHypothesis ah = new AssociationalHypothesis();
        String varName = null;
        ah.setDependentVariable(findVariableById(ctx.outcome().id().getText(), true, Outcome.class).getName());
        for (SEDL4PeopleParser.IdContext factorid : ctx.factorList().idList().id()) {
            ah.getIndependentVariables().add(findVariableById(factorid, true, Factor.class).getName());
        }
        if (ctx.LINEARLY() != null) {
            ah.setRelation(new LinearRelation());
        } else if (ctx.LOGISTICALLY() != null) {
            ah.setRelation(new LogisticRelation());
        } else {
            ah.setRelation(new MonotonicRelation());
        }
        experiment.getHypotheses().add(ah);
    }

    @Override
    public void enterOutcome(SEDL4PeopleParser.OutcomeContext ctx) {

    }

    @Override
    public void enterDescriptiveHypothesis(SEDL4PeopleParser.DescriptiveHypothesisContext ctx) {
        DescriptiveHypothesis h = new DescriptiveHypothesis();
        experiment.getHypotheses().add(h);
    }

    // Design
    @Override
    public void enterDesign(@NotNull SEDL4PeopleParser.DesignContext ctx) {

        getDesign().setPopulation(population);
        getDesign().setVariables(getVariables());
        objectNodeMap.put(getDesign(), ctx);

    }

    @Override
    public void enterDesignBlock(@NotNull SEDL4PeopleParser.DesignBlockContext ctx) {

//		DesignSamplingContext designSamplingContext = ctx.designSampling();
//		
//		SamplingMethod samplingMethod = new SamplingMethod();
//		
//		objectNodeMap.put(samplingMethod, ctx);
//		
//		samplingMethod.setDescription(designSamplingContext.samplingType().getText());
//		samplingMethod.setRandom(designSamplingContext.samplingType().getText().equals(RANDOM));
//		
//		design.setSamplingMethod(samplingMethod);
        //TODO...
    }

    @Override
    public void enterDesignSampling(@NotNull SEDL4PeopleParser.DesignSamplingContext ctx) {

        // duplicado, cambiar regla en gramatica
        if (ctx.designAssignment() != null) {
            System.out.println(">>>>> Parsing DesignAssignment: " + ctx.designAssignment().getText());
            FullySpecifiedExperimentalDesign expDesign = (FullySpecifiedExperimentalDesign) getExperimentalDesign();
            AssignmentMethod assignmentMethod = new AssignmentMethod();
            String assignValue = ctx.designAssignment().getChild(2).getText();
            assignmentMethod.setDescription(assignValue);
            assignmentMethod.setRandom(assignValue.equals(RANDOM));
            expDesign.setAssignmentMethod(assignmentMethod);

        }

        getDesign().setExperimentalDesign(getExperimentalDesign());
        FullySpecifiedExperimentalDesign expDesign = (FullySpecifiedExperimentalDesign) getExperimentalDesign();
        expDesign.setExperimentalProtocol(protocol);

        if (ctx.samplingType() != null && ctx.samplingType() != null) {
            samplingMethod = new SamplingMethod();
            String assignMethod = ctx.samplingType().getText();
            samplingMethod.setDescription(assignMethod);
            samplingMethod.setRandom(assignMethod.equals(RANDOM));
//		samplingMethod.setDescription(ctx.getText());
//		samplingMethod.setRandom(ctx.getText().equals(RANDOM));
            getDesign().setSamplingMethod(samplingMethod);
            objectNodeMap.put(samplingMethod, ctx);
        }

    }

    @Override
    public void enterDesignBlocking(@NotNull SEDL4PeopleParser.DesignBlockingContext ctx) {
        for (IdContext block : ctx.id()) {
            blockingVariables.add(block);
        }

        FullySpecifiedExperimentalDesign expDesign = (FullySpecifiedExperimentalDesign) getExperimentalDesign();
        for (IdContext blockingVariableCtx : blockingVariables) {
            Variable var = findVariableById(blockingVariableCtx, true, Factor.class);
            if (var != null) {
                expDesign.getBlockingVariables().add(var.getName());
            }
        }
        objectNodeMap.put(expDesign.getBlockingVariables(), ctx);
    }

    @Override
    public void enterDetailedDesign(@NotNull SEDL4PeopleParser.DetailedDesignContext ctx) {

        // duplicado, cambiar regla en gramatica
        if (ctx.designAssignment() != null) {
            log.debug(">>>>> Parsing DesignAssignment: " + ctx.designAssignment().getText());
            FullySpecifiedExperimentalDesign expDesign = (FullySpecifiedExperimentalDesign) getExperimentalDesign();
            AssignmentMethod assignmentMethod = new AssignmentMethod();
            String assignValue = ctx.designAssignment().getChild(2).getText();
            assignmentMethod.setDescription(assignValue);
            assignmentMethod.setRandom(assignValue.equals(RANDOM));
            expDesign.setAssignmentMethod(assignmentMethod);

        }

//		experimentalDesign = new FullySpecifiedExperimentalDesign();
//		if ( ctx.designAssignment() != null ) {
//			
//			FullySpecifiedExperimentalDesign expDesign = (FullySpecifiedExperimentalDesign) experimentalDesign;
//			AssignmentMethod assignmentMethod = new AssignmentMethod();
//			String assignValue = ctx.designAssignment().getChild(2).getText();
//			assignmentMethod.setDescription(assignValue);
//			expDesign.setAssignmentMethod(assignmentMethod);
//			expDesign.getBlockingVariables().addAll(blockingVariables);
//		}
//		design.setExperimentalDesign(experimentalDesign);
//		FullySpecifiedExperimentalDesign expDesign = (FullySpecifiedExperimentalDesign) experimentalDesign;
//		expDesign.setExperimentalProtocol(protocol);
    }

    @Override
    public void enterProtocol(@NotNull SEDL4PeopleParser.ProtocolContext ctx) {
        // ??
//		ExperimentalProtocol protocol = new ExperimentalProtocol();
        protocol = new ExperimentalProtocol();
        ExperimentalDesign expDesign = experiment.getDesign().getExperimentalDesign();
        if (expDesign instanceof FullySpecifiedExperimentalDesign) {
            FullySpecifiedExperimentalDesign ed = (FullySpecifiedExperimentalDesign) expDesign;
            ed.setExperimentalProtocol(protocol);
        }
        objectNodeMap.put(protocol, ctx);
        String schemeValue = ctx.getChild(2).getText();
        if (schemeValue.equals(RANDOM)) {
            protocol.setScheme(ProtocolScheme.RANDOM);
        } else if (schemeValue.equals(SEQUENTIAL)) {
            protocol.setScheme(ProtocolScheme.SEQUENTIAL);
        } else {
            protocol.setScheme(ProtocolScheme.SEQUENTIAL);
        }
        if (ctx.explicitProtocol() != null) {
            for (SEDL4PeopleParser.ProtocolStepContext stepCtx : ctx.explicitProtocol().protocolStep()) {
                protocol.getSteps().add(buildExperimentalProtocolStep(stepCtx));
            }
        }
    }

    private ExperimentalProtocolStep buildExperimentalProtocolStep(SEDL4PeopleParser.ProtocolStepContext stepCtx) {
        ExperimentalProtocolStep result = null;
        if (stepCtx.measurement() != null) {
            result = buildMeasurement(stepCtx.measurement());
        } else if (stepCtx.treatment() != null) {
            result = buildTreatment(stepCtx.treatment());
        } else {
            System.out.println("SEDL only support measurment or treatment steps.");
        }
        return result;
    }

    private ExperimentalProtocolStep buildTreatment(SEDL4PeopleParser.TreatmentContext treatmentCtx) {
        es.us.isa.sedl.core.design.Treatment treatment = new es.us.isa.sedl.core.design.Treatment();
        treatment.setId(treatmentCtx.id().toString());
        Group g = findGroupByName(treatmentCtx.functionalDeclaration().id(), true);
        treatment.setGroup(treatmentCtx.functionalDeclaration().id().getText());
        Variable v = null;
        VariableValuation vv;
        Level l;
        for (FieldContext fieldCtx : treatmentCtx.functionalDeclaration().fields().field()) {
            vv = new VariableValuation();
            v = findVariableById(fieldCtx.id(), true);
            l = createLevel(fieldCtx.value() != null ? fieldCtx.value().getText() : fieldCtx.structValue().getText());
            vv.setVariable(v);
            vv.setLevel(l);
            treatment.getVariableValuation().add(vv);
        }

        return treatment;
    }

    private ExperimentalProtocolStep buildMeasurement(SEDL4PeopleParser.MeasurementContext measurementCtx) {
        es.us.isa.sedl.core.design.Measurement measurement = new es.us.isa.sedl.core.design.Measurement();
        measurement.setId(measurementCtx.functionalDeclaration().id().getText());
        Group g = findGroupByName(measurementCtx.functionalDeclaration().id(), true);
        measurement.setGroup(measurementCtx.functionalDeclaration().id().getText());
        Variable v = null;
        VariableValuation vv;
        Level l;

        for (IdContext id : measurementCtx.id()) {
            measurement.getVariable().add(id.getText());
        }
        for (FieldContext fieldCtx : measurementCtx.functionalDeclaration().fields().field()) {
            vv = new VariableValuation();
            v = findVariableById(fieldCtx.id(), true);
            l = createLevel(fieldCtx.value() != null ? fieldCtx.value().getText() : fieldCtx.structValue().getText());
            if (!v.getDomain().contains(l)) {
                SEDL4PeopleError error = new SEDL4PeopleError(fieldCtx.value().getStart().getLine() - 1,
                        fieldCtx.value().getStart().getStartIndex(),
                        fieldCtx.value().getStart().getStopIndex(),
                        es.us.isa.sedl.core.util.Error.ERROR_SEVERITY.ERROR,
                        "The value " + fieldCtx.id().getText() + " is not a valid "
                        + "level of the variable " + v.getName());
                if (errorListener != null) {
                    errorListener.getErrors().add(error);
                }
            }
            vv.setVariable(v);
            vv.setLevel(l);
            measurement.getVariableValuation().add(vv);
        }
        return measurement;
    }

    @Override
    public void enterGroups(@NotNull SEDL4PeopleParser.GroupsContext ctx) {

        /* Hay que tener en cuenta muchas más cosas:
         * Si sólo un group tiene sizing, aplicar el sizing a todos los demás.
         * Si tiene una ID, hay que comprobar:
         * 		Si existe como variable, añadirla al Group
         * 		Si no existe como variable, es la ID del group
         *
        if (ctx. != null) {
            GroupsExpresionContext groupsExpCtx = ctx.groupsExpresion();
//			for ( IdContext id : groupsExpCtx.id() ) {
            for (int i = 0; i < groupsExpCtx.id().size(); i++) {
                IdContext id = groupsExpCtx.id().get(i);
                Group g = new Group();
                g.setName(id.getText());
                List<SizingSentenceContext> listSizing = groupsExpCtx.sizingSentence();

                if (listSizing.size() < groupsExpCtx.id().size()) {

                    Literal sizing = new Literal();
                    Integer size = new Integer(listSizing.get(0).getChild(1).getText());
                    sizing.setValue(BigInteger.valueOf(size));
                    g.setSizing(sizing);

                } else {
                    Literal sizing = new Literal();
                    Integer size = new Integer(listSizing.get(i).getChild(1).getText());
                    sizing.setValue(BigInteger.valueOf(size));
                    g.setSizing(sizing);
                }

                if (getExperimentalDesign() instanceof FullySpecifiedExperimentalDesign) {
                    FullySpecifiedExperimentalDesign expDesign = (FullySpecifiedExperimentalDesign) getExperimentalDesign();
                    expDesign.getGroups().add(g);
                    objectNodeMap.put(expDesign.getGroups(), ctx);
                }
            }
        }*/
    }

    @Override
    public void enterGroupsAsFunctionalDeclarations(SEDL4PeopleParser.GroupsAsFunctionalDeclarationsContext ctx) {
        if (getExperimentalDesign() instanceof FullySpecifiedExperimentalDesign) {
            List<SEDL4PeopleParser.FunctionalDeclarationContext> groupDeclarations = ctx.functionalDeclaration();
            List<SizingSentenceContext> sizingDeclarations = ctx.sizingSentence();
            List<Group> groups = new ArrayList<>();
            for (int i = 0; i < groupDeclarations.size(); i++) {
                groups.add(generateGroup(groupDeclarations.get(i), sizingDeclarations.get(i)));
            }
            FullySpecifiedExperimentalDesign expDesign = (FullySpecifiedExperimentalDesign) getExperimentalDesign();
            expDesign.getGroups().addAll(groups);

            objectNodeMap.put(expDesign.getGroups(), ctx);
        }
    }

    private Group generateGroup(SEDL4PeopleParser.FunctionalDeclarationContext groupDecl, SizingSentenceContext sizing) {
        Group g = new Group();
        Literal l = new Literal();
        l.setValue(BigInteger.valueOf(Long.valueOf(sizing.IntegerLiteral().getText())));
        g.setName(groupDecl.id().getText());
        g.setSizing(l);
        if (groupDecl.fields() != null) {
            for (FieldContext field : groupDecl.fields().field()) {
                Variable var = findVariableById(field.id(), true);
                if (field.structValue() != null) {
                    VariableValuation vv = new VariableValuation();
                    vv.setVariable(var);
                    vv.setLevel(createLevel(field.value().getText()));
                    g.getValuations().set(COMMENTS, vv);
                    //g.getComplexValuations().add(buildComplexParameter(field.id().getText(),field.structValue()));
                } else if (field.value() != null) {
                    VariableValuation vv = new VariableValuation();
                    vv.setVariable(var);
                    vv.setLevel(createLevel(field.value().getText()));
                    g.getValuations().set(COMMENTS, vv);
                }
            }
        }
        return g;
    }

    @Override
    public void enterGroupsByExpresion(SEDL4PeopleParser.GroupsByExpresionContext ctx) {
        List<Variable> vars = new ArrayList<>();
        Variable var = null;
        for (IdContext idCtx : ctx.id()) {
            var = findVariableById(idCtx, true);
            if (!var.getDomain().isFinite()) {
                SEDL4PeopleError error = new SEDL4PeopleError(idCtx.Identifier().getSymbol().getLine() - 1,
                        idCtx.Identifier().getSymbol().getStartIndex(),
                        idCtx.Identifier().getSymbol().getStopIndex(),
                        es.us.isa.sedl.core.util.Error.ERROR_SEVERITY.ERROR,
                        "The variable " + idCtx.getText() + " has an infinite domain, "
                        + "you cannot generate a finite set of groups from it.");
                if (errorListener != null) {
                    errorListener.getErrors().add(error);
                }
            }
            if (var instanceof Outcome) {
                SEDL4PeopleError error = new SEDL4PeopleError(idCtx.Identifier().getSymbol().getLine() - 1,
                        idCtx.Identifier().getSymbol().getStartIndex(),
                        idCtx.Identifier().getSymbol().getStopIndex(),
                        es.us.isa.sedl.core.util.Error.ERROR_SEVERITY.ERROR,
                        "The variable " + idCtx.getText() + " is an outcome of the experiment , "
                        + "you cannot generate the "
                        + " set of groups of the design from it.");
            }
            if (var instanceof Nuisance) {
                SEDL4PeopleError error = new SEDL4PeopleError(idCtx.Identifier().getSymbol().getLine() - 1,
                        idCtx.Identifier().getSymbol().getStartIndex(),
                        idCtx.Identifier().getSymbol().getStopIndex(),
                        es.us.isa.sedl.core.util.Error.ERROR_SEVERITY.ERROR,
                        "The variable " + idCtx.getText() + " is a nuisance of the experiment , "
                        + "you cannot generate the "
                        + " set of groups of the design from it.");
            }
        }
        int sizing = Integer.parseInt(ctx.sizingSentence().IntegerLiteral().toString());

        // We assume a complete factorial balanced design:
        Group group = new Group();
        group.setName("");
        Literal sizingObject = new Literal();
        sizingObject.setValue(BigInteger.valueOf((long) sizing));
        group.setSizing(sizingObject);
        VariableValuation vv = null;
        for (Variable myvar : vars) {
            vv = new VariableValuation();
            vv.setVariable(myvar);
            vv.setLevel(null);
            group.getValuations().add(vv);
        }
        FullySpecifiedExperimentalDesign expDesign = (FullySpecifiedExperimentalDesign) getExperimentalDesign();
        expDesign.getGroups().add(group);
    }

    public List<Group> generateGroups(List<Variable> vars, int sizing) {
        List<Group> result = new ArrayList<>();
        Variable var = vars.get(0);
        Group g = null;
        VariableValuation vv = null;
        Literal sizingObject = new Literal();
        sizingObject.setValue(BigInteger.valueOf((long) sizing));
        for (Level l : var.getDomain().getLevels()) {
            vv = new VariableValuation();
            vv.setVariable(var);
            vv.setLevel(l);
            g = new Group();
            g.setName(l.getValue());
            g.getValuations().add(vv);
            g.setSizing(sizingObject);
            result.add(g);
        }
        result = generateGroups(1, vars, result);
        return result;
    }

    public List<Group> generateGroups(int index, List<Variable> vars, List<Group> currentGroups) {
        List<Group> result = null;
        Group g = null;
        Variable var = null;
        VariableValuation vv = null;
        if (index >= vars.size()) {
            result = currentGroups;
        } else {
            result = new ArrayList<>();
            for (Group cg : currentGroups) {
                var = vars.get(index);
                for (Level l : var.getDomain().getLevels()) {
                    vv = new VariableValuation();
                    vv.setVariable(var);
                    vv.setLevel(l);
                    g = new Group();
                    g.setName(cg.getName() + "-" + l.getValue());
                    g.getValuations().add(vv);
                    g.setSizing(cg.getSizing());
                    result.add(g);
                }
            }
            result = generateGroups(index + 1, vars, result);
        }
        return result;
    }

    @Override
    public void enterAnalysesBlocks(@NotNull SEDL4PeopleParser.AnalysesBlocksContext ctx) {
        objectNodeMap.put(getExperimentalDesign().getIntendedAnalyses(), ctx);
    }

    @Override
    public void enterAnalysesBlock(@NotNull SEDL4PeopleParser.AnalysesBlockContext ctx) {

        AnalysisSpecificationGroup analysis = new AnalysisSpecificationGroup();
        analysis.setId(ctx.getChild(0).getChild(0).getText());
        if (!ctx.statisticFunction().isEmpty()) {
            for (StatisticFunctionContext statisticFunctionCtx : ctx.statisticFunction()) {
                if (statisticFunctionCtx != null) {
                    List<Statistic> s = statAnalysisSpecParser.parse(statisticFunctionCtx, this).getStatistic();
                    StatisticalAnalysisSpec spec = new StatisticalAnalysisSpec();
                    spec.getStatistic().addAll(s);
                    analysis.getAnalyses().add(spec);
                }
            }
        }
        getExperimentalDesign().getIntendedAnalyses().add(analysis);

    }

    protected void parseStatiticFunctionParamContext(SEDL4PeopleParser.StatisticFunctionParamContext paramCtx, StatisticFunctionContext statisticFunctionCtx, Statistic statistic) {
        /*
         DatasetSpecification dataset=new DatasetSpecification();
         if(paramCtx.statisticFunctionValue()!=null){
         if(statistic instanceof NHST)
         ((NHST)statistic).setAlpha(Double.parseDouble(paramCtx.statisticFunctionValue().getText()));
         }
         if(paramCtx.statisticFunctionParamVariable()!=null){
         for(IdContext id : paramCtx.statisticFunctionParamVariable().id()){
         dataset.getVariables().add(id.getText());
         System.out.println("[INFO] Add variable: "+id.getText());
         }
         }
         if(paramCtx.statisticFunctionFilter()!=null){
         SEDL4PeopleParser.StatisticFunctionFilterContext ctx=paramCtx.statisticFunctionFilter();
         if ( ctx.grouping() != null ) {
         GroupingProjection group = new GroupingProjection();
         GroupingContext groupCtx = ctx.grouping();
         for ( IdContext idCtx : groupCtx.id() ) {
         group.getProjectedVariables().add(findVariableById(idCtx,true).getName());					
         System.out.println("[INFO] Enter grouping: "+group.toString());
         dataset.getProjections().add(group);
         } 
         if ( ctx.projection() != null ) {
         Projection proj = new Projection();
         ProjectionContext projCtx = ctx.projection();
         for ( IdContext id: projCtx.id() ) {
         proj.getProjectedVariables().add(findVariableById(id,true).getName());
         }
         //			proj.getProjectedVariables().add(projCtx.getText());
         dataset.getProjections().add(proj);
         }
         if ( ctx.filter() != null ) {					
         FilterContext filterCtx = ctx.filter();
         ValuationFilter filter = new ValuationFilter();
         for ( IdContext idCtx: filterCtx.id() ) {
                                            
         var.setVariable(findVariableById(idCtx, true).getName());
         filter.getVariableValuation().add(var);
         }
         dataset.getFilters().add(filter);
         }                                            
         System.out.println("INFO -- DE -- : "+dataset.toString());
            
         }
         }
         */

    }

    protected DatasetSpecification generateDefaultDatasetSpecification(NHST nhst) {
        /*
         DatasetSpecification dataset = new DatasetSpecification();            
         Set<Set<VariableValuation>> levelCombinations=experiment.getDesign().getPossibleTreatments();
         ValuationFilter filter=null;
         for(Set<VariableValuation> levelCombination:levelCombinations)
         {
         filter=new ValuationFilter();
         filter.getVariableValuation().addAll(levelCombination);                
         dataset.getFilters().add(filter);
         }
         Projection projection=new Projection();            
         for(Outcome o:design.getOutcomes())
         projection.getProjectedVariables().add(o.getName());                        
         dataset.getProjections().add(projection);
         return dataset;
         */
        return null;
    }

    @Override
    public void enterStatisticFunctionFilter(@NotNull SEDL4PeopleParser.StatisticFunctionFilterContext ctx) {
        /* Si hay un Filter(...).Grouping(...).Filter(...)
         * Si despues de un filter no se añade un project, se asume que se proyecta sobre la variable de Outcome
		 
		
         StatisticFunctionContext statFunctCtx = (StatisticFunctionContext) ctx.getParent().getParent().getParent();
         Statistic stat = ctxStatistic.get(statFunctCtx);
         DatasetSpecification dataset = stat.getDatasetSpecification();
	
         if ( ctx.grouping() != null ) {
         GroupingProjection group = new GroupingProjection();
         GroupingContext groupCtx = ctx.grouping();
         for ( IdContext idCtx : groupCtx.id() ) {
         group.getProjectedVariables().add(findVariableById(idCtx,true).getName());
         }
         dataset.getProjections().add(group);
         } 
         if ( ctx.projection() != null ) {
         Projection proj = new Projection();
         ProjectionContext projCtx = ctx.projection();
         for ( IdContext id: projCtx.id() ) {
         proj.getProjectedVariables().add(findVariableById(id,true).getName());
         }
         //			proj.getProjectedVariables().add(projCtx.getText());
         dataset.getProjections().add(proj);
         }
         if ( ctx.filter() != null ) {
         ValuationFilter filter = new ValuationFilter();
         FilterContext filterCtx = ctx.filter();
         for ( IdContext idCtx: filterCtx.id() ) {
         VariableValuation var = new VariableValuation();
         var.setVariable(findVariableById(idCtx, true).getName());
         filter.getVariableValuation().add(var);
         }
         dataset.getFilters().add(filter);
         }
         */
    }

    @Override
    public void enterStatisticFunctionValue(@NotNull SEDL4PeopleParser.StatisticFunctionValueContext ctx) {
        /*
         StatisticFunctionContext statisticFunctionCtx = (StatisticFunctionContext) ctx.getParent().getParent().getParent();
         Statistic stat = ctxStatistic.get(statisticFunctionCtx);
         if ( stat instanceof NHST ) {
         NHST nhst = (NHST) stat;
         nhst.setAlpha(Double.valueOf( ctx.getChild(0).getText() ));
         }else if ( stat instanceof CorrelationCoeficient ) {
         CorrelationCoeficient corrCoef = (CorrelationCoeficient) stat;
         // TODO ...
         } else if ( stat instanceof ConfidenceInterval ) {
         ConfidenceInterval conf = (ConfidenceInterval) stat;
         conf.setConfidenceLevel(new Double(ctx.getChild(0).getText()));
         } else if ( stat instanceof VariabilityMeasure ) {
         VariabilityMeasure variab = (VariabilityMeasure) stat;
         // ?
         } else if ( stat instanceof CentralTendencyMeasure ) {
         CentralTendencyMeasure central = (CentralTendencyMeasure) stat;
         // ?
         } else if ( stat instanceof Ranking ) {
         Ranking ranking  = (Ranking) stat;			
         ranking.setRankingVariable(findVariableById((IdContext) ctx.getChild(0), true,Factor.class).getName());
         }
		
         // No hay que añadir los statistic a ningun sitio, ya ha sido añadido previamente
         */
    }

    public void enterStatisticFunctionParamVariable(es.us.isa.sedl.grammar.SEDL4PeopleParser.StatisticFunctionParamVariableContext ctx) {
        /*
         System.out.println("[INFO] (Parser.parseStatiticFunctionParamContext) Simple param on function parsing...");
         StatisticFunctionContext statisticFunctionCtx = (StatisticFunctionContext) ctx.getParent().getParent().getParent();
         Statistic stat = ctxStatistic.get(statisticFunctionCtx);
         if(stat instanceof CentralTendencyMeasure){
         CentralTendencyMeasure central = (CentralTendencyMeasure) stat;
         String[] arrayVar = ctx.getText().split(",");
         for(String var : arrayVar){
         central.getDatasetSpecification().getVariables().add(var);
         }
         }
         if(stat instanceof VariabilityMeasure){
         VariabilityMeasure variab = (VariabilityMeasure) stat;
         String[] arrayVar = ctx.getText().split(",");
         for(String var : arrayVar){
         variab.getDatasetSpecification().getVariables().add(var);
         }
         }
         System.out.println("[INFO] (Parser.parseStatiticFunctionParamContext) Simple param on function parsed");
         */
    }

    @Override
    public void enterSingleConf(@NotNull SEDL4PeopleParser.SingleConfContext ctx) {

        /* Se hace todo en este método en vez de en "enterOutputs", "enterSettings", etc
         * para no tener que ir guardando el estado de la configuración
         * en la que estamos  
         */
        Configuration conf = new Configuration();
        experiment.getConfigurations().add(conf);
        conf.setId(ctx.getParent().getChild(0).getText());
        
        ExperimentalOutputs outputs = new ExperimentalOutputs();
        conf.setExperimentalOutputs(outputs);
        // OUTPUTS 
        if (ctx.outputs() != null && ctx.outputs().files() != null) {
            
            OutputDataSource outSource = new OutputDataSource();
            outputs.getOutputDataSources().add(outSource);
            

            File outFile = new File();
            for (FilesContext fCtx : ctx.outputs().files()) {

                //			FilesContext fCtx = ctx.outputs().files();
                String name = fCtx.file().getChild(1).getText();
                outFile.setName(name.substring(1, name.length() - 1));
                outSource.setFile(outFile);

                if (fCtx.roles() != null) {
                    RolesContext rolesCtx = fCtx.roles();
                    String roleType = rolesCtx.getChild(2).getText();
                    if (roleType.equals(tokenNames[ADDITIONAL_EVIDENCE].replace("'", ""))) {
                        outSource.setRole(OutputDataSourceRole.ADDITIONAL_EVIDENCE);
                    }
                    if (roleType.equals(tokenNames[MISCELLANEOUS].replace("'", ""))) {
                        outSource.setRole(OutputDataSourceRole.MISCELLANEOUS);
                    }
                    if (roleType.equals(tokenNames[MAIN_RESULT].replace("'", ""))) {
                        outSource.setRole(OutputDataSourceRole.MAIN_RESULT);
                    } else {
                        System.out.println("Specified role does not exist : " + roleType + "(" + rolesCtx.getChild(2).getText() + ")");
                        outSource.setRole(OutputDataSourceRole.MISCELLANEOUS);
                    }
                }

                if (fCtx.format() != null) {
                    FileSpecification fileSpec = new FileSpecification();

                    //			FileFormatSpecification format = new 
                    //			outFile.setFileFormatSpecification(value);
                }

                if (fCtx.mapping() != null) {
                    // ???????
                }
            }

            //INPUTS
            ExperimentalInputs inputs = new ExperimentalInputs();

            File inputFile = new File();
            if (ctx.inputs() != null && ctx.inputs().files() != null) {
                for (FilesContext fCtx : ctx.inputs().files()) {
                    inputFile.setPath(fCtx.file().StringLiteral().getText());
                    inputFile.setName(fCtx.file().getChild(1).getText());
                    System.out.println("[INFO]path: " + fCtx.file().StringLiteral().getText() + " name: " + fCtx.file().getChild(1).getText());
                    InputDataSource inSource = new InputDataSource();
                    inputs.getInputDataSources().add(inSource);
                    inSource.setFile(inputFile);
                }
                conf.setExperimentalInputs(inputs);

            }

            // SETTINGS
            if (ctx.settings() != null) {
                SettingsContext settCtx = ctx.settings();

                ExperimentalSetting settings = new ExperimentalSetting();
                ComputationEnvironment env = new ComputationEnvironment();
                settings.setRequirements(env);
                SoftwarePlatform soft = new SoftwarePlatform();

                if (settCtx.runtimes() != null) {
                    for (RuntimeContext runtime : settCtx.runtimes().runtime()) {
                        Runtime r = new Runtime();
                        r.setName(runtime.id().getText());
                        r.setVersion(runtime.versionNumber().getText());
                        soft.getRuntimes().add(r);
                    }
                }
                if (settCtx.libraries() != null && settCtx.libraries().library() != null) {
                    for (LibraryContext lib : settCtx.libraries().library()) {
                        Library l = new Library();
                        l.setName(lib.id().getText());
                        l.setVersion(lib.versionNumber().getText());
                        soft.getLibraries().add(l);
                    }
                }
                env.setSoftwarePlatform(soft);
                conf.setExperimentalSetting(settings);
            }

        }

        // PROCEDURE
        if (ctx.experimentalProcedure() != null) {
            ExperimentalProcedureContext procCtx = ctx.experimentalProcedure();
            ExperimentalProcedure procedure = new ExperimentalProcedure();
            ExperimentalTask task = null;

            if (procCtx.unstructuredProcedureDefinition() != null) {
                List<SEDL4PeopleParser.ProcedureStepContext> procDefList = procCtx.unstructuredProcedureDefinition().procedureStep();
                for (SEDL4PeopleParser.ProcedureStepContext procDefCtx : procDefList) {
                    task = parseExperimentalExecutionTask(procDefCtx);
                    procedure.getTasks().add(task);
                }
            }
            conf.setExperimentalProcedure(procedure);

        }

        //EXECUTIONS
        if (ctx.execution() != null) {
            SEDL4PeopleParser.ExecutionContext ectx = ctx.execution();
            for (SEDL4PeopleParser.ExecutionBlockContext execBlockCtx : ectx.executionBlock()) {
                Execution exec = parse(execBlockCtx.executionConf());
                exec.setId(execBlockCtx.id().getText());
                if (exec != null) {
                    conf.getExecutions().add(exec);
                }
            }

        }

    }

    private Execution parse(SEDL4PeopleParser.ExecutionConfContext ctx) {
        Execution result = new Execution();
        if (ctx.execStart() != null && ctx.execStart().StringLiteral()!=null) {
            String value=ctx.execStart().StringLiteral().toString().replace("'","").replace("\"","");
            try
            {
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
                result.setStart(df.parse(value));
            }catch(Exception e){
                System.out.println("Unable to parse date from string '"+value+"'");
            }
        }
        if (ctx.execEnd() != null && ctx.execEnd().StringLiteral()!=null) {
            String value=ctx.execEnd().StringLiteral().toString().replace("'","").replace("\"","");
            try
            {
                DateFormat df = new SimpleDateFormat("EEE MMM dd kk:mm:ss z yyyy", Locale.ENGLISH);
                result.setFinish(df.parse(value));
            }catch(Exception e){
                System.out.println("Unable to parse date from string '"+value+"'");
            }
        }
        ResultsFile rf = null;
        File f = null;
        if (ctx.resultExecution() != null) {
            for (SEDL4PeopleParser.FileExecContext fectx : ctx.resultExecution().fileExec()) {
                rf = new ResultsFile();
                f = new File();
                if (fectx.StringLiteral().getText().startsWith("'") || fectx.StringLiteral().getText().startsWith("\"")) {
                    f.setName(fectx.StringLiteral().getText().substring(1, fectx.StringLiteral().getText().length() - 1));
                }
                rf.setFile(f);
                result.getResults().add(rf);
            }
        }
        return result;
    }

    @Override
    public void exitExtensionPoint(SEDL4PeopleParser.ExtensionPointContext ctx) {
        String extensionPointName = ctx.parent.getRuleContext().getClass().getSimpleName().replace("Context", "");
        String moduleIdentifier = ctx.Identifier().getText();
        String content = ctx.EXTENSION_POINT_CONTENT().getText();
        if (content.startsWith("::")) {
            content = content.substring(2);
        }
        ExtensionPointElement epElement = new ExtensionPointElement(extensionPointName, moduleIdentifier, content, ctx);
        List<ExtensionPointElement> list = extensionPointsInstantiations.get(extensionPointName);
        if (list == null) {
            list = new ArrayList<ExtensionPointElement>();
            extensionPointsInstantiations.put(extensionPointName, list);
        }
        list.add(epElement);

    }

    private void modifyObjectMap(Object o, RuleNode ctx) {
        if (objectNodeMap.containsKey(o)) {

        } else {

        }
    }

    // Getter
    public Map<Object, RuleNode> getObjectNodeMap() {
        return objectNodeMap;
    }

    public Experiment getExperimentModel() {
        return experiment;
    }

    /**
     * @return the extensionPointsInstantiations
     */
    public Map<String, List<ExtensionPointElement>> getExtensionPointsInstantiations() {
        return extensionPointsInstantiations;
    }

    private VariabilityMeasure parseVariabilityMeasure(StatisticFunctionContext statisticFunctionCtx) {
        VariabilityMeasure varMeasure = null;
        DatasetSpecification dataset = new DatasetSpecification();
        SEDL4PeopleParser.VariabilityMeasureSFContext VMSFCtx = statisticFunctionCtx.variabilityMeasureSF();
        if (VMSFCtx.vmFunction().IQR() != null) {
            varMeasure = new InterquartileRange();
        } else if (VMSFCtx.vmFunction().RANGE() != null) {
            varMeasure = new Range();
        } else if (VMSFCtx.vmFunction().STDDEV() != null) {
            varMeasure = new StandardDeviation();
        }
        ctxStatistic.put(statisticFunctionCtx, varMeasure);
        varMeasure.setDatasetSpecification(dataset);
        return varMeasure;
    }

    private CentralTendencyMeasure parseCentralTendencyMeasure(StatisticFunctionContext statisticFunctionCtx) {
        CentralTendencyMeasure centralTendency = null;
        SEDL4PeopleParser.CentralTendencyMeasurementSFContext CTMCtx = statisticFunctionCtx.centralTendencyMeasurementSF();
        if (CTMCtx.ctmFunction().MEAN() != null) {
            centralTendency = new Mean();
        } else if (CTMCtx.ctmFunction().MEDIAN() != null) {
            centralTendency = new Median();
        } else if (CTMCtx.ctmFunction().MODE() != null) {
            centralTendency = new Mode();
        }
        DatasetSpecification dataset = new DatasetSpecification();
        centralTendency.setDatasetSpecification(dataset);
        ctxStatistic.put(statisticFunctionCtx, centralTendency);
        return centralTendency;
    }

    private ExperimentalTask parseExperimentalExecutionTask(SEDL4PeopleParser.ProcedureStepContext procStepCtx) {
        CommandExperimentalTask commandExpTask = new CommandExperimentalTask();
        ExperimentalTaskType taskType = null;
        if (procStepCtx.procDef().procedureStepType().measurementStep() != null) {
            taskType = new Measurement();
        } else if (procStepCtx.procDef().procedureStepType().treatmentStep() != null) {
            taskType = new Treatment();
        } else if (procStepCtx.procDef().procedureStepType().preprocessingStep() != null) {
            taskType = new Preprocessing();
        } else if (procStepCtx.procDef().procedureStepType().postprocestingStep() != null) {
            taskType = new Postprocessing();
        }
        commandExpTask.setExperimentalTaskType(taskType.getClass().getSimpleName());
        String name = procStepCtx.procBody().getText();
        commandExpTask.setName(name.substring(1, name.length() - 1));

        if (procStepCtx.procDef().id() != null && !procStepCtx.procDef().id().isEmpty()) {
            List<IdContext> ids = procStepCtx.procDef().id();
            for (IdContext id : ids) {
                commandExpTask.getParameters().add(id.getText());
            }
        }

        return commandExpTask;
    }

    public Variable findVariableById(IdContext idCtx, boolean generateErrorIfNotFound) {
        return findVariableById(idCtx, generateErrorIfNotFound, Variable.class);
    }

    public Variable findVariableById(IdContext idCtx, boolean generateErrorIfNotFound, Class<? extends Variable> variableType) {

        String variableName = idCtx.getText();
        Variable result = findVariableById(variableName, generateErrorIfNotFound, variableType);
        if (result == null && generateErrorIfNotFound) {
            Interval interval = idCtx.Identifier().getSourceInterval();
            SEDL4PeopleError error = new SEDL4PeopleError(idCtx.Identifier().getSymbol().getLine() - 1,
                    idCtx.Identifier().getSymbol().getStartIndex(),
                    idCtx.Identifier().getSymbol().getStopIndex(),
                    es.us.isa.sedl.core.util.Error.ERROR_SEVERITY.ERROR,
                    "The identifier '" + idCtx.getText() + "' is not the name of a " + variableType.getSimpleName());
            if (errorListener != null) {
                errorListener.getErrors().add(error);
            }

        }
        return result;
    }

    public Variable findVariableById(String variableId, boolean b, Class<? extends Variable> variableType) {
        Variable result = null;
        for (Variable v : getVariables().getVariable()) {
            if (v.getName().equals(variableId)) {
                result = v;
            }
        }
        return result;
    }

    /**
     * @return the variables
     */
    public Variables getVariables() {
        return variables;
    }

    /**
     * @param variables the variables to set
     */
    public void setVariables(Variables variables) {
        this.variables = variables;
    }

    /**
     * @return the design
     */
    public Design getDesign() {
        return design;
    }

    /**
     * @param design the design to set
     */
    public void setDesign(Design design) {
        this.design = design;
    }

    /**
     * @return the experimentalDesign
     */
    public ExperimentalDesign getExperimentalDesign() {
        return experimentalDesign;
    }

    /**
     * @param experimentalDesign the experimentalDesign to set
     */
    public void setExperimentalDesign(ExperimentalDesign experimentalDesign) {
        this.experimentalDesign = experimentalDesign;
    }

    private Group findGroupByName(IdContext idCtx, boolean b) {
        Group result = null;
        if (experimentalDesign instanceof FullySpecifiedExperimentalDesign) {
            FullySpecifiedExperimentalDesign fed = (FullySpecifiedExperimentalDesign) experimentalDesign;
            for (Group g : fed.getGroups()) {
                if (g.getName().equals(idCtx.getText())) {
                    result = g;
                }
            }
        }
        if (result == null) {
            SEDL4PeopleError error = new SEDL4PeopleError(idCtx.Identifier().getSymbol().getLine() - 1,
                    idCtx.Identifier().getSymbol().getStartIndex(),
                    idCtx.Identifier().getSymbol().getStopIndex(),
                    es.us.isa.sedl.core.util.Error.ERROR_SEVERITY.ERROR,
                    "The group " + idCtx.getText() + " is does not exist.");
            if (errorListener != null) {
                errorListener.getErrors().add(error);
            }
        }
        return result;
    }

    public Level createLevel(String value) {
        Level l = new Level();
        if (value.startsWith("\"") || value.startsWith("'")) {
            l.setValue(value.substring(1, value.length() - 1));
        } else {
            l.setValue(value);
        }
        return l;
    }

}
