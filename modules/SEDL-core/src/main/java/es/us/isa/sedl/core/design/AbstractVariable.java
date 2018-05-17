package es.us.isa.sedl.core.design;

import es.us.isa.sedl.core.SEDLBase;

public abstract class AbstractVariable extends SEDLBase {

	
	public abstract VariableKind getKind();
	
	public abstract Domain getDomain();
	
	public abstract String getName();
	
	@Override
	public String toString() {
		return "Variable [kind=" + getKind() + ", domain=" + getDomain() + ", name="
				+ getName() + "]";
	} 

}
