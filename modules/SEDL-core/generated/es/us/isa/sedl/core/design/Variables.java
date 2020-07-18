//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.07.14 a las 12:52:39 PM CEST 
//


package es.us.isa.sedl.core.design;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Clase Java para Variables complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Variables"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="variables" type="{http://isa.us.es/sedl/core/design}Variable" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Variables", propOrder = {
    "variables"
})
public class Variables
    extends AbstractVariables
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected List<Variable> variables;

    /**
     * Gets the value of the variables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Variable }
     * 
     * 
     */
    public List<Variable> getVariables() {
        if (variables == null) {
            variables = new ArrayList<Variable>();
        }
        return this.variables;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Variables)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Variables that = ((Variables) object);
        {
            List<Variable> lhsVariables;
            lhsVariables = (((this.variables!= null)&&(!this.variables.isEmpty()))?this.getVariables():null);
            List<Variable> rhsVariables;
            rhsVariables = (((that.variables!= null)&&(!that.variables.isEmpty()))?that.getVariables():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "variables", lhsVariables), LocatorUtils.property(thatLocator, "variables", rhsVariables), lhsVariables, rhsVariables)) {
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
            List<Variable> theVariables;
            theVariables = (((this.variables!= null)&&(!this.variables.isEmpty()))?this.getVariables():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "variables", theVariables), currentHashCode, theVariables);
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
        if (draftCopy instanceof Variables) {
            final Variables copy = ((Variables) draftCopy);
            if ((this.variables!= null)&&(!this.variables.isEmpty())) {
                List<Variable> sourceVariables;
                sourceVariables = (((this.variables!= null)&&(!this.variables.isEmpty()))?this.getVariables():null);
                @SuppressWarnings("unchecked")
                List<Variable> copyVariables = ((List<Variable> ) strategy.copy(LocatorUtils.property(locator, "variables", sourceVariables), sourceVariables));
                copy.variables = null;
                if (copyVariables!= null) {
                    List<Variable> uniqueVariablesl = copy.getVariables();
                    uniqueVariablesl.addAll(copyVariables);
                }
            } else {
                copy.variables = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Variables();
    }

}
