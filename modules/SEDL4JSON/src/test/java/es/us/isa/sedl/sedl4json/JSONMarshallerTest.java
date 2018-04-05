/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.sedl4json;

import es.us.isa.sedl.core.BasicExperiment;
import es.us.isa.sedl.core.Experiment;
import es.us.isa.sedl.core.design.ControllableFactor;
import es.us.isa.sedl.core.design.Design;
import es.us.isa.sedl.core.design.ExtensionDomain;
import es.us.isa.sedl.core.design.Factor;
import es.us.isa.sedl.core.design.FundamentalSet;
import es.us.isa.sedl.core.design.FundamentalSetConstraint;
import es.us.isa.sedl.core.design.IntensionDomain;
import es.us.isa.sedl.core.design.Level;
import es.us.isa.sedl.core.design.Outcome;
import es.us.isa.sedl.core.design.Variable;
import es.us.isa.sedl.core.design.Variables;
import java.io.OutputStream;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author japarejo
 */
public class JSONMarshallerTest extends TestCase {
    
    public JSONMarshallerTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of write method, of class JSONMarshaller.
     *
    public void testWrite() {
        System.out.println("write");
        Experiment exp = null;
        OutputStream os = null;
        JSONMarshaller instance = new JSONMarshaller();
        List<String> expResult = null;
        List<String> result = instance.write(exp, os);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of asString method, of class JSONMarshaller.
     */
    public void testAsString() {
        System.out.println("asString");
        BasicExperiment exp = new BasicExperiment();
        FundamentalSetConstraint integerConstraint=new FundamentalSetConstraint();
        integerConstraint.setFundamentalSet(FundamentalSet.N);
        IntensionDomain d=new IntensionDomain();        
        d.getConstraint().add(integerConstraint);
        Outcome out=new Outcome();
        out.setDomain(d);        
        ExtensionDomain ed=new ExtensionDomain();
        Level mf=new Level();
        mf.setValue("MF");
        Level ps=new Level();
        ps.setValue("PS");
        ed.getLevels().add(ps);
        ed.getLevels().add(mf);
        Factor f=new ControllableFactor();
        f.setName("Treatment");
        f.setDomain(ed);        
        Design design=new Design();
        Variables vars=new Variables();
        design.setVariables(vars);
        exp.setDesign(design);        
        design.getVariables().getVariable().add(f);
        design.getVariables().getVariable().add(out);
        JSONMarshaller instance = new JSONMarshaller();        
        String result = instance.asString(exp);
        System.out.println(result);
        assertTrue(true);
        
    }
    
}
