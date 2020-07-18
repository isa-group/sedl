//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.07.14 a las 12:52:39 PM CEST 
//


package es.us.isa.sedl.core.execution;

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
 * <p>Clase Java para ToConstant complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ToConstant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/execution}ColumnMapper"&gt;
 *       &lt;attribute name="columnConstants" use="required" type="{http://isa.us.es/sedl/core/execution}ColumnConstants" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToConstant")
public abstract class ToConstant
    extends ColumnMapper
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "columnConstants", required = true)
    protected ColumnConstants columnConstants;

    /**
     * Obtiene el valor de la propiedad columnConstants.
     * 
     * @return
     *     possible object is
     *     {@link ColumnConstants }
     *     
     */
    public ColumnConstants getColumnConstants() {
        return columnConstants;
    }

    /**
     * Define el valor de la propiedad columnConstants.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnConstants }
     *     
     */
    public void setColumnConstants(ColumnConstants value) {
        this.columnConstants = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ToConstant)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ToConstant that = ((ToConstant) object);
        {
            ColumnConstants lhsColumnConstants;
            lhsColumnConstants = this.getColumnConstants();
            ColumnConstants rhsColumnConstants;
            rhsColumnConstants = that.getColumnConstants();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "columnConstants", lhsColumnConstants), LocatorUtils.property(thatLocator, "columnConstants", rhsColumnConstants), lhsColumnConstants, rhsColumnConstants)) {
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
            ColumnConstants theColumnConstants;
            theColumnConstants = this.getColumnConstants();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "columnConstants", theColumnConstants), currentHashCode, theColumnConstants);
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
        if (target instanceof ToConstant) {
            final ToConstant copy = ((ToConstant) target);
            if (this.columnConstants!= null) {
                ColumnConstants sourceColumnConstants;
                sourceColumnConstants = this.getColumnConstants();
                ColumnConstants copyColumnConstants = ((ColumnConstants) strategy.copy(LocatorUtils.property(locator, "columnConstants", sourceColumnConstants), sourceColumnConstants));
                copy.setColumnConstants(copyColumnConstants);
            } else {
                copy.columnConstants = null;
            }
        }
        return target;
    }

}
