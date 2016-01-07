/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.jlibsedl.validator;

import es.us.isa.sedl.core.util.Error;

/**
 *
 * @author japarejo
 */
public class ValidationError extends Error {

    private ValidationRule rule;
    
    public ValidationError(int lineNo, ValidationLevel level, ERROR_SEVERITY severity, String message) {
        super(lineNo, severity, message);
    }
    
}
