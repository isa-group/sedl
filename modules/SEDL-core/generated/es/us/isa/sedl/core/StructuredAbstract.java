//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:49:52 PM CET 
//


package es.us.isa.sedl.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Clase Java para StructuredAbstract complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="StructuredAbstract"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="background" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="aim" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="method" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="results" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="conclusions" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredAbstract")
public class StructuredAbstract
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "background", required = true)
    protected String background;
    @XmlAttribute(name = "aim", required = true)
    protected String aim;
    @XmlAttribute(name = "method", required = true)
    protected String method;
    @XmlAttribute(name = "results", required = true)
    protected String results;
    @XmlAttribute(name = "conclusions", required = true)
    protected String conclusions;

    /**
     * Obtiene el valor de la propiedad background.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackground() {
        return background;
    }

    /**
     * Define el valor de la propiedad background.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackground(String value) {
        this.background = value;
    }

    /**
     * Obtiene el valor de la propiedad aim.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAim() {
        return aim;
    }

    /**
     * Define el valor de la propiedad aim.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAim(String value) {
        this.aim = value;
    }

    /**
     * Obtiene el valor de la propiedad method.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Define el valor de la propiedad method.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Obtiene el valor de la propiedad results.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResults() {
        return results;
    }

    /**
     * Define el valor de la propiedad results.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResults(String value) {
        this.results = value;
    }

    /**
     * Obtiene el valor de la propiedad conclusions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConclusions() {
        return conclusions;
    }

    /**
     * Define el valor de la propiedad conclusions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConclusions(String value) {
        this.conclusions = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StructuredAbstract)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final StructuredAbstract that = ((StructuredAbstract) object);
        {
            String lhsBackground;
            lhsBackground = this.getBackground();
            String rhsBackground;
            rhsBackground = that.getBackground();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "background", lhsBackground), LocatorUtils.property(thatLocator, "background", rhsBackground), lhsBackground, rhsBackground)) {
                return false;
            }
        }
        {
            String lhsAim;
            lhsAim = this.getAim();
            String rhsAim;
            rhsAim = that.getAim();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aim", lhsAim), LocatorUtils.property(thatLocator, "aim", rhsAim), lhsAim, rhsAim)) {
                return false;
            }
        }
        {
            String lhsMethod;
            lhsMethod = this.getMethod();
            String rhsMethod;
            rhsMethod = that.getMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "method", lhsMethod), LocatorUtils.property(thatLocator, "method", rhsMethod), lhsMethod, rhsMethod)) {
                return false;
            }
        }
        {
            String lhsResults;
            lhsResults = this.getResults();
            String rhsResults;
            rhsResults = that.getResults();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "results", lhsResults), LocatorUtils.property(thatLocator, "results", rhsResults), lhsResults, rhsResults)) {
                return false;
            }
        }
        {
            String lhsConclusions;
            lhsConclusions = this.getConclusions();
            String rhsConclusions;
            rhsConclusions = that.getConclusions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "conclusions", lhsConclusions), LocatorUtils.property(thatLocator, "conclusions", rhsConclusions), lhsConclusions, rhsConclusions)) {
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
            String theBackground;
            theBackground = this.getBackground();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "background", theBackground), currentHashCode, theBackground);
        }
        {
            String theAim;
            theAim = this.getAim();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aim", theAim), currentHashCode, theAim);
        }
        {
            String theMethod;
            theMethod = this.getMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "method", theMethod), currentHashCode, theMethod);
        }
        {
            String theResults;
            theResults = this.getResults();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "results", theResults), currentHashCode, theResults);
        }
        {
            String theConclusions;
            theConclusions = this.getConclusions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "conclusions", theConclusions), currentHashCode, theConclusions);
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
        if (draftCopy instanceof StructuredAbstract) {
            final StructuredAbstract copy = ((StructuredAbstract) draftCopy);
            if (this.background!= null) {
                String sourceBackground;
                sourceBackground = this.getBackground();
                String copyBackground = ((String) strategy.copy(LocatorUtils.property(locator, "background", sourceBackground), sourceBackground));
                copy.setBackground(copyBackground);
            } else {
                copy.background = null;
            }
            if (this.aim!= null) {
                String sourceAim;
                sourceAim = this.getAim();
                String copyAim = ((String) strategy.copy(LocatorUtils.property(locator, "aim", sourceAim), sourceAim));
                copy.setAim(copyAim);
            } else {
                copy.aim = null;
            }
            if (this.method!= null) {
                String sourceMethod;
                sourceMethod = this.getMethod();
                String copyMethod = ((String) strategy.copy(LocatorUtils.property(locator, "method", sourceMethod), sourceMethod));
                copy.setMethod(copyMethod);
            } else {
                copy.method = null;
            }
            if (this.results!= null) {
                String sourceResults;
                sourceResults = this.getResults();
                String copyResults = ((String) strategy.copy(LocatorUtils.property(locator, "results", sourceResults), sourceResults));
                copy.setResults(copyResults);
            } else {
                copy.results = null;
            }
            if (this.conclusions!= null) {
                String sourceConclusions;
                sourceConclusions = this.getConclusions();
                String copyConclusions = ((String) strategy.copy(LocatorUtils.property(locator, "conclusions", sourceConclusions), sourceConclusions));
                copy.setConclusions(copyConclusions);
            } else {
                copy.conclusions = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new StructuredAbstract();
    }

}
