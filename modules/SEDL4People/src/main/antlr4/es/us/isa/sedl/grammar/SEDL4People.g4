grammar SEDL4People;

@header {
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
}

@lexer::members {
	public static final int COMMENTS = 2; 
}

@parser::members{
       private boolean parsingVariables=false;
       private Map<String, Object> constants=new HashMap<String,Object>();
       private Map<String, Object> variables = new HashMap<String,Object>();
       private List<String> importedModules = new ArrayList<String>();
       
       public List<String> getImportedModules(){return importedModules;}       
       public Map<String, Object> getVariables(){return variables;}
       public Map<String, Object> getConstants(){return constants;}
}

options
{
    
} 

/*=====================================
            SYNTACTICAL RULES
 ======================================*/

// OJO: Parse Tree

document: moduleImports experimentPreamble constants? variables hypothesis design configuration? EOF;

//---------------------------------------
// Experiment preamble
//---------------------------------------

moduleImports: moduleImport*;

moduleImport: IMPORT Identifier {importedModules.add(_localctx.Identifier().getText());};

//---------------------------------------
// Experiment preamble
//---------------------------------------

experimentPreamble: EXPERIMENT COLON id  (VERSION COLON versionNumber)? (REP COLON repUrl)? (TYPE COLON experimentType)? experimentContext;

experimentType: extensionPoint;

experimentContext: notes? annotations? subjects? object? population?;

notes: NOTES COLON (StringLiteral)+;
       
annotations: ANNOTATIONS COLON (StringLiteral)+;

subjects: SUBJECTS COLON stakeholder+;

stakeholder: id OPEN_PAR email CLOSE_PAR stakeholderFrom? (AS role)?;

stakeholderFrom: FROM id;

role: RESPONSIBLE | COLLABORATOR;

object: OBJECT COLON StringLiteral;

population: POPULATION COLON StringLiteral;


//---------------------------------------
// Constants
//---------------------------------------

constants: CONSTANTS COLON constantsBlock {parsingVariables=false;};

constantsBlock: field+;


//---------------------------------------
// Variables
//---------------------------------------

variables: VARIABLES COLON variablesBlock {parsingVariables=true;};

variablesBlock: factors? ncfactors? outcomes? extraneous?;

factors: FACTORS COLON factorDeclaration+;

ncfactors: NCFACTORS COLON factorDeclaration+;

outcomes: OUTCOME COLON outcomeDeclaration+;

outcomeDeclaration: factorDeclaration;

extraneous: EXTRANEOUS COLON extraneousDeclaration+;

extraneousDeclaration: (factorDeclaration)+;

factorDeclaration: id factorDeclarationType factorDeclarationRange? factorDeclarationUnits?;

factorDeclarationUnits: MEASURED IN id;

// Solo enum, float e integer?
factorDeclarationType : ORDERED? ENUM enumDeclaration
                      | type
                      | IN numericSet
                      ;
                        
enumDeclaration : StringLiteral (COMMA StringLiteral)+
                | IntegerLiteral (COMMA IntegerLiteral)+
                | FloatingPointLiteral (COMMA FloatingPointLiteral)+
                | functionalDeclaration (COMMA functionalDeclaration)+                
                ;

functionalDeclaration : id OPEN_PAR fields? CLOSE_PAR;



factorDeclarationRange : RANGE_MIN_MAX OPEN_SQU_BRA intervalLiteral COMMA intervalLiteral CLOSE_SQU_BRA
			  		   | MIN intervalLiteral
			  		   | MAX intervalLiteral
			  		   ;
			  		   
			  		   
intervalLiteral : IntegerLiteral | FloatingPointLiteral;


//---------------------------------------
// Hypothesis
//---------------------------------------

hypothesis: HYPOTHESIS COLON hypothesisDeclaration+;

hypothesisDeclaration: differentialHypothesis | associationalHypothesis | descriptiveHypothesis;

differentialHypothesis: implicitDifferentialHypothesis | explicitDifferentialHypothesis;

