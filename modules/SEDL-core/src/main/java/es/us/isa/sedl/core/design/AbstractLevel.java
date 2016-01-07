package es.us.isa.sedl.core.design;

public abstract class AbstractLevel {


	public abstract String getValue();
	
	@Override
	public String toString() {
		return "Level [value=" + getValue() + "]";
	} 

}
