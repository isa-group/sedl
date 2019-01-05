//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:44:54 PM CET 
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
 * <p>Clase Java para EffectSizeEstimate complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EffectSizeEstimate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/analysis/statistic}StatisticalAnalysisResult"&gt;
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="effectsizeestimator" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EffectSizeEstimate")
public class EffectSizeEstimate
    extends StatisticalAnalysisResult
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "value", required = true)
    protected double value;
    @XmlAttribute(name = "effectsizeestimator", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String effectsizeestimator;

    /**
     * Obtiene el valor de la propiedad value.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad effectsizeestimator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectsizeestimator() {
        return effectsizeestimator;
    }

    /**
     * Define el valor de la propiedad effectsizeestimator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectsizeestimator(String value) {
        this.effectsizeestimator = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EffectSizeEstimate)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final EffectSizeEstimate that = ((EffectSizeEstimate) object);
        {
            double lhsValue;
            lhsValue = (true?this.getValue(): 0.0D);
            double rhsValue;
            rhsValue = (true?that.getValue(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            String lhsEffectsizeestimator;
            lhsEffectsizeestimator = this.getEffectsizeestimator();
            String rhsEffectsizeestimator;
            rhsEffectsizeestimator = that.getEffectsizeestimator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "effectsizeestimator", lhsEffectsizeestimator), LocatorUtils.property(thatLocator, "effectsizeestimator", rhsEffectsizeestimator), lhsEffectsizeestimator, rhsEffectsizeestimator)) {
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
            double theValue;
            theValue = (true?this.getValue(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        {
            String theEffectsizeestimator;
            theEffectsizeestimator = this.getEffectsizeestimator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "effectsizeestimator", theEffectsizeestimator), currentHashCode, theEffectsizeestimator);
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
        if (draftCopy instanceof EffectSizeEstimate) {
            final EffectSizeEstimate copy = ((EffectSizeEstimate) draftCopy);
            double sourceValue;
            sourceValue = (true?this.getValue(): 0.0D);
            double copyValue = strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue);
            copy.setValue(copyValue);
            if (this.effectsizeestimator!= null) {
                String sourceEffectsizeestimator;
                sourceEffectsizeestimator = this.getEffectsizeestimator();
                String copyEffectsizeestimator = ((String) strategy.copy(LocatorUtils.property(locator, "effectsizeestimator", sourceEffectsizeestimator), sourceEffectsizeestimator));
                copy.setEffectsizeestimator(copyEffectsizeestimator);
            } else {
                copy.effectsizeestimator = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new EffectSizeEstimate();
    }

}
