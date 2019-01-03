//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:22:58 PM CET 
//


package es.us.isa.sedl.core.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * Variable valuations assign a specific level to the value of a variable.
 * 
 * <p>Clase Java para VariableValuation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VariableValuation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="level" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="variable" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableValuation")
public class VariableValuation
    extends AbstractVariableValuation
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "level", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String level;
    @XmlAttribute(name = "variable", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String variable;

    /**
     * Obtiene el valor de la propiedad level.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Define el valor de la propiedad level.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Obtiene el valor de la propiedad variable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariable() {
        return variable;
    }

    /**
     * Define el valor de la propiedad variable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariable(String value) {
        this.variable = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof VariableValuation)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VariableValuation that = ((VariableValuation) object);
        {
            String lhsLevel;
            lhsLevel = this.getLevel();
            String rhsLevel;
            rhsLevel = that.getLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "level", lhsLevel), LocatorUtils.property(thatLocator, "level", rhsLevel), lhsLevel, rhsLevel)) {
                return false;
            }
        }
        {
            String lhsVariable;
            lhsVariable = this.getVariable();
            String rhsVariable;
            rhsVariable = that.getVariable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "variable", lhsVariable), LocatorUtils.property(thatLocator, "variable", rhsVariable), lhsVariable, rhsVariable)) {
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
            String theLevel;
            theLevel = this.getLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "level", theLevel), currentHashCode, theLevel);
        }
        {
            String theVariable;
            theVariable = this.getVariable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "variable", theVariable), currentHashCode, theVariable);
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
        if (draftCopy instanceof VariableValuation) {
            final VariableValuation copy = ((VariableValuation) draftCopy);
            if (this.level!= null) {
                String sourceLevel;
                sourceLevel = this.getLevel();
                String copyLevel = ((String) strategy.copy(LocatorUtils.property(locator, "level", sourceLevel), sourceLevel));
                copy.setLevel(copyLevel);
            } else {
                copy.level = null;
            }
            if (this.variable!= null) {
                String sourceVariable;
                sourceVariable = this.getVariable();
                String copyVariable = ((String) strategy.copy(LocatorUtils.property(locator, "variable", sourceVariable), sourceVariable));
                copy.setVariable(copyVariable);
            } else {
                copy.variable = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new VariableValuation();
    }

}
