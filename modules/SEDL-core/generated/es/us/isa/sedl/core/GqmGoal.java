//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.05 a las 03:15:37 PM CET 
//


package es.us.isa.sedl.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Clase Java para GqmGoal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GqmGoal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="object" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="purpose" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="focus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="pointOfView" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="context" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GqmGoal")
public class GqmGoal
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "object", required = true)
    protected String object;
    @XmlAttribute(name = "purpose", required = true)
    protected String purpose;
    @XmlAttribute(name = "focus", required = true)
    protected String focus;
    @XmlAttribute(name = "pointOfView", required = true)
    protected String pointOfView;
    @XmlAttribute(name = "context", required = true)
    protected String context;

    /**
     * Obtiene el valor de la propiedad object.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObject() {
        return object;
    }

    /**
     * Define el valor de la propiedad object.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObject(String value) {
        this.object = value;
    }

    /**
     * Obtiene el valor de la propiedad purpose.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Define el valor de la propiedad purpose.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Obtiene el valor de la propiedad focus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFocus() {
        return focus;
    }

    /**
     * Define el valor de la propiedad focus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFocus(String value) {
        this.focus = value;
    }

    /**
     * Obtiene el valor de la propiedad pointOfView.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfView() {
        return pointOfView;
    }

    /**
     * Define el valor de la propiedad pointOfView.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfView(String value) {
        this.pointOfView = value;
    }

    /**
     * Obtiene el valor de la propiedad context.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Define el valor de la propiedad context.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GqmGoal)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GqmGoal that = ((GqmGoal) object);
        {
            String lhsObject;
            lhsObject = this.getObject();
            String rhsObject;
            rhsObject = that.getObject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "object", lhsObject), LocatorUtils.property(thatLocator, "object", rhsObject), lhsObject, rhsObject)) {
                return false;
            }
        }
        {
            String lhsPurpose;
            lhsPurpose = this.getPurpose();
            String rhsPurpose;
            rhsPurpose = that.getPurpose();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purpose", lhsPurpose), LocatorUtils.property(thatLocator, "purpose", rhsPurpose), lhsPurpose, rhsPurpose)) {
                return false;
            }
        }
        {
            String lhsFocus;
            lhsFocus = this.getFocus();
            String rhsFocus;
            rhsFocus = that.getFocus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "focus", lhsFocus), LocatorUtils.property(thatLocator, "focus", rhsFocus), lhsFocus, rhsFocus)) {
                return false;
            }
        }
        {
            String lhsPointOfView;
            lhsPointOfView = this.getPointOfView();
            String rhsPointOfView;
            rhsPointOfView = that.getPointOfView();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pointOfView", lhsPointOfView), LocatorUtils.property(thatLocator, "pointOfView", rhsPointOfView), lhsPointOfView, rhsPointOfView)) {
                return false;
            }
        }
        {
            String lhsContext;
            lhsContext = this.getContext();
            String rhsContext;
            rhsContext = that.getContext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "context", lhsContext), LocatorUtils.property(thatLocator, "context", rhsContext), lhsContext, rhsContext)) {
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
            String theObject;
            theObject = this.getObject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "object", theObject), currentHashCode, theObject);
        }
        {
            String thePurpose;
            thePurpose = this.getPurpose();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purpose", thePurpose), currentHashCode, thePurpose);
        }
        {
            String theFocus;
            theFocus = this.getFocus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "focus", theFocus), currentHashCode, theFocus);
        }
        {
            String thePointOfView;
            thePointOfView = this.getPointOfView();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pointOfView", thePointOfView), currentHashCode, thePointOfView);
        }
        {
            String theContext;
            theContext = this.getContext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "context", theContext), currentHashCode, theContext);
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
        if (draftCopy instanceof GqmGoal) {
            final GqmGoal copy = ((GqmGoal) draftCopy);
            if (this.object!= null) {
                String sourceObject;
                sourceObject = this.getObject();
                String copyObject = ((String) strategy.copy(LocatorUtils.property(locator, "object", sourceObject), sourceObject));
                copy.setObject(copyObject);
            } else {
                copy.object = null;
            }
            if (this.purpose!= null) {
                String sourcePurpose;
                sourcePurpose = this.getPurpose();
                String copyPurpose = ((String) strategy.copy(LocatorUtils.property(locator, "purpose", sourcePurpose), sourcePurpose));
                copy.setPurpose(copyPurpose);
            } else {
                copy.purpose = null;
            }
            if (this.focus!= null) {
                String sourceFocus;
                sourceFocus = this.getFocus();
                String copyFocus = ((String) strategy.copy(LocatorUtils.property(locator, "focus", sourceFocus), sourceFocus));
                copy.setFocus(copyFocus);
            } else {
                copy.focus = null;
            }
            if (this.pointOfView!= null) {
                String sourcePointOfView;
                sourcePointOfView = this.getPointOfView();
                String copyPointOfView = ((String) strategy.copy(LocatorUtils.property(locator, "pointOfView", sourcePointOfView), sourcePointOfView));
                copy.setPointOfView(copyPointOfView);
            } else {
                copy.pointOfView = null;
            }
            if (this.context!= null) {
                String sourceContext;
                sourceContext = this.getContext();
                String copyContext = ((String) strategy.copy(LocatorUtils.property(locator, "context", sourceContext), sourceContext));
                copy.setContext(copyContext);
            } else {
                copy.context = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GqmGoal();
    }

}