explicitDifferentialHypothesis: factorList IMPACTS SIGNIFICANTLY? ON outcome;

factorList: idList;

outcomeList:idList;

idList: id (COMMA id)* (AND id)?;

implicitDifferentialHypothesis: DIFFERENTIAL;

associationalHypothesis: implicitAssociationalHypothesis | explicitAssociationalHypothesis;

implicitAssociationalHypothesis: ASSOCIATIONAL;

explicitAssociationalHypothesis: outcome IS (LINEARLY | LOGISTICALLY)? CORRELATED WITH factorList;

outcome: id;

descriptiveHypothesis: DESCRIPTIVE;

//---------------------------------------
// Design                                               // Mirar bien la casuística de del principio del bloque!!
//---------------------------------------

design: DESIGN COLON designBlock;

designBlock: customDesignBlock
             | extensionPoint;
          
customDesignBlock: designSampling detailedDesign? groups protocol analyses;

designSampling: SAMPLING COLON samplingType designAssignment? designBlocking?;

samplingType : RANDOM
             | ADHOC StringLiteral
             ;

designAssignment: ASSIGNMENT COLON (RANDOM|id);          // Posibles valores?

designBlocking: BLOCKING COLON id (COMMA id)*;

detailedDesign: DETAILED_DESIGN COLON id designAssignment? designBlocking?;

groups: GROUPS COLON groupsExpresion;
          
groupsExpresion : BY id (COMMA id)* sizingSentence
                | functionalDeclaration sizingSentence (COMMA functionalDeclaration sizingSentence)*
                | sizingSentence
                ;

sizingSentence: SIZING IntegerLiteral;

protocol: PROTOCOL COLON (RANDOM|explicitProtocol);

explicitProtocol: protocolStep+	
;

protocolStep: measurement | treatment;

measurement: MEASUREMENT  (id COMMA)* functionalDeclaration;

treatment: TREATMENT (id COMMA)* functionalDeclaration;

analyses: ANALYSES COLON analysesBlocks;

analysesBlocks: analysesBlock+;

analysesBlock: id COLON statisticFunction+;

statisticFunction : rankingSF
                  | centralTendencyMeasurementSF
                  | variabilityMeasureSF
                  | confidenceIntervalSF
                  | correlationCoeficientSF
                  | nhstSF
                  | extensionPoint
                  ;

rankingSF: rFunction OPEN_PAR (centralTendencyMeasurementSF | variabilityMeasureSF) COMMA id CLOSE_PAR;
rFunction: RANKING;

centralTendencyMeasurementSF: ctmFunction OPEN_PAR statisticFunctionParam (COMMA statisticFunctionParam)* CLOSE_PAR;
ctmFunction: MEAN|MODE|MEDIAN;

variabilityMeasureSF: vmFunction OPEN_PAR statisticFunctionParam (COMMA statisticFunctionParam)*  CLOSE_PAR;
vmFunction: STDDEV|VARIANCE|IQR|RANGE;

confidenceIntervalSF: ciFunction OPEN_PAR statisticFunctionParam CLOSE_PAR;
ciFunction: CONFIDENCE_INTERVAL;

correlationCoeficientSF: ccFunction OPEN_PAR statisticFunctionParam (COMMA statisticFunctionParam)* CLOSE_PAR;
ccFunction: PEARSON|BIVARIATE_REGRESSION|SPEARMAN|KENDALL|CRAMER|LOG_LINEAR;

nhstSF: nhstFunction OPEN_PAR statisticFunctionParam COMMA statisticFunctionParam CLOSE_PAR;
nhstFunction : KOLMOGOROV_SMIRNOV|LILLIEFORS|SHAPIRO_WILK|LEVENE|T_STUDENT|WILCOXON|MCNEMAR|ANOVA|FACTANOVAWRS|
               FRIEDMAN|ALIGNED_FRIEDMAN|IMAN_DAVEPORT|QUADE|COCHRAN_Q|BONFERRONI_DUNN|HOLMS|HOCHBERG|HOMMEL|
               HOLLAND|ROM|FINNER|LI|SHAFFER|NAMENYI|TTEST|SIGN_TEST|CHI_SQUARE|KRUSKAL|FISHER|TUKEY;
               

