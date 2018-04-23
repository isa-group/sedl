package es.us.isa.sedl.semantic;

import es.us.isa.sedl.core.BasicExperiment;
import es.us.isa.sedl.core.Experiment;
import es.us.isa.sedl.core.design.Factor;
import es.us.isa.sedl.core.design.FullySpecifiedExperimentalDesign;
import es.us.isa.sedl.core.design.Group;
import es.us.isa.sedl.core.design.NonControllableFactor;
import es.us.isa.sedl.core.design.Variable;
import es.us.isa.sedl.core.util.Error;
import es.us.isa.sedl.core.util.Error.ERROR_SEVERITY;
import es.us.isa.sedl.error.SEDL4PeopleError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.RuleNode;

public class SEDLSemanticChecker implements SemanticChecker {

	private Experiment experiment;
	private List<Error> errors;
	private Map<Object,RuleNode> objectNodeMap;
	private CommonTokenStream tokens;
	
	public SEDLSemanticChecker( Experiment exp, Map<Object,RuleNode> objectNodeMap, CommonTokenStream tokens ) {
		this.experiment = exp;
		errors = new ArrayList<Error>();
		this.objectNodeMap = objectNodeMap;
		this.tokens = tokens;
	}

	@Override
	public List<Error> checkSemantic() {
		if (!errors.isEmpty()) {
			errors.clear();
		}
		errors.addAll(checkGroup());
		errors.addAll(checkBlocking());
		errors.addAll(checkSizing());
		errors.addAll(checkMeasurement());
		errors.addAll(checkTreatement());
		errors.addAll(checkCustomExperimentalDesign());
		System.out.println("Semantic analysis finished with: " + errors.size() + " errors.");
		return errors;
	}

	private List<SEDL4PeopleError> checkGroup() {
		
		List<SEDL4PeopleError> subErrors = new ArrayList<SEDL4PeopleError>();
		/*List<String> varNames = new ArrayList<String>();
		if ( experiment instanceof BasicExperiment ) {
			BasicExperiment exp = (BasicExperiment)experiment;
			for ( Variable v: exp.getDesign().getVariables().getVariable() ) {
				varNames.add(v.getName());
			}
			
			if ( exp.getDesign().getExperimentalDesign() instanceof FullySpecifiedExperimentalDesign) {
				FullySpecifiedExperimentalDesign design = (FullySpecifiedExperimentalDesign) exp.getDesign().getExperimentalDesign();
				List<Group> groups = design.getGroups();
				for ( Group g: groups ) {
					if ( ! varNames.contains(g.getName()) ) {
						try {
							// TODO Hacerlo con SEDLReferenceDelegate
							RuleNode ctx = objectNodeMap.get(design.getGroups());
							Interval sourceInterval = ctx.getSourceInterval();
							Token firstToken = tokens.get(sourceInterval.a);
							int line = firstToken.getLine() - 1;
							SEDL4PeopleError error = new SEDL4PeopleError(line,0,0,ERROR_SEVERITY.ERROR, "Group ID " + g.getName() + " must exist as variable.");
							errors.add(error);
						} catch ( Exception e ) {
							e.printStackTrace();
						}
					}
				}
			}
			
		}*/
		return subErrors;

	}
	
	private List<SEDL4PeopleError> checkBlocking() {
		List<SEDL4PeopleError> subErrors = new ArrayList<SEDL4PeopleError>();
		/*List<String> varNames = new ArrayList<String>();
		if ( experiment instanceof BasicExperiment ) {
			BasicExperiment exp = (BasicExperiment)experiment;
			for ( Variable v: exp.getDesign().getVariables().getVariable() ) {
				varNames.add(v.getName());
			}
			
			if ( exp.getDesign().getExperimentalDesign() instanceof FullySpecifiedExperimentalDesign) {
				FullySpecifiedExperimentalDesign design = (FullySpecifiedExperimentalDesign) exp.getDesign().getExperimentalDesign();
				List<Factor> blocking = new ArrayList<Factor>();
                                for(String varName:design.getBlockingVariables())
                                    blocking.add((Factor)exp.getDesign().getVariables().getVariableByName(varName));
				for ( Factor b: blocking ) {
					if ( ! varNames.contains(b.getName()) ) {
						try {
							// TODO Hacerlo con SEDLReferenceDelegate
							RuleNode ctx = objectNodeMap.get(design.getBlockingVariables());
							Interval sourceInterval = ctx.getSourceInterval();
							Token firstToken = tokens.get(sourceInterval.a);
							int line = firstToken.getLine() - 1;
							SEDL4PeopleError error = new SEDL4PeopleError(line,0,0,ERROR_SEVERITY.ERROR, "Group ID " + b  + " must exist as variable.");
							errors.add(error);
						} catch ( Exception e ) {
							e.printStackTrace();
						}
					}
				}
			}
			
		}*/
		return subErrors;
	}

	private List<SEDL4PeopleError> checkSizing() {
		List<SEDL4PeopleError> subErrors = new ArrayList<SEDL4PeopleError>();

		return subErrors;
	}

	private List<SEDL4PeopleError> checkMeasurement() {
		List<SEDL4PeopleError> subErrors = new ArrayList<SEDL4PeopleError>();

		return subErrors;
	}

	private List<SEDL4PeopleError> checkTreatement() {
		List<SEDL4PeopleError> subErrors = new ArrayList<SEDL4PeopleError>();

		return subErrors;
	}

	private List<SEDL4PeopleError> checkCustomExperimentalDesign() {
		
		List<SEDL4PeopleError> subErrors = new ArrayList<SEDL4PeopleError>();

		return subErrors;
	}

}
