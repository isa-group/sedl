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
public abstract class AbstractIntervalConstraint extends Constraint{
    public abstract String getMin();
    public abstract String getMax();
    
    @Override
    public boolean isMetBy(Object object)
    {
        if(object==null || object.getClass().isAssignableFrom(Number.class))
            return false;
        double min=Double.parseDouble(getMin());
        double max=Double.parseDouble(getMax());
        double value=Double.parseDouble(object.toString());
        return min<=value && value<=max;
    }
}
