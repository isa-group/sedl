/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.runtime.analysis.validation;

import es.us.isa.exemplar.commons.util.Error;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author japarejo
 */
public class RuleBasedValidator<X> implements Validator<X> {
    String name;
    String description;
    Map<ValidationLevel, Set<ValidationRule<X>>> rules;    

    public RuleBasedValidator(String name, String description) {
        this(name,description,new EnumMap<ValidationLevel, Set<ValidationRule<X>>>(ValidationLevel.class));
    }   
     
    public RuleBasedValidator(String name, String description,Map<ValidationLevel, Set<ValidationRule<X>>> rules) {
        this.name=name;
        this.description=description;
        this.rules=rules;
    }        
            
    
    public List<ValidationError<X>> validate(ValidationLevel level, X e)
    {
        List<ValidationError<X>> result=new ArrayList<ValidationError<X>>();
        Set<ValidationRule<X>> levelRules=rules.get(level);
        for(ValidationRule rule:levelRules)
        {
           result.addAll(rule.validate(e));
        }
        return result;
    }

    @Override
    public List<ValidationError<X>> apply(X subject) {
        List<ValidationError<X>> result=new ArrayList<ValidationError<X>>();
        for(ValidationLevel level: ValidationLevel.values())
        {
            validate(level,subject);
        }
        return result;
    }
    
    public void addRule(ValidationLevel level, ValidationRule<X> rule)
    {
        Set<ValidationRule<X>> set=rules.get(level);
        if(set==null)
        {
            set=new HashSet<ValidationRule<X>>();
            rules.put(level, set);
        }
        set.add(rule);        
    }
    
    public Set<ValidationRule<X>> getRules(ValidationLevel level)
    {
        return rules.get(level);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
