/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.runtime.analysis.validation;

import java.util.List;

/**
 *
 * @author japarejo
 */
public abstract class ValidationRule<T> {    
    public ValidationLevel level;
    public String code;
    public String name;
    public String description;   

    public ValidationRule(ValidationLevel level, String code, String name, String description) {
        this.level = level;
        this.code = code;
        this.name = name;
        this.description = description;        
    }
    
    public ValidationLevel getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
        
    public abstract List<ValidationError<T>> validate(T element );
    
//    public abstract List<ValidationError<T>> validateCsv(T element, String csvContent);
//
//	public abstract List<T> parseDocument(T element);

}
