/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.semantic;

import es.us.isa.sedl.core.EmpiricalStudy;
import es.us.isa.sedl.marshaller.SEDL4PeopleUnmarshaller;
import es.us.isa.sedl.sedl4people.grammar.test.CodeSample;
import es.us.isa.sedl.sedl4people.grammar.test.ExternalizedSamplesSectionTest;
import es.us.isa.sedl.sedl4people.grammar.test.SemanticsSpec;
import java.io.IOException;
import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 *
 * @author japarejo
 */
public class SEDL4PeopleSemanticalTest extends ExternalizedSamplesSectionTest{
    public static final String RULE ="document";    
    public static final String DEFAULT_PATH = "src/main/resources/tests/semantics/initialsamples";    
    private ExpressionParser expressionParser;
        
    
    public SEDL4PeopleSemanticalTest() throws IOException
    {    
        super(RULE,"",DEFAULT_PATH);
        this.expressionParser=new SpelExpressionParser();
    }
    

       
    @Test
    public void testSemantics()
    {
        
        EmpiricalStudy experiment=null;
        SEDL4PeopleUnmarshaller unmarshaller = new SEDL4PeopleUnmarshaller();
        for(CodeSample codeSample:codeSamples)       
        {                                   
            
            System.out.println("Evaluating semantics for codesample '"+codeSample.getIdentifier()+"'...");
            experiment = unmarshaller.fromString(codeSample.getCode());
            System.out.println("Unmarshall of the experiment sucessull... ");
            for(SemanticsSpec semanticSpec:codeSample.getExpectedSemantics())
            {
                    testSemanticSpec(codeSample.getIdentifier(),experiment,semanticSpec);
            }            
        }
    }
    
    private void testSemanticSpec(String codeSampleId,EmpiricalStudy experiment, SemanticsSpec semanticSpec) {
        System.out.println("Checking the semantics of '"+semanticSpec.getExpression()+"'");
        Expression exp = expressionParser.parseExpression(semanticSpec.getExpression());
        Object actualSemantics=exp.getValue(experiment);
        Object expectedSemantics=semanticSpec.getSemantics();
        String message="The sematics of '"+semanticSpec.getExpression()+"' on code sample '"+codeSampleId+"' are erroneous. ";        
        assertEquals(message,actualSemantics,expectedSemantics);
    }
    
    @Test
    public void testAssertions()
    {
        
        EmpiricalStudy experiment=null;
        SEDL4PeopleUnmarshaller unmarshaller = new SEDL4PeopleUnmarshaller();
        for(CodeSample codeSample:codeSamples)       
        {
            
                System.out.println("Evaluating assertions for codeSample '"+codeSample.getIdentifier()+"'...");
                experiment = unmarshaller.fromString(codeSample.getCode());
                System.out.println("Unmarshall of the experiment sucessull... ");
                for(String assertion:codeSample.getSemanticAssertions())
                {
                    testAssertion(codeSample.getIdentifier(),assertion,experiment);
                }            
        }
    }

    private void testAssertion(String codeSampleId,String assertion, EmpiricalStudy experiment) {
        System.out.print("Checking the assertion '"+assertion+"'...");
        Expression exp = expressionParser.parseExpression(assertion);
        Object assertionResult=exp.getValue(experiment);
        if(assertionResult instanceof Boolean){
            assertTrue("The assertion '"+assertion+"' does not hold for code sample '"+codeSampleId+"'",(Boolean)assertionResult);
        }else
            throw new IllegalArgumentException("The assertion '"+assertion+"' is not a valid, since its evaluation does not return a boolean result");
    }

    
    

}
