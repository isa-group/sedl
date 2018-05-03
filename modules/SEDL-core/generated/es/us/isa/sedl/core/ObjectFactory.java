//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.03 a las 09:36:25 AM CEST 
//


package es.us.isa.sedl.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.us.isa.sedl.core package. 
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

    private final static QName _SEDLEntity_QNAME = new QName("http://isa.us.es/sedl/core", "SEDLEntity");
    private final static QName _SEDLBase_QNAME = new QName("http://isa.us.es/sedl/core", "SEDLBase");
    private final static QName _BasicExperiment_QNAME = new QName("http://isa.us.es/sedl/core", "BasicExperiment");
    private final static QName _Experiment_QNAME = new QName("http://isa.us.es/sedl/core", "Experiment");
    private final static QName _ExtensionPoint_QNAME = new QName("http://isa.us.es/sedl/core", "ExtensionPoint");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.us.isa.sedl.core
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SEDLEntity }
     * 
     */
    public SEDLEntity createSEDLEntity() {
        return new SEDLEntity();
    }

    /**
     * Create an instance of {@link SEDLBase }
     * 
     */
    public SEDLBase createSEDLBase() {
        return new SEDLBase();
    }

    /**
     * Create an instance of {@link BasicExperiment }
     * 
     */
    public BasicExperiment createBasicExperiment() {
        return new BasicExperiment();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SEDLEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core", name = "SEDLEntity")
    public JAXBElement<SEDLEntity> createSEDLEntity(SEDLEntity value) {
        return new JAXBElement<SEDLEntity>(_SEDLEntity_QNAME, SEDLEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SEDLBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core", name = "SEDLBase")
    public JAXBElement<SEDLBase> createSEDLBase(SEDLBase value) {
        return new JAXBElement<SEDLBase>(_SEDLBase_QNAME, SEDLBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicExperiment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core", name = "BasicExperiment")
    public JAXBElement<BasicExperiment> createBasicExperiment(BasicExperiment value) {
        return new JAXBElement<BasicExperiment>(_BasicExperiment_QNAME, BasicExperiment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Experiment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core", name = "Experiment")
    public JAXBElement<Experiment> createExperiment(Experiment value) {
        return new JAXBElement<Experiment>(_Experiment_QNAME, Experiment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core", name = "ExtensionPoint")
    public JAXBElement<ExtensionPoint> createExtensionPoint(ExtensionPoint value) {
        return new JAXBElement<ExtensionPoint>(_ExtensionPoint_QNAME, ExtensionPoint.class, null, value);
    }

}
