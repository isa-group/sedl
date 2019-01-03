/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.jlibsedl.validator;

import es.us.isa.sedl.core.EmpiricalStudy;
import es.us.isa.sedl.jlibsedl.fixer.SEDLFixer;
import java.util.List;

/**
 *
 * @author japarejo
 */
public abstract class ValidationRule<X> {    
    public ValidationLevel level;
    public String code;
    public String name;
    public String description;
    public List<SEDLFixer> fixers;

    public ValidationRule(ValidationLevel level, String code, String name, String description, List<SEDLFixer> fixers) {
        this.level = level;
        this.code = code;
        this.name = name;
        this.description = description;
        this.fixers = fixers;
    }

    public List<SEDLFixer> getFixers() {
        return fixers;
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
        
    public abstract List<ValidationError> validate(X element, EmpiricalStudy experiment);
}
