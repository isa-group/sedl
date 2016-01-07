/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.core.util.doe;

import es.us.isa.sedl.core.BasicExperiment;
import es.us.isa.sedl.core.design.Constraint;
import es.us.isa.sedl.core.design.ControllableFactor;
import es.us.isa.sedl.core.design.Domain;
import es.us.isa.sedl.core.design.ExtensionDomain;
import es.us.isa.sedl.core.design.FundamentalSet;
import es.us.isa.sedl.core.design.FundamentalSetConstraint;
import es.us.isa.sedl.core.design.IntensionDomain;
import es.us.isa.sedl.core.design.IntervalConstraint;
import es.us.isa.sedl.core.design.Level;
import es.us.isa.sedl.core.design.Variable;
import es.us.isa.sedl.core.design.VariableValuation;
import java.security.InvalidParameterException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author japarejo
 */
public class DOEHelper {
    public Set<Set<VariableValuation>> possibleFactorCombinations(BasicExperiment experiment)
    {
        Set<Set<VariableValuation>> result=new HashSet<Set<VariableValuation>>();
        List<Variable> variables=experiment.getDesign().getVariables().getVariable();
        Set<VariableValuation> tmpSet=new HashSet<VariableValuation>();
        possibleFactorCombinations(0,variables,tmpSet,result);
        return result;
    }            

    private void possibleFactorCombinations(int i, List<Variable> variables, Set<VariableValuation> tmpSet, Set<Set<VariableValuation>> result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
                
    
    
}
