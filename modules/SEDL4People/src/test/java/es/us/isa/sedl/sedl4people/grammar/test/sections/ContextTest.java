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
public class ContextTest extends ExternalizedSamplesSectionTest {    
    public static final String DESCRIPTION="";
    
    public ContextTest() throws IOException {
        super("experimentContext",DESCRIPTION,DEFAULT_BASE_PATH+"/2-Context");
    }
    
    @Test
    @Override
    public void testCorrectCodeSamples(){
        super.testCorrectCodeSamples();
    }
    
}
