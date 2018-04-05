//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.05 a las 07:27:38 PM CEST 
//


package es.us.isa.sedl.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
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
 * Abstract class to be extended by any domain-specific experiment. It is also extended 
 * by the 'canonical' Basic Experiment, that describes all the details of the experiment 
 * using SEDL elements.
 * 
 * <p>Clase Java para Experiment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Experiment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core}SEDLEntity"&gt;
 *       &lt;attribute name="metaid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="classifications"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Experiment")
@XmlSeeAlso({
    BasicExperiment.class
})
@XmlTransient
public abstract class Experiment
    extends SEDLEntity
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "metaid", required = true)
    protected String metaid;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "classifications")
    protected List<String> classifications;

    /**
     * Obtiene el valor de la propiedad metaid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaid() {
        return metaid;
    }

    /**
     * Define el valor de la propiedad metaid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaid(String value) {
        this.metaid = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the classifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClassifications() {
        if (classifications == null) {
            classifications = new ArrayList<String>();
        }
        return this.classifications;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Experiment)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Experiment that = ((Experiment) object);
        {
            String lhsMetaid;
            lhsMetaid = this.getMetaid();
            String rhsMetaid;
            rhsMetaid = that.getMetaid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "metaid", lhsMetaid), LocatorUtils.property(thatLocator, "metaid", rhsMetaid), lhsMetaid, rhsMetaid)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsVersion;
            lhsVersion = this.getVersion();
            String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion)) {
                return false;
            }
        }
        {
            List<String> lhsClassifications;
            lhsClassifications = (((this.classifications!= null)&&(!this.classifications.isEmpty()))?this.getClassifications():null);
            List<String> rhsClassifications;
            rhsClassifications = (((that.classifications!= null)&&(!that.classifications.isEmpty()))?that.getClassifications():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classifications", lhsClassifications), LocatorUtils.property(thatLocator, "classifications", rhsClassifications), lhsClassifications, rhsClassifications)) {
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
            String theMetaid;
            theMetaid = this.getMetaid();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "metaid", theMetaid), currentHashCode, theMetaid);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion);
        }
        {
            List<String> theClassifications;
            theClassifications = (((this.classifications!= null)&&(!this.classifications.isEmpty()))?this.getClassifications():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classifications", theClassifications), currentHashCode, theClassifications);
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof Experiment) {
            final Experiment copy = ((Experiment) target);
            if (this.metaid!= null) {
                String sourceMetaid;
                sourceMetaid = this.getMetaid();
                String copyMetaid = ((String) strategy.copy(LocatorUtils.property(locator, "metaid", sourceMetaid), sourceMetaid));
                copy.setMetaid(copyMetaid);
            } else {
                copy.metaid = null;
            }
            if (this.name!= null) {
                String sourceName;
                sourceName = this.getName();
                String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
            if (this.version!= null) {
                String sourceVersion;
                sourceVersion = this.getVersion();
                String copyVersion = ((String) strategy.copy(LocatorUtils.property(locator, "version", sourceVersion), sourceVersion));
                copy.setVersion(copyVersion);
            } else {
                copy.version = null;
            }
            if ((this.classifications!= null)&&(!this.classifications.isEmpty())) {
                List<String> sourceClassifications;
                sourceClassifications = (((this.classifications!= null)&&(!this.classifications.isEmpty()))?this.getClassifications():null);
                @SuppressWarnings("unchecked")
                List<String> copyClassifications = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "classifications", sourceClassifications), sourceClassifications));
                copy.classifications = null;
                if (copyClassifications!= null) {
                    List<String> uniqueClassificationsl = copy.getClassifications();
                    uniqueClassificationsl.addAll(copyClassifications);
                }
            } else {
                copy.classifications = null;
            }
        }
        return target;
    }

}
