//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.05 a las 03:15:37 PM CET 
//


package es.us.isa.sedl.core.design;

import java.math.BigInteger;
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
 * <p>Clase Java para Precedence complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Precedence"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/design}ProtocolConstraint"&gt;
 *       &lt;attribute name="former" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="later" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="minDelay" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="maxDelay" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Precedence")
public class Precedence
    extends ProtocolConstraint
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "former", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String former;
    @XmlAttribute(name = "later", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String later;
    @XmlAttribute(name = "minDelay", required = true)
    protected BigInteger minDelay;
    @XmlAttribute(name = "maxDelay", required = true)
    protected BigInteger maxDelay;

    /**
     * Obtiene el valor de la propiedad former.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormer() {
        return former;
    }

    /**
     * Define el valor de la propiedad former.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormer(String value) {
        this.former = value;
    }

    /**
     * Obtiene el valor de la propiedad later.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLater() {
        return later;
    }

    /**
     * Define el valor de la propiedad later.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLater(String value) {
        this.later = value;
    }

    /**
     * Obtiene el valor de la propiedad minDelay.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinDelay() {
        return minDelay;
    }

    /**
     * Define el valor de la propiedad minDelay.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinDelay(BigInteger value) {
        this.minDelay = value;
    }

    /**
     * Obtiene el valor de la propiedad maxDelay.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxDelay() {
        return maxDelay;
    }

    /**
     * Define el valor de la propiedad maxDelay.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxDelay(BigInteger value) {
        this.maxDelay = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Precedence)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Precedence that = ((Precedence) object);
        {
            String lhsFormer;
            lhsFormer = this.getFormer();
            String rhsFormer;
            rhsFormer = that.getFormer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "former", lhsFormer), LocatorUtils.property(thatLocator, "former", rhsFormer), lhsFormer, rhsFormer)) {
                return false;
            }
        }
        {
            String lhsLater;
            lhsLater = this.getLater();
            String rhsLater;
            rhsLater = that.getLater();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "later", lhsLater), LocatorUtils.property(thatLocator, "later", rhsLater), lhsLater, rhsLater)) {
                return false;
            }
        }
        {
            BigInteger lhsMinDelay;
            lhsMinDelay = this.getMinDelay();
            BigInteger rhsMinDelay;
            rhsMinDelay = that.getMinDelay();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minDelay", lhsMinDelay), LocatorUtils.property(thatLocator, "minDelay", rhsMinDelay), lhsMinDelay, rhsMinDelay)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxDelay;
            lhsMaxDelay = this.getMaxDelay();
            BigInteger rhsMaxDelay;
            rhsMaxDelay = that.getMaxDelay();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxDelay", lhsMaxDelay), LocatorUtils.property(thatLocator, "maxDelay", rhsMaxDelay), lhsMaxDelay, rhsMaxDelay)) {
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
            String theFormer;
            theFormer = this.getFormer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "former", theFormer), currentHashCode, theFormer);
        }
        {
            String theLater;
            theLater = this.getLater();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "later", theLater), currentHashCode, theLater);
        }
        {
            BigInteger theMinDelay;
            theMinDelay = this.getMinDelay();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minDelay", theMinDelay), currentHashCode, theMinDelay);
        }
        {
            BigInteger theMaxDelay;
            theMaxDelay = this.getMaxDelay();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxDelay", theMaxDelay), currentHashCode, theMaxDelay);
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
        if (draftCopy instanceof Precedence) {
            final Precedence copy = ((Precedence) draftCopy);
            if (this.former!= null) {
                String sourceFormer;
                sourceFormer = this.getFormer();
                String copyFormer = ((String) strategy.copy(LocatorUtils.property(locator, "former", sourceFormer), sourceFormer));
                copy.setFormer(copyFormer);
            } else {
                copy.former = null;
            }
            if (this.later!= null) {
                String sourceLater;
                sourceLater = this.getLater();
                String copyLater = ((String) strategy.copy(LocatorUtils.property(locator, "later", sourceLater), sourceLater));
                copy.setLater(copyLater);
            } else {
                copy.later = null;
            }
            if (this.minDelay!= null) {
                BigInteger sourceMinDelay;
                sourceMinDelay = this.getMinDelay();
                BigInteger copyMinDelay = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "minDelay", sourceMinDelay), sourceMinDelay));
                copy.setMinDelay(copyMinDelay);
            } else {
                copy.minDelay = null;
            }
            if (this.maxDelay!= null) {
                BigInteger sourceMaxDelay;
                sourceMaxDelay = this.getMaxDelay();
                BigInteger copyMaxDelay = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "maxDelay", sourceMaxDelay), sourceMaxDelay));
                copy.setMaxDelay(copyMaxDelay);
            } else {
                copy.maxDelay = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Precedence();
    }

}
