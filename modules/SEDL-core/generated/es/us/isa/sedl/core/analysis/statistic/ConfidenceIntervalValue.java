//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.10 a las 12:06:43 AM CEST 
//


package es.us.isa.sedl.core.analysis.statistic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Clase Java para ConfidenceIntervalValue complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConfidenceIntervalValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/analysis/statistic}StatisticalAnalysisResult"&gt;
 *       &lt;attribute name="confidenceInterval" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="min" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="max" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfidenceIntervalValue")
public class ConfidenceIntervalValue
    extends StatisticalAnalysisResult
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "confidenceInterval", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String confidenceInterval;
    @XmlAttribute(name = "min", required = true)
    protected double min;
    @XmlAttribute(name = "max", required = true)
    protected double max;

    /**
     * Obtiene el valor de la propiedad confidenceInterval.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidenceInterval() {
        return confidenceInterval;
    }

    /**
     * Define el valor de la propiedad confidenceInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidenceInterval(String value) {
        this.confidenceInterval = value;
    }

    /**
     * Obtiene el valor de la propiedad min.
     * 
     */
    public double getMin() {
        return min;
    }

    /**
     * Define el valor de la propiedad min.
     * 
     */
    public void setMin(double value) {
        this.min = value;
    }

    /**
     * Obtiene el valor de la propiedad max.
     * 
     */
    public double getMax() {
        return max;
    }

    /**
     * Define el valor de la propiedad max.
     * 
     */
    public void setMax(double value) {
        this.max = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ConfidenceIntervalValue)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ConfidenceIntervalValue that = ((ConfidenceIntervalValue) object);
        {
            String lhsConfidenceInterval;
            lhsConfidenceInterval = this.getConfidenceInterval();
            String rhsConfidenceInterval;
            rhsConfidenceInterval = that.getConfidenceInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "confidenceInterval", lhsConfidenceInterval), LocatorUtils.property(thatLocator, "confidenceInterval", rhsConfidenceInterval), lhsConfidenceInterval, rhsConfidenceInterval)) {
                return false;
            }
        }
        {
            double lhsMin;
            lhsMin = (true?this.getMin(): 0.0D);
            double rhsMin;
            rhsMin = (true?that.getMin(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "min", lhsMin), LocatorUtils.property(thatLocator, "min", rhsMin), lhsMin, rhsMin)) {
                return false;
            }
        }
        {
            double lhsMax;
            lhsMax = (true?this.getMax(): 0.0D);
            double rhsMax;
            rhsMax = (true?that.getMax(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "max", lhsMax), LocatorUtils.property(thatLocator, "max", rhsMax), lhsMax, rhsMax)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theConfidenceInterval;
            theConfidenceInterval = this.getConfidenceInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "confidenceInterval", theConfidenceInterval), currentHashCode, theConfidenceInterval);
        }
        {
            double theMin;
            theMin = (true?this.getMin(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "min", theMin), currentHashCode, theMin);
        }
        {
            double theMax;
            theMax = (true?this.getMax(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "max", theMax), currentHashCode, theMax);
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof ConfidenceIntervalValue) {
            final ConfidenceIntervalValue copy = ((ConfidenceIntervalValue) draftCopy);
            if (this.confidenceInterval!= null) {
                String sourceConfidenceInterval;
                sourceConfidenceInterval = this.getConfidenceInterval();
                String copyConfidenceInterval = ((String) strategy.copy(LocatorUtils.property(locator, "confidenceInterval", sourceConfidenceInterval), sourceConfidenceInterval));
                copy.setConfidenceInterval(copyConfidenceInterval);
            } else {
                copy.confidenceInterval = null;
            }
            double sourceMin;
            sourceMin = (true?this.getMin(): 0.0D);
            double copyMin = strategy.copy(LocatorUtils.property(locator, "min", sourceMin), sourceMin);
            copy.setMin(copyMin);
            double sourceMax;
            sourceMax = (true?this.getMax(): 0.0D);
            double copyMax = strategy.copy(LocatorUtils.property(locator, "max", sourceMax), sourceMax);
            copy.setMax(copyMax);
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ConfidenceIntervalValue();
    }

}
