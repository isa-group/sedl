//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:49:52 PM CET 
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
 * A group is a set of experimental individuals that receive a sequence of treatments and 
 * 	whose values for the dependent variables are measured in a specific sequence.
 * 
 * <p>Clase Java para Group complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Group"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sizing" type="{http://isa.us.es/sedl/core/design}Sizing"/&gt;
 *         &lt;element name="valuations" type="{http://isa.us.es/sedl/core/design}VariableValuation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group", propOrder = {
    "sizing",
    "valuations"
})
public class Group
    extends AbstractGroup
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected Sizing sizing;
    protected List<VariableValuation> valuations;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Obtiene el valor de la propiedad sizing.
     * 
     * @return
     *     possible object is
     *     {@link Sizing }
     *     
     */
    public Sizing getSizing() {
        return sizing;
    }

    /**
     * Define el valor de la propiedad sizing.
     * 
     * @param value
     *     allowed object is
     *     {@link Sizing }
     *     
     */
    public void setSizing(Sizing value) {
        this.sizing = value;
    }

    /**
     * Gets the value of the valuations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valuations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValuations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariableValuation }
     * 
     * 
     */
    public List<VariableValuation> getValuations() {
        if (valuations == null) {
            valuations = new ArrayList<VariableValuation>();
        }
        return this.valuations;
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Group)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Group that = ((Group) object);
        {
            Sizing lhsSizing;
            lhsSizing = this.getSizing();
            Sizing rhsSizing;
            rhsSizing = that.getSizing();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sizing", lhsSizing), LocatorUtils.property(thatLocator, "sizing", rhsSizing), lhsSizing, rhsSizing)) {
                return false;
            }
        }
        {
            List<VariableValuation> lhsValuations;
            lhsValuations = (((this.valuations!= null)&&(!this.valuations.isEmpty()))?this.getValuations():null);
            List<VariableValuation> rhsValuations;
            rhsValuations = (((that.valuations!= null)&&(!that.valuations.isEmpty()))?that.getValuations():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valuations", lhsValuations), LocatorUtils.property(thatLocator, "valuations", rhsValuations), lhsValuations, rhsValuations)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            Sizing theSizing;
            theSizing = this.getSizing();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sizing", theSizing), currentHashCode, theSizing);
        }
        {
            List<VariableValuation> theValuations;
            theValuations = (((this.valuations!= null)&&(!this.valuations.isEmpty()))?this.getValuations():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valuations", theValuations), currentHashCode, theValuations);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
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
        if (draftCopy instanceof Group) {
            final Group copy = ((Group) draftCopy);
            if (this.sizing!= null) {
                Sizing sourceSizing;
                sourceSizing = this.getSizing();
                Sizing copySizing = ((Sizing) strategy.copy(LocatorUtils.property(locator, "sizing", sourceSizing), sourceSizing));
                copy.setSizing(copySizing);
            } else {
                copy.sizing = null;
            }
            if ((this.valuations!= null)&&(!this.valuations.isEmpty())) {
                List<VariableValuation> sourceValuations;
                sourceValuations = (((this.valuations!= null)&&(!this.valuations.isEmpty()))?this.getValuations():null);
                @SuppressWarnings("unchecked")
                List<VariableValuation> copyValuations = ((List<VariableValuation> ) strategy.copy(LocatorUtils.property(locator, "valuations", sourceValuations), sourceValuations));
                copy.valuations = null;
                if (copyValuations!= null) {
                    List<VariableValuation> uniqueValuationsl = copy.getValuations();
                    uniqueValuationsl.addAll(copyValuations);
                }
            } else {
                copy.valuations = null;
            }
            if (this.name!= null) {
                String sourceName;
                sourceName = this.getName();
                String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Group();
    }

}
