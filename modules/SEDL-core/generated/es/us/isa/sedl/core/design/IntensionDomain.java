//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:44:54 PM CET 
//


package es.us.isa.sedl.core.design;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Clase Java para IntensionDomain complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IntensionDomain"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/design}Domain"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="constraint" type="{http://isa.us.es/sedl/core/design}Constraint" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntensionDomain", propOrder = {
    "constraint"
})
public class IntensionDomain
    extends AbstractIntensionDomain
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected List<Constraint> constraint;

    /**
     * Gets the value of the constraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Constraint }
     * 
     * 
     */
    public List<Constraint> getConstraint() {
        if (constraint == null) {
            constraint = new ArrayList<Constraint>();
        }
        return this.constraint;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof IntensionDomain)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final IntensionDomain that = ((IntensionDomain) object);
        {
            List<Constraint> lhsConstraint;
            lhsConstraint = (((this.constraint!= null)&&(!this.constraint.isEmpty()))?this.getConstraint():null);
            List<Constraint> rhsConstraint;
            rhsConstraint = (((that.constraint!= null)&&(!that.constraint.isEmpty()))?that.getConstraint():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constraint", lhsConstraint), LocatorUtils.property(thatLocator, "constraint", rhsConstraint), lhsConstraint, rhsConstraint)) {
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
            List<Constraint> theConstraint;
            theConstraint = (((this.constraint!= null)&&(!this.constraint.isEmpty()))?this.getConstraint():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "constraint", theConstraint), currentHashCode, theConstraint);
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
        if (draftCopy instanceof IntensionDomain) {
            final IntensionDomain copy = ((IntensionDomain) draftCopy);
            if ((this.constraint!= null)&&(!this.constraint.isEmpty())) {
                List<Constraint> sourceConstraint;
                sourceConstraint = (((this.constraint!= null)&&(!this.constraint.isEmpty()))?this.getConstraint():null);
                @SuppressWarnings("unchecked")
                List<Constraint> copyConstraint = ((List<Constraint> ) strategy.copy(LocatorUtils.property(locator, "constraint", sourceConstraint), sourceConstraint));
                copy.constraint = null;
                if (copyConstraint!= null) {
                    List<Constraint> uniqueConstraintl = copy.getConstraint();
                    uniqueConstraintl.addAll(copyConstraint);
                }
            } else {
                copy.constraint = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new IntensionDomain();
    }

}
