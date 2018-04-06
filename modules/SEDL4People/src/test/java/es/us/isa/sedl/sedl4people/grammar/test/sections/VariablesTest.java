/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.sedl4people.grammar.test.sections;

import java.io.IOException;

import org.junit.Test;

import es.us.isa.sedl.sedl4people.grammar.test.ExternalizedSamplesSectionTest;

/**
 *
 * @author japarejo
 */
public class VariablesTest extends ExternalizedSamplesSectionTest {
	public static final String RULE ="variables";
    public static final String DESCRIPTION="";    

    public VariablesTest() throws IOException {
        super(RULE, DESCRIPTION,DEFAULT_BASE_PATH+"/4-Variables");
    } 
    @Test
    @Override
    public void testCorrectCodeSamples(){
        super.testCorrectCodeSamples();
    }
}