statisticFunctionParam : statisticFunctionValue 
                       | statisticFunctionFilter
                       | statisticFunctionParamVariable
                       |
                       ;
statisticFunctionParamVariable: assignment? (COMMA assignment)*;

assignment: id (EQUAL value)?;

statisticFunctionValue: IntegerLiteral | FloatingPointLiteral;

statisticFunctionFilter: oldStatisticFunctionFilter | newStatisticFunctionFilter;

oldStatisticFunctionFilter: filter (DOT grouping)? (DOT projection)? | grouping (DOT projection)?;

newStatisticFunctionFilter: ofDSSpec? whereDSSpec? byDSSpec?;

ofDSSpec: OF id (COMMA id)*;

whereDSSpec: WHERE statisticFunctionParamVariable;

byDSSpec: BY id (COMMA id)*;

filter: FILTER OPEN_PAR statisticFunctionParamVariable CLOSE_PAR;

grouping: GROUPING OPEN_PAR OPEN_BRA id (COMMA id)* CLOSE_BRA CLOSE_PAR;

projection: PROJ OPEN_PAR id (COMMA id)* CLOSE_PAR;

//analysesExpression: id OPEN_PAR (analysesValue (COMMA analysesValue)*) CLOSE_PAR analysesAccessor?;

//analysesValue : analysesExpression | id | analysesConstant;

//analysesConstant: IntegerLiteral|FloatingPointLiteral;

//analysesAccessor: DOT GROUPING OPEN_PAR OPEN_BRA groupingValues CLOSE_BRA CLOSE_PAR;

//groupingValues: id (COMMA id)*;


//----------------------------------
// Configuration
//----------------------------------

configuration: CONFIGURATION COLON configurationBlock+;

configurationBlock: id COLON singleConf;

singleConf: inputs? outputs? settings? experimentalProcedure execution?;
	
inputs: INPUTS COLON files (COMMA files)*;
	
outputs: OUTPUTS COLON files (COMMA files)*;

files: file roles? format? mapping?;

file: FILE StringLiteral;

roles: ROLE COLON (MISCELLANEOUS | MAIN_RESULT | ADDITIONAL_EVIDENCE);

format: FORMAT COLON id;

mapping: MAPPING COLON id;

settings: SETTING COLON runtimes? libraries?;

runtimes: RUNTIMES COLON runtime (COMMA runtime)*;

runtime: id versionNumber;

libraries: LIBRARIES COLON library (COMMA library)*;

library: id versionNumber;

experimentalProcedure: PROCEDURE COLON (unstructuredProcedureDefinition | structuredProcedureDefinition);
                       
unstructuredProcedureDefinition:                    
                       (procedureStep)*;

procedureStep: procDef COLON procBody;

procDef: COMMAND (AS procedureStepType)? (OPEN_PAR id (COMMA id)* CLOSE_PAR)?;

procedureStepType: treatmentStep | measurementStep | preprocessingStep | postprocestingStep | extensionPointStep;
treatmentStep: TREATMENT;
measurementStep:MEASUREMENT;
postprocestingStep: POSTPROCESSING;
extensionPointStep: pretreatmentClause? extensionPoint;
preprocessingStep: pretreatmentClause? PREPROCESSING;
procBody: StringLiteral;

structuredProcedureDefinition: preProcessingDefinition? executionProcedureDefinition postProcessing?;
preProcessingDefinition: PREPROCESSING COLON (procedureStep)*;
pretreatmentClause: PRETREATMENT (OPEN_PAR id (COMMA id)* CLOSE_PAR)?;                    
executionProcedureDefinition: EXECUTION COLON (procedureStep)*;
postProcessing: POSTPROCESSING COLON (procedureStep)*;

//Executions---
execution: RUNS COLON executionBlock+;

executionBlock: id COLON executionConf;

