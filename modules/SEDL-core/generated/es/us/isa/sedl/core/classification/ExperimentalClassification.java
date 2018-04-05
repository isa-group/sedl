//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.05 a las 07:27:38 PM CEST 
//


package es.us.isa.sedl.core.classification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Clase Java para ExperimentalClassification complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExperimentalClassification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="terms" type="{http://www.eclipse.org/uml2/5.0.0/Types}String" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="experimentalClassificationType" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExperimentalClassification", propOrder = {
    "terms"
})
public class ExperimentalClassification
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true, nillable = true)
    protected List<String> terms;
    @XmlAttribute(name = "experimentalClassificationType", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String experimentalClassificationType;

    /**
     * Gets the value of the terms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTerms() {
        if (terms == null) {
            terms = new ArrayList<String>();
        }
        return this.terms;
    }

    /**
     * Obtiene el valor de la propiedad experimentalClassificationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperimentalClassificationType() {
        return experimentalClassificationType;
    }

    /**
     * Define el valor de la propiedad experimentalClassificationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperimentalClassificationType(String value) {
        this.experimentalClassificationType = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ExperimentalClassification)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ExperimentalClassification that = ((ExperimentalClassification) object);
        {
            List<String> lhsTerms;
            lhsTerms = (((this.terms!= null)&&(!this.terms.isEmpty()))?this.getTerms():null);
            List<String> rhsTerms;
            rhsTerms = (((that.terms!= null)&&(!that.terms.isEmpty()))?that.getTerms():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "terms", lhsTerms), LocatorUtils.property(thatLocator, "terms", rhsTerms), lhsTerms, rhsTerms)) {
                return false;
            }
        }
        {
            String lhsExperimentalClassificationType;
            lhsExperimentalClassificationType = this.getExperimentalClassificationType();
            String rhsExperimentalClassificationType;
            rhsExperimentalClassificationType = that.getExperimentalClassificationType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "experimentalClassificationType", lhsExperimentalClassificationType), LocatorUtils.property(thatLocator, "experimentalClassificationType", rhsExperimentalClassificationType), lhsExperimentalClassificationType, rhsExperimentalClassificationType)) {
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
            List<String> theTerms;
            theTerms = (((this.terms!= null)&&(!this.terms.isEmpty()))?this.getTerms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "terms", theTerms), currentHashCode, theTerms);
        }
        {
            String theExperimentalClassificationType;
            theExperimentalClassificationType = this.getExperimentalClassificationType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "experimentalClassificationType", theExperimentalClassificationType), currentHashCode, theExperimentalClassificationType);
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
        if (draftCopy instanceof ExperimentalClassification) {
            final ExperimentalClassification copy = ((ExperimentalClassification) draftCopy);
            if ((this.terms!= null)&&(!this.terms.isEmpty())) {
                List<String> sourceTerms;
                sourceTerms = (((this.terms!= null)&&(!this.terms.isEmpty()))?this.getTerms():null);
                @SuppressWarnings("unchecked")
                List<String> copyTerms = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "terms", sourceTerms), sourceTerms));
                copy.terms = null;
                if (copyTerms!= null) {
                    List<String> uniqueTermsl = copy.getTerms();
                    uniqueTermsl.addAll(copyTerms);
                }
            } else {
                copy.terms = null;
            }
            if (this.experimentalClassificationType!= null) {
                String sourceExperimentalClassificationType;
                sourceExperimentalClassificationType = this.getExperimentalClassificationType();
                String copyExperimentalClassificationType = ((String) strategy.copy(LocatorUtils.property(locator, "experimentalClassificationType", sourceExperimentalClassificationType), sourceExperimentalClassificationType));
                copy.setExperimentalClassificationType(copyExperimentalClassificationType);
            } else {
                copy.experimentalClassificationType = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ExperimentalClassification();
    }

}
