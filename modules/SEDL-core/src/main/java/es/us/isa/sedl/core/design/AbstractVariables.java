/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.design;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author José Antonio Parejo
 */
public abstract class AbstractVariables {
    public abstract List<Variable> getVariables();
    
    public Variable getVariableByName(String name)
    {
        Variable result=null;
        for(Variable var:getVariables())
        {
            if(var.getName().equals(name))
            {
                result=var;
                break;
            }
        }
        return result;
    }
    
    
    public <T extends Variable> List<T> getVariablesByType(Class<T> type)
    {
        List<T> result=new ArrayList<T>();
        for(Variable var:getVariables())
            if(type.isInstance(var))
                result.add((T)var);
        return result;
    }
    
    public List<ControllableFactor> getControllableFactors()
    {
       return getVariablesByType(ControllableFactor.class); 
    }
    
    public List<NonControllableFactor> getNonControllableFactors()
    {
        return getVariablesByType(NonControllableFactor.class);
    }
    
    public List<Outcome> getOutcomes()
    {
        return getVariablesByType(Outcome.class);
    }
    
    public Variable get(int index){
        Variable result=null;
        if(index>=0 && index<getVariables().size())
            result=getVariables().get(index);
        return result;
    }
}
