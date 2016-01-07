///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package es.us.isa.sedl.jlibsedl;
//
//import es.us.isa.sedl.jlibsedl.SEDLDocument;
//import es.us.moses.schemas.sedl.v1.BasicExperiment;
//import es.us.moses.schemas.sedl.v1.Experiment;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
//import java.util.List;
//import java.util.ListIterator;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author japarejo
// */
//public class SEDLDocumentTest {
//    
//    public SEDLDocumentTest() {
//    }
//
//    @BeforeClass
//    public static void setUpClass() throws Exception {
//    }
//
//    @AfterClass
//    public static void tearDownClass() throws Exception {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of getErrors method, of class SEDLDocument.
//     */
//    @Test
//    public void testGetErrors() {
//        System.out.println("getErrors");
//        SEDLDocument instance = new SEDLDocument();
//        List expResult = new ArrayList();
//        List result = instance.getErrors();
//        assertEquals(expResult, result);        
//    }
//
//    /**
//     * Test of getExperiment method, of class SEDLDocument.
//     */
//    @Test
//    public void testGetExperiment() {
//        System.out.println("getExperiment");
//        SEDLDocument instance = new SEDLDocument();
//        Experiment expResult = new BasicExperiment();
//        Experiment result = instance.getExperiment();
//        assertEquals(expResult, result);        
//    }
//}
