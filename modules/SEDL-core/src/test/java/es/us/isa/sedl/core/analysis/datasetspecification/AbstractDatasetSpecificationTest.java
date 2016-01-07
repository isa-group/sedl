/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.analysis.datasetspecification;

import es.us.isa.jdataset.DataSet;
import es.us.isa.jdataset.loader.CSVLoader;
import es.us.isa.sedl.core.design.ControllableFactor;
import es.us.isa.sedl.core.design.ExtensionDomain;
import es.us.isa.sedl.core.design.Level;
import es.us.isa.sedl.core.design.Outcome;
import es.us.isa.sedl.core.design.Variable;
import es.us.isa.sedl.core.design.VariableKind;
import es.us.isa.sedl.core.design.VariableValuation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import junit.framework.TestCase;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

/**
 *
 * @author José Antonio Parejo
 */
public class AbstractDatasetSpecificationTest extends TestCase {
    private static String NEW_LINE=System.getProperty("line.separator");
    public AbstractDatasetSpecificationTest(String testName) {
        super(testName);
    }    

    /**
     * Test of expand method, of class AbstractDatasetSpecification.
     */
    public void testExpand() {
    }

    /**
     * Test of apply method, of class AbstractDatasetSpecification.
     */
    public void testApply() {
        try {
            CSVLoader csvLoader=new CSVLoader(Boolean.TRUE);
            String initialDatasetContent=   "Sex;Height"+NEW_LINE
                    +   "man;1.82"+NEW_LINE
                    +   "woman;1.63";
            DataSet initialDataset=csvLoader.load(IOUtils.toInputStream(initialDatasetContent), "csv");
            // TESTING PROJECTION APPLICATION:
            String expectedResultContent=   "Height"+NEW_LINE
                    +   "1.82"+NEW_LINE
                    +   "1.63";
            DataSet expectedResult=csvLoader.load(IOUtils.toInputStream(expectedResultContent), "csv");
            DatasetSpecification datasetSpecification=new DatasetSpecification();            
            Projection projection=new Projection();
            projection.getProjectedVariables().add("Height");
            datasetSpecification.getProjections().add(projection);
            DataSet result=datasetSpecification.apply(initialDataset);
            assertEquals(expectedResult, result);
            // TESTING PROJECTION & FILTER APPLICATION:
            expectedResultContent=   "Height"+NEW_LINE
                                 +   "1.82";         
            expectedResult=csvLoader.load(IOUtils.toInputStream(expectedResultContent), "csv");
            ValuationFilter filter=new ValuationFilter();
            Variable var=new Outcome();
            var.setName("Sex");
            var.setKind(VariableKind.NOMINAL);
            Level l=new Level();
            l.setValue("man");
            VariableValuation valuation=new VariableValuation();
            valuation.setVariable(var);
            valuation.setLevel(l);
            filter.getVariableValuations().add(valuation);
            datasetSpecification.getFilters().add(filter);
            result=datasetSpecification.apply(initialDataset);
            assertEquals(expectedResult, result);            
        } catch (IOException ex) {
            Logger.getLogger(AbstractDatasetSpecificationTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            fail(ex.getMessage());
        }
    }      
    
    
    public void testApplyWithGrouping() {
        try {
            CSVLoader csvLoader=new CSVLoader(Boolean.TRUE);
            String initialDatasetContent=   "Sex;Height"+NEW_LINE
                    +   "man;1.82"+NEW_LINE
                    +   "woman;1.63";
            DataSet initialDataset=csvLoader.load(IOUtils.toInputStream(initialDatasetContent), "csv");
            // TESTING PROJECTION APPLICATION:
            String expectedResultContent=   "Height|Sex=man;Height|Sex=woman"+NEW_LINE
                    +   "1.82;1.63";
            DataSet expectedResult=csvLoader.load(IOUtils.toInputStream(expectedResultContent), "csv");
            DatasetSpecification datasetSpecification=new DatasetSpecification();     
            GroupingProjection gp=new GroupingProjection();
            gp.getProjectedVariables().add("Sex");
            datasetSpecification.getProjections().add(gp);
            DataSet result=datasetSpecification.apply(initialDataset);
            assertEquals(expectedResult,result);
        } catch (IOException ex) {
            Logger.getLogger(AbstractDatasetSpecificationTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            fail(ex.getMessage());
        }
    }

    /**
     * Test of generateNonExpandableFilter method, of class AbstractDatasetSpecification.
     */
    public void testGenerateNonExpandableFilter() {
    }

    /**
     * Test of findVariablesToExpand method, of class AbstractDatasetSpecification.
     */
    public void testFindVariablesToExpand() {
    }

    /**
     * Test of expandValuations method, of class AbstractDatasetSpecification.
     */
    public void testExpandValuations_List() {
        
        Variable var1=new ControllableFactor();
        var1.setName("var1");
        ExtensionDomain d1=new ExtensionDomain();
        Level la=new Level();
        la.setValue("a");
        Level lb=new Level();
        lb.setValue("b");
        d1.getLevels().add(la);
        d1.getLevels().add(lb);
        var1.setDomain(d1);
        List<Variable> lv=new ArrayList<Variable>();
        lv.add(var1);
        //lv.add(var2);
        
        List<Set<VariableValuation>> expectedResult=new ArrayList<Set<VariableValuation>>();
        Set<VariableValuation> s1=new HashSet<VariableValuation>();
        VariableValuation vv1=new VariableValuation();
        vv1.setLevel(la);
        vv1.setVariable(var1);
        s1.add(vv1);
        Set<VariableValuation> s2=new HashSet<VariableValuation>();
        VariableValuation vv2=new VariableValuation();
        vv2.setLevel(lb);
        vv2.setVariable(var1);
        s2.add(vv2);
        expectedResult.add(s1);
        expectedResult.add(s2);
        DatasetSpecification dss=new DatasetSpecification();
        List<Set<VariableValuation>> result=dss.expandValuations(lv);
        assertEquals(expectedResult, result);
        
        Variable var2=new ControllableFactor();
        var2.setName("var2");
        ExtensionDomain d2=new ExtensionDomain();
        Level l1=new Level();
        l1.setValue("1");
        Level l2=new Level();
        l2.setValue("2");
        d2.getLevels().add(l1);
        d2.getLevels().add(l2);
        var2.setDomain(d2);        
        lv.add(var2);
        
        
        Set<VariableValuation> s3=new HashSet<VariableValuation>();
        VariableValuation vv3=new VariableValuation();
        vv3.setLevel(l1);
        vv3.setVariable(var2);
        s1.add(vv3);
        s3.add(vv2);
        s3.add(vv3);
        Set<VariableValuation> s4=new HashSet<VariableValuation>();
        VariableValuation vv4=new VariableValuation();
        vv4.setLevel(l2);
        vv4.setVariable(var2);
        s2.add(vv4);
        s4.add(vv1);
        s4.add(vv4);
        expectedResult.clear();
        expectedResult.add(s1);
        expectedResult.add(s4);
        expectedResult.add(s3);
        expectedResult.add(s2);
        
        result=dss.expandValuations(lv);        
        assertEquals(expectedResult, result);
    }

    /**
     * Test of expandValuations method, of class AbstractDatasetSpecification.
     */
    public void testExpandValuations_3args() {
    }

    /**
     * Test of createSimpleDSS method, of class AbstractDatasetSpecification.
     */
    public void testCreateSimpleDSS() {
    }    

    /**
     * Test of getProjections method, of class AbstractDatasetSpecification.
     */
    @Test
    public void testGetProjections() {
    }

    /**
     * Test of getFilters method, of class AbstractDatasetSpecification.
     */
    @Test
    public void testGetFilters() {
    }

    /**
     * Test of getGroupings method, of class AbstractDatasetSpecification.
     */
    @Test
    public void testGetGroupings() {
    }

    /**
     * Test of getValuationFilters method, of class AbstractDatasetSpecification.
     */
    @Test
    public void testGetValuationFilters() {
    }    
    
}
