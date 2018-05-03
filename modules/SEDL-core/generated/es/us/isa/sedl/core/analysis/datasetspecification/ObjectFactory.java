//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.03 a las 09:36:25 AM CEST 
//


package es.us.isa.sedl.core.analysis.datasetspecification;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.us.isa.sedl.core.analysis.datasetspecification package. 
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

    private final static QName _Filter_QNAME = new QName("http://isa.us.es/sedl/core/analysis/datasetspecification", "Filter");
    private final static QName _Projection_QNAME = new QName("http://isa.us.es/sedl/core/analysis/datasetspecification", "Projection");
    private final static QName _GroupFilter_QNAME = new QName("http://isa.us.es/sedl/core/analysis/datasetspecification", "GroupFilter");
    private final static QName _ValuationFilter_QNAME = new QName("http://isa.us.es/sedl/core/analysis/datasetspecification", "ValuationFilter");
    private final static QName _GroupingProjection_QNAME = new QName("http://isa.us.es/sedl/core/analysis/datasetspecification", "GroupingProjection");
    private final static QName _DatasetSpecification_QNAME = new QName("http://isa.us.es/sedl/core/analysis/datasetspecification", "DatasetSpecification");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.us.isa.sedl.core.analysis.datasetspecification
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Projection }
     * 
     */
    public Projection createProjection() {
        return new Projection();
    }

    /**
     * Create an instance of {@link GroupFilter }
     * 
     */
    public GroupFilter createGroupFilter() {
        return new GroupFilter();
    }

    /**
     * Create an instance of {@link ValuationFilter }
     * 
     */
    public ValuationFilter createValuationFilter() {
        return new ValuationFilter();
    }

    /**
     * Create an instance of {@link GroupingProjection }
     * 
     */
    public GroupingProjection createGroupingProjection() {
        return new GroupingProjection();
    }

    /**
     * Create an instance of {@link DatasetSpecification }
     * 
     */
    public DatasetSpecification createDatasetSpecification() {
        return new DatasetSpecification();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/analysis/datasetspecification", name = "Filter")
    public JAXBElement<Filter> createFilter(Filter value) {
        return new JAXBElement<Filter>(_Filter_QNAME, Filter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Projection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/analysis/datasetspecification", name = "Projection")
    public JAXBElement<Projection> createProjection(Projection value) {
        return new JAXBElement<Projection>(_Projection_QNAME, Projection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/analysis/datasetspecification", name = "GroupFilter")
    public JAXBElement<GroupFilter> createGroupFilter(GroupFilter value) {
        return new JAXBElement<GroupFilter>(_GroupFilter_QNAME, GroupFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValuationFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/analysis/datasetspecification", name = "ValuationFilter")
    public JAXBElement<ValuationFilter> createValuationFilter(ValuationFilter value) {
        return new JAXBElement<ValuationFilter>(_ValuationFilter_QNAME, ValuationFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupingProjection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/analysis/datasetspecification", name = "GroupingProjection")
    public JAXBElement<GroupingProjection> createGroupingProjection(GroupingProjection value) {
        return new JAXBElement<GroupingProjection>(_GroupingProjection_QNAME, GroupingProjection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatasetSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/analysis/datasetspecification", name = "DatasetSpecification")
    public JAXBElement<DatasetSpecification> createDatasetSpecification(DatasetSpecification value) {
        return new JAXBElement<DatasetSpecification>(_DatasetSpecification_QNAME, DatasetSpecification.class, null, value);
    }

}
