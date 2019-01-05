//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:44:54 PM CET 
//


package es.us.isa.sedl.core.analysis.statistic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.us.isa.sedl.core.design.AbstractStatisticalAnalysisSpec;
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
 * <p>Clase Java para StatisticalAnalysisSpec complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="StatisticalAnalysisSpec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/design}AnalysisSpecificationGroup"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="statistic" type="{http://isa.us.es/sedl/core/analysis/statistic}Statistic" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticalAnalysisSpec", propOrder = {
    "statistic"
})
public class StatisticalAnalysisSpec
    extends AbstractStatisticalAnalysisSpec
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected List<Statistic> statistic;

    /**
     * Gets the value of the statistic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statistic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatistic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Statistic }
     * 
     * 
     */
    public List<Statistic> getStatistic() {
        if (statistic == null) {
            statistic = new ArrayList<Statistic>();
        }
        return this.statistic;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StatisticalAnalysisSpec)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final StatisticalAnalysisSpec that = ((StatisticalAnalysisSpec) object);
        {
            List<Statistic> lhsStatistic;
            lhsStatistic = (((this.statistic!= null)&&(!this.statistic.isEmpty()))?this.getStatistic():null);
            List<Statistic> rhsStatistic;
            rhsStatistic = (((that.statistic!= null)&&(!that.statistic.isEmpty()))?that.getStatistic():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statistic", lhsStatistic), LocatorUtils.property(thatLocator, "statistic", rhsStatistic), lhsStatistic, rhsStatistic)) {
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
            List<Statistic> theStatistic;
            theStatistic = (((this.statistic!= null)&&(!this.statistic.isEmpty()))?this.getStatistic():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statistic", theStatistic), currentHashCode, theStatistic);
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
        if (draftCopy instanceof StatisticalAnalysisSpec) {
            final StatisticalAnalysisSpec copy = ((StatisticalAnalysisSpec) draftCopy);
            if ((this.statistic!= null)&&(!this.statistic.isEmpty())) {
                List<Statistic> sourceStatistic;
                sourceStatistic = (((this.statistic!= null)&&(!this.statistic.isEmpty()))?this.getStatistic():null);
                @SuppressWarnings("unchecked")
                List<Statistic> copyStatistic = ((List<Statistic> ) strategy.copy(LocatorUtils.property(locator, "statistic", sourceStatistic), sourceStatistic));
                copy.statistic = null;
                if (copyStatistic!= null) {
                    List<Statistic> uniqueStatisticl = copy.getStatistic();
                    uniqueStatisticl.addAll(copyStatistic);
                }
            } else {
                copy.statistic = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new StatisticalAnalysisSpec();
    }

}