executionConf: (execStart execEnd)? resultExecution analysesExecution?;

execStart: START COLON StringLiteral;

execEnd: END COLON StringLiteral;

resultExecution: RESULT COLON fileExec*;

analysesExecution:ANALYSES COLON analysesExecBlock+;

analysesExecBlock: id COLON analFunctions; 

analFunctions: exeFunction (COMMA exeFunction)*;

exeFunction: exeFunctionTypes? exeArguments? COLON (values | friedmanFunction | pearsonFunction); 

values: value value*;

exeFunctionTypes: (vmFunction|ctmFunction|nhstFunction|ccFunction|ciFunction|rFunction);

exeDescription: DESCRIPTION COLON StringLiteral;

exeArguments:  OPEN_PAR arg (BAR arg)? (VS arg)? (COMMA otherParam)? (PLUS arg)? CLOSE_PAR;

otherParam: OPEN_BRA arg CLOSE_BRA;

arg: id;

exeValuation: (PVALUE|STHRESHOLD) COLON value ((PVALUE|STHRESHOLD) COLON value)*;

fileExec: FILE COLON StringLiteral;

freedom_degrees: FREEDOM_DEGREES COLON value;

fdParam: OPEN_BRA exeArguments exeValuation CLOSE_BRA;

bodyTempDiff: OPEN_BRA pairIV CLOSE_BRA;

pairIV: (id|numericSet) COLON value (COMMA (id|numericSet) COLON value)*;

pair: value+;

friedmanFunction: PVALUE COLON value (COMMA exeDescription)? (COMMA freedom_degrees)? (fdParam (COMMA fdParam))?;

pearsonFunction: OPEN_BRA numericSet COLON value COMMA arg COLON value COMMA regresionBlock CLOSE_BRA;

regresionBlock: regresion COLON value;

regresion: RRES;

//--------------
                 
//----------------------------------
// COMMONS
//----------------------------------

id: Identifier;

email: Email;

versionNumber: FloatingPointLiteral | ExplicitVersionNumber;

url: Url;

repUrl : Url;

value : FloatingPointLiteral
      | IntegerLiteral
      | BooleanLiteral
      | StringLiteral
      ;

type: FLOAT|INTEGER|BOOL;

structValue: OPEN_BRA fields CLOSE_BRA;

fields: field (COMMA field)*;

field: id COLON (structValue|value);

numericSet: N|Z|Q|R|I|C;


//---------------------------------------
// Extension Points
//---------------------------------------
// Design:
extensionPoint : Identifier EXTENSION_POINT_CONTENT ;


/*=====================================
            LEXICAL RULES
 ======================================*/

EXTENSION_POINT_CONTENT: DOUBLECOLON OPEN_BRA .*? CLOSE_BRA // Multiple lines content
                       | DOUBLECOLON .*? '\r'? '\n' // Single Line Content 
                       ;

//---------------------------------------
// Language Keywords
//---------------------------------------
IMPORT: 'import';
EXPERIMENT: 'EXPERIMENT';
TYPE: 'type';
VERSION: 'version';
REP: 'rep';             
NOTES: 'Notes';
ANNOTATIONS: 'Annotations';
SUBJECTS: 'Subjects';
OBJECT: 'Object';
POPULATION: 'Population';
RESPONSIBLE: 'Responsible';
COLLABORATOR: 'Collaborator';

CONSTANTS: 'Constants';

VARIABLES: 'Variables';
FACTORS: 'Factors';
NCFACTORS: 'NCFactors';
OUTCOME: 'Outcome';
EXTRANEOUS: 'Extraneous';
MEASURED: 'measured';

ORDERED: 'ordered';
ENUM: 'enum';
INTEGER: 'integer';
FLOAT: 'float';
BOOL: 'boolean';
RANGE_MIN_MAX: 'range';

HYPOTHESIS: 'Hypothesis';
DIFFERENTIAL: 'Differential';
ASSOCIATIONAL: 'Associational';
DESCRIPTIVE: 'Descriptive';

