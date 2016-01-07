package es.us.isa.sedl.core.design;

public abstract class AbstractVariable {

	
	public abstract VariableKind getKind();
	
	public abstract Domain getDomain();
	
	public abstract String getName();
	
	@Override
	public String toString() {
		return "Variable [kind=" + getKind() + ", domain=" + getDomain() + ", name="
				+ getName() + "]";
	} 

}
