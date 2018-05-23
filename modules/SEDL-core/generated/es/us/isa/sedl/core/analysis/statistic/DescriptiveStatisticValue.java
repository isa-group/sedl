//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.23 a las 02:44:29 PM CEST 
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
 * <p>Clase Java para DescriptiveStatisticValue complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DescriptiveStatisticValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/analysis/statistic}StatisticalAnalysisResult"&gt;
 *       &lt;attribute name="descriptiveStatistic" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescriptiveStatisticValue")
public class DescriptiveStatisticValue
    extends StatisticalAnalysisResult
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "descriptiveStatistic", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String descriptiveStatistic;
    @XmlAttribute(name = "value", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String value;

    /**
     * Obtiene el valor de la propiedad descriptiveStatistic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptiveStatistic() {
        return descriptiveStatistic;
    }

    /**
     * Define el valor de la propiedad descriptiveStatistic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptiveStatistic(String value) {
        this.descriptiveStatistic = value;
    }

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescriptiveStatisticValue)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DescriptiveStatisticValue that = ((DescriptiveStatisticValue) object);
        {
            String lhsDescriptiveStatistic;
            lhsDescriptiveStatistic = this.getDescriptiveStatistic();
            String rhsDescriptiveStatistic;
            rhsDescriptiveStatistic = that.getDescriptiveStatistic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "descriptiveStatistic", lhsDescriptiveStatistic), LocatorUtils.property(thatLocator, "descriptiveStatistic", rhsDescriptiveStatistic), lhsDescriptiveStatistic, rhsDescriptiveStatistic)) {
                return false;
            }
        }
        {
            String lhsValue;
            lhsValue = this.getValue();
            String rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
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
            String theDescriptiveStatistic;
            theDescriptiveStatistic = this.getDescriptiveStatistic();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "descriptiveStatistic", theDescriptiveStatistic), currentHashCode, theDescriptiveStatistic);
        }
        {
            String theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
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
        if (draftCopy instanceof DescriptiveStatisticValue) {
            final DescriptiveStatisticValue copy = ((DescriptiveStatisticValue) draftCopy);
            if (this.descriptiveStatistic!= null) {
                String sourceDescriptiveStatistic;
                sourceDescriptiveStatistic = this.getDescriptiveStatistic();
                String copyDescriptiveStatistic = ((String) strategy.copy(LocatorUtils.property(locator, "descriptiveStatistic", sourceDescriptiveStatistic), sourceDescriptiveStatistic));
                copy.setDescriptiveStatistic(copyDescriptiveStatistic);
            } else {
                copy.descriptiveStatistic = null;
            }
            if (this.value!= null) {
                String sourceValue;
                sourceValue = this.getValue();
                String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DescriptiveStatisticValue();
    }

}
