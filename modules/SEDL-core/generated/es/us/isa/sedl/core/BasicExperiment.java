//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.06.26 a las 12:16:30 PM CEST 
//


package es.us.isa.sedl.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import es.us.isa.sedl.core.configuration.Configuration;
import es.us.isa.sedl.core.context.Context;
import es.us.isa.sedl.core.design.Design;
import es.us.isa.sedl.core.hypothesis.Hypothesis;
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
 * BasicExperiment is the main element provided by SEDL. It supports the description of the context of the experiment (organization, people and projects involved),
 * 				the hypothesis of the experiment, its design, conduction, results and analysis performed.
 * 				Moreover, it contains an attribute that defines the version of SEDL used in the description.
 * 
 * <p>Clase Java para BasicExperiment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BasicExperiment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core}Experiment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="context" type="{http://isa.us.es/sedl/core/context}Context"/&gt;
 *         &lt;element name="hypotheses" type="{http://isa.us.es/sedl/core/hypothesis}Hypothesis" maxOccurs="unbounded"/&gt;
 *         &lt;element name="design" type="{http://isa.us.es/sedl/core/design}Design"/&gt;
 *         &lt;element name="configurations" type="{http://isa.us.es/sedl/core/configuration}Configuration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicExperiment", propOrder = {
    "context",
    "hypotheses",
    "design",
    "configurations"
})
@XmlRootElement(name = "BasicExperiment")
public class BasicExperiment
    extends Experiment
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected Context context;
    @XmlElement(required = true)
    protected List<Hypothesis> hypotheses;
    @XmlElement(required = true)
    protected Design design;
    protected List<Configuration> configurations;

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
     * Gets the value of the hypotheses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hypotheses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHypotheses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hypothesis }
     * 
     * 
     */
    public List<Hypothesis> getHypotheses() {
        if (hypotheses == null) {
            hypotheses = new ArrayList<Hypothesis>();
        }
        return this.hypotheses;
    }

    /**
     * Obtiene el valor de la propiedad design.
     * 
     * @return
     *     possible object is
     *     {@link Design }
     *     
     */
    public Design getDesign() {
        return design;
    }

    /**
     * Define el valor de la propiedad design.
     * 
     * @param value
     *     allowed object is
     *     {@link Design }
     *     
     */
    public void setDesign(Design value) {
        this.design = value;
    }

    /**
     * Gets the value of the configurations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configurations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigurations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Configuration }
     * 
     * 
     */
    public List<Configuration> getConfigurations() {
        if (configurations == null) {
            configurations = new ArrayList<Configuration>();
        }
        return this.configurations;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof BasicExperiment)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final BasicExperiment that = ((BasicExperiment) object);
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
            List<Hypothesis> lhsHypotheses;
            lhsHypotheses = (((this.hypotheses!= null)&&(!this.hypotheses.isEmpty()))?this.getHypotheses():null);
            List<Hypothesis> rhsHypotheses;
            rhsHypotheses = (((that.hypotheses!= null)&&(!that.hypotheses.isEmpty()))?that.getHypotheses():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hypotheses", lhsHypotheses), LocatorUtils.property(thatLocator, "hypotheses", rhsHypotheses), lhsHypotheses, rhsHypotheses)) {
                return false;
            }
        }
        {
            Design lhsDesign;
            lhsDesign = this.getDesign();
            Design rhsDesign;
            rhsDesign = that.getDesign();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "design", lhsDesign), LocatorUtils.property(thatLocator, "design", rhsDesign), lhsDesign, rhsDesign)) {
                return false;
            }
        }
        {
            List<Configuration> lhsConfigurations;
            lhsConfigurations = (((this.configurations!= null)&&(!this.configurations.isEmpty()))?this.getConfigurations():null);
            List<Configuration> rhsConfigurations;
            rhsConfigurations = (((that.configurations!= null)&&(!that.configurations.isEmpty()))?that.getConfigurations():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "configurations", lhsConfigurations), LocatorUtils.property(thatLocator, "configurations", rhsConfigurations), lhsConfigurations, rhsConfigurations)) {
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
            List<Hypothesis> theHypotheses;
            theHypotheses = (((this.hypotheses!= null)&&(!this.hypotheses.isEmpty()))?this.getHypotheses():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hypotheses", theHypotheses), currentHashCode, theHypotheses);
        }
        {
            Design theDesign;
            theDesign = this.getDesign();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "design", theDesign), currentHashCode, theDesign);
        }
        {
            List<Configuration> theConfigurations;
            theConfigurations = (((this.configurations!= null)&&(!this.configurations.isEmpty()))?this.getConfigurations():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "configurations", theConfigurations), currentHashCode, theConfigurations);
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
        if (draftCopy instanceof BasicExperiment) {
            final BasicExperiment copy = ((BasicExperiment) draftCopy);
            if (this.context!= null) {
                Context sourceContext;
                sourceContext = this.getContext();
                Context copyContext = ((Context) strategy.copy(LocatorUtils.property(locator, "context", sourceContext), sourceContext));
                copy.setContext(copyContext);
            } else {
                copy.context = null;
            }
            if ((this.hypotheses!= null)&&(!this.hypotheses.isEmpty())) {
                List<Hypothesis> sourceHypotheses;
                sourceHypotheses = (((this.hypotheses!= null)&&(!this.hypotheses.isEmpty()))?this.getHypotheses():null);
                @SuppressWarnings("unchecked")
                List<Hypothesis> copyHypotheses = ((List<Hypothesis> ) strategy.copy(LocatorUtils.property(locator, "hypotheses", sourceHypotheses), sourceHypotheses));
                copy.hypotheses = null;
                if (copyHypotheses!= null) {
                    List<Hypothesis> uniqueHypothesesl = copy.getHypotheses();
                    uniqueHypothesesl.addAll(copyHypotheses);
                }
            } else {
                copy.hypotheses = null;
            }
            if (this.design!= null) {
                Design sourceDesign;
                sourceDesign = this.getDesign();
                Design copyDesign = ((Design) strategy.copy(LocatorUtils.property(locator, "design", sourceDesign), sourceDesign));
                copy.setDesign(copyDesign);
            } else {
                copy.design = null;
            }
            if ((this.configurations!= null)&&(!this.configurations.isEmpty())) {
                List<Configuration> sourceConfigurations;
                sourceConfigurations = (((this.configurations!= null)&&(!this.configurations.isEmpty()))?this.getConfigurations():null);
                @SuppressWarnings("unchecked")
                List<Configuration> copyConfigurations = ((List<Configuration> ) strategy.copy(LocatorUtils.property(locator, "configurations", sourceConfigurations), sourceConfigurations));
                copy.configurations = null;
                if (copyConfigurations!= null) {
                    List<Configuration> uniqueConfigurationsl = copy.getConfigurations();
                    uniqueConfigurationsl.addAll(copyConfigurations);
                }
            } else {
                copy.configurations = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BasicExperiment();
    }

}
