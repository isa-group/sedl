/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.jlibsedl;


import es.us.isa.sedl.core.util.SEDLMarshaller;
import es.us.isa.sedl.core.util.SEDLUnmarshaller;
import es.us.isa.sedl.core.util.xml.XMLMarshaller;
import es.us.isa.sedl.core.util.xml.XMLUnmarshaller;
import es.us.isa.sedl.marshaller.SEDL4PeopleMarshaller;
import es.us.isa.sedl.marshaller.SEDL4PeopleUnmarshaller;
import es.us.isa.sedl.module.sedl4people.SEDL4PeopleExtensionPointsUnmarshallerImplementation;
import es.us.isa.sedl.sedl4json.JSONMarshaller;
import es.us.isa.sedl.sedl4json.JSONUnmarshaller;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author japarejo
 */
public enum SerializationFormat {
    XML(new XMLMarshaller(),new XMLUnmarshaller(),"xml","sedl"),
    JSON(new JSONMarshaller(),new JSONUnmarshaller(),"json","jsn","js"),
    SEDL4People(new SEDL4PeopleMarshaller(), new SEDL4PeopleUnmarshaller(),"s4p","sedl4p","sedl4people");
    
    private final SEDLMarshaller marshaller;
    private final SEDLUnmarshaller unmarshaller;
    private final List<String> validFileExtensions;
    
    private SerializationFormat(SEDLMarshaller marshaller,SEDLUnmarshaller unmarshaller,String... extensions) {
        this.marshaller = marshaller;
        this.unmarshaller = unmarshaller;
        this.validFileExtensions=Arrays.asList(extensions);                
    }

    
    
    public SEDLMarshaller getMarshaller() {
        return marshaller;
    }

    public SEDLUnmarshaller getUnmarshaller() {
        return unmarshaller;
    }

    public List<String> getValidFileExtensions() {
        return validFileExtensions;
    }
    
    static{
        ((SEDL4PeopleUnmarshaller)SEDL4People.getUnmarshaller()).setEpUnmarshaller(new SEDL4PeopleExtensionPointsUnmarshallerImplementation());        
    }
    
}
