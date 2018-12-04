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
public class DesignTest extends ExternalizedSamplesSectionTest{
    public static final String DESCRIPTION=
"A design specifies: the set of variables and constants that are involved in an experiment,"+
" the populations of the experiment a description of the experimental individual,"+
" and the experimental design of the experiment. The experimental desing describes the groups" +
" that are created based on the population of the experiment and the specific sequence of "+
" treaments and measurements (named experimental protocol) that must be performed on each "+
" individual in order to conduct the experiment.";

    public DesignTest() throws IOException {
        super("design",DESCRIPTION,DEFAULT_BASE_PATH+"/6-Design");
    }
    
    @Test
    @Override
    public void testCorrectCodeSamples(){
        super.testCorrectCodeSamples();
    }
    
    
}
