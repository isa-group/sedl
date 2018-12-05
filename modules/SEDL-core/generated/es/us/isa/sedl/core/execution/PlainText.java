//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.05 a las 03:15:37 PM CET 
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
 * <p>Clase Java para PlainText complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PlainText"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/execution}FileFormat"&gt;
 *       &lt;attribute name="rowSeparator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="columnSeparator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlainText")
public abstract class PlainText
    extends FileFormat
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "rowSeparator", required = true)
    protected String rowSeparator;
    @XmlAttribute(name = "columnSeparator", required = true)
    protected String columnSeparator;

    /**
     * Obtiene el valor de la propiedad rowSeparator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowSeparator() {
        return rowSeparator;
    }

    /**
     * Define el valor de la propiedad rowSeparator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowSeparator(String value) {
        this.rowSeparator = value;
    }

    /**
     * Obtiene el valor de la propiedad columnSeparator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnSeparator() {
        return columnSeparator;
    }

    /**
     * Define el valor de la propiedad columnSeparator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnSeparator(String value) {
        this.columnSeparator = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PlainText)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final PlainText that = ((PlainText) object);
        {
            String lhsRowSeparator;
            lhsRowSeparator = this.getRowSeparator();
            String rhsRowSeparator;
            rhsRowSeparator = that.getRowSeparator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rowSeparator", lhsRowSeparator), LocatorUtils.property(thatLocator, "rowSeparator", rhsRowSeparator), lhsRowSeparator, rhsRowSeparator)) {
                return false;
            }
        }
        {
            String lhsColumnSeparator;
            lhsColumnSeparator = this.getColumnSeparator();
            String rhsColumnSeparator;
            rhsColumnSeparator = that.getColumnSeparator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "columnSeparator", lhsColumnSeparator), LocatorUtils.property(thatLocator, "columnSeparator", rhsColumnSeparator), lhsColumnSeparator, rhsColumnSeparator)) {
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
            String theRowSeparator;
            theRowSeparator = this.getRowSeparator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rowSeparator", theRowSeparator), currentHashCode, theRowSeparator);
        }
        {
            String theColumnSeparator;
            theColumnSeparator = this.getColumnSeparator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "columnSeparator", theColumnSeparator), currentHashCode, theColumnSeparator);
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
        if (target instanceof PlainText) {
            final PlainText copy = ((PlainText) target);
            if (this.rowSeparator!= null) {
                String sourceRowSeparator;
                sourceRowSeparator = this.getRowSeparator();
                String copyRowSeparator = ((String) strategy.copy(LocatorUtils.property(locator, "rowSeparator", sourceRowSeparator), sourceRowSeparator));
                copy.setRowSeparator(copyRowSeparator);
            } else {
                copy.rowSeparator = null;
            }
            if (this.columnSeparator!= null) {
                String sourceColumnSeparator;
                sourceColumnSeparator = this.getColumnSeparator();
                String copyColumnSeparator = ((String) strategy.copy(LocatorUtils.property(locator, "columnSeparator", sourceColumnSeparator), sourceColumnSeparator));
                copy.setColumnSeparator(copyColumnSeparator);
            } else {
                copy.columnSeparator = null;
            }
        }
        return target;
    }

}
