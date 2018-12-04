/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.marshaller;

import es.us.isa.sedl.core.Experiment;
import es.us.isa.sedl.grammar.SEDL4PeopleParser;
import es.us.isa.sedl.sedl4people.grammar.test.CodeSample;
import es.us.isa.sedl.sedl4people.grammar.test.ExternalizedSamplesSectionTest;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author japarejo
 */
public abstract class SEDL4PeopleUnmarshallingTest extends ExternalizedSamplesSectionTest{
    public static final String RULE ="document";    
    Map<String,Experiment> experiments;
    public SEDL4PeopleUnmarshallingTest(String path, Map<String,Experiment> experiments) throws IOException
    {
        this("",path,experiments);
    }
    
    public SEDL4PeopleUnmarshallingTest(String description,String path, Map<String,Experiment> experiments) throws IOException
    {
        super(RULE,description,path);
        this.experiments=experiments;
    }
    
    @Test
    public void testExperimentConstruction()
    {
        for(CodeSample codeSample:codeSamples)
        {
            Experiment exp=experiments.get(codeSample.getIdentifier());
            if(exp==null)
                throw new IllegalStateException("The code sample with identifier "+codeSample.getIdentifier()+" has not a corresponding experiment.");
            assertTrue(checkEquals(codeSample,exp));
        }
    }
    
    public boolean checkEquals(CodeSample codeSample, Experiment experiment)
    {
        boolean result=false;
        try {
            setup(codeSample.getCode());
            ParseTreeWalker walker = new ParseTreeWalker();
            SEDL4PeopleExtendedListener listener = new SEDL4PeopleExtendedListener(null,null);
            walker.walk(listener, parser.document());
            result=experiment.equals(listener.getExperimentModel());
        } catch (IOException ex) {
            Logger.getLogger(SEDL4PeopleUnmarshallingTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
