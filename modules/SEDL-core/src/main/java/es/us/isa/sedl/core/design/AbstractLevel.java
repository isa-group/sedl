package es.us.isa.sedl.core.design;

import es.us.isa.sedl.core.SEDLBase;

public abstract class AbstractLevel extends SEDLBase {


	public abstract String getValue();
	
	@Override
	public String toString() {
		return "Level [value=" + getValue() + "]";
	} 

}
