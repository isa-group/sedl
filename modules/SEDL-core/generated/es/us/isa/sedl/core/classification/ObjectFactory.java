//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.05 a las 07:27:38 PM CEST 
//


package es.us.isa.sedl.core.classification;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.us.isa.sedl.core.classification package. 
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

    private final static QName _ExperimentalClassification_QNAME = new QName("http://isa.us.es/sedl/core/classification", "ExperimentalClassification");
    private final static QName _ExperimentalClassificationType_QNAME = new QName("http://isa.us.es/sedl/core/classification", "ExperimentalClassificationType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.us.isa.sedl.core.classification
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExperimentalClassification }
     * 
     */
    public ExperimentalClassification createExperimentalClassification() {
        return new ExperimentalClassification();
    }

    /**
     * Create an instance of {@link ExperimentalClassificationType }
     * 
     */
    public ExperimentalClassificationType createExperimentalClassificationType() {
        return new ExperimentalClassificationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExperimentalClassification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/classification", name = "ExperimentalClassification")
    public JAXBElement<ExperimentalClassification> createExperimentalClassification(ExperimentalClassification value) {
        return new JAXBElement<ExperimentalClassification>(_ExperimentalClassification_QNAME, ExperimentalClassification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExperimentalClassificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/classification", name = "ExperimentalClassificationType")
    public JAXBElement<ExperimentalClassificationType> createExperimentalClassificationType(ExperimentalClassificationType value) {
        return new JAXBElement<ExperimentalClassificationType>(_ExperimentalClassificationType_QNAME, ExperimentalClassificationType.class, null, value);
    }

}
