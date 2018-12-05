//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.05 a las 03:15:37 PM CET 
//


package es.us.isa.sedl.core.design;

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
 * The population of an experiment is a description of the set of individual for which we
 * 				want to extract conclusions (the target population), an the set of individuals that we
 * 				 are going to use for sampling (the accesible population). The specific method used for
 * 				 selecting the actual set experimental individuals used is specified in the description
 * 				  of the population. Additionally, the population can contain a description of the
 * 				  experimental individuals (that can be people, algorithm runs, animals, objects or
 * 				  even computer programs).
 * 
 * <p>Clase Java para Population complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Population"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="samplingMethod" type="{http://isa.us.es/sedl/core/design}SamplingMethod"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="objectivePopulation" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="individualDescription" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="accesiblePopulation" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Population", propOrder = {
    "samplingMethod"
})
public class Population
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected SamplingMethod samplingMethod;
    @XmlAttribute(name = "objectivePopulation", required = true)
    protected String objectivePopulation;
    @XmlAttribute(name = "individualDescription", required = true)
    protected String individualDescription;
    @XmlAttribute(name = "accesiblePopulation", required = true)
    protected String accesiblePopulation;

    /**
     * Obtiene el valor de la propiedad samplingMethod.
     * 
     * @return
     *     possible object is
     *     {@link SamplingMethod }
     *     
     */
    public SamplingMethod getSamplingMethod() {
        return samplingMethod;
    }

    /**
     * Define el valor de la propiedad samplingMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link SamplingMethod }
     *     
     */
    public void setSamplingMethod(SamplingMethod value) {
        this.samplingMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad objectivePopulation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectivePopulation() {
        return objectivePopulation;
    }

    /**
     * Define el valor de la propiedad objectivePopulation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectivePopulation(String value) {
        this.objectivePopulation = value;
    }

    /**
     * Obtiene el valor de la propiedad individualDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualDescription() {
        return individualDescription;
    }

    /**
     * Define el valor de la propiedad individualDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualDescription(String value) {
        this.individualDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad accesiblePopulation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccesiblePopulation() {
        return accesiblePopulation;
    }

    /**
     * Define el valor de la propiedad accesiblePopulation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccesiblePopulation(String value) {
        this.accesiblePopulation = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Population)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Population that = ((Population) object);
        {
            SamplingMethod lhsSamplingMethod;
            lhsSamplingMethod = this.getSamplingMethod();
            SamplingMethod rhsSamplingMethod;
            rhsSamplingMethod = that.getSamplingMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "samplingMethod", lhsSamplingMethod), LocatorUtils.property(thatLocator, "samplingMethod", rhsSamplingMethod), lhsSamplingMethod, rhsSamplingMethod)) {
                return false;
            }
        }
        {
            String lhsObjectivePopulation;
            lhsObjectivePopulation = this.getObjectivePopulation();
            String rhsObjectivePopulation;
            rhsObjectivePopulation = that.getObjectivePopulation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objectivePopulation", lhsObjectivePopulation), LocatorUtils.property(thatLocator, "objectivePopulation", rhsObjectivePopulation), lhsObjectivePopulation, rhsObjectivePopulation)) {
                return false;
            }
        }
        {
            String lhsIndividualDescription;
            lhsIndividualDescription = this.getIndividualDescription();
            String rhsIndividualDescription;
            rhsIndividualDescription = that.getIndividualDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "individualDescription", lhsIndividualDescription), LocatorUtils.property(thatLocator, "individualDescription", rhsIndividualDescription), lhsIndividualDescription, rhsIndividualDescription)) {
                return false;
            }
        }
        {
            String lhsAccesiblePopulation;
            lhsAccesiblePopulation = this.getAccesiblePopulation();
            String rhsAccesiblePopulation;
            rhsAccesiblePopulation = that.getAccesiblePopulation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accesiblePopulation", lhsAccesiblePopulation), LocatorUtils.property(thatLocator, "accesiblePopulation", rhsAccesiblePopulation), lhsAccesiblePopulation, rhsAccesiblePopulation)) {
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
            SamplingMethod theSamplingMethod;
            theSamplingMethod = this.getSamplingMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "samplingMethod", theSamplingMethod), currentHashCode, theSamplingMethod);
        }
        {
            String theObjectivePopulation;
            theObjectivePopulation = this.getObjectivePopulation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objectivePopulation", theObjectivePopulation), currentHashCode, theObjectivePopulation);
        }
        {
            String theIndividualDescription;
            theIndividualDescription = this.getIndividualDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "individualDescription", theIndividualDescription), currentHashCode, theIndividualDescription);
        }
        {
            String theAccesiblePopulation;
            theAccesiblePopulation = this.getAccesiblePopulation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accesiblePopulation", theAccesiblePopulation), currentHashCode, theAccesiblePopulation);
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
        if (draftCopy instanceof Population) {
            final Population copy = ((Population) draftCopy);
            if (this.samplingMethod!= null) {
                SamplingMethod sourceSamplingMethod;
                sourceSamplingMethod = this.getSamplingMethod();
                SamplingMethod copySamplingMethod = ((SamplingMethod) strategy.copy(LocatorUtils.property(locator, "samplingMethod", sourceSamplingMethod), sourceSamplingMethod));
                copy.setSamplingMethod(copySamplingMethod);
            } else {
                copy.samplingMethod = null;
            }
            if (this.objectivePopulation!= null) {
                String sourceObjectivePopulation;
                sourceObjectivePopulation = this.getObjectivePopulation();
                String copyObjectivePopulation = ((String) strategy.copy(LocatorUtils.property(locator, "objectivePopulation", sourceObjectivePopulation), sourceObjectivePopulation));
                copy.setObjectivePopulation(copyObjectivePopulation);
            } else {
                copy.objectivePopulation = null;
            }
            if (this.individualDescription!= null) {
                String sourceIndividualDescription;
                sourceIndividualDescription = this.getIndividualDescription();
                String copyIndividualDescription = ((String) strategy.copy(LocatorUtils.property(locator, "individualDescription", sourceIndividualDescription), sourceIndividualDescription));
                copy.setIndividualDescription(copyIndividualDescription);
            } else {
                copy.individualDescription = null;
            }
            if (this.accesiblePopulation!= null) {
                String sourceAccesiblePopulation;
                sourceAccesiblePopulation = this.getAccesiblePopulation();
                String copyAccesiblePopulation = ((String) strategy.copy(LocatorUtils.property(locator, "accesiblePopulation", sourceAccesiblePopulation), sourceAccesiblePopulation));
                copy.setAccesiblePopulation(copyAccesiblePopulation);
            } else {
                copy.accesiblePopulation = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Population();
    }

}
