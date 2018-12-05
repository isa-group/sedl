package es.us.isa.sedl.core.design;

import es.us.isa.sedl.core.SedlBase;

public abstract class AbstractLevel extends SedlBase {


	public abstract String getValue();
	
	@Override
	public String toString() {
		return "Level [value=" + getValue() + "]";
	} 
        
        @Override
        public boolean equals(Object o){
            return (o instanceof AbstractLevel) && this.getValue().equals(((AbstractLevel)o).getValue());
        }

}
