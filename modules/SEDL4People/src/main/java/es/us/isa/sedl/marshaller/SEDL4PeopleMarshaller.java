package es.us.isa.sedl.marshaller;

import es.us.isa.sedl.core.BasicExperiment;
import es.us.isa.sedl.core.Experiment;
import es.us.isa.sedl.core.analysis.datasetspecification.DatasetSpecification;
import es.us.isa.sedl.core.analysis.datasetspecification.Filter;
import es.us.isa.sedl.core.analysis.datasetspecification.GroupingProjection;
import es.us.isa.sedl.core.analysis.datasetspecification.Projection;
import es.us.isa.sedl.core.analysis.datasetspecification.ValuationFilter;
import es.us.isa.sedl.core.analysis.statistic.NHST;
import es.us.isa.sedl.core.analysis.statistic.Statistic;
import es.us.isa.sedl.core.configuration.CommandExperimentalTask;
import es.us.isa.sedl.core.configuration.ComplexParameter;
import es.us.isa.sedl.core.configuration.ComputationEnvironment;
import es.us.isa.sedl.core.configuration.Configuration;
import es.us.isa.sedl.core.configuration.ExperimentalEnvironment;
import es.us.isa.sedl.core.configuration.ExperimentalOutputs;
import es.us.isa.sedl.core.configuration.ExperimentalProcedure;
import es.us.isa.sedl.core.configuration.ExperimentalSetting;
import es.us.isa.sedl.core.configuration.ExperimentalTask;
import es.us.isa.sedl.core.configuration.Library;
import es.us.isa.sedl.core.configuration.OutputDataSource;
import es.us.isa.sedl.core.configuration.Parameter;
import es.us.isa.sedl.core.configuration.Runtime;
import es.us.isa.sedl.core.configuration.SimpleParameter;
import es.us.isa.sedl.core.design.AnalysisSpecification;
import es.us.isa.sedl.core.design.Constraint;
import es.us.isa.sedl.core.design.FundamentalSet;
import es.us.isa.sedl.core.design.ControllableFactor;
import es.us.isa.sedl.core.design.ExtensionDomain;
import es.us.isa.sedl.core.design.FullySpecifiedExperimentalDesign;
import es.us.isa.sedl.core.design.FundamentalSetConstraint;
import es.us.isa.sedl.core.design.Group;
import es.us.isa.sedl.core.design.IntensionDomain;
import es.us.isa.sedl.core.design.IntervalConstraint;
import es.us.isa.sedl.core.design.Level;
import es.us.isa.sedl.core.design.Literal;
import es.us.isa.sedl.core.design.NonControllableFactor;
import es.us.isa.sedl.core.design.Outcome;
import es.us.isa.sedl.core.design.ProtocolScheme;
import es.us.isa.sedl.core.design.StatisticalAnalysisSpec;
import es.us.isa.sedl.core.design.Variable;
import es.us.isa.sedl.core.design.VariableKind;
import es.us.isa.sedl.core.design.VariableValuation;
import es.us.isa.sedl.core.hypothesis.AssociationalHypothesis;
import es.us.isa.sedl.core.hypothesis.DescriptiveHypothesis;
import es.us.isa.sedl.core.hypothesis.DifferentialHypothesis;
import es.us.isa.sedl.core.hypothesis.Hypothesis;
import es.us.isa.sedl.grammar.SEDL4PeopleLexer;
import es.us.isa.sedl.core.util.SEDLMarshaller;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class SEDL4PeopleMarshaller implements  SEDLMarshaller{

	private StringBuilder sedlCode;
	private Experiment experiment;
	
	private final String TAB = "\t"; 
	private final String RET = "\n";
	private final String ESP = " ";
	
	public List<String> write(Experiment exp, OutputStream os)
			throws IOException {
		return null;
	}

	
        @Override
	public String asString(Experiment exp) {
		experiment = exp;
                sedlCode=new StringBuilder();
		sedlCode.append(writeExperimentPreamble(exp));
		sedlCode.append(writeExperimentContext(exp));
		sedlCode.append(writeConstantsBlock(exp));
		sedlCode.append(writeVariablesBlock(exp));
		sedlCode.append(writeHypothesis(exp));
		sedlCode.append(writeDesign(exp));
		sedlCode.append(writeAnalyses(exp));
		sedlCode.append(writeConfigurations(exp));
		return sedlCode.toString();
	}
	
	private String writeExperimentPreamble (Experiment exp) {
		StringBuilder sb=new StringBuilder(getTokenName(
                            SEDL4PeopleLexer.EXPERIMENT));
                sb.append(getTokenName(
                            SEDL4PeopleLexer.COLON
                )).append(
                            ESP
                ).append(
                            experiment.getId()
                ).append(
                            ESP
                );
                if(experiment.getVersion()!=null){
                    sb.append(getTokenName(
                            SEDL4PeopleLexer.VERSION
                    )).append(
                            ESP
                    ).append(
                            experiment.getVersion()
                    ).append(
                            ESP
                    );
                }
                if(experiment.getMetaid()!=null){
                    sb.append(getTokenName(
                            SEDL4PeopleLexer.REP
                        )).append(getTokenName(
                            SEDL4PeopleLexer.COLON
                        )).append(   
                            ESP
                        ).append(   
                            experiment.getMetaid()  
                        );
                }
                sb.append(   RET         );
                return sb.toString();
	}

	private String writeExperimentContext (Experiment exp) {
		StringBuilder sb=new StringBuilder();
                BasicExperiment e = (BasicExperiment)experiment;
		if ( !experiment.getNotes().isEmpty() ) {
			sb.append(TAB)
                                .append(getTokenName(SEDL4PeopleLexer.NOTES))
                                .append(getTokenName(SEDL4PeopleLexer.COLON))
                                .append(RET);
			for ( String note : experiment.getNotes() ) {
				sb.append(TAB)
                                  .append(TAB)
                                  .append(note)
                                  .append(RET);
			}
		}
		if ( !experiment.getAnnotations().isEmpty() ) {
			sb.append(TAB)
                          .append(getTokenName(SEDL4PeopleLexer.ANNOTATIONS))
                          .append(getTokenName(SEDL4PeopleLexer.COLON))
                          .append(RET);
			for ( String annotation: experiment.getAnnotations() ) {
				sb.append(TAB)
                                  .append(TAB)
                                  .append(annotation)
                                  .append(RET);
			}
		}
		
		// Object: 
		if ( e.getDesign().getPopulation().getIndividualDescription() != null && !e.getDesign().getPopulation().getIndividualDescription().equals("") ) {
			sb.append(TAB)
                          .append(getTokenName(SEDL4PeopleLexer.OBJECT))
                          .append(getTokenName(SEDL4PeopleLexer.COLON))
                          .append(e.getDesign().getPopulation().getIndividualDescription())
                          .append(RET);
		}
		// Population: 
		if ( e.getDesign().getPopulation().getAccesiblePopulation() != null && !e.getDesign().getPopulation().getAccesiblePopulation().equals("") ) {
			sb.append(TAB)
                          .append(getTokenName(SEDL4PeopleLexer.POPULATION))
                          .append(getTokenName(SEDL4PeopleLexer.COLON))
                          .append(e.getDesign().getPopulation().getAccesiblePopulation())
                          .append(RET);
		}
                return sb.toString();
	}
	
	private String writeConstantsBlock(Experiment experiment) {
		BasicExperiment exp = null;
                StringBuilder sb=new StringBuilder();
		if ( experiment instanceof BasicExperiment ) {
			exp = (BasicExperiment)experiment;
		}
		if ( exp != null ) {
			sb.append(getTokenName(SEDL4PeopleLexer.CONSTANTS))
                          .append(getTokenName(SEDL4PeopleLexer.COLON))
                          .append(RET);
			for ( Parameter p: exp.getDesign().getDesignParameters() ) {
				if ( p instanceof SimpleParameter ) {
					SimpleParameter param = (SimpleParameter)p;
					sb.append(TAB)
                                          .append(
                                             param.getName())
                                          .append(ESP)
                                          .append(getTokenName(
                                            SEDL4PeopleLexer.COLON))
                                          .append(ESP)
                                          .append(
                                             param.getValue())
                                          .append(RET);
				}else if ( p instanceof ComplexParameter ) {
					ComplexParameter param = (ComplexParameter)p;
					sb.append(TAB)
                                          .append(
                                                param.getName())
                                          .append(ESP)
                                          .append(
                                                getTokenName(SEDL4PeopleLexer.COLON))
                                           .append(ESP)
                                           .append(
                                                getTokenName(SEDL4PeopleLexer.OPEN_BRA));
						for ( int i = 0; i < param.getParameters().size(); i++ ) {
							Parameter sp = param.getParameters().get(i);
							if ( sp instanceof SimpleParameter ) {
								if ( i != 0 ) {
									sb.append(getTokenName(SEDL4PeopleLexer.COMMA));
								}
								sb.append(sp.getName())
                                                                  .append(getTokenName(SEDL4PeopleLexer.COLON))
                                                                  .append(((SimpleParameter)sp).getValue());
							}
						}
					sb.append(getTokenName(SEDL4PeopleLexer.CLOSE_BRA)).append(RET);
					
				} else {
					System.out.println("Can not find parameter " + p.getName() + " type.");
				}
			}
		}
                return sb.toString();
	}
	
	private String writeVariablesBlock(Experiment experiment) {
		StringBuilder sb=new StringBuilder( 
                        getTokenName(SEDL4PeopleLexer.VARIABLES));
                sb.append(
                        ESP
                ).append(
                        getTokenName(SEDL4PeopleLexer.COLON)
                ).append(RET
                ).append(
                    writeFactorsBlock()
                ).append(        
                    writeNCFactorsBlock()
                ).append(        
                    writeOutcomeBlock()
                );
		return sb.toString();
	}
	
	private String writeFactorsBlock () {
		BasicExperiment exp = null;
		if ( experiment instanceof BasicExperiment ) {
			exp = (BasicExperiment)experiment;
		}
		StringBuilder sb=new StringBuilder();
		if ( exp != null ) {
			sb.append(
                                TAB
                        ).append(
                                getTokenName(SEDL4PeopleLexer.FACTORS)
                        ).append(
                                ESP
                        ).append(
                                getTokenName(SEDL4PeopleLexer.COLON)
                        ).append(RET);                        
			for ( Variable v : exp.getDesign().getVariables().getVariable() ) {
                            if(v instanceof ControllableFactor)
                                sb.append(printVariable(v));
			}
		}
                return sb.toString();
	}
        
        private String printVariable(Variable v)
        {
            StringBuilder sb=new StringBuilder();            
            sb.append(
                TAB
            ).append(
                TAB 
            ).append(
                v.getName()
            ).append(
                ESP
            ).append(
                printDomain(v)
            );
            return sb.toString();				
        }
        
        private String printDomain(Variable v)
        {
            String result=null;
            if ( v.getKind().equals(VariableKind.NOMINAL) || v.getKind().equals(VariableKind.ORDINAL)) {
                result=printExtensionDomain((ExtensionDomain)v.getDomain());                
            } else if ( v.getKind().equals(VariableKind.SCALAR)) {
		result=printIntensionDomain((IntensionDomain)v.getDomain());
            } else {
		System.out.println("Error, variableKind don't found: " + v.toString());
            }
            return result;				
        }
        
        private String printExtensionDomain(ExtensionDomain domain)
        {
            StringBuilder sb=new StringBuilder();            
            sb.append(
                    getTokenName(SEDL4PeopleLexer.ENUM));
            for ( int i = 0; i < domain.getLevels().size(); i++ ) {
                Level l = domain.getLevels().get(i);
		if ( i != 0 ) {
                    sb.append(
                        getTokenName(SEDL4PeopleLexer.COMMA));
                }
		sb.append(
                    ESP
                ).append(
                    printValue(l.getValue())
                );
            }
            sb.append(RET);
            return sb.toString();						
        }
        
        private String printValue(String value){
            String result=value;
            if(!StringUtils.isNumeric(value) && !isFunctionalExpression(value))
                result="'"+value+"'";
            return result;
        }
        
        private boolean isFunctionalExpression(String value){
            return value.contains("(");
        }
        
        
        private String printIntensionDomain(IntensionDomain dom)
        {
            StringBuilder sb=new StringBuilder();
            for(Constraint c:dom.getConstraint()){
                if(c instanceof FundamentalSetConstraint)
                    sb.append(printFundamentalSetConstraint((FundamentalSetConstraint)c));            
                else if(c instanceof IntervalConstraint)
                    sb.append(printIntervalConstraint((IntervalConstraint)c));
                sb.append(ESP);
            }
            sb.append(
                    RET
                );
            return sb.toString();					
        }
            
        private String printFundamentalSetConstraint(FundamentalSetConstraint c){
            String result=null;
            
            switch(c.getFundamentalSet()){
                case R:
                    result=getTokenName(SEDL4PeopleLexer.FLOAT);
                case B:
                    result=getTokenName(SEDL4PeopleLexer.BOOL);
                case N:
                    result=getTokenName(SEDL4PeopleLexer.INTEGER);
                    break;
                case Z:
                    result=getTokenName(SEDL4PeopleLexer.INTEGER);
                    break;
            }		
            
            return result;
        }
	
        private String printIntervalConstraint(IntervalConstraint c){
            StringBuilder sb=new StringBuilder();
            sb.append(
                    getTokenName(SEDL4PeopleLexer.RANGE)
                ).append(ESP
                ).append(getTokenName(SEDL4PeopleLexer.OPEN_SQU_BRA)
                ).append(c.getMin()
                ).append(","
                ).append(c.getMax()
                ).append(getTokenName(SEDL4PeopleLexer.CLOSE_SQU_BRA));            
            return sb.toString();
        }
        
	private String writeNCFactorsBlock () {
                StringBuilder sb=new StringBuilder();
		BasicExperiment exp = null;
		if ( experiment instanceof BasicExperiment ) {
			exp = (BasicExperiment)experiment;
		}
		boolean ncFactorsExists = false;
		boolean titleWroten = false;
		if ( exp != null ) {
                    for ( Variable v : exp.getDesign().getVariables().getVariable() ) {
                        if ( v instanceof NonControllableFactor ) {	
                            if(!ncFactorsExists){
                                    sb.append(
                                        TAB
                                    ).append(
                                        getTokenName(SEDL4PeopleLexer.NCFACTORS)
                                    ).append(
                                        ESP
                                    ).append(
                                        getTokenName(SEDL4PeopleLexer.COLON)
                                    ).append(RET);
                                    ncFactorsExists=true;
                            }
                                
                            sb.append(printVariable(v));
			}
                    }
		}
                return sb.toString();
	}
	
	private String writeOutcomeBlock () {
            StringBuilder sb=new StringBuilder();
            BasicExperiment exp = null;
            if ( experiment instanceof BasicExperiment ) {
			exp = (BasicExperiment)experiment;
		}
		boolean outcomeExists = false;
		boolean titleWroten = false;
		if ( exp != null ) {
                        sb.append(
                                TAB
                        ).append(
                                getTokenName(SEDL4PeopleLexer.OUTCOME)
                        ).append(
                                ESP
                        ).append(
                                getTokenName(SEDL4PeopleLexer.COLON)
                        ).append(RET);
                    
			for ( Variable v : exp.getDesign().getVariables().getVariable() ) {
				if ( v instanceof Outcome ) {
					sb.append(printVariable(v));
				}
			}
		}
                return sb.toString();
		
	}
	
	private String writeHypothesis(Experiment experiment) {
		BasicExperiment exp = null;
                StringBuilder sb=new StringBuilder();
		if ( experiment instanceof BasicExperiment ) {
			exp = (BasicExperiment)experiment;
		}
		if ( exp != null ) {
			sb.append(
                                getTokenName(SEDL4PeopleLexer.HYPOTHESIS)
                        ).append(
                                getTokenName(SEDL4PeopleLexer.COLON)
                        ).append(
                                ESP);
                        if(exp.getHypotheses().size()>1)
                            sb.append(RET);
                        for(Hypothesis h:exp.getHypotheses()){
                            if ( h instanceof AssociationalHypothesis ) {
				sb.append(printAssociationalHypthesis((AssociationalHypothesis)h));
                            } else if ( h instanceof DescriptiveHypothesis ) {
				sb.append(printDescriptiveHypothesis((DescriptiveHypothesis)h));
                            } else if ( h instanceof DifferentialHypothesis ) {
				sb.append(printDifferentialHypothesis((DifferentialHypothesis)h));
                            } else {
                            	System.out.println("Unknown hypothesis type : " + h.toString());
                            }
                        sb.append(RET);
                        }
		}
                return sb.toString();
	}
	
	private String writeDesign(Experiment experiment) {
                StringBuilder sb=new StringBuilder();
                sb.append(
                        getTokenName(SEDL4PeopleLexer.DESIGN)
                ).append(
                        ESP
                ).append(
                        getTokenName(SEDL4PeopleLexer.COLON)
                ).append(
                        RET          );
		try {
			sb.append(
                            writeSampling(experiment)
                        ).append(
                            writeAssignment(experiment)
                        ).append(
                            writeBlockingVariables(experiment)
                        ).append(
                            writeDetailedDesign(experiment)
			).append(
                            writeGroups(experiment)
                        ).append(        
                            writeProtocol(experiment) );
		} catch ( Exception e ) {
			System.out.println("!! Error marshalling. !! ");
			e.printStackTrace();
		}
                return sb.toString();
	}
	
	private String writeSampling(Experiment experiment) {
		BasicExperiment exp = null;
		if ( experiment instanceof BasicExperiment ) {
			exp = (BasicExperiment)experiment;
		}
		StringBuilder sb=new StringBuilder();
		System.out.println("BEFORE SAMPLING: " + String.valueOf( exp != null ) +  "/" + String.valueOf(exp.getDesign() != null) + "//" + String.valueOf(exp.getDesign().getSamplingMethod() != null));
		if ( exp != null && exp.getDesign() != null && exp.getDesign().getSamplingMethod() != null ) {
			System.out.println(">>>>>>>>> WRITE SAMPLING 2");
			System.out.println("Writing: " + TAB + getTokenName(SEDL4PeopleLexer.SAMPLING) + ESP + getTokenName(SEDL4PeopleLexer.COLON) + ESP);
			sb.append(
                               TAB
                        ).append(
                                getTokenName(SEDL4PeopleLexer.SAMPLING)
                        ).append(
                                ESP
                        ).append(
                                getTokenName(SEDL4PeopleLexer.COLON)
                        ).append(
                                ESP
                        );
			if ( exp.getDesign().getSamplingMethod().isRandom()) {
				System.out.println("RANDOM!");
				sb.append(
                                        getTokenName(SEDL4PeopleLexer.RANDOM)
                                ).append(
                                        RET   );
			} else {
				System.out.println("NO RANDOM!");
				sb.append(
                                        exp.getDesign().getSamplingMethod().getDescription()
                                ).append(
                                        RET    );
			}
		}
                return sb.toString();
	}
	
	private String writeDetailedDesign(Experiment experiment) {
		BasicExperiment exp = null;
                StringBuilder sb=new StringBuilder();
		if ( experiment instanceof BasicExperiment ) {
			exp = (BasicExperiment)experiment;
		}
		if ( exp != null ) {
			// Cambiar el custom. Qué posibles valores hay?
			sb.append(
                                TAB
                        ).append(
                                getTokenName(SEDL4PeopleLexer.DETAILED_DESIGN)
                        ).append(getTokenName(SEDL4PeopleLexer.COLON)
                        ).append(
                                ESP
                        ).append(
                                "Custom"
                        ).append(
                                RET   );
		}
                return sb.toString();
	}
	
	private String writeAssignment(Experiment experiment) {
		BasicExperiment exp = null;
		if ( experiment instanceof BasicExperiment ) {
			exp = (BasicExperiment)experiment;
		}
                StringBuilder sb=new StringBuilder();
		if ( exp != null ) {
			if ( exp.getDesign().getExperimentalDesign() instanceof FullySpecifiedExperimentalDesign ) {
				FullySpecifiedExperimentalDesign fd = (FullySpecifiedExperimentalDesign)exp.getDesign().getExperimentalDesign();
				System.out.println("ASSIGNMENT: ?? " + fd.getAssignmentMethod());
				if ( fd.getAssignmentMethod() != null ) {
					sb.append(
                                                TAB
                                        ).append(
                                                getTokenName(SEDL4PeopleLexer.ASSIGNMENT)
                                        ).append(
                                                ESP
                                        ).append(
                                                getTokenName(SEDL4PeopleLexer.COLON)
                                        ).append(
                                                ESP   );
					if ( fd.getAssignmentMethod().isRandom()) {
						sb.append(getTokenName(SEDL4PeopleLexer.RANDOM));
					}else {
						sb.append(fd.getAssignmentMethod().getDescription());
					}
                                        sb.append(RET);
				}
			}
		}
                return sb.toString();
	}
	
	private String writeBlockingVariables(Experiment experiment) {
		BasicExperiment exp = null;
		if ( experiment instanceof BasicExperiment ) {
			exp = (BasicExperiment)experiment;
		}
                StringBuilder sb=new StringBuilder();
		if ( exp != null ) {
			if ( exp.getDesign().getExperimentalDesign() instanceof FullySpecifiedExperimentalDesign ) {
				FullySpecifiedExperimentalDesign fd = (FullySpecifiedExperimentalDesign)exp.getDesign().getExperimentalDesign();
				if ( !fd.getBlockingVariables().isEmpty() ) {
					sb.append(
                                                TAB
                                        ).append(
                                                getTokenName(SEDL4PeopleLexer.BLOCKING)
                                        ).append(
                                                getTokenName(SEDL4PeopleLexer.COLON)   );
					for ( int i = 0; i < fd.getBlockingVariables().size(); i++ ) {
                                            NonControllableFactor var =(NonControllableFactor) exp.getDesign().getVariables().getVariableByName(fd.getBlockingVariables().get(i));
                                            if ( i!= 0 ) {
						sb.append(
                                                        getTokenName(SEDL4PeopleLexer.COMMA) );
                                            }
                                            sb.append(
                                                    var.getName() ); 
					}
					sb.append(RET);
				}
			}
		}
                return sb.toString();
	}
	
	private String writeGroups(Experiment experiment) {
		BasicExperiment exp = null;
		if ( experiment instanceof BasicExperiment ) {
			exp = (BasicExperiment)experiment;
		}
                StringBuilder sb=new StringBuilder();
		if ( exp != null ) {
			if ( exp.getDesign().getExperimentalDesign() instanceof FullySpecifiedExperimentalDesign ) {
				FullySpecifiedExperimentalDesign fd = (FullySpecifiedExperimentalDesign)exp.getDesign().getExperimentalDesign();
				if ( !fd.getGroups().isEmpty() ) {
					sb.append(
                                                TAB
                                        ).append(getTokenName(
                                                SEDL4PeopleLexer.GROUPS)
                                        ).append(
                                                ESP
                                        ).append(getTokenName(
                                                SEDL4PeopleLexer.COLON)
                                        ).append(
                                                ESP );
					for ( int i = 0; i < fd.getGroups().size(); i++ ) {
						Group g = fd.getGroups().get(i);
						if ( i != 0 ) {
							sb.append(getTokenName(SEDL4PeopleLexer.COMMA));
						}
						Literal l = (Literal) g.getSizing();
						sb.append(
                                                        g.getName()
                                                ).append(
                                                        ESP
                                                ).append(
                                                        getTokenName(SEDL4PeopleLexer.SIZING)
                                                ).append(
                                                        ESP
                                                ).append(
							l.getValue().intValue()
                                                );
					}
					sb.append(RET);
				}
			}
		}
                return sb.toString();
	}

	private String writeProtocol(Experiment experiment) {
		BasicExperiment exp = null;
		if ( experiment instanceof BasicExperiment ) {
			exp = (BasicExperiment)experiment;
		}
		StringBuilder sb=new StringBuilder();
		if ( exp != null ) {
			if ( exp.getDesign().getExperimentalDesign() instanceof FullySpecifiedExperimentalDesign ) {
				FullySpecifiedExperimentalDesign fd = (FullySpecifiedExperimentalDesign)exp.getDesign().getExperimentalDesign();
				sb.append(
                                        TAB
                                ).append(getTokenName(
                                        SEDL4PeopleLexer.PROTOCOL)
                                ).append(
                                        ESP
                                ).append(getTokenName(
                                        SEDL4PeopleLexer.COLON)
                                ).append(
                                        ESP                       ); 
						
				if ( fd.getExperimentalProtocol().getScheme().equals(ProtocolScheme.RANDOM )) {
					sb.append(getTokenName(SEDL4PeopleLexer.RANDOM));
				} else if ( fd.getExperimentalProtocol().getScheme().equals(ProtocolScheme.SEQUENTIAL )) {
					// Añadir token SEQUENTIAL a la gramática
					sb.append("Sequential");
				} else {
					System.out.println("Protocol scheme not found.");
				}
                                sb.append(RET);
			}
		}
                return sb.toString();
	}
	
	private String writeAnalyses(Experiment experiment) {
		BasicExperiment exp = null;
		if ( experiment instanceof BasicExperiment ) {
			exp = (BasicExperiment)experiment;
		}
		StringBuilder sb=new StringBuilder();
		if ( exp != null ) {
			if ( exp.getDesign().getExperimentalDesign() instanceof FullySpecifiedExperimentalDesign ) {
				sb.append(
                                        TAB
                                ).append(getTokenName(
                                        SEDL4PeopleLexer.ANALYSES)
                                ).append(
                                        ESP
                                ).append(getTokenName(
                                        SEDL4PeopleLexer.COLON)
                                ).append(RET);
				FullySpecifiedExperimentalDesign fd = (FullySpecifiedExperimentalDesign)exp.getDesign().getExperimentalDesign();
				int cont = 1;
				for ( AnalysisSpecification analyses : fd.getIntendedAnalyses() ) {                                    
                                    sb.append(printAnalysis(analyses,cont));		
                                    cont++;
				}
			}
		}
                return sb.toString();
	}       
        
        private String printAnalysis(AnalysisSpecification analysisSpec, int cont)
        {
            StringBuilder sb=new StringBuilder();
            if ( analysisSpec instanceof StatisticalAnalysisSpec ) {
		sb.append(
                        TAB
                ).append(
                        TAB
                ).append(
                        "A"
                ).append(
                        cont
                ).append(
                        ESP
                ).append(
                        getTokenName(SEDL4PeopleLexer.COLON)
                ).append(
                        RET );
		StatisticalAnalysisSpec ana = (StatisticalAnalysisSpec)analysisSpec;						
                for ( Statistic stat : ana.getStatistic() ) {
                    String ending = "";
                    if ( stat instanceof NHST ) {
                        sb.append(printNHST((NHST)stat));																
                    }																												
		}
					}
					cont++;
            return sb.toString();
        }
        
        private String printNHST(NHST nhst)
        {
            StringBuilder sb=new StringBuilder();
            sb.append(
                    TAB
            ).append(
                    TAB
            ).append(
                    TAB 
            ).append(
                    nhst.getName()
            ).append(
                    getTokenName(SEDL4PeopleLexer.OPEN_PAR)
	    ).append(
                    printDatasetSpecification(nhst.getDatasetSpecification())
            ).append(
                    getTokenName(SEDL4PeopleLexer.COMMA)
            ).append(
                    ESP
            ).append(
                    nhst.getAlpha()
            ).append(
                    getTokenName(SEDL4PeopleLexer.CLOSE_PAR)
            );
            return sb.toString();
                    
        }
        
        private String printDatasetSpecification(DatasetSpecification dataSpec)
        {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < dataSpec.getFilters().size(); i++) {
                Filter f = dataSpec.getFilters().get(i);
                if (i != 0) {
                    sb.append(getTokenName(
                            SEDL4PeopleLexer.DOT));
                }
                sb.append(printFilter(f));                
            }

            for (int i = 0; i < dataSpec.getProjections().size(); i++) {
                Projection p = dataSpec.getProjections().get(i);
                sb.append(printProjection(p));
            }
            return sb.toString();
        }
        
        private String printProjection(Projection p)
        {
            String result = null;
            if (p instanceof Projection && !(p instanceof GroupingProjection)) {
                result = printSimpleProjection(p);
            }
            if (p instanceof GroupingProjection) {
                result = printGroupingProjection((GroupingProjection)p);
            }
            return result;
        }
        
        private String printSimpleProjection(Projection p)
        {
            StringBuilder sb=new StringBuilder();
            sb.append(
                    getTokenName(SEDL4PeopleLexer.DOT)
            ).append( 
                    getTokenName(SEDL4PeopleLexer.PROJ)
            ).append(
                    getTokenName(SEDL4PeopleLexer.OPEN_PAR)
            );
            for (int j = 0; j < p.getProjectedVariables().size(); j++) {                
                if (j != 0) {
                    sb.append(getTokenName(
                            SEDL4PeopleLexer.COMMA));
                }
                sb.append(
                        p.getProjectedVariables().get(j)    );

            }
            sb.append(
                    getTokenName(SEDL4PeopleLexer.CLOSE_PAR)    );
            return sb.toString();
        }
        
        private String printGroupingProjection(GroupingProjection gp)
        {
            String openBra="";
            String closeBra="";
            StringBuilder sb=new StringBuilder();
            sb.append(getTokenName(
                    SEDL4PeopleLexer.DOT)
            ).append(getTokenName(
                    SEDL4PeopleLexer.GROUPING)
            ).append(getTokenName(
                    SEDL4PeopleLexer.OPEN_PAR));
            if (gp.getProjectedVariables().size() > 1) {
                openBra = getTokenName(SEDL4PeopleLexer.OPEN_BRA);
                closeBra = getTokenName(SEDL4PeopleLexer.CLOSE_BRA);
            }
            sb.append(openBra);
            for (int j = 0; j < gp.getProjectedVariables().size(); j++) {
                if (j != 0) {
                    sb.append(getTokenName(
                            SEDL4PeopleLexer.COMMA));
                }
                sb.append(gp.getProjectedVariables().get(j));
            }
            sb.append(closeBra).append(getTokenName(SEDL4PeopleLexer.CLOSE_PAR));
            
           return sb.toString();
        }

        
        
        private String printFilter(Filter f)
        {
            String result=null;     
            if (f instanceof ValuationFilter) {
                    result=printValuationFilter((ValuationFilter) f);                    
             }
            return result;
        }
        
        private String printValuationFilter(ValuationFilter vf)
        {
            StringBuilder sb=new StringBuilder();
            sb.append(getTokenName(
                    SEDL4PeopleLexer.FILTER)
            ).append(getTokenName(
                    SEDL4PeopleLexer.OPEN_PAR
            ));
            for (int j = 0; j < vf.getVariableValuations().size(); j++) {
                if (j != 0) {
                    sb.append(getTokenName(
                            SEDL4PeopleLexer.COMMA
                    ));
                }
                VariableValuation var = vf.getVariableValuations().get(j);
                sb.append(
                        var.getVariable()
                );
            }
            sb.append(getTokenName(
                    SEDL4PeopleLexer.CLOSE_PAR));
            return sb.toString();
        }
	
	private String writeConfigurations(Experiment experiment) {
		StringBuilder sb=new StringBuilder();
		BasicExperiment exp = null;
		if ( experiment instanceof BasicExperiment ) {
			exp = (BasicExperiment)experiment;
		}
		
		if ( exp != null ) {
			
			if ( !exp.getConfigurations().isEmpty() ) {
				sb.append(getTokenName(
                                        SEDL4PeopleLexer.CONFIGURATION
                                )).append(getTokenName(
                                        SEDL4PeopleLexer.COLON
                                )).append(
                                        RET
                                );
			}
			
			for ( int i = 0; i < exp.getConfigurations().size() ; i++ ) {
				sb.append(printConfiguration(exp.getConfigurations().get(i),i));
			}
		}
                return sb.toString();
	}
        
        public String printConfiguration(Configuration conf,  int i)
        {
            StringBuilder sb=new StringBuilder();
            sb.append("C").append( i).append(
                    getTokenName(SEDL4PeopleLexer.COLON)
            ).append(
                    RET
            ).append(
                    printOutputs(conf.getExperimentalOutputs())
            ).append(
                    printExperimentalSetting(conf.getExperimentalSetting())
            ).append(
                    printExperimentalProcedure(conf.getExperimentalProcedure())
            );            
            return sb.toString();
        }
        
        private String printOutputs(ExperimentalOutputs outputs)
        {
            StringBuilder sb=new StringBuilder(); 
            sb.append(
                    TAB
            ).append(getTokenName(
                    SEDL4PeopleLexer.OUTPUTS
            )).append(getTokenName(
                    SEDL4PeopleLexer.COLON
            )).append(
                    ESP            );
            for (OutputDataSource out : outputs.getOutputDataSources()) {
                if(out!=null){
                sb.append(getTokenName(
                        SEDL4PeopleLexer.FILE
                )).append(
                        ESP
                ).append(
                        out.getFile()!=null?out.getFile().getName():"''"
                ).append(
                        ESP          );
                if (out.getRole() != null) {
                    sb.append(getTokenName(
                            SEDL4PeopleLexer.ROLE
                    )).append(getTokenName(
                            SEDL4PeopleLexer.COLON
                    )).append(
                            out.getRole().name()
                    );
                }	
                
                if (out.getFileSpecification()!= null) {
                    sb.append(getTokenName(
                            SEDL4PeopleLexer.FORMAT
                    )).append(getTokenName(
                            SEDL4PeopleLexer.COLON
                    )).append(
                            out.getFileSpecification().getNamePattern()
                    );
                }
                // Falta el mapping
                }
            }
            sb.append(RET);
            return sb.toString();
        }
        
        private String printExperimentalSetting(ExperimentalSetting setting)
        {
            StringBuilder sb=new StringBuilder();
            // SETTINGS
            if (setting != null) {                 
                sb.append(
                        TAB
                ).append(getTokenName(
                        SEDL4PeopleLexer.SETTING
                )).append(getTokenName(
                        SEDL4PeopleLexer.COLON
                )).append(
                        ESP                          );
                if (setting.getRequirements() != null) {                                        
                    sb.append(
                           printExperimentalEnvironment(setting.getRequirements())
                    );
                    
                    // HardwarePlatform?
                    sb.append(RET);
                }
            }
            return sb.toString();
        }
        
        private String printExperimentalEnvironment(ExperimentalEnvironment req)
        {
            String s="";
            if (req instanceof ComputationEnvironment) {
                printComputationEnvironment((ComputationEnvironment)req);
            }
            return s;
        }
        
        private String printComputationEnvironment(ComputationEnvironment env)
        {
            StringBuilder sb=new StringBuilder();
            if (env.getSoftwarePlatform() != null) {
                if (!env.getSoftwarePlatform().getRuntimes().isEmpty()) {
                    sb.append(getTokenName(
                            SEDL4PeopleLexer.RUNTIMES
                    )).append(getTokenName(
                            SEDL4PeopleLexer.COLON
                    )).append(
                            ESP                   );
                    for (int j = 0; j < env.getSoftwarePlatform().getRuntimes().size(); j++) {
                        if (j != 0) {
                            sb.append(getTokenName(
                                    SEDL4PeopleLexer.COMMA
                            )).append(
                                    ESP                              );
                        }
                        Runtime r = env.getSoftwarePlatform().getRuntimes().get(j);
                        sb.append(
                                r.getName()
                        ).append(
                                ESP
                        ).append(
                                r.getVersion()
                        ).append(
                                ESP                  );
                    }
                }

                if (!env.getSoftwarePlatform().getLibraries().isEmpty()) {
                    sb.append(getTokenName(
                            SEDL4PeopleLexer.LIBRARIES
                    )).append(getTokenName(
                            SEDL4PeopleLexer.COLON
                    )).append(
                            ESP                          );
                    for (int j = 0; j < env.getSoftwarePlatform().getLibraries().size(); j++) {
                        if (j != 0) {
                            sb.append(getTokenName(
                                    SEDL4PeopleLexer.COMMA
                            )).append(
                                    ESP                               );
                        }
                        Library l = env.getSoftwarePlatform().getLibraries().get(j);
                        sb.append(
                                l.getName()
                        ).append(
                                ESP
                        ).append(
                                l.getVersion()
                        );
                    }
                }
            }
            return sb.toString();
        }
	
        
        private String printExperimentalProcedure(ExperimentalProcedure procedure)                
        {
            StringBuilder sb=new StringBuilder();
            if (procedure != null) {
                sb.append(
                        TAB
                ).append(getTokenName(
                        SEDL4PeopleLexer.PROCEDURE
                )).append(
                        ESP
                ).append(getTokenName(
                        SEDL4PeopleLexer.COLON
                )).append(
                        RET
                );                
                if (!procedure.getTasks().isEmpty()) {
                    for (ExperimentalTask expTask : procedure.getTasks()) {
                        CommandExperimentalTask task = (CommandExperimentalTask) expTask;
                        sb.append(
                                TAB
                        ).append(
                                TAB
                        ).append(getTokenName(
                                SEDL4PeopleLexer.COMMAND
                        )).append(
                                ESP
                        ).append(getTokenName(
                                SEDL4PeopleLexer.AS
                        )).append(
                                ESP
                        ).append(getTokenName(
                                SEDL4PeopleLexer.TREATMENT
                        )).append(
                                ESP
                        ).append(getTokenName(
                                SEDL4PeopleLexer.OPEN_PAR
                        )).append(
                                ESP            );

                        for (int j = 0; j < task.getParameters().size(); j++) {
                            if (j != 0) {
                                sb.append(getTokenName(
                                        SEDL4PeopleLexer.COMMA
                                )).append(
                                        ESP                          );
                            }
                            sb.append(task.getParameters().get(j));
                        }

                        sb.append(
                                ESP
                        ).append(getTokenName(
                                SEDL4PeopleLexer.CLOSE_PAR
                        )).append(getTokenName(
                                SEDL4PeopleLexer.COLON
                        )).append(
                                RET
                        ).append(
                                TAB
                        ).append(
                                TAB
                        ).append(
                                TAB
                        ).append(
                                task.getName()              );
                    }
                }            
            }
            return sb.toString();
        }
            
	

        


        private String getTokenName ( int token ) {
		String tk = SEDL4PeopleLexer.tokenNames[token];
		return tk.substring(1, tk.length() - 1 ).trim();
	}

    private String printAssociationalHypthesis(AssociationalHypothesis associationalHypothesis) {
        StringBuilder sb=new StringBuilder();
        
        sb.append(   associationalHypothesis.getDependentVariable());
                
        sb.append( getTokenName(SEDL4PeopleLexer.IS) )
          .append(   ESP);
        if(associationalHypothesis.getRelation()!=null){
            sb.append(associationalHypothesis.getRelation().toString())
              .append(   ESP);
        }

        sb.append( getTokenName(SEDL4PeopleLexer.CORRELATED) )
          .append(   ESP)
          .append( getTokenName(SEDL4PeopleLexer.WITH)       )
          .append(   ESP);
        
        sb.append(   associationalHypothesis.getIndependentVariables().get(0)  );
        
        for(int i=1;i<associationalHypothesis.getIndependentVariables().size();i++)
        {            
            sb.append(   getTokenName(SEDL4PeopleLexer.COMMA) );
            sb.append(   ESP);
            sb.append(   associationalHypothesis.getIndependentVariables().get(i)  );
        }
        
        return sb.toString();
    }

    private String printDescriptiveHypothesis(DescriptiveHypothesis descriptiveHypothesis) {
        StringBuilder sb = new StringBuilder();
        sb.append( getTokenName(SEDL4PeopleLexer.DESCRIPTIVE));          
        return sb.toString();
    }

    private String printDifferentialHypothesis(DifferentialHypothesis differentialHypothesis) {
        StringBuilder sb = new StringBuilder();
        
        sb.append(   differentialHypothesis.getIndependentVariables().get(0)  );
                for(int i=1;i<differentialHypothesis.getIndependentVariables().size();i++)
        {            
            sb.append(   getTokenName(SEDL4PeopleLexer.COMMA) );
            sb.append(   ESP);
            sb.append(   differentialHypothesis.getIndependentVariables().get(i)  );
        }
        sb.append(   ESP);
        
        sb.append( getTokenName(SEDL4PeopleLexer.IMPACTS))
          .append(   ESP)
          .append( getTokenName(SEDL4PeopleLexer.SIGNIFICANTLY))
          .append(   ESP)                
          .append( getTokenName(SEDL4PeopleLexer.ON))
          .append(   ESP);
        
        sb.append(differentialHypothesis.getDependentVariable());
       return sb.toString();
    }

}
