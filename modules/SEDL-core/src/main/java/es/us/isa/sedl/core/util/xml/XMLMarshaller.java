/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.util.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;
import es.us.isa.sedl.core.Experiment;

import es.us.isa.sedl.core.util.SEDLMarshaller;
import javax.xml.bind.JAXBIntrospector;



/**
 *
 * @author japarejo
 */
public class XMLMarshaller implements SEDLMarshaller{

    /**
     * The output XML file.
     */
    protected URI uri;
    public static NamespacePrefixMapperImpl namespacePrefixMapper = new NamespacePrefixMapperImpl();
    /**
     * Create an xml based writer for specified jaxbObject.
     *
     * @param uri - uri for output XML file
     */
    public XMLMarshaller(final URI uri) {
        this.uri = uri;
    }

    public XMLMarshaller() {
        this.uri=null;
    }
    

//
// XMLMarshaller
//
    /**
     * Write JAXBElement representation of object to XML file.
     *     
* @param jaxbObject - object for marshalling to xml, converted to
     * JAXBElement. Conversion is done using function inside ObjectFactory.java
     * which is created with xjc utility
     * @param docClass - class for object that is going to be marshalled to XML
     * @param mapper
     *     
* @throws IOException If an I/O error occurred.
     * @throws FileNotFoundException If the resource was not found.
     */
    public void write(final Object jaxbObject, Class docClass, NamespacePrefixMapper mapper) throws IOException {
        final OutputStream os = new FileOutputStream(uri.getPath());

        if (os == null) {
            throw new FileNotFoundException("Cannot create resource: " + uri);
        }

        try {
            write(jaxbObject, docClass, os,mapper);
        } finally {
            os.close();
        }
    }
    
    @Override
    public List<String>write(final Experiment exp, final OutputStream os) throws IOException
    {    	
        //ObjectFactory of=new ObjectFactory();
        //JAXBElement<Experiment> element=of.createExperiment(exp);
        //return write(element,exp.getClass(),os);
    	return write(exp,exp.getClass(),os);
    }

    public List<String> write(final Object jaxbObject, Class docClass, final OutputStream os)  throws IOException{
        return write(jaxbObject,docClass,os,namespacePrefixMapper);
    }
    
    public List<String> write(final Object jaxbObject, Class docClass, final OutputStream os, NamespacePrefixMapper mapper)  throws IOException{
        List<String> errors=new ArrayList<String>();
        try {
            marshall(jaxbObject, docClass, os,mapper);
        } catch (JAXBException ex) {
            //Logger.getLogger(XMLMarshaller.class.getName()).log(Level.SEVERE,"Error in marshalling to XML.", ex);
            errors.add(ex.getLocalizedMessage());
        }
        return errors;
    }

    private void marshall(final Object jaxbObject, Class docClass, final OutputStream os, NamespacePrefixMapper mapper)
            throws JAXBException {
        
            String packageName = docClass.getPackage().getName();
            JAXBContext jaxbContext = JAXBContext.newInstance(packageName);
            Marshaller jaxbMarshaller= jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", mapper);
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);	
            jaxbMarshaller.marshal(jaxbObject, os);
            
            
    }

    @Override
    public String asString(Experiment exp) {
        String result=null;
        try {
            String packageName = exp.getClass().getPackage().getName();
            JAXBContext context = JAXBContext.newInstance(packageName);
            JAXBElement<Experiment> experimentElementent=new JAXBElement<Experiment>(new QName("uri","local"),(Class<Experiment>)exp.getClass(),exp);
            Marshaller m = context.createMarshaller();            
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);	
            m.setProperty("com.sun.xml.bind.namespacePrefixMapper", namespacePrefixMapper);                
            StringWriter writer = new StringWriter();
            m.marshal(experimentElementent, writer);
            result=writer.toString();
        } catch (JAXBException ex) {
            Logger.getLogger(XMLMarshaller.class.getName()).log(Level.SEVERE, null, ex);
            result="ERROR: "+ex.getMessage();
        }
        return result;
    }
}
