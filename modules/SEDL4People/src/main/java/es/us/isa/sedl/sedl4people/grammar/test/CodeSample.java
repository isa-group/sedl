/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.sedl4people.grammar.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author japarejo
 */
public class CodeSample {
    private String identifier;
    private String description;
    private String specificRule;
    private String code;
    
    private List<ParsingError> expectedErrors;
    
    private List<SemanticsSpec> expectedSemantics;
    
    private List<String> semanticAssertions;

    public CodeSample(String identifier, String description, String specificRule, String code)
    {
        this(identifier,description,specificRule,code,new ArrayList<ParsingError>(),new ArrayList<SemanticsSpec>(),new ArrayList<String>());
    }
    
    
    
    public CodeSample(String identifier, String description, String specificRule, String code, List<ParsingError> expectedErrors,List<SemanticsSpec> expectedSemantics, List<String> semanticAssertions) {
        this.identifier = identifier;
        this.description = description;
        this.specificRule = specificRule;
        this.code = code;
        this.expectedErrors = expectedErrors;
        this.expectedSemantics = expectedSemantics;
        this.semanticAssertions = semanticAssertions;
    }

    /**
     * @return the identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * @param identifier the identifier to set
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the specificRule
     */
    public String getSpecificRule() {
        return specificRule;
    }

    /**
     * @param specificRule the specificRule to set
     */
    public void setSpecificRule(String specificRule) {
        this.specificRule = specificRule;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the expectedErrors
     */
    public List<ParsingError> getExpectedErrors() {
        return expectedErrors;
    }

   

    public List<SemanticsSpec> getExpectedSemantics() {
        return expectedSemantics;
    }

   

    public List<String> getSemanticAssertions() {
        return semanticAssertions;
    }
    
    
            
}
