// Generated from c:\workspace\projects\EXEMPLAR\sedl\modules\SEDL4People\src\main\antlr4\es\u005Cus\isa\sedl\grammar\SEDL4People.g4 by ANTLR 4.8

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SEDL4PeopleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EXTENSION_POINT_CONTENT=1, IMPORT=2, EXPERIMENT=3, TYPE=4, VERSION=5, 
		REP=6, NOTES=7, ANNOTATIONS=8, CLASSIFIED_AS=9, KEYWORDS=10, SUBJECTS=11, 
		OBJECT=12, POPULATION=13, RESPONSIBLE=14, COLLABORATOR=15, CONSTANTS=16, 
		VARIABLES=17, FACTORS=18, NCFACTORS=19, OUTCOME=20, EXTRANEOUS=21, MEASURED=22, 
		ORDERED=23, ENUM=24, INTEGER=25, FLOAT=26, BOOL=27, RANGE_MIN_MAX=28, 
		HYPOTHESIS=29, DIFFERENTIAL=30, ASSOCIATIONAL=31, DESCRIPTIVE=32, DESIGN=33, 
		SAMPLING=34, ASSIGNMENT=35, DETAILED_DESIGN=36, BLOCKING=37, SIZING=38, 
		GROUPS=39, PROTOCOL=40, ANALYSES=41, OF=42, WHERE=43, FILTER=44, GROUPING=45, 
		PROJ=46, LINEAR=47, CUADRATIC=48, RANDOM=49, ADHOC=50, CONFIGURATION=51, 
		LOG=52, OUTPUTS=53, INPUTS=54, SETTING=55, PROCEDURE=56, RUNTIMES=57, 
		LIBRARIES=58, OPERATING_SYSTEM=59, COMMAND=60, TREATMENT=61, MEASUREMENT=62, 
		FILE=63, ROLE=64, FORMAT=65, MAPPING=66, RUNS=67, RESULT=68, PVALUE=69, 
		DESCRIPTION=70, STHRESHOLD=71, FREEDOM_DEGREES=72, VS=73, PLUS=74, SIGNMIN=75, 
		RRES=76, START=77, END=78, N=79, Z=80, Q=81, R=82, I=83, C=84, MAX=85, 
		MIN=86, MEAN=87, MODE=88, MEDIAN=89, STDDEV=90, VARIANCE=91, IQR=92, RANGE=93, 
		RANKING=94, CONFIDENCE_INTERVAL=95, PEARSON=96, BIVARIATE_REGRESSION=97, 
		SPEARMAN=98, KENDALL=99, CRAMER=100, LOG_LINEAR=101, KOLMOGOROV_SMIRNOV=102, 
		LILLIEFORS=103, SHAPIRO_WILK=104, LEVENE=105, T_STUDENT=106, WILCOXON=107, 
		MCNEMAR=108, ANOVA=109, FACTANOVAWRS=110, FRIEDMAN=111, ALIGNED_FRIEDMAN=112, 
		IMAN_DAVEPORT=113, QUADE=114, COCHRAN_Q=115, BONFERRONI_DUNN=116, HOLMS=117, 
		HOCHBERG=118, HOMMEL=119, HOLLAND=120, ROM=121, FINNER=122, LI=123, SHAFFER=124, 
		NAMENYI=125, TTEST=126, SIGN_TEST=127, CHI_SQUARE=128, KRUSKAL=129, FISHER=130, 
		TUKEY=131, PREPROCESSING=132, PRETREATMENT=133, EXECUTION=134, POSTPROCESSING=135, 
		MAIN_RESULT=136, ADDITIONAL_EVIDENCE=137, MISCELLANEOUS=138, OPEN_PAR=139, 
		CLOSE_PAR=140, OPEN_BRA=141, CLOSE_BRA=142, OPEN_SQU_BRA=143, CLOSE_SQU_BRA=144, 
		DOT=145, FROM=146, AS=147, IS=148, IN=149, ON=150, AND=151, IMPACTS=152, 
		SIGNIFICANTLY=153, BY=154, LINEARLY=155, LOGISTICALLY=156, CORRELATED=157, 
		WITH=158, BAR=159, EQUAL=160, Identifier=161, BooleanLiteral=162, IntegerLiteral=163, 
		ExplicitVersionNumber=164, FloatingPointLiteral=165, CharacterLiteral=166, 
		StringLiteral=167, Url=168, Email=169, COMMA=170, COLON=171, DOUBLECOLON=172, 
		COMMENT=173, LINE_COMMENT=174, WS=175;
	public static final int
		RULE_document = 0, RULE_moduleImports = 1, RULE_moduleImport = 2, RULE_experimentPreamble = 3, 
		RULE_experimentType = 4, RULE_experimentContext = 5, RULE_notes = 6, RULE_annotations = 7, 
		RULE_classification = 8, RULE_classification_entry = 9, RULE_keywords = 10, 
		RULE_subjects = 11, RULE_stakeholder = 12, RULE_stakeholderFrom = 13, 
		RULE_role = 14, RULE_object = 15, RULE_population = 16, RULE_constants = 17, 
		RULE_constantsBlock = 18, RULE_constantDeclaration = 19, RULE_variables = 20, 
		RULE_variablesBlock = 21, RULE_factors = 22, RULE_ncfactors = 23, RULE_outcomes = 24, 
		RULE_outcomeDeclaration = 25, RULE_extraneous = 26, RULE_extraneousDeclaration = 27, 
		RULE_factorDeclaration = 28, RULE_factorDeclarationUnits = 29, RULE_factorDeclarationType = 30, 
		RULE_enumDeclaration = 31, RULE_functionalDeclaration = 32, RULE_factorDeclarationRange = 33, 
		RULE_intervalLiteral = 34, RULE_hypothesis = 35, RULE_hypothesisDeclaration = 36, 
		RULE_differentialHypothesis = 37, RULE_explicitDifferentialHypothesis = 38, 
		RULE_factorList = 39, RULE_outcomeList = 40, RULE_idList = 41, RULE_implicitDifferentialHypothesis = 42, 
		RULE_associationalHypothesis = 43, RULE_implicitAssociationalHypothesis = 44, 
		RULE_explicitAssociationalHypothesis = 45, RULE_outcome = 46, RULE_descriptiveHypothesis = 47, 
		RULE_design = 48, RULE_designBlock = 49, RULE_customDesignBlock = 50, 
		RULE_designSampling = 51, RULE_samplingType = 52, RULE_designAssignment = 53, 
		RULE_designBlocking = 54, RULE_detailedDesign = 55, RULE_groups = 56, 
		RULE_groupsExpresion = 57, RULE_groupsByExpresion = 58, RULE_groupsAsFunctionalDeclarations = 59, 
		RULE_sizingSentence = 60, RULE_protocol = 61, RULE_explicitProtocol = 62, 
		RULE_protocolStep = 63, RULE_measurement = 64, RULE_treatment = 65, RULE_analyses = 66, 
		RULE_analysesBlocks = 67, RULE_analysesBlock = 68, RULE_statisticFunction = 69, 
		RULE_rankingSF = 70, RULE_rFunction = 71, RULE_centralTendencyMeasurementSF = 72, 
		RULE_ctmFunction = 73, RULE_variabilityMeasureSF = 74, RULE_vmFunction = 75, 
		RULE_confidenceIntervalSF = 76, RULE_ciFunction = 77, RULE_correlationCoeficientSF = 78, 
		RULE_ccFunction = 79, RULE_nhstSF = 80, RULE_nhstFunction = 81, RULE_statisticFunctionParam = 82, 
		RULE_statisticFunctionParamVariable = 83, RULE_assignment = 84, RULE_statisticFunctionValue = 85, 
		RULE_statisticFunctionFilter = 86, RULE_oldStatisticFunctionFilter = 87, 
		RULE_newStatisticFunctionFilter = 88, RULE_ofDSSpec = 89, RULE_whereDSSpec = 90, 
		RULE_byDSSpec = 91, RULE_filter = 92, RULE_grouping = 93, RULE_projection = 94, 
		RULE_configuration = 95, RULE_configurationBlock = 96, RULE_singleConf = 97, 
		RULE_inputs = 98, RULE_outputs = 99, RULE_files = 100, RULE_file = 101, 
		RULE_roles = 102, RULE_format = 103, RULE_mapping = 104, RULE_settings = 105, 
		RULE_runtimes = 106, RULE_runtime = 107, RULE_libraries = 108, RULE_library = 109, 
		RULE_experimentalProcedure = 110, RULE_unstructuredProcedureDefinition = 111, 
		RULE_procedureStep = 112, RULE_procDef = 113, RULE_procedureStepType = 114, 
		RULE_treatmentStep = 115, RULE_measurementStep = 116, RULE_postprocestingStep = 117, 
		RULE_extensionPointStep = 118, RULE_preprocessingStep = 119, RULE_procBody = 120, 
		RULE_structuredProcedureDefinition = 121, RULE_preProcessingDefinition = 122, 
		RULE_pretreatmentClause = 123, RULE_executionProcedureDefinition = 124, 
		RULE_postProcessing = 125, RULE_execution = 126, RULE_executionBlock = 127, 
		RULE_executionConf = 128, RULE_execStart = 129, RULE_execEnd = 130, RULE_log = 131, 
		RULE_resultExecution = 132, RULE_analysesExecution = 133, RULE_analysesExecBlock = 134, 
		RULE_analFunctions = 135, RULE_exeFunction = 136, RULE_values = 137, RULE_exeFunctionTypes = 138, 
		RULE_exeDescription = 139, RULE_exeArguments = 140, RULE_otherParam = 141, 
		RULE_arg = 142, RULE_exeValuation = 143, RULE_fileExec = 144, RULE_freedom_degrees = 145, 
		RULE_fdParam = 146, RULE_bodyTempDiff = 147, RULE_pairIV = 148, RULE_pair = 149, 
		RULE_friedmanFunction = 150, RULE_pearsonFunction = 151, RULE_regresionBlock = 152, 
		RULE_regresion = 153, RULE_id = 154, RULE_email = 155, RULE_versionNumber = 156, 
		RULE_url = 157, RULE_repUrl = 158, RULE_value = 159, RULE_type = 160, 
		RULE_structValue = 161, RULE_fields = 162, RULE_field = 163, RULE_numericSet = 164, 
		RULE_extensionPoint = 165;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "moduleImports", "moduleImport", "experimentPreamble", "experimentType", 
			"experimentContext", "notes", "annotations", "classification", "classification_entry", 
			"keywords", "subjects", "stakeholder", "stakeholderFrom", "role", "object", 
			"population", "constants", "constantsBlock", "constantDeclaration", "variables", 
			"variablesBlock", "factors", "ncfactors", "outcomes", "outcomeDeclaration", 
			"extraneous", "extraneousDeclaration", "factorDeclaration", "factorDeclarationUnits", 
			"factorDeclarationType", "enumDeclaration", "functionalDeclaration", 
			"factorDeclarationRange", "intervalLiteral", "hypothesis", "hypothesisDeclaration", 
			"differentialHypothesis", "explicitDifferentialHypothesis", "factorList", 
			"outcomeList", "idList", "implicitDifferentialHypothesis", "associationalHypothesis", 
			"implicitAssociationalHypothesis", "explicitAssociationalHypothesis", 
			"outcome", "descriptiveHypothesis", "design", "designBlock", "customDesignBlock", 
			"designSampling", "samplingType", "designAssignment", "designBlocking", 
			"detailedDesign", "groups", "groupsExpresion", "groupsByExpresion", "groupsAsFunctionalDeclarations", 
			"sizingSentence", "protocol", "explicitProtocol", "protocolStep", "measurement", 
			"treatment", "analyses", "analysesBlocks", "analysesBlock", "statisticFunction", 
			"rankingSF", "rFunction", "centralTendencyMeasurementSF", "ctmFunction", 
			"variabilityMeasureSF", "vmFunction", "confidenceIntervalSF", "ciFunction", 
			"correlationCoeficientSF", "ccFunction", "nhstSF", "nhstFunction", "statisticFunctionParam", 
			"statisticFunctionParamVariable", "assignment", "statisticFunctionValue", 
			"statisticFunctionFilter", "oldStatisticFunctionFilter", "newStatisticFunctionFilter", 
			"ofDSSpec", "whereDSSpec", "byDSSpec", "filter", "grouping", "projection", 
			"configuration", "configurationBlock", "singleConf", "inputs", "outputs", 
			"files", "file", "roles", "format", "mapping", "settings", "runtimes", 
			"runtime", "libraries", "library", "experimentalProcedure", "unstructuredProcedureDefinition", 
			"procedureStep", "procDef", "procedureStepType", "treatmentStep", "measurementStep", 
			"postprocestingStep", "extensionPointStep", "preprocessingStep", "procBody", 
			"structuredProcedureDefinition", "preProcessingDefinition", "pretreatmentClause", 
			"executionProcedureDefinition", "postProcessing", "execution", "executionBlock", 
			"executionConf", "execStart", "execEnd", "log", "resultExecution", "analysesExecution", 
			"analysesExecBlock", "analFunctions", "exeFunction", "values", "exeFunctionTypes", 
			"exeDescription", "exeArguments", "otherParam", "arg", "exeValuation", 
			"fileExec", "freedom_degrees", "fdParam", "bodyTempDiff", "pairIV", "pair", 
			"friedmanFunction", "pearsonFunction", "regresionBlock", "regresion", 
			"id", "email", "versionNumber", "url", "repUrl", "value", "type", "structValue", 
			"fields", "field", "numericSet", "extensionPoint"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'import'", "'EXPERIMENT'", "'type'", "'version'", "'rep'", 
			"'Notes'", "'Annotations'", "'Cathegories'", "'Keywords'", "'Subjects'", 
			"'Object'", "'Population'", "'Responsible'", "'Collaborator'", "'Constants'", 
			"'Variables'", "'Factors'", "'NCFactors'", "'Outcome'", "'Extraneous'", 
			"'measured'", "'ordered'", "'enum'", "'integer'", "'float'", "'boolean'", 
			"'range'", "'Hypothesis'", "'Differential'", "'Associational'", "'Descriptive'", 
			"'Design'", "'Sampling'", "'Assignment'", "'Detailed_Design'", "'Blocking'", 
			"'sizing'", "'Groups'", "'Protocol'", "'Analyses'", "'of'", "'where'", 
			"'Filter'", "'Grouping'", "'Proj'", "'linear'", "'cuadratic'", "'Random'", 
			"'Adhoc'", "'Configuration'", "'Log'", "'Outputs'", "'Inputs'", "'Setting'", 
			"'Procedure'", "'Runtimes'", "'Libraries'", "'OperatingSystem'", "'Command'", 
			"'Treatment'", "'Measurement'", "'File'", "'role'", "'format'", "'mapping'", 
			"'Runs'", "'Result'", "'Pvalue'", "'description'", "'Sthreshold'", "'freedom_degrees'", 
			"'vs'", "'+'", "'-'", "'r'", "'Start'", "'End'", "'N'", "'Z'", "'Q'", 
			"'R'", "'I'", "'C'", "'max'", "'min'", "'Avg'", "'Mode'", "'Median'", 
			"'StdDev'", "'Variance'", "'IQR'", "'Range'", "'Ranking'", "'CI'", "'Pearson'", 
			"'BivariateRegression'", "'Spearman'", "'Kendall'", "'CRAMER'", "'LogLinear'", 
			"'Kolmogorov-Smirnov'", "'Lilliefors'", "'Shapiro-Wilk'", "'Levene'", 
			"'T-student'", "'Wilcoxon'", "'McNemar'", "'ANOVA'", "'FactANOVAwRS'", 
			"'Friedman'", "'Aligned Friedman'", "'Iman & Davenport'", "'Quade'", 
			"'Cochran Q'", "'Bonferroni-Dunn'", "'Holms'", "'Hochberg'", "'Hommel'", 
			"'Holland'", "'Rom'", "'Finner'", "'Li'", "'Shaffer'", "'Nemenyi'", "'TTest'", 
			"'SignTest'", "'Chi Square'", "'KruskalWalls'", "'Fisher'", "'Tukey'", 
			"'Preprocessing'", "'Pretreatment'", "'Execution'", "'Postprocessing'", 
			"'MainResult'", "'AdditionalEvidence'", "'Miscellaneous'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "'.'", "'from'", "'as'", "'is'", "'in'", 
			"'on'", "'and'", "'impacts'", "'significantly'", "'by'", "'linearly'", 
			"'logistically'", "'correlated'", "'with'", "'|'", "'='", null, null, 
			null, null, null, null, null, null, null, "','", "':'", "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EXTENSION_POINT_CONTENT", "IMPORT", "EXPERIMENT", "TYPE", "VERSION", 
			"REP", "NOTES", "ANNOTATIONS", "CLASSIFIED_AS", "KEYWORDS", "SUBJECTS", 
			"OBJECT", "POPULATION", "RESPONSIBLE", "COLLABORATOR", "CONSTANTS", "VARIABLES", 
			"FACTORS", "NCFACTORS", "OUTCOME", "EXTRANEOUS", "MEASURED", "ORDERED", 
			"ENUM", "INTEGER", "FLOAT", "BOOL", "RANGE_MIN_MAX", "HYPOTHESIS", "DIFFERENTIAL", 
			"ASSOCIATIONAL", "DESCRIPTIVE", "DESIGN", "SAMPLING", "ASSIGNMENT", "DETAILED_DESIGN", 
			"BLOCKING", "SIZING", "GROUPS", "PROTOCOL", "ANALYSES", "OF", "WHERE", 
			"FILTER", "GROUPING", "PROJ", "LINEAR", "CUADRATIC", "RANDOM", "ADHOC", 
			"CONFIGURATION", "LOG", "OUTPUTS", "INPUTS", "SETTING", "PROCEDURE", 
			"RUNTIMES", "LIBRARIES", "OPERATING_SYSTEM", "COMMAND", "TREATMENT", 
			"MEASUREMENT", "FILE", "ROLE", "FORMAT", "MAPPING", "RUNS", "RESULT", 
			"PVALUE", "DESCRIPTION", "STHRESHOLD", "FREEDOM_DEGREES", "VS", "PLUS", 
			"SIGNMIN", "RRES", "START", "END", "N", "Z", "Q", "R", "I", "C", "MAX", 
			"MIN", "MEAN", "MODE", "MEDIAN", "STDDEV", "VARIANCE", "IQR", "RANGE", 
			"RANKING", "CONFIDENCE_INTERVAL", "PEARSON", "BIVARIATE_REGRESSION", 
			"SPEARMAN", "KENDALL", "CRAMER", "LOG_LINEAR", "KOLMOGOROV_SMIRNOV", 
			"LILLIEFORS", "SHAPIRO_WILK", "LEVENE", "T_STUDENT", "WILCOXON", "MCNEMAR", 
			"ANOVA", "FACTANOVAWRS", "FRIEDMAN", "ALIGNED_FRIEDMAN", "IMAN_DAVEPORT", 
			"QUADE", "COCHRAN_Q", "BONFERRONI_DUNN", "HOLMS", "HOCHBERG", "HOMMEL", 
			"HOLLAND", "ROM", "FINNER", "LI", "SHAFFER", "NAMENYI", "TTEST", "SIGN_TEST", 
			"CHI_SQUARE", "KRUSKAL", "FISHER", "TUKEY", "PREPROCESSING", "PRETREATMENT", 
			"EXECUTION", "POSTPROCESSING", "MAIN_RESULT", "ADDITIONAL_EVIDENCE", 
			"MISCELLANEOUS", "OPEN_PAR", "CLOSE_PAR", "OPEN_BRA", "CLOSE_BRA", "OPEN_SQU_BRA", 
			"CLOSE_SQU_BRA", "DOT", "FROM", "AS", "IS", "IN", "ON", "AND", "IMPACTS", 
			"SIGNIFICANTLY", "BY", "LINEARLY", "LOGISTICALLY", "CORRELATED", "WITH", 
			"BAR", "EQUAL", "Identifier", "BooleanLiteral", "IntegerLiteral", "ExplicitVersionNumber", 
			"FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "Url", "Email", 
			"COMMA", "COLON", "DOUBLECOLON", "COMMENT", "LINE_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SEDL4People.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	       private boolean parsingVariables=false;
	       private Map<String, Object> constants=new HashMap<String,Object>();
	       private Map<String, Object> variables = new HashMap<String,Object>();
	       private List<String> importedModules = new ArrayList<String>();
	       
	       public List<String> getImportedModules(){return importedModules;}       
	       public Map<String, Object> getVariables(){return variables;}
	       public Map<String, Object> getConstants(){return constants;}

	public SEDL4PeopleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DocumentContext extends ParserRuleContext {
		public ModuleImportsContext moduleImports() {
			return getRuleContext(ModuleImportsContext.class,0);
		}
		public ExperimentPreambleContext experimentPreamble() {
			return getRuleContext(ExperimentPreambleContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public HypothesisContext hypothesis() {
			return getRuleContext(HypothesisContext.class,0);
		}
		public DesignContext design() {
			return getRuleContext(DesignContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SEDL4PeopleParser.EOF, 0); }
		public ConstantsContext constants() {
			return getRuleContext(ConstantsContext.class,0);
		}
		public ConfigurationContext configuration() {
			return getRuleContext(ConfigurationContext.class,0);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			moduleImports();
			setState(333);
			experimentPreamble();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTANTS) {
				{
				setState(334);
				constants();
				}
			}

			setState(337);
			variables();
			setState(338);
			hypothesis();
			setState(339);
			design();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONFIGURATION) {
				{
				setState(340);
				configuration();
				}
			}

			setState(343);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleImportsContext extends ParserRuleContext {
		public List<ModuleImportContext> moduleImport() {
			return getRuleContexts(ModuleImportContext.class);
		}
		public ModuleImportContext moduleImport(int i) {
			return getRuleContext(ModuleImportContext.class,i);
		}
		public ModuleImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleImports; }
	}

	public final ModuleImportsContext moduleImports() throws RecognitionException {
		ModuleImportsContext _localctx = new ModuleImportsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_moduleImports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(345);
				moduleImport();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleImportContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(SEDL4PeopleParser.IMPORT, 0); }
		public TerminalNode Identifier() { return getToken(SEDL4PeopleParser.Identifier, 0); }
		public ModuleImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleImport; }
	}

	public final ModuleImportContext moduleImport() throws RecognitionException {
		ModuleImportContext _localctx = new ModuleImportContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moduleImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(IMPORT);
			setState(352);
			match(Identifier);
			importedModules.add(_localctx.Identifier().getText());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExperimentPreambleContext extends ParserRuleContext {
		public TerminalNode EXPERIMENT() { return getToken(SEDL4PeopleParser.EXPERIMENT, 0); }
		public List<TerminalNode> COLON() { return getTokens(SEDL4PeopleParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SEDL4PeopleParser.COLON, i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExperimentContextContext experimentContext() {
			return getRuleContext(ExperimentContextContext.class,0);
		}
		public TerminalNode VERSION() { return getToken(SEDL4PeopleParser.VERSION, 0); }
		public VersionNumberContext versionNumber() {
			return getRuleContext(VersionNumberContext.class,0);
		}
		public TerminalNode REP() { return getToken(SEDL4PeopleParser.REP, 0); }
		public RepUrlContext repUrl() {
			return getRuleContext(RepUrlContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(SEDL4PeopleParser.TYPE, 0); }
		public ExperimentTypeContext experimentType() {
			return getRuleContext(ExperimentTypeContext.class,0);
		}
		public ExperimentPreambleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_experimentPreamble; }
	}

	public final ExperimentPreambleContext experimentPreamble() throws RecognitionException {
		ExperimentPreambleContext _localctx = new ExperimentPreambleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_experimentPreamble);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(EXPERIMENT);
			setState(356);
			match(COLON);
			setState(357);
			id();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VERSION) {
				{
				setState(358);
				match(VERSION);
				setState(359);
				match(COLON);
				setState(360);
				versionNumber();
				}
			}

			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REP) {
				{
				setState(363);
				match(REP);
				setState(364);
				match(COLON);
				setState(365);
				repUrl();
				}
			}

			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(368);
				match(TYPE);
				setState(369);
				match(COLON);
				setState(370);
				experimentType();
				}
			}

			setState(373);
			experimentContext();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExperimentTypeContext extends ParserRuleContext {
		public ExtensionPointContext extensionPoint() {
			return getRuleContext(ExtensionPointContext.class,0);
		}
		public ExperimentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_experimentType; }
	}

	public final ExperimentTypeContext experimentType() throws RecognitionException {
		ExperimentTypeContext _localctx = new ExperimentTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_experimentType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			extensionPoint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExperimentContextContext extends ParserRuleContext {
		public NotesContext notes() {
			return getRuleContext(NotesContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public ClassificationContext classification() {
			return getRuleContext(ClassificationContext.class,0);
		}
		public KeywordsContext keywords() {
			return getRuleContext(KeywordsContext.class,0);
		}
		public SubjectsContext subjects() {
			return getRuleContext(SubjectsContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public PopulationContext population() {
			return getRuleContext(PopulationContext.class,0);
		}
		public ExperimentContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_experimentContext; }
	}

	public final ExperimentContextContext experimentContext() throws RecognitionException {
		ExperimentContextContext _localctx = new ExperimentContextContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_experimentContext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOTES) {
				{
				setState(377);
				notes();
				}
			}

			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANNOTATIONS) {
				{
				setState(380);
				annotations();
				}
			}

			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASSIFIED_AS) {
				{
				setState(383);
				classification();
				}
			}

			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORDS) {
				{
				setState(386);
				keywords();
				}
			}

			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBJECTS) {
				{
				setState(389);
				subjects();
				}
			}

			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBJECT) {
				{
				setState(392);
				object();
				}
			}

			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POPULATION) {
				{
				setState(395);
				population();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotesContext extends ParserRuleContext {
		public TerminalNode NOTES() { return getToken(SEDL4PeopleParser.NOTES, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(SEDL4PeopleParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(SEDL4PeopleParser.StringLiteral, i);
		}
		public NotesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notes; }
	}

	public final NotesContext notes() throws RecognitionException {
		NotesContext _localctx = new NotesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_notes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(NOTES);
			setState(399);
			match(COLON);
			setState(401); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(400);
				match(StringLiteral);
				}
				}
				setState(403); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationsContext extends ParserRuleContext {
		public TerminalNode ANNOTATIONS() { return getToken(SEDL4PeopleParser.ANNOTATIONS, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(SEDL4PeopleParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(SEDL4PeopleParser.StringLiteral, i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_annotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(ANNOTATIONS);
			setState(406);
			match(COLON);
			setState(408); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(407);
				match(StringLiteral);
				}
				}
				setState(410); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassificationContext extends ParserRuleContext {
		public TerminalNode CLASSIFIED_AS() { return getToken(SEDL4PeopleParser.CLASSIFIED_AS, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<Classification_entryContext> classification_entry() {
			return getRuleContexts(Classification_entryContext.class);
		}
		public Classification_entryContext classification_entry(int i) {
			return getRuleContext(Classification_entryContext.class,i);
		}
		public ClassificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classification; }
	}

	public final ClassificationContext classification() throws RecognitionException {
		ClassificationContext _localctx = new ClassificationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(CLASSIFIED_AS);
			setState(413);
			match(COLON);
			setState(415); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(414);
				classification_entry();
				}
				}
				setState(417); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Classification_entryContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(SEDL4PeopleParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(SEDL4PeopleParser.StringLiteral, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public Classification_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classification_entry; }
	}

	public final Classification_entryContext classification_entry() throws RecognitionException {
		Classification_entryContext _localctx = new Classification_entryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classification_entry);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			id();
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(420);
					match(StringLiteral);
					setState(421);
					match(COMMA);
					}
					} 
				}
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(427);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordsContext extends ParserRuleContext {
		public TerminalNode KEYWORDS() { return getToken(SEDL4PeopleParser.KEYWORDS, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(SEDL4PeopleParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(SEDL4PeopleParser.StringLiteral, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public KeywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywords; }
	}

	public final KeywordsContext keywords() throws RecognitionException {
		KeywordsContext _localctx = new KeywordsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_keywords);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(KEYWORDS);
			setState(430);
			match(COLON);
			setState(435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(431);
					match(StringLiteral);
					setState(432);
					match(COMMA);
					}
					} 
				}
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(438);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubjectsContext extends ParserRuleContext {
		public TerminalNode SUBJECTS() { return getToken(SEDL4PeopleParser.SUBJECTS, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<StakeholderContext> stakeholder() {
			return getRuleContexts(StakeholderContext.class);
		}
		public StakeholderContext stakeholder(int i) {
			return getRuleContext(StakeholderContext.class,i);
		}
		public SubjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subjects; }
	}

	public final SubjectsContext subjects() throws RecognitionException {
		SubjectsContext _localctx = new SubjectsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_subjects);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(SUBJECTS);
			setState(441);
			match(COLON);
			setState(443); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(442);
				stakeholder();
				}
				}
				setState(445); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StakeholderContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SEDL4PeopleParser.OPEN_PAR, 0); }
		public EmailContext email() {
			return getRuleContext(EmailContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SEDL4PeopleParser.CLOSE_PAR, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public StakeholderFromContext stakeholderFrom() {
			return getRuleContext(StakeholderFromContext.class,0);
		}
		public TerminalNode AS() { return getToken(SEDL4PeopleParser.AS, 0); }
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public StakeholderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stakeholder; }
	}

	public final StakeholderContext stakeholder() throws RecognitionException {
		StakeholderContext _localctx = new StakeholderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stakeholder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(447);
				id();
				}
				}
				setState(450); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(452);
			match(OPEN_PAR);
			setState(453);
			email();
			setState(454);
			match(CLOSE_PAR);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(455);
				stakeholderFrom();
				}
			}

			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(458);
				match(AS);
				setState(459);
				role();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StakeholderFromContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SEDL4PeopleParser.FROM, 0); }
		public TerminalNode StringLiteral() { return getToken(SEDL4PeopleParser.StringLiteral, 0); }
		public StakeholderFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stakeholderFrom; }
	}

	public final StakeholderFromContext stakeholderFrom() throws RecognitionException {
		StakeholderFromContext _localctx = new StakeholderFromContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stakeholderFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(FROM);
			setState(463);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoleContext extends ParserRuleContext {
		public TerminalNode RESPONSIBLE() { return getToken(SEDL4PeopleParser.RESPONSIBLE, 0); }
		public TerminalNode COLLABORATOR() { return getToken(SEDL4PeopleParser.COLLABORATOR, 0); }
		public RoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role; }
	}

	public final RoleContext role() throws RecognitionException {
		RoleContext _localctx = new RoleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_role);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ( !(_la==RESPONSIBLE || _la==COLLABORATOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode OBJECT() { return getToken(SEDL4PeopleParser.OBJECT, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public TerminalNode StringLiteral() { return getToken(SEDL4PeopleParser.StringLiteral, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(OBJECT);
			setState(468);
			match(COLON);
			setState(469);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PopulationContext extends ParserRuleContext {
		public TerminalNode POPULATION() { return getToken(SEDL4PeopleParser.POPULATION, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public TerminalNode StringLiteral() { return getToken(SEDL4PeopleParser.StringLiteral, 0); }
		public PopulationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_population; }
	}

	public final PopulationContext population() throws RecognitionException {
		PopulationContext _localctx = new PopulationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_population);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(POPULATION);
			setState(472);
			match(COLON);
			setState(473);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantsContext extends ParserRuleContext {
		public TerminalNode CONSTANTS() { return getToken(SEDL4PeopleParser.CONSTANTS, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public ConstantsBlockContext constantsBlock() {
			return getRuleContext(ConstantsBlockContext.class,0);
		}
		public ConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constants; }
	}

	public final ConstantsContext constants() throws RecognitionException {
		ConstantsContext _localctx = new ConstantsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constants);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(CONSTANTS);
			setState(476);
			match(COLON);
			setState(477);
			constantsBlock();
			parsingVariables=false;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantsBlockContext extends ParserRuleContext {
		public List<ConstantDeclarationContext> constantDeclaration() {
			return getRuleContexts(ConstantDeclarationContext.class);
		}
		public ConstantDeclarationContext constantDeclaration(int i) {
			return getRuleContext(ConstantDeclarationContext.class,i);
		}
		public ConstantsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantsBlock; }
	}

	public final ConstantsBlockContext constantsBlock() throws RecognitionException {
		ConstantsBlockContext _localctx = new ConstantsBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constantsBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(480);
				constantDeclaration();
				}
				}
				setState(483); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public FactorDeclarationUnitsContext factorDeclarationUnits() {
			return getRuleContext(FactorDeclarationUnitsContext.class,0);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			field();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MEASURED) {
				{
				setState(486);
				factorDeclarationUnits();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode VARIABLES() { return getToken(SEDL4PeopleParser.VARIABLES, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public VariablesBlockContext variablesBlock() {
			return getRuleContext(VariablesBlockContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(VARIABLES);
			setState(490);
			match(COLON);
			setState(491);
			variablesBlock();
			parsingVariables=true;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariablesBlockContext extends ParserRuleContext {
		public FactorsContext factors() {
			return getRuleContext(FactorsContext.class,0);
		}
		public NcfactorsContext ncfactors() {
			return getRuleContext(NcfactorsContext.class,0);
		}
		public OutcomesContext outcomes() {
			return getRuleContext(OutcomesContext.class,0);
		}
		public ExtraneousContext extraneous() {
			return getRuleContext(ExtraneousContext.class,0);
		}
		public VariablesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablesBlock; }
	}

	public final VariablesBlockContext variablesBlock() throws RecognitionException {
		VariablesBlockContext _localctx = new VariablesBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variablesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FACTORS) {
				{
				setState(494);
				factors();
				}
			}

			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NCFACTORS) {
				{
				setState(497);
				ncfactors();
				}
			}

			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTCOME) {
				{
				setState(500);
				outcomes();
				}
			}

			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTRANEOUS) {
				{
				setState(503);
				extraneous();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorsContext extends ParserRuleContext {
		public TerminalNode FACTORS() { return getToken(SEDL4PeopleParser.FACTORS, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<FactorDeclarationContext> factorDeclaration() {
			return getRuleContexts(FactorDeclarationContext.class);
		}
		public FactorDeclarationContext factorDeclaration(int i) {
			return getRuleContext(FactorDeclarationContext.class,i);
		}
		public FactorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factors; }
	}

	public final FactorsContext factors() throws RecognitionException {
		FactorsContext _localctx = new FactorsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(FACTORS);
			setState(507);
			match(COLON);
			setState(509); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(508);
				factorDeclaration();
				}
				}
				setState(511); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NcfactorsContext extends ParserRuleContext {
		public TerminalNode NCFACTORS() { return getToken(SEDL4PeopleParser.NCFACTORS, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<FactorDeclarationContext> factorDeclaration() {
			return getRuleContexts(FactorDeclarationContext.class);
		}
		public FactorDeclarationContext factorDeclaration(int i) {
			return getRuleContext(FactorDeclarationContext.class,i);
		}
		public NcfactorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ncfactors; }
	}

	public final NcfactorsContext ncfactors() throws RecognitionException {
		NcfactorsContext _localctx = new NcfactorsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ncfactors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(NCFACTORS);
			setState(514);
			match(COLON);
			setState(516); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(515);
				factorDeclaration();
				}
				}
				setState(518); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutcomesContext extends ParserRuleContext {
		public TerminalNode OUTCOME() { return getToken(SEDL4PeopleParser.OUTCOME, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<OutcomeDeclarationContext> outcomeDeclaration() {
			return getRuleContexts(OutcomeDeclarationContext.class);
		}
		public OutcomeDeclarationContext outcomeDeclaration(int i) {
			return getRuleContext(OutcomeDeclarationContext.class,i);
		}
		public OutcomesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outcomes; }
	}

	public final OutcomesContext outcomes() throws RecognitionException {
		OutcomesContext _localctx = new OutcomesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_outcomes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(OUTCOME);
			setState(521);
			match(COLON);
			setState(523); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(522);
				outcomeDeclaration();
				}
				}
				setState(525); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutcomeDeclarationContext extends ParserRuleContext {
		public FactorDeclarationContext factorDeclaration() {
			return getRuleContext(FactorDeclarationContext.class,0);
		}
		public OutcomeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outcomeDeclaration; }
	}

	public final OutcomeDeclarationContext outcomeDeclaration() throws RecognitionException {
		OutcomeDeclarationContext _localctx = new OutcomeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_outcomeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			factorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtraneousContext extends ParserRuleContext {
		public TerminalNode EXTRANEOUS() { return getToken(SEDL4PeopleParser.EXTRANEOUS, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<ExtraneousDeclarationContext> extraneousDeclaration() {
			return getRuleContexts(ExtraneousDeclarationContext.class);
		}
		public ExtraneousDeclarationContext extraneousDeclaration(int i) {
			return getRuleContext(ExtraneousDeclarationContext.class,i);
		}
		public ExtraneousContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraneous; }
	}

	public final ExtraneousContext extraneous() throws RecognitionException {
		ExtraneousContext _localctx = new ExtraneousContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_extraneous);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(EXTRANEOUS);
			setState(530);
			match(COLON);
			setState(532); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(531);
				extraneousDeclaration();
				}
				}
				setState(534); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtraneousDeclarationContext extends ParserRuleContext {
		public List<FactorDeclarationContext> factorDeclaration() {
			return getRuleContexts(FactorDeclarationContext.class);
		}
		public FactorDeclarationContext factorDeclaration(int i) {
			return getRuleContext(FactorDeclarationContext.class,i);
		}
		public ExtraneousDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraneousDeclaration; }
	}

	public final ExtraneousDeclarationContext extraneousDeclaration() throws RecognitionException {
		ExtraneousDeclarationContext _localctx = new ExtraneousDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_extraneousDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(537); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(536);
					factorDeclaration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(539); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorDeclarationContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FactorDeclarationTypeContext factorDeclarationType() {
			return getRuleContext(FactorDeclarationTypeContext.class,0);
		}
		public FactorDeclarationRangeContext factorDeclarationRange() {
			return getRuleContext(FactorDeclarationRangeContext.class,0);
		}
		public FactorDeclarationUnitsContext factorDeclarationUnits() {
			return getRuleContext(FactorDeclarationUnitsContext.class,0);
		}
		public FactorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorDeclaration; }
	}

	public final FactorDeclarationContext factorDeclaration() throws RecognitionException {
		FactorDeclarationContext _localctx = new FactorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_factorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			id();
			setState(542);
			factorDeclarationType();
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (RANGE_MIN_MAX - 28)) | (1L << (MAX - 28)) | (1L << (MIN - 28)))) != 0)) {
				{
				setState(543);
				factorDeclarationRange();
				}
			}

			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MEASURED) {
				{
				setState(546);
				factorDeclarationUnits();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorDeclarationUnitsContext extends ParserRuleContext {
		public TerminalNode MEASURED() { return getToken(SEDL4PeopleParser.MEASURED, 0); }
		public TerminalNode IN() { return getToken(SEDL4PeopleParser.IN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FactorDeclarationUnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorDeclarationUnits; }
	}

	public final FactorDeclarationUnitsContext factorDeclarationUnits() throws RecognitionException {
		FactorDeclarationUnitsContext _localctx = new FactorDeclarationUnitsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_factorDeclarationUnits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(MEASURED);
			setState(550);
			match(IN);
			setState(551);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorDeclarationTypeContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(SEDL4PeopleParser.ENUM, 0); }
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public TerminalNode ORDERED() { return getToken(SEDL4PeopleParser.ORDERED, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IN() { return getToken(SEDL4PeopleParser.IN, 0); }
		public NumericSetContext numericSet() {
			return getRuleContext(NumericSetContext.class,0);
		}
		public FactorDeclarationTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorDeclarationType; }
	}

	public final FactorDeclarationTypeContext factorDeclarationType() throws RecognitionException {
		FactorDeclarationTypeContext _localctx = new FactorDeclarationTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_factorDeclarationType);
		int _la;
		try {
			setState(561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORDERED:
			case ENUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDERED) {
					{
					setState(553);
					match(ORDERED);
					}
				}

				setState(556);
				match(ENUM);
				setState(557);
				enumDeclaration();
				}
				break;
			case INTEGER:
			case FLOAT:
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				type();
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 3);
				{
				setState(559);
				match(IN);
				setState(560);
				numericSet();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteral() { return getTokens(SEDL4PeopleParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(SEDL4PeopleParser.StringLiteral, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public List<TerminalNode> IntegerLiteral() { return getTokens(SEDL4PeopleParser.IntegerLiteral); }
		public TerminalNode IntegerLiteral(int i) {
			return getToken(SEDL4PeopleParser.IntegerLiteral, i);
		}
		public List<TerminalNode> FloatingPointLiteral() { return getTokens(SEDL4PeopleParser.FloatingPointLiteral); }
		public TerminalNode FloatingPointLiteral(int i) {
			return getToken(SEDL4PeopleParser.FloatingPointLiteral, i);
		}
		public List<FunctionalDeclarationContext> functionalDeclaration() {
			return getRuleContexts(FunctionalDeclarationContext.class);
		}
		public FunctionalDeclarationContext functionalDeclaration(int i) {
			return getRuleContext(FunctionalDeclarationContext.class,i);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_enumDeclaration);
		int _la;
		try {
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				match(StringLiteral);
				setState(566); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(564);
					match(COMMA);
					setState(565);
					match(StringLiteral);
					}
					}
					setState(568); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				match(IntegerLiteral);
				setState(573); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(571);
					match(COMMA);
					setState(572);
					match(IntegerLiteral);
					}
					}
					setState(575); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				match(FloatingPointLiteral);
				setState(580); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(578);
					match(COMMA);
					setState(579);
					match(FloatingPointLiteral);
					}
					}
					setState(582); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(584);
				functionalDeclaration();
				setState(587); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(585);
					match(COMMA);
					setState(586);
					functionalDeclaration();
					}
					}
					setState(589); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionalDeclarationContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SEDL4PeopleParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SEDL4PeopleParser.CLOSE_PAR, 0); }
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public FunctionalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionalDeclaration; }
	}

	public final FunctionalDeclarationContext functionalDeclaration() throws RecognitionException {
		FunctionalDeclarationContext _localctx = new FunctionalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_functionalDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			id();
			setState(594);
			match(OPEN_PAR);
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(595);
				fields();
				}
			}

			setState(598);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorDeclarationRangeContext extends ParserRuleContext {
		public TerminalNode RANGE_MIN_MAX() { return getToken(SEDL4PeopleParser.RANGE_MIN_MAX, 0); }
		public TerminalNode OPEN_SQU_BRA() { return getToken(SEDL4PeopleParser.OPEN_SQU_BRA, 0); }
		public List<IntervalLiteralContext> intervalLiteral() {
			return getRuleContexts(IntervalLiteralContext.class);
		}
		public IntervalLiteralContext intervalLiteral(int i) {
			return getRuleContext(IntervalLiteralContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SEDL4PeopleParser.COMMA, 0); }
		public TerminalNode CLOSE_SQU_BRA() { return getToken(SEDL4PeopleParser.CLOSE_SQU_BRA, 0); }
		public TerminalNode MIN() { return getToken(SEDL4PeopleParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(SEDL4PeopleParser.MAX, 0); }
		public FactorDeclarationRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorDeclarationRange; }
	}

	public final FactorDeclarationRangeContext factorDeclarationRange() throws RecognitionException {
		FactorDeclarationRangeContext _localctx = new FactorDeclarationRangeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_factorDeclarationRange);
		try {
			setState(611);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RANGE_MIN_MAX:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				match(RANGE_MIN_MAX);
				setState(601);
				match(OPEN_SQU_BRA);
				setState(602);
				intervalLiteral();
				setState(603);
				match(COMMA);
				setState(604);
				intervalLiteral();
				setState(605);
				match(CLOSE_SQU_BRA);
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				match(MIN);
				setState(608);
				intervalLiteral();
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 3);
				{
				setState(609);
				match(MAX);
				setState(610);
				intervalLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(SEDL4PeopleParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(SEDL4PeopleParser.FloatingPointLiteral, 0); }
		public IntervalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalLiteral; }
	}

	public final IntervalLiteralContext intervalLiteral() throws RecognitionException {
		IntervalLiteralContext _localctx = new IntervalLiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_intervalLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			_la = _input.LA(1);
			if ( !(_la==IntegerLiteral || _la==FloatingPointLiteral) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HypothesisContext extends ParserRuleContext {
		public TerminalNode HYPOTHESIS() { return getToken(SEDL4PeopleParser.HYPOTHESIS, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<HypothesisDeclarationContext> hypothesisDeclaration() {
			return getRuleContexts(HypothesisDeclarationContext.class);
		}
		public HypothesisDeclarationContext hypothesisDeclaration(int i) {
			return getRuleContext(HypothesisDeclarationContext.class,i);
		}
		public HypothesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hypothesis; }
	}

	public final HypothesisContext hypothesis() throws RecognitionException {
		HypothesisContext _localctx = new HypothesisContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_hypothesis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(HYPOTHESIS);
			setState(616);
			match(COLON);
			setState(618); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(617);
				hypothesisDeclaration();
				}
				}
				setState(620); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIFFERENTIAL) | (1L << ASSOCIATIONAL) | (1L << DESCRIPTIVE))) != 0) || _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HypothesisDeclarationContext extends ParserRuleContext {
		public DifferentialHypothesisContext differentialHypothesis() {
			return getRuleContext(DifferentialHypothesisContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public AssociationalHypothesisContext associationalHypothesis() {
			return getRuleContext(AssociationalHypothesisContext.class,0);
		}
		public DescriptiveHypothesisContext descriptiveHypothesis() {
			return getRuleContext(DescriptiveHypothesisContext.class,0);
		}
		public HypothesisDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hypothesisDeclaration; }
	}

	public final HypothesisDeclarationContext hypothesisDeclaration() throws RecognitionException {
		HypothesisDeclarationContext _localctx = new HypothesisDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_hypothesisDeclaration);
		try {
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(622);
					id();
					setState(623);
					match(COLON);
					}
					break;
				}
				setState(627);
				differentialHypothesis();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				associationalHypothesis();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(629);
				descriptiveHypothesis();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DifferentialHypothesisContext extends ParserRuleContext {
		public ImplicitDifferentialHypothesisContext implicitDifferentialHypothesis() {
			return getRuleContext(ImplicitDifferentialHypothesisContext.class,0);
		}
		public ExplicitDifferentialHypothesisContext explicitDifferentialHypothesis() {
			return getRuleContext(ExplicitDifferentialHypothesisContext.class,0);
		}
		public DifferentialHypothesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_differentialHypothesis; }
	}

	public final DifferentialHypothesisContext differentialHypothesis() throws RecognitionException {
		DifferentialHypothesisContext _localctx = new DifferentialHypothesisContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_differentialHypothesis);
		try {
			setState(634);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIFFERENTIAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				implicitDifferentialHypothesis();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				explicitDifferentialHypothesis();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitDifferentialHypothesisContext extends ParserRuleContext {
		public FactorListContext factorList() {
			return getRuleContext(FactorListContext.class,0);
		}
		public TerminalNode IMPACTS() { return getToken(SEDL4PeopleParser.IMPACTS, 0); }
		public TerminalNode ON() { return getToken(SEDL4PeopleParser.ON, 0); }
		public OutcomeContext outcome() {
			return getRuleContext(OutcomeContext.class,0);
		}
		public TerminalNode SIGNIFICANTLY() { return getToken(SEDL4PeopleParser.SIGNIFICANTLY, 0); }
		public ExplicitDifferentialHypothesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitDifferentialHypothesis; }
	}

	public final ExplicitDifferentialHypothesisContext explicitDifferentialHypothesis() throws RecognitionException {
		ExplicitDifferentialHypothesisContext _localctx = new ExplicitDifferentialHypothesisContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_explicitDifferentialHypothesis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			factorList();
			setState(637);
			match(IMPACTS);
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGNIFICANTLY) {
				{
				setState(638);
				match(SIGNIFICANTLY);
				}
			}

			setState(641);
			match(ON);
			setState(642);
			outcome();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorListContext extends ParserRuleContext {
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public FactorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorList; }
	}

	public final FactorListContext factorList() throws RecognitionException {
		FactorListContext _localctx = new FactorListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_factorList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			idList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutcomeListContext extends ParserRuleContext {
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public OutcomeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outcomeList; }
	}

	public final OutcomeListContext outcomeList() throws RecognitionException {
		OutcomeListContext _localctx = new OutcomeListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_outcomeList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			idList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdListContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public TerminalNode AND() { return getToken(SEDL4PeopleParser.AND, 0); }
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			id();
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(649);
				match(COMMA);
				setState(650);
				id();
				}
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(656);
				match(AND);
				setState(657);
				id();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplicitDifferentialHypothesisContext extends ParserRuleContext {
		public TerminalNode DIFFERENTIAL() { return getToken(SEDL4PeopleParser.DIFFERENTIAL, 0); }
		public ImplicitDifferentialHypothesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitDifferentialHypothesis; }
	}

	public final ImplicitDifferentialHypothesisContext implicitDifferentialHypothesis() throws RecognitionException {
		ImplicitDifferentialHypothesisContext _localctx = new ImplicitDifferentialHypothesisContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_implicitDifferentialHypothesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(DIFFERENTIAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociationalHypothesisContext extends ParserRuleContext {
		public ImplicitAssociationalHypothesisContext implicitAssociationalHypothesis() {
			return getRuleContext(ImplicitAssociationalHypothesisContext.class,0);
		}
		public ExplicitAssociationalHypothesisContext explicitAssociationalHypothesis() {
			return getRuleContext(ExplicitAssociationalHypothesisContext.class,0);
		}
		public AssociationalHypothesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associationalHypothesis; }
	}

	public final AssociationalHypothesisContext associationalHypothesis() throws RecognitionException {
		AssociationalHypothesisContext _localctx = new AssociationalHypothesisContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_associationalHypothesis);
		try {
			setState(664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSOCIATIONAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				implicitAssociationalHypothesis();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				explicitAssociationalHypothesis();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplicitAssociationalHypothesisContext extends ParserRuleContext {
		public TerminalNode ASSOCIATIONAL() { return getToken(SEDL4PeopleParser.ASSOCIATIONAL, 0); }
		public ImplicitAssociationalHypothesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitAssociationalHypothesis; }
	}

	public final ImplicitAssociationalHypothesisContext implicitAssociationalHypothesis() throws RecognitionException {
		ImplicitAssociationalHypothesisContext _localctx = new ImplicitAssociationalHypothesisContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_implicitAssociationalHypothesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(ASSOCIATIONAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitAssociationalHypothesisContext extends ParserRuleContext {
		public OutcomeContext outcome() {
			return getRuleContext(OutcomeContext.class,0);
		}
		public TerminalNode IS() { return getToken(SEDL4PeopleParser.IS, 0); }
		public TerminalNode CORRELATED() { return getToken(SEDL4PeopleParser.CORRELATED, 0); }
		public TerminalNode WITH() { return getToken(SEDL4PeopleParser.WITH, 0); }
		public FactorListContext factorList() {
			return getRuleContext(FactorListContext.class,0);
		}
		public TerminalNode LINEARLY() { return getToken(SEDL4PeopleParser.LINEARLY, 0); }
		public TerminalNode LOGISTICALLY() { return getToken(SEDL4PeopleParser.LOGISTICALLY, 0); }
		public ExplicitAssociationalHypothesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitAssociationalHypothesis; }
	}

	public final ExplicitAssociationalHypothesisContext explicitAssociationalHypothesis() throws RecognitionException {
		ExplicitAssociationalHypothesisContext _localctx = new ExplicitAssociationalHypothesisContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_explicitAssociationalHypothesis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			outcome();
			setState(669);
			match(IS);
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINEARLY || _la==LOGISTICALLY) {
				{
				setState(670);
				_la = _input.LA(1);
				if ( !(_la==LINEARLY || _la==LOGISTICALLY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(673);
			match(CORRELATED);
			setState(674);
			match(WITH);
			setState(675);
			factorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutcomeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public OutcomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outcome; }
	}

	public final OutcomeContext outcome() throws RecognitionException {
		OutcomeContext _localctx = new OutcomeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_outcome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescriptiveHypothesisContext extends ParserRuleContext {
		public TerminalNode DESCRIPTIVE() { return getToken(SEDL4PeopleParser.DESCRIPTIVE, 0); }
		public DescriptiveHypothesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptiveHypothesis; }
	}

	public final DescriptiveHypothesisContext descriptiveHypothesis() throws RecognitionException {
		DescriptiveHypothesisContext _localctx = new DescriptiveHypothesisContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_descriptiveHypothesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(DESCRIPTIVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignContext extends ParserRuleContext {
		public TerminalNode DESIGN() { return getToken(SEDL4PeopleParser.DESIGN, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public DesignBlockContext designBlock() {
			return getRuleContext(DesignBlockContext.class,0);
		}
		public DesignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_design; }
	}

	public final DesignContext design() throws RecognitionException {
		DesignContext _localctx = new DesignContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_design);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(DESIGN);
			setState(682);
			match(COLON);
			setState(683);
			designBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignBlockContext extends ParserRuleContext {
		public CustomDesignBlockContext customDesignBlock() {
			return getRuleContext(CustomDesignBlockContext.class,0);
		}
		public ExtensionPointContext extensionPoint() {
			return getRuleContext(ExtensionPointContext.class,0);
		}
		public DesignBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designBlock; }
	}

	public final DesignBlockContext designBlock() throws RecognitionException {
		DesignBlockContext _localctx = new DesignBlockContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_designBlock);
		try {
			setState(687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SAMPLING:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				customDesignBlock();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				extensionPoint();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CustomDesignBlockContext extends ParserRuleContext {
		public DesignSamplingContext designSampling() {
			return getRuleContext(DesignSamplingContext.class,0);
		}
		public GroupsContext groups() {
			return getRuleContext(GroupsContext.class,0);
		}
		public ProtocolContext protocol() {
			return getRuleContext(ProtocolContext.class,0);
		}
		public AnalysesContext analyses() {
			return getRuleContext(AnalysesContext.class,0);
		}
		public DetailedDesignContext detailedDesign() {
			return getRuleContext(DetailedDesignContext.class,0);
		}
		public CustomDesignBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customDesignBlock; }
	}

	public final CustomDesignBlockContext customDesignBlock() throws RecognitionException {
		CustomDesignBlockContext _localctx = new CustomDesignBlockContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_customDesignBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			designSampling();
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DETAILED_DESIGN) {
				{
				setState(690);
				detailedDesign();
				}
			}

			setState(693);
			groups();
			setState(694);
			protocol();
			setState(695);
			analyses();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignSamplingContext extends ParserRuleContext {
		public TerminalNode SAMPLING() { return getToken(SEDL4PeopleParser.SAMPLING, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public SamplingTypeContext samplingType() {
			return getRuleContext(SamplingTypeContext.class,0);
		}
		public DesignAssignmentContext designAssignment() {
			return getRuleContext(DesignAssignmentContext.class,0);
		}
		public DesignBlockingContext designBlocking() {
			return getRuleContext(DesignBlockingContext.class,0);
		}
		public DesignSamplingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designSampling; }
	}

	public final DesignSamplingContext designSampling() throws RecognitionException {
		DesignSamplingContext _localctx = new DesignSamplingContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_designSampling);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(SAMPLING);
			setState(698);
			match(COLON);
			setState(699);
			samplingType();
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(700);
				designAssignment();
				}
			}

			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BLOCKING) {
				{
				setState(703);
				designBlocking();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SamplingTypeContext extends ParserRuleContext {
		public TerminalNode RANDOM() { return getToken(SEDL4PeopleParser.RANDOM, 0); }
		public TerminalNode ADHOC() { return getToken(SEDL4PeopleParser.ADHOC, 0); }
		public TerminalNode StringLiteral() { return getToken(SEDL4PeopleParser.StringLiteral, 0); }
		public SamplingTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_samplingType; }
	}

	public final SamplingTypeContext samplingType() throws RecognitionException {
		SamplingTypeContext _localctx = new SamplingTypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_samplingType);
		try {
			setState(709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RANDOM:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				match(RANDOM);
				}
				break;
			case ADHOC:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				match(ADHOC);
				setState(708);
				match(StringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignAssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(SEDL4PeopleParser.ASSIGNMENT, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public TerminalNode RANDOM() { return getToken(SEDL4PeopleParser.RANDOM, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public DesignAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designAssignment; }
	}

	public final DesignAssignmentContext designAssignment() throws RecognitionException {
		DesignAssignmentContext _localctx = new DesignAssignmentContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_designAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(ASSIGNMENT);
			setState(712);
			match(COLON);
			setState(715);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RANDOM:
				{
				setState(713);
				match(RANDOM);
				}
				break;
			case Identifier:
				{
				setState(714);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignBlockingContext extends ParserRuleContext {
		public TerminalNode BLOCKING() { return getToken(SEDL4PeopleParser.BLOCKING, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public DesignBlockingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designBlocking; }
	}

	public final DesignBlockingContext designBlocking() throws RecognitionException {
		DesignBlockingContext _localctx = new DesignBlockingContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_designBlocking);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(BLOCKING);
			setState(718);
			match(COLON);
			setState(719);
			id();
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(720);
				match(COMMA);
				setState(721);
				id();
				}
				}
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DetailedDesignContext extends ParserRuleContext {
		public TerminalNode DETAILED_DESIGN() { return getToken(SEDL4PeopleParser.DETAILED_DESIGN, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public DesignAssignmentContext designAssignment() {
			return getRuleContext(DesignAssignmentContext.class,0);
		}
		public DesignBlockingContext designBlocking() {
			return getRuleContext(DesignBlockingContext.class,0);
		}
		public DetailedDesignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detailedDesign; }
	}

	public final DetailedDesignContext detailedDesign() throws RecognitionException {
		DetailedDesignContext _localctx = new DetailedDesignContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_detailedDesign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(DETAILED_DESIGN);
			setState(728);
			match(COLON);
			setState(729);
			id();
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(730);
				designAssignment();
				}
			}

			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BLOCKING) {
				{
				setState(733);
				designBlocking();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupsContext extends ParserRuleContext {
		public TerminalNode GROUPS() { return getToken(SEDL4PeopleParser.GROUPS, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public GroupsExpresionContext groupsExpresion() {
			return getRuleContext(GroupsExpresionContext.class,0);
		}
		public GroupsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groups; }
	}

	public final GroupsContext groups() throws RecognitionException {
		GroupsContext _localctx = new GroupsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_groups);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(GROUPS);
			setState(737);
			match(COLON);
			setState(738);
			groupsExpresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupsExpresionContext extends ParserRuleContext {
		public GroupsByExpresionContext groupsByExpresion() {
			return getRuleContext(GroupsByExpresionContext.class,0);
		}
		public GroupsAsFunctionalDeclarationsContext groupsAsFunctionalDeclarations() {
			return getRuleContext(GroupsAsFunctionalDeclarationsContext.class,0);
		}
		public SizingSentenceContext sizingSentence() {
			return getRuleContext(SizingSentenceContext.class,0);
		}
		public GroupsExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupsExpresion; }
	}

	public final GroupsExpresionContext groupsExpresion() throws RecognitionException {
		GroupsExpresionContext _localctx = new GroupsExpresionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_groupsExpresion);
		try {
			setState(743);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BY:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				groupsByExpresion();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				groupsAsFunctionalDeclarations();
				}
				break;
			case SIZING:
				enterOuterAlt(_localctx, 3);
				{
				setState(742);
				sizingSentence();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupsByExpresionContext extends ParserRuleContext {
		public TerminalNode BY() { return getToken(SEDL4PeopleParser.BY, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public SizingSentenceContext sizingSentence() {
			return getRuleContext(SizingSentenceContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public GroupsByExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupsByExpresion; }
	}

	public final GroupsByExpresionContext groupsByExpresion() throws RecognitionException {
		GroupsByExpresionContext _localctx = new GroupsByExpresionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_groupsByExpresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(BY);
			setState(746);
			id();
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(747);
				match(COMMA);
				setState(748);
				id();
				}
				}
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(754);
			sizingSentence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupsAsFunctionalDeclarationsContext extends ParserRuleContext {
		public List<FunctionalDeclarationContext> functionalDeclaration() {
			return getRuleContexts(FunctionalDeclarationContext.class);
		}
		public FunctionalDeclarationContext functionalDeclaration(int i) {
			return getRuleContext(FunctionalDeclarationContext.class,i);
		}
		public List<SizingSentenceContext> sizingSentence() {
			return getRuleContexts(SizingSentenceContext.class);
		}
		public SizingSentenceContext sizingSentence(int i) {
			return getRuleContext(SizingSentenceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public GroupsAsFunctionalDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupsAsFunctionalDeclarations; }
	}

	public final GroupsAsFunctionalDeclarationsContext groupsAsFunctionalDeclarations() throws RecognitionException {
		GroupsAsFunctionalDeclarationsContext _localctx = new GroupsAsFunctionalDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_groupsAsFunctionalDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			functionalDeclaration();
			setState(757);
			sizingSentence();
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(758);
				match(COMMA);
				setState(759);
				functionalDeclaration();
				setState(760);
				sizingSentence();
				}
				}
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SizingSentenceContext extends ParserRuleContext {
		public TerminalNode SIZING() { return getToken(SEDL4PeopleParser.SIZING, 0); }
		public TerminalNode IntegerLiteral() { return getToken(SEDL4PeopleParser.IntegerLiteral, 0); }
		public SizingSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizingSentence; }
	}

	public final SizingSentenceContext sizingSentence() throws RecognitionException {
		SizingSentenceContext _localctx = new SizingSentenceContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_sizingSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(SIZING);
			setState(768);
			match(IntegerLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolContext extends ParserRuleContext {
		public TerminalNode PROTOCOL() { return getToken(SEDL4PeopleParser.PROTOCOL, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public TerminalNode RANDOM() { return getToken(SEDL4PeopleParser.RANDOM, 0); }
		public ExplicitProtocolContext explicitProtocol() {
			return getRuleContext(ExplicitProtocolContext.class,0);
		}
		public ProtocolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol; }
	}

	public final ProtocolContext protocol() throws RecognitionException {
		ProtocolContext _localctx = new ProtocolContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_protocol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(PROTOCOL);
			setState(771);
			match(COLON);
			setState(774);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RANDOM:
				{
				setState(772);
				match(RANDOM);
				}
				break;
			case TREATMENT:
			case MEASUREMENT:
				{
				setState(773);
				explicitProtocol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitProtocolContext extends ParserRuleContext {
		public List<ProtocolStepContext> protocolStep() {
			return getRuleContexts(ProtocolStepContext.class);
		}
		public ProtocolStepContext protocolStep(int i) {
			return getRuleContext(ProtocolStepContext.class,i);
		}
		public ExplicitProtocolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitProtocol; }
	}

	public final ExplicitProtocolContext explicitProtocol() throws RecognitionException {
		ExplicitProtocolContext _localctx = new ExplicitProtocolContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_explicitProtocol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(776);
				protocolStep();
				}
				}
				setState(779); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TREATMENT || _la==MEASUREMENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolStepContext extends ParserRuleContext {
		public MeasurementContext measurement() {
			return getRuleContext(MeasurementContext.class,0);
		}
		public TreatmentContext treatment() {
			return getRuleContext(TreatmentContext.class,0);
		}
		public ProtocolStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolStep; }
	}

	public final ProtocolStepContext protocolStep() throws RecognitionException {
		ProtocolStepContext _localctx = new ProtocolStepContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_protocolStep);
		try {
			setState(783);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MEASUREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				measurement();
				}
				break;
			case TREATMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				treatment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeasurementContext extends ParserRuleContext {
		public TerminalNode MEASUREMENT() { return getToken(SEDL4PeopleParser.MEASUREMENT, 0); }
		public FunctionalDeclarationContext functionalDeclaration() {
			return getRuleContext(FunctionalDeclarationContext.class,0);
		}
		public TerminalNode OF() { return getToken(SEDL4PeopleParser.OF, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode ON() { return getToken(SEDL4PeopleParser.ON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public MeasurementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measurement; }
	}

	public final MeasurementContext measurement() throws RecognitionException {
		MeasurementContext _localctx = new MeasurementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_measurement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(MEASUREMENT);
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(786);
				match(OF);
				setState(787);
				id();
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(788);
					match(COMMA);
					setState(789);
					id();
					}
					}
					setState(794);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(797);
				match(ON);
				}
			}

			setState(800);
			functionalDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TreatmentContext extends ParserRuleContext {
		public TerminalNode TREATMENT() { return getToken(SEDL4PeopleParser.TREATMENT, 0); }
		public FunctionalDeclarationContext functionalDeclaration() {
			return getRuleContext(FunctionalDeclarationContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public TreatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treatment; }
	}

	public final TreatmentContext treatment() throws RecognitionException {
		TreatmentContext _localctx = new TreatmentContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_treatment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(TREATMENT);
			setState(808);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(803);
					id();
					setState(804);
					match(COMMA);
					}
					} 
				}
				setState(810);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(811);
			functionalDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnalysesContext extends ParserRuleContext {
		public TerminalNode ANALYSES() { return getToken(SEDL4PeopleParser.ANALYSES, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public AnalysesBlocksContext analysesBlocks() {
			return getRuleContext(AnalysesBlocksContext.class,0);
		}
		public AnalysesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyses; }
	}

	public final AnalysesContext analyses() throws RecognitionException {
		AnalysesContext _localctx = new AnalysesContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_analyses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(ANALYSES);
			setState(814);
			match(COLON);
			setState(815);
			analysesBlocks();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnalysesBlocksContext extends ParserRuleContext {
		public List<AnalysesBlockContext> analysesBlock() {
			return getRuleContexts(AnalysesBlockContext.class);
		}
		public AnalysesBlockContext analysesBlock(int i) {
			return getRuleContext(AnalysesBlockContext.class,i);
		}
		public AnalysesBlocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analysesBlocks; }
	}

	public final AnalysesBlocksContext analysesBlocks() throws RecognitionException {
		AnalysesBlocksContext _localctx = new AnalysesBlocksContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_analysesBlocks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(817);
				analysesBlock();
				}
				}
				setState(820); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnalysesBlockContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<StatisticFunctionContext> statisticFunction() {
			return getRuleContexts(StatisticFunctionContext.class);
		}
		public StatisticFunctionContext statisticFunction(int i) {
			return getRuleContext(StatisticFunctionContext.class,i);
		}
		public AnalysesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analysesBlock; }
	}

	public final AnalysesBlockContext analysesBlock() throws RecognitionException {
		AnalysesBlockContext _localctx = new AnalysesBlockContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_analysesBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			id();
			setState(823);
			match(COLON);
			setState(825); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(824);
					statisticFunction();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(827); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatisticFunctionContext extends ParserRuleContext {
		public RankingSFContext rankingSF() {
			return getRuleContext(RankingSFContext.class,0);
		}
		public CentralTendencyMeasurementSFContext centralTendencyMeasurementSF() {
			return getRuleContext(CentralTendencyMeasurementSFContext.class,0);
		}
		public VariabilityMeasureSFContext variabilityMeasureSF() {
			return getRuleContext(VariabilityMeasureSFContext.class,0);
		}
		public ConfidenceIntervalSFContext confidenceIntervalSF() {
			return getRuleContext(ConfidenceIntervalSFContext.class,0);
		}
		public CorrelationCoeficientSFContext correlationCoeficientSF() {
			return getRuleContext(CorrelationCoeficientSFContext.class,0);
		}
		public NhstSFContext nhstSF() {
			return getRuleContext(NhstSFContext.class,0);
		}
		public ExtensionPointContext extensionPoint() {
			return getRuleContext(ExtensionPointContext.class,0);
		}
		public StatisticFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statisticFunction; }
	}

	public final StatisticFunctionContext statisticFunction() throws RecognitionException {
		StatisticFunctionContext _localctx = new StatisticFunctionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_statisticFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RANKING:
				{
				setState(829);
				rankingSF();
				}
				break;
			case MEAN:
			case MODE:
			case MEDIAN:
				{
				setState(830);
				centralTendencyMeasurementSF();
				}
				break;
			case STDDEV:
			case VARIANCE:
			case IQR:
			case RANGE:
				{
				setState(831);
				variabilityMeasureSF();
				}
				break;
			case CONFIDENCE_INTERVAL:
				{
				setState(832);
				confidenceIntervalSF();
				}
				break;
			case PEARSON:
			case BIVARIATE_REGRESSION:
			case SPEARMAN:
			case KENDALL:
			case CRAMER:
			case LOG_LINEAR:
				{
				setState(833);
				correlationCoeficientSF();
				}
				break;
			case KOLMOGOROV_SMIRNOV:
			case LILLIEFORS:
			case SHAPIRO_WILK:
			case LEVENE:
			case T_STUDENT:
			case WILCOXON:
			case MCNEMAR:
			case ANOVA:
			case FACTANOVAWRS:
			case FRIEDMAN:
			case ALIGNED_FRIEDMAN:
			case IMAN_DAVEPORT:
			case QUADE:
			case COCHRAN_Q:
			case BONFERRONI_DUNN:
			case HOLMS:
			case HOCHBERG:
			case HOMMEL:
			case HOLLAND:
			case ROM:
			case FINNER:
			case LI:
			case SHAFFER:
			case NAMENYI:
			case TTEST:
			case SIGN_TEST:
			case CHI_SQUARE:
			case KRUSKAL:
			case FISHER:
			case TUKEY:
				{
				setState(834);
				nhstSF();
				}
				break;
			case Identifier:
				{
				setState(835);
				extensionPoint();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RankingSFContext extends ParserRuleContext {
		public RFunctionContext rFunction() {
			return getRuleContext(RFunctionContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SEDL4PeopleParser.OPEN_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SEDL4PeopleParser.COMMA, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SEDL4PeopleParser.CLOSE_PAR, 0); }
		public CentralTendencyMeasurementSFContext centralTendencyMeasurementSF() {
			return getRuleContext(CentralTendencyMeasurementSFContext.class,0);
		}
		public VariabilityMeasureSFContext variabilityMeasureSF() {
			return getRuleContext(VariabilityMeasureSFContext.class,0);
		}
		public RankingSFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rankingSF; }
	}

	public final RankingSFContext rankingSF() throws RecognitionException {
		RankingSFContext _localctx = new RankingSFContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_rankingSF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			rFunction();
			setState(839);
			match(OPEN_PAR);
			setState(842);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MEAN:
			case MODE:
			case MEDIAN:
				{
				setState(840);
				centralTendencyMeasurementSF();
				}
				break;
			case STDDEV:
			case VARIANCE:
			case IQR:
			case RANGE:
				{
				setState(841);
				variabilityMeasureSF();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(844);
			match(COMMA);
			setState(845);
			id();
			setState(846);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RFunctionContext extends ParserRuleContext {
		public TerminalNode RANKING() { return getToken(SEDL4PeopleParser.RANKING, 0); }
		public RFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rFunction; }
	}

	public final RFunctionContext rFunction() throws RecognitionException {
		RFunctionContext _localctx = new RFunctionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_rFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(RANKING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CentralTendencyMeasurementSFContext extends ParserRuleContext {
		public CtmFunctionContext ctmFunction() {
			return getRuleContext(CtmFunctionContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SEDL4PeopleParser.OPEN_PAR, 0); }
		public List<StatisticFunctionParamContext> statisticFunctionParam() {
			return getRuleContexts(StatisticFunctionParamContext.class);
		}
		public StatisticFunctionParamContext statisticFunctionParam(int i) {
			return getRuleContext(StatisticFunctionParamContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SEDL4PeopleParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public CentralTendencyMeasurementSFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_centralTendencyMeasurementSF; }
	}

	public final CentralTendencyMeasurementSFContext centralTendencyMeasurementSF() throws RecognitionException {
		CentralTendencyMeasurementSFContext _localctx = new CentralTendencyMeasurementSFContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_centralTendencyMeasurementSF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			ctmFunction();
			setState(851);
			match(OPEN_PAR);
			setState(852);
			statisticFunctionParam();
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(853);
				match(COMMA);
				setState(854);
				statisticFunctionParam();
				}
				}
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(860);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtmFunctionContext extends ParserRuleContext {
		public TerminalNode MEAN() { return getToken(SEDL4PeopleParser.MEAN, 0); }
		public TerminalNode MODE() { return getToken(SEDL4PeopleParser.MODE, 0); }
		public TerminalNode MEDIAN() { return getToken(SEDL4PeopleParser.MEDIAN, 0); }
		public CtmFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctmFunction; }
	}

	public final CtmFunctionContext ctmFunction() throws RecognitionException {
		CtmFunctionContext _localctx = new CtmFunctionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_ctmFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (MEAN - 87)) | (1L << (MODE - 87)) | (1L << (MEDIAN - 87)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariabilityMeasureSFContext extends ParserRuleContext {
		public VmFunctionContext vmFunction() {
			return getRuleContext(VmFunctionContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SEDL4PeopleParser.OPEN_PAR, 0); }
		public List<StatisticFunctionParamContext> statisticFunctionParam() {
			return getRuleContexts(StatisticFunctionParamContext.class);
		}
		public StatisticFunctionParamContext statisticFunctionParam(int i) {
			return getRuleContext(StatisticFunctionParamContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SEDL4PeopleParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public VariabilityMeasureSFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabilityMeasureSF; }
	}

	public final VariabilityMeasureSFContext variabilityMeasureSF() throws RecognitionException {
		VariabilityMeasureSFContext _localctx = new VariabilityMeasureSFContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_variabilityMeasureSF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			vmFunction();
			setState(865);
			match(OPEN_PAR);
			setState(866);
			statisticFunctionParam();
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(867);
				match(COMMA);
				setState(868);
				statisticFunctionParam();
				}
				}
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(874);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VmFunctionContext extends ParserRuleContext {
		public TerminalNode STDDEV() { return getToken(SEDL4PeopleParser.STDDEV, 0); }
		public TerminalNode VARIANCE() { return getToken(SEDL4PeopleParser.VARIANCE, 0); }
		public TerminalNode IQR() { return getToken(SEDL4PeopleParser.IQR, 0); }
		public TerminalNode RANGE() { return getToken(SEDL4PeopleParser.RANGE, 0); }
		public VmFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vmFunction; }
	}

	public final VmFunctionContext vmFunction() throws RecognitionException {
		VmFunctionContext _localctx = new VmFunctionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_vmFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (STDDEV - 90)) | (1L << (VARIANCE - 90)) | (1L << (IQR - 90)) | (1L << (RANGE - 90)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfidenceIntervalSFContext extends ParserRuleContext {
		public CiFunctionContext ciFunction() {
			return getRuleContext(CiFunctionContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SEDL4PeopleParser.OPEN_PAR, 0); }
		public StatisticFunctionParamContext statisticFunctionParam() {
			return getRuleContext(StatisticFunctionParamContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SEDL4PeopleParser.CLOSE_PAR, 0); }
		public ConfidenceIntervalSFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_confidenceIntervalSF; }
	}

	public final ConfidenceIntervalSFContext confidenceIntervalSF() throws RecognitionException {
		ConfidenceIntervalSFContext _localctx = new ConfidenceIntervalSFContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_confidenceIntervalSF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			ciFunction();
			setState(879);
			match(OPEN_PAR);
			setState(880);
			statisticFunctionParam();
			setState(881);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CiFunctionContext extends ParserRuleContext {
		public TerminalNode CONFIDENCE_INTERVAL() { return getToken(SEDL4PeopleParser.CONFIDENCE_INTERVAL, 0); }
		public CiFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciFunction; }
	}

	public final CiFunctionContext ciFunction() throws RecognitionException {
		CiFunctionContext _localctx = new CiFunctionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_ciFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			match(CONFIDENCE_INTERVAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorrelationCoeficientSFContext extends ParserRuleContext {
		public CcFunctionContext ccFunction() {
			return getRuleContext(CcFunctionContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SEDL4PeopleParser.OPEN_PAR, 0); }
		public List<StatisticFunctionParamContext> statisticFunctionParam() {
			return getRuleContexts(StatisticFunctionParamContext.class);
		}
		public StatisticFunctionParamContext statisticFunctionParam(int i) {
			return getRuleContext(StatisticFunctionParamContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SEDL4PeopleParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public CorrelationCoeficientSFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_correlationCoeficientSF; }
	}

	public final CorrelationCoeficientSFContext correlationCoeficientSF() throws RecognitionException {
		CorrelationCoeficientSFContext _localctx = new CorrelationCoeficientSFContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_correlationCoeficientSF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			ccFunction();
			setState(886);
			match(OPEN_PAR);
			setState(887);
			statisticFunctionParam();
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(888);
				match(COMMA);
				setState(889);
				statisticFunctionParam();
				}
				}
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(895);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CcFunctionContext extends ParserRuleContext {
		public TerminalNode PEARSON() { return getToken(SEDL4PeopleParser.PEARSON, 0); }
		public TerminalNode BIVARIATE_REGRESSION() { return getToken(SEDL4PeopleParser.BIVARIATE_REGRESSION, 0); }
		public TerminalNode SPEARMAN() { return getToken(SEDL4PeopleParser.SPEARMAN, 0); }
		public TerminalNode KENDALL() { return getToken(SEDL4PeopleParser.KENDALL, 0); }
		public TerminalNode CRAMER() { return getToken(SEDL4PeopleParser.CRAMER, 0); }
		public TerminalNode LOG_LINEAR() { return getToken(SEDL4PeopleParser.LOG_LINEAR, 0); }
		public CcFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ccFunction; }
	}

	public final CcFunctionContext ccFunction() throws RecognitionException {
		CcFunctionContext _localctx = new CcFunctionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_ccFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			_la = _input.LA(1);
			if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (PEARSON - 96)) | (1L << (BIVARIATE_REGRESSION - 96)) | (1L << (SPEARMAN - 96)) | (1L << (KENDALL - 96)) | (1L << (CRAMER - 96)) | (1L << (LOG_LINEAR - 96)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NhstSFContext extends ParserRuleContext {
		public NhstFunctionContext nhstFunction() {
			return getRuleContext(NhstFunctionContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SEDL4PeopleParser.OPEN_PAR, 0); }
		public List<StatisticFunctionParamContext> statisticFunctionParam() {
			return getRuleContexts(StatisticFunctionParamContext.class);
		}
		public StatisticFunctionParamContext statisticFunctionParam(int i) {
			return getRuleContext(StatisticFunctionParamContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SEDL4PeopleParser.COMMA, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SEDL4PeopleParser.CLOSE_PAR, 0); }
		public NhstSFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nhstSF; }
	}

	public final NhstSFContext nhstSF() throws RecognitionException {
		NhstSFContext _localctx = new NhstSFContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_nhstSF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			nhstFunction();
			setState(900);
			match(OPEN_PAR);
			setState(901);
			statisticFunctionParam();
			setState(902);
			match(COMMA);
			setState(903);
			statisticFunctionParam();
			setState(904);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NhstFunctionContext extends ParserRuleContext {
		public TerminalNode KOLMOGOROV_SMIRNOV() { return getToken(SEDL4PeopleParser.KOLMOGOROV_SMIRNOV, 0); }
		public TerminalNode LILLIEFORS() { return getToken(SEDL4PeopleParser.LILLIEFORS, 0); }
		public TerminalNode SHAPIRO_WILK() { return getToken(SEDL4PeopleParser.SHAPIRO_WILK, 0); }
		public TerminalNode LEVENE() { return getToken(SEDL4PeopleParser.LEVENE, 0); }
		public TerminalNode T_STUDENT() { return getToken(SEDL4PeopleParser.T_STUDENT, 0); }
		public TerminalNode WILCOXON() { return getToken(SEDL4PeopleParser.WILCOXON, 0); }
		public TerminalNode MCNEMAR() { return getToken(SEDL4PeopleParser.MCNEMAR, 0); }
		public TerminalNode ANOVA() { return getToken(SEDL4PeopleParser.ANOVA, 0); }
		public TerminalNode FACTANOVAWRS() { return getToken(SEDL4PeopleParser.FACTANOVAWRS, 0); }
		public TerminalNode FRIEDMAN() { return getToken(SEDL4PeopleParser.FRIEDMAN, 0); }
		public TerminalNode ALIGNED_FRIEDMAN() { return getToken(SEDL4PeopleParser.ALIGNED_FRIEDMAN, 0); }
		public TerminalNode IMAN_DAVEPORT() { return getToken(SEDL4PeopleParser.IMAN_DAVEPORT, 0); }
		public TerminalNode QUADE() { return getToken(SEDL4PeopleParser.QUADE, 0); }
		public TerminalNode COCHRAN_Q() { return getToken(SEDL4PeopleParser.COCHRAN_Q, 0); }
		public TerminalNode BONFERRONI_DUNN() { return getToken(SEDL4PeopleParser.BONFERRONI_DUNN, 0); }
		public TerminalNode HOLMS() { return getToken(SEDL4PeopleParser.HOLMS, 0); }
		public TerminalNode HOCHBERG() { return getToken(SEDL4PeopleParser.HOCHBERG, 0); }
		public TerminalNode HOMMEL() { return getToken(SEDL4PeopleParser.HOMMEL, 0); }
		public TerminalNode HOLLAND() { return getToken(SEDL4PeopleParser.HOLLAND, 0); }
		public TerminalNode ROM() { return getToken(SEDL4PeopleParser.ROM, 0); }
		public TerminalNode FINNER() { return getToken(SEDL4PeopleParser.FINNER, 0); }
		public TerminalNode LI() { return getToken(SEDL4PeopleParser.LI, 0); }
		public TerminalNode SHAFFER() { return getToken(SEDL4PeopleParser.SHAFFER, 0); }
		public TerminalNode NAMENYI() { return getToken(SEDL4PeopleParser.NAMENYI, 0); }
		public TerminalNode TTEST() { return getToken(SEDL4PeopleParser.TTEST, 0); }
		public TerminalNode SIGN_TEST() { return getToken(SEDL4PeopleParser.SIGN_TEST, 0); }
		public TerminalNode CHI_SQUARE() { return getToken(SEDL4PeopleParser.CHI_SQUARE, 0); }
		public TerminalNode KRUSKAL() { return getToken(SEDL4PeopleParser.KRUSKAL, 0); }
		public TerminalNode FISHER() { return getToken(SEDL4PeopleParser.FISHER, 0); }
		public TerminalNode TUKEY() { return getToken(SEDL4PeopleParser.TUKEY, 0); }
		public NhstFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nhstFunction; }
	}

	public final NhstFunctionContext nhstFunction() throws RecognitionException {
		NhstFunctionContext _localctx = new NhstFunctionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_nhstFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (KOLMOGOROV_SMIRNOV - 102)) | (1L << (LILLIEFORS - 102)) | (1L << (SHAPIRO_WILK - 102)) | (1L << (LEVENE - 102)) | (1L << (T_STUDENT - 102)) | (1L << (WILCOXON - 102)) | (1L << (MCNEMAR - 102)) | (1L << (ANOVA - 102)) | (1L << (FACTANOVAWRS - 102)) | (1L << (FRIEDMAN - 102)) | (1L << (ALIGNED_FRIEDMAN - 102)) | (1L << (IMAN_DAVEPORT - 102)) | (1L << (QUADE - 102)) | (1L << (COCHRAN_Q - 102)) | (1L << (BONFERRONI_DUNN - 102)) | (1L << (HOLMS - 102)) | (1L << (HOCHBERG - 102)) | (1L << (HOMMEL - 102)) | (1L << (HOLLAND - 102)) | (1L << (ROM - 102)) | (1L << (FINNER - 102)) | (1L << (LI - 102)) | (1L << (SHAFFER - 102)) | (1L << (NAMENYI - 102)) | (1L << (TTEST - 102)) | (1L << (SIGN_TEST - 102)) | (1L << (CHI_SQUARE - 102)) | (1L << (KRUSKAL - 102)) | (1L << (FISHER - 102)) | (1L << (TUKEY - 102)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatisticFunctionParamContext extends ParserRuleContext {
		public StatisticFunctionValueContext statisticFunctionValue() {
			return getRuleContext(StatisticFunctionValueContext.class,0);
		}
		public StatisticFunctionFilterContext statisticFunctionFilter() {
			return getRuleContext(StatisticFunctionFilterContext.class,0);
		}
		public StatisticFunctionParamVariableContext statisticFunctionParamVariable() {
			return getRuleContext(StatisticFunctionParamVariableContext.class,0);
		}
		public StatisticFunctionParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statisticFunctionParam; }
	}

	public final StatisticFunctionParamContext statisticFunctionParam() throws RecognitionException {
		StatisticFunctionParamContext _localctx = new StatisticFunctionParamContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_statisticFunctionParam);
		try {
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				statisticFunctionValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
				statisticFunctionFilter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(910);
				statisticFunctionParamVariable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatisticFunctionParamVariableContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public StatisticFunctionParamVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statisticFunctionParamVariable; }
	}

	public final StatisticFunctionParamVariableContext statisticFunctionParamVariable() throws RecognitionException {
		StatisticFunctionParamVariableContext _localctx = new StatisticFunctionParamVariableContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_statisticFunctionParamVariable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(914);
				assignment();
				}
			}

			setState(921);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(917);
					match(COMMA);
					setState(918);
					assignment();
					}
					} 
				}
				setState(923);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(SEDL4PeopleParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			id();
			setState(927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(925);
				match(EQUAL);
				setState(926);
				value();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatisticFunctionValueContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(SEDL4PeopleParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(SEDL4PeopleParser.FloatingPointLiteral, 0); }
		public StatisticFunctionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statisticFunctionValue; }
	}

	public final StatisticFunctionValueContext statisticFunctionValue() throws RecognitionException {
		StatisticFunctionValueContext _localctx = new StatisticFunctionValueContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_statisticFunctionValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			_la = _input.LA(1);
			if ( !(_la==IntegerLiteral || _la==FloatingPointLiteral) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatisticFunctionFilterContext extends ParserRuleContext {
		public OldStatisticFunctionFilterContext oldStatisticFunctionFilter() {
			return getRuleContext(OldStatisticFunctionFilterContext.class,0);
		}
		public NewStatisticFunctionFilterContext newStatisticFunctionFilter() {
			return getRuleContext(NewStatisticFunctionFilterContext.class,0);
		}
		public StatisticFunctionFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statisticFunctionFilter; }
	}

	public final StatisticFunctionFilterContext statisticFunctionFilter() throws RecognitionException {
		StatisticFunctionFilterContext _localctx = new StatisticFunctionFilterContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_statisticFunctionFilter);
		try {
			setState(933);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILTER:
			case GROUPING:
				enterOuterAlt(_localctx, 1);
				{
				setState(931);
				oldStatisticFunctionFilter();
				}
				break;
			case OF:
			case WHERE:
			case CLOSE_PAR:
			case BY:
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(932);
				newStatisticFunctionFilter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OldStatisticFunctionFilterContext extends ParserRuleContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SEDL4PeopleParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SEDL4PeopleParser.DOT, i);
		}
		public GroupingContext grouping() {
			return getRuleContext(GroupingContext.class,0);
		}
		public ProjectionContext projection() {
			return getRuleContext(ProjectionContext.class,0);
		}
		public OldStatisticFunctionFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oldStatisticFunctionFilter; }
	}

	public final OldStatisticFunctionFilterContext oldStatisticFunctionFilter() throws RecognitionException {
		OldStatisticFunctionFilterContext _localctx = new OldStatisticFunctionFilterContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_oldStatisticFunctionFilter);
		int _la;
		try {
			setState(949);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(935);
				filter();
				setState(938);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(936);
					match(DOT);
					setState(937);
					grouping();
					}
					break;
				}
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(940);
					match(DOT);
					setState(941);
					projection();
					}
				}

				}
				break;
			case GROUPING:
				enterOuterAlt(_localctx, 2);
				{
				setState(944);
				grouping();
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(945);
					match(DOT);
					setState(946);
					projection();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewStatisticFunctionFilterContext extends ParserRuleContext {
		public OfDSSpecContext ofDSSpec() {
			return getRuleContext(OfDSSpecContext.class,0);
		}
		public WhereDSSpecContext whereDSSpec() {
			return getRuleContext(WhereDSSpecContext.class,0);
		}
		public ByDSSpecContext byDSSpec() {
			return getRuleContext(ByDSSpecContext.class,0);
		}
		public NewStatisticFunctionFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newStatisticFunctionFilter; }
	}

	public final NewStatisticFunctionFilterContext newStatisticFunctionFilter() throws RecognitionException {
		NewStatisticFunctionFilterContext _localctx = new NewStatisticFunctionFilterContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_newStatisticFunctionFilter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(951);
				ofDSSpec();
				}
			}

			setState(955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(954);
				whereDSSpec();
				}
			}

			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(957);
				byDSSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OfDSSpecContext extends ParserRuleContext {
		public TerminalNode OF() { return getToken(SEDL4PeopleParser.OF, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public OfDSSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ofDSSpec; }
	}

	public final OfDSSpecContext ofDSSpec() throws RecognitionException {
		OfDSSpecContext _localctx = new OfDSSpecContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_ofDSSpec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(OF);
			setState(961);
			id();
			setState(966);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(962);
					match(COMMA);
					setState(963);
					id();
					}
					} 
				}
				setState(968);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereDSSpecContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SEDL4PeopleParser.WHERE, 0); }
		public StatisticFunctionParamVariableContext statisticFunctionParamVariable() {
			return getRuleContext(StatisticFunctionParamVariableContext.class,0);
		}
		public WhereDSSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereDSSpec; }
	}

	public final WhereDSSpecContext whereDSSpec() throws RecognitionException {
		WhereDSSpecContext _localctx = new WhereDSSpecContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_whereDSSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			match(WHERE);
			setState(970);
			statisticFunctionParamVariable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ByDSSpecContext extends ParserRuleContext {
		public TerminalNode BY() { return getToken(SEDL4PeopleParser.BY, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public ByDSSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byDSSpec; }
	}

	public final ByDSSpecContext byDSSpec() throws RecognitionException {
		ByDSSpecContext _localctx = new ByDSSpecContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_byDSSpec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			match(BY);
			setState(973);
			id();
			setState(978);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(974);
					match(COMMA);
					setState(975);
					id();
					}
					} 
				}
				setState(980);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(SEDL4PeopleParser.FILTER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SEDL4PeopleParser.OPEN_PAR, 0); }
		public StatisticFunctionParamVariableContext statisticFunctionParamVariable() {
			return getRuleContext(StatisticFunctionParamVariableContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SEDL4PeopleParser.CLOSE_PAR, 0); }
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			match(FILTER);
			setState(982);
			match(OPEN_PAR);
			setState(983);
			statisticFunctionParamVariable();
			setState(984);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingContext extends ParserRuleContext {
		public TerminalNode GROUPING() { return getToken(SEDL4PeopleParser.GROUPING, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SEDL4PeopleParser.OPEN_PAR, 0); }
		public TerminalNode OPEN_BRA() { return getToken(SEDL4PeopleParser.OPEN_BRA, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode CLOSE_BRA() { return getToken(SEDL4PeopleParser.CLOSE_BRA, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SEDL4PeopleParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public GroupingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping; }
	}

	public final GroupingContext grouping() throws RecognitionException {
		GroupingContext _localctx = new GroupingContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_grouping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(GROUPING);
			setState(987);
			match(OPEN_PAR);
			setState(988);
			match(OPEN_BRA);
			setState(989);
			id();
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(990);
				match(COMMA);
				setState(991);
				id();
				}
				}
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(997);
			match(CLOSE_BRA);
			setState(998);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProjectionContext extends ParserRuleContext {
		public TerminalNode PROJ() { return getToken(SEDL4PeopleParser.PROJ, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SEDL4PeopleParser.OPEN_PAR, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SEDL4PeopleParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_projection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(PROJ);
			setState(1001);
			match(OPEN_PAR);
			setState(1002);
			id();
			setState(1007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1003);
				match(COMMA);
				setState(1004);
				id();
				}
				}
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1010);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigurationContext extends ParserRuleContext {
		public TerminalNode CONFIGURATION() { return getToken(SEDL4PeopleParser.CONFIGURATION, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<ConfigurationBlockContext> configurationBlock() {
			return getRuleContexts(ConfigurationBlockContext.class);
		}
		public ConfigurationBlockContext configurationBlock(int i) {
			return getRuleContext(ConfigurationBlockContext.class,i);
		}
		public ConfigurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration; }
	}

	public final ConfigurationContext configuration() throws RecognitionException {
		ConfigurationContext _localctx = new ConfigurationContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_configuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			match(CONFIGURATION);
			setState(1013);
			match(COLON);
			setState(1015); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1014);
				configurationBlock();
				}
				}
				setState(1017); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigurationBlockContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public SingleConfContext singleConf() {
			return getRuleContext(SingleConfContext.class,0);
		}
		public ConfigurationBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configurationBlock; }
	}

	public final ConfigurationBlockContext configurationBlock() throws RecognitionException {
		ConfigurationBlockContext _localctx = new ConfigurationBlockContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_configurationBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			id();
			setState(1020);
			match(COLON);
			setState(1021);
			singleConf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleConfContext extends ParserRuleContext {
		public ExperimentalProcedureContext experimentalProcedure() {
			return getRuleContext(ExperimentalProcedureContext.class,0);
		}
		public InputsContext inputs() {
			return getRuleContext(InputsContext.class,0);
		}
		public OutputsContext outputs() {
			return getRuleContext(OutputsContext.class,0);
		}
		public SettingsContext settings() {
			return getRuleContext(SettingsContext.class,0);
		}
		public ExecutionContext execution() {
			return getRuleContext(ExecutionContext.class,0);
		}
		public SingleConfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleConf; }
	}

	public final SingleConfContext singleConf() throws RecognitionException {
		SingleConfContext _localctx = new SingleConfContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_singleConf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INPUTS) {
				{
				setState(1023);
				inputs();
				}
			}

			setState(1027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTPUTS) {
				{
				setState(1026);
				outputs();
				}
			}

			setState(1030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SETTING) {
				{
				setState(1029);
				settings();
				}
			}

			setState(1032);
			experimentalProcedure();
			setState(1034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RUNS) {
				{
				setState(1033);
				execution();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputsContext extends ParserRuleContext {
		public TerminalNode INPUTS() { return getToken(SEDL4PeopleParser.INPUTS, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<FilesContext> files() {
			return getRuleContexts(FilesContext.class);
		}
		public FilesContext files(int i) {
			return getRuleContext(FilesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public InputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputs; }
	}

	public final InputsContext inputs() throws RecognitionException {
		InputsContext _localctx = new InputsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_inputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			match(INPUTS);
			setState(1037);
			match(COLON);
			setState(1038);
			files();
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1039);
				match(COMMA);
				setState(1040);
				files();
				}
				}
				setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputsContext extends ParserRuleContext {
		public TerminalNode OUTPUTS() { return getToken(SEDL4PeopleParser.OUTPUTS, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<FilesContext> files() {
			return getRuleContexts(FilesContext.class);
		}
		public FilesContext files(int i) {
			return getRuleContext(FilesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public OutputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputs; }
	}

	public final OutputsContext outputs() throws RecognitionException {
		OutputsContext _localctx = new OutputsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_outputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			match(OUTPUTS);
			setState(1047);
			match(COLON);
			setState(1048);
			files();
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1049);
				match(COMMA);
				setState(1050);
				files();
				}
				}
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilesContext extends ParserRuleContext {
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public FilesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_files; }
	}

	public final FilesContext files() throws RecognitionException {
		FilesContext _localctx = new FilesContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_files);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			file();
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROLE) {
				{
				setState(1057);
				roles();
				}
			}

			setState(1061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORMAT) {
				{
				setState(1060);
				format();
				}
			}

			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAPPING) {
				{
				setState(1063);
				mapping();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(SEDL4PeopleParser.FILE, 0); }
		public TerminalNode StringLiteral() { return getToken(SEDL4PeopleParser.StringLiteral, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			match(FILE);
			setState(1067);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RolesContext extends ParserRuleContext {
		public TerminalNode ROLE() { return getToken(SEDL4PeopleParser.ROLE, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public TerminalNode MISCELLANEOUS() { return getToken(SEDL4PeopleParser.MISCELLANEOUS, 0); }
		public TerminalNode MAIN_RESULT() { return getToken(SEDL4PeopleParser.MAIN_RESULT, 0); }
		public TerminalNode ADDITIONAL_EVIDENCE() { return getToken(SEDL4PeopleParser.ADDITIONAL_EVIDENCE, 0); }
		public RolesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roles; }
	}

	public final RolesContext roles() throws RecognitionException {
		RolesContext _localctx = new RolesContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_roles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			match(ROLE);
			setState(1070);
			match(COLON);
			setState(1071);
			_la = _input.LA(1);
			if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (MAIN_RESULT - 136)) | (1L << (ADDITIONAL_EVIDENCE - 136)) | (1L << (MISCELLANEOUS - 136)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormatContext extends ParserRuleContext {
		public TerminalNode FORMAT() { return getToken(SEDL4PeopleParser.FORMAT, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format; }
	}

	public final FormatContext format() throws RecognitionException {
		FormatContext _localctx = new FormatContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_format);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			match(FORMAT);
			setState(1074);
			match(COLON);
			setState(1075);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingContext extends ParserRuleContext {
		public TerminalNode MAPPING() { return getToken(SEDL4PeopleParser.MAPPING, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public TerminalNode StringLiteral() { return getToken(SEDL4PeopleParser.StringLiteral, 0); }
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			match(MAPPING);
			setState(1078);
			match(COLON);
			setState(1079);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SettingsContext extends ParserRuleContext {
		public TerminalNode SETTING() { return getToken(SEDL4PeopleParser.SETTING, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public RuntimesContext runtimes() {
			return getRuleContext(RuntimesContext.class,0);
		}
		public LibrariesContext libraries() {
			return getRuleContext(LibrariesContext.class,0);
		}
		public SettingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settings; }
	}

	public final SettingsContext settings() throws RecognitionException {
		SettingsContext _localctx = new SettingsContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_settings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			match(SETTING);
			setState(1082);
			match(COLON);
			setState(1084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RUNTIMES) {
				{
				setState(1083);
				runtimes();
				}
			}

			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIBRARIES) {
				{
				setState(1086);
				libraries();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuntimesContext extends ParserRuleContext {
		public TerminalNode RUNTIMES() { return getToken(SEDL4PeopleParser.RUNTIMES, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<RuntimeContext> runtime() {
			return getRuleContexts(RuntimeContext.class);
		}
		public RuntimeContext runtime(int i) {
			return getRuleContext(RuntimeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public RuntimesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runtimes; }
	}

	public final RuntimesContext runtimes() throws RecognitionException {
		RuntimesContext _localctx = new RuntimesContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_runtimes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			match(RUNTIMES);
			setState(1090);
			match(COLON);
			setState(1091);
			runtime();
			setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1092);
				match(COMMA);
				setState(1093);
				runtime();
				}
				}
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuntimeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public VersionNumberContext versionNumber() {
			return getRuleContext(VersionNumberContext.class,0);
		}
		public RuntimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runtime; }
	}

	public final RuntimeContext runtime() throws RecognitionException {
		RuntimeContext _localctx = new RuntimeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_runtime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			id();
			setState(1100);
			versionNumber();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibrariesContext extends ParserRuleContext {
		public TerminalNode LIBRARIES() { return getToken(SEDL4PeopleParser.LIBRARIES, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<LibraryContext> library() {
			return getRuleContexts(LibraryContext.class);
		}
		public LibraryContext library(int i) {
			return getRuleContext(LibraryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public LibrariesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraries; }
	}

	public final LibrariesContext libraries() throws RecognitionException {
		LibrariesContext _localctx = new LibrariesContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_libraries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			match(LIBRARIES);
			setState(1103);
			match(COLON);
			setState(1104);
			library();
			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1105);
				match(COMMA);
				setState(1106);
				library();
				}
				}
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibraryContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public VersionNumberContext versionNumber() {
			return getRuleContext(VersionNumberContext.class,0);
		}
		public LibraryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_library; }
	}

	public final LibraryContext library() throws RecognitionException {
		LibraryContext _localctx = new LibraryContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_library);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			id();
			setState(1113);
			versionNumber();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExperimentalProcedureContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(SEDL4PeopleParser.PROCEDURE, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public UnstructuredProcedureDefinitionContext unstructuredProcedureDefinition() {
			return getRuleContext(UnstructuredProcedureDefinitionContext.class,0);
		}
		public StructuredProcedureDefinitionContext structuredProcedureDefinition() {
			return getRuleContext(StructuredProcedureDefinitionContext.class,0);
		}
		public ExperimentalProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_experimentalProcedure; }
	}

	public final ExperimentalProcedureContext experimentalProcedure() throws RecognitionException {
		ExperimentalProcedureContext _localctx = new ExperimentalProcedureContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_experimentalProcedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			match(PROCEDURE);
			setState(1116);
			match(COLON);
			setState(1119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case COMMAND:
			case RUNS:
			case Identifier:
				{
				setState(1117);
				unstructuredProcedureDefinition();
				}
				break;
			case PREPROCESSING:
			case EXECUTION:
				{
				setState(1118);
				structuredProcedureDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnstructuredProcedureDefinitionContext extends ParserRuleContext {
		public List<ProcedureStepContext> procedureStep() {
			return getRuleContexts(ProcedureStepContext.class);
		}
		public ProcedureStepContext procedureStep(int i) {
			return getRuleContext(ProcedureStepContext.class,i);
		}
		public UnstructuredProcedureDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unstructuredProcedureDefinition; }
	}

	public final UnstructuredProcedureDefinitionContext unstructuredProcedureDefinition() throws RecognitionException {
		UnstructuredProcedureDefinitionContext _localctx = new UnstructuredProcedureDefinitionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_unstructuredProcedureDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAND) {
				{
				{
				setState(1121);
				procedureStep();
				}
				}
				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureStepContext extends ParserRuleContext {
		public ProcDefContext procDef() {
			return getRuleContext(ProcDefContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public ProcBodyContext procBody() {
			return getRuleContext(ProcBodyContext.class,0);
		}
		public ProcedureStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStep; }
	}

	public final ProcedureStepContext procedureStep() throws RecognitionException {
		ProcedureStepContext _localctx = new ProcedureStepContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_procedureStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			procDef();
			setState(1128);
			match(COLON);
			setState(1129);
			procBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcDefContext extends ParserRuleContext {
		public TerminalNode COMMAND() { return getToken(SEDL4PeopleParser.COMMAND, 0); }
		public TerminalNode AS() { return getToken(SEDL4PeopleParser.AS, 0); }
		public ProcedureStepTypeContext procedureStepType() {
			return getRuleContext(ProcedureStepTypeContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SEDL4PeopleParser.OPEN_PAR, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SEDL4PeopleParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public ProcDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procDef; }
	}

	public final ProcDefContext procDef() throws RecognitionException {
		ProcDefContext _localctx = new ProcDefContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_procDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			match(COMMAND);
			setState(1134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1132);
				match(AS);
				setState(1133);
				procedureStepType();
				}
			}

			setState(1147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1136);
				match(OPEN_PAR);
				setState(1137);
				id();
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1138);
					match(COMMA);
					setState(1139);
					id();
					}
					}
					setState(1144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1145);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureStepTypeContext extends ParserRuleContext {
		public TreatmentStepContext treatmentStep() {
			return getRuleContext(TreatmentStepContext.class,0);
		}
		public MeasurementStepContext measurementStep() {
			return getRuleContext(MeasurementStepContext.class,0);
		}
		public PreprocessingStepContext preprocessingStep() {
			return getRuleContext(PreprocessingStepContext.class,0);
		}
		public PostprocestingStepContext postprocestingStep() {
			return getRuleContext(PostprocestingStepContext.class,0);
		}
		public ExtensionPointStepContext extensionPointStep() {
			return getRuleContext(ExtensionPointStepContext.class,0);
		}
		public ProcedureStepTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStepType; }
	}

	public final ProcedureStepTypeContext procedureStepType() throws RecognitionException {
		ProcedureStepTypeContext _localctx = new ProcedureStepTypeContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_procedureStepType);
		try {
			setState(1154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1149);
				treatmentStep();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1150);
				measurementStep();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1151);
				preprocessingStep();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1152);
				postprocestingStep();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1153);
				extensionPointStep();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TreatmentStepContext extends ParserRuleContext {
		public TerminalNode TREATMENT() { return getToken(SEDL4PeopleParser.TREATMENT, 0); }
		public TreatmentStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treatmentStep; }
	}

	public final TreatmentStepContext treatmentStep() throws RecognitionException {
		TreatmentStepContext _localctx = new TreatmentStepContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_treatmentStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			match(TREATMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeasurementStepContext extends ParserRuleContext {
		public TerminalNode MEASUREMENT() { return getToken(SEDL4PeopleParser.MEASUREMENT, 0); }
		public MeasurementStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measurementStep; }
	}

	public final MeasurementStepContext measurementStep() throws RecognitionException {
		MeasurementStepContext _localctx = new MeasurementStepContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_measurementStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
			match(MEASUREMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostprocestingStepContext extends ParserRuleContext {
		public TerminalNode POSTPROCESSING() { return getToken(SEDL4PeopleParser.POSTPROCESSING, 0); }
		public PostprocestingStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postprocestingStep; }
	}

	public final PostprocestingStepContext postprocestingStep() throws RecognitionException {
		PostprocestingStepContext _localctx = new PostprocestingStepContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_postprocestingStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			match(POSTPROCESSING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionPointStepContext extends ParserRuleContext {
		public ExtensionPointContext extensionPoint() {
			return getRuleContext(ExtensionPointContext.class,0);
		}
		public PretreatmentClauseContext pretreatmentClause() {
			return getRuleContext(PretreatmentClauseContext.class,0);
		}
		public ExtensionPointStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionPointStep; }
	}

	public final ExtensionPointStepContext extensionPointStep() throws RecognitionException {
		ExtensionPointStepContext _localctx = new ExtensionPointStepContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_extensionPointStep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRETREATMENT) {
				{
				setState(1162);
				pretreatmentClause();
				}
			}

			setState(1165);
			extensionPoint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreprocessingStepContext extends ParserRuleContext {
		public TerminalNode PREPROCESSING() { return getToken(SEDL4PeopleParser.PREPROCESSING, 0); }
		public PretreatmentClauseContext pretreatmentClause() {
			return getRuleContext(PretreatmentClauseContext.class,0);
		}
		public PreprocessingStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessingStep; }
	}

	public final PreprocessingStepContext preprocessingStep() throws RecognitionException {
		PreprocessingStepContext _localctx = new PreprocessingStepContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_preprocessingStep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRETREATMENT) {
				{
				setState(1167);
				pretreatmentClause();
				}
			}

			setState(1170);
			match(PREPROCESSING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcBodyContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SEDL4PeopleParser.StringLiteral, 0); }
		public ProcBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procBody; }
	}

	public final ProcBodyContext procBody() throws RecognitionException {
		ProcBodyContext _localctx = new ProcBodyContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_procBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructuredProcedureDefinitionContext extends ParserRuleContext {
		public ExecutionProcedureDefinitionContext executionProcedureDefinition() {
			return getRuleContext(ExecutionProcedureDefinitionContext.class,0);
		}
		public PreProcessingDefinitionContext preProcessingDefinition() {
			return getRuleContext(PreProcessingDefinitionContext.class,0);
		}
		public PostProcessingContext postProcessing() {
			return getRuleContext(PostProcessingContext.class,0);
		}
		public StructuredProcedureDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredProcedureDefinition; }
	}

	public final StructuredProcedureDefinitionContext structuredProcedureDefinition() throws RecognitionException {
		StructuredProcedureDefinitionContext _localctx = new StructuredProcedureDefinitionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_structuredProcedureDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PREPROCESSING) {
				{
				setState(1174);
				preProcessingDefinition();
				}
			}

			setState(1177);
			executionProcedureDefinition();
			setState(1179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POSTPROCESSING) {
				{
				setState(1178);
				postProcessing();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreProcessingDefinitionContext extends ParserRuleContext {
		public TerminalNode PREPROCESSING() { return getToken(SEDL4PeopleParser.PREPROCESSING, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<ProcedureStepContext> procedureStep() {
			return getRuleContexts(ProcedureStepContext.class);
		}
		public ProcedureStepContext procedureStep(int i) {
			return getRuleContext(ProcedureStepContext.class,i);
		}
		public PreProcessingDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preProcessingDefinition; }
	}

	public final PreProcessingDefinitionContext preProcessingDefinition() throws RecognitionException {
		PreProcessingDefinitionContext _localctx = new PreProcessingDefinitionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_preProcessingDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			match(PREPROCESSING);
			setState(1182);
			match(COLON);
			setState(1186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAND) {
				{
				{
				setState(1183);
				procedureStep();
				}
				}
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PretreatmentClauseContext extends ParserRuleContext {
		public TerminalNode PRETREATMENT() { return getToken(SEDL4PeopleParser.PRETREATMENT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SEDL4PeopleParser.OPEN_PAR, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SEDL4PeopleParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public PretreatmentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pretreatmentClause; }
	}

	public final PretreatmentClauseContext pretreatmentClause() throws RecognitionException {
		PretreatmentClauseContext _localctx = new PretreatmentClauseContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_pretreatmentClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			match(PRETREATMENT);
			setState(1201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1190);
				match(OPEN_PAR);
				setState(1191);
				id();
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1192);
					match(COMMA);
					setState(1193);
					id();
					}
					}
					setState(1198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1199);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecutionProcedureDefinitionContext extends ParserRuleContext {
		public TerminalNode EXECUTION() { return getToken(SEDL4PeopleParser.EXECUTION, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<ProcedureStepContext> procedureStep() {
			return getRuleContexts(ProcedureStepContext.class);
		}
		public ProcedureStepContext procedureStep(int i) {
			return getRuleContext(ProcedureStepContext.class,i);
		}
		public ExecutionProcedureDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executionProcedureDefinition; }
	}

	public final ExecutionProcedureDefinitionContext executionProcedureDefinition() throws RecognitionException {
		ExecutionProcedureDefinitionContext _localctx = new ExecutionProcedureDefinitionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_executionProcedureDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			match(EXECUTION);
			setState(1204);
			match(COLON);
			setState(1208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAND) {
				{
				{
				setState(1205);
				procedureStep();
				}
				}
				setState(1210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostProcessingContext extends ParserRuleContext {
		public TerminalNode POSTPROCESSING() { return getToken(SEDL4PeopleParser.POSTPROCESSING, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<ProcedureStepContext> procedureStep() {
			return getRuleContexts(ProcedureStepContext.class);
		}
		public ProcedureStepContext procedureStep(int i) {
			return getRuleContext(ProcedureStepContext.class,i);
		}
		public PostProcessingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postProcessing; }
	}

	public final PostProcessingContext postProcessing() throws RecognitionException {
		PostProcessingContext _localctx = new PostProcessingContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_postProcessing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			match(POSTPROCESSING);
			setState(1212);
			match(COLON);
			setState(1216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAND) {
				{
				{
				setState(1213);
				procedureStep();
				}
				}
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecutionContext extends ParserRuleContext {
		public TerminalNode RUNS() { return getToken(SEDL4PeopleParser.RUNS, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<ExecutionBlockContext> executionBlock() {
			return getRuleContexts(ExecutionBlockContext.class);
		}
		public ExecutionBlockContext executionBlock(int i) {
			return getRuleContext(ExecutionBlockContext.class,i);
		}
		public ExecutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execution; }
	}

	public final ExecutionContext execution() throws RecognitionException {
		ExecutionContext _localctx = new ExecutionContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_execution);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			match(RUNS);
			setState(1220);
			match(COLON);
			setState(1222); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1221);
					executionBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1224); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecutionBlockContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public ExecutionConfContext executionConf() {
			return getRuleContext(ExecutionConfContext.class,0);
		}
		public ExecutionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executionBlock; }
	}

	public final ExecutionBlockContext executionBlock() throws RecognitionException {
		ExecutionBlockContext _localctx = new ExecutionBlockContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_executionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			id();
			setState(1227);
			match(COLON);
			setState(1228);
			executionConf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecutionConfContext extends ParserRuleContext {
		public ResultExecutionContext resultExecution() {
			return getRuleContext(ResultExecutionContext.class,0);
		}
		public ExecStartContext execStart() {
			return getRuleContext(ExecStartContext.class,0);
		}
		public ExecEndContext execEnd() {
			return getRuleContext(ExecEndContext.class,0);
		}
		public LogContext log() {
			return getRuleContext(LogContext.class,0);
		}
		public AnalysesExecutionContext analysesExecution() {
			return getRuleContext(AnalysesExecutionContext.class,0);
		}
		public ExecutionConfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executionConf; }
	}

	public final ExecutionConfContext executionConf() throws RecognitionException {
		ExecutionConfContext _localctx = new ExecutionConfContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_executionConf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START) {
				{
				setState(1230);
				execStart();
				}
			}

			setState(1234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END) {
				{
				setState(1233);
				execEnd();
				}
			}

			setState(1237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOG) {
				{
				setState(1236);
				log();
				}
			}

			setState(1239);
			resultExecution();
			setState(1241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANALYSES) {
				{
				setState(1240);
				analysesExecution();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecStartContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(SEDL4PeopleParser.START, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public TerminalNode StringLiteral() { return getToken(SEDL4PeopleParser.StringLiteral, 0); }
		public ExecStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execStart; }
	}

	public final ExecStartContext execStart() throws RecognitionException {
		ExecStartContext _localctx = new ExecStartContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_execStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			match(START);
			setState(1244);
			match(COLON);
			setState(1245);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecEndContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(SEDL4PeopleParser.END, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public TerminalNode StringLiteral() { return getToken(SEDL4PeopleParser.StringLiteral, 0); }
		public ExecEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execEnd; }
	}

	public final ExecEndContext execEnd() throws RecognitionException {
		ExecEndContext _localctx = new ExecEndContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_execEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			match(END);
			setState(1248);
			match(COLON);
			setState(1249);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(SEDL4PeopleParser.LOG, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public TerminalNode StringLiteral() { return getToken(SEDL4PeopleParser.StringLiteral, 0); }
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_log);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			match(LOG);
			setState(1252);
			match(COLON);
			setState(1253);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultExecutionContext extends ParserRuleContext {
		public TerminalNode RESULT() { return getToken(SEDL4PeopleParser.RESULT, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<FileExecContext> fileExec() {
			return getRuleContexts(FileExecContext.class);
		}
		public FileExecContext fileExec(int i) {
			return getRuleContext(FileExecContext.class,i);
		}
		public ResultExecutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultExecution; }
	}

	public final ResultExecutionContext resultExecution() throws RecognitionException {
		ResultExecutionContext _localctx = new ResultExecutionContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_resultExecution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			match(RESULT);
			setState(1256);
			match(COLON);
			setState(1260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FILE) {
				{
				{
				setState(1257);
				fileExec();
				}
				}
				setState(1262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnalysesExecutionContext extends ParserRuleContext {
		public TerminalNode ANALYSES() { return getToken(SEDL4PeopleParser.ANALYSES, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public List<AnalysesExecBlockContext> analysesExecBlock() {
			return getRuleContexts(AnalysesExecBlockContext.class);
		}
		public AnalysesExecBlockContext analysesExecBlock(int i) {
			return getRuleContext(AnalysesExecBlockContext.class,i);
		}
		public AnalysesExecutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analysesExecution; }
	}

	public final AnalysesExecutionContext analysesExecution() throws RecognitionException {
		AnalysesExecutionContext _localctx = new AnalysesExecutionContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_analysesExecution);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			match(ANALYSES);
			setState(1264);
			match(COLON);
			setState(1266); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1265);
					analysesExecBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1268); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnalysesExecBlockContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public AnalFunctionsContext analFunctions() {
			return getRuleContext(AnalFunctionsContext.class,0);
		}
		public AnalysesExecBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analysesExecBlock; }
	}

	public final AnalysesExecBlockContext analysesExecBlock() throws RecognitionException {
		AnalysesExecBlockContext _localctx = new AnalysesExecBlockContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_analysesExecBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			id();
			setState(1271);
			match(COLON);
			setState(1272);
			analFunctions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnalFunctionsContext extends ParserRuleContext {
		public List<ExeFunctionContext> exeFunction() {
			return getRuleContexts(ExeFunctionContext.class);
		}
		public ExeFunctionContext exeFunction(int i) {
			return getRuleContext(ExeFunctionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public AnalFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analFunctions; }
	}

	public final AnalFunctionsContext analFunctions() throws RecognitionException {
		AnalFunctionsContext _localctx = new AnalFunctionsContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_analFunctions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			exeFunction();
			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1275);
				match(COMMA);
				setState(1276);
				exeFunction();
				}
				}
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExeFunctionContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public FriedmanFunctionContext friedmanFunction() {
			return getRuleContext(FriedmanFunctionContext.class,0);
		}
		public PearsonFunctionContext pearsonFunction() {
			return getRuleContext(PearsonFunctionContext.class,0);
		}
		public ExeFunctionTypesContext exeFunctionTypes() {
			return getRuleContext(ExeFunctionTypesContext.class,0);
		}
		public ExeArgumentsContext exeArguments() {
			return getRuleContext(ExeArgumentsContext.class,0);
		}
		public ExeFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exeFunction; }
	}

	public final ExeFunctionContext exeFunction() throws RecognitionException {
		ExeFunctionContext _localctx = new ExeFunctionContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_exeFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (MEAN - 87)) | (1L << (MODE - 87)) | (1L << (MEDIAN - 87)) | (1L << (STDDEV - 87)) | (1L << (VARIANCE - 87)) | (1L << (IQR - 87)) | (1L << (RANGE - 87)) | (1L << (RANKING - 87)) | (1L << (CONFIDENCE_INTERVAL - 87)) | (1L << (PEARSON - 87)) | (1L << (BIVARIATE_REGRESSION - 87)) | (1L << (SPEARMAN - 87)) | (1L << (KENDALL - 87)) | (1L << (CRAMER - 87)) | (1L << (LOG_LINEAR - 87)) | (1L << (KOLMOGOROV_SMIRNOV - 87)) | (1L << (LILLIEFORS - 87)) | (1L << (SHAPIRO_WILK - 87)) | (1L << (LEVENE - 87)) | (1L << (T_STUDENT - 87)) | (1L << (WILCOXON - 87)) | (1L << (MCNEMAR - 87)) | (1L << (ANOVA - 87)) | (1L << (FACTANOVAWRS - 87)) | (1L << (FRIEDMAN - 87)) | (1L << (ALIGNED_FRIEDMAN - 87)) | (1L << (IMAN_DAVEPORT - 87)) | (1L << (QUADE - 87)) | (1L << (COCHRAN_Q - 87)) | (1L << (BONFERRONI_DUNN - 87)) | (1L << (HOLMS - 87)) | (1L << (HOCHBERG - 87)) | (1L << (HOMMEL - 87)) | (1L << (HOLLAND - 87)) | (1L << (ROM - 87)) | (1L << (FINNER - 87)) | (1L << (LI - 87)) | (1L << (SHAFFER - 87)) | (1L << (NAMENYI - 87)) | (1L << (TTEST - 87)) | (1L << (SIGN_TEST - 87)) | (1L << (CHI_SQUARE - 87)) | (1L << (KRUSKAL - 87)) | (1L << (FISHER - 87)) | (1L << (TUKEY - 87)))) != 0)) {
				{
				setState(1282);
				exeFunctionTypes();
				}
			}

			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1285);
				exeArguments();
				}
			}

			setState(1288);
			match(COLON);
			setState(1292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BooleanLiteral:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case StringLiteral:
				{
				setState(1289);
				values();
				}
				break;
			case PVALUE:
				{
				setState(1290);
				friedmanFunction();
				}
				break;
			case OPEN_BRA:
				{
				setState(1291);
				pearsonFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			value();
			setState(1298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (BooleanLiteral - 162)) | (1L << (IntegerLiteral - 162)) | (1L << (FloatingPointLiteral - 162)) | (1L << (StringLiteral - 162)))) != 0)) {
				{
				{
				setState(1295);
				value();
				}
				}
				setState(1300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExeFunctionTypesContext extends ParserRuleContext {
		public VmFunctionContext vmFunction() {
			return getRuleContext(VmFunctionContext.class,0);
		}
		public CtmFunctionContext ctmFunction() {
			return getRuleContext(CtmFunctionContext.class,0);
		}
		public NhstFunctionContext nhstFunction() {
			return getRuleContext(NhstFunctionContext.class,0);
		}
		public CcFunctionContext ccFunction() {
			return getRuleContext(CcFunctionContext.class,0);
		}
		public CiFunctionContext ciFunction() {
			return getRuleContext(CiFunctionContext.class,0);
		}
		public RFunctionContext rFunction() {
			return getRuleContext(RFunctionContext.class,0);
		}
		public ExeFunctionTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exeFunctionTypes; }
	}

	public final ExeFunctionTypesContext exeFunctionTypes() throws RecognitionException {
		ExeFunctionTypesContext _localctx = new ExeFunctionTypesContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_exeFunctionTypes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STDDEV:
			case VARIANCE:
			case IQR:
			case RANGE:
				{
				setState(1301);
				vmFunction();
				}
				break;
			case MEAN:
			case MODE:
			case MEDIAN:
				{
				setState(1302);
				ctmFunction();
				}
				break;
			case KOLMOGOROV_SMIRNOV:
			case LILLIEFORS:
			case SHAPIRO_WILK:
			case LEVENE:
			case T_STUDENT:
			case WILCOXON:
			case MCNEMAR:
			case ANOVA:
			case FACTANOVAWRS:
			case FRIEDMAN:
			case ALIGNED_FRIEDMAN:
			case IMAN_DAVEPORT:
			case QUADE:
			case COCHRAN_Q:
			case BONFERRONI_DUNN:
			case HOLMS:
			case HOCHBERG:
			case HOMMEL:
			case HOLLAND:
			case ROM:
			case FINNER:
			case LI:
			case SHAFFER:
			case NAMENYI:
			case TTEST:
			case SIGN_TEST:
			case CHI_SQUARE:
			case KRUSKAL:
			case FISHER:
			case TUKEY:
				{
				setState(1303);
				nhstFunction();
				}
				break;
			case PEARSON:
			case BIVARIATE_REGRESSION:
			case SPEARMAN:
			case KENDALL:
			case CRAMER:
			case LOG_LINEAR:
				{
				setState(1304);
				ccFunction();
				}
				break;
			case CONFIDENCE_INTERVAL:
				{
				setState(1305);
				ciFunction();
				}
				break;
			case RANKING:
				{
				setState(1306);
				rFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExeDescriptionContext extends ParserRuleContext {
		public TerminalNode DESCRIPTION() { return getToken(SEDL4PeopleParser.DESCRIPTION, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public TerminalNode StringLiteral() { return getToken(SEDL4PeopleParser.StringLiteral, 0); }
		public ExeDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exeDescription; }
	}

	public final ExeDescriptionContext exeDescription() throws RecognitionException {
		ExeDescriptionContext _localctx = new ExeDescriptionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_exeDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			match(DESCRIPTION);
			setState(1310);
			match(COLON);
			setState(1311);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExeArgumentsContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SEDL4PeopleParser.OPEN_PAR, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SEDL4PeopleParser.CLOSE_PAR, 0); }
		public TerminalNode BAR() { return getToken(SEDL4PeopleParser.BAR, 0); }
		public TerminalNode VS() { return getToken(SEDL4PeopleParser.VS, 0); }
		public TerminalNode COMMA() { return getToken(SEDL4PeopleParser.COMMA, 0); }
		public OtherParamContext otherParam() {
			return getRuleContext(OtherParamContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(SEDL4PeopleParser.PLUS, 0); }
		public ExeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exeArguments; }
	}

	public final ExeArgumentsContext exeArguments() throws RecognitionException {
		ExeArgumentsContext _localctx = new ExeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_exeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1313);
			match(OPEN_PAR);
			setState(1314);
			arg();
			setState(1317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BAR) {
				{
				setState(1315);
				match(BAR);
				setState(1316);
				arg();
				}
			}

			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VS) {
				{
				setState(1319);
				match(VS);
				setState(1320);
				arg();
				}
			}

			setState(1325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1323);
				match(COMMA);
				setState(1324);
				otherParam();
				}
			}

			setState(1329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS) {
				{
				setState(1327);
				match(PLUS);
				setState(1328);
				arg();
				}
			}

			setState(1331);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherParamContext extends ParserRuleContext {
		public TerminalNode OPEN_BRA() { return getToken(SEDL4PeopleParser.OPEN_BRA, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(SEDL4PeopleParser.CLOSE_BRA, 0); }
		public OtherParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherParam; }
	}

	public final OtherParamContext otherParam() throws RecognitionException {
		OtherParamContext _localctx = new OtherParamContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_otherParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			match(OPEN_BRA);
			setState(1334);
			arg();
			setState(1335);
			match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExeValuationContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(SEDL4PeopleParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SEDL4PeopleParser.COLON, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> PVALUE() { return getTokens(SEDL4PeopleParser.PVALUE); }
		public TerminalNode PVALUE(int i) {
			return getToken(SEDL4PeopleParser.PVALUE, i);
		}
		public List<TerminalNode> STHRESHOLD() { return getTokens(SEDL4PeopleParser.STHRESHOLD); }
		public TerminalNode STHRESHOLD(int i) {
			return getToken(SEDL4PeopleParser.STHRESHOLD, i);
		}
		public ExeValuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exeValuation; }
	}

	public final ExeValuationContext exeValuation() throws RecognitionException {
		ExeValuationContext _localctx = new ExeValuationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_exeValuation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1339);
			_la = _input.LA(1);
			if ( !(_la==PVALUE || _la==STHRESHOLD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1340);
			match(COLON);
			setState(1341);
			value();
			setState(1347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PVALUE || _la==STHRESHOLD) {
				{
				{
				setState(1342);
				_la = _input.LA(1);
				if ( !(_la==PVALUE || _la==STHRESHOLD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1343);
				match(COLON);
				setState(1344);
				value();
				}
				}
				setState(1349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileExecContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(SEDL4PeopleParser.FILE, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public TerminalNode StringLiteral() { return getToken(SEDL4PeopleParser.StringLiteral, 0); }
		public FileExecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileExec; }
	}

	public final FileExecContext fileExec() throws RecognitionException {
		FileExecContext _localctx = new FileExecContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_fileExec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			match(FILE);
			setState(1351);
			match(COLON);
			setState(1352);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Freedom_degreesContext extends ParserRuleContext {
		public TerminalNode FREEDOM_DEGREES() { return getToken(SEDL4PeopleParser.FREEDOM_DEGREES, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Freedom_degreesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freedom_degrees; }
	}

	public final Freedom_degreesContext freedom_degrees() throws RecognitionException {
		Freedom_degreesContext _localctx = new Freedom_degreesContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_freedom_degrees);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			match(FREEDOM_DEGREES);
			setState(1355);
			match(COLON);
			setState(1356);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FdParamContext extends ParserRuleContext {
		public TerminalNode OPEN_BRA() { return getToken(SEDL4PeopleParser.OPEN_BRA, 0); }
		public ExeArgumentsContext exeArguments() {
			return getRuleContext(ExeArgumentsContext.class,0);
		}
		public ExeValuationContext exeValuation() {
			return getRuleContext(ExeValuationContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(SEDL4PeopleParser.CLOSE_BRA, 0); }
		public FdParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fdParam; }
	}

	public final FdParamContext fdParam() throws RecognitionException {
		FdParamContext _localctx = new FdParamContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_fdParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			match(OPEN_BRA);
			setState(1359);
			exeArguments();
			setState(1360);
			exeValuation();
			setState(1361);
			match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyTempDiffContext extends ParserRuleContext {
		public TerminalNode OPEN_BRA() { return getToken(SEDL4PeopleParser.OPEN_BRA, 0); }
		public PairIVContext pairIV() {
			return getRuleContext(PairIVContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(SEDL4PeopleParser.CLOSE_BRA, 0); }
		public BodyTempDiffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyTempDiff; }
	}

	public final BodyTempDiffContext bodyTempDiff() throws RecognitionException {
		BodyTempDiffContext _localctx = new BodyTempDiffContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_bodyTempDiff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			match(OPEN_BRA);
			setState(1364);
			pairIV();
			setState(1365);
			match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairIVContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(SEDL4PeopleParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SEDL4PeopleParser.COLON, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<NumericSetContext> numericSet() {
			return getRuleContexts(NumericSetContext.class);
		}
		public NumericSetContext numericSet(int i) {
			return getRuleContext(NumericSetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public PairIVContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairIV; }
	}

	public final PairIVContext pairIV() throws RecognitionException {
		PairIVContext _localctx = new PairIVContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_pairIV);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(1367);
				id();
				}
				break;
			case N:
			case Z:
			case Q:
			case R:
			case I:
			case C:
				{
				setState(1368);
				numericSet();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1371);
			match(COLON);
			setState(1372);
			value();
			setState(1383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1373);
				match(COMMA);
				setState(1376);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(1374);
					id();
					}
					break;
				case N:
				case Z:
				case Q:
				case R:
				case I:
				case C:
					{
					setState(1375);
					numericSet();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1378);
				match(COLON);
				setState(1379);
				value();
				}
				}
				setState(1385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1386);
				value();
				}
				}
				setState(1389); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (BooleanLiteral - 162)) | (1L << (IntegerLiteral - 162)) | (1L << (FloatingPointLiteral - 162)) | (1L << (StringLiteral - 162)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FriedmanFunctionContext extends ParserRuleContext {
		public TerminalNode PVALUE() { return getToken(SEDL4PeopleParser.PVALUE, 0); }
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public ExeDescriptionContext exeDescription() {
			return getRuleContext(ExeDescriptionContext.class,0);
		}
		public Freedom_degreesContext freedom_degrees() {
			return getRuleContext(Freedom_degreesContext.class,0);
		}
		public List<FdParamContext> fdParam() {
			return getRuleContexts(FdParamContext.class);
		}
		public FdParamContext fdParam(int i) {
			return getRuleContext(FdParamContext.class,i);
		}
		public FriedmanFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_friedmanFunction; }
	}

	public final FriedmanFunctionContext friedmanFunction() throws RecognitionException {
		FriedmanFunctionContext _localctx = new FriedmanFunctionContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_friedmanFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			match(PVALUE);
			setState(1392);
			match(COLON);
			setState(1393);
			value();
			setState(1396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1394);
				match(COMMA);
				setState(1395);
				exeDescription();
				}
				break;
			}
			setState(1400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1398);
				match(COMMA);
				setState(1399);
				freedom_degrees();
				}
				break;
			}
			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRA) {
				{
				setState(1402);
				fdParam();
				{
				setState(1403);
				match(COMMA);
				setState(1404);
				fdParam();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PearsonFunctionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRA() { return getToken(SEDL4PeopleParser.OPEN_BRA, 0); }
		public NumericSetContext numericSet() {
			return getRuleContext(NumericSetContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(SEDL4PeopleParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SEDL4PeopleParser.COLON, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public RegresionBlockContext regresionBlock() {
			return getRuleContext(RegresionBlockContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(SEDL4PeopleParser.CLOSE_BRA, 0); }
		public PearsonFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pearsonFunction; }
	}

	public final PearsonFunctionContext pearsonFunction() throws RecognitionException {
		PearsonFunctionContext _localctx = new PearsonFunctionContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_pearsonFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			match(OPEN_BRA);
			setState(1409);
			numericSet();
			setState(1410);
			match(COLON);
			setState(1411);
			value();
			setState(1412);
			match(COMMA);
			setState(1413);
			arg();
			setState(1414);
			match(COLON);
			setState(1415);
			value();
			setState(1416);
			match(COMMA);
			setState(1417);
			regresionBlock();
			setState(1418);
			match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegresionBlockContext extends ParserRuleContext {
		public RegresionContext regresion() {
			return getRuleContext(RegresionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public RegresionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regresionBlock; }
	}

	public final RegresionBlockContext regresionBlock() throws RecognitionException {
		RegresionBlockContext _localctx = new RegresionBlockContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_regresionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			regresion();
			setState(1421);
			match(COLON);
			setState(1422);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegresionContext extends ParserRuleContext {
		public TerminalNode RRES() { return getToken(SEDL4PeopleParser.RRES, 0); }
		public RegresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regresion; }
	}

	public final RegresionContext regresion() throws RecognitionException {
		RegresionContext _localctx = new RegresionContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_regresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			match(RRES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SEDL4PeopleParser.Identifier, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmailContext extends ParserRuleContext {
		public TerminalNode Email() { return getToken(SEDL4PeopleParser.Email, 0); }
		public EmailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_email; }
	}

	public final EmailContext email() throws RecognitionException {
		EmailContext _localctx = new EmailContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_email);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			match(Email);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionNumberContext extends ParserRuleContext {
		public TerminalNode FloatingPointLiteral() { return getToken(SEDL4PeopleParser.FloatingPointLiteral, 0); }
		public TerminalNode ExplicitVersionNumber() { return getToken(SEDL4PeopleParser.ExplicitVersionNumber, 0); }
		public VersionNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionNumber; }
	}

	public final VersionNumberContext versionNumber() throws RecognitionException {
		VersionNumberContext _localctx = new VersionNumberContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_versionNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			_la = _input.LA(1);
			if ( !(_la==ExplicitVersionNumber || _la==FloatingPointLiteral) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UrlContext extends ParserRuleContext {
		public TerminalNode Url() { return getToken(SEDL4PeopleParser.Url, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
			match(Url);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepUrlContext extends ParserRuleContext {
		public TerminalNode Url() { return getToken(SEDL4PeopleParser.Url, 0); }
		public RepUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repUrl; }
	}

	public final RepUrlContext repUrl() throws RecognitionException {
		RepUrlContext _localctx = new RepUrlContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_repUrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			match(Url);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode FloatingPointLiteral() { return getToken(SEDL4PeopleParser.FloatingPointLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(SEDL4PeopleParser.IntegerLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(SEDL4PeopleParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SEDL4PeopleParser.StringLiteral, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
			_la = _input.LA(1);
			if ( !(((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (BooleanLiteral - 162)) | (1L << (IntegerLiteral - 162)) | (1L << (FloatingPointLiteral - 162)) | (1L << (StringLiteral - 162)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(SEDL4PeopleParser.FLOAT, 0); }
		public TerminalNode INTEGER() { return getToken(SEDL4PeopleParser.INTEGER, 0); }
		public TerminalNode BOOL() { return getToken(SEDL4PeopleParser.BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1438);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOAT) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructValueContext extends ParserRuleContext {
		public TerminalNode OPEN_BRA() { return getToken(SEDL4PeopleParser.OPEN_BRA, 0); }
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(SEDL4PeopleParser.CLOSE_BRA, 0); }
		public StructValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structValue; }
	}

	public final StructValueContext structValue() throws RecognitionException {
		StructValueContext _localctx = new StructValueContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_structValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
			match(OPEN_BRA);
			setState(1441);
			fields();
			setState(1442);
			match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldsContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SEDL4PeopleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SEDL4PeopleParser.COMMA, i);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			field();
			setState(1449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1445);
				match(COMMA);
				setState(1446);
				field();
				}
				}
				setState(1451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SEDL4PeopleParser.COLON, 0); }
		public StructValueContext structValue() {
			return getRuleContext(StructValueContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			id();
			setState(1453);
			match(COLON);
			setState(1456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRA:
				{
				setState(1454);
				structValue();
				}
				break;
			case BooleanLiteral:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case StringLiteral:
				{
				setState(1455);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericSetContext extends ParserRuleContext {
		public TerminalNode N() { return getToken(SEDL4PeopleParser.N, 0); }
		public TerminalNode Z() { return getToken(SEDL4PeopleParser.Z, 0); }
		public TerminalNode Q() { return getToken(SEDL4PeopleParser.Q, 0); }
		public TerminalNode R() { return getToken(SEDL4PeopleParser.R, 0); }
		public TerminalNode I() { return getToken(SEDL4PeopleParser.I, 0); }
		public TerminalNode C() { return getToken(SEDL4PeopleParser.C, 0); }
		public NumericSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericSet; }
	}

	public final NumericSetContext numericSet() throws RecognitionException {
		NumericSetContext _localctx = new NumericSetContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_numericSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (N - 79)) | (1L << (Z - 79)) | (1L << (Q - 79)) | (1L << (R - 79)) | (1L << (I - 79)) | (1L << (C - 79)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionPointContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SEDL4PeopleParser.Identifier, 0); }
		public TerminalNode EXTENSION_POINT_CONTENT() { return getToken(SEDL4PeopleParser.EXTENSION_POINT_CONTENT, 0); }
		public ExtensionPointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionPoint; }
	}

	public final ExtensionPointContext extensionPoint() throws RecognitionException {
		ExtensionPointContext _localctx = new ExtensionPointContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_extensionPoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
			match(Identifier);
			setState(1461);
			match(EXTENSION_POINT_CONTENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b1\u05ba\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\3\2\3\2\3\2\5\2\u0152"+
		"\n\2\3\2\3\2\3\2\3\2\5\2\u0158\n\2\3\2\3\2\3\3\7\3\u015d\n\3\f\3\16\3"+
		"\u0160\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u016c\n\5\3\5"+
		"\3\5\3\5\5\5\u0171\n\5\3\5\3\5\3\5\5\5\u0176\n\5\3\5\3\5\3\6\3\6\3\7\5"+
		"\7\u017d\n\7\3\7\5\7\u0180\n\7\3\7\5\7\u0183\n\7\3\7\5\7\u0186\n\7\3\7"+
		"\5\7\u0189\n\7\3\7\5\7\u018c\n\7\3\7\5\7\u018f\n\7\3\b\3\b\3\b\6\b\u0194"+
		"\n\b\r\b\16\b\u0195\3\t\3\t\3\t\6\t\u019b\n\t\r\t\16\t\u019c\3\n\3\n\3"+
		"\n\6\n\u01a2\n\n\r\n\16\n\u01a3\3\13\3\13\3\13\7\13\u01a9\n\13\f\13\16"+
		"\13\u01ac\13\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u01b4\n\f\f\f\16\f\u01b7"+
		"\13\f\3\f\3\f\3\r\3\r\3\r\6\r\u01be\n\r\r\r\16\r\u01bf\3\16\6\16\u01c3"+
		"\n\16\r\16\16\16\u01c4\3\16\3\16\3\16\3\16\5\16\u01cb\n\16\3\16\3\16\5"+
		"\16\u01cf\n\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\6\24\u01e4\n\24\r\24\16\24\u01e5"+
		"\3\25\3\25\5\25\u01ea\n\25\3\26\3\26\3\26\3\26\3\26\3\27\5\27\u01f2\n"+
		"\27\3\27\5\27\u01f5\n\27\3\27\5\27\u01f8\n\27\3\27\5\27\u01fb\n\27\3\30"+
		"\3\30\3\30\6\30\u0200\n\30\r\30\16\30\u0201\3\31\3\31\3\31\6\31\u0207"+
		"\n\31\r\31\16\31\u0208\3\32\3\32\3\32\6\32\u020e\n\32\r\32\16\32\u020f"+
		"\3\33\3\33\3\34\3\34\3\34\6\34\u0217\n\34\r\34\16\34\u0218\3\35\6\35\u021c"+
		"\n\35\r\35\16\35\u021d\3\36\3\36\3\36\5\36\u0223\n\36\3\36\5\36\u0226"+
		"\n\36\3\37\3\37\3\37\3\37\3 \5 \u022d\n \3 \3 \3 \3 \3 \5 \u0234\n \3"+
		"!\3!\3!\6!\u0239\n!\r!\16!\u023a\3!\3!\3!\6!\u0240\n!\r!\16!\u0241\3!"+
		"\3!\3!\6!\u0247\n!\r!\16!\u0248\3!\3!\3!\6!\u024e\n!\r!\16!\u024f\5!\u0252"+
		"\n!\3\"\3\"\3\"\5\"\u0257\n\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\5#\u0266\n#\3$\3$\3%\3%\3%\6%\u026d\n%\r%\16%\u026e\3&\3&\3&\5&\u0274"+
		"\n&\3&\3&\3&\5&\u0279\n&\3\'\3\'\5\'\u027d\n\'\3(\3(\3(\5(\u0282\n(\3"+
		"(\3(\3(\3)\3)\3*\3*\3+\3+\3+\7+\u028e\n+\f+\16+\u0291\13+\3+\3+\5+\u0295"+
		"\n+\3,\3,\3-\3-\5-\u029b\n-\3.\3.\3/\3/\3/\5/\u02a2\n/\3/\3/\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\5\63\u02b2\n\63\3\64\3\64"+
		"\5\64\u02b6\n\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u02c0\n"+
		"\65\3\65\5\65\u02c3\n\65\3\66\3\66\3\66\5\66\u02c8\n\66\3\67\3\67\3\67"+
		"\3\67\5\67\u02ce\n\67\38\38\38\38\38\78\u02d5\n8\f8\168\u02d8\138\39\3"+
		"9\39\39\59\u02de\n9\39\59\u02e1\n9\3:\3:\3:\3:\3;\3;\3;\5;\u02ea\n;\3"+
		"<\3<\3<\3<\7<\u02f0\n<\f<\16<\u02f3\13<\3<\3<\3=\3=\3=\3=\3=\3=\7=\u02fd"+
		"\n=\f=\16=\u0300\13=\3>\3>\3>\3?\3?\3?\3?\5?\u0309\n?\3@\6@\u030c\n@\r"+
		"@\16@\u030d\3A\3A\5A\u0312\nA\3B\3B\3B\3B\3B\7B\u0319\nB\fB\16B\u031c"+
		"\13B\5B\u031e\nB\3B\5B\u0321\nB\3B\3B\3C\3C\3C\3C\7C\u0329\nC\fC\16C\u032c"+
		"\13C\3C\3C\3D\3D\3D\3D\3E\6E\u0335\nE\rE\16E\u0336\3F\3F\3F\6F\u033c\n"+
		"F\rF\16F\u033d\3G\3G\3G\3G\3G\3G\3G\5G\u0347\nG\3H\3H\3H\3H\5H\u034d\n"+
		"H\3H\3H\3H\3H\3I\3I\3J\3J\3J\3J\3J\7J\u035a\nJ\fJ\16J\u035d\13J\3J\3J"+
		"\3K\3K\3L\3L\3L\3L\3L\7L\u0368\nL\fL\16L\u036b\13L\3L\3L\3M\3M\3N\3N\3"+
		"N\3N\3N\3O\3O\3P\3P\3P\3P\3P\7P\u037d\nP\fP\16P\u0380\13P\3P\3P\3Q\3Q"+
		"\3R\3R\3R\3R\3R\3R\3R\3S\3S\3T\3T\3T\3T\5T\u0393\nT\3U\5U\u0396\nU\3U"+
		"\3U\7U\u039a\nU\fU\16U\u039d\13U\3V\3V\3V\5V\u03a2\nV\3W\3W\3X\3X\5X\u03a8"+
		"\nX\3Y\3Y\3Y\5Y\u03ad\nY\3Y\3Y\5Y\u03b1\nY\3Y\3Y\3Y\5Y\u03b6\nY\5Y\u03b8"+
		"\nY\3Z\5Z\u03bb\nZ\3Z\5Z\u03be\nZ\3Z\5Z\u03c1\nZ\3[\3[\3[\3[\7[\u03c7"+
		"\n[\f[\16[\u03ca\13[\3\\\3\\\3\\\3]\3]\3]\3]\7]\u03d3\n]\f]\16]\u03d6"+
		"\13]\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3_\7_\u03e3\n_\f_\16_\u03e6\13_\3_"+
		"\3_\3_\3`\3`\3`\3`\3`\7`\u03f0\n`\f`\16`\u03f3\13`\3`\3`\3a\3a\3a\6a\u03fa"+
		"\na\ra\16a\u03fb\3b\3b\3b\3b\3c\5c\u0403\nc\3c\5c\u0406\nc\3c\5c\u0409"+
		"\nc\3c\3c\5c\u040d\nc\3d\3d\3d\3d\3d\7d\u0414\nd\fd\16d\u0417\13d\3e\3"+
		"e\3e\3e\3e\7e\u041e\ne\fe\16e\u0421\13e\3f\3f\5f\u0425\nf\3f\5f\u0428"+
		"\nf\3f\5f\u042b\nf\3g\3g\3g\3h\3h\3h\3h\3i\3i\3i\3i\3j\3j\3j\3j\3k\3k"+
		"\3k\5k\u043f\nk\3k\5k\u0442\nk\3l\3l\3l\3l\3l\7l\u0449\nl\fl\16l\u044c"+
		"\13l\3m\3m\3m\3n\3n\3n\3n\3n\7n\u0456\nn\fn\16n\u0459\13n\3o\3o\3o\3p"+
		"\3p\3p\3p\5p\u0462\np\3q\7q\u0465\nq\fq\16q\u0468\13q\3r\3r\3r\3r\3s\3"+
		"s\3s\5s\u0471\ns\3s\3s\3s\3s\7s\u0477\ns\fs\16s\u047a\13s\3s\3s\5s\u047e"+
		"\ns\3t\3t\3t\3t\3t\5t\u0485\nt\3u\3u\3v\3v\3w\3w\3x\5x\u048e\nx\3x\3x"+
		"\3y\5y\u0493\ny\3y\3y\3z\3z\3{\5{\u049a\n{\3{\3{\5{\u049e\n{\3|\3|\3|"+
		"\7|\u04a3\n|\f|\16|\u04a6\13|\3}\3}\3}\3}\3}\7}\u04ad\n}\f}\16}\u04b0"+
		"\13}\3}\3}\5}\u04b4\n}\3~\3~\3~\7~\u04b9\n~\f~\16~\u04bc\13~\3\177\3\177"+
		"\3\177\7\177\u04c1\n\177\f\177\16\177\u04c4\13\177\3\u0080\3\u0080\3\u0080"+
		"\6\u0080\u04c9\n\u0080\r\u0080\16\u0080\u04ca\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0082\5\u0082\u04d2\n\u0082\3\u0082\5\u0082\u04d5\n\u0082\3"+
		"\u0082\5\u0082\u04d8\n\u0082\3\u0082\3\u0082\5\u0082\u04dc\n\u0082\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\7\u0086\u04ed\n\u0086\f\u0086"+
		"\16\u0086\u04f0\13\u0086\3\u0087\3\u0087\3\u0087\6\u0087\u04f5\n\u0087"+
		"\r\u0087\16\u0087\u04f6\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089"+
		"\3\u0089\7\u0089\u0500\n\u0089\f\u0089\16\u0089\u0503\13\u0089\3\u008a"+
		"\5\u008a\u0506\n\u008a\3\u008a\5\u008a\u0509\n\u008a\3\u008a\3\u008a\3"+
		"\u008a\3\u008a\5\u008a\u050f\n\u008a\3\u008b\3\u008b\7\u008b\u0513\n\u008b"+
		"\f\u008b\16\u008b\u0516\13\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\5\u008c\u051e\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\5\u008e\u0528\n\u008e\3\u008e\3\u008e\5\u008e"+
		"\u052c\n\u008e\3\u008e\3\u008e\5\u008e\u0530\n\u008e\3\u008e\3\u008e\5"+
		"\u008e\u0534\n\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3"+
		"\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091"+
		"\u0544\n\u0091\f\u0091\16\u0091\u0547\13\u0091\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\5\u0096\u055c"+
		"\n\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u0563\n\u0096"+
		"\3\u0096\3\u0096\3\u0096\7\u0096\u0568\n\u0096\f\u0096\16\u0096\u056b"+
		"\13\u0096\3\u0097\6\u0097\u056e\n\u0097\r\u0097\16\u0097\u056f\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u0577\n\u0098\3\u0098\3\u0098"+
		"\5\u0098\u057b\n\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u0581\n"+
		"\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009b"+
		"\3\u009b\3\u009c\3\u009c\3\u009d\3\u009d\3\u009e\3\u009e\3\u009f\3\u009f"+
		"\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a4\3\u00a4\3\u00a4\7\u00a4\u05aa\n\u00a4\f\u00a4\16\u00a4"+
		"\u05ad\13\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u05b3\n\u00a5"+
		"\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\2\2\u00a8\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\2\17\3\2"+
		"\20\21\4\2\u00a5\u00a5\u00a7\u00a7\3\2\u009d\u009e\3\2Y[\3\2\\_\3\2bg"+
		"\3\2h\u0085\3\2\u008a\u008c\4\2GGII\3\2\u00a6\u00a7\5\2\u00a4\u00a5\u00a7"+
		"\u00a7\u00a9\u00a9\3\2\33\35\3\2QV\2\u05bf\2\u014e\3\2\2\2\4\u015e\3\2"+
		"\2\2\6\u0161\3\2\2\2\b\u0165\3\2\2\2\n\u0179\3\2\2\2\f\u017c\3\2\2\2\16"+
		"\u0190\3\2\2\2\20\u0197\3\2\2\2\22\u019e\3\2\2\2\24\u01a5\3\2\2\2\26\u01af"+
		"\3\2\2\2\30\u01ba\3\2\2\2\32\u01c2\3\2\2\2\34\u01d0\3\2\2\2\36\u01d3\3"+
		"\2\2\2 \u01d5\3\2\2\2\"\u01d9\3\2\2\2$\u01dd\3\2\2\2&\u01e3\3\2\2\2(\u01e7"+
		"\3\2\2\2*\u01eb\3\2\2\2,\u01f1\3\2\2\2.\u01fc\3\2\2\2\60\u0203\3\2\2\2"+
		"\62\u020a\3\2\2\2\64\u0211\3\2\2\2\66\u0213\3\2\2\28\u021b\3\2\2\2:\u021f"+
		"\3\2\2\2<\u0227\3\2\2\2>\u0233\3\2\2\2@\u0251\3\2\2\2B\u0253\3\2\2\2D"+
		"\u0265\3\2\2\2F\u0267\3\2\2\2H\u0269\3\2\2\2J\u0278\3\2\2\2L\u027c\3\2"+
		"\2\2N\u027e\3\2\2\2P\u0286\3\2\2\2R\u0288\3\2\2\2T\u028a\3\2\2\2V\u0296"+
		"\3\2\2\2X\u029a\3\2\2\2Z\u029c\3\2\2\2\\\u029e\3\2\2\2^\u02a7\3\2\2\2"+
		"`\u02a9\3\2\2\2b\u02ab\3\2\2\2d\u02b1\3\2\2\2f\u02b3\3\2\2\2h\u02bb\3"+
		"\2\2\2j\u02c7\3\2\2\2l\u02c9\3\2\2\2n\u02cf\3\2\2\2p\u02d9\3\2\2\2r\u02e2"+
		"\3\2\2\2t\u02e9\3\2\2\2v\u02eb\3\2\2\2x\u02f6\3\2\2\2z\u0301\3\2\2\2|"+
		"\u0304\3\2\2\2~\u030b\3\2\2\2\u0080\u0311\3\2\2\2\u0082\u0313\3\2\2\2"+
		"\u0084\u0324\3\2\2\2\u0086\u032f\3\2\2\2\u0088\u0334\3\2\2\2\u008a\u0338"+
		"\3\2\2\2\u008c\u0346\3\2\2\2\u008e\u0348\3\2\2\2\u0090\u0352\3\2\2\2\u0092"+
		"\u0354\3\2\2\2\u0094\u0360\3\2\2\2\u0096\u0362\3\2\2\2\u0098\u036e\3\2"+
		"\2\2\u009a\u0370\3\2\2\2\u009c\u0375\3\2\2\2\u009e\u0377\3\2\2\2\u00a0"+
		"\u0383\3\2\2\2\u00a2\u0385\3\2\2\2\u00a4\u038c\3\2\2\2\u00a6\u0392\3\2"+
		"\2\2\u00a8\u0395\3\2\2\2\u00aa\u039e\3\2\2\2\u00ac\u03a3\3\2\2\2\u00ae"+
		"\u03a7\3\2\2\2\u00b0\u03b7\3\2\2\2\u00b2\u03ba\3\2\2\2\u00b4\u03c2\3\2"+
		"\2\2\u00b6\u03cb\3\2\2\2\u00b8\u03ce\3\2\2\2\u00ba\u03d7\3\2\2\2\u00bc"+
		"\u03dc\3\2\2\2\u00be\u03ea\3\2\2\2\u00c0\u03f6\3\2\2\2\u00c2\u03fd\3\2"+
		"\2\2\u00c4\u0402\3\2\2\2\u00c6\u040e\3\2\2\2\u00c8\u0418\3\2\2\2\u00ca"+
		"\u0422\3\2\2\2\u00cc\u042c\3\2\2\2\u00ce\u042f\3\2\2\2\u00d0\u0433\3\2"+
		"\2\2\u00d2\u0437\3\2\2\2\u00d4\u043b\3\2\2\2\u00d6\u0443\3\2\2\2\u00d8"+
		"\u044d\3\2\2\2\u00da\u0450\3\2\2\2\u00dc\u045a\3\2\2\2\u00de\u045d\3\2"+
		"\2\2\u00e0\u0466\3\2\2\2\u00e2\u0469\3\2\2\2\u00e4\u046d\3\2\2\2\u00e6"+
		"\u0484\3\2\2\2\u00e8\u0486\3\2\2\2\u00ea\u0488\3\2\2\2\u00ec\u048a\3\2"+
		"\2\2\u00ee\u048d\3\2\2\2\u00f0\u0492\3\2\2\2\u00f2\u0496\3\2\2\2\u00f4"+
		"\u0499\3\2\2\2\u00f6\u049f\3\2\2\2\u00f8\u04a7\3\2\2\2\u00fa\u04b5\3\2"+
		"\2\2\u00fc\u04bd\3\2\2\2\u00fe\u04c5\3\2\2\2\u0100\u04cc\3\2\2\2\u0102"+
		"\u04d1\3\2\2\2\u0104\u04dd\3\2\2\2\u0106\u04e1\3\2\2\2\u0108\u04e5\3\2"+
		"\2\2\u010a\u04e9\3\2\2\2\u010c\u04f1\3\2\2\2\u010e\u04f8\3\2\2\2\u0110"+
		"\u04fc\3\2\2\2\u0112\u0505\3\2\2\2\u0114\u0510\3\2\2\2\u0116\u051d\3\2"+
		"\2\2\u0118\u051f\3\2\2\2\u011a\u0523\3\2\2\2\u011c\u0537\3\2\2\2\u011e"+
		"\u053b\3\2\2\2\u0120\u053d\3\2\2\2\u0122\u0548\3\2\2\2\u0124\u054c\3\2"+
		"\2\2\u0126\u0550\3\2\2\2\u0128\u0555\3\2\2\2\u012a\u055b\3\2\2\2\u012c"+
		"\u056d\3\2\2\2\u012e\u0571\3\2\2\2\u0130\u0582\3\2\2\2\u0132\u058e\3\2"+
		"\2\2\u0134\u0592\3\2\2\2\u0136\u0594\3\2\2\2\u0138\u0596\3\2\2\2\u013a"+
		"\u0598\3\2\2\2\u013c\u059a\3\2\2\2\u013e\u059c\3\2\2\2\u0140\u059e\3\2"+
		"\2\2\u0142\u05a0\3\2\2\2\u0144\u05a2\3\2\2\2\u0146\u05a6\3\2\2\2\u0148"+
		"\u05ae\3\2\2\2\u014a\u05b4\3\2\2\2\u014c\u05b6\3\2\2\2\u014e\u014f\5\4"+
		"\3\2\u014f\u0151\5\b\5\2\u0150\u0152\5$\23\2\u0151\u0150\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\5*\26\2\u0154\u0155\5H"+
		"%\2\u0155\u0157\5b\62\2\u0156\u0158\5\u00c0a\2\u0157\u0156\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\7\2\2\3\u015a\3\3\2\2\2"+
		"\u015b\u015d\5\6\4\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\5\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0162\7\4\2\2\u0162\u0163\7\u00a3\2\2\u0163\u0164\b\4\1\2\u0164\7\3\2"+
		"\2\2\u0165\u0166\7\5\2\2\u0166\u0167\7\u00ad\2\2\u0167\u016b\5\u0136\u009c"+
		"\2\u0168\u0169\7\7\2\2\u0169\u016a\7\u00ad\2\2\u016a\u016c\5\u013a\u009e"+
		"\2\u016b\u0168\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u0170\3\2\2\2\u016d\u016e"+
		"\7\b\2\2\u016e\u016f\7\u00ad\2\2\u016f\u0171\5\u013e\u00a0\2\u0170\u016d"+
		"\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0175\3\2\2\2\u0172\u0173\7\6\2\2\u0173"+
		"\u0174\7\u00ad\2\2\u0174\u0176\5\n\6\2\u0175\u0172\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\5\f\7\2\u0178\t\3\2\2\2\u0179"+
		"\u017a\5\u014c\u00a7\2\u017a\13\3\2\2\2\u017b\u017d\5\16\b\2\u017c\u017b"+
		"\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u0180\5\20\t\2"+
		"\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u0183"+
		"\5\22\n\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2"+
		"\u0184\u0186\5\26\f\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188"+
		"\3\2\2\2\u0187\u0189\5\30\r\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2"+
		"\u0189\u018b\3\2\2\2\u018a\u018c\5 \21\2\u018b\u018a\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018f\5\"\22\2\u018e\u018d\3\2\2\2"+
		"\u018e\u018f\3\2\2\2\u018f\r\3\2\2\2\u0190\u0191\7\t\2\2\u0191\u0193\7"+
		"\u00ad\2\2\u0192\u0194\7\u00a9\2\2\u0193\u0192\3\2\2\2\u0194\u0195\3\2"+
		"\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\17\3\2\2\2\u0197\u0198"+
		"\7\n\2\2\u0198\u019a\7\u00ad\2\2\u0199\u019b\7\u00a9\2\2\u019a\u0199\3"+
		"\2\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\21\3\2\2\2\u019e\u019f\7\13\2\2\u019f\u01a1\7\u00ad\2\2\u01a0\u01a2\5"+
		"\24\13\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\23\3\2\2\2\u01a5\u01aa\5\u0136\u009c\2\u01a6\u01a7"+
		"\7\u00a9\2\2\u01a7\u01a9\7\u00ac\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ac\3"+
		"\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ad\u01ae\7\u00a9\2\2\u01ae\25\3\2\2\2\u01af\u01b0\7"+
		"\f\2\2\u01b0\u01b5\7\u00ad\2\2\u01b1\u01b2\7\u00a9\2\2\u01b2\u01b4\7\u00ac"+
		"\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\7\u00a9"+
		"\2\2\u01b9\27\3\2\2\2\u01ba\u01bb\7\r\2\2\u01bb\u01bd\7\u00ad\2\2\u01bc"+
		"\u01be\5\32\16\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3"+
		"\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\31\3\2\2\2\u01c1\u01c3\5\u0136\u009c"+
		"\2\u01c2\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5"+
		"\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\7\u008d\2\2\u01c7\u01c8\5\u0138"+
		"\u009d\2\u01c8\u01ca\7\u008e\2\2\u01c9\u01cb\5\34\17\2\u01ca\u01c9\3\2"+
		"\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01cd\7\u0095\2\2\u01cd"+
		"\u01cf\5\36\20\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\33\3\2"+
		"\2\2\u01d0\u01d1\7\u0094\2\2\u01d1\u01d2\7\u00a9\2\2\u01d2\35\3\2\2\2"+
		"\u01d3\u01d4\t\2\2\2\u01d4\37\3\2\2\2\u01d5\u01d6\7\16\2\2\u01d6\u01d7"+
		"\7\u00ad\2\2\u01d7\u01d8\7\u00a9\2\2\u01d8!\3\2\2\2\u01d9\u01da\7\17\2"+
		"\2\u01da\u01db\7\u00ad\2\2\u01db\u01dc\7\u00a9\2\2\u01dc#\3\2\2\2\u01dd"+
		"\u01de\7\22\2\2\u01de\u01df\7\u00ad\2\2\u01df\u01e0\5&\24\2\u01e0\u01e1"+
		"\b\23\1\2\u01e1%\3\2\2\2\u01e2\u01e4\5(\25\2\u01e3\u01e2\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\'\3\2\2\2"+
		"\u01e7\u01e9\5\u0148\u00a5\2\u01e8\u01ea\5<\37\2\u01e9\u01e8\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea)\3\2\2\2\u01eb\u01ec\7\23\2\2\u01ec\u01ed\7\u00ad"+
		"\2\2\u01ed\u01ee\5,\27\2\u01ee\u01ef\b\26\1\2\u01ef+\3\2\2\2\u01f0\u01f2"+
		"\5.\30\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3"+
		"\u01f5\5\60\31\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3"+
		"\2\2\2\u01f6\u01f8\5\62\32\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01fa\3\2\2\2\u01f9\u01fb\5\66\34\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3"+
		"\2\2\2\u01fb-\3\2\2\2\u01fc\u01fd\7\24\2\2\u01fd\u01ff\7\u00ad\2\2\u01fe"+
		"\u0200\5:\36\2\u01ff\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u01ff\3\2"+
		"\2\2\u0201\u0202\3\2\2\2\u0202/\3\2\2\2\u0203\u0204\7\25\2\2\u0204\u0206"+
		"\7\u00ad\2\2\u0205\u0207\5:\36\2\u0206\u0205\3\2\2\2\u0207\u0208\3\2\2"+
		"\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\61\3\2\2\2\u020a\u020b"+
		"\7\26\2\2\u020b\u020d\7\u00ad\2\2\u020c\u020e\5\64\33\2\u020d\u020c\3"+
		"\2\2\2\u020e\u020f\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"\63\3\2\2\2\u0211\u0212\5:\36\2\u0212\65\3\2\2\2\u0213\u0214\7\27\2\2"+
		"\u0214\u0216\7\u00ad\2\2\u0215\u0217\58\35\2\u0216\u0215\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\67\3\2\2"+
		"\2\u021a\u021c\5:\36\2\u021b\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021b"+
		"\3\2\2\2\u021d\u021e\3\2\2\2\u021e9\3\2\2\2\u021f\u0220\5\u0136\u009c"+
		"\2\u0220\u0222\5> \2\u0221\u0223\5D#\2\u0222\u0221\3\2\2\2\u0222\u0223"+
		"\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0226\5<\37\2\u0225\u0224\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226;\3\2\2\2\u0227\u0228\7\30\2\2\u0228\u0229\7\u0097"+
		"\2\2\u0229\u022a\5\u0136\u009c\2\u022a=\3\2\2\2\u022b\u022d\7\31\2\2\u022c"+
		"\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\7\32"+
		"\2\2\u022f\u0234\5@!\2\u0230\u0234\5\u0142\u00a2\2\u0231\u0232\7\u0097"+
		"\2\2\u0232\u0234\5\u014a\u00a6\2\u0233\u022c\3\2\2\2\u0233\u0230\3\2\2"+
		"\2\u0233\u0231\3\2\2\2\u0234?\3\2\2\2\u0235\u0238\7\u00a9\2\2\u0236\u0237"+
		"\7\u00ac\2\2\u0237\u0239\7\u00a9\2\2\u0238\u0236\3\2\2\2\u0239\u023a\3"+
		"\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u0252\3\2\2\2\u023c"+
		"\u023f\7\u00a5\2\2\u023d\u023e\7\u00ac\2\2\u023e\u0240\7\u00a5\2\2\u023f"+
		"\u023d\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2"+
		"\2\2\u0242\u0252\3\2\2\2\u0243\u0246\7\u00a7\2\2\u0244\u0245\7\u00ac\2"+
		"\2\u0245\u0247\7\u00a7\2\2\u0246\u0244\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0252\3\2\2\2\u024a\u024d\5B"+
		"\"\2\u024b\u024c\7\u00ac\2\2\u024c\u024e\5B\"\2\u024d\u024b\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0252\3\2"+
		"\2\2\u0251\u0235\3\2\2\2\u0251\u023c\3\2\2\2\u0251\u0243\3\2\2\2\u0251"+
		"\u024a\3\2\2\2\u0252A\3\2\2\2\u0253\u0254\5\u0136\u009c\2\u0254\u0256"+
		"\7\u008d\2\2\u0255\u0257\5\u0146\u00a4\2\u0256\u0255\3\2\2\2\u0256\u0257"+
		"\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\7\u008e\2\2\u0259C\3\2\2\2\u025a"+
		"\u025b\7\36\2\2\u025b\u025c\7\u0091\2\2\u025c\u025d\5F$\2\u025d\u025e"+
		"\7\u00ac\2\2\u025e\u025f\5F$\2\u025f\u0260\7\u0092\2\2\u0260\u0266\3\2"+
		"\2\2\u0261\u0262\7X\2\2\u0262\u0266\5F$\2\u0263\u0264\7W\2\2\u0264\u0266"+
		"\5F$\2\u0265\u025a\3\2\2\2\u0265\u0261\3\2\2\2\u0265\u0263\3\2\2\2\u0266"+
		"E\3\2\2\2\u0267\u0268\t\3\2\2\u0268G\3\2\2\2\u0269\u026a\7\37\2\2\u026a"+
		"\u026c\7\u00ad\2\2\u026b\u026d\5J&\2\u026c\u026b\3\2\2\2\u026d\u026e\3"+
		"\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026fI\3\2\2\2\u0270\u0271"+
		"\5\u0136\u009c\2\u0271\u0272\7\u00ad\2\2\u0272\u0274\3\2\2\2\u0273\u0270"+
		"\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0279\5L\'\2\u0276"+
		"\u0279\5X-\2\u0277\u0279\5`\61\2\u0278\u0273\3\2\2\2\u0278\u0276\3\2\2"+
		"\2\u0278\u0277\3\2\2\2\u0279K\3\2\2\2\u027a\u027d\5V,\2\u027b\u027d\5"+
		"N(\2\u027c\u027a\3\2\2\2\u027c\u027b\3\2\2\2\u027dM\3\2\2\2\u027e\u027f"+
		"\5P)\2\u027f\u0281\7\u009a\2\2\u0280\u0282\7\u009b\2\2\u0281\u0280\3\2"+
		"\2\2\u0281\u0282\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\7\u0098\2\2\u0284"+
		"\u0285\5^\60\2\u0285O\3\2\2\2\u0286\u0287\5T+\2\u0287Q\3\2\2\2\u0288\u0289"+
		"\5T+\2\u0289S\3\2\2\2\u028a\u028f\5\u0136\u009c\2\u028b\u028c\7\u00ac"+
		"\2\2\u028c\u028e\5\u0136\u009c\2\u028d\u028b\3\2\2\2\u028e\u0291\3\2\2"+
		"\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0294\3\2\2\2\u0291\u028f"+
		"\3\2\2\2\u0292\u0293\7\u0099\2\2\u0293\u0295\5\u0136\u009c\2\u0294\u0292"+
		"\3\2\2\2\u0294\u0295\3\2\2\2\u0295U\3\2\2\2\u0296\u0297\7 \2\2\u0297W"+
		"\3\2\2\2\u0298\u029b\5Z.\2\u0299\u029b\5\\/\2\u029a\u0298\3\2\2\2\u029a"+
		"\u0299\3\2\2\2\u029bY\3\2\2\2\u029c\u029d\7!\2\2\u029d[\3\2\2\2\u029e"+
		"\u029f\5^\60\2\u029f\u02a1\7\u0096\2\2\u02a0\u02a2\t\4\2\2\u02a1\u02a0"+
		"\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\7\u009f\2"+
		"\2\u02a4\u02a5\7\u00a0\2\2\u02a5\u02a6\5P)\2\u02a6]\3\2\2\2\u02a7\u02a8"+
		"\5\u0136\u009c\2\u02a8_\3\2\2\2\u02a9\u02aa\7\"\2\2\u02aaa\3\2\2\2\u02ab"+
		"\u02ac\7#\2\2\u02ac\u02ad\7\u00ad\2\2\u02ad\u02ae\5d\63\2\u02aec\3\2\2"+
		"\2\u02af\u02b2\5f\64\2\u02b0\u02b2\5\u014c\u00a7\2\u02b1\u02af\3\2\2\2"+
		"\u02b1\u02b0\3\2\2\2\u02b2e\3\2\2\2\u02b3\u02b5\5h\65\2\u02b4\u02b6\5"+
		"p9\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7"+
		"\u02b8\5r:\2\u02b8\u02b9\5|?\2\u02b9\u02ba\5\u0086D\2\u02bag\3\2\2\2\u02bb"+
		"\u02bc\7$\2\2\u02bc\u02bd\7\u00ad\2\2\u02bd\u02bf\5j\66\2\u02be\u02c0"+
		"\5l\67\2\u02bf\u02be\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1"+
		"\u02c3\5n8\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3i\3\2\2\2\u02c4"+
		"\u02c8\7\63\2\2\u02c5\u02c6\7\64\2\2\u02c6\u02c8\7\u00a9\2\2\u02c7\u02c4"+
		"\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8k\3\2\2\2\u02c9\u02ca\7%\2\2\u02ca\u02cd"+
		"\7\u00ad\2\2\u02cb\u02ce\7\63\2\2\u02cc\u02ce\5\u0136\u009c\2\u02cd\u02cb"+
		"\3\2\2\2\u02cd\u02cc\3\2\2\2\u02cem\3\2\2\2\u02cf\u02d0\7\'\2\2\u02d0"+
		"\u02d1\7\u00ad\2\2\u02d1\u02d6\5\u0136\u009c\2\u02d2\u02d3\7\u00ac\2\2"+
		"\u02d3\u02d5\5\u0136\u009c\2\u02d4\u02d2\3\2\2\2\u02d5\u02d8\3\2\2\2\u02d6"+
		"\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7o\3\2\2\2\u02d8\u02d6\3\2\2\2"+
		"\u02d9\u02da\7&\2\2\u02da\u02db\7\u00ad\2\2\u02db\u02dd\5\u0136\u009c"+
		"\2\u02dc\u02de\5l\67\2\u02dd\u02dc\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02e0"+
		"\3\2\2\2\u02df\u02e1\5n8\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1"+
		"q\3\2\2\2\u02e2\u02e3\7)\2\2\u02e3\u02e4\7\u00ad\2\2\u02e4\u02e5\5t;\2"+
		"\u02e5s\3\2\2\2\u02e6\u02ea\5v<\2\u02e7\u02ea\5x=\2\u02e8\u02ea\5z>\2"+
		"\u02e9\u02e6\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02e8\3\2\2\2\u02eau\3"+
		"\2\2\2\u02eb\u02ec\7\u009c\2\2\u02ec\u02f1\5\u0136\u009c\2\u02ed\u02ee"+
		"\7\u00ac\2\2\u02ee\u02f0\5\u0136\u009c\2\u02ef\u02ed\3\2\2\2\u02f0\u02f3"+
		"\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f4\3\2\2\2\u02f3"+
		"\u02f1\3\2\2\2\u02f4\u02f5\5z>\2\u02f5w\3\2\2\2\u02f6\u02f7\5B\"\2\u02f7"+
		"\u02fe\5z>\2\u02f8\u02f9\7\u00ac\2\2\u02f9\u02fa\5B\"\2\u02fa\u02fb\5"+
		"z>\2\u02fb\u02fd\3\2\2\2\u02fc\u02f8\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe"+
		"\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ffy\3\2\2\2\u0300\u02fe\3\2\2\2"+
		"\u0301\u0302\7(\2\2\u0302\u0303\7\u00a5\2\2\u0303{\3\2\2\2\u0304\u0305"+
		"\7*\2\2\u0305\u0308\7\u00ad\2\2\u0306\u0309\7\63\2\2\u0307\u0309\5~@\2"+
		"\u0308\u0306\3\2\2\2\u0308\u0307\3\2\2\2\u0309}\3\2\2\2\u030a\u030c\5"+
		"\u0080A\2\u030b\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030b\3\2\2\2"+
		"\u030d\u030e\3\2\2\2\u030e\177\3\2\2\2\u030f\u0312\5\u0082B\2\u0310\u0312"+
		"\5\u0084C\2\u0311\u030f\3\2\2\2\u0311\u0310\3\2\2\2\u0312\u0081\3\2\2"+
		"\2\u0313\u031d\7@\2\2\u0314\u0315\7,\2\2\u0315\u031a\5\u0136\u009c\2\u0316"+
		"\u0317\7\u00ac\2\2\u0317\u0319\5\u0136\u009c\2\u0318\u0316\3\2\2\2\u0319"+
		"\u031c\3\2\2\2\u031a\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031e\3\2"+
		"\2\2\u031c\u031a\3\2\2\2\u031d\u0314\3\2\2\2\u031d\u031e\3\2\2\2\u031e"+
		"\u0320\3\2\2\2\u031f\u0321\7\u0098\2\2\u0320\u031f\3\2\2\2\u0320\u0321"+
		"\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323\5B\"\2\u0323\u0083\3\2\2\2\u0324"+
		"\u032a\7?\2\2\u0325\u0326\5\u0136\u009c\2\u0326\u0327\7\u00ac\2\2\u0327"+
		"\u0329\3\2\2\2\u0328\u0325\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2"+
		"\2\2\u032a\u032b\3\2\2\2\u032b\u032d\3\2\2\2\u032c\u032a\3\2\2\2\u032d"+
		"\u032e\5B\"\2\u032e\u0085\3\2\2\2\u032f\u0330\7+\2\2\u0330\u0331\7\u00ad"+
		"\2\2\u0331\u0332\5\u0088E\2\u0332\u0087\3\2\2\2\u0333\u0335\5\u008aF\2"+
		"\u0334\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0334\3\2\2\2\u0336\u0337"+
		"\3\2\2\2\u0337\u0089\3\2\2\2\u0338\u0339\5\u0136\u009c\2\u0339\u033b\7"+
		"\u00ad\2\2\u033a\u033c\5\u008cG\2\u033b\u033a\3\2\2\2\u033c\u033d\3\2"+
		"\2\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u008b\3\2\2\2\u033f"+
		"\u0347\5\u008eH\2\u0340\u0347\5\u0092J\2\u0341\u0347\5\u0096L\2\u0342"+
		"\u0347\5\u009aN\2\u0343\u0347\5\u009eP\2\u0344\u0347\5\u00a2R\2\u0345"+
		"\u0347\5\u014c\u00a7\2\u0346\u033f\3\2\2\2\u0346\u0340\3\2\2\2\u0346\u0341"+
		"\3\2\2\2\u0346\u0342\3\2\2\2\u0346\u0343\3\2\2\2\u0346\u0344\3\2\2\2\u0346"+
		"\u0345\3\2\2\2\u0347\u008d\3\2\2\2\u0348\u0349\5\u0090I\2\u0349\u034c"+
		"\7\u008d\2\2\u034a\u034d\5\u0092J\2\u034b\u034d\5\u0096L\2\u034c\u034a"+
		"\3\2\2\2\u034c\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034f\7\u00ac\2"+
		"\2\u034f\u0350\5\u0136\u009c\2\u0350\u0351\7\u008e\2\2\u0351\u008f\3\2"+
		"\2\2\u0352\u0353\7`\2\2\u0353\u0091\3\2\2\2\u0354\u0355\5\u0094K\2\u0355"+
		"\u0356\7\u008d\2\2\u0356\u035b\5\u00a6T\2\u0357\u0358\7\u00ac\2\2\u0358"+
		"\u035a\5\u00a6T\2\u0359\u0357\3\2\2\2\u035a\u035d\3\2\2\2\u035b\u0359"+
		"\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035e\3\2\2\2\u035d\u035b\3\2\2\2\u035e"+
		"\u035f\7\u008e\2\2\u035f\u0093\3\2\2\2\u0360\u0361\t\5\2\2\u0361\u0095"+
		"\3\2\2\2\u0362\u0363\5\u0098M\2\u0363\u0364\7\u008d\2\2\u0364\u0369\5"+
		"\u00a6T\2\u0365\u0366\7\u00ac\2\2\u0366\u0368\5\u00a6T\2\u0367\u0365\3"+
		"\2\2\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a"+
		"\u036c\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u036d\7\u008e\2\2\u036d\u0097"+
		"\3\2\2\2\u036e\u036f\t\6\2\2\u036f\u0099\3\2\2\2\u0370\u0371\5\u009cO"+
		"\2\u0371\u0372\7\u008d\2\2\u0372\u0373\5\u00a6T\2\u0373\u0374\7\u008e"+
		"\2\2\u0374\u009b\3\2\2\2\u0375\u0376\7a\2\2\u0376\u009d\3\2\2\2\u0377"+
		"\u0378\5\u00a0Q\2\u0378\u0379\7\u008d\2\2\u0379\u037e\5\u00a6T\2\u037a"+
		"\u037b\7\u00ac\2\2\u037b\u037d\5\u00a6T\2\u037c\u037a\3\2\2\2\u037d\u0380"+
		"\3\2\2\2\u037e\u037c\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0381\3\2\2\2\u0380"+
		"\u037e\3\2\2\2\u0381\u0382\7\u008e\2\2\u0382\u009f\3\2\2\2\u0383\u0384"+
		"\t\7\2\2\u0384\u00a1\3\2\2\2\u0385\u0386\5\u00a4S\2\u0386\u0387\7\u008d"+
		"\2\2\u0387\u0388\5\u00a6T\2\u0388\u0389\7\u00ac\2\2\u0389\u038a\5\u00a6"+
		"T\2\u038a\u038b\7\u008e\2\2\u038b\u00a3\3\2\2\2\u038c\u038d\t\b\2\2\u038d"+
		"\u00a5\3\2\2\2\u038e\u0393\5\u00acW\2\u038f\u0393\5\u00aeX\2\u0390\u0393"+
		"\5\u00a8U\2\u0391\u0393\3\2\2\2\u0392\u038e\3\2\2\2\u0392\u038f\3\2\2"+
		"\2\u0392\u0390\3\2\2\2\u0392\u0391\3\2\2\2\u0393\u00a7\3\2\2\2\u0394\u0396"+
		"\5\u00aaV\2\u0395\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u039b\3\2\2"+
		"\2\u0397\u0398\7\u00ac\2\2\u0398\u039a\5\u00aaV\2\u0399\u0397\3\2\2\2"+
		"\u039a\u039d\3\2\2\2\u039b\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u00a9"+
		"\3\2\2\2\u039d\u039b\3\2\2\2\u039e\u03a1\5\u0136\u009c\2\u039f\u03a0\7"+
		"\u00a2\2\2\u03a0\u03a2\5\u0140\u00a1\2\u03a1\u039f\3\2\2\2\u03a1\u03a2"+
		"\3\2\2\2\u03a2\u00ab\3\2\2\2\u03a3\u03a4\t\3\2\2\u03a4\u00ad\3\2\2\2\u03a5"+
		"\u03a8\5\u00b0Y\2\u03a6\u03a8\5\u00b2Z\2\u03a7\u03a5\3\2\2\2\u03a7\u03a6"+
		"\3\2\2\2\u03a8\u00af\3\2\2\2\u03a9\u03ac\5\u00ba^\2\u03aa\u03ab\7\u0093"+
		"\2\2\u03ab\u03ad\5\u00bc_\2\u03ac\u03aa\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad"+
		"\u03b0\3\2\2\2\u03ae\u03af\7\u0093\2\2\u03af\u03b1\5\u00be`\2\u03b0\u03ae"+
		"\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b8\3\2\2\2\u03b2\u03b5\5\u00bc_"+
		"\2\u03b3\u03b4\7\u0093\2\2\u03b4\u03b6\5\u00be`\2\u03b5\u03b3\3\2\2\2"+
		"\u03b5\u03b6\3\2\2\2\u03b6\u03b8\3\2\2\2\u03b7\u03a9\3\2\2\2\u03b7\u03b2"+
		"\3\2\2\2\u03b8\u00b1\3\2\2\2\u03b9\u03bb\5\u00b4[\2\u03ba\u03b9\3\2\2"+
		"\2\u03ba\u03bb\3\2\2\2\u03bb\u03bd\3\2\2\2\u03bc\u03be\5\u00b6\\\2\u03bd"+
		"\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c0\3\2\2\2\u03bf\u03c1\5\u00b8"+
		"]\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u00b3\3\2\2\2\u03c2"+
		"\u03c3\7,\2\2\u03c3\u03c8\5\u0136\u009c\2\u03c4\u03c5\7\u00ac\2\2\u03c5"+
		"\u03c7\5\u0136\u009c\2\u03c6\u03c4\3\2\2\2\u03c7\u03ca\3\2\2\2\u03c8\u03c6"+
		"\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u00b5\3\2\2\2\u03ca\u03c8\3\2\2\2\u03cb"+
		"\u03cc\7-\2\2\u03cc\u03cd\5\u00a8U\2\u03cd\u00b7\3\2\2\2\u03ce\u03cf\7"+
		"\u009c\2\2\u03cf\u03d4\5\u0136\u009c\2\u03d0\u03d1\7\u00ac\2\2\u03d1\u03d3"+
		"\5\u0136\u009c\2\u03d2\u03d0\3\2\2\2\u03d3\u03d6\3\2\2\2\u03d4\u03d2\3"+
		"\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u00b9\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d7"+
		"\u03d8\7.\2\2\u03d8\u03d9\7\u008d\2\2\u03d9\u03da\5\u00a8U\2\u03da\u03db"+
		"\7\u008e\2\2\u03db\u00bb\3\2\2\2\u03dc\u03dd\7/\2\2\u03dd\u03de\7\u008d"+
		"\2\2\u03de\u03df\7\u008f\2\2\u03df\u03e4\5\u0136\u009c\2\u03e0\u03e1\7"+
		"\u00ac\2\2\u03e1\u03e3\5\u0136\u009c\2\u03e2\u03e0\3\2\2\2\u03e3\u03e6"+
		"\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e7\3\2\2\2\u03e6"+
		"\u03e4\3\2\2\2\u03e7\u03e8\7\u0090\2\2\u03e8\u03e9\7\u008e\2\2\u03e9\u00bd"+
		"\3\2\2\2\u03ea\u03eb\7\60\2\2\u03eb\u03ec\7\u008d\2\2\u03ec\u03f1\5\u0136"+
		"\u009c\2\u03ed\u03ee\7\u00ac\2\2\u03ee\u03f0\5\u0136\u009c\2\u03ef\u03ed"+
		"\3\2\2\2\u03f0\u03f3\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2"+
		"\u03f4\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f4\u03f5\7\u008e\2\2\u03f5\u00bf"+
		"\3\2\2\2\u03f6\u03f7\7\65\2\2\u03f7\u03f9\7\u00ad\2\2\u03f8\u03fa\5\u00c2"+
		"b\2\u03f9\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb"+
		"\u03fc\3\2\2\2\u03fc\u00c1\3\2\2\2\u03fd\u03fe\5\u0136\u009c\2\u03fe\u03ff"+
		"\7\u00ad\2\2\u03ff\u0400\5\u00c4c\2\u0400\u00c3\3\2\2\2\u0401\u0403\5"+
		"\u00c6d\2\u0402\u0401\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0405\3\2\2\2"+
		"\u0404\u0406\5\u00c8e\2\u0405\u0404\3\2\2\2\u0405\u0406\3\2\2\2\u0406"+
		"\u0408\3\2\2\2\u0407\u0409\5\u00d4k\2\u0408\u0407\3\2\2\2\u0408\u0409"+
		"\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040c\5\u00dep\2\u040b\u040d\5\u00fe"+
		"\u0080\2\u040c\u040b\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u00c5\3\2\2\2\u040e"+
		"\u040f\78\2\2\u040f\u0410\7\u00ad\2\2\u0410\u0415\5\u00caf\2\u0411\u0412"+
		"\7\u00ac\2\2\u0412\u0414\5\u00caf\2\u0413\u0411\3\2\2\2\u0414\u0417\3"+
		"\2\2\2\u0415\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u00c7\3\2\2\2\u0417"+
		"\u0415\3\2\2\2\u0418\u0419\7\67\2\2\u0419\u041a\7\u00ad\2\2\u041a\u041f"+
		"\5\u00caf\2\u041b\u041c\7\u00ac\2\2\u041c\u041e\5\u00caf\2\u041d\u041b"+
		"\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2\2\2\u041f\u0420\3\2\2\2\u0420"+
		"\u00c9\3\2\2\2\u0421\u041f\3\2\2\2\u0422\u0424\5\u00ccg\2\u0423\u0425"+
		"\5\u00ceh\2\u0424\u0423\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0427\3\2\2"+
		"\2\u0426\u0428\5\u00d0i\2\u0427\u0426\3\2\2\2\u0427\u0428\3\2\2\2\u0428"+
		"\u042a\3\2\2\2\u0429\u042b\5\u00d2j\2\u042a\u0429\3\2\2\2\u042a\u042b"+
		"\3\2\2\2\u042b\u00cb\3\2\2\2\u042c\u042d\7A\2\2\u042d\u042e\7\u00a9\2"+
		"\2\u042e\u00cd\3\2\2\2\u042f\u0430\7B\2\2\u0430\u0431\7\u00ad\2\2\u0431"+
		"\u0432\t\t\2\2\u0432\u00cf\3\2\2\2\u0433\u0434\7C\2\2\u0434\u0435\7\u00ad"+
		"\2\2\u0435\u0436\5\u0136\u009c\2\u0436\u00d1\3\2\2\2\u0437\u0438\7D\2"+
		"\2\u0438\u0439\7\u00ad\2\2\u0439\u043a\7\u00a9\2\2\u043a\u00d3\3\2\2\2"+
		"\u043b\u043c\79\2\2\u043c\u043e\7\u00ad\2\2\u043d\u043f\5\u00d6l\2\u043e"+
		"\u043d\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0441\3\2\2\2\u0440\u0442\5\u00da"+
		"n\2\u0441\u0440\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u00d5\3\2\2\2\u0443"+
		"\u0444\7;\2\2\u0444\u0445\7\u00ad\2\2\u0445\u044a\5\u00d8m\2\u0446\u0447"+
		"\7\u00ac\2\2\u0447\u0449\5\u00d8m\2\u0448\u0446\3\2\2\2\u0449\u044c\3"+
		"\2\2\2\u044a\u0448\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u00d7\3\2\2\2\u044c"+
		"\u044a\3\2\2\2\u044d\u044e\5\u0136\u009c\2\u044e\u044f\5\u013a\u009e\2"+
		"\u044f\u00d9\3\2\2\2\u0450\u0451\7<\2\2\u0451\u0452\7\u00ad\2\2\u0452"+
		"\u0457\5\u00dco\2\u0453\u0454\7\u00ac\2\2\u0454\u0456\5\u00dco\2\u0455"+
		"\u0453\3\2\2\2\u0456\u0459\3\2\2\2\u0457\u0455\3\2\2\2\u0457\u0458\3\2"+
		"\2\2\u0458\u00db\3\2\2\2\u0459\u0457\3\2\2\2\u045a\u045b\5\u0136\u009c"+
		"\2\u045b\u045c\5\u013a\u009e\2\u045c\u00dd\3\2\2\2\u045d\u045e\7:\2\2"+
		"\u045e\u0461\7\u00ad\2\2\u045f\u0462\5\u00e0q\2\u0460\u0462\5\u00f4{\2"+
		"\u0461\u045f\3\2\2\2\u0461\u0460\3\2\2\2\u0462\u00df\3\2\2\2\u0463\u0465"+
		"\5\u00e2r\2\u0464\u0463\3\2\2\2\u0465\u0468\3\2\2\2\u0466\u0464\3\2\2"+
		"\2\u0466\u0467\3\2\2\2\u0467\u00e1\3\2\2\2\u0468\u0466\3\2\2\2\u0469\u046a"+
		"\5\u00e4s\2\u046a\u046b\7\u00ad\2\2\u046b\u046c\5\u00f2z\2\u046c\u00e3"+
		"\3\2\2\2\u046d\u0470\7>\2\2\u046e\u046f\7\u0095\2\2\u046f\u0471\5\u00e6"+
		"t\2\u0470\u046e\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u047d\3\2\2\2\u0472"+
		"\u0473\7\u008d\2\2\u0473\u0478\5\u0136\u009c\2\u0474\u0475\7\u00ac\2\2"+
		"\u0475\u0477\5\u0136\u009c\2\u0476\u0474\3\2\2\2\u0477\u047a\3\2\2\2\u0478"+
		"\u0476\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047b\3\2\2\2\u047a\u0478\3\2"+
		"\2\2\u047b\u047c\7\u008e\2\2\u047c\u047e\3\2\2\2\u047d\u0472\3\2\2\2\u047d"+
		"\u047e\3\2\2\2\u047e\u00e5\3\2\2\2\u047f\u0485\5\u00e8u\2\u0480\u0485"+
		"\5\u00eav\2\u0481\u0485\5\u00f0y\2\u0482\u0485\5\u00ecw\2\u0483\u0485"+
		"\5\u00eex\2\u0484\u047f\3\2\2\2\u0484\u0480\3\2\2\2\u0484\u0481\3\2\2"+
		"\2\u0484\u0482\3\2\2\2\u0484\u0483\3\2\2\2\u0485\u00e7\3\2\2\2\u0486\u0487"+
		"\7?\2\2\u0487\u00e9\3\2\2\2\u0488\u0489\7@\2\2\u0489\u00eb\3\2\2\2\u048a"+
		"\u048b\7\u0089\2\2\u048b\u00ed\3\2\2\2\u048c\u048e\5\u00f8}\2\u048d\u048c"+
		"\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\5\u014c\u00a7"+
		"\2\u0490\u00ef\3\2\2\2\u0491\u0493\5\u00f8}\2\u0492\u0491\3\2\2\2\u0492"+
		"\u0493\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\7\u0086\2\2\u0495\u00f1"+
		"\3\2\2\2\u0496\u0497\7\u00a9\2\2\u0497\u00f3\3\2\2\2\u0498\u049a\5\u00f6"+
		"|\2\u0499\u0498\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049b\3\2\2\2\u049b"+
		"\u049d\5\u00fa~\2\u049c\u049e\5\u00fc\177\2\u049d\u049c\3\2\2\2\u049d"+
		"\u049e\3\2\2\2\u049e\u00f5\3\2\2\2\u049f\u04a0\7\u0086\2\2\u04a0\u04a4"+
		"\7\u00ad\2\2\u04a1\u04a3\5\u00e2r\2\u04a2\u04a1\3\2\2\2\u04a3\u04a6\3"+
		"\2\2\2\u04a4\u04a2\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u00f7\3\2\2\2\u04a6"+
		"\u04a4\3\2\2\2\u04a7\u04b3\7\u0087\2\2\u04a8\u04a9\7\u008d\2\2\u04a9\u04ae"+
		"\5\u0136\u009c\2\u04aa\u04ab\7\u00ac\2\2\u04ab\u04ad\5\u0136\u009c\2\u04ac"+
		"\u04aa\3\2\2\2\u04ad\u04b0\3\2\2\2\u04ae\u04ac\3\2\2\2\u04ae\u04af\3\2"+
		"\2\2\u04af\u04b1\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b1\u04b2\7\u008e\2\2\u04b2"+
		"\u04b4\3\2\2\2\u04b3\u04a8\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u00f9\3\2"+
		"\2\2\u04b5\u04b6\7\u0088\2\2\u04b6\u04ba\7\u00ad\2\2\u04b7\u04b9\5\u00e2"+
		"r\2\u04b8\u04b7\3\2\2\2\u04b9\u04bc\3\2\2\2\u04ba\u04b8\3\2\2\2\u04ba"+
		"\u04bb\3\2\2\2\u04bb\u00fb\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bd\u04be\7\u0089"+
		"\2\2\u04be\u04c2\7\u00ad\2\2\u04bf\u04c1\5\u00e2r\2\u04c0\u04bf\3\2\2"+
		"\2\u04c1\u04c4\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u00fd"+
		"\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c5\u04c6\7E\2\2\u04c6\u04c8\7\u00ad\2"+
		"\2\u04c7\u04c9\5\u0100\u0081\2\u04c8\u04c7\3\2\2\2\u04c9\u04ca\3\2\2\2"+
		"\u04ca\u04c8\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u00ff\3\2\2\2\u04cc\u04cd"+
		"\5\u0136\u009c\2\u04cd\u04ce\7\u00ad\2\2\u04ce\u04cf\5\u0102\u0082\2\u04cf"+
		"\u0101\3\2\2\2\u04d0\u04d2\5\u0104\u0083\2\u04d1\u04d0\3\2\2\2\u04d1\u04d2"+
		"\3\2\2\2\u04d2\u04d4\3\2\2\2\u04d3\u04d5\5\u0106\u0084\2\u04d4\u04d3\3"+
		"\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d7\3\2\2\2\u04d6\u04d8\5\u0108\u0085"+
		"\2\u04d7\u04d6\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04db"+
		"\5\u010a\u0086\2\u04da\u04dc\5\u010c\u0087\2\u04db\u04da\3\2\2\2\u04db"+
		"\u04dc\3\2\2\2\u04dc\u0103\3\2\2\2\u04dd\u04de\7O\2\2\u04de\u04df\7\u00ad"+
		"\2\2\u04df\u04e0\7\u00a9\2\2\u04e0\u0105\3\2\2\2\u04e1\u04e2\7P\2\2\u04e2"+
		"\u04e3\7\u00ad\2\2\u04e3\u04e4\7\u00a9\2\2\u04e4\u0107\3\2\2\2\u04e5\u04e6"+
		"\7\66\2\2\u04e6\u04e7\7\u00ad\2\2\u04e7\u04e8\7\u00a9\2\2\u04e8\u0109"+
		"\3\2\2\2\u04e9\u04ea\7F\2\2\u04ea\u04ee\7\u00ad\2\2\u04eb\u04ed\5\u0122"+
		"\u0092\2\u04ec\u04eb\3\2\2\2\u04ed\u04f0\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ee"+
		"\u04ef\3\2\2\2\u04ef\u010b\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f1\u04f2\7+"+
		"\2\2\u04f2\u04f4\7\u00ad\2\2\u04f3\u04f5\5\u010e\u0088\2\u04f4\u04f3\3"+
		"\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7"+
		"\u010d\3\2\2\2\u04f8\u04f9\5\u0136\u009c\2\u04f9\u04fa\7\u00ad\2\2\u04fa"+
		"\u04fb\5\u0110\u0089\2\u04fb\u010f\3\2\2\2\u04fc\u0501\5\u0112\u008a\2"+
		"\u04fd\u04fe\7\u00ac\2\2\u04fe\u0500\5\u0112\u008a\2\u04ff\u04fd\3\2\2"+
		"\2\u0500\u0503\3\2\2\2\u0501\u04ff\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0111"+
		"\3\2\2\2\u0503\u0501\3\2\2\2\u0504\u0506\5\u0116\u008c\2\u0505\u0504\3"+
		"\2\2\2\u0505\u0506\3\2\2\2\u0506\u0508\3\2\2\2\u0507\u0509\5\u011a\u008e"+
		"\2\u0508\u0507\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050e"+
		"\7\u00ad\2\2\u050b\u050f\5\u0114\u008b\2\u050c\u050f\5\u012e\u0098\2\u050d"+
		"\u050f\5\u0130\u0099\2\u050e\u050b\3\2\2\2\u050e\u050c\3\2\2\2\u050e\u050d"+
		"\3\2\2\2\u050f\u0113\3\2\2\2\u0510\u0514\5\u0140\u00a1\2\u0511\u0513\5"+
		"\u0140\u00a1\2\u0512\u0511\3\2\2\2\u0513\u0516\3\2\2\2\u0514\u0512\3\2"+
		"\2\2\u0514\u0515\3\2\2\2\u0515\u0115\3\2\2\2\u0516\u0514\3\2\2\2\u0517"+
		"\u051e\5\u0098M\2\u0518\u051e\5\u0094K\2\u0519\u051e\5\u00a4S\2\u051a"+
		"\u051e\5\u00a0Q\2\u051b\u051e\5\u009cO\2\u051c\u051e\5\u0090I\2\u051d"+
		"\u0517\3\2\2\2\u051d\u0518\3\2\2\2\u051d\u0519\3\2\2\2\u051d\u051a\3\2"+
		"\2\2\u051d\u051b\3\2\2\2\u051d\u051c\3\2\2\2\u051e\u0117\3\2\2\2\u051f"+
		"\u0520\7H\2\2\u0520\u0521\7\u00ad\2\2\u0521\u0522\7\u00a9\2\2\u0522\u0119"+
		"\3\2\2\2\u0523\u0524\7\u008d\2\2\u0524\u0527\5\u011e\u0090\2\u0525\u0526"+
		"\7\u00a1\2\2\u0526\u0528\5\u011e\u0090\2\u0527\u0525\3\2\2\2\u0527\u0528"+
		"\3\2\2\2\u0528\u052b\3\2\2\2\u0529\u052a\7K\2\2\u052a\u052c\5\u011e\u0090"+
		"\2\u052b\u0529\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052f\3\2\2\2\u052d\u052e"+
		"\7\u00ac\2\2\u052e\u0530\5\u011c\u008f\2\u052f\u052d\3\2\2\2\u052f\u0530"+
		"\3\2\2\2\u0530\u0533\3\2\2\2\u0531\u0532\7L\2\2\u0532\u0534\5\u011e\u0090"+
		"\2\u0533\u0531\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0536"+
		"\7\u008e\2\2\u0536\u011b\3\2\2\2\u0537\u0538\7\u008f\2\2\u0538\u0539\5"+
		"\u011e\u0090\2\u0539\u053a\7\u0090\2\2\u053a\u011d\3\2\2\2\u053b\u053c"+
		"\5\u0136\u009c\2\u053c\u011f\3\2\2\2\u053d\u053e\t\n\2\2\u053e\u053f\7"+
		"\u00ad\2\2\u053f\u0545\5\u0140\u00a1\2\u0540\u0541\t\n\2\2\u0541\u0542"+
		"\7\u00ad\2\2\u0542\u0544\5\u0140\u00a1\2\u0543\u0540\3\2\2\2\u0544\u0547"+
		"\3\2\2\2\u0545\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0121\3\2\2\2\u0547"+
		"\u0545\3\2\2\2\u0548\u0549\7A\2\2\u0549\u054a\7\u00ad\2\2\u054a\u054b"+
		"\7\u00a9\2\2\u054b\u0123\3\2\2\2\u054c\u054d\7J\2\2\u054d\u054e\7\u00ad"+
		"\2\2\u054e\u054f\5\u0140\u00a1\2\u054f\u0125\3\2\2\2\u0550\u0551\7\u008f"+
		"\2\2\u0551\u0552\5\u011a\u008e\2\u0552\u0553\5\u0120\u0091\2\u0553\u0554"+
		"\7\u0090\2\2\u0554\u0127\3\2\2\2\u0555\u0556\7\u008f\2\2\u0556\u0557\5"+
		"\u012a\u0096\2\u0557\u0558\7\u0090\2\2\u0558\u0129\3\2\2\2\u0559\u055c"+
		"\5\u0136\u009c\2\u055a\u055c\5\u014a\u00a6\2\u055b\u0559\3\2\2\2\u055b"+
		"\u055a\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055e\7\u00ad\2\2\u055e\u0569"+
		"\5\u0140\u00a1\2\u055f\u0562\7\u00ac\2\2\u0560\u0563\5\u0136\u009c\2\u0561"+
		"\u0563\5\u014a\u00a6\2\u0562\u0560\3\2\2\2\u0562\u0561\3\2\2\2\u0563\u0564"+
		"\3\2\2\2\u0564\u0565\7\u00ad\2\2\u0565\u0566\5\u0140\u00a1\2\u0566\u0568"+
		"\3\2\2\2\u0567\u055f\3\2\2\2\u0568\u056b\3\2\2\2\u0569\u0567\3\2\2\2\u0569"+
		"\u056a\3\2\2\2\u056a\u012b\3\2\2\2\u056b\u0569\3\2\2\2\u056c\u056e\5\u0140"+
		"\u00a1\2\u056d\u056c\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u056d\3\2\2\2\u056f"+
		"\u0570\3\2\2\2\u0570\u012d\3\2\2\2\u0571\u0572\7G\2\2\u0572\u0573\7\u00ad"+
		"\2\2\u0573\u0576\5\u0140\u00a1\2\u0574\u0575\7\u00ac\2\2\u0575\u0577\5"+
		"\u0118\u008d\2\u0576\u0574\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u057a\3\2"+
		"\2\2\u0578\u0579\7\u00ac\2\2\u0579\u057b\5\u0124\u0093\2\u057a\u0578\3"+
		"\2\2\2\u057a\u057b\3\2\2\2\u057b\u0580\3\2\2\2\u057c\u057d\5\u0126\u0094"+
		"\2\u057d\u057e\7\u00ac\2\2\u057e\u057f\5\u0126\u0094\2\u057f\u0581\3\2"+
		"\2\2\u0580\u057c\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u012f\3\2\2\2\u0582"+
		"\u0583\7\u008f\2\2\u0583\u0584\5\u014a\u00a6\2\u0584\u0585\7\u00ad\2\2"+
		"\u0585\u0586\5\u0140\u00a1\2\u0586\u0587\7\u00ac\2\2\u0587\u0588\5\u011e"+
		"\u0090\2\u0588\u0589\7\u00ad\2\2\u0589\u058a\5\u0140\u00a1\2\u058a\u058b"+
		"\7\u00ac\2\2\u058b\u058c\5\u0132\u009a\2\u058c\u058d\7\u0090\2\2\u058d"+
		"\u0131\3\2\2\2\u058e\u058f\5\u0134\u009b\2\u058f\u0590\7\u00ad\2\2\u0590"+
		"\u0591\5\u0140\u00a1\2\u0591\u0133\3\2\2\2\u0592\u0593\7N\2\2\u0593\u0135"+
		"\3\2\2\2\u0594\u0595\7\u00a3\2\2\u0595\u0137\3\2\2\2\u0596\u0597\7\u00ab"+
		"\2\2\u0597\u0139\3\2\2\2\u0598\u0599\t\13\2\2\u0599\u013b\3\2\2\2\u059a"+
		"\u059b\7\u00aa\2\2\u059b\u013d\3\2\2\2\u059c\u059d\7\u00aa\2\2\u059d\u013f"+
		"\3\2\2\2\u059e\u059f\t\f\2\2\u059f\u0141\3\2\2\2\u05a0\u05a1\t\r\2\2\u05a1"+
		"\u0143\3\2\2\2\u05a2\u05a3\7\u008f\2\2\u05a3\u05a4\5\u0146\u00a4\2\u05a4"+
		"\u05a5\7\u0090\2\2\u05a5\u0145\3\2\2\2\u05a6\u05ab\5\u0148\u00a5\2\u05a7"+
		"\u05a8\7\u00ac\2\2\u05a8\u05aa\5\u0148\u00a5\2\u05a9\u05a7\3\2\2\2\u05aa"+
		"\u05ad\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u0147\3\2"+
		"\2\2\u05ad\u05ab\3\2\2\2\u05ae\u05af\5\u0136\u009c\2\u05af\u05b2\7\u00ad"+
		"\2\2\u05b0\u05b3\5\u0144\u00a3\2\u05b1\u05b3\5\u0140\u00a1\2\u05b2\u05b0"+
		"\3\2\2\2\u05b2\u05b1\3\2\2\2\u05b3\u0149\3\2\2\2\u05b4\u05b5\t\16\2\2"+
		"\u05b5\u014b\3\2\2\2\u05b6\u05b7\7\u00a3\2\2\u05b7\u05b8\7\3\2\2\u05b8"+
		"\u014d\3\2\2\2\u0099\u0151\u0157\u015e\u016b\u0170\u0175\u017c\u017f\u0182"+
		"\u0185\u0188\u018b\u018e\u0195\u019c\u01a3\u01aa\u01b5\u01bf\u01c4\u01ca"+
		"\u01ce\u01e5\u01e9\u01f1\u01f4\u01f7\u01fa\u0201\u0208\u020f\u0218\u021d"+
		"\u0222\u0225\u022c\u0233\u023a\u0241\u0248\u024f\u0251\u0256\u0265\u026e"+
		"\u0273\u0278\u027c\u0281\u028f\u0294\u029a\u02a1\u02b1\u02b5\u02bf\u02c2"+
		"\u02c7\u02cd\u02d6\u02dd\u02e0\u02e9\u02f1\u02fe\u0308\u030d\u0311\u031a"+
		"\u031d\u0320\u032a\u0336\u033d\u0346\u034c\u035b\u0369\u037e\u0392\u0395"+
		"\u039b\u03a1\u03a7\u03ac\u03b0\u03b5\u03b7\u03ba\u03bd\u03c0\u03c8\u03d4"+
		"\u03e4\u03f1\u03fb\u0402\u0405\u0408\u040c\u0415\u041f\u0424\u0427\u042a"+
		"\u043e\u0441\u044a\u0457\u0461\u0466\u0470\u0478\u047d\u0484\u048d\u0492"+
		"\u0499\u049d\u04a4\u04ae\u04b3\u04ba\u04c2\u04ca\u04d1\u04d4\u04d7\u04db"+
		"\u04ee\u04f6\u0501\u0505\u0508\u050e\u0514\u051d\u0527\u052b\u052f\u0533"+
		"\u0545\u055b\u0562\u0569\u056f\u0576\u057a\u0580\u05ab\u05b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}