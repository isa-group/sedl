package es.us.isa.sedl.core.analysis.datasetspecification;

import es.us.isa.jdataset.Column;
import es.us.isa.jdataset.DataSet;
import es.us.isa.sedl.core.design.VariableValuation;
import java.security.InvalidParameterException;
import java.util.List;

public abstract class AbstractValuationFilter extends Filter {
    public abstract List<VariableValuation> getVariableValuations();
    
    public boolean accept(DataSet dataset, int rowIndex)
    {
        boolean result=true;
        Column<?> c=null;
        for(VariableValuation valuation:getVariableValuations())
        {
            if(valuation.getLevel()!=null){
                c=dataset.getColumn(valuation.getVariable().getName());
                if(c!=null){
                    if(!valuation.getLevel().getValue().equals(c.get(rowIndex).toString())){
                        result=false;
                        break;
                    }
                }
            }
        }
        return result;
    }

    protected static int findVariableIndex(List<String> header, String variable) {
        int result=header.indexOf(variable);
        if(result==-1)
            throw new InvalidParameterException("The variable '"+variable+"' has not a corresponding column in the dataset (columns:"+header+")");
        return result;
    }
    
    
}
