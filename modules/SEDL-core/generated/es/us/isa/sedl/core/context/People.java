//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.23 a las 02:44:29 PM CEST 
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
 * <p>Clase Java para People complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="People"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="person" type="{http://isa.us.es/sedl/core/context}Person" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "People", propOrder = {
    "person"
})
public class People
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected List<Person> person;

    /**
     * Gets the value of the person property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the person property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Person }
     * 
     * 
     */
    public List<Person> getPerson() {
        if (person == null) {
            person = new ArrayList<Person>();
        }
        return this.person;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof People)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final People that = ((People) object);
        {
            List<Person> lhsPerson;
            lhsPerson = (((this.person!= null)&&(!this.person.isEmpty()))?this.getPerson():null);
            List<Person> rhsPerson;
            rhsPerson = (((that.person!= null)&&(!that.person.isEmpty()))?that.getPerson():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "person", lhsPerson), LocatorUtils.property(thatLocator, "person", rhsPerson), lhsPerson, rhsPerson)) {
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
            List<Person> thePerson;
            thePerson = (((this.person!= null)&&(!this.person.isEmpty()))?this.getPerson():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "person", thePerson), currentHashCode, thePerson);
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
        if (draftCopy instanceof People) {
            final People copy = ((People) draftCopy);
            if ((this.person!= null)&&(!this.person.isEmpty())) {
                List<Person> sourcePerson;
                sourcePerson = (((this.person!= null)&&(!this.person.isEmpty()))?this.getPerson():null);
                @SuppressWarnings("unchecked")
                List<Person> copyPerson = ((List<Person> ) strategy.copy(LocatorUtils.property(locator, "person", sourcePerson), sourcePerson));
                copy.person = null;
                if (copyPerson!= null) {
                    List<Person> uniquePersonl = copy.getPerson();
                    uniquePersonl.addAll(copyPerson);
                }
            } else {
                copy.person = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new People();
    }

}
