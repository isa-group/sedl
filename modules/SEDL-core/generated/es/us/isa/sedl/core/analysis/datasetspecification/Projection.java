//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:44:54 PM CET 
//


package es.us.isa.sedl.core.analysis.datasetspecification;

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
 * <p>Clase Java para Projection complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Projection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="projectedVariables" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Projection")
@XmlSeeAlso({
    GroupingProjection.class
})
public class Projection
    extends AbstractProjection
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "projectedVariables", required = true)
    protected List<String> projectedVariables;

    /**
     * Gets the value of the projectedVariables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectedVariables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectedVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProjectedVariables() {
        if (projectedVariables == null) {
            projectedVariables = new ArrayList<String>();
        }
        return this.projectedVariables;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Projection)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Projection that = ((Projection) object);
        {
            List<String> lhsProjectedVariables;
            lhsProjectedVariables = (((this.projectedVariables!= null)&&(!this.projectedVariables.isEmpty()))?this.getProjectedVariables():null);
            List<String> rhsProjectedVariables;
            rhsProjectedVariables = (((that.projectedVariables!= null)&&(!that.projectedVariables.isEmpty()))?that.getProjectedVariables():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "projectedVariables", lhsProjectedVariables), LocatorUtils.property(thatLocator, "projectedVariables", rhsProjectedVariables), lhsProjectedVariables, rhsProjectedVariables)) {
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
            List<String> theProjectedVariables;
            theProjectedVariables = (((this.projectedVariables!= null)&&(!this.projectedVariables.isEmpty()))?this.getProjectedVariables():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "projectedVariables", theProjectedVariables), currentHashCode, theProjectedVariables);
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
        if (draftCopy instanceof Projection) {
            final Projection copy = ((Projection) draftCopy);
            if ((this.projectedVariables!= null)&&(!this.projectedVariables.isEmpty())) {
                List<String> sourceProjectedVariables;
                sourceProjectedVariables = (((this.projectedVariables!= null)&&(!this.projectedVariables.isEmpty()))?this.getProjectedVariables():null);
                @SuppressWarnings("unchecked")
                List<String> copyProjectedVariables = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "projectedVariables", sourceProjectedVariables), sourceProjectedVariables));
                copy.projectedVariables = null;
                if (copyProjectedVariables!= null) {
                    List<String> uniqueProjectedVariablesl = copy.getProjectedVariables();
                    uniqueProjectedVariablesl.addAll(copyProjectedVariables);
                }
            } else {
                copy.projectedVariables = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Projection();
    }

}
