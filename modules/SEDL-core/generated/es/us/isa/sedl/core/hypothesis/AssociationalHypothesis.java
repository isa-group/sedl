//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:22:58 PM CET 
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
 * An associational hypothesis states that the values of a set D of variables depends on the values of a different set of variables I according
 * 				to a specific relationship (usually expressed as a mathematical expression).
 * 
 * <p>Clase Java para AssociationalHypothesis complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AssociationalHypothesis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/hypothesis}RelationalHypothesis"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relation" type="{http://isa.us.es/sedl/core/hypothesis}RelationSpecification"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociationalHypothesis", propOrder = {
    "relation"
})
public class AssociationalHypothesis
    extends RelationalHypothesis
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected RelationSpecification relation;

    /**
     * Obtiene el valor de la propiedad relation.
     * 
     * @return
     *     possible object is
     *     {@link RelationSpecification }
     *     
     */
    public RelationSpecification getRelation() {
        return relation;
    }

    /**
     * Define el valor de la propiedad relation.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationSpecification }
     *     
     */
    public void setRelation(RelationSpecification value) {
        this.relation = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AssociationalHypothesis)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AssociationalHypothesis that = ((AssociationalHypothesis) object);
        {
            RelationSpecification lhsRelation;
            lhsRelation = this.getRelation();
            RelationSpecification rhsRelation;
            rhsRelation = that.getRelation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relation", lhsRelation), LocatorUtils.property(thatLocator, "relation", rhsRelation), lhsRelation, rhsRelation)) {
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
            RelationSpecification theRelation;
            theRelation = this.getRelation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relation", theRelation), currentHashCode, theRelation);
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
        if (draftCopy instanceof AssociationalHypothesis) {
            final AssociationalHypothesis copy = ((AssociationalHypothesis) draftCopy);
            if (this.relation!= null) {
                RelationSpecification sourceRelation;
                sourceRelation = this.getRelation();
                RelationSpecification copyRelation = ((RelationSpecification) strategy.copy(LocatorUtils.property(locator, "relation", sourceRelation), sourceRelation));
                copy.setRelation(copyRelation);
            } else {
                copy.relation = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AssociationalHypothesis();
    }

}
