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
 * <p>Clase Java para Nhst complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Nhst"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/analysis/statistic}TestOfHypothesis"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="postHoc" type="{http://isa.us.es/sedl/core/analysis/statistic}Nhst" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.eclipse.org/uml2/5.0.0/Types}String" /&gt;
 *       &lt;attribute name="statisticalDistribution" use="required" type="{http://www.eclipse.org/uml2/5.0.0/Types}String" /&gt;
 *       &lt;attribute name="alpha" type="{http://www.w3.org/2001/XMLSchema}double" default="0.05" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nhst", propOrder = {
    "postHoc"
})
public class Nhst
    extends TestOfHypothesis
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected List<Nhst> postHoc;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "statisticalDistribution", required = true)
    protected String statisticalDistribution;
    @XmlAttribute(name = "alpha")
    protected Double alpha;

    /**
     * Gets the value of the postHoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postHoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostHoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Nhst }
     * 
     * 
     */
    public List<Nhst> getPostHoc() {
        if (postHoc == null) {
            postHoc = new ArrayList<Nhst>();
        }
        return this.postHoc;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad statisticalDistribution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticalDistribution() {
        return statisticalDistribution;
    }

    /**
     * Define el valor de la propiedad statisticalDistribution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticalDistribution(String value) {
        this.statisticalDistribution = value;
    }

    /**
     * Obtiene el valor de la propiedad alpha.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getAlpha() {
        if (alpha == null) {
            return  0.05D;
        } else {
            return alpha;
        }
    }

    /**
     * Define el valor de la propiedad alpha.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAlpha(Double value) {
        this.alpha = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Nhst)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Nhst that = ((Nhst) object);
        {
            List<Nhst> lhsPostHoc;
            lhsPostHoc = (((this.postHoc!= null)&&(!this.postHoc.isEmpty()))?this.getPostHoc():null);
            List<Nhst> rhsPostHoc;
            rhsPostHoc = (((that.postHoc!= null)&&(!that.postHoc.isEmpty()))?that.getPostHoc():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postHoc", lhsPostHoc), LocatorUtils.property(thatLocator, "postHoc", rhsPostHoc), lhsPostHoc, rhsPostHoc)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsStatisticalDistribution;
            lhsStatisticalDistribution = this.getStatisticalDistribution();
            String rhsStatisticalDistribution;
            rhsStatisticalDistribution = that.getStatisticalDistribution();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statisticalDistribution", lhsStatisticalDistribution), LocatorUtils.property(thatLocator, "statisticalDistribution", rhsStatisticalDistribution), lhsStatisticalDistribution, rhsStatisticalDistribution)) {
                return false;
            }
        }
        {
            double lhsAlpha;
            lhsAlpha = ((this.alpha!= null)?this.getAlpha(): 0.0D);
            double rhsAlpha;
            rhsAlpha = ((that.alpha!= null)?that.getAlpha(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alpha", lhsAlpha), LocatorUtils.property(thatLocator, "alpha", rhsAlpha), lhsAlpha, rhsAlpha)) {
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
            List<Nhst> thePostHoc;
            thePostHoc = (((this.postHoc!= null)&&(!this.postHoc.isEmpty()))?this.getPostHoc():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postHoc", thePostHoc), currentHashCode, thePostHoc);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theStatisticalDistribution;
            theStatisticalDistribution = this.getStatisticalDistribution();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statisticalDistribution", theStatisticalDistribution), currentHashCode, theStatisticalDistribution);
        }
        {
            double theAlpha;
            theAlpha = ((this.alpha!= null)?this.getAlpha(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alpha", theAlpha), currentHashCode, theAlpha);
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
        if (draftCopy instanceof Nhst) {
            final Nhst copy = ((Nhst) draftCopy);
            if ((this.postHoc!= null)&&(!this.postHoc.isEmpty())) {
                List<Nhst> sourcePostHoc;
                sourcePostHoc = (((this.postHoc!= null)&&(!this.postHoc.isEmpty()))?this.getPostHoc():null);
                @SuppressWarnings("unchecked")
                List<Nhst> copyPostHoc = ((List<Nhst> ) strategy.copy(LocatorUtils.property(locator, "postHoc", sourcePostHoc), sourcePostHoc));
                copy.postHoc = null;
                if (copyPostHoc!= null) {
                    List<Nhst> uniquePostHocl = copy.getPostHoc();
                    uniquePostHocl.addAll(copyPostHoc);
                }
            } else {
                copy.postHoc = null;
            }
            if (this.name!= null) {
                String sourceName;
                sourceName = this.getName();
                String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
            if (this.statisticalDistribution!= null) {
                String sourceStatisticalDistribution;
                sourceStatisticalDistribution = this.getStatisticalDistribution();
                String copyStatisticalDistribution = ((String) strategy.copy(LocatorUtils.property(locator, "statisticalDistribution", sourceStatisticalDistribution), sourceStatisticalDistribution));
                copy.setStatisticalDistribution(copyStatisticalDistribution);
            } else {
                copy.statisticalDistribution = null;
            }
            if (this.alpha!= null) {
                double sourceAlpha;
                sourceAlpha = ((this.alpha!= null)?this.getAlpha(): 0.0D);
                double copyAlpha = strategy.copy(LocatorUtils.property(locator, "alpha", sourceAlpha), sourceAlpha);
                copy.setAlpha(copyAlpha);
            } else {
                copy.alpha = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Nhst();
    }

}
