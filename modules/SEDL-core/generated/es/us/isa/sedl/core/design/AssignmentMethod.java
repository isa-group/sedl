//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:22:58 PM CET 
//


package es.us.isa.sedl.core.design;

import java.util.ArrayList;
import java.util.List;
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
 * 				method is necessary for having an experiment, otherwise, we have a quasy-experiment. With quasi-experimental studies, it may not be possible to 
 * 				demonstrate a causal link between the treatment condition and observed outcomes. On the other hand,  With random assignment, experimental subjects have the same 
 * 				chance of being assigned to any group. As a result, all the groups will be statistically identical to the control group, on both controlled and
 * 				uncontrolled variables, at baseline (provided that the study has adequate sample size).
 * 				In SEDL assignment methods have a boolean attribute that describes if the assignment is random or not, and a description of the specic procedure used
 * 				for assignment (as a string in natural language).
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
 *       &lt;attribute name="blockingVariables"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
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
    @XmlAttribute(name = "blockingVariables")
    protected List<String> blockingVariables;

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

    /**
     * Gets the value of the blockingVariables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockingVariables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockingVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBlockingVariables() {
        if (blockingVariables == null) {
            blockingVariables = new ArrayList<String>();
        }
        return this.blockingVariables;
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
        {
            List<String> lhsBlockingVariables;
            lhsBlockingVariables = (((this.blockingVariables!= null)&&(!this.blockingVariables.isEmpty()))?this.getBlockingVariables():null);
            List<String> rhsBlockingVariables;
            rhsBlockingVariables = (((that.blockingVariables!= null)&&(!that.blockingVariables.isEmpty()))?that.getBlockingVariables():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "blockingVariables", lhsBlockingVariables), LocatorUtils.property(thatLocator, "blockingVariables", rhsBlockingVariables), lhsBlockingVariables, rhsBlockingVariables)) {
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
        {
            List<String> theBlockingVariables;
            theBlockingVariables = (((this.blockingVariables!= null)&&(!this.blockingVariables.isEmpty()))?this.getBlockingVariables():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "blockingVariables", theBlockingVariables), currentHashCode, theBlockingVariables);
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
            if ((this.blockingVariables!= null)&&(!this.blockingVariables.isEmpty())) {
                List<String> sourceBlockingVariables;
                sourceBlockingVariables = (((this.blockingVariables!= null)&&(!this.blockingVariables.isEmpty()))?this.getBlockingVariables():null);
                @SuppressWarnings("unchecked")
                List<String> copyBlockingVariables = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "blockingVariables", sourceBlockingVariables), sourceBlockingVariables));
                copy.blockingVariables = null;
                if (copyBlockingVariables!= null) {
                    List<String> uniqueBlockingVariablesl = copy.getBlockingVariables();
                    uniqueBlockingVariablesl.addAll(copyBlockingVariables);
                }
            } else {
                copy.blockingVariables = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AssignmentMethod();
    }

}
