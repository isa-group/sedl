package es.us.isa.sedl.core.design;

/**
 * Variable valuations assign a specific level to the value of a variable.
 * @author
 */
public abstract class AbstractVariableValuation {

    public abstract String getVariable();
    public abstract String getLevel();
    
    @Override
    public String toString() {
    return getVariable()+"<-"+getLevel();
    }

    
}
