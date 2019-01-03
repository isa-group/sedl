//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:22:58 PM CET 
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
 * 	 Experimental settings describe the specific context in which experiments executions are run. An experimental
 * 		 setting containts a general set of parameters (factors affecting the experiment), and a description of the 
 * 		 experimental environment, that describe those factors due to the environment (lab. conditions for chemical, 
 * 		 physical and biological experiments, and the runtime plattform for computer science experiments).    				 				  				 
 * 
 * 
 * <p>Clase Java para ExperimentalSetting complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExperimentalSetting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requirements" type="{http://isa.us.es/sedl/core/configuration}ExperimentalEnvironment"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExperimentalSetting", propOrder = {
    "requirements"
})
public class ExperimentalSetting
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected ExperimentalEnvironment requirements;

    /**
     * Obtiene el valor de la propiedad requirements.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentalEnvironment }
     *     
     */
    public ExperimentalEnvironment getRequirements() {
        return requirements;
    }

    /**
     * Define el valor de la propiedad requirements.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentalEnvironment }
     *     
     */
    public void setRequirements(ExperimentalEnvironment value) {
        this.requirements = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ExperimentalSetting)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ExperimentalSetting that = ((ExperimentalSetting) object);
        {
            ExperimentalEnvironment lhsRequirements;
            lhsRequirements = this.getRequirements();
            ExperimentalEnvironment rhsRequirements;
            rhsRequirements = that.getRequirements();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requirements", lhsRequirements), LocatorUtils.property(thatLocator, "requirements", rhsRequirements), lhsRequirements, rhsRequirements)) {
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
            ExperimentalEnvironment theRequirements;
            theRequirements = this.getRequirements();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requirements", theRequirements), currentHashCode, theRequirements);
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
        if (draftCopy instanceof ExperimentalSetting) {
            final ExperimentalSetting copy = ((ExperimentalSetting) draftCopy);
            if (this.requirements!= null) {
                ExperimentalEnvironment sourceRequirements;
                sourceRequirements = this.getRequirements();
                ExperimentalEnvironment copyRequirements = ((ExperimentalEnvironment) strategy.copy(LocatorUtils.property(locator, "requirements", sourceRequirements), sourceRequirements));
                copy.setRequirements(copyRequirements);
            } else {
                copy.requirements = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ExperimentalSetting();
    }

}
