/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.design;

/**
 *
 * @author José Antonio Parejo
 */
public abstract class AbstractConstraint<X> {
    /*
    public abstract String getDomain();
    
    public abstract String getVariableName();
    
    @Override
    public String toString(){
		return "Constraint[variableName/domain]:"+getVariableName()+"/"+getDomain();
    }
    */
    
    public abstract boolean isMetBy(X object);
}
