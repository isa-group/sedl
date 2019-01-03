//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:22:58 PM CET 
//


package es.us.isa.sedl.core.context;

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
 * <p>Clase Java para Person complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Person"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/context}Stakeholder"&gt;
 *       &lt;attribute name="organization"&gt;
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
@XmlType(name = "Person")
public class Person
    extends Stakeholder
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "organization")
    protected List<String> organization;

    /**
     * Gets the value of the organization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrganization() {
        if (organization == null) {
            organization = new ArrayList<String>();
        }
        return this.organization;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Person)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Person that = ((Person) object);
        {
            List<String> lhsOrganization;
            lhsOrganization = (((this.organization!= null)&&(!this.organization.isEmpty()))?this.getOrganization():null);
            List<String> rhsOrganization;
            rhsOrganization = (((that.organization!= null)&&(!that.organization.isEmpty()))?that.getOrganization():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "organization", lhsOrganization), LocatorUtils.property(thatLocator, "organization", rhsOrganization), lhsOrganization, rhsOrganization)) {
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
            List<String> theOrganization;
            theOrganization = (((this.organization!= null)&&(!this.organization.isEmpty()))?this.getOrganization():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "organization", theOrganization), currentHashCode, theOrganization);
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
        if (draftCopy instanceof Person) {
            final Person copy = ((Person) draftCopy);
            if ((this.organization!= null)&&(!this.organization.isEmpty())) {
                List<String> sourceOrganization;
                sourceOrganization = (((this.organization!= null)&&(!this.organization.isEmpty()))?this.getOrganization():null);
                @SuppressWarnings("unchecked")
                List<String> copyOrganization = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "organization", sourceOrganization), sourceOrganization));
                copy.organization = null;
                if (copyOrganization!= null) {
                    List<String> uniqueOrganizationl = copy.getOrganization();
                    uniqueOrganizationl.addAll(copyOrganization);
                }
            } else {
                copy.organization = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Person();
    }

}
