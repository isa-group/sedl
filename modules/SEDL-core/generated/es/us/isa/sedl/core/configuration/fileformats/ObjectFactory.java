//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.17 a las 12:43:04 AM CEST 
//


package es.us.isa.sedl.core.configuration.fileformats;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.us.isa.sedl.core.configuration.fileformats package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CSVFileFormat_QNAME = new QName("http://isa.us.es/sedl/core/configuration/fileformats", "CSVFileFormat");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.us.isa.sedl.core.configuration.fileformats
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CSVFileFormat }
     * 
     */
    public CSVFileFormat createCSVFileFormat() {
        return new CSVFileFormat();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CSVFileFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/configuration/fileformats", name = "CSVFileFormat")
    public JAXBElement<CSVFileFormat> createCSVFileFormat(CSVFileFormat value) {
        return new JAXBElement<CSVFileFormat>(_CSVFileFormat_QNAME, CSVFileFormat.class, null, value);
    }

}
