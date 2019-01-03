/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.jlibsedl.validator;


import es.us.isa.sedl.core.EmpiricalStudy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author japarejo
 */
public class Validator {
    Map<ValidationLevel, Set<ValidationRule>> rules;    
    
    public List<ValidationError> validate(ValidationLevel level,EmpiricalStudy e)
    {
        return validate(level, ValidationPurpose.VALIDITY,e);
    }
    
    public List<ValidationError> validate(ValidationLevel level, ValidationPurpose purpose, EmpiricalStudy e)
    {
        List<ValidationError> errors=new ArrayList<ValidationError>();
        Set<ValidationRule> levelRules=rules.get(level);
        for(ValidationRule rule:levelRules)
        {
            if(purpose.subsumes(rule.getLevel()))
                errors.addAll(rule.validate(null, e));
        }
        return errors;
    }
}
