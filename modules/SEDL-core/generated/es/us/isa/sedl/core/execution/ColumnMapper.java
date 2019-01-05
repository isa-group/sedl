//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:44:54 PM CET 
//


package es.us.isa.sedl.core.execution;

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
 * <p>Clase Java para ColumnMapper complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ColumnMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="indexer" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnMapper")
@XmlSeeAlso({
    ToVariable.class,
    ToConstant.class
})
public abstract class ColumnMapper
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "indexer", required = true)
    protected String indexer;

    /**
     * Obtiene el valor de la propiedad indexer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexer() {
        return indexer;
    }

    /**
     * Define el valor de la propiedad indexer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexer(String value) {
        this.indexer = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ColumnMapper)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ColumnMapper that = ((ColumnMapper) object);
        {
            String lhsIndexer;
            lhsIndexer = this.getIndexer();
            String rhsIndexer;
            rhsIndexer = that.getIndexer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indexer", lhsIndexer), LocatorUtils.property(thatLocator, "indexer", rhsIndexer), lhsIndexer, rhsIndexer)) {
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
            String theIndexer;
            theIndexer = this.getIndexer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indexer", theIndexer), currentHashCode, theIndexer);
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
        if (target instanceof ColumnMapper) {
            final ColumnMapper copy = ((ColumnMapper) target);
            if (this.indexer!= null) {
                String sourceIndexer;
                sourceIndexer = this.getIndexer();
                String copyIndexer = ((String) strategy.copy(LocatorUtils.property(locator, "indexer", sourceIndexer), sourceIndexer));
                copy.setIndexer(copyIndexer);
            } else {
                copy.indexer = null;
            }
        }
        return target;
    }

}
