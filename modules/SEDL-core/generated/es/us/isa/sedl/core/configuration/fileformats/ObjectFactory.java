//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:44:54 PM CET 
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

    private final static QName _CsvFileFormat_QNAME = new QName("http://isa.us.es/sedl/core/configuration/fileformats", "CsvFileFormat");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.us.isa.sedl.core.configuration.fileformats
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CsvFileFormat }
     * 
     */
    public CsvFileFormat createCsvFileFormat() {
        return new CsvFileFormat();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CsvFileFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/configuration/fileformats", name = "CsvFileFormat")
    public JAXBElement<CsvFileFormat> createCsvFileFormat(CsvFileFormat value) {
        return new JAXBElement<CsvFileFormat>(_CsvFileFormat_QNAME, CsvFileFormat.class, null, value);
    }

}
