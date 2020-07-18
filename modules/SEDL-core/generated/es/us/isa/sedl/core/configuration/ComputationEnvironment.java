//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.07.14 a las 12:52:39 PM CEST 
//


package es.us.isa.sedl.core.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * 
 * 		A computation environment is an specific type of experimental environment that comprises of:
 * 		an operating system, an optional runtme, an optional set of libraries, and an optional
 * 		set of invironment variables.
 * 
 * 
 * <p>Clase Java para ComputationEnvironment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ComputationEnvironment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/configuration}ExperimentalEnvironment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hardwarePlatform" type="{http://isa.us.es/sedl/core/configuration}HardwarePlatform"/&gt;
 *         &lt;element name="softwarePlatform" type="{http://isa.us.es/sedl/core/configuration}SoftwarePlatform"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputationEnvironment", propOrder = {
    "hardwarePlatform",
    "softwarePlatform"
})
public class ComputationEnvironment
    extends ExperimentalEnvironment
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected HardwarePlatform hardwarePlatform;
    @XmlElement(required = true)
    protected SoftwarePlatform softwarePlatform;

    /**
     * Obtiene el valor de la propiedad hardwarePlatform.
     * 
     * @return
     *     possible object is
     *     {@link HardwarePlatform }
     *     
     */
    public HardwarePlatform getHardwarePlatform() {
        return hardwarePlatform;
    }

    /**
     * Define el valor de la propiedad hardwarePlatform.
     * 
     * @param value
     *     allowed object is
     *     {@link HardwarePlatform }
     *     
     */
    public void setHardwarePlatform(HardwarePlatform value) {
        this.hardwarePlatform = value;
    }

    /**
     * Obtiene el valor de la propiedad softwarePlatform.
     * 
     * @return
     *     possible object is
     *     {@link SoftwarePlatform }
     *     
     */
    public SoftwarePlatform getSoftwarePlatform() {
        return softwarePlatform;
    }

    /**
     * Define el valor de la propiedad softwarePlatform.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwarePlatform }
     *     
     */
    public void setSoftwarePlatform(SoftwarePlatform value) {
        this.softwarePlatform = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ComputationEnvironment)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ComputationEnvironment that = ((ComputationEnvironment) object);
        {
            HardwarePlatform lhsHardwarePlatform;
            lhsHardwarePlatform = this.getHardwarePlatform();
            HardwarePlatform rhsHardwarePlatform;
            rhsHardwarePlatform = that.getHardwarePlatform();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hardwarePlatform", lhsHardwarePlatform), LocatorUtils.property(thatLocator, "hardwarePlatform", rhsHardwarePlatform), lhsHardwarePlatform, rhsHardwarePlatform)) {
                return false;
            }
        }
        {
            SoftwarePlatform lhsSoftwarePlatform;
            lhsSoftwarePlatform = this.getSoftwarePlatform();
            SoftwarePlatform rhsSoftwarePlatform;
            rhsSoftwarePlatform = that.getSoftwarePlatform();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "softwarePlatform", lhsSoftwarePlatform), LocatorUtils.property(thatLocator, "softwarePlatform", rhsSoftwarePlatform), lhsSoftwarePlatform, rhsSoftwarePlatform)) {
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
            HardwarePlatform theHardwarePlatform;
            theHardwarePlatform = this.getHardwarePlatform();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hardwarePlatform", theHardwarePlatform), currentHashCode, theHardwarePlatform);
        }
        {
            SoftwarePlatform theSoftwarePlatform;
            theSoftwarePlatform = this.getSoftwarePlatform();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "softwarePlatform", theSoftwarePlatform), currentHashCode, theSoftwarePlatform);
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
        if (draftCopy instanceof ComputationEnvironment) {
            final ComputationEnvironment copy = ((ComputationEnvironment) draftCopy);
            if (this.hardwarePlatform!= null) {
                HardwarePlatform sourceHardwarePlatform;
                sourceHardwarePlatform = this.getHardwarePlatform();
                HardwarePlatform copyHardwarePlatform = ((HardwarePlatform) strategy.copy(LocatorUtils.property(locator, "hardwarePlatform", sourceHardwarePlatform), sourceHardwarePlatform));
                copy.setHardwarePlatform(copyHardwarePlatform);
            } else {
                copy.hardwarePlatform = null;
            }
            if (this.softwarePlatform!= null) {
                SoftwarePlatform sourceSoftwarePlatform;
                sourceSoftwarePlatform = this.getSoftwarePlatform();
                SoftwarePlatform copySoftwarePlatform = ((SoftwarePlatform) strategy.copy(LocatorUtils.property(locator, "softwarePlatform", sourceSoftwarePlatform), sourceSoftwarePlatform));
                copy.setSoftwarePlatform(copySoftwarePlatform);
            } else {
                copy.softwarePlatform = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ComputationEnvironment();
    }

}
