/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.runtime.analysis;

/**
 *
 * @author japarejo
 */
public abstract class AbstractAnalysisOperation<X,Y> implements AnalysisOperation<X,Y>{
    private final String name;
    private final String description;

    public AbstractAnalysisOperation(String name, String description) {
        this.name = name;
        this.description = description;
    }        
    
    @Override
    public String getName(){
        return name;
    }
    @Override
    public String getDescription()
    {
        return description;
    }
}
