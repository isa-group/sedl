//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.06.06 a las 11:25:05 AM CEST 
//


package es.us.isa.sedl.core.design;

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
 * 				The assignment method describes how the individuals in the population of the experiment are associated to the groups. The use of a random assignment 
 *                 method is necessary for having an experiment, otherwise, we have a quasy-experiment. With quasi-experimental studies, it may not be possible to 
 *                 demonstrate a causal link between the treatment condition and observed outcomes. On the other hand,  With random assignment, experimental subjects have the same 
 *                 chance of being assigned to any group. As a result, all the groups will be statistically identical to the control group, on both controlled and
 *                 uncontrolled variables, at baseline (provided that the study has adequate sample size).
 *                 In SEDL assignment methods have a boolean attribute that describes if the assignment is random or not, and a description of the specic procedure used
 *                 for assignment (as a string in natural language).
 *             
 * 
 * <p>Clase Java para AssignmentMethod complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AssignmentMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="random" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignmentMethod")
public class AssignmentMethod
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "description", required = true)
    protected String description;
    @XmlAttribute(name = "random", required = true)
    protected boolean random;

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

    /**
     * Obtiene el valor de la propiedad random.
     * 
     */
    public boolean isRandom() {
        return random;
    }

    /**
     * Define el valor de la propiedad random.
     * 
     */
    public void setRandom(boolean value) {
        this.random = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AssignmentMethod)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AssignmentMethod that = ((AssignmentMethod) object);
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            boolean lhsRandom;
            lhsRandom = (true?this.isRandom():false);
            boolean rhsRandom;
            rhsRandom = (true?that.isRandom():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "random", lhsRandom), LocatorUtils.property(thatLocator, "random", rhsRandom), lhsRandom, rhsRandom)) {
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
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            boolean theRandom;
            theRandom = (true?this.isRandom():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "random", theRandom), currentHashCode, theRandom);
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
        if (draftCopy instanceof AssignmentMethod) {
            final AssignmentMethod copy = ((AssignmentMethod) draftCopy);
            if (this.description!= null) {
                String sourceDescription;
                sourceDescription = this.getDescription();
                String copyDescription = ((String) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription));
                copy.setDescription(copyDescription);
            } else {
                copy.description = null;
            }
            boolean sourceRandom;
            sourceRandom = (true?this.isRandom():false);
            boolean copyRandom = strategy.copy(LocatorUtils.property(locator, "random", sourceRandom), sourceRandom);
            copy.setRandom(copyRandom);
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AssignmentMethod();
    }

}
