//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.03 a las 09:36:25 AM CEST 
//


package es.us.isa.sedl.core.configuration;

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
 * <p>Clase Java para SoftwarePlatform complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SoftwarePlatform"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="runtimes" type="{http://isa.us.es/sedl/core/configuration}Runtime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="libraries" type="{http://isa.us.es/sedl/core/configuration}Library" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="operatingSystem" type="{http://isa.us.es/sedl/core/configuration}OperatingSystem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoftwarePlatform", propOrder = {
    "runtimes",
    "libraries",
    "operatingSystem"
})
public class SoftwarePlatform
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected List<Runtime> runtimes;
    protected List<Library> libraries;
    protected OperatingSystem operatingSystem;

    /**
     * Gets the value of the runtimes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runtimes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuntimes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Runtime }
     * 
     * 
     */
    public List<Runtime> getRuntimes() {
        if (runtimes == null) {
            runtimes = new ArrayList<Runtime>();
        }
        return this.runtimes;
    }

    /**
     * Gets the value of the libraries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libraries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibraries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Library }
     * 
     * 
     */
    public List<Library> getLibraries() {
        if (libraries == null) {
            libraries = new ArrayList<Library>();
        }
        return this.libraries;
    }

    /**
     * Obtiene el valor de la propiedad operatingSystem.
     * 
     * @return
     *     possible object is
     *     {@link OperatingSystem }
     *     
     */
    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Define el valor de la propiedad operatingSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingSystem }
     *     
     */
    public void setOperatingSystem(OperatingSystem value) {
        this.operatingSystem = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SoftwarePlatform)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SoftwarePlatform that = ((SoftwarePlatform) object);
        {
            List<Runtime> lhsRuntimes;
            lhsRuntimes = (((this.runtimes!= null)&&(!this.runtimes.isEmpty()))?this.getRuntimes():null);
            List<Runtime> rhsRuntimes;
            rhsRuntimes = (((that.runtimes!= null)&&(!that.runtimes.isEmpty()))?that.getRuntimes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "runtimes", lhsRuntimes), LocatorUtils.property(thatLocator, "runtimes", rhsRuntimes), lhsRuntimes, rhsRuntimes)) {
                return false;
            }
        }
        {
            List<Library> lhsLibraries;
            lhsLibraries = (((this.libraries!= null)&&(!this.libraries.isEmpty()))?this.getLibraries():null);
            List<Library> rhsLibraries;
            rhsLibraries = (((that.libraries!= null)&&(!that.libraries.isEmpty()))?that.getLibraries():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "libraries", lhsLibraries), LocatorUtils.property(thatLocator, "libraries", rhsLibraries), lhsLibraries, rhsLibraries)) {
                return false;
            }
        }
        {
            OperatingSystem lhsOperatingSystem;
            lhsOperatingSystem = this.getOperatingSystem();
            OperatingSystem rhsOperatingSystem;
            rhsOperatingSystem = that.getOperatingSystem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operatingSystem", lhsOperatingSystem), LocatorUtils.property(thatLocator, "operatingSystem", rhsOperatingSystem), lhsOperatingSystem, rhsOperatingSystem)) {
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
            List<Runtime> theRuntimes;
            theRuntimes = (((this.runtimes!= null)&&(!this.runtimes.isEmpty()))?this.getRuntimes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "runtimes", theRuntimes), currentHashCode, theRuntimes);
        }
        {
            List<Library> theLibraries;
            theLibraries = (((this.libraries!= null)&&(!this.libraries.isEmpty()))?this.getLibraries():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "libraries", theLibraries), currentHashCode, theLibraries);
        }
        {
            OperatingSystem theOperatingSystem;
            theOperatingSystem = this.getOperatingSystem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operatingSystem", theOperatingSystem), currentHashCode, theOperatingSystem);
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
        if (draftCopy instanceof SoftwarePlatform) {
            final SoftwarePlatform copy = ((SoftwarePlatform) draftCopy);
            if ((this.runtimes!= null)&&(!this.runtimes.isEmpty())) {
                List<Runtime> sourceRuntimes;
                sourceRuntimes = (((this.runtimes!= null)&&(!this.runtimes.isEmpty()))?this.getRuntimes():null);
                @SuppressWarnings("unchecked")
                List<Runtime> copyRuntimes = ((List<Runtime> ) strategy.copy(LocatorUtils.property(locator, "runtimes", sourceRuntimes), sourceRuntimes));
                copy.runtimes = null;
                if (copyRuntimes!= null) {
                    List<Runtime> uniqueRuntimesl = copy.getRuntimes();
                    uniqueRuntimesl.addAll(copyRuntimes);
                }
            } else {
                copy.runtimes = null;
            }
            if ((this.libraries!= null)&&(!this.libraries.isEmpty())) {
                List<Library> sourceLibraries;
                sourceLibraries = (((this.libraries!= null)&&(!this.libraries.isEmpty()))?this.getLibraries():null);
                @SuppressWarnings("unchecked")
                List<Library> copyLibraries = ((List<Library> ) strategy.copy(LocatorUtils.property(locator, "libraries", sourceLibraries), sourceLibraries));
                copy.libraries = null;
                if (copyLibraries!= null) {
                    List<Library> uniqueLibrariesl = copy.getLibraries();
                    uniqueLibrariesl.addAll(copyLibraries);
                }
            } else {
                copy.libraries = null;
            }
            if (this.operatingSystem!= null) {
                OperatingSystem sourceOperatingSystem;
                sourceOperatingSystem = this.getOperatingSystem();
                OperatingSystem copyOperatingSystem = ((OperatingSystem) strategy.copy(LocatorUtils.property(locator, "operatingSystem", sourceOperatingSystem), sourceOperatingSystem));
                copy.setOperatingSystem(copyOperatingSystem);
            } else {
                copy.operatingSystem = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SoftwarePlatform();
    }

}
