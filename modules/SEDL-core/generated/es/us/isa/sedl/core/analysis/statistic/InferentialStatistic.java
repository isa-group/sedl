//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.07.14 a las 12:52:39 PM CEST 
//


package es.us.isa.sedl.core.analysis.statistic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Clase Java para InferentialStatistic complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InferentialStatistic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/analysis/statistic}Statistic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assumptions" type="{http://isa.us.es/sedl/core/analysis/statistic}StatisticalTestAssertion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InferentialStatistic", propOrder = {
    "assumptions"
})
@XmlSeeAlso({
    ConfidenceInterval.class,
    AssociationalAnalysis.class,
    TestOfHypothesis.class,
    EffectSizeEstimator.class
})
public class InferentialStatistic
    extends Statistic
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected List<StatisticalTestAssertion> assumptions;

    /**
     * Gets the value of the assumptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assumptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssumptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatisticalTestAssertion }
     * 
     * 
     */
    public List<StatisticalTestAssertion> getAssumptions() {
        if (assumptions == null) {
            assumptions = new ArrayList<StatisticalTestAssertion>();
        }
        return this.assumptions;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof InferentialStatistic)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final InferentialStatistic that = ((InferentialStatistic) object);
        {
            List<StatisticalTestAssertion> lhsAssumptions;
            lhsAssumptions = (((this.assumptions!= null)&&(!this.assumptions.isEmpty()))?this.getAssumptions():null);
            List<StatisticalTestAssertion> rhsAssumptions;
            rhsAssumptions = (((that.assumptions!= null)&&(!that.assumptions.isEmpty()))?that.getAssumptions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assumptions", lhsAssumptions), LocatorUtils.property(thatLocator, "assumptions", rhsAssumptions), lhsAssumptions, rhsAssumptions)) {
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
            List<StatisticalTestAssertion> theAssumptions;
            theAssumptions = (((this.assumptions!= null)&&(!this.assumptions.isEmpty()))?this.getAssumptions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assumptions", theAssumptions), currentHashCode, theAssumptions);
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
        if (draftCopy instanceof InferentialStatistic) {
            final InferentialStatistic copy = ((InferentialStatistic) draftCopy);
            if ((this.assumptions!= null)&&(!this.assumptions.isEmpty())) {
                List<StatisticalTestAssertion> sourceAssumptions;
                sourceAssumptions = (((this.assumptions!= null)&&(!this.assumptions.isEmpty()))?this.getAssumptions():null);
                @SuppressWarnings("unchecked")
                List<StatisticalTestAssertion> copyAssumptions = ((List<StatisticalTestAssertion> ) strategy.copy(LocatorUtils.property(locator, "assumptions", sourceAssumptions), sourceAssumptions));
                copy.assumptions = null;
                if (copyAssumptions!= null) {
                    List<StatisticalTestAssertion> uniqueAssumptionsl = copy.getAssumptions();
                    uniqueAssumptionsl.addAll(copyAssumptions);
                }
            } else {
                copy.assumptions = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new InferentialStatistic();
    }

}
