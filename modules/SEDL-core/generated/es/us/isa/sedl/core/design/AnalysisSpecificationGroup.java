//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.06.06 a las 11:25:05 AM CEST 
//


package es.us.isa.sedl.core.design;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Clase Java para AnalysisSpecificationGroup complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AnalysisSpecificationGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="analyses" type="{http://isa.us.es/sedl/core/design}AnalysisSpecification" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.eclipse.org/uml2/5.0.0/Types}String" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalysisSpecificationGroup", propOrder = {
    "analyses"
})
public class AnalysisSpecificationGroup
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected List<AnalysisSpecification> analyses;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the analyses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analyses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalyses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnalysisSpecification }
     * 
     * 
     */
    public List<AnalysisSpecification> getAnalyses() {
        if (analyses == null) {
            analyses = new ArrayList<AnalysisSpecification>();
        }
        return this.analyses;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AnalysisSpecificationGroup)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AnalysisSpecificationGroup that = ((AnalysisSpecificationGroup) object);
        {
            List<AnalysisSpecification> lhsAnalyses;
            lhsAnalyses = (((this.analyses!= null)&&(!this.analyses.isEmpty()))?this.getAnalyses():null);
            List<AnalysisSpecification> rhsAnalyses;
            rhsAnalyses = (((that.analyses!= null)&&(!that.analyses.isEmpty()))?that.getAnalyses():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "analyses", lhsAnalyses), LocatorUtils.property(thatLocator, "analyses", rhsAnalyses), lhsAnalyses, rhsAnalyses)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
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
            List<AnalysisSpecification> theAnalyses;
            theAnalyses = (((this.analyses!= null)&&(!this.analyses.isEmpty()))?this.getAnalyses():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "analyses", theAnalyses), currentHashCode, theAnalyses);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
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
        if (draftCopy instanceof AnalysisSpecificationGroup) {
            final AnalysisSpecificationGroup copy = ((AnalysisSpecificationGroup) draftCopy);
            if ((this.analyses!= null)&&(!this.analyses.isEmpty())) {
                List<AnalysisSpecification> sourceAnalyses;
                sourceAnalyses = (((this.analyses!= null)&&(!this.analyses.isEmpty()))?this.getAnalyses():null);
                @SuppressWarnings("unchecked")
                List<AnalysisSpecification> copyAnalyses = ((List<AnalysisSpecification> ) strategy.copy(LocatorUtils.property(locator, "analyses", sourceAnalyses), sourceAnalyses));
                copy.analyses = null;
                if (copyAnalyses!= null) {
                    List<AnalysisSpecification> uniqueAnalysesl = copy.getAnalyses();
                    uniqueAnalysesl.addAll(copyAnalyses);
                }
            } else {
                copy.analyses = null;
            }
            if (this.id!= null) {
                String sourceId;
                sourceId = this.getId();
                String copyId = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId));
                copy.setId(copyId);
            } else {
                copy.id = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AnalysisSpecificationGroup();
    }

}