DESIGN: 'Design';
SAMPLING: 'Sampling';
ASSIGNMENT: 'Assignment';
DETAILED_DESIGN: 'Detailed_Design';
BLOCKING: 'Blocking';
SIZING: 'sizing';
GROUPS: 'Groups';
PROTOCOL: 'Protocol';
ANALYSES: 'Analyses';
OF: 'of';
WHERE: 'where';
FILTER: 'Filter';
GROUPING: 'Grouping';
PROJ: 'Proj'; 

LINEAR: 'linear';   //??
CUADRATIC: 'cuadratic'; //??
RANDOM: 'Random';
ADHOC: 'Adhoc';
CONFIGURATION : 'Configuration';

OUTPUTS: 'Outputs';
INPUTS: 'Inputs';
SETTING: 'Setting';
PROCEDURE: 'Procedure';
RUNTIMES: 'Runtimes';
LIBRARIES: 'Libraries';
OPERATING_SYSTEM: 'OperatingSystem';

COMMAND : 'Command';
TREATMENT : 'Treatment';
MEASUREMENT : 'Measurement';
FILE: 'File';
ROLE: 'role';
FORMAT: 'format';
MAPPING: 'mapping';


RUNS: 'Runs';
RESULT: 'Result';
PVALUE: 'Pvalue';
DESCRIPTION: 'description';
STHRESHOLD: 'Sthreshold';
FREEDOM_DEGREES: 'freedom_degrees';
VS: 'vs';
PLUS: '+';
SIGNMIN: '-';
RRES: 'r';

START: 'Start';
END: 'End';

//---------------------------------------
// Numeric Sets
//---------------------------------------

N: 'N';
Z: 'Z';
Q: 'Q';
R: 'R';
I: 'I';
C: 'C';

MAX: 'max';
MIN: 'min';


//---------------------------------------
// Statistic
//---------------------------------------

// Descriptive
MEAN: 'Avg';
MODE: 'Mode';
MEDIAN: 'Median';
STDDEV: 'StdDev';
VARIANCE: 'Variance';
IQR: 'IQR';
RANGE: 'Range';

// Ranking
RANKING: 'Ranking';

// Confidence Interval
CONFIDENCE_INTERVAL: 'CI';

// Correlation
PEARSON: 'Pearson';
BIVARIATE_REGRESSION: 'BivariateRegression';
SPEARMAN: 'Spearman';
KENDALL: 'Kendall';
CRAMER: 'CRAMER';
LOG_LINEAR: 'LogLinear';

// NHST
KOLMOGOROV_SMIRNOV : 'Kolmogorov-Smirnov';
LILLIEFORS: 'Lilliefors';
SHAPIRO_WILK: 'Shapiro-Wilk';
LEVENE: 'Levene';
T_STUDENT: 'T-student';
WILCOXON: 'Wilcoxon';
MCNEMAR: 'McNemar';
ANOVA: 'ANOVA';
FACTANOVAWRS: 'FactANOVAwRS';
FRIEDMAN: 'Friedman';
ALIGNED_FRIEDMAN: 'Aligned Friedman';
IMAN_DAVEPORT: 'Iman & Davenport';
QUADE: 'Quade';
COCHRAN_Q: 'Cochran Q';
BONFERRONI_DUNN: 'Bonferroni-Dunn';
HOLMS: 'Holms';
HOCHBERG: 'Hochberg';
HOMMEL: 'Hommel';
HOLLAND: 'Holland';
ROM: 'Rom';
FINNER: 'Finner';
LI: 'Li';
SHAFFER: 'Shaffer';
NAMENYI: 'Nemenyi';
// From page 61-62:
TTEST: 'TTest';
SIGN_TEST: 'SignTest';
CHI_SQUARE: 'Chi Square';
KRUSKAL: 'KruskalWalls';
FISHER: 'Fisher';
TUKEY: 'Tukey';

// --------
//	Configuration Protocol step types
//---------
PREPROCESSING:'Preprocessing';
PRETREATMENT: 'Pretreatment';
EXECUTION: 'Execution';
POSTPROCESSING: 'Postprocessing';

