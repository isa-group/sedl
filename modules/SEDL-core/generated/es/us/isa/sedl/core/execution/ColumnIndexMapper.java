//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.23 a las 02:44:29 PM CEST 
//


package es.us.isa.sedl.core.execution;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Clase Java para ColumnIndexMapper complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ColumnIndexMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnIndexMapper")
@XmlSeeAlso({
    ToVariable.class,
    ToConstant.class
})
public class ColumnIndexMapper
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "index", required = true)
    protected BigInteger index;

    /**
     * Obtiene el valor de la propiedad index.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndex() {
        return index;
    }

    /**
     * Define el valor de la propiedad index.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndex(BigInteger value) {
        this.index = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ColumnIndexMapper)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ColumnIndexMapper that = ((ColumnIndexMapper) object);
        {
            BigInteger lhsIndex;
            lhsIndex = this.getIndex();
            BigInteger rhsIndex;
            rhsIndex = that.getIndex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "index", lhsIndex), LocatorUtils.property(thatLocator, "index", rhsIndex), lhsIndex, rhsIndex)) {
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
            BigInteger theIndex;
            theIndex = this.getIndex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "index", theIndex), currentHashCode, theIndex);
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
        if (draftCopy instanceof ColumnIndexMapper) {
            final ColumnIndexMapper copy = ((ColumnIndexMapper) draftCopy);
            if (this.index!= null) {
                BigInteger sourceIndex;
                sourceIndex = this.getIndex();
                BigInteger copyIndex = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "index", sourceIndex), sourceIndex));
                copy.setIndex(copyIndex);
            } else {
                copy.index = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ColumnIndexMapper();
    }

}
