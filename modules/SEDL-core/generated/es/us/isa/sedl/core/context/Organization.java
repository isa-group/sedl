//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:49:52 PM CET 
//


package es.us.isa.sedl.core.context;

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
 * Organizations are a specific type of stakeholder that can contain a set or members (persons) and other organizations.
 * 
 * 
 * <p>Clase Java para Organization complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Organization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/context}Stakeholder"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="departments" type="{http://isa.us.es/sedl/core/context}Organization" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", propOrder = {
    "departments"
})
public class Organization
    extends Stakeholder
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected List<Organization> departments;

    /**
     * Gets the value of the departments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the departments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organization }
     * 
     * 
     */
    public List<Organization> getDepartments() {
        if (departments == null) {
            departments = new ArrayList<Organization>();
        }
        return this.departments;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Organization)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Organization that = ((Organization) object);
        {
            List<Organization> lhsDepartments;
            lhsDepartments = (((this.departments!= null)&&(!this.departments.isEmpty()))?this.getDepartments():null);
            List<Organization> rhsDepartments;
            rhsDepartments = (((that.departments!= null)&&(!that.departments.isEmpty()))?that.getDepartments():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "departments", lhsDepartments), LocatorUtils.property(thatLocator, "departments", rhsDepartments), lhsDepartments, rhsDepartments)) {
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
            List<Organization> theDepartments;
            theDepartments = (((this.departments!= null)&&(!this.departments.isEmpty()))?this.getDepartments():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "departments", theDepartments), currentHashCode, theDepartments);
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
        if (draftCopy instanceof Organization) {
            final Organization copy = ((Organization) draftCopy);
            if ((this.departments!= null)&&(!this.departments.isEmpty())) {
                List<Organization> sourceDepartments;
                sourceDepartments = (((this.departments!= null)&&(!this.departments.isEmpty()))?this.getDepartments():null);
                @SuppressWarnings("unchecked")
                List<Organization> copyDepartments = ((List<Organization> ) strategy.copy(LocatorUtils.property(locator, "departments", sourceDepartments), sourceDepartments));
                copy.departments = null;
                if (copyDepartments!= null) {
                    List<Organization> uniqueDepartmentsl = copy.getDepartments();
                    uniqueDepartmentsl.addAll(copyDepartments);
                }
            } else {
                copy.departments = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Organization();
    }

}
