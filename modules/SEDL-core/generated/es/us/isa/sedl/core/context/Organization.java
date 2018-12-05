//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.05 a las 03:15:37 PM CET 
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
 *         &lt;element name="department" type="{http://isa.us.es/sedl/core/context}Organization" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "department"
})
public class Organization
    extends Stakeholder
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected List<Organization> department;

    /**
     * Gets the value of the department property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the department property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organization }
     * 
     * 
     */
    public List<Organization> getDepartment() {
        if (department == null) {
            department = new ArrayList<Organization>();
        }
        return this.department;
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
            List<Organization> lhsDepartment;
            lhsDepartment = (((this.department!= null)&&(!this.department.isEmpty()))?this.getDepartment():null);
            List<Organization> rhsDepartment;
            rhsDepartment = (((that.department!= null)&&(!that.department.isEmpty()))?that.getDepartment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "department", lhsDepartment), LocatorUtils.property(thatLocator, "department", rhsDepartment), lhsDepartment, rhsDepartment)) {
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
            List<Organization> theDepartment;
            theDepartment = (((this.department!= null)&&(!this.department.isEmpty()))?this.getDepartment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "department", theDepartment), currentHashCode, theDepartment);
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
            if ((this.department!= null)&&(!this.department.isEmpty())) {
                List<Organization> sourceDepartment;
                sourceDepartment = (((this.department!= null)&&(!this.department.isEmpty()))?this.getDepartment():null);
                @SuppressWarnings("unchecked")
                List<Organization> copyDepartment = ((List<Organization> ) strategy.copy(LocatorUtils.property(locator, "department", sourceDepartment), sourceDepartment));
                copy.department = null;
                if (copyDepartment!= null) {
                    List<Organization> uniqueDepartmentl = copy.getDepartment();
                    uniqueDepartmentl.addAll(copyDepartment);
                }
            } else {
                copy.department = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Organization();
    }

}