// --------
//	Configuration File Role values
//---------

MAIN_RESULT : 'MainResult';
ADDITIONAL_EVIDENCE : 'AdditionalEvidence';
MISCELLANEOUS : 'Miscellaneous'; 


//---------------------------------------
// Commons tokens
//---------------------------------------

OPEN_PAR: '(';
CLOSE_PAR: ')';
OPEN_BRA: '{';
CLOSE_BRA: '}';
OPEN_SQU_BRA: '[';
CLOSE_SQU_BRA: ']';
DOT: '.';
FROM: 'from';
AS: 'as';
IS: 'is';
IN: 'in';
ON: 'on';
AND: 'and';
IMPACTS: 'impacts';
SIGNIFICANTLY: 'significantly';
BY: 'by';
LINEARLY: 'linearly';
LOGISTICALLY: 'logistically';
CORRELATED: 'correlated'; 
WITH: 'with';
BAR: '|';
EQUAL: '=';


//---------------------------------------
// Basic Lexical Elements
//---------------------------------------

Identifier: Letter ('-'|'_'|LetterOrDigit)*
          ;

fragment
    Letter
    :   [a-zA-Z$_] 
    ;

fragment
    LetterOrDigit
    :   [a-zA-Z0-9$_]
    ;


// Comments
COMMENT
    :   ( '/*' .*? '*/'  )  -> channel(COMMENTS);

LINE_COMMENT
    :  ( '//' ~[\r\n]*  )  -> channel(COMMENTS);

// Literals

IntegerLiteral
    :   DecimalNumeral IntegerTypeSuffix?
    ;



fragment
IntegerTypeSuffix
    :   [lL]
    ;

fragment
DecimalNumeral
    :   '0'
    |   NonZeroDigit (Digits? | Underscores Digits)
    ;

fragment
Digits
    :   Digit (DigitOrUnderscore* Digit)?
    ;

fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

fragment
DigitOrUnderscore
    :   Digit
    |   '_'
    ;

fragment
Underscores
    :   '_'+    ;


// Floating-Point Literals

ExplicitVersionNumber: Digits (DOT Digits) (DOT Digits)+;  

FloatingPointLiteral:   DecimalFloatingPointLiteral |[+-]DecimalFloatingPointLiteral 
                    ;
                 

fragment
DecimalFloatingPointLiteral
    :   Digits '.' Digits? ExponentPart? FloatTypeSuffix?
    |   '.' Digits ExponentPart? FloatTypeSuffix?
    |   Digits ExponentPart FloatTypeSuffix?
    |   Digits FloatTypeSuffix
    ;

fragment
ExponentPart
    :   ExponentIndicator SignedInteger
    ;

fragment
ExponentIndicator
    :   [eE]
    ;

fragment
SignedInteger
    :   Sign? Digits
    ;

fragment
Sign
    :   [+-]
    ;

fragment
FloatTypeSuffix
    :   [fFdD]
    ;


// Boolean Literals

BooleanLiteral
    :   'true'
    |   'false'
    ;

// Character Literals

CharacterLiteral
    :   '\'' SingleCharacter '\''    
    ;

fragment
SingleCharacter
    :   ~['\\]
    ;

// String Literals

StringLiteral : '\'' ~[']* '\''
              | '"' ~["]* '"'
    ;

fragment
StringCharacters
    :   StringCharacter+
    ;

fragment
StringCharacter
    :   ~["\\]    
    ;

Url : ('http'|'https'|'ftp'|'file')':''/''/'[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]
    ;

Email : [-a-zA-Z0-9+._]+ '@' [-a-zA-Z0-9+._]+ '.' [a-zA-Z]+
      ;


//---------------------------------------
// Punctuation marks
//---------------------------------------

COMMA: ',';
COLON: ':';
DOUBLECOLON: '::';

//---------------------------------------
// Ingoner spaces, tabs, newlines
//---------------------------------------

WS : [ \t\r\n]+ -> skip ;


