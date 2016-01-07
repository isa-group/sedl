/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.runtime.analysis;

import com.google.common.base.Function;

/**
 *
 * @author japarejo
 * @param <X> Type of element to be analyzed
 * @param <Y> Result of the analysis
 */
public interface AnalysisOperation<X,Y> extends Function<X,Y>  {     
    String getName();
    String getDescription();    
}
