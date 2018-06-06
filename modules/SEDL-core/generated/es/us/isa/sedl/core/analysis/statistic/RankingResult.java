//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.06.06 a las 11:25:05 AM CEST 
//


package es.us.isa.sedl.core.analysis.statistic;

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
 * <p>Clase Java para RankingResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RankingResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/analysis/statistic}StatisticalAnalysisResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ranks" type="{http://isa.us.es/sedl/core/analysis/statistic}Rank" maxOccurs="unbounded" minOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RankingResult", propOrder = {
    "ranks"
})
public class RankingResult
    extends StatisticalAnalysisResult
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected List<Rank> ranks;

    /**
     * Gets the value of the ranks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ranks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRanks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rank }
     * 
     * 
     */
    public List<Rank> getRanks() {
        if (ranks == null) {
            ranks = new ArrayList<Rank>();
        }
        return this.ranks;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RankingResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RankingResult that = ((RankingResult) object);
        {
            List<Rank> lhsRanks;
            lhsRanks = (((this.ranks!= null)&&(!this.ranks.isEmpty()))?this.getRanks():null);
            List<Rank> rhsRanks;
            rhsRanks = (((that.ranks!= null)&&(!that.ranks.isEmpty()))?that.getRanks():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ranks", lhsRanks), LocatorUtils.property(thatLocator, "ranks", rhsRanks), lhsRanks, rhsRanks)) {
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
            List<Rank> theRanks;
            theRanks = (((this.ranks!= null)&&(!this.ranks.isEmpty()))?this.getRanks():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ranks", theRanks), currentHashCode, theRanks);
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
        if (draftCopy instanceof RankingResult) {
            final RankingResult copy = ((RankingResult) draftCopy);
            if ((this.ranks!= null)&&(!this.ranks.isEmpty())) {
                List<Rank> sourceRanks;
                sourceRanks = (((this.ranks!= null)&&(!this.ranks.isEmpty()))?this.getRanks():null);
                @SuppressWarnings("unchecked")
                List<Rank> copyRanks = ((List<Rank> ) strategy.copy(LocatorUtils.property(locator, "ranks", sourceRanks), sourceRanks));
                copy.ranks = null;
                if (copyRanks!= null) {
                    List<Rank> uniqueRanksl = copy.getRanks();
                    uniqueRanksl.addAll(copyRanks);
                }
            } else {
                copy.ranks = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RankingResult();
    }

}
