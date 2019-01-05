//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:44:54 PM CET 
//


package es.us.isa.sedl.core.analysis.datasetspecification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.us.isa.sedl.core.design.VariableValuation;
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
 * <p>Clase Java para ValuationFilter complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ValuationFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/analysis/datasetspecification}Filter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="variableValuations" type="{http://isa.us.es/sedl/core/design}VariableValuation" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuationFilter", propOrder = {
    "variableValuations"
})
public class ValuationFilter
    extends AbstractValuationFilter
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected List<VariableValuation> variableValuations;

    /**
     * Gets the value of the variableValuations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableValuations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableValuations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariableValuation }
     * 
     * 
     */
    public List<VariableValuation> getVariableValuations() {
        if (variableValuations == null) {
            variableValuations = new ArrayList<VariableValuation>();
        }
        return this.variableValuations;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ValuationFilter)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ValuationFilter that = ((ValuationFilter) object);
        {
            List<VariableValuation> lhsVariableValuations;
            lhsVariableValuations = (((this.variableValuations!= null)&&(!this.variableValuations.isEmpty()))?this.getVariableValuations():null);
            List<VariableValuation> rhsVariableValuations;
            rhsVariableValuations = (((that.variableValuations!= null)&&(!that.variableValuations.isEmpty()))?that.getVariableValuations():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "variableValuations", lhsVariableValuations), LocatorUtils.property(thatLocator, "variableValuations", rhsVariableValuations), lhsVariableValuations, rhsVariableValuations)) {
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
            List<VariableValuation> theVariableValuations;
            theVariableValuations = (((this.variableValuations!= null)&&(!this.variableValuations.isEmpty()))?this.getVariableValuations():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "variableValuations", theVariableValuations), currentHashCode, theVariableValuations);
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
        if (draftCopy instanceof ValuationFilter) {
            final ValuationFilter copy = ((ValuationFilter) draftCopy);
            if ((this.variableValuations!= null)&&(!this.variableValuations.isEmpty())) {
                List<VariableValuation> sourceVariableValuations;
                sourceVariableValuations = (((this.variableValuations!= null)&&(!this.variableValuations.isEmpty()))?this.getVariableValuations():null);
                @SuppressWarnings("unchecked")
                List<VariableValuation> copyVariableValuations = ((List<VariableValuation> ) strategy.copy(LocatorUtils.property(locator, "variableValuations", sourceVariableValuations), sourceVariableValuations));
                copy.variableValuations = null;
                if (copyVariableValuations!= null) {
                    List<VariableValuation> uniqueVariableValuationsl = copy.getVariableValuations();
                    uniqueVariableValuationsl.addAll(copyVariableValuations);
                }
            } else {
                copy.variableValuations = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ValuationFilter();
    }

}
