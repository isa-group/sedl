//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.06.06 a las 11:25:05 AM CEST 
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
 * <p>Clase Java para Log complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Log"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lines" type="{http://isa.us.es/sedl/core/execution}LogLine" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Log", propOrder = {
    "lines"
})
public class Log
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected List<LogLine> lines;

    /**
     * Gets the value of the lines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogLine }
     * 
     * 
     */
    public List<LogLine> getLines() {
        if (lines == null) {
            lines = new ArrayList<LogLine>();
        }
        return this.lines;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Log)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Log that = ((Log) object);
        {
            List<LogLine> lhsLines;
            lhsLines = (((this.lines!= null)&&(!this.lines.isEmpty()))?this.getLines():null);
            List<LogLine> rhsLines;
            rhsLines = (((that.lines!= null)&&(!that.lines.isEmpty()))?that.getLines():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lines", lhsLines), LocatorUtils.property(thatLocator, "lines", rhsLines), lhsLines, rhsLines)) {
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
            List<LogLine> theLines;
            theLines = (((this.lines!= null)&&(!this.lines.isEmpty()))?this.getLines():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lines", theLines), currentHashCode, theLines);
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
        if (draftCopy instanceof Log) {
            final Log copy = ((Log) draftCopy);
            if ((this.lines!= null)&&(!this.lines.isEmpty())) {
                List<LogLine> sourceLines;
                sourceLines = (((this.lines!= null)&&(!this.lines.isEmpty()))?this.getLines():null);
                @SuppressWarnings("unchecked")
                List<LogLine> copyLines = ((List<LogLine> ) strategy.copy(LocatorUtils.property(locator, "lines", sourceLines), sourceLines));
                copy.lines = null;
                if (copyLines!= null) {
                    List<LogLine> uniqueLinesl = copy.getLines();
                    uniqueLinesl.addAll(copyLines);
                }
            } else {
                copy.lines = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Log();
    }

}
