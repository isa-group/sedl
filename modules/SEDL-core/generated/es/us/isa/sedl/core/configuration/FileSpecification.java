//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.23 a las 02:44:29 PM CEST 
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
 * <p>Clase Java para FileSpecification complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FileSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileFormatSpecification" type="{http://isa.us.es/sedl/core/configuration}FileFormatSpecification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="namePattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="pathPattern" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="context" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileSpecification", propOrder = {
    "fileFormatSpecification"
})
public class FileSpecification
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected FileFormatSpecification fileFormatSpecification;
    @XmlAttribute(name = "namePattern", required = true)
    protected String namePattern;
    @XmlAttribute(name = "pathPattern")
    protected String pathPattern;
    @XmlAttribute(name = "context")
    protected String context;
    @XmlAttribute(name = "description")
    protected String description;

    /**
     * Obtiene el valor de la propiedad fileFormatSpecification.
     * 
     * @return
     *     possible object is
     *     {@link FileFormatSpecification }
     *     
     */
    public FileFormatSpecification getFileFormatSpecification() {
        return fileFormatSpecification;
    }

    /**
     * Define el valor de la propiedad fileFormatSpecification.
     * 
     * @param value
     *     allowed object is
     *     {@link FileFormatSpecification }
     *     
     */
    public void setFileFormatSpecification(FileFormatSpecification value) {
        this.fileFormatSpecification = value;
    }

    /**
     * Obtiene el valor de la propiedad namePattern.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePattern() {
        return namePattern;
    }

    /**
     * Define el valor de la propiedad namePattern.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePattern(String value) {
        this.namePattern = value;
    }

    /**
     * Obtiene el valor de la propiedad pathPattern.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathPattern() {
        return pathPattern;
    }

    /**
     * Define el valor de la propiedad pathPattern.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathPattern(String value) {
        this.pathPattern = value;
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

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FileSpecification)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FileSpecification that = ((FileSpecification) object);
        {
            FileFormatSpecification lhsFileFormatSpecification;
            lhsFileFormatSpecification = this.getFileFormatSpecification();
            FileFormatSpecification rhsFileFormatSpecification;
            rhsFileFormatSpecification = that.getFileFormatSpecification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileFormatSpecification", lhsFileFormatSpecification), LocatorUtils.property(thatLocator, "fileFormatSpecification", rhsFileFormatSpecification), lhsFileFormatSpecification, rhsFileFormatSpecification)) {
                return false;
            }
        }
        {
            String lhsNamePattern;
            lhsNamePattern = this.getNamePattern();
            String rhsNamePattern;
            rhsNamePattern = that.getNamePattern();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "namePattern", lhsNamePattern), LocatorUtils.property(thatLocator, "namePattern", rhsNamePattern), lhsNamePattern, rhsNamePattern)) {
                return false;
            }
        }
        {
            String lhsPathPattern;
            lhsPathPattern = this.getPathPattern();
            String rhsPathPattern;
            rhsPathPattern = that.getPathPattern();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pathPattern", lhsPathPattern), LocatorUtils.property(thatLocator, "pathPattern", rhsPathPattern), lhsPathPattern, rhsPathPattern)) {
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
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
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
            FileFormatSpecification theFileFormatSpecification;
            theFileFormatSpecification = this.getFileFormatSpecification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileFormatSpecification", theFileFormatSpecification), currentHashCode, theFileFormatSpecification);
        }
        {
            String theNamePattern;
            theNamePattern = this.getNamePattern();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "namePattern", theNamePattern), currentHashCode, theNamePattern);
        }
        {
            String thePathPattern;
            thePathPattern = this.getPathPattern();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pathPattern", thePathPattern), currentHashCode, thePathPattern);
        }
        {
            String theContext;
            theContext = this.getContext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "context", theContext), currentHashCode, theContext);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
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
        if (draftCopy instanceof FileSpecification) {
            final FileSpecification copy = ((FileSpecification) draftCopy);
            if (this.fileFormatSpecification!= null) {
                FileFormatSpecification sourceFileFormatSpecification;
                sourceFileFormatSpecification = this.getFileFormatSpecification();
                FileFormatSpecification copyFileFormatSpecification = ((FileFormatSpecification) strategy.copy(LocatorUtils.property(locator, "fileFormatSpecification", sourceFileFormatSpecification), sourceFileFormatSpecification));
                copy.setFileFormatSpecification(copyFileFormatSpecification);
            } else {
                copy.fileFormatSpecification = null;
            }
            if (this.namePattern!= null) {
                String sourceNamePattern;
                sourceNamePattern = this.getNamePattern();
                String copyNamePattern = ((String) strategy.copy(LocatorUtils.property(locator, "namePattern", sourceNamePattern), sourceNamePattern));
                copy.setNamePattern(copyNamePattern);
            } else {
                copy.namePattern = null;
            }
            if (this.pathPattern!= null) {
                String sourcePathPattern;
                sourcePathPattern = this.getPathPattern();
                String copyPathPattern = ((String) strategy.copy(LocatorUtils.property(locator, "pathPattern", sourcePathPattern), sourcePathPattern));
                copy.setPathPattern(copyPathPattern);
            } else {
                copy.pathPattern = null;
            }
            if (this.context!= null) {
                String sourceContext;
                sourceContext = this.getContext();
                String copyContext = ((String) strategy.copy(LocatorUtils.property(locator, "context", sourceContext), sourceContext));
                copy.setContext(copyContext);
            } else {
                copy.context = null;
            }
            if (this.description!= null) {
                String sourceDescription;
                sourceDescription = this.getDescription();
                String copyDescription = ((String) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription));
                copy.setDescription(copyDescription);
            } else {
                copy.description = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FileSpecification();
    }

}
