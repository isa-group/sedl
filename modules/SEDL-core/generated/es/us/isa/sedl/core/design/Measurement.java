//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.10 a las 01:14:05 PM CEST 
//


package es.us.isa.sedl.core.design;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * A measurement implies to obtain the current value of a set of variables on a set of groups.
 * 
 * 
 * <p>Clase Java para Measurement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Measurement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/design}ExperimentalProtocolStep"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="variableValuation" type="{http://isa.us.es/sedl/core/design}VariableValuation" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="variable" use="required"&gt;
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
@XmlType(name = "Measurement", propOrder = {
    "variableValuation"
})
public class Measurement
    extends ExperimentalProtocolStep
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected List<VariableValuation> variableValuation;
    @XmlAttribute(name = "variable", required = true)
    protected List<String> variable;

    /**
     * Gets the value of the variableValuation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableValuation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableValuation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariableValuation }
     * 
     * 
     */
    public List<VariableValuation> getVariableValuation() {
        if (variableValuation == null) {
            variableValuation = new ArrayList<VariableValuation>();
        }
        return this.variableValuation;
    }

    /**
     * Gets the value of the variable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVariable() {
        if (variable == null) {
            variable = new ArrayList<String>();
        }
        return this.variable;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Measurement)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Measurement that = ((Measurement) object);
        {
            List<VariableValuation> lhsVariableValuation;
            lhsVariableValuation = (((this.variableValuation!= null)&&(!this.variableValuation.isEmpty()))?this.getVariableValuation():null);
            List<VariableValuation> rhsVariableValuation;
            rhsVariableValuation = (((that.variableValuation!= null)&&(!that.variableValuation.isEmpty()))?that.getVariableValuation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "variableValuation", lhsVariableValuation), LocatorUtils.property(thatLocator, "variableValuation", rhsVariableValuation), lhsVariableValuation, rhsVariableValuation)) {
                return false;
            }
        }
        {
            List<String> lhsVariable;
            lhsVariable = (((this.variable!= null)&&(!this.variable.isEmpty()))?this.getVariable():null);
            List<String> rhsVariable;
            rhsVariable = (((that.variable!= null)&&(!that.variable.isEmpty()))?that.getVariable():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "variable", lhsVariable), LocatorUtils.property(thatLocator, "variable", rhsVariable), lhsVariable, rhsVariable)) {
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
            List<VariableValuation> theVariableValuation;
            theVariableValuation = (((this.variableValuation!= null)&&(!this.variableValuation.isEmpty()))?this.getVariableValuation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "variableValuation", theVariableValuation), currentHashCode, theVariableValuation);
        }
        {
            List<String> theVariable;
            theVariable = (((this.variable!= null)&&(!this.variable.isEmpty()))?this.getVariable():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "variable", theVariable), currentHashCode, theVariable);
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
        if (draftCopy instanceof Measurement) {
            final Measurement copy = ((Measurement) draftCopy);
            if ((this.variableValuation!= null)&&(!this.variableValuation.isEmpty())) {
                List<VariableValuation> sourceVariableValuation;
                sourceVariableValuation = (((this.variableValuation!= null)&&(!this.variableValuation.isEmpty()))?this.getVariableValuation():null);
                @SuppressWarnings("unchecked")
                List<VariableValuation> copyVariableValuation = ((List<VariableValuation> ) strategy.copy(LocatorUtils.property(locator, "variableValuation", sourceVariableValuation), sourceVariableValuation));
                copy.variableValuation = null;
                if (copyVariableValuation!= null) {
                    List<VariableValuation> uniqueVariableValuationl = copy.getVariableValuation();
                    uniqueVariableValuationl.addAll(copyVariableValuation);
                }
            } else {
                copy.variableValuation = null;
            }
            if ((this.variable!= null)&&(!this.variable.isEmpty())) {
                List<String> sourceVariable;
                sourceVariable = (((this.variable!= null)&&(!this.variable.isEmpty()))?this.getVariable():null);
                @SuppressWarnings("unchecked")
                List<String> copyVariable = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "variable", sourceVariable), sourceVariable));
                copy.variable = null;
                if (copyVariable!= null) {
                    List<String> uniqueVariablel = copy.getVariable();
                    uniqueVariablel.addAll(copyVariable);
                }
            } else {
                copy.variable = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Measurement();
    }

}
