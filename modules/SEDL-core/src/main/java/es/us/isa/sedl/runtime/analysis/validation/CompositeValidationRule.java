/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.runtime.analysis.validation;

import com.google.common.base.Function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author japarejo
 */
public class CompositeValidationRule<X> extends ValidationRule<X> {

    List<ValidationRule<X>> subRules;
    Map<Class,List<ValidationRule>> specificSubRules;
    Map<Class,Function> mappingFunctions;
    
    public CompositeValidationRule(ValidationLevel level, String code, String name, String description) {
        super(level, code, name, description);
        subRules=new ArrayList<ValidationRule<X>>();
        specificSubRules=new HashMap<Class, List<ValidationRule>>();
        mappingFunctions=new HashMap<Class, Function>(); 
    }

    @Override
    public List<ValidationError<X>> validate(X element) {
        List<ValidationError<X>> result=new ArrayList<ValidationError<X>>();
        for(ValidationRule rule:subRules) {
            result.addAll(rule.validate(element));
        }        
        Function mapping=null;
        for(Class c:specificSubRules.keySet())
        {
            mapping=mappingFunctions.get(c);
            for(ValidationRule rule:specificSubRules.get(c))
            {            
                result.addAll(rule.validate(mapping.apply(element)));
            }
        }
        return result;
    }
    
    public void addSubRule(ValidationRule<X> subRule)
    {
        if(!containsRuleByCode(subRule.getCode())) {
            subRules.add(subRule);
        }
    }
    
    public <T> void addSubRule(ValidationRule<T> subRule,Function<X,T> mapping,Class<T> mappingClass)
    {
        List<ValidationRule> rules=specificSubRules.get(mappingClass);
        if(rules==null){
            rules=new ArrayList<ValidationRule>();
            specificSubRules.put(mappingClass, rules);
        }
        rules.add(subRule);
        mappingFunctions.put(mappingClass, mapping);
    }
    
    public boolean removeSubRule(ValidationRule subrule)
    {  
        boolean result=subRules.remove(subrule);
        
        if(!result){
            Class key=null;
            for(Entry<Class,List<ValidationRule>> entry:specificSubRules.entrySet()) {
                for(ValidationRule rule:entry.getValue())
                {
                    if(rule.equals(subrule)) {
                        key=entry.getKey();                        
                    }
                }
            }
            if(key!=null) {
                result=true;
                specificSubRules.get(key).remove(subrule);
            }            
        }
        return result;
    }
    
    public boolean removeSubRuleByCode(String code)
    {
        boolean result=false;
        ValidationRule<X> rule=getSubRuleByCode(code);        
        if(rule!=null){
            result=removeSubRule(rule);
        }
        return result;
    }
    
    public boolean containsRule(ValidationRule subrule)
    {
        return containsRuleByCode(subrule.getCode());        
    }

    public boolean containsRuleByCode(String code) {
        return getSubRuleByCode(code)!=null;
    }

    private ValidationRule getSubRuleByCode(String code) {
        ValidationRule result=null;
        for(ValidationRule candidate:subRules) {
            if(candidate.getCode().equalsIgnoreCase(code)) {
                result=candidate;
            }
        }
        if(result==null)
        {
            for(Entry<Class,List<ValidationRule>> entry:specificSubRules.entrySet()) {
                for(ValidationRule rule:entry.getValue()){
                    if(rule.getCode().equalsIgnoreCase(code)) {
                        result=rule;
                    }
                }
            }
        }
        return result;
    }
}
