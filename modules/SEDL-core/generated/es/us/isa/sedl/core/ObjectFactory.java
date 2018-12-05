//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.05 a las 03:15:37 PM CET 
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

    private final static QName _SedlEntity_QNAME = new QName("http://isa.us.es/sedl/core", "SedlEntity");
    private final static QName _SedlBase_QNAME = new QName("http://isa.us.es/sedl/core", "SedlBase");
    private final static QName _BasicExperiment_QNAME = new QName("http://isa.us.es/sedl/core", "BasicExperiment");
    private final static QName _Experiment_QNAME = new QName("http://isa.us.es/sedl/core", "Experiment");
    private final static QName _Goal_QNAME = new QName("http://isa.us.es/sedl/core", "Goal");
    private final static QName _Abstract_QNAME = new QName("http://isa.us.es/sedl/core", "Abstract");
    private final static QName _ExtensionPoint_QNAME = new QName("http://isa.us.es/sedl/core", "ExtensionPoint");
    private final static QName _SimpleGoal_QNAME = new QName("http://isa.us.es/sedl/core", "SimpleGoal");
    private final static QName _GqmGoal_QNAME = new QName("http://isa.us.es/sedl/core", "GqmGoal");
    private final static QName _SimpleAbstract_QNAME = new QName("http://isa.us.es/sedl/core", "SimpleAbstract");
    private final static QName _StructuredAbstract_QNAME = new QName("http://isa.us.es/sedl/core", "StructuredAbstract");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.us.isa.sedl.core
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SedlEntity }
     * 
     */
    public SedlEntity createSedlEntity() {
        return new SedlEntity();
    }

    /**
     * Create an instance of {@link SedlBase }
     * 
     */
    public SedlBase createSedlBase() {
        return new SedlBase();
    }

    /**
     * Create an instance of {@link BasicExperiment }
     * 
     */
    public BasicExperiment createBasicExperiment() {
        return new BasicExperiment();
    }

    /**
     * Create an instance of {@link SimpleGoal }
     * 
     */
    public SimpleGoal createSimpleGoal() {
        return new SimpleGoal();
    }

    /**
     * Create an instance of {@link GqmGoal }
     * 
     */
    public GqmGoal createGqmGoal() {
        return new GqmGoal();
    }

    /**
     * Create an instance of {@link SimpleAbstract }
     * 
     */
    public SimpleAbstract createSimpleAbstract() {
        return new SimpleAbstract();
    }

    /**
     * Create an instance of {@link StructuredAbstract }
     * 
     */
    public StructuredAbstract createStructuredAbstract() {
        return new StructuredAbstract();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SedlEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core", name = "SedlEntity")
    public JAXBElement<SedlEntity> createSedlEntity(SedlEntity value) {
        return new JAXBElement<SedlEntity>(_SedlEntity_QNAME, SedlEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SedlBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core", name = "SedlBase")
    public JAXBElement<SedlBase> createSedlBase(SedlBase value) {
        return new JAXBElement<SedlBase>(_SedlBase_QNAME, SedlBase.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Goal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core", name = "Goal")
    public JAXBElement<Goal> createGoal(Goal value) {
        return new JAXBElement<Goal>(_Goal_QNAME, Goal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Abstract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core", name = "Abstract")
    public JAXBElement<Abstract> createAbstract(Abstract value) {
        return new JAXBElement<Abstract>(_Abstract_QNAME, Abstract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core", name = "ExtensionPoint")
    public JAXBElement<ExtensionPoint> createExtensionPoint(ExtensionPoint value) {
        return new JAXBElement<ExtensionPoint>(_ExtensionPoint_QNAME, ExtensionPoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core", name = "SimpleGoal")
    public JAXBElement<SimpleGoal> createSimpleGoal(SimpleGoal value) {
        return new JAXBElement<SimpleGoal>(_SimpleGoal_QNAME, SimpleGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GqmGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core", name = "GqmGoal")
    public JAXBElement<GqmGoal> createGqmGoal(GqmGoal value) {
        return new JAXBElement<GqmGoal>(_GqmGoal_QNAME, GqmGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleAbstract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core", name = "SimpleAbstract")
    public JAXBElement<SimpleAbstract> createSimpleAbstract(SimpleAbstract value) {
        return new JAXBElement<SimpleAbstract>(_SimpleAbstract_QNAME, SimpleAbstract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredAbstract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core", name = "StructuredAbstract")
    public JAXBElement<StructuredAbstract> createStructuredAbstract(StructuredAbstract value) {
        return new JAXBElement<StructuredAbstract>(_StructuredAbstract_QNAME, StructuredAbstract.class, null, value);
    }

}
