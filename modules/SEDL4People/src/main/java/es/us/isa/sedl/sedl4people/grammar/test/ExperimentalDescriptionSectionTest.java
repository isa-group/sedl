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
public class ExperimentalDescriptionSectionTest extends SEDL4PeopleParsingTest
{
    protected String ruleName;
    
    private String description;
    
    protected List<CodeSample> codeSamples;

    public ExperimentalDescriptionSectionTest(String ruleName, String description) {
        this.ruleName = ruleName;
        this.description = description;
        this.codeSamples=new ArrayList<CodeSample>();
    }        
    
    public String getRuleName(){return ruleName;}
    
    public String getSectionDescription(){return description;}
    
    public List<CodeSample> getCodeSamples(){return codeSamples;}        
    
}
