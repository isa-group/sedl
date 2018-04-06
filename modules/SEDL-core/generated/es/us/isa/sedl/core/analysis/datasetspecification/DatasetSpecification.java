//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.06 a las 05:46:41 PM CEST 
//


package es.us.isa.sedl.core.analysis.datasetspecification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Clase Java para DatasetSpecification complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatasetSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="projections" type="{http://isa.us.es/sedl/core/analysis/datasetspecification}Projection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="filters" type="{http://isa.us.es/sedl/core/analysis/datasetspecification}Filter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatasetSpecification", propOrder = {
    "projections",
    "filters"
})
public class DatasetSpecification
    extends AbstractDatasetSpecification
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected List<Projection> projections;
    protected List<Filter> filters;

    /**
     * Gets the value of the projections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Projection }
     * 
     * 
     */
    public List<Projection> getProjections() {
        if (projections == null) {
            projections = new ArrayList<Projection>();
        }
        return this.projections;
    }

    /**
     * Gets the value of the filters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Filter }
     * 
     * 
     */
    public List<Filter> getFilters() {
        if (filters == null) {
            filters = new ArrayList<Filter>();
        }
        return this.filters;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DatasetSpecification)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DatasetSpecification that = ((DatasetSpecification) object);
        {
            List<Projection> lhsProjections;
            lhsProjections = (((this.projections!= null)&&(!this.projections.isEmpty()))?this.getProjections():null);
            List<Projection> rhsProjections;
            rhsProjections = (((that.projections!= null)&&(!that.projections.isEmpty()))?that.getProjections():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "projections", lhsProjections), LocatorUtils.property(thatLocator, "projections", rhsProjections), lhsProjections, rhsProjections)) {
                return false;
            }
        }
        {
            List<Filter> lhsFilters;
            lhsFilters = (((this.filters!= null)&&(!this.filters.isEmpty()))?this.getFilters():null);
            List<Filter> rhsFilters;
            rhsFilters = (((that.filters!= null)&&(!that.filters.isEmpty()))?that.getFilters():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "filters", lhsFilters), LocatorUtils.property(thatLocator, "filters", rhsFilters), lhsFilters, rhsFilters)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<Projection> theProjections;
            theProjections = (((this.projections!= null)&&(!this.projections.isEmpty()))?this.getProjections():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "projections", theProjections), currentHashCode, theProjections);
        }
        {
            List<Filter> theFilters;
            theFilters = (((this.filters!= null)&&(!this.filters.isEmpty()))?this.getFilters():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "filters", theFilters), currentHashCode, theFilters);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof DatasetSpecification) {
            final DatasetSpecification copy = ((DatasetSpecification) draftCopy);
            if ((this.projections!= null)&&(!this.projections.isEmpty())) {
                List<Projection> sourceProjections;
                sourceProjections = (((this.projections!= null)&&(!this.projections.isEmpty()))?this.getProjections():null);
                @SuppressWarnings("unchecked")
                List<Projection> copyProjections = ((List<Projection> ) strategy.copy(LocatorUtils.property(locator, "projections", sourceProjections), sourceProjections));
                copy.projections = null;
                if (copyProjections!= null) {
                    List<Projection> uniqueProjectionsl = copy.getProjections();
                    uniqueProjectionsl.addAll(copyProjections);
                }
            } else {
                copy.projections = null;
            }
            if ((this.filters!= null)&&(!this.filters.isEmpty())) {
                List<Filter> sourceFilters;
                sourceFilters = (((this.filters!= null)&&(!this.filters.isEmpty()))?this.getFilters():null);
                @SuppressWarnings("unchecked")
                List<Filter> copyFilters = ((List<Filter> ) strategy.copy(LocatorUtils.property(locator, "filters", sourceFilters), sourceFilters));
                copy.filters = null;
                if (copyFilters!= null) {
                    List<Filter> uniqueFiltersl = copy.getFilters();
                    uniqueFiltersl.addAll(copyFilters);
                }
            } else {
                copy.filters = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DatasetSpecification();
    }

}
