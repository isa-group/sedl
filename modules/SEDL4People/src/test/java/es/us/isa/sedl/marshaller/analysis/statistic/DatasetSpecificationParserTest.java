/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.marshaller.analysis.statistic;

import es.us.isa.sedl.core.analysis.datasetspecification.DatasetSpecification;
import es.us.isa.sedl.core.analysis.datasetspecification.GroupingProjection;
import es.us.isa.sedl.core.analysis.datasetspecification.Projection;
import es.us.isa.sedl.core.analysis.datasetspecification.ValuationFilter;
import es.us.isa.sedl.core.analysis.statistic.Statistic;
import es.us.isa.sedl.core.design.ControllableFactor;
import es.us.isa.sedl.core.design.ExtensionDomain;
import es.us.isa.sedl.core.design.FundamentalSet;
import es.us.isa.sedl.core.design.FundamentalSetConstraint;
import es.us.isa.sedl.core.design.IntensionDomain;
import es.us.isa.sedl.core.design.Level;
import es.us.isa.sedl.core.design.Outcome;
import es.us.isa.sedl.core.design.VariableKind;
import es.us.isa.sedl.core.design.VariableValuation;
import es.us.isa.sedl.core.design.Variables;
import es.us.isa.sedl.grammar.SEDL4PeopleParser;
import es.us.isa.sedl.marshaller.SEDL4PeopleExtendedListener;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author José Antonio Parejo
 */
public class DatasetSpecificationParserTest {
    
    public DatasetSpecificationParserTest() {
    }
    
    
    /**
     * Test of parse method, of class DatasetSpecificationParser.
     */
    @Test
    public void testParse_String_SEDL4PeopleExtendedListener() {
        System.out.println("parse");
        String spec="Filter(v1).Projection(outcome)";
        SEDL4PeopleExtendedListener l   = new SEDL4PeopleExtendedListener(null,null);        
        Variables variables=new Variables();
        ControllableFactor cf=new ControllableFactor();
        cf.setName("v1");
        cf.setKind(VariableKind.SCALAR);
        ExtensionDomain ed=new ExtensionDomain();
        Level l1=new Level();
        l1.setValue("1.0");
        Level l2=new Level();
        l2.setValue("2.0");
        ed.getLevels().add(l1);
        ed.getLevels().add(l2);
        cf.setDomain(ed);
        variables.getVariable().add(cf);
        Outcome outcome=new Outcome();
        outcome.setName("outcome");
        outcome.setKind(VariableKind.SCALAR);
        IntensionDomain id=new IntensionDomain();
        FundamentalSetConstraint fsc=new FundamentalSetConstraint();
        fsc.setFundamentalSet(FundamentalSet.R);
        id.getConstraint().add(fsc);
        outcome.setDomain(id);
        variables.getVariable().add(outcome);
        l.setVariables(variables);
        
        DatasetSpecificationParser instance = new DatasetSpecificationParser();
        DatasetSpecification expResult = new DatasetSpecification();
        ValuationFilter vf=new ValuationFilter();
        VariableValuation vv=new VariableValuation();
        vv.setVariable(cf);
        vf.getVariableValuations().add(vv);
        expResult.getFilters().add(vf);
        //Projection p=new Projection();
        //p.getProjectedVariables().add(outcome.getName());
        //expResult.getProjections().add(p);
        DatasetSpecification result = instance.parse(spec, l);
        assertEquals(expResult, result);        
    }

    /**
     * Test of defaultDatsetSpecification method, of class DatasetSpecificationParser.
    
    @Test
    public void testDefaultDatsetSpecification() {
        System.out.println("defaultDatsetSpecification");
        SEDL4PeopleExtendedListener listener = null;
        Class<? extends Statistic> statisticType = null;
        String statisticName = "";
        DatasetSpecificationParser instance = new DatasetSpecificationParser();
        DatasetSpecification expResult = null;
        DatasetSpecification result = instance.defaultDatsetSpecification(listener, statisticType, statisticName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
     */
}
