///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package es.us.isa.sedl.jlibsedl;
//
//import org.junit.Rule;
//import org.junit.rules.TemporaryFolder;
//import java.util.Map;
//import java.util.List;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import es.us.isa.sedl.core.util.Error;
//import static org.junit.Assert.*;
//import static es.us.isa.sedl.jlibsedl.util.GenerateSampleExperiments.*;
//import es.us.moses.schemas.sedl.v1.Experiment;
//import java.util.Collections;
//
///**
// *
// * @author japarejo
// */
//public class JLibSEDLTest {
//    
//    @Rule
//    public TemporaryFolder folder = new TemporaryFolder();
//
//    private String samplesFolder="src/main/resources/samples";
//    private List<String> samples;
//    private static final String JLibSEDLurl="http://moses.us.es/SEDL/";
//    private static final String version="v1.0";
//    
//    private Map<String,SEDLDocument> testDocuments;    
//    private Map<String,List<Error>> testErrors;
//    
//    public JLibSEDLTest() {
//            testDocuments=new HashMap<String, SEDLDocument>();
//            testErrors=new HashMap<String, List<Error>>();
//            samples=new ArrayList<String>();
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
//        samples.add("Empty");
//        testDocuments.put("Empty", new SEDLDocument(createEmptyExperiment(),Collections.EMPTY_LIST));
//        testErrors.put("Empty", new ArrayList<Error>());
//        
//        samples.add("Simple");
//        testDocuments.put("Simple", new SEDLDocument(createSimpleExperiment(),Collections.EMPTY_LIST));
//        testErrors.put("Simple", new ArrayList<Error>());
//        
//        
//        samples.add("SimpleCommand");
//        testDocuments.put("SimpleCommand", new SEDLDocument(createSimpleCommandExperiment(),
//                                                                            Collections.EMPTY_LIST));
//        
//       /* samples.add("Complex");
//        testDocuments.put("Complex", new SEDLDocument(createComplexDocument(),Collections.EMPTY_LIST));
//        testErrors.put("Complex", new ArrayList<Error>());
//        
//        samples.add("MOEDL");
//        testDocuments.put("MOEDL", createMOEDLDocument());
//        testErrors.put("MOEDL", new ArrayList<Error>());
//        */
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of createDocument method, of class JLibSEDL.
//     */
//    @Test
//    public void testCreateDocument() {
//        System.out.println("createDocument");
//        SEDLDocument expResult = new SEDLDocument();
//        SEDLDocument result = JLibSEDL.createDocument();
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of isSEDL method, of class JLibSEDL.
//     */
//    @Test
//    public void testIsSEDL_InputStream() {
//        try {
//            System.out.println("isSEDL");
//            InputStream stream = null;
//            boolean expResult = false;
//            boolean result = JLibSEDL.isSEDL(stream,SerializationFormat.XML);
//            // Simple test with a null stream:
//            assertEquals(expResult, result);        
//            
//            // simple test with a valid file:
//            stream=new FileInputStream(samplesFolder+"/Empty_Experiment.xml");
//            expResult = true;
//            result = JLibSEDL.isSEDL(stream,SerializationFormat.XML);
//            assertEquals(expResult, result);        
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(JLibSEDLTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
//
//    /**
//     * Test of isSEDL method, of class JLibSEDL.
//     */
//    @Test
//    public void testIsSEDL_File() {
//        System.out.println("isSEDL");        
//        File f = null;
//        boolean expResult = false;
//        boolean result = JLibSEDL.isSEDL(f);
//        //Simple test with a null file:
//        assertEquals(expResult, result);
//        
//        //Simple test with a non-existent file:
//        f = new File("ThisFileDoesNotExists.xml");
//        expResult = false;
//        result = JLibSEDL.isSEDL(f);
//        assertEquals(expResult, result);
//        
//        
//        // Simple test with a empty valid file:
//        f=new File(samplesFolder+"/Empty_Experiment.xml");
//        expResult=true;
//        result = JLibSEDL.isSEDL(f);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of readDocument method, of class JLibSEDL.
//     */
//    @Test
//    public void testReadDocument_File() {
//        System.out.println("readDocument");
//        String errorPrefix=">>>>>>>>>>>>>>>>";
//        File f = null;
//        SEDLDocument expResult = null;
//        SEDLDocument result = null;
//        // Simple test with a null file (and corresponding expected null doc.)
//        // it should throw a file not found exception
//        try{
//             result=JLibSEDL.readDocument(f);            
//        }catch(FileNotFoundException ex){}
//        
//        assertEquals(expResult, result);
//        
//        f=new File("This file does not exists");
//        // Simple test with a file that does not exist (and corresponding expected null doc.)                
//        try{
//             result=JLibSEDL.readDocument(f);
//            fail("It should have thrown a FileNotFoundException");
//        }catch(FileNotFoundException ex){}
//        
//        assertEquals(expResult, result);
//        
//        // Reading documents in several formats
//        for(String document:testDocuments.keySet())
//        {
//            System.out.println("Testing the reading of document:"+document);
//            expResult = testDocuments.get(document);
//            // Simple test with XML
//            f=new File(samplesFolder+"/"+expResult.getExperiment().getName()+".xml");            
//            try {
//                result = JLibSEDL.readDocument(f);
//            } catch (FileNotFoundException ex) {
//                fail(ex.getMessage());
//            }
//             for(Error error:result.getErrors()) {
//                System.out.println(errorPrefix+error);
//            }
//            assertEquals(expResult, result);
//            
//            // Simple test with JSON
//            f=new File(samplesFolder+"/"+expResult.getExperiment().getName()+".json");            
//            try {
//                result = JLibSEDL.readDocument(f);
//            } catch (FileNotFoundException ex) {
//                fail(ex.getMessage());
//            }
//            for(Error error:result.getErrors()) {
//                System.out.println(errorPrefix+error);
//            }
//            assertEquals(expResult, result);
//        }
//    }
//
//    /**
//     * Test of readDocument method, of class JLibSEDL.
//     */
//    @Test
//    public void testReadDocument_InputStream() {
//        try {
//            System.out.println("readDocument");
//            InputStream stream = null;
//            Experiment expExperiment = null;
//            SEDLDocument result = JLibSEDL.readDocument(stream, SerializationFormat.XML);
//            // Simple test with a null stream:
//            assertEquals(null, result.getExperiment());
//            // Simple test with an empty experiment:            
//            stream=new FileInputStream(new File(samplesFolder+"/Empty_Experiment.xml"));
//            result = JLibSEDL.readDocument(stream,SerializationFormat.XML);           
//            assertEquals(createEmptyExperiment(), result.getExperiment());
//            assertTrue("There are errors reading the empty experiment!", result.getErrors().isEmpty());
//        } catch (FileNotFoundException ex) {            
//            fail(ex.getMessage());
//        }
//    }
//
//    /**
//     * Test of readDocument method, of class JLibSEDL.
//     */
//    @Test
//    public void testReadDocument_URI() {
//        System.out.println("readDocument");
//        URI uri = null;
//        SEDLDocument expResult = null;
//        SEDLDocument result = JLibSEDL.readDocument(uri);
//        // Simple test wit a null URL
//        assertEquals(expResult, result);        
//        try {
//            
//            // Simple test with URI that points to nowhere:
//            uri=new URI(JLibSEDLurl+version+"/samples/thisSampleDocumentDoesNotExists.xml");
//            result = JLibSEDL.readDocument(uri);
//            List<Error> errors=new ArrayList<Error>();
//            errors.add(new Error(0, Error.ERROR_SEVERITY.FATAL, ""));
//            expResult=new SEDLDocument(null, errors);
//            assertEquals(result.getExperiment(),expResult.getExperiment());
//            assertEquals(result.getErrors().size(),expResult.getErrors().size());
//            
//            // Simple test with a empty Experiment:
//            uri=new URI(JLibSEDLurl+version+"/samples/Empty_Experiment.xml");
//            result = JLibSEDL.readDocument(uri);
//            expResult=testDocuments.get("Empty");
//            // TODO: Uncomment when the first version is uploaded to the web site of SEDL:
//            //assertEquals(expResult, result);
//        } catch (URISyntaxException ex) {            
//            fail(ex.getLocalizedMessage());
//        }
//        
//    }
//    
//     /**
//     * Test of saveDocument method, of class JLibSEDL.
//     */
//    @Test
//    public void  testSaveDocument_File()
//    {
//         
//        
//        //If the file where we are going to save our document exists,
//        // then delete it.
//        File f;
//        try {
//            f = folder.newFile("emptySEDLDocument.xml");
//             if(f.exists())
//            f.delete();
//        
//            SEDLDocument document=testDocuments.get("Empty");
//            // We test that the save creates the corresponding file:
//            List<Error> errors=JLibSEDL.saveDocument(document.getExperiment(), f);
//            assertEquals(0, errors.size());
//            assertEquals(f.exists(),true);
//            // We test that if we load the document, we obtain an equal
//            // copy of the original.
//            SEDLDocument copyOfDocument=JLibSEDL.readDocument(f);
//            assertEquals(document,copyOfDocument);
//        } catch (IOException ex) {
//            Logger.getLogger(JLibSEDLTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       
//    }
//        
//    
//    
//}
