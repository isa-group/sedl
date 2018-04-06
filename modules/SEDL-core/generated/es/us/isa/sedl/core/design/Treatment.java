//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.06 a las 05:46:41 PM CEST 
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
 * A treatment implies to perform an action that sets the value of an independent variable of
 * 				the experiment to a specific value. Consequently, the treatment must specify the levels of
 * 				the independent variables that are set.
 * 
 * <p>Clase Java para Treatment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Treatment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/design}ExperimentalProtocolStep"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="variableValuation" type="{http://isa.us.es/sedl/core/design}VariableValuation" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Treatment", propOrder = {
    "variableValuation"
})
public class Treatment
    extends ExperimentalProtocolStep
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected List<VariableValuation> variableValuation;

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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Treatment)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Treatment that = ((Treatment) object);
        {
            List<VariableValuation> lhsVariableValuation;
            lhsVariableValuation = (((this.variableValuation!= null)&&(!this.variableValuation.isEmpty()))?this.getVariableValuation():null);
            List<VariableValuation> rhsVariableValuation;
            rhsVariableValuation = (((that.variableValuation!= null)&&(!that.variableValuation.isEmpty()))?that.getVariableValuation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "variableValuation", lhsVariableValuation), LocatorUtils.property(thatLocator, "variableValuation", rhsVariableValuation), lhsVariableValuation, rhsVariableValuation)) {
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
        if (draftCopy instanceof Treatment) {
            final Treatment copy = ((Treatment) draftCopy);
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
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Treatment();
    }

}
