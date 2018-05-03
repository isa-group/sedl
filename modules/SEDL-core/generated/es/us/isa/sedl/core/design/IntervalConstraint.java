//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.03 a las 09:36:25 AM CEST 
//


package es.us.isa.sedl.core.design;

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
 * <p>Clase Java para IntervalConstraint complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IntervalConstraint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/design}Constraint"&gt;
 *       &lt;attribute name="min" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="max" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntervalConstraint")
public class IntervalConstraint
    extends AbstractIntervalConstraint
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "min", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String min;
    @XmlAttribute(name = "max", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String max;

    /**
     * Obtiene el valor de la propiedad min.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMin() {
        return min;
    }

    /**
     * Define el valor de la propiedad min.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMin(String value) {
        this.min = value;
    }

    /**
     * Obtiene el valor de la propiedad max.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMax() {
        return max;
    }

    /**
     * Define el valor de la propiedad max.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMax(String value) {
        this.max = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof IntervalConstraint)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final IntervalConstraint that = ((IntervalConstraint) object);
        {
            String lhsMin;
            lhsMin = this.getMin();
            String rhsMin;
            rhsMin = that.getMin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "min", lhsMin), LocatorUtils.property(thatLocator, "min", rhsMin), lhsMin, rhsMin)) {
                return false;
            }
        }
        {
            String lhsMax;
            lhsMax = this.getMax();
            String rhsMax;
            rhsMax = that.getMax();
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
            String theMin;
            theMin = this.getMin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "min", theMin), currentHashCode, theMin);
        }
        {
            String theMax;
            theMax = this.getMax();
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
        if (draftCopy instanceof IntervalConstraint) {
            final IntervalConstraint copy = ((IntervalConstraint) draftCopy);
            if (this.min!= null) {
                String sourceMin;
                sourceMin = this.getMin();
                String copyMin = ((String) strategy.copy(LocatorUtils.property(locator, "min", sourceMin), sourceMin));
                copy.setMin(copyMin);
            } else {
                copy.min = null;
            }
            if (this.max!= null) {
                String sourceMax;
                sourceMax = this.getMax();
                String copyMax = ((String) strategy.copy(LocatorUtils.property(locator, "max", sourceMax), sourceMax));
                copy.setMax(copyMax);
            } else {
                copy.max = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new IntervalConstraint();
    }

}
