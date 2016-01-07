/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.exemplar.commons.util;

/**
 *
 * @author japarejo
 */
public class Error {
     public enum ERROR_SEVERITY {
		INFO, WARNING, ERROR, FATAL
    };    
    private ERROR_SEVERITY severity;
    private String description;    

    public Error(ERROR_SEVERITY severity, String description) {
        this.severity = severity;
        this.description = description;
    }            

    public ERROR_SEVERITY getSeverity() {
        return severity;
    }

    

    public String getDescription() {
        return description;
    }   
    
    
    
}
