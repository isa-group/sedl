//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.06 a las 05:46:41 PM CEST 
//


package es.us.isa.sedl.core.analysis.statistic;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Clase Java para PValue complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/analysis/statistic}StatisticalAnalysisResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="freedomDegrees" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="nHST" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="significanceThreshold" type="{http://www.w3.org/2001/XMLSchema}double" default="0.05" /&gt;
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PValue", propOrder = {
    "freedomDegrees"
})
public class PValue
    extends StatisticalAnalysisResult
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true, nillable = true)
    protected List<BigInteger> freedomDegrees;
    @XmlAttribute(name = "nHST", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String nhst;
    @XmlAttribute(name = "value", required = true)
    protected double value;
    @XmlAttribute(name = "significanceThreshold")
    protected Double significanceThreshold;
    @XmlAttribute(name = "description")
    protected String description;

    /**
     * Gets the value of the freedomDegrees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freedomDegrees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreedomDegrees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getFreedomDegrees() {
        if (freedomDegrees == null) {
            freedomDegrees = new ArrayList<BigInteger>();
        }
        return this.freedomDegrees;
    }

    /**
     * Obtiene el valor de la propiedad nhst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNHST() {
        return nhst;
    }

    /**
     * Define el valor de la propiedad nhst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNHST(String value) {
        this.nhst = value;
    }

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
     * Obtiene el valor de la propiedad significanceThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getSignificanceThreshold() {
        if (significanceThreshold == null) {
            return  0.05D;
        } else {
            return significanceThreshold;
        }
    }

    /**
     * Define el valor de la propiedad significanceThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSignificanceThreshold(Double value) {
        this.significanceThreshold = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PValue)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final PValue that = ((PValue) object);
        {
            List<BigInteger> lhsFreedomDegrees;
            lhsFreedomDegrees = (((this.freedomDegrees!= null)&&(!this.freedomDegrees.isEmpty()))?this.getFreedomDegrees():null);
            List<BigInteger> rhsFreedomDegrees;
            rhsFreedomDegrees = (((that.freedomDegrees!= null)&&(!that.freedomDegrees.isEmpty()))?that.getFreedomDegrees():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freedomDegrees", lhsFreedomDegrees), LocatorUtils.property(thatLocator, "freedomDegrees", rhsFreedomDegrees), lhsFreedomDegrees, rhsFreedomDegrees)) {
                return false;
            }
        }
        {
            String lhsNHST;
            lhsNHST = this.getNHST();
            String rhsNHST;
            rhsNHST = that.getNHST();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nhst", lhsNHST), LocatorUtils.property(thatLocator, "nhst", rhsNHST), lhsNHST, rhsNHST)) {
                return false;
            }
        }
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
            double lhsSignificanceThreshold;
            lhsSignificanceThreshold = ((this.significanceThreshold!= null)?this.getSignificanceThreshold(): 0.0D);
            double rhsSignificanceThreshold;
            rhsSignificanceThreshold = ((that.significanceThreshold!= null)?that.getSignificanceThreshold(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "significanceThreshold", lhsSignificanceThreshold), LocatorUtils.property(thatLocator, "significanceThreshold", rhsSignificanceThreshold), lhsSignificanceThreshold, rhsSignificanceThreshold)) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
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
            List<BigInteger> theFreedomDegrees;
            theFreedomDegrees = (((this.freedomDegrees!= null)&&(!this.freedomDegrees.isEmpty()))?this.getFreedomDegrees():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freedomDegrees", theFreedomDegrees), currentHashCode, theFreedomDegrees);
        }
        {
            String theNHST;
            theNHST = this.getNHST();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nhst", theNHST), currentHashCode, theNHST);
        }
        {
            double theValue;
            theValue = (true?this.getValue(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        {
            double theSignificanceThreshold;
            theSignificanceThreshold = ((this.significanceThreshold!= null)?this.getSignificanceThreshold(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "significanceThreshold", theSignificanceThreshold), currentHashCode, theSignificanceThreshold);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
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
        if (draftCopy instanceof PValue) {
            final PValue copy = ((PValue) draftCopy);
            if ((this.freedomDegrees!= null)&&(!this.freedomDegrees.isEmpty())) {
                List<BigInteger> sourceFreedomDegrees;
                sourceFreedomDegrees = (((this.freedomDegrees!= null)&&(!this.freedomDegrees.isEmpty()))?this.getFreedomDegrees():null);
                @SuppressWarnings("unchecked")
                List<BigInteger> copyFreedomDegrees = ((List<BigInteger> ) strategy.copy(LocatorUtils.property(locator, "freedomDegrees", sourceFreedomDegrees), sourceFreedomDegrees));
                copy.freedomDegrees = null;
                if (copyFreedomDegrees!= null) {
                    List<BigInteger> uniqueFreedomDegreesl = copy.getFreedomDegrees();
                    uniqueFreedomDegreesl.addAll(copyFreedomDegrees);
                }
            } else {
                copy.freedomDegrees = null;
            }
            if (this.nhst!= null) {
                String sourceNHST;
                sourceNHST = this.getNHST();
                String copyNHST = ((String) strategy.copy(LocatorUtils.property(locator, "nhst", sourceNHST), sourceNHST));
                copy.setNHST(copyNHST);
            } else {
                copy.nhst = null;
            }
            double sourceValue;
            sourceValue = (true?this.getValue(): 0.0D);
            double copyValue = strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue);
            copy.setValue(copyValue);
            if (this.significanceThreshold!= null) {
                double sourceSignificanceThreshold;
                sourceSignificanceThreshold = ((this.significanceThreshold!= null)?this.getSignificanceThreshold(): 0.0D);
                double copySignificanceThreshold = strategy.copy(LocatorUtils.property(locator, "significanceThreshold", sourceSignificanceThreshold), sourceSignificanceThreshold);
                copy.setSignificanceThreshold(copySignificanceThreshold);
            } else {
                copy.significanceThreshold = null;
            }
            if (this.description!= null) {
                String sourceDescription;
                sourceDescription = this.getDescription();
                String copyDescription = ((String) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription));
                copy.setDescription(copyDescription);
            } else {
                copy.description = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new PValue();
    }

}
