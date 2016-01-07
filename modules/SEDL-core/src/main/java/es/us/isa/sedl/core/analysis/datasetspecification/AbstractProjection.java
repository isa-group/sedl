/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.analysis.datasetspecification;

import es.us.isa.jdataset.DataSet;
import es.us.isa.jdataset.Column;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author José Antonio Parejo
 */
public abstract class AbstractProjection {
   public abstract List<String> getProjectedVariables();
   
   public Collection<Column<?>> apply(DataSet dataset)
   {
       List<Column<?>> result=new ArrayList<Column<?>>();
       Column c=null;
       for(String variable : getProjectedVariables())
       {
           c=dataset.getColumn(variable);
           if(c!=null)
               result.add(c);
       }
       return result;
   }
}
