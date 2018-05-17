//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.17 a las 12:43:04 AM CEST 
//


package es.us.isa.sedl.core.analysis.statistic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import es.us.isa.sedl.core.analysis.datasetspecification.DatasetSpecification;
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
 * <p>Clase Java para Statistic complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Statistic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datasetSpecification" type="{http://isa.us.es/sedl/core/analysis/datasetspecification}DatasetSpecification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statistic", propOrder = {
    "datasetSpecification"
})
@XmlSeeAlso({
    Ranking.class,
    DescriptiveStatistic.class,
    InferentialStatistic.class
})
public class Statistic
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected DatasetSpecification datasetSpecification;

    /**
     * Obtiene el valor de la propiedad datasetSpecification.
     * 
     * @return
     *     possible object is
     *     {@link DatasetSpecification }
     *     
     */
    public DatasetSpecification getDatasetSpecification() {
        return datasetSpecification;
    }

    /**
     * Define el valor de la propiedad datasetSpecification.
     * 
     * @param value
     *     allowed object is
     *     {@link DatasetSpecification }
     *     
     */
    public void setDatasetSpecification(DatasetSpecification value) {
        this.datasetSpecification = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Statistic)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Statistic that = ((Statistic) object);
        {
            DatasetSpecification lhsDatasetSpecification;
            lhsDatasetSpecification = this.getDatasetSpecification();
            DatasetSpecification rhsDatasetSpecification;
            rhsDatasetSpecification = that.getDatasetSpecification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datasetSpecification", lhsDatasetSpecification), LocatorUtils.property(thatLocator, "datasetSpecification", rhsDatasetSpecification), lhsDatasetSpecification, rhsDatasetSpecification)) {
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
            DatasetSpecification theDatasetSpecification;
            theDatasetSpecification = this.getDatasetSpecification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datasetSpecification", theDatasetSpecification), currentHashCode, theDatasetSpecification);
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
        if (draftCopy instanceof Statistic) {
            final Statistic copy = ((Statistic) draftCopy);
            if (this.datasetSpecification!= null) {
                DatasetSpecification sourceDatasetSpecification;
                sourceDatasetSpecification = this.getDatasetSpecification();
                DatasetSpecification copyDatasetSpecification = ((DatasetSpecification) strategy.copy(LocatorUtils.property(locator, "datasetSpecification", sourceDatasetSpecification), sourceDatasetSpecification));
                copy.setDatasetSpecification(copyDatasetSpecification);
            } else {
                copy.datasetSpecification = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Statistic();
    }

}
