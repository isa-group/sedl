//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.17 a las 12:43:04 AM CEST 
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
 * <p>Clase Java para ExperimentalProtocol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExperimentalProtocol"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="steps" type="{http://isa.us.es/sedl/core/design}ExperimentalProtocolStep" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="scheme" use="required" type="{http://isa.us.es/sedl/core/design}ProtocolScheme" /&gt;
 *       &lt;attribute name="constraints" use="required"&gt;
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
@XmlType(name = "ExperimentalProtocol", propOrder = {
    "steps"
})
public class ExperimentalProtocol
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected List<ExperimentalProtocolStep> steps;
    @XmlAttribute(name = "scheme", required = true)
    protected ProtocolScheme scheme;
    @XmlAttribute(name = "constraints", required = true)
    protected List<String> constraints;

    /**
     * Gets the value of the steps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the steps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSteps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExperimentalProtocolStep }
     * 
     * 
     */
    public List<ExperimentalProtocolStep> getSteps() {
        if (steps == null) {
            steps = new ArrayList<ExperimentalProtocolStep>();
        }
        return this.steps;
    }

    /**
     * Obtiene el valor de la propiedad scheme.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolScheme }
     *     
     */
    public ProtocolScheme getScheme() {
        return scheme;
    }

    /**
     * Define el valor de la propiedad scheme.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolScheme }
     *     
     */
    public void setScheme(ProtocolScheme value) {
        this.scheme = value;
    }

    /**
     * Gets the value of the constraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConstraints() {
        if (constraints == null) {
            constraints = new ArrayList<String>();
        }
        return this.constraints;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ExperimentalProtocol)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ExperimentalProtocol that = ((ExperimentalProtocol) object);
        {
            List<ExperimentalProtocolStep> lhsSteps;
            lhsSteps = (((this.steps!= null)&&(!this.steps.isEmpty()))?this.getSteps():null);
            List<ExperimentalProtocolStep> rhsSteps;
            rhsSteps = (((that.steps!= null)&&(!that.steps.isEmpty()))?that.getSteps():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "steps", lhsSteps), LocatorUtils.property(thatLocator, "steps", rhsSteps), lhsSteps, rhsSteps)) {
                return false;
            }
        }
        {
            ProtocolScheme lhsScheme;
            lhsScheme = this.getScheme();
            ProtocolScheme rhsScheme;
            rhsScheme = that.getScheme();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scheme", lhsScheme), LocatorUtils.property(thatLocator, "scheme", rhsScheme), lhsScheme, rhsScheme)) {
                return false;
            }
        }
        {
            List<String> lhsConstraints;
            lhsConstraints = (((this.constraints!= null)&&(!this.constraints.isEmpty()))?this.getConstraints():null);
            List<String> rhsConstraints;
            rhsConstraints = (((that.constraints!= null)&&(!that.constraints.isEmpty()))?that.getConstraints():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constraints", lhsConstraints), LocatorUtils.property(thatLocator, "constraints", rhsConstraints), lhsConstraints, rhsConstraints)) {
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
            List<ExperimentalProtocolStep> theSteps;
            theSteps = (((this.steps!= null)&&(!this.steps.isEmpty()))?this.getSteps():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "steps", theSteps), currentHashCode, theSteps);
        }
        {
            ProtocolScheme theScheme;
            theScheme = this.getScheme();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheme", theScheme), currentHashCode, theScheme);
        }
        {
            List<String> theConstraints;
            theConstraints = (((this.constraints!= null)&&(!this.constraints.isEmpty()))?this.getConstraints():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "constraints", theConstraints), currentHashCode, theConstraints);
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
        if (draftCopy instanceof ExperimentalProtocol) {
            final ExperimentalProtocol copy = ((ExperimentalProtocol) draftCopy);
            if ((this.steps!= null)&&(!this.steps.isEmpty())) {
                List<ExperimentalProtocolStep> sourceSteps;
                sourceSteps = (((this.steps!= null)&&(!this.steps.isEmpty()))?this.getSteps():null);
                @SuppressWarnings("unchecked")
                List<ExperimentalProtocolStep> copySteps = ((List<ExperimentalProtocolStep> ) strategy.copy(LocatorUtils.property(locator, "steps", sourceSteps), sourceSteps));
                copy.steps = null;
                if (copySteps!= null) {
                    List<ExperimentalProtocolStep> uniqueStepsl = copy.getSteps();
                    uniqueStepsl.addAll(copySteps);
                }
            } else {
                copy.steps = null;
            }
            if (this.scheme!= null) {
                ProtocolScheme sourceScheme;
                sourceScheme = this.getScheme();
                ProtocolScheme copyScheme = ((ProtocolScheme) strategy.copy(LocatorUtils.property(locator, "scheme", sourceScheme), sourceScheme));
                copy.setScheme(copyScheme);
            } else {
                copy.scheme = null;
            }
            if ((this.constraints!= null)&&(!this.constraints.isEmpty())) {
                List<String> sourceConstraints;
                sourceConstraints = (((this.constraints!= null)&&(!this.constraints.isEmpty()))?this.getConstraints():null);
                @SuppressWarnings("unchecked")
                List<String> copyConstraints = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "constraints", sourceConstraints), sourceConstraints));
                copy.constraints = null;
                if (copyConstraints!= null) {
                    List<String> uniqueConstraintsl = copy.getConstraints();
                    uniqueConstraintsl.addAll(copyConstraints);
                }
            } else {
                copy.constraints = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ExperimentalProtocol();
    }

}
