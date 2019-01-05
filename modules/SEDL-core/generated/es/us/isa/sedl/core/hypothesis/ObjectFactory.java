//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:44:54 PM CET 
//


package es.us.isa.sedl.core.hypothesis;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.us.isa.sedl.core.hypothesis package. 
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

    private final static QName _Hypothesis_QNAME = new QName("http://isa.us.es/sedl/core/hypothesis", "Hypothesis");
    private final static QName _DescriptiveHypothesis_QNAME = new QName("http://isa.us.es/sedl/core/hypothesis", "DescriptiveHypothesis");
    private final static QName _RelationalHypothesis_QNAME = new QName("http://isa.us.es/sedl/core/hypothesis", "RelationalHypothesis");
    private final static QName _AssociationalHypothesis_QNAME = new QName("http://isa.us.es/sedl/core/hypothesis", "AssociationalHypothesis");
    private final static QName _RelationSpecification_QNAME = new QName("http://isa.us.es/sedl/core/hypothesis", "RelationSpecification");
    private final static QName _DifferentialHypothesis_QNAME = new QName("http://isa.us.es/sedl/core/hypothesis", "DifferentialHypothesis");
    private final static QName _LinearRelation_QNAME = new QName("http://isa.us.es/sedl/core/hypothesis", "LinearRelation");
    private final static QName _MathematicalRelation_QNAME = new QName("http://isa.us.es/sedl/core/hypothesis", "MathematicalRelation");
    private final static QName _MonotonicRelation_QNAME = new QName("http://isa.us.es/sedl/core/hypothesis", "MonotonicRelation");
    private final static QName _LogisticRelation_QNAME = new QName("http://isa.us.es/sedl/core/hypothesis", "LogisticRelation");
    private final static QName _Assertion_QNAME = new QName("http://isa.us.es/sedl/core/hypothesis", "Assertion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.us.isa.sedl.core.hypothesis
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DescriptiveHypothesis }
     * 
     */
    public DescriptiveHypothesis createDescriptiveHypothesis() {
        return new DescriptiveHypothesis();
    }

    /**
     * Create an instance of {@link AssociationalHypothesis }
     * 
     */
    public AssociationalHypothesis createAssociationalHypothesis() {
        return new AssociationalHypothesis();
    }

    /**
     * Create an instance of {@link RelationSpecification }
     * 
     */
    public RelationSpecification createRelationSpecification() {
        return new RelationSpecification();
    }

    /**
     * Create an instance of {@link DifferentialHypothesis }
     * 
     */
    public DifferentialHypothesis createDifferentialHypothesis() {
        return new DifferentialHypothesis();
    }

    /**
     * Create an instance of {@link LinearRelation }
     * 
     */
    public LinearRelation createLinearRelation() {
        return new LinearRelation();
    }

    /**
     * Create an instance of {@link MathematicalRelation }
     * 
     */
    public MathematicalRelation createMathematicalRelation() {
        return new MathematicalRelation();
    }

    /**
     * Create an instance of {@link MonotonicRelation }
     * 
     */
    public MonotonicRelation createMonotonicRelation() {
        return new MonotonicRelation();
    }

    /**
     * Create an instance of {@link LogisticRelation }
     * 
     */
    public LogisticRelation createLogisticRelation() {
        return new LogisticRelation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hypothesis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/hypothesis", name = "Hypothesis")
    public JAXBElement<Hypothesis> createHypothesis(Hypothesis value) {
        return new JAXBElement<Hypothesis>(_Hypothesis_QNAME, Hypothesis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescriptiveHypothesis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/hypothesis", name = "DescriptiveHypothesis")
    public JAXBElement<DescriptiveHypothesis> createDescriptiveHypothesis(DescriptiveHypothesis value) {
        return new JAXBElement<DescriptiveHypothesis>(_DescriptiveHypothesis_QNAME, DescriptiveHypothesis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelationalHypothesis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/hypothesis", name = "RelationalHypothesis")
    public JAXBElement<RelationalHypothesis> createRelationalHypothesis(RelationalHypothesis value) {
        return new JAXBElement<RelationalHypothesis>(_RelationalHypothesis_QNAME, RelationalHypothesis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociationalHypothesis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/hypothesis", name = "AssociationalHypothesis")
    public JAXBElement<AssociationalHypothesis> createAssociationalHypothesis(AssociationalHypothesis value) {
        return new JAXBElement<AssociationalHypothesis>(_AssociationalHypothesis_QNAME, AssociationalHypothesis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelationSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/hypothesis", name = "RelationSpecification")
    public JAXBElement<RelationSpecification> createRelationSpecification(RelationSpecification value) {
        return new JAXBElement<RelationSpecification>(_RelationSpecification_QNAME, RelationSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DifferentialHypothesis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/hypothesis", name = "DifferentialHypothesis")
    public JAXBElement<DifferentialHypothesis> createDifferentialHypothesis(DifferentialHypothesis value) {
        return new JAXBElement<DifferentialHypothesis>(_DifferentialHypothesis_QNAME, DifferentialHypothesis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinearRelation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/hypothesis", name = "LinearRelation")
    public JAXBElement<LinearRelation> createLinearRelation(LinearRelation value) {
        return new JAXBElement<LinearRelation>(_LinearRelation_QNAME, LinearRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MathematicalRelation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/hypothesis", name = "MathematicalRelation")
    public JAXBElement<MathematicalRelation> createMathematicalRelation(MathematicalRelation value) {
        return new JAXBElement<MathematicalRelation>(_MathematicalRelation_QNAME, MathematicalRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonotonicRelation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/hypothesis", name = "MonotonicRelation")
    public JAXBElement<MonotonicRelation> createMonotonicRelation(MonotonicRelation value) {
        return new JAXBElement<MonotonicRelation>(_MonotonicRelation_QNAME, MonotonicRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogisticRelation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/hypothesis", name = "LogisticRelation")
    public JAXBElement<LogisticRelation> createLogisticRelation(LogisticRelation value) {
        return new JAXBElement<LogisticRelation>(_LogisticRelation_QNAME, LogisticRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Assertion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/hypothesis", name = "Assertion")
    public JAXBElement<Assertion> createAssertion(Assertion value) {
        return new JAXBElement<Assertion>(_Assertion_QNAME, Assertion.class, null, value);
    }

}
