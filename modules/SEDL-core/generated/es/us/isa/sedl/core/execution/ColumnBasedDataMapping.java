//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:22:58 PM CET 
//


package es.us.isa.sedl.core.execution;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Clase Java para ColumnBasedDataMapping complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ColumnBasedDataMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/execution}DataMapping"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="columnIndexToVariable" type="{http://isa.us.es/sedl/core/execution}ColumnMapper" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnBasedDataMapping", propOrder = {
    "columnIndexToVariable"
})
public abstract class ColumnBasedDataMapping
    extends DataMapping
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected List<ColumnMapper> columnIndexToVariable;

    /**
     * Gets the value of the columnIndexToVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnIndexToVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnIndexToVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColumnMapper }
     * 
     * 
     */
    public List<ColumnMapper> getColumnIndexToVariable() {
        if (columnIndexToVariable == null) {
            columnIndexToVariable = new ArrayList<ColumnMapper>();
        }
        return this.columnIndexToVariable;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ColumnBasedDataMapping)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ColumnBasedDataMapping that = ((ColumnBasedDataMapping) object);
        {
            List<ColumnMapper> lhsColumnIndexToVariable;
            lhsColumnIndexToVariable = (((this.columnIndexToVariable!= null)&&(!this.columnIndexToVariable.isEmpty()))?this.getColumnIndexToVariable():null);
            List<ColumnMapper> rhsColumnIndexToVariable;
            rhsColumnIndexToVariable = (((that.columnIndexToVariable!= null)&&(!that.columnIndexToVariable.isEmpty()))?that.getColumnIndexToVariable():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "columnIndexToVariable", lhsColumnIndexToVariable), LocatorUtils.property(thatLocator, "columnIndexToVariable", rhsColumnIndexToVariable), lhsColumnIndexToVariable, rhsColumnIndexToVariable)) {
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
            List<ColumnMapper> theColumnIndexToVariable;
            theColumnIndexToVariable = (((this.columnIndexToVariable!= null)&&(!this.columnIndexToVariable.isEmpty()))?this.getColumnIndexToVariable():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "columnIndexToVariable", theColumnIndexToVariable), currentHashCode, theColumnIndexToVariable);
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
        if (target instanceof ColumnBasedDataMapping) {
            final ColumnBasedDataMapping copy = ((ColumnBasedDataMapping) target);
            if ((this.columnIndexToVariable!= null)&&(!this.columnIndexToVariable.isEmpty())) {
                List<ColumnMapper> sourceColumnIndexToVariable;
                sourceColumnIndexToVariable = (((this.columnIndexToVariable!= null)&&(!this.columnIndexToVariable.isEmpty()))?this.getColumnIndexToVariable():null);
                @SuppressWarnings("unchecked")
                List<ColumnMapper> copyColumnIndexToVariable = ((List<ColumnMapper> ) strategy.copy(LocatorUtils.property(locator, "columnIndexToVariable", sourceColumnIndexToVariable), sourceColumnIndexToVariable));
                copy.columnIndexToVariable = null;
                if (copyColumnIndexToVariable!= null) {
                    List<ColumnMapper> uniqueColumnIndexToVariablel = copy.getColumnIndexToVariable();
                    uniqueColumnIndexToVariablel.addAll(copyColumnIndexToVariable);
                }
            } else {
                copy.columnIndexToVariable = null;
            }
        }
        return target;
    }

}
