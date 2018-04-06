//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.06 a las 05:46:41 PM CEST 
//


package es.us.isa.sedl.core.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * In SEDL an experimental variable always has a set of 
 * 				levels, that are the values that the variable could possibly have in the context
 * 				of the experiment. The set of levels of an experimental variable can be described by 
 * 				extension (i.e. by enumeting each possible value), or by intension (i.e. defining a
 * 				set of constraints tha determine the set of values, e.g. its maximum and minimum value).
 * 				Moreover, in SEDL an experimental variable has always a name (that must be unique in the
 * 				 experiment), a kind that can be Nominal (e.g. X,Y,Z), Ordinal (e.g. horrible, bad, fair,
 * 				  good), and Scalar (e.g. 1.1, 3, 5, 2.7), and a role.
 * 				 The role of a variable can be: Dependent; Independent-Active; Independent-Attributive; 
 * 				 and Extraneous.
 * 				Additionally, experimental variables can have an optional data type (that can be any
 * 				 simple XML-Schema type such as string, integer, etc.).
 * 
 * <p>Clase Java para Variable complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Variable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="domain" type="{http://isa.us.es/sedl/core/design}Domain"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="kind" use="required" type="{http://isa.us.es/sedl/core/design}VariableKind" /&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Variable", propOrder = {
    "domain"
})
@XmlSeeAlso({
    Outcome.class,
    Factor.class,
    Nuisance.class
})
public abstract class Variable
    extends AbstractVariable
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected Domain domain;
    @XmlAttribute(name = "kind", required = true)
    protected VariableKind kind;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "units")
    protected String units;

    /**
     * Obtiene el valor de la propiedad domain.
     * 
     * @return
     *     possible object is
     *     {@link Domain }
     *     
     */
    public Domain getDomain() {
        return domain;
    }

    /**
     * Define el valor de la propiedad domain.
     * 
     * @param value
     *     allowed object is
     *     {@link Domain }
     *     
     */
    public void setDomain(Domain value) {
        this.domain = value;
    }

    /**
     * Obtiene el valor de la propiedad kind.
     * 
     * @return
     *     possible object is
     *     {@link VariableKind }
     *     
     */
    public VariableKind getKind() {
        return kind;
    }

    /**
     * Define el valor de la propiedad kind.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableKind }
     *     
     */
    public void setKind(VariableKind value) {
        this.kind = value;
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
     * Obtiene el valor de la propiedad units.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Define el valor de la propiedad units.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Variable)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Variable that = ((Variable) object);
        {
            Domain lhsDomain;
            lhsDomain = this.getDomain();
            Domain rhsDomain;
            rhsDomain = that.getDomain();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "domain", lhsDomain), LocatorUtils.property(thatLocator, "domain", rhsDomain), lhsDomain, rhsDomain)) {
                return false;
            }
        }
        {
            VariableKind lhsKind;
            lhsKind = this.getKind();
            VariableKind rhsKind;
            rhsKind = that.getKind();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kind", lhsKind), LocatorUtils.property(thatLocator, "kind", rhsKind), lhsKind, rhsKind)) {
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
            String lhsUnits;
            lhsUnits = this.getUnits();
            String rhsUnits;
            rhsUnits = that.getUnits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "units", lhsUnits), LocatorUtils.property(thatLocator, "units", rhsUnits), lhsUnits, rhsUnits)) {
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
            Domain theDomain;
            theDomain = this.getDomain();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "domain", theDomain), currentHashCode, theDomain);
        }
        {
            VariableKind theKind;
            theKind = this.getKind();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kind", theKind), currentHashCode, theKind);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theUnits;
            theUnits = this.getUnits();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "units", theUnits), currentHashCode, theUnits);
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        if (target instanceof Variable) {
            final Variable copy = ((Variable) target);
            if (this.domain!= null) {
                Domain sourceDomain;
                sourceDomain = this.getDomain();
                Domain copyDomain = ((Domain) strategy.copy(LocatorUtils.property(locator, "domain", sourceDomain), sourceDomain));
                copy.setDomain(copyDomain);
            } else {
                copy.domain = null;
            }
            if (this.kind!= null) {
                VariableKind sourceKind;
                sourceKind = this.getKind();
                VariableKind copyKind = ((VariableKind) strategy.copy(LocatorUtils.property(locator, "kind", sourceKind), sourceKind));
                copy.setKind(copyKind);
            } else {
                copy.kind = null;
            }
            if (this.name!= null) {
                String sourceName;
                sourceName = this.getName();
                String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
            if (this.units!= null) {
                String sourceUnits;
                sourceUnits = this.getUnits();
                String copyUnits = ((String) strategy.copy(LocatorUtils.property(locator, "units", sourceUnits), sourceUnits));
                copy.setUnits(copyUnits);
            } else {
                copy.units = null;
            }
        }
        return target;
    }

}
