//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:22:58 PM CET 
//


package es.us.isa.sedl.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import es.us.isa.sedl.core.context.Context;
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
 * Abstract class to be extended by any domain-specific experiment. It is also extended 
 * by the 'canonical' Basic Experiment, that describes all the details of the experiment 
 * using SEDL elements.
 * 
 * <p>Clase Java para EmpiricalStudy complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EmpiricalStudy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core}SedlEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="goal" type="{http://isa.us.es/sedl/core}Goal"/&gt;
 *         &lt;element name="abstract" type="{http://isa.us.es/sedl/core}Abstract"/&gt;
 *         &lt;element name="context" type="{http://isa.us.es/sedl/core/context}Context" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="metaid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpiricalStudy", propOrder = {
    "goal",
    "_abstract",
    "context"
})
@XmlSeeAlso({
    ControlledExperiment.class
})
@XmlTransient
public abstract class EmpiricalStudy
    extends SedlEntity
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected Goal goal;
    @XmlElement(name = "abstract", required = true)
    protected Abstract _abstract;
    protected Context context;
    @XmlAttribute(name = "metaid", required = true)
    protected String metaid;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Obtiene el valor de la propiedad goal.
     * 
     * @return
     *     possible object is
     *     {@link Goal }
     *     
     */
    public Goal getGoal() {
        return goal;
    }

    /**
     * Define el valor de la propiedad goal.
     * 
     * @param value
     *     allowed object is
     *     {@link Goal }
     *     
     */
    public void setGoal(Goal value) {
        this.goal = value;
    }

    /**
     * Obtiene el valor de la propiedad abstract.
     * 
     * @return
     *     possible object is
     *     {@link Abstract }
     *     
     */
    public Abstract getAbstract() {
        return _abstract;
    }

    /**
     * Define el valor de la propiedad abstract.
     * 
     * @param value
     *     allowed object is
     *     {@link Abstract }
     *     
     */
    public void setAbstract(Abstract value) {
        this._abstract = value;
    }

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
     * Obtiene el valor de la propiedad metaid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaid() {
        return metaid;
    }

    /**
     * Define el valor de la propiedad metaid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaid(String value) {
        this.metaid = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EmpiricalStudy)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final EmpiricalStudy that = ((EmpiricalStudy) object);
        {
            Goal lhsGoal;
            lhsGoal = this.getGoal();
            Goal rhsGoal;
            rhsGoal = that.getGoal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "goal", lhsGoal), LocatorUtils.property(thatLocator, "goal", rhsGoal), lhsGoal, rhsGoal)) {
                return false;
            }
        }
        {
            Abstract lhsAbstract;
            lhsAbstract = this.getAbstract();
            Abstract rhsAbstract;
            rhsAbstract = that.getAbstract();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_abstract", lhsAbstract), LocatorUtils.property(thatLocator, "_abstract", rhsAbstract), lhsAbstract, rhsAbstract)) {
                return false;
            }
        }
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
            String lhsMetaid;
            lhsMetaid = this.getMetaid();
            String rhsMetaid;
            rhsMetaid = that.getMetaid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "metaid", lhsMetaid), LocatorUtils.property(thatLocator, "metaid", rhsMetaid), lhsMetaid, rhsMetaid)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsVersion;
            lhsVersion = this.getVersion();
            String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion)) {
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
            Goal theGoal;
            theGoal = this.getGoal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "goal", theGoal), currentHashCode, theGoal);
        }
        {
            Abstract theAbstract;
            theAbstract = this.getAbstract();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_abstract", theAbstract), currentHashCode, theAbstract);
        }
        {
            Context theContext;
            theContext = this.getContext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "context", theContext), currentHashCode, theContext);
        }
        {
            String theMetaid;
            theMetaid = this.getMetaid();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "metaid", theMetaid), currentHashCode, theMetaid);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion);
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
        super.copyTo(locator, target, strategy);
        if (target instanceof EmpiricalStudy) {
            final EmpiricalStudy copy = ((EmpiricalStudy) target);
            if (this.goal!= null) {
                Goal sourceGoal;
                sourceGoal = this.getGoal();
                Goal copyGoal = ((Goal) strategy.copy(LocatorUtils.property(locator, "goal", sourceGoal), sourceGoal));
                copy.setGoal(copyGoal);
            } else {
                copy.goal = null;
            }
            if (this._abstract!= null) {
                Abstract sourceAbstract;
                sourceAbstract = this.getAbstract();
                Abstract copyAbstract = ((Abstract) strategy.copy(LocatorUtils.property(locator, "_abstract", sourceAbstract), sourceAbstract));
                copy.setAbstract(copyAbstract);
            } else {
                copy._abstract = null;
            }
            if (this.context!= null) {
                Context sourceContext;
                sourceContext = this.getContext();
                Context copyContext = ((Context) strategy.copy(LocatorUtils.property(locator, "context", sourceContext), sourceContext));
                copy.setContext(copyContext);
            } else {
                copy.context = null;
            }
            if (this.metaid!= null) {
                String sourceMetaid;
                sourceMetaid = this.getMetaid();
                String copyMetaid = ((String) strategy.copy(LocatorUtils.property(locator, "metaid", sourceMetaid), sourceMetaid));
                copy.setMetaid(copyMetaid);
            } else {
                copy.metaid = null;
            }
            if (this.name!= null) {
                String sourceName;
                sourceName = this.getName();
                String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
            if (this.version!= null) {
                String sourceVersion;
                sourceVersion = this.getVersion();
                String copyVersion = ((String) strategy.copy(LocatorUtils.property(locator, "version", sourceVersion), sourceVersion));
                copy.setVersion(copyVersion);
            } else {
                copy.version = null;
            }
        }
        return target;
    }

}
