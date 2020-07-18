/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.marshaller;

import es.us.isa.sedl.core.analysis.datasetspecification.DatasetSpecification;
import es.us.isa.sedl.core.analysis.datasetspecification.Projection;
import es.us.isa.sedl.core.analysis.datasetspecification.ValuationFilter;
import es.us.isa.sedl.core.design.ControllableFactor;
import es.us.isa.sedl.core.design.Level;
import es.us.isa.sedl.core.design.VariableValuation;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
import org.stringtemplate.v4.ST;

/**
 *
 * @author José Antonio Parejo
 */
public class SEDL4PeopleStatisticalAnalysisSpecificationMarshallingTest extends AbstractMarshallingTest{        
    
    public static final String SIMPLE_DATASET_SPEC="where factor1 ";
    public static final String SIMPLE_DATASET_SPEC_WITH_PROJECTION="where factor1 of output ";
    public static final String SIMPLE_DATASET_SPEC_WITH_VALUE_FILTER="where factor1=1 ";
    
    @Test 
    public void testDatasetSpecification()
    {
        /*
        DatasetSpecification dss=buildSimpleDatasetSpec();

        // SIMPLE Datatset Specification
        ST st=getTemplate("dataSetSpecification",dss,"dss");        
        String result=st.render();
        String expectedResult=SIMPLE_DATASET_SPEC;
        assertEquals(expectedResult,result);
        
        // SIMPLE Datatset Specification with Projection
        dss=buildSimpleDatasetSpecWithProjection();
        st=getTemplate("dataSetSpecification",dss,"dss");
        expectedResult=SIMPLE_DATASET_SPEC_WITH_PROJECTION;        
        result=st.render();
        assertEquals(expectedResult,result);
        
        // SIMPLE Datatset Specification with value filter
        dss=buildValueFilteredDatasetSpec();
        st=getTemplate("dataSetSpecification",dss,"dss");
        expectedResult=SIMPLE_DATASET_SPEC_WITH_VALUE_FILTER;
        result=st.render();
        assertEquals(expectedResult,result);
        */
    }
    
    private DatasetSpecification buildSimpleDatasetSpec()
    {
        DatasetSpecification dss=new DatasetSpecification();        
        ControllableFactor factor1=new ControllableFactor();
        factor1.setName("factor1");
        VariableValuation vv=new VariableValuation();
        vv.setVariable(factor1.getName());
        ValuationFilter f=new ValuationFilter();
        f.getVariableValuations().add(vv);                
        dss.getFilters().add(f);
        return dss;
    }
    
    private DatasetSpecification buildSimpleDatasetSpecWithProjection()
    {
        DatasetSpecification dss=buildSimpleDatasetSpec();
        Projection p=new Projection();
        p.getProjectedVariables().add("output");
        dss.getProjections().add(p);
        return dss;
    }
    
    private DatasetSpecification buildValueFilteredDatasetSpec()
    {
        DatasetSpecification dss=buildSimpleDatasetSpec();
        Level l=new Level();
        l.setValue("1");
        for(ValuationFilter f:dss.getValuationFilters())
            for(VariableValuation vv:f.getVariableValuations())
                vv.setLevel(l.getValue());
        return dss;
    }
    
    @Test 
    public void testAVG()
    {
        //Avg( F i l t e r (OptTech ) . Group( Ins tanc e ) . Proj (ObjFunc ) )
        
    }
    @Test 
    public void testRange(){
        //Range ( F i l t e r (OptTech ) . Proj (ObjFunc ) )
    }
    @Test 
    public void testIQR(){
        // IQR( F i l t e r (OptTech ) . Group( Ins tanc e ) . Proj (ObjFunc ) )
    }
    
    @Test 
    public void testMedian()
    {
        // Median( Proj (ObjFunc ) )
    }
    @Test 
    public void testMode()
    {
        
    }
    @Test 
    public void testStdDev()
    {
        //StdDev ( F i l t e r (OptTech ) . Group( Ins tanc e ) . Proj (ObjFunc ) )
        
    }
    @Test 
    public void testVariance()
    {
        
    }
    @Test 
    public void testTTest()
    {
        
    }
    @Test 
    public void testAnova()
    {
        
    }
    @Test 
    public void testWilcoxon()
    {
        
    }
    @Test 
    public void testFriedman()
    {
    
    }
    
    @Test
    public void testKolmogorvSmirnov()
    {
        
    }
    
    @Test
    public void testLevene()
    {
        
    }        
    
    @Test 
    public void testRanking(){
        //Ranking (Avg( F i l t e r (OptTech ) . Group( Ins tanc e ) . Proj (ObjFunc ) ) , OptTech )
    }

    @Test 
    public void testCI(){
        //CI ( F i l t e r (OptTech ) . Group( Ins tanc e ) . Proj (ObjFunc ) )
    }

    @Test 
    public void testPearson()
    {
    
    }
    
    @Test 
    public void testBivariateRegression()
    {
        
    }
    
    @Test 
    public void testSpearman()
    {
        
    }
    
    @Test 
    public void testKendall(){
    }
    
    
    @Test 
    public void testCRAMER(){
    }
    
    @Test 
    public void testLogLinear(){
        
    }

    @Test 
    public void testLilliefors(){
        
    }
    @Test 
    public void testShapiroWilk(){
        
    }
    
    @Test 
    public void testTstudent(){
        
    }
    
    @Test 
    public void testMcNemar(){
        
    }
    @Test 
    public void testANOVA(){
        
    }
    @Test 
    public void testFactANOVAwRS(){
        
    }
    
    @Test 
    public void testAlignedFriedman(){
        
    }
    @Test 
    public void testImanDavenport(){
        
    }
    @Test 
    public void testQuade(){
        
    }
    @Test 
    public void testCochranQ(){
        
    }
    @Test 
    public void testBonferroniDunn(){
        
    }
    @Test 
    public void testHolms(){
        
    }
    @Test 
    public void testHochberg(){
        
    }
    @Test 
    public void testHommel(){
        
    }
    @Test 
    public void testHolland(){
        
    }
    @Test 
    public void testRom(){
        
    }
    @Test 
    public void testFinner(){
        
    }
    @Test 
    public void testLi(){
        
    }
    @Test 
    public void testShaffer(){
        
    }
    @Test 
    public void testNemenyi(){
        
    }

    @Test 
    public void testSignTest(){
        
    }
    @Test 
    public void testChiSquare(){
        
    }
    @Test 
    public void testKruskalWalls(){
        
    }
    @Test 
    public void testFisher(){
        
    }
    @Test 
    public void testTukey(){
        
    }

}
