//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.10 a las 12:06:43 AM CEST 
//


package es.us.isa.sedl.core.design;

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
 * We support two different ways of specifying the experimental design: using a predefined experiment design (among a set of classical examples such as 
 * 				Factorials, Latin Squares, Hyper-latin cubes, etc.), or defining a cutom design.
 * 
 * <p>Clase Java para ExperimentalDesign complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExperimentalDesign"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="intendedAnalyses" type="{http://isa.us.es/sedl/core/design}AnalysisSpecificationGroup" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExperimentalDesign", propOrder = {
    "intendedAnalyses"
})
@XmlSeeAlso({
    FullySpecifiedExperimentalDesign.class,
    PredefinedExperimentalDesign.class
})
public abstract class ExperimentalDesign
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected List<AnalysisSpecificationGroup> intendedAnalyses;

    /**
     * Gets the value of the intendedAnalyses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intendedAnalyses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntendedAnalyses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnalysisSpecificationGroup }
     * 
     * 
     */
    public List<AnalysisSpecificationGroup> getIntendedAnalyses() {
        if (intendedAnalyses == null) {
            intendedAnalyses = new ArrayList<AnalysisSpecificationGroup>();
        }
        return this.intendedAnalyses;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ExperimentalDesign)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ExperimentalDesign that = ((ExperimentalDesign) object);
        {
            List<AnalysisSpecificationGroup> lhsIntendedAnalyses;
            lhsIntendedAnalyses = (((this.intendedAnalyses!= null)&&(!this.intendedAnalyses.isEmpty()))?this.getIntendedAnalyses():null);
            List<AnalysisSpecificationGroup> rhsIntendedAnalyses;
            rhsIntendedAnalyses = (((that.intendedAnalyses!= null)&&(!that.intendedAnalyses.isEmpty()))?that.getIntendedAnalyses():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intendedAnalyses", lhsIntendedAnalyses), LocatorUtils.property(thatLocator, "intendedAnalyses", rhsIntendedAnalyses), lhsIntendedAnalyses, rhsIntendedAnalyses)) {
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
            List<AnalysisSpecificationGroup> theIntendedAnalyses;
            theIntendedAnalyses = (((this.intendedAnalyses!= null)&&(!this.intendedAnalyses.isEmpty()))?this.getIntendedAnalyses():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intendedAnalyses", theIntendedAnalyses), currentHashCode, theIntendedAnalyses);
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        if (target instanceof ExperimentalDesign) {
            final ExperimentalDesign copy = ((ExperimentalDesign) target);
            if ((this.intendedAnalyses!= null)&&(!this.intendedAnalyses.isEmpty())) {
                List<AnalysisSpecificationGroup> sourceIntendedAnalyses;
                sourceIntendedAnalyses = (((this.intendedAnalyses!= null)&&(!this.intendedAnalyses.isEmpty()))?this.getIntendedAnalyses():null);
                @SuppressWarnings("unchecked")
                List<AnalysisSpecificationGroup> copyIntendedAnalyses = ((List<AnalysisSpecificationGroup> ) strategy.copy(LocatorUtils.property(locator, "intendedAnalyses", sourceIntendedAnalyses), sourceIntendedAnalyses));
                copy.intendedAnalyses = null;
                if (copyIntendedAnalyses!= null) {
                    List<AnalysisSpecificationGroup> uniqueIntendedAnalysesl = copy.getIntendedAnalyses();
                    uniqueIntendedAnalysesl.addAll(copyIntendedAnalyses);
                }
            } else {
                copy.intendedAnalyses = null;
            }
        }
        return target;
    }

}
