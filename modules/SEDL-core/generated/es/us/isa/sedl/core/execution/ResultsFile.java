//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.01.07 a las 06:11:32 PM CET 
//


package es.us.isa.sedl.core.execution;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.us.isa.sedl.core.configuration.File;
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
 * <p>Clase Java para ResultsFile complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResultsFile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/execution}ExperimentalResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="variableMapping" type="{http://isa.us.es/sedl/core/execution}DataMapping" minOccurs="0"/&gt;
 *         &lt;element name="fileFormat" type="{http://isa.us.es/sedl/core/execution}FileFormat"/&gt;
 *         &lt;element name="file" type="{http://isa.us.es/sedl/core/configuration}File"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultsFile", propOrder = {
    "variableMapping",
    "fileFormat",
    "file"
})
public class ResultsFile
    extends ExperimentalResult
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected DataMapping variableMapping;
    @XmlElement(required = true)
    protected FileFormat fileFormat;
    @XmlElement(required = true)
    protected File file;

    /**
     * Obtiene el valor de la propiedad variableMapping.
     * 
     * @return
     *     possible object is
     *     {@link DataMapping }
     *     
     */
    public DataMapping getVariableMapping() {
        return variableMapping;
    }

    /**
     * Define el valor de la propiedad variableMapping.
     * 
     * @param value
     *     allowed object is
     *     {@link DataMapping }
     *     
     */
    public void setVariableMapping(DataMapping value) {
        this.variableMapping = value;
    }

    /**
     * Obtiene el valor de la propiedad fileFormat.
     * 
     * @return
     *     possible object is
     *     {@link FileFormat }
     *     
     */
    public FileFormat getFileFormat() {
        return fileFormat;
    }

    /**
     * Define el valor de la propiedad fileFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link FileFormat }
     *     
     */
    public void setFileFormat(FileFormat value) {
        this.fileFormat = value;
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ResultsFile)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ResultsFile that = ((ResultsFile) object);
        {
            DataMapping lhsVariableMapping;
            lhsVariableMapping = this.getVariableMapping();
            DataMapping rhsVariableMapping;
            rhsVariableMapping = that.getVariableMapping();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "variableMapping", lhsVariableMapping), LocatorUtils.property(thatLocator, "variableMapping", rhsVariableMapping), lhsVariableMapping, rhsVariableMapping)) {
                return false;
            }
        }
        {
            FileFormat lhsFileFormat;
            lhsFileFormat = this.getFileFormat();
            FileFormat rhsFileFormat;
            rhsFileFormat = that.getFileFormat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileFormat", lhsFileFormat), LocatorUtils.property(thatLocator, "fileFormat", rhsFileFormat), lhsFileFormat, rhsFileFormat)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            DataMapping theVariableMapping;
            theVariableMapping = this.getVariableMapping();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "variableMapping", theVariableMapping), currentHashCode, theVariableMapping);
        }
        {
            FileFormat theFileFormat;
            theFileFormat = this.getFileFormat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileFormat", theFileFormat), currentHashCode, theFileFormat);
        }
        {
            File theFile;
            theFile = this.getFile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "file", theFile), currentHashCode, theFile);
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
        if (draftCopy instanceof ResultsFile) {
            final ResultsFile copy = ((ResultsFile) draftCopy);
            if (this.variableMapping!= null) {
                DataMapping sourceVariableMapping;
                sourceVariableMapping = this.getVariableMapping();
                DataMapping copyVariableMapping = ((DataMapping) strategy.copy(LocatorUtils.property(locator, "variableMapping", sourceVariableMapping), sourceVariableMapping));
                copy.setVariableMapping(copyVariableMapping);
            } else {
                copy.variableMapping = null;
            }
            if (this.fileFormat!= null) {
                FileFormat sourceFileFormat;
                sourceFileFormat = this.getFileFormat();
                FileFormat copyFileFormat = ((FileFormat) strategy.copy(LocatorUtils.property(locator, "fileFormat", sourceFileFormat), sourceFileFormat));
                copy.setFileFormat(copyFileFormat);
            } else {
                copy.fileFormat = null;
            }
            if (this.file!= null) {
                File sourceFile;
                sourceFile = this.getFile();
                File copyFile = ((File) strategy.copy(LocatorUtils.property(locator, "file", sourceFile), sourceFile));
                copy.setFile(copyFile);
            } else {
                copy.file = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ResultsFile();
    }

}
