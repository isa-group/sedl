//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:44:54 PM CET 
//


package es.us.isa.sedl.core.hypothesis;

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
 * A descriptive hypothesis just describes the properties of the concepts it refers to.
 *  In our context, a descriptive hypothesis is defined based on an assertion on the population.
 * This assertion can be expressed in an informal way as a natural language description of 
 * the hypothesis of the experiment, or usen a formal assertion such as an statistical hypothesis..
 * 
 * <p>Clase Java para DescriptiveHypothesis complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DescriptiveHypothesis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/hypothesis}Hypothesis"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assertion" type="{http://isa.us.es/sedl/core/hypothesis}Assertion"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescriptiveHypothesis", propOrder = {
    "assertion"
})
public class DescriptiveHypothesis
    extends Hypothesis
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected Assertion assertion;

    /**
     * Obtiene el valor de la propiedad assertion.
     * 
     * @return
     *     possible object is
     *     {@link Assertion }
     *     
     */
    public Assertion getAssertion() {
        return assertion;
    }

    /**
     * Define el valor de la propiedad assertion.
     * 
     * @param value
     *     allowed object is
     *     {@link Assertion }
     *     
     */
    public void setAssertion(Assertion value) {
        this.assertion = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescriptiveHypothesis)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DescriptiveHypothesis that = ((DescriptiveHypothesis) object);
        {
            Assertion lhsAssertion;
            lhsAssertion = this.getAssertion();
            Assertion rhsAssertion;
            rhsAssertion = that.getAssertion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assertion", lhsAssertion), LocatorUtils.property(thatLocator, "assertion", rhsAssertion), lhsAssertion, rhsAssertion)) {
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
            Assertion theAssertion;
            theAssertion = this.getAssertion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assertion", theAssertion), currentHashCode, theAssertion);
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
        if (draftCopy instanceof DescriptiveHypothesis) {
            final DescriptiveHypothesis copy = ((DescriptiveHypothesis) draftCopy);
            if (this.assertion!= null) {
                Assertion sourceAssertion;
                sourceAssertion = this.getAssertion();
                Assertion copyAssertion = ((Assertion) strategy.copy(LocatorUtils.property(locator, "assertion", sourceAssertion), sourceAssertion));
                copy.setAssertion(copyAssertion);
            } else {
                copy.assertion = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DescriptiveHypothesis();
    }

}
