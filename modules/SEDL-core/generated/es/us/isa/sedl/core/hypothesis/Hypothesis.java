//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:49:52 PM CET 
//


package es.us.isa.sedl.core.hypothesis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import es.us.isa.sedl.core.SedlEntity;
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
 * A scientific hypothesis is a testable assertion. We distinguish three different types of hypotheses: descriptive, associational, and differential. 
 * 
 * <p>Clase Java para Hypothesis complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Hypothesis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core}SedlEntity"&gt;
 *       &lt;attribute name="dependentVariable" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hypothesis")
@XmlSeeAlso({
    DescriptiveHypothesis.class,
    RelationalHypothesis.class
})
public abstract class Hypothesis
    extends SedlEntity
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "dependentVariable", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String dependentVariable;

    /**
     * Obtiene el valor de la propiedad dependentVariable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentVariable() {
        return dependentVariable;
    }

    /**
     * Define el valor de la propiedad dependentVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentVariable(String value) {
        this.dependentVariable = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Hypothesis)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Hypothesis that = ((Hypothesis) object);
        {
            String lhsDependentVariable;
            lhsDependentVariable = this.getDependentVariable();
            String rhsDependentVariable;
            rhsDependentVariable = that.getDependentVariable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dependentVariable", lhsDependentVariable), LocatorUtils.property(thatLocator, "dependentVariable", rhsDependentVariable), lhsDependentVariable, rhsDependentVariable)) {
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
            String theDependentVariable;
            theDependentVariable = this.getDependentVariable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dependentVariable", theDependentVariable), currentHashCode, theDependentVariable);
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
        super.copyTo(locator, target, strategy);
        if (target instanceof Hypothesis) {
            final Hypothesis copy = ((Hypothesis) target);
            if (this.dependentVariable!= null) {
                String sourceDependentVariable;
                sourceDependentVariable = this.getDependentVariable();
                String copyDependentVariable = ((String) strategy.copy(LocatorUtils.property(locator, "dependentVariable", sourceDependentVariable), sourceDependentVariable));
                copy.setDependentVariable(copyDependentVariable);
            } else {
                copy.dependentVariable = null;
            }
        }
        return target;
    }

}
