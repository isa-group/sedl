/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.sedl4people.grammar.test.sections;

import es.us.isa.sedl.sedl4people.grammar.test.ExternalizedSamplesSectionTest;
import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author japarejo
 */
public class PreambleTest extends ExternalizedSamplesSectionTest{
    
    public static final String RULE ="experimentPreamble";
    public static final String DESCRIPTION="";    

    public PreambleTest() throws IOException {
        super(RULE, DESCRIPTION,DEFAULT_BASE_PATH+"/1-Preamble");
    }            
    @Test
    @Override
    public void testCorrectCodeSamples(){
        super.testCorrectCodeSamples();
    }
    
}
