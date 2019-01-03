//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:22:58 PM CET 
//


package es.us.isa.sedl.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * The SEDLBase type is the base of all main types in SEDL. It serves as a container for the annotation of any part of the experiment description.
 * 
 * 
 * <p>Clase Java para SedlBase complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SedlBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="annotations" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SedlBase", propOrder = {
    "notes",
    "annotations"
})
@XmlSeeAlso({
    SedlEntity.class
})
public class SedlBase
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(nillable = true)
    protected List<String> notes;
    @XmlElement(nillable = true)
    protected List<String> annotations;

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNotes() {
        if (notes == null) {
            notes = new ArrayList<String>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the annotations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAnnotations() {
        if (annotations == null) {
            annotations = new ArrayList<String>();
        }
        return this.annotations;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SedlBase)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SedlBase that = ((SedlBase) object);
        {
            List<String> lhsNotes;
            lhsNotes = (((this.notes!= null)&&(!this.notes.isEmpty()))?this.getNotes():null);
            List<String> rhsNotes;
            rhsNotes = (((that.notes!= null)&&(!that.notes.isEmpty()))?that.getNotes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notes", lhsNotes), LocatorUtils.property(thatLocator, "notes", rhsNotes), lhsNotes, rhsNotes)) {
                return false;
            }
        }
        {
            List<String> lhsAnnotations;
            lhsAnnotations = (((this.annotations!= null)&&(!this.annotations.isEmpty()))?this.getAnnotations():null);
            List<String> rhsAnnotations;
            rhsAnnotations = (((that.annotations!= null)&&(!that.annotations.isEmpty()))?that.getAnnotations():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "annotations", lhsAnnotations), LocatorUtils.property(thatLocator, "annotations", rhsAnnotations), lhsAnnotations, rhsAnnotations)) {
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
            List<String> theNotes;
            theNotes = (((this.notes!= null)&&(!this.notes.isEmpty()))?this.getNotes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notes", theNotes), currentHashCode, theNotes);
        }
        {
            List<String> theAnnotations;
            theAnnotations = (((this.annotations!= null)&&(!this.annotations.isEmpty()))?this.getAnnotations():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "annotations", theAnnotations), currentHashCode, theAnnotations);
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
        if (draftCopy instanceof SedlBase) {
            final SedlBase copy = ((SedlBase) draftCopy);
            if ((this.notes!= null)&&(!this.notes.isEmpty())) {
                List<String> sourceNotes;
                sourceNotes = (((this.notes!= null)&&(!this.notes.isEmpty()))?this.getNotes():null);
                @SuppressWarnings("unchecked")
                List<String> copyNotes = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "notes", sourceNotes), sourceNotes));
                copy.notes = null;
                if (copyNotes!= null) {
                    List<String> uniqueNotesl = copy.getNotes();
                    uniqueNotesl.addAll(copyNotes);
                }
            } else {
                copy.notes = null;
            }
            if ((this.annotations!= null)&&(!this.annotations.isEmpty())) {
                List<String> sourceAnnotations;
                sourceAnnotations = (((this.annotations!= null)&&(!this.annotations.isEmpty()))?this.getAnnotations():null);
                @SuppressWarnings("unchecked")
                List<String> copyAnnotations = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "annotations", sourceAnnotations), sourceAnnotations));
                copy.annotations = null;
                if (copyAnnotations!= null) {
                    List<String> uniqueAnnotationsl = copy.getAnnotations();
                    uniqueAnnotationsl.addAll(copyAnnotations);
                }
            } else {
                copy.annotations = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SedlBase();
    }

}
