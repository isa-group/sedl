/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.runtime.analysis.validation;

import es.us.isa.sedl.core.util.Error;
import es.us.isa.sedl.core.util.Error.ERROR_SEVERITY;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author japarejo
 * @param <T>
 */
public class ValidationError<T> extends Error {
    private T subject;
    private Set<Fixing<T>> fixings;
    private int lineNo;
    
    public ValidationError(T subject, ERROR_SEVERITY severity, String description)
    {
        this(subject,severity,description,new HashSet<Fixing<T>>());
    }
    public ValidationError(T subject, ERROR_SEVERITY severity, String description, Set<Fixing<T>> fixings) {
        super(0,severity,description);
        this.subject = subject;        
        this.fixings = fixings;
    }
    
    
    public Set<Fixing<T>> getFixings() {
        return fixings;
    }    
    
    public T getSubject() {
        return subject;
    }
    
	public int getLineNo() {
		return lineNo;
	}
	
	public void setLineNo(int lineNo) {
		this.lineNo = lineNo;
	}
	
}
