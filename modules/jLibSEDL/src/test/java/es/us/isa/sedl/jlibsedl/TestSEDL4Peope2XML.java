/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.jlibsedl;

import es.us.isa.sedl.core.EmpiricalStudy;
import es.us.isa.sedl.core.util.xml.XMLMarshaller;
import es.us.isa.sedl.marshaller.SEDL4PeopleUnmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;

/**
 *
 * @author japar
 */
public class TestSEDL4Peope2XML {

    @Test
    public void test() {
        String path = "src/test/resources/SEDL4People2XML";
        File f = new File(path);
        if (f.exists() && f.isDirectory()) {
            String[] files = f.list();
            for (String filename : files) {
                if (filename.endsWith(".sedl") || filename.endsWith(".SEDL")) {
                    System.out.println("Converting '" + path + "/" + filename + "'");
                    convertToXML(path, filename);
                }
            }
        }
    }

    private void convertToXML(String path, String filename) {
        EmpiricalStudy result = readExperiment(path, filename);
        if (result != null) {
            FileOutputStream os = null;
            try {
                System.out.println("Read successfull!! Now we write in XML...");
                String outputFilename = filename.replace("sedl", "xml");
                os = new FileOutputStream(path + "/" + outputFilename);
                XMLMarshaller xmlMarshaller = new XMLMarshaller();
                xmlMarshaller.write(result, os);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TestSEDL4Peope2XML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TestSEDL4Peope2XML.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    os.close();
                } catch (IOException ex) {
                    Logger.getLogger(TestSEDL4Peope2XML.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    

    

    private EmpiricalStudy readExperiment(String path, String filename) {
        EmpiricalStudy result = null;
        InputStream is = null;
        SEDL4PeopleUnmarshaller sedl4PeopleUnmarshaller = new SEDL4PeopleUnmarshaller();
        try {
            is = new FileInputStream(path + "/" + filename);            
            result = sedl4PeopleUnmarshaller.read(is);            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestSEDL4Peope2XML.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (!sedl4PeopleUnmarshaller.getErrors().isEmpty()) {
                System.out.println("ERRORS FOUND!:");
                for (es.us.isa.sedl.core.util.Error error : sedl4PeopleUnmarshaller.getErrors()) {
                    System.out.println(error.getMessage());
                }
            }
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(TestSEDL4Peope2XML.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }
}
