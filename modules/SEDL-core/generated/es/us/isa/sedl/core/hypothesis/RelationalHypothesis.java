//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.06 a las 05:46:41 PM CEST 
//


package es.us.isa.sedl.core.hypothesis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * A relational hypothesis describes a relation between two variables. It is worth noting that the use of variables instead of concepts allows the 
 * 				operationalization of the hypothesis (its situation in in the real world by specific rules of interpretation, that ultimately allow 
 * 				its testing by reference to the observable phenomena).
 * 
 * 
 * <p>Clase Java para RelationalHypothesis complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RelationalHypothesis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/hypothesis}Hypothesis"&gt;
 *       &lt;attribute name="independentVariables" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationalHypothesis")
@XmlSeeAlso({
    AssociationalHypothesis.class,
    DifferentialHypothesis.class
})
public abstract class RelationalHypothesis
    extends Hypothesis
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "independentVariables", required = true)
    protected List<String> independentVariables;

    /**
     * Gets the value of the independentVariables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the independentVariables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndependentVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIndependentVariables() {
        if (independentVariables == null) {
            independentVariables = new ArrayList<String>();
        }
        return this.independentVariables;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RelationalHypothesis)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RelationalHypothesis that = ((RelationalHypothesis) object);
        {
            List<String> lhsIndependentVariables;
            lhsIndependentVariables = (((this.independentVariables!= null)&&(!this.independentVariables.isEmpty()))?this.getIndependentVariables():null);
            List<String> rhsIndependentVariables;
            rhsIndependentVariables = (((that.independentVariables!= null)&&(!that.independentVariables.isEmpty()))?that.getIndependentVariables():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "independentVariables", lhsIndependentVariables), LocatorUtils.property(thatLocator, "independentVariables", rhsIndependentVariables), lhsIndependentVariables, rhsIndependentVariables)) {
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
            List<String> theIndependentVariables;
            theIndependentVariables = (((this.independentVariables!= null)&&(!this.independentVariables.isEmpty()))?this.getIndependentVariables():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "independentVariables", theIndependentVariables), currentHashCode, theIndependentVariables);
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
        if (target instanceof RelationalHypothesis) {
            final RelationalHypothesis copy = ((RelationalHypothesis) target);
            if ((this.independentVariables!= null)&&(!this.independentVariables.isEmpty())) {
                List<String> sourceIndependentVariables;
                sourceIndependentVariables = (((this.independentVariables!= null)&&(!this.independentVariables.isEmpty()))?this.getIndependentVariables():null);
                @SuppressWarnings("unchecked")
                List<String> copyIndependentVariables = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "independentVariables", sourceIndependentVariables), sourceIndependentVariables));
                copy.independentVariables = null;
                if (copyIndependentVariables!= null) {
                    List<String> uniqueIndependentVariablesl = copy.getIndependentVariables();
                    uniqueIndependentVariablesl.addAll(copyIndependentVariables);
                }
            } else {
                copy.independentVariables = null;
            }
        }
        return target;
    }

}
