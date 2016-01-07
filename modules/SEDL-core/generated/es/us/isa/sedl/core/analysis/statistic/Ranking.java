//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.01.07 a las 06:11:32 PM CET 
//


package es.us.isa.sedl.core.analysis.statistic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Clase Java para Ranking complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Ranking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/analysis/statistic}Statistic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rankingCriterion" type="{http://isa.us.es/sedl/core/analysis/statistic}DescriptiveStatistic"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="rankingVariable" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ranking", propOrder = {
    "rankingCriterion"
})
public class Ranking
    extends Statistic
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected DescriptiveStatistic rankingCriterion;
    @XmlAttribute(name = "rankingVariable", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String rankingVariable;

    /**
     * Obtiene el valor de la propiedad rankingCriterion.
     * 
     * @return
     *     possible object is
     *     {@link DescriptiveStatistic }
     *     
     */
    public DescriptiveStatistic getRankingCriterion() {
        return rankingCriterion;
    }

    /**
     * Define el valor de la propiedad rankingCriterion.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptiveStatistic }
     *     
     */
    public void setRankingCriterion(DescriptiveStatistic value) {
        this.rankingCriterion = value;
    }

    /**
     * Obtiene el valor de la propiedad rankingVariable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRankingVariable() {
        return rankingVariable;
    }

    /**
     * Define el valor de la propiedad rankingVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRankingVariable(String value) {
        this.rankingVariable = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Ranking)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Ranking that = ((Ranking) object);
        {
            DescriptiveStatistic lhsRankingCriterion;
            lhsRankingCriterion = this.getRankingCriterion();
            DescriptiveStatistic rhsRankingCriterion;
            rhsRankingCriterion = that.getRankingCriterion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rankingCriterion", lhsRankingCriterion), LocatorUtils.property(thatLocator, "rankingCriterion", rhsRankingCriterion), lhsRankingCriterion, rhsRankingCriterion)) {
                return false;
            }
        }
        {
            String lhsRankingVariable;
            lhsRankingVariable = this.getRankingVariable();
            String rhsRankingVariable;
            rhsRankingVariable = that.getRankingVariable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rankingVariable", lhsRankingVariable), LocatorUtils.property(thatLocator, "rankingVariable", rhsRankingVariable), lhsRankingVariable, rhsRankingVariable)) {
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
            DescriptiveStatistic theRankingCriterion;
            theRankingCriterion = this.getRankingCriterion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rankingCriterion", theRankingCriterion), currentHashCode, theRankingCriterion);
        }
        {
            String theRankingVariable;
            theRankingVariable = this.getRankingVariable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rankingVariable", theRankingVariable), currentHashCode, theRankingVariable);
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
        if (draftCopy instanceof Ranking) {
            final Ranking copy = ((Ranking) draftCopy);
            if (this.rankingCriterion!= null) {
                DescriptiveStatistic sourceRankingCriterion;
                sourceRankingCriterion = this.getRankingCriterion();
                DescriptiveStatistic copyRankingCriterion = ((DescriptiveStatistic) strategy.copy(LocatorUtils.property(locator, "rankingCriterion", sourceRankingCriterion), sourceRankingCriterion));
                copy.setRankingCriterion(copyRankingCriterion);
            } else {
                copy.rankingCriterion = null;
            }
            if (this.rankingVariable!= null) {
                String sourceRankingVariable;
                sourceRankingVariable = this.getRankingVariable();
                String copyRankingVariable = ((String) strategy.copy(LocatorUtils.property(locator, "rankingVariable", sourceRankingVariable), sourceRankingVariable));
                copy.setRankingVariable(copyRankingVariable);
            } else {
                copy.rankingVariable = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Ranking();
    }

}
