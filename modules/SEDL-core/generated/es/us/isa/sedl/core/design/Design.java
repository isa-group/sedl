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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.us.isa.sedl.core.configuration.Parameter;
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
 * A design specifies: the set of variables and constants (here called parameters) that are involved in an experiment, the populations of the experiment
 *                 a description of the experimental individual, and the experimental design of the experiment. Note that the experimental desing describes the groups
 *                 that are created based on the population of the experiment and the sequence of treaments and measurements (named experimental protocol) that must be 
 *                 performed on each individual of each group in order to conduct the experiment.
 * 
 * <p>Clase Java para Design complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Design"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="variables" type="{http://isa.us.es/sedl/core/design}Variables"/&gt;
 *         &lt;element name="population" type="{http://isa.us.es/sedl/core/design}Population"/&gt;
 *         &lt;element name="samplingMethod" type="{http://isa.us.es/sedl/core/design}SamplingMethod"/&gt;
 *         &lt;element name="designParameters" type="{http://isa.us.es/sedl/core/configuration}Parameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="experimentalDesign" type="{http://isa.us.es/sedl/core/design}ExperimentalDesign"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Design", propOrder = {
    "variables",
    "population",
    "samplingMethod",
    "designParameters",
    "experimentalDesign"
})
public class Design
    extends AbstractDesign
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected Variables variables;
    @XmlElement(required = true)
    protected Population population;
    @XmlElement(required = true)
    protected SamplingMethod samplingMethod;
    protected List<Parameter> designParameters;
    @XmlElement(required = true)
    protected ExperimentalDesign experimentalDesign;

    /**
     * Obtiene el valor de la propiedad variables.
     * 
     * @return
     *     possible object is
     *     {@link Variables }
     *     
     */
    public Variables getVariables() {
        return variables;
    }

    /**
     * Define el valor de la propiedad variables.
     * 
     * @param value
     *     allowed object is
     *     {@link Variables }
     *     
     */
    public void setVariables(Variables value) {
        this.variables = value;
    }

    /**
     * Obtiene el valor de la propiedad population.
     * 
     * @return
     *     possible object is
     *     {@link Population }
     *     
     */
    public Population getPopulation() {
        return population;
    }

    /**
     * Define el valor de la propiedad population.
     * 
     * @param value
     *     allowed object is
     *     {@link Population }
     *     
     */
    public void setPopulation(Population value) {
        this.population = value;
    }

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
     * Gets the value of the designParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parameter }
     * 
     * 
     */
    public List<Parameter> getDesignParameters() {
        if (designParameters == null) {
            designParameters = new ArrayList<Parameter>();
        }
        return this.designParameters;
    }

    /**
     * Obtiene el valor de la propiedad experimentalDesign.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentalDesign }
     *     
     */
    public ExperimentalDesign getExperimentalDesign() {
        return experimentalDesign;
    }

    /**
     * Define el valor de la propiedad experimentalDesign.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentalDesign }
     *     
     */
    public void setExperimentalDesign(ExperimentalDesign value) {
        this.experimentalDesign = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Design)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Design that = ((Design) object);
        {
            Variables lhsVariables;
            lhsVariables = this.getVariables();
            Variables rhsVariables;
            rhsVariables = that.getVariables();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "variables", lhsVariables), LocatorUtils.property(thatLocator, "variables", rhsVariables), lhsVariables, rhsVariables)) {
                return false;
            }
        }
        {
            Population lhsPopulation;
            lhsPopulation = this.getPopulation();
            Population rhsPopulation;
            rhsPopulation = that.getPopulation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "population", lhsPopulation), LocatorUtils.property(thatLocator, "population", rhsPopulation), lhsPopulation, rhsPopulation)) {
                return false;
            }
        }
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
            List<Parameter> lhsDesignParameters;
            lhsDesignParameters = (((this.designParameters!= null)&&(!this.designParameters.isEmpty()))?this.getDesignParameters():null);
            List<Parameter> rhsDesignParameters;
            rhsDesignParameters = (((that.designParameters!= null)&&(!that.designParameters.isEmpty()))?that.getDesignParameters():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designParameters", lhsDesignParameters), LocatorUtils.property(thatLocator, "designParameters", rhsDesignParameters), lhsDesignParameters, rhsDesignParameters)) {
                return false;
            }
        }
        {
            ExperimentalDesign lhsExperimentalDesign;
            lhsExperimentalDesign = this.getExperimentalDesign();
            ExperimentalDesign rhsExperimentalDesign;
            rhsExperimentalDesign = that.getExperimentalDesign();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "experimentalDesign", lhsExperimentalDesign), LocatorUtils.property(thatLocator, "experimentalDesign", rhsExperimentalDesign), lhsExperimentalDesign, rhsExperimentalDesign)) {
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
            Variables theVariables;
            theVariables = this.getVariables();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "variables", theVariables), currentHashCode, theVariables);
        }
        {
            Population thePopulation;
            thePopulation = this.getPopulation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "population", thePopulation), currentHashCode, thePopulation);
        }
        {
            SamplingMethod theSamplingMethod;
            theSamplingMethod = this.getSamplingMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "samplingMethod", theSamplingMethod), currentHashCode, theSamplingMethod);
        }
        {
            List<Parameter> theDesignParameters;
            theDesignParameters = (((this.designParameters!= null)&&(!this.designParameters.isEmpty()))?this.getDesignParameters():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designParameters", theDesignParameters), currentHashCode, theDesignParameters);
        }
        {
            ExperimentalDesign theExperimentalDesign;
            theExperimentalDesign = this.getExperimentalDesign();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "experimentalDesign", theExperimentalDesign), currentHashCode, theExperimentalDesign);
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
        if (draftCopy instanceof Design) {
            final Design copy = ((Design) draftCopy);
            if (this.variables!= null) {
                Variables sourceVariables;
                sourceVariables = this.getVariables();
                Variables copyVariables = ((Variables) strategy.copy(LocatorUtils.property(locator, "variables", sourceVariables), sourceVariables));
                copy.setVariables(copyVariables);
            } else {
                copy.variables = null;
            }
            if (this.population!= null) {
                Population sourcePopulation;
                sourcePopulation = this.getPopulation();
                Population copyPopulation = ((Population) strategy.copy(LocatorUtils.property(locator, "population", sourcePopulation), sourcePopulation));
                copy.setPopulation(copyPopulation);
            } else {
                copy.population = null;
            }
            if (this.samplingMethod!= null) {
                SamplingMethod sourceSamplingMethod;
                sourceSamplingMethod = this.getSamplingMethod();
                SamplingMethod copySamplingMethod = ((SamplingMethod) strategy.copy(LocatorUtils.property(locator, "samplingMethod", sourceSamplingMethod), sourceSamplingMethod));
                copy.setSamplingMethod(copySamplingMethod);
            } else {
                copy.samplingMethod = null;
            }
            if ((this.designParameters!= null)&&(!this.designParameters.isEmpty())) {
                List<Parameter> sourceDesignParameters;
                sourceDesignParameters = (((this.designParameters!= null)&&(!this.designParameters.isEmpty()))?this.getDesignParameters():null);
                @SuppressWarnings("unchecked")
                List<Parameter> copyDesignParameters = ((List<Parameter> ) strategy.copy(LocatorUtils.property(locator, "designParameters", sourceDesignParameters), sourceDesignParameters));
                copy.designParameters = null;
                if (copyDesignParameters!= null) {
                    List<Parameter> uniqueDesignParametersl = copy.getDesignParameters();
                    uniqueDesignParametersl.addAll(copyDesignParameters);
                }
            } else {
                copy.designParameters = null;
            }
            if (this.experimentalDesign!= null) {
                ExperimentalDesign sourceExperimentalDesign;
                sourceExperimentalDesign = this.getExperimentalDesign();
                ExperimentalDesign copyExperimentalDesign = ((ExperimentalDesign) strategy.copy(LocatorUtils.property(locator, "experimentalDesign", sourceExperimentalDesign), sourceExperimentalDesign));
                copy.setExperimentalDesign(copyExperimentalDesign);
            } else {
                copy.experimentalDesign = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Design();
    }

}
