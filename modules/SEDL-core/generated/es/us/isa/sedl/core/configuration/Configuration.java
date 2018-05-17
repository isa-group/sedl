//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.17 a las 12:43:04 AM CEST 
//


package es.us.isa.sedl.core.configuration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.us.isa.sedl.core.SEDLEntity;
import es.us.isa.sedl.core.context.Context;
import es.us.isa.sedl.core.execution.Execution;
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
 * A configuration is a description of the specific factors affecting a set of experimental 
 * 		executions, along with the specific details about how will be provided
 * 		 the inputs	and outputs of the experiment in that specific context. By dividing the set of 
 * 		 factors affecting an experiment in design and configuration, we aim to maintain a general and
 * 		  unique experiment design among experimental replications. 
 * 		 In this sense, the experimental desigh should remain valid and consistent among replications in 
 * 		 order to allow the comparison of results and the identification of relevant variables
 * 		in the context of the variable by comparing the results of multiple executions with different 
 * 		configurations.
 * 		Additionally, the configuration can contain two optional elements: the experimental procedure, 
 * 		that especifies how the experiment should be conducted in the specific environment of the 
 * 		configuration, and a context of the configuration (since each replication of the experiment
 * 		could be performed by different experimenters in different organizations).
 * 
 * <p>Clase Java para Configuration complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Configuration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core}SEDLEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="context" type="{http://isa.us.es/sedl/core/context}Context" minOccurs="0"/&gt;
 *         &lt;element name="experimentalProcedure" type="{http://isa.us.es/sedl/core/configuration}ExperimentalProcedure" minOccurs="0"/&gt;
 *         &lt;element name="experimentalSetting" type="{http://isa.us.es/sedl/core/configuration}ExperimentalSetting"/&gt;
 *         &lt;element name="experimentalInputs" type="{http://isa.us.es/sedl/core/configuration}ExperimentalInputs"/&gt;
 *         &lt;element name="experimentalOutputs" type="{http://isa.us.es/sedl/core/configuration}ExperimentalOutputs"/&gt;
 *         &lt;element name="parameters" type="{http://isa.us.es/sedl/core/configuration}Parameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="executions" type="{http://isa.us.es/sedl/core/execution}Execution" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Configuration", propOrder = {
    "context",
    "experimentalProcedure",
    "experimentalSetting",
    "experimentalInputs",
    "experimentalOutputs",
    "parameters",
    "executions"
})
public class Configuration
    extends SEDLEntity
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected Context context;
    protected ExperimentalProcedure experimentalProcedure;
    @XmlElement(required = true)
    protected ExperimentalSetting experimentalSetting;
    @XmlElement(required = true)
    protected ExperimentalInputs experimentalInputs;
    @XmlElement(required = true)
    protected ExperimentalOutputs experimentalOutputs;
    protected List<Parameter> parameters;
    protected List<Execution> executions;

    /**
     * Obtiene el valor de la propiedad context.
     * 
     * @return
     *     possible object is
     *     {@link Context }
     *     
     */
    public Context getContext() {
        return context;
    }

    /**
     * Define el valor de la propiedad context.
     * 
     * @param value
     *     allowed object is
     *     {@link Context }
     *     
     */
    public void setContext(Context value) {
        this.context = value;
    }

    /**
     * Obtiene el valor de la propiedad experimentalProcedure.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentalProcedure }
     *     
     */
    public ExperimentalProcedure getExperimentalProcedure() {
        return experimentalProcedure;
    }

    /**
     * Define el valor de la propiedad experimentalProcedure.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentalProcedure }
     *     
     */
    public void setExperimentalProcedure(ExperimentalProcedure value) {
        this.experimentalProcedure = value;
    }

    /**
     * Obtiene el valor de la propiedad experimentalSetting.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentalSetting }
     *     
     */
    public ExperimentalSetting getExperimentalSetting() {
        return experimentalSetting;
    }

    /**
     * Define el valor de la propiedad experimentalSetting.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentalSetting }
     *     
     */
    public void setExperimentalSetting(ExperimentalSetting value) {
        this.experimentalSetting = value;
    }

    /**
     * Obtiene el valor de la propiedad experimentalInputs.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentalInputs }
     *     
     */
    public ExperimentalInputs getExperimentalInputs() {
        return experimentalInputs;
    }

    /**
     * Define el valor de la propiedad experimentalInputs.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentalInputs }
     *     
     */
    public void setExperimentalInputs(ExperimentalInputs value) {
        this.experimentalInputs = value;
    }

    /**
     * Obtiene el valor de la propiedad experimentalOutputs.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentalOutputs }
     *     
     */
    public ExperimentalOutputs getExperimentalOutputs() {
        return experimentalOutputs;
    }

    /**
     * Define el valor de la propiedad experimentalOutputs.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentalOutputs }
     *     
     */
    public void setExperimentalOutputs(ExperimentalOutputs value) {
        this.experimentalOutputs = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parameter }
     * 
     * 
     */
    public List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<Parameter>();
        }
        return this.parameters;
    }

    /**
     * Gets the value of the executions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the executions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExecutions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Execution }
     * 
     * 
     */
    public List<Execution> getExecutions() {
        if (executions == null) {
            executions = new ArrayList<Execution>();
        }
        return this.executions;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Configuration)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Configuration that = ((Configuration) object);
        {
            Context lhsContext;
            lhsContext = this.getContext();
            Context rhsContext;
            rhsContext = that.getContext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "context", lhsContext), LocatorUtils.property(thatLocator, "context", rhsContext), lhsContext, rhsContext)) {
                return false;
            }
        }
        {
            ExperimentalProcedure lhsExperimentalProcedure;
            lhsExperimentalProcedure = this.getExperimentalProcedure();
            ExperimentalProcedure rhsExperimentalProcedure;
            rhsExperimentalProcedure = that.getExperimentalProcedure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "experimentalProcedure", lhsExperimentalProcedure), LocatorUtils.property(thatLocator, "experimentalProcedure", rhsExperimentalProcedure), lhsExperimentalProcedure, rhsExperimentalProcedure)) {
                return false;
            }
        }
        {
            ExperimentalSetting lhsExperimentalSetting;
            lhsExperimentalSetting = this.getExperimentalSetting();
            ExperimentalSetting rhsExperimentalSetting;
            rhsExperimentalSetting = that.getExperimentalSetting();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "experimentalSetting", lhsExperimentalSetting), LocatorUtils.property(thatLocator, "experimentalSetting", rhsExperimentalSetting), lhsExperimentalSetting, rhsExperimentalSetting)) {
                return false;
            }
        }
        {
            ExperimentalInputs lhsExperimentalInputs;
            lhsExperimentalInputs = this.getExperimentalInputs();
            ExperimentalInputs rhsExperimentalInputs;
            rhsExperimentalInputs = that.getExperimentalInputs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "experimentalInputs", lhsExperimentalInputs), LocatorUtils.property(thatLocator, "experimentalInputs", rhsExperimentalInputs), lhsExperimentalInputs, rhsExperimentalInputs)) {
                return false;
            }
        }
        {
            ExperimentalOutputs lhsExperimentalOutputs;
            lhsExperimentalOutputs = this.getExperimentalOutputs();
            ExperimentalOutputs rhsExperimentalOutputs;
            rhsExperimentalOutputs = that.getExperimentalOutputs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "experimentalOutputs", lhsExperimentalOutputs), LocatorUtils.property(thatLocator, "experimentalOutputs", rhsExperimentalOutputs), lhsExperimentalOutputs, rhsExperimentalOutputs)) {
                return false;
            }
        }
        {
            List<Parameter> lhsParameters;
            lhsParameters = (((this.parameters!= null)&&(!this.parameters.isEmpty()))?this.getParameters():null);
            List<Parameter> rhsParameters;
            rhsParameters = (((that.parameters!= null)&&(!that.parameters.isEmpty()))?that.getParameters():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parameters", lhsParameters), LocatorUtils.property(thatLocator, "parameters", rhsParameters), lhsParameters, rhsParameters)) {
                return false;
            }
        }
        {
            List<Execution> lhsExecutions;
            lhsExecutions = (((this.executions!= null)&&(!this.executions.isEmpty()))?this.getExecutions():null);
            List<Execution> rhsExecutions;
            rhsExecutions = (((that.executions!= null)&&(!that.executions.isEmpty()))?that.getExecutions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "executions", lhsExecutions), LocatorUtils.property(thatLocator, "executions", rhsExecutions), lhsExecutions, rhsExecutions)) {
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
            Context theContext;
            theContext = this.getContext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "context", theContext), currentHashCode, theContext);
        }
        {
            ExperimentalProcedure theExperimentalProcedure;
            theExperimentalProcedure = this.getExperimentalProcedure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "experimentalProcedure", theExperimentalProcedure), currentHashCode, theExperimentalProcedure);
        }
        {
            ExperimentalSetting theExperimentalSetting;
            theExperimentalSetting = this.getExperimentalSetting();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "experimentalSetting", theExperimentalSetting), currentHashCode, theExperimentalSetting);
        }
        {
            ExperimentalInputs theExperimentalInputs;
            theExperimentalInputs = this.getExperimentalInputs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "experimentalInputs", theExperimentalInputs), currentHashCode, theExperimentalInputs);
        }
        {
            ExperimentalOutputs theExperimentalOutputs;
            theExperimentalOutputs = this.getExperimentalOutputs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "experimentalOutputs", theExperimentalOutputs), currentHashCode, theExperimentalOutputs);
        }
        {
            List<Parameter> theParameters;
            theParameters = (((this.parameters!= null)&&(!this.parameters.isEmpty()))?this.getParameters():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parameters", theParameters), currentHashCode, theParameters);
        }
        {
            List<Execution> theExecutions;
            theExecutions = (((this.executions!= null)&&(!this.executions.isEmpty()))?this.getExecutions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "executions", theExecutions), currentHashCode, theExecutions);
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
        if (draftCopy instanceof Configuration) {
            final Configuration copy = ((Configuration) draftCopy);
            if (this.context!= null) {
                Context sourceContext;
                sourceContext = this.getContext();
                Context copyContext = ((Context) strategy.copy(LocatorUtils.property(locator, "context", sourceContext), sourceContext));
                copy.setContext(copyContext);
            } else {
                copy.context = null;
            }
            if (this.experimentalProcedure!= null) {
                ExperimentalProcedure sourceExperimentalProcedure;
                sourceExperimentalProcedure = this.getExperimentalProcedure();
                ExperimentalProcedure copyExperimentalProcedure = ((ExperimentalProcedure) strategy.copy(LocatorUtils.property(locator, "experimentalProcedure", sourceExperimentalProcedure), sourceExperimentalProcedure));
                copy.setExperimentalProcedure(copyExperimentalProcedure);
            } else {
                copy.experimentalProcedure = null;
            }
            if (this.experimentalSetting!= null) {
                ExperimentalSetting sourceExperimentalSetting;
                sourceExperimentalSetting = this.getExperimentalSetting();
                ExperimentalSetting copyExperimentalSetting = ((ExperimentalSetting) strategy.copy(LocatorUtils.property(locator, "experimentalSetting", sourceExperimentalSetting), sourceExperimentalSetting));
                copy.setExperimentalSetting(copyExperimentalSetting);
            } else {
                copy.experimentalSetting = null;
            }
            if (this.experimentalInputs!= null) {
                ExperimentalInputs sourceExperimentalInputs;
                sourceExperimentalInputs = this.getExperimentalInputs();
                ExperimentalInputs copyExperimentalInputs = ((ExperimentalInputs) strategy.copy(LocatorUtils.property(locator, "experimentalInputs", sourceExperimentalInputs), sourceExperimentalInputs));
                copy.setExperimentalInputs(copyExperimentalInputs);
            } else {
                copy.experimentalInputs = null;
            }
            if (this.experimentalOutputs!= null) {
                ExperimentalOutputs sourceExperimentalOutputs;
                sourceExperimentalOutputs = this.getExperimentalOutputs();
                ExperimentalOutputs copyExperimentalOutputs = ((ExperimentalOutputs) strategy.copy(LocatorUtils.property(locator, "experimentalOutputs", sourceExperimentalOutputs), sourceExperimentalOutputs));
                copy.setExperimentalOutputs(copyExperimentalOutputs);
            } else {
                copy.experimentalOutputs = null;
            }
            if ((this.parameters!= null)&&(!this.parameters.isEmpty())) {
                List<Parameter> sourceParameters;
                sourceParameters = (((this.parameters!= null)&&(!this.parameters.isEmpty()))?this.getParameters():null);
                @SuppressWarnings("unchecked")
                List<Parameter> copyParameters = ((List<Parameter> ) strategy.copy(LocatorUtils.property(locator, "parameters", sourceParameters), sourceParameters));
                copy.parameters = null;
                if (copyParameters!= null) {
                    List<Parameter> uniqueParametersl = copy.getParameters();
                    uniqueParametersl.addAll(copyParameters);
                }
            } else {
                copy.parameters = null;
            }
            if ((this.executions!= null)&&(!this.executions.isEmpty())) {
                List<Execution> sourceExecutions;
                sourceExecutions = (((this.executions!= null)&&(!this.executions.isEmpty()))?this.getExecutions():null);
                @SuppressWarnings("unchecked")
                List<Execution> copyExecutions = ((List<Execution> ) strategy.copy(LocatorUtils.property(locator, "executions", sourceExecutions), sourceExecutions));
                copy.executions = null;
                if (copyExecutions!= null) {
                    List<Execution> uniqueExecutionsl = copy.getExecutions();
                    uniqueExecutionsl.addAll(copyExecutions);
                }
            } else {
                copy.executions = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Configuration();
    }

}
