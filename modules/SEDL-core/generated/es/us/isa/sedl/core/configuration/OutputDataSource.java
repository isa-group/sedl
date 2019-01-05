//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:49:52 PM CET 
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
 * 
 * 		 The ouputDatasource type is an element that denotes individual output item for the experiment.
 * 		 It has been declared abstract to emphasize that it is an extension point, that must be used
 * 		 to define concrete types of output datasources. SEDL 1.0 provides a singlet types of specific
 * 		 output datasource: the  outputFiles element.        				 				  				 
 * 
 * 
 * <p>Clase Java para OutputDataSource complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OutputDataSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileSpecification" type="{http://isa.us.es/sedl/core/configuration}FileSpecification" minOccurs="0"/&gt;
 *         &lt;element name="file" type="{http://isa.us.es/sedl/core/configuration}File" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="role" use="required" type="{http://isa.us.es/sedl/core/configuration}OutputDataSourceRole" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputDataSource", propOrder = {
    "fileSpecification",
    "file"
})
public class OutputDataSource
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected FileSpecification fileSpecification;
    protected File file;
    @XmlAttribute(name = "role", required = true)
    protected OutputDataSourceRole role;

    /**
     * Obtiene el valor de la propiedad fileSpecification.
     * 
     * @return
     *     possible object is
     *     {@link FileSpecification }
     *     
     */
    public FileSpecification getFileSpecification() {
        return fileSpecification;
    }

    /**
     * Define el valor de la propiedad fileSpecification.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSpecification }
     *     
     */
    public void setFileSpecification(FileSpecification value) {
        this.fileSpecification = value;
    }

    /**
     * Obtiene el valor de la propiedad file.
     * 
     * @return
     *     possible object is
     *     {@link File }
     *     
     */
    public File getFile() {
        return file;
    }

    /**
     * Define el valor de la propiedad file.
     * 
     * @param value
     *     allowed object is
     *     {@link File }
     *     
     */
    public void setFile(File value) {
        this.file = value;
    }

    /**
     * Obtiene el valor de la propiedad role.
     * 
     * @return
     *     possible object is
     *     {@link OutputDataSourceRole }
     *     
     */
    public OutputDataSourceRole getRole() {
        return role;
    }

    /**
     * Define el valor de la propiedad role.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDataSourceRole }
     *     
     */
    public void setRole(OutputDataSourceRole value) {
        this.role = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OutputDataSource)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OutputDataSource that = ((OutputDataSource) object);
        {
            FileSpecification lhsFileSpecification;
            lhsFileSpecification = this.getFileSpecification();
            FileSpecification rhsFileSpecification;
            rhsFileSpecification = that.getFileSpecification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileSpecification", lhsFileSpecification), LocatorUtils.property(thatLocator, "fileSpecification", rhsFileSpecification), lhsFileSpecification, rhsFileSpecification)) {
                return false;
            }
        }
        {
            File lhsFile;
            lhsFile = this.getFile();
            File rhsFile;
            rhsFile = that.getFile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "file", lhsFile), LocatorUtils.property(thatLocator, "file", rhsFile), lhsFile, rhsFile)) {
                return false;
            }
        }
        {
            OutputDataSourceRole lhsRole;
            lhsRole = this.getRole();
            OutputDataSourceRole rhsRole;
            rhsRole = that.getRole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "role", lhsRole), LocatorUtils.property(thatLocator, "role", rhsRole), lhsRole, rhsRole)) {
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
            FileSpecification theFileSpecification;
            theFileSpecification = this.getFileSpecification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileSpecification", theFileSpecification), currentHashCode, theFileSpecification);
        }
        {
            File theFile;
            theFile = this.getFile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "file", theFile), currentHashCode, theFile);
        }
        {
            OutputDataSourceRole theRole;
            theRole = this.getRole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "role", theRole), currentHashCode, theRole);
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
        if (draftCopy instanceof OutputDataSource) {
            final OutputDataSource copy = ((OutputDataSource) draftCopy);
            if (this.fileSpecification!= null) {
                FileSpecification sourceFileSpecification;
                sourceFileSpecification = this.getFileSpecification();
                FileSpecification copyFileSpecification = ((FileSpecification) strategy.copy(LocatorUtils.property(locator, "fileSpecification", sourceFileSpecification), sourceFileSpecification));
                copy.setFileSpecification(copyFileSpecification);
            } else {
                copy.fileSpecification = null;
            }
            if (this.file!= null) {
                File sourceFile;
                sourceFile = this.getFile();
                File copyFile = ((File) strategy.copy(LocatorUtils.property(locator, "file", sourceFile), sourceFile));
                copy.setFile(copyFile);
            } else {
                copy.file = null;
            }
            if (this.role!= null) {
                OutputDataSourceRole sourceRole;
                sourceRole = this.getRole();
                OutputDataSourceRole copyRole = ((OutputDataSourceRole) strategy.copy(LocatorUtils.property(locator, "role", sourceRole), sourceRole));
                copy.setRole(copyRole);
            } else {
                copy.role = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new OutputDataSource();
    }

}
