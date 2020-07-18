//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.07.14 a las 12:52:39 PM CEST 
//


package es.us.isa.sedl.core.configuration;

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
 * <p>Clase Java para File complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="File"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileformatspecification" type="{http://isa.us.es/sedl/core/configuration}FileFormatSpecification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.eclipse.org/uml2/5.0.0/Types}String" /&gt;
 *       &lt;attribute name="path" use="required" type="{http://www.eclipse.org/uml2/5.0.0/Types}String" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "File", propOrder = {
    "fileformatspecification"
})
public class File
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected FileFormatSpecification fileformatspecification;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "path", required = true)
    protected String path;

    /**
     * Obtiene el valor de la propiedad fileformatspecification.
     * 
     * @return
     *     possible object is
     *     {@link FileFormatSpecification }
     *     
     */
    public FileFormatSpecification getFileformatspecification() {
        return fileformatspecification;
    }

    /**
     * Define el valor de la propiedad fileformatspecification.
     * 
     * @param value
     *     allowed object is
     *     {@link FileFormatSpecification }
     *     
     */
    public void setFileformatspecification(FileFormatSpecification value) {
        this.fileformatspecification = value;
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
     * Obtiene el valor de la propiedad path.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Define el valor de la propiedad path.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof File)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final File that = ((File) object);
        {
            FileFormatSpecification lhsFileformatspecification;
            lhsFileformatspecification = this.getFileformatspecification();
            FileFormatSpecification rhsFileformatspecification;
            rhsFileformatspecification = that.getFileformatspecification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileformatspecification", lhsFileformatspecification), LocatorUtils.property(thatLocator, "fileformatspecification", rhsFileformatspecification), lhsFileformatspecification, rhsFileformatspecification)) {
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
            String lhsPath;
            lhsPath = this.getPath();
            String rhsPath;
            rhsPath = that.getPath();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "path", lhsPath), LocatorUtils.property(thatLocator, "path", rhsPath), lhsPath, rhsPath)) {
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
            FileFormatSpecification theFileformatspecification;
            theFileformatspecification = this.getFileformatspecification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileformatspecification", theFileformatspecification), currentHashCode, theFileformatspecification);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String thePath;
            thePath = this.getPath();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "path", thePath), currentHashCode, thePath);
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
        if (draftCopy instanceof File) {
            final File copy = ((File) draftCopy);
            if (this.fileformatspecification!= null) {
                FileFormatSpecification sourceFileformatspecification;
                sourceFileformatspecification = this.getFileformatspecification();
                FileFormatSpecification copyFileformatspecification = ((FileFormatSpecification) strategy.copy(LocatorUtils.property(locator, "fileformatspecification", sourceFileformatspecification), sourceFileformatspecification));
                copy.setFileformatspecification(copyFileformatspecification);
            } else {
                copy.fileformatspecification = null;
            }
            if (this.name!= null) {
                String sourceName;
                sourceName = this.getName();
                String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
            if (this.path!= null) {
                String sourcePath;
                sourcePath = this.getPath();
                String copyPath = ((String) strategy.copy(LocatorUtils.property(locator, "path", sourcePath), sourcePath));
                copy.setPath(copyPath);
            } else {
                copy.path = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new File();
    }

}
