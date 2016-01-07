/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.marshaller;

import es.us.isa.sedl.core.analysis.datasetspecification.DatasetSpecification;
import es.us.isa.sedl.core.analysis.datasetspecification.ValuationFilter;
import es.us.isa.sedl.core.analysis.statistic.DescriptiveStatisticValue;
import es.us.isa.sedl.core.analysis.statistic.PValue;
import es.us.isa.sedl.core.design.ControllableFactor;
import es.us.isa.sedl.core.design.Level;
import es.us.isa.sedl.core.design.NonControllableFactor;
import es.us.isa.sedl.core.design.VariableValuation;
import static junit.framework.TestCase.assertEquals;
import org.stringtemplate.v4.ST;

/**
 *
 * @author José Antonio Parejo
 */
public class SEDL4PeopleStatisicalAnalysisResultMarshallingTest extends AbstractMarshallingTest {

    public void testMean() {
        DatasetSpecification datasetSpec = new DatasetSpecification();
        ValuationFilter vf = new ValuationFilter();
        VariableValuation vv = new VariableValuation();
        Level l = new Level();
        l.setValue("EA");
        vv.setLevel(l);
        ControllableFactor cf = new ControllableFactor();
        cf.setName("Algorithm");
        vv.setVariable(cf);
        vf.getVariableValuations().add(vv);
        VariableValuation vv2 = new VariableValuation();
        NonControllableFactor v2 = new NonControllableFactor();
        v2.setName("ProblemInstance");
        Level l2 = new Level();
        l2.setValue("PI0");
        vv2.setLevel(l2);
        vv2.setVariable(v2);
        vf.getVariableValuations().add(vv2);
        datasetSpec.getFilters().add(vf);
        DescriptiveStatisticValue dsv = new DescriptiveStatisticValue();
        dsv.setDescriptiveStatistic("Mean");
        dsv.setDatasetSpecification(datasetSpec);
        dsv.setId("A1");
        dsv.setValue("6.32");
        String expectedResult = "Mean(EA,PI0): 6.32";
    // A1 : Avg(EA PI0 ) : 6 . 3 2 , . . . , Avg(GRASP6j P0 ) : 5 . 4 1 , . . . ,
        // (EAj PI0 ) : 6 . 3 2 , . . . , (GRASP6j PI0 ) : 5 . 4 1
        ST st = getTemplate("exeFunction", dsv, "a");        
        String result = st.render();
        assertEquals(expectedResult, result);

    }

    public void stdDevTest() {
    // A2 : StdDev (EAj PI0 ) : 1 . 6 4 , . . . , StdDev (GRASP6j P0 ) : 0 . 4 1 , . . . ,
        //  StdDev (EAj PI10 ) : 5 . 3 2 , . . . , StdDev (GRASP6j PI10 ) : 1 . 1
    }

    public void rangeTest() {
    // A3 : Range (EA) : 1.7 - 223.62 , . . . , Range (GRASP) : 0 . 8 7 􀀀1 8 3 . 4 3
    }

    public void confidenceIntervalTest() {
    // A4 : CI (EAj PI0 ) : 6.12 􀀀7.218g , . . . , CI (GRASP6j P0 ) : 5 . 3 5 􀀀5 . 9 3 , . . . ,
        //  CI (EAj PI10 ) : 6 . 3 2 , . . . , CI (GRASP6j PI10 ) : 5 . 4 1
    }

    public void interQuartileRangeTest() {
    // a5 : IQR(EAj PI0 ) : 1 . 8 2 , . . . , IQR(GRASP6j PI0 ) : 0 . 5 7 , . . . ,
        //  IQR(EAj PI10 ) : 6 . 3 2 , . . . , IQR(GRASP6j PI10 ) : 5 . 4 1
    }

    public void rankingTest() {
    //A6 : Ranking : (GRASP+PR1 ) : 1 , (GRASP6 ) : 2 , . . . , ( TS+SA) : 5
    }

    public void testMedian() {
        // A7 : Median : 3 . 1 7 6
        DatasetSpecification datasetSpec = new DatasetSpecification();
        DescriptiveStatisticValue dsv = new DescriptiveStatisticValue();
        dsv.setDescriptiveStatistic("Median");
        dsv.setDatasetSpecification(datasetSpec);
        dsv.setId("A1");
        dsv.setValue("6.32");
        String expectedResult = "Median: 6.32";
        ST st = getTemplate("exeFunction", dsv, "a");        
        String result = st.render();
        assertEquals(expectedResult, result);
    }

    public void tstudentTest() {

    }

    public void testFriedman() {
    // A8 : Friedman : Pvalue : 0 . 0 0 0 1 7 , de s c r ipt ion : ’Chi-Squared dist.’ , freedom degrees : 2 4
        //    f(EA vs TS+SA) Pvalue : 0 . 0 6 3 Sthreshold : 0 . 0 2 g , . . . ,
        // f(EA vs GRASP6) Pvalue : 0 . 0 0 3 Sthreshold : 0 . 0 2 g
        PValue pvalue=new PValue();
        pvalue.setNHST("Friedman");
        pvalue.setDescription("no description");
        pvalue.setValue(0.03);
        pvalue.setDatasetSpecification(new DatasetSpecification());        
        String expectedResult = "Friedman: Pvalue:0.03, description:'no description', sthreshold:0.05";
        ST st = getTemplate("exeFunction", pvalue, "a");        
        String result = st.render();        
        assertEquals(expectedResult, result);
    }

}
