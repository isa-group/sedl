//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.06 a las 05:46:41 PM CEST 
//


package es.us.isa.sedl.core.context;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.us.isa.sedl.core.SEDLEntity;
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
 * The experimental context allows to describe the people, organizations, and projects involved in the experiment an their roles.
 * 
 * 
 * <p>Clase Java para Context complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Context"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core}SEDLEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="projects" type="{http://isa.us.es/sedl/core/context}Project" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="organization" type="{http://isa.us.es/sedl/core/context}Organization" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="people" type="{http://isa.us.es/sedl/core/context}People"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Context", propOrder = {
    "projects",
    "organization",
    "people"
})
public class Context
    extends SEDLEntity
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected List<Project> projects;
    protected List<Organization> organization;
    @XmlElement(required = true)
    protected People people;

    /**
     * Gets the value of the projects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Project }
     * 
     * 
     */
    public List<Project> getProjects() {
        if (projects == null) {
            projects = new ArrayList<Project>();
        }
        return this.projects;
    }

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
     * {@link Organization }
     * 
     * 
     */
    public List<Organization> getOrganization() {
        if (organization == null) {
            organization = new ArrayList<Organization>();
        }
        return this.organization;
    }

    /**
     * Obtiene el valor de la propiedad people.
     * 
     * @return
     *     possible object is
     *     {@link People }
     *     
     */
    public People getPeople() {
        return people;
    }

    /**
     * Define el valor de la propiedad people.
     * 
     * @param value
     *     allowed object is
     *     {@link People }
     *     
     */
    public void setPeople(People value) {
        this.people = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Context)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Context that = ((Context) object);
        {
            List<Project> lhsProjects;
            lhsProjects = (((this.projects!= null)&&(!this.projects.isEmpty()))?this.getProjects():null);
            List<Project> rhsProjects;
            rhsProjects = (((that.projects!= null)&&(!that.projects.isEmpty()))?that.getProjects():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "projects", lhsProjects), LocatorUtils.property(thatLocator, "projects", rhsProjects), lhsProjects, rhsProjects)) {
                return false;
            }
        }
        {
            List<Organization> lhsOrganization;
            lhsOrganization = (((this.organization!= null)&&(!this.organization.isEmpty()))?this.getOrganization():null);
            List<Organization> rhsOrganization;
            rhsOrganization = (((that.organization!= null)&&(!that.organization.isEmpty()))?that.getOrganization():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "organization", lhsOrganization), LocatorUtils.property(thatLocator, "organization", rhsOrganization), lhsOrganization, rhsOrganization)) {
                return false;
            }
        }
        {
            People lhsPeople;
            lhsPeople = this.getPeople();
            People rhsPeople;
            rhsPeople = that.getPeople();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "people", lhsPeople), LocatorUtils.property(thatLocator, "people", rhsPeople), lhsPeople, rhsPeople)) {
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
            List<Project> theProjects;
            theProjects = (((this.projects!= null)&&(!this.projects.isEmpty()))?this.getProjects():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "projects", theProjects), currentHashCode, theProjects);
        }
        {
            List<Organization> theOrganization;
            theOrganization = (((this.organization!= null)&&(!this.organization.isEmpty()))?this.getOrganization():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "organization", theOrganization), currentHashCode, theOrganization);
        }
        {
            People thePeople;
            thePeople = this.getPeople();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "people", thePeople), currentHashCode, thePeople);
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
        if (draftCopy instanceof Context) {
            final Context copy = ((Context) draftCopy);
            if ((this.projects!= null)&&(!this.projects.isEmpty())) {
                List<Project> sourceProjects;
                sourceProjects = (((this.projects!= null)&&(!this.projects.isEmpty()))?this.getProjects():null);
                @SuppressWarnings("unchecked")
                List<Project> copyProjects = ((List<Project> ) strategy.copy(LocatorUtils.property(locator, "projects", sourceProjects), sourceProjects));
                copy.projects = null;
                if (copyProjects!= null) {
                    List<Project> uniqueProjectsl = copy.getProjects();
                    uniqueProjectsl.addAll(copyProjects);
                }
            } else {
                copy.projects = null;
            }
            if ((this.organization!= null)&&(!this.organization.isEmpty())) {
                List<Organization> sourceOrganization;
                sourceOrganization = (((this.organization!= null)&&(!this.organization.isEmpty()))?this.getOrganization():null);
                @SuppressWarnings("unchecked")
                List<Organization> copyOrganization = ((List<Organization> ) strategy.copy(LocatorUtils.property(locator, "organization", sourceOrganization), sourceOrganization));
                copy.organization = null;
                if (copyOrganization!= null) {
                    List<Organization> uniqueOrganizationl = copy.getOrganization();
                    uniqueOrganizationl.addAll(copyOrganization);
                }
            } else {
                copy.organization = null;
            }
            if (this.people!= null) {
                People sourcePeople;
                sourcePeople = this.getPeople();
                People copyPeople = ((People) strategy.copy(LocatorUtils.property(locator, "people", sourcePeople), sourcePeople));
                copy.setPeople(copyPeople);
            } else {
                copy.people = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Context();
    }

}
