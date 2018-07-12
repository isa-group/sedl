//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.06.26 a las 12:16:30 PM CEST 
//


package es.us.isa.sedl.core.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * An experimental tasks is a simple step of a sequential experimental procedure. Experimental tasks are an  extension point of SEDL. In this sense, if no
 * 		 control flow or decission making structures are needed during the conduction of the experiments, an 
 * 		 execution scheme can be use to describe the experimental procedure, and user defined tasks can
 * 		 be used to provide the information needed for a accurate and replicable experimetal conduction description.
 * 
 * 
 * <p>Clase Java para ExperimentalTask complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExperimentalTask"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="experimentalTaskType" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExperimentalTask")
@XmlSeeAlso({
    CommandExperimentalTask.class
})
public abstract class ExperimentalTask
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "experimentalTaskType", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String experimentalTaskType;

    /**
     * Obtiene el valor de la propiedad experimentalTaskType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperimentalTaskType() {
        return experimentalTaskType;
    }

    /**
     * Define el valor de la propiedad experimentalTaskType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperimentalTaskType(String value) {
        this.experimentalTaskType = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ExperimentalTask)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ExperimentalTask that = ((ExperimentalTask) object);
        {
            String lhsExperimentalTaskType;
            lhsExperimentalTaskType = this.getExperimentalTaskType();
            String rhsExperimentalTaskType;
            rhsExperimentalTaskType = that.getExperimentalTaskType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "experimentalTaskType", lhsExperimentalTaskType), LocatorUtils.property(thatLocator, "experimentalTaskType", rhsExperimentalTaskType), lhsExperimentalTaskType, rhsExperimentalTaskType)) {
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
            String theExperimentalTaskType;
            theExperimentalTaskType = this.getExperimentalTaskType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "experimentalTaskType", theExperimentalTaskType), currentHashCode, theExperimentalTaskType);
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
        if (target instanceof ExperimentalTask) {
            final ExperimentalTask copy = ((ExperimentalTask) target);
            if (this.experimentalTaskType!= null) {
                String sourceExperimentalTaskType;
                sourceExperimentalTaskType = this.getExperimentalTaskType();
                String copyExperimentalTaskType = ((String) strategy.copy(LocatorUtils.property(locator, "experimentalTaskType", sourceExperimentalTaskType), sourceExperimentalTaskType));
                copy.setExperimentalTaskType(copyExperimentalTaskType);
            } else {
                copy.experimentalTaskType = null;
            }
        }
        return target;
    }

}
