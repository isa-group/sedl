//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:22:58 PM CET 
//


package es.us.isa.sedl.core.configuration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import es.us.isa.sedl.core.design.VariableValuation;
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
 * 		 The inputDatasource type is an element that denotes individual inputs for the experiment.
 * 		 It has bee declared abstract to emphasize that it is an extension point, that must be used
 * 		 to define concrete types of input datasources. SEDL 1.0 provides two different types of
 * 		 input datasources: files and URLs.        				 				  				 
 *                  Since input datasources can be associated to specific levels of some variables it can contain
 *                  an arbitraty sequence of variable valuations.
 * 
 * 
 * <p>Clase Java para InputDataSource complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InputDataSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileSpecification" type="{http://isa.us.es/sedl/core/configuration}FileSpecification" minOccurs="0"/&gt;
 *         &lt;element name="features" type="{http://isa.us.es/sedl/core/design}VariableValuation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="file" type="{http://isa.us.es/sedl/core/configuration}File" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputDataSource", propOrder = {
    "fileSpecification",
    "features",
    "file"
})
public class InputDataSource
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected FileSpecification fileSpecification;
    protected List<VariableValuation> features;
    protected File file;

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
     * Gets the value of the features property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the features property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariableValuation }
     * 
     * 
     */
    public List<VariableValuation> getFeatures() {
        if (features == null) {
            features = new ArrayList<VariableValuation>();
        }
        return this.features;
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
        if (!(object instanceof InputDataSource)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final InputDataSource that = ((InputDataSource) object);
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
            List<VariableValuation> lhsFeatures;
            lhsFeatures = (((this.features!= null)&&(!this.features.isEmpty()))?this.getFeatures():null);
            List<VariableValuation> rhsFeatures;
            rhsFeatures = (((that.features!= null)&&(!that.features.isEmpty()))?that.getFeatures():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "features", lhsFeatures), LocatorUtils.property(thatLocator, "features", rhsFeatures), lhsFeatures, rhsFeatures)) {
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
        int currentHashCode = 1;
        {
            FileSpecification theFileSpecification;
            theFileSpecification = this.getFileSpecification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileSpecification", theFileSpecification), currentHashCode, theFileSpecification);
        }
        {
            List<VariableValuation> theFeatures;
            theFeatures = (((this.features!= null)&&(!this.features.isEmpty()))?this.getFeatures():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "features", theFeatures), currentHashCode, theFeatures);
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
        if (draftCopy instanceof InputDataSource) {
            final InputDataSource copy = ((InputDataSource) draftCopy);
            if (this.fileSpecification!= null) {
                FileSpecification sourceFileSpecification;
                sourceFileSpecification = this.getFileSpecification();
                FileSpecification copyFileSpecification = ((FileSpecification) strategy.copy(LocatorUtils.property(locator, "fileSpecification", sourceFileSpecification), sourceFileSpecification));
                copy.setFileSpecification(copyFileSpecification);
            } else {
                copy.fileSpecification = null;
            }
            if ((this.features!= null)&&(!this.features.isEmpty())) {
                List<VariableValuation> sourceFeatures;
                sourceFeatures = (((this.features!= null)&&(!this.features.isEmpty()))?this.getFeatures():null);
                @SuppressWarnings("unchecked")
                List<VariableValuation> copyFeatures = ((List<VariableValuation> ) strategy.copy(LocatorUtils.property(locator, "features", sourceFeatures), sourceFeatures));
                copy.features = null;
                if (copyFeatures!= null) {
                    List<VariableValuation> uniqueFeaturesl = copy.getFeatures();
                    uniqueFeaturesl.addAll(copyFeatures);
                }
            } else {
                copy.features = null;
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
        return new InputDataSource();
    }

}
