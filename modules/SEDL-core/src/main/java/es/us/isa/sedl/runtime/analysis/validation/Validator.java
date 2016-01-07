/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.runtime.analysis.validation;


import es.us.isa.sedl.runtime.analysis.AnalysisOperation;
import java.util.List;

/**
 *
 * @author japarejo
 * @param <X> Type of element to be validated
 */
public interface Validator<X> extends AnalysisOperation<X,List<ValidationError<X>>>{}
