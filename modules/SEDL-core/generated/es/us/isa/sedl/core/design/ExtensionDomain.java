//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.17 a las 12:43:04 AM CEST 
//


package es.us.isa.sedl.core.design;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Clase Java para ExtensionDomain complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExtensionDomain"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/design}Domain"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="levels" type="{http://isa.us.es/sedl/core/design}Level" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionDomain", propOrder = {
    "levels"
})
public class ExtensionDomain
    extends AbstractExtensionDomain
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected List<Level> levels;

    /**
     * Gets the value of the levels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the levels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Level }
     * 
     * 
     */
    public List<Level> getLevels() {
        if (levels == null) {
            levels = new ArrayList<Level>();
        }
        return this.levels;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ExtensionDomain)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ExtensionDomain that = ((ExtensionDomain) object);
        {
            List<Level> lhsLevels;
            lhsLevels = (((this.levels!= null)&&(!this.levels.isEmpty()))?this.getLevels():null);
            List<Level> rhsLevels;
            rhsLevels = (((that.levels!= null)&&(!that.levels.isEmpty()))?that.getLevels():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "levels", lhsLevels), LocatorUtils.property(thatLocator, "levels", rhsLevels), lhsLevels, rhsLevels)) {
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
            List<Level> theLevels;
            theLevels = (((this.levels!= null)&&(!this.levels.isEmpty()))?this.getLevels():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "levels", theLevels), currentHashCode, theLevels);
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
        if (draftCopy instanceof ExtensionDomain) {
            final ExtensionDomain copy = ((ExtensionDomain) draftCopy);
            if ((this.levels!= null)&&(!this.levels.isEmpty())) {
                List<Level> sourceLevels;
                sourceLevels = (((this.levels!= null)&&(!this.levels.isEmpty()))?this.getLevels():null);
                @SuppressWarnings("unchecked")
                List<Level> copyLevels = ((List<Level> ) strategy.copy(LocatorUtils.property(locator, "levels", sourceLevels), sourceLevels));
                copy.levels = null;
                if (copyLevels!= null) {
                    List<Level> uniqueLevelsl = copy.getLevels();
                    uniqueLevelsl.addAll(copyLevels);
                }
            } else {
                copy.levels = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ExtensionDomain();
    }

}
