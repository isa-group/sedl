/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.design;

import es.us.isa.sedl.core.SEDLBase;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author José Antonio Parejo
 */
public abstract class AbstractDesign extends SEDLBase {
    
    public abstract ExperimentalDesign getExperimentalDesign();
    
    public abstract Variables getVariables();
    
    @JsonIgnore
    public List<Outcome> getOutcomes()
    {
        List<Outcome> result=new ArrayList<Outcome>();
        for(Variable var:getVariables().getVariablesByType(Outcome.class))
            result.add((Outcome)var);
        return result;
    }
    
    @JsonIgnore
    public Set<Set<VariableValuation>> getPossibleTreatments() {
        Set<Set<VariableValuation>> result = new HashSet<Set<VariableValuation>>();
        List<Variable> variables = getVariables().getVariable();
        Set<VariableValuation> tmpSet = new HashSet<VariableValuation>();
        possibleTreatmentCombinations(0, variables, tmpSet, result);
        return result;
    }

    @JsonIgnore
    private void possibleTreatmentCombinations(int i, List<Variable> variables, Set<VariableValuation> tmpSet, Set<Set<VariableValuation>> result) {
        Variable var = variables.get(i);
        Domain domain=var.getDomain();
        VariableValuation valuation = null;
        if (var instanceof ControllableFactor) {
            if (domain.isFinite()) {
                for (Level level : domain.getLevels()) {
                    valuation = new VariableValuation();
                    valuation.setVariable(var);
                    valuation.setLevel(level);
                    tmpSet.add(valuation);
                    if (i < variables.size() - 1) {
                        possibleTreatmentCombinations(i + 1, variables, tmpSet, result);
                    } else {
                        Set<VariableValuation> treatment = new HashSet<VariableValuation>();
                        treatment.addAll(tmpSet);
                        result.add(treatment);
                    }
                    tmpSet.remove(level);
                }
            } else {
                throw new InvalidParameterException("You cannot compute all possible treatment combinations due to the intension domain of variable '" + var.getName() + "'");
            }
        } else{
            if (i < variables.size() - 1){
                possibleTreatmentCombinations(i + 1, variables, tmpSet, result);
            } else {
                Set<VariableValuation> treatment = new HashSet<VariableValuation>();
                treatment.addAll(tmpSet);
                result.add(treatment);
            }
        }
    }
    
    
    public AnalysisSpecificationGroup getAnalysisSpecById(String id)
    {
        AnalysisSpecificationGroup result=null;
        List<AnalysisSpecificationGroup> analysisSpecs=getExperimentalDesign().getIntendedAnalyses();
        for(AnalysisSpecificationGroup candidate:analysisSpecs)
            if(candidate.getId().equals(id)){
                result=candidate;
                break;
            }
        return result;
    }
}
