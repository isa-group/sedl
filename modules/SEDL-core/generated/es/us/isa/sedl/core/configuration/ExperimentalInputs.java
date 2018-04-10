//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.10 a las 01:14:05 PM CEST 
//


package es.us.isa.sedl.core.configuration;

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
 * 
 * Experimental Inputs are a description of the input data required for the execution of the experiment
 * 		 in the specific configuration. This description could be used to test the replicability of the experiment
 * 		 in an specific evironment, by checking the availability of those inputs. Currently it is composed of
 * 		 a set of inputDataSources.       				 				  				 
 * 
 * 
 * <p>Clase Java para ExperimentalInputs complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExperimentalInputs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inputDataSources" type="{http://isa.us.es/sedl/core/configuration}InputDataSource" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExperimentalInputs", propOrder = {
    "inputDataSources"
})
public class ExperimentalInputs
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected List<InputDataSource> inputDataSources;

    /**
     * Gets the value of the inputDataSources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputDataSources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputDataSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InputDataSource }
     * 
     * 
     */
    public List<InputDataSource> getInputDataSources() {
        if (inputDataSources == null) {
            inputDataSources = new ArrayList<InputDataSource>();
        }
        return this.inputDataSources;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ExperimentalInputs)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ExperimentalInputs that = ((ExperimentalInputs) object);
        {
            List<InputDataSource> lhsInputDataSources;
            lhsInputDataSources = (((this.inputDataSources!= null)&&(!this.inputDataSources.isEmpty()))?this.getInputDataSources():null);
            List<InputDataSource> rhsInputDataSources;
            rhsInputDataSources = (((that.inputDataSources!= null)&&(!that.inputDataSources.isEmpty()))?that.getInputDataSources():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inputDataSources", lhsInputDataSources), LocatorUtils.property(thatLocator, "inputDataSources", rhsInputDataSources), lhsInputDataSources, rhsInputDataSources)) {
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
            List<InputDataSource> theInputDataSources;
            theInputDataSources = (((this.inputDataSources!= null)&&(!this.inputDataSources.isEmpty()))?this.getInputDataSources():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inputDataSources", theInputDataSources), currentHashCode, theInputDataSources);
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
        if (draftCopy instanceof ExperimentalInputs) {
            final ExperimentalInputs copy = ((ExperimentalInputs) draftCopy);
            if ((this.inputDataSources!= null)&&(!this.inputDataSources.isEmpty())) {
                List<InputDataSource> sourceInputDataSources;
                sourceInputDataSources = (((this.inputDataSources!= null)&&(!this.inputDataSources.isEmpty()))?this.getInputDataSources():null);
                @SuppressWarnings("unchecked")
                List<InputDataSource> copyInputDataSources = ((List<InputDataSource> ) strategy.copy(LocatorUtils.property(locator, "inputDataSources", sourceInputDataSources), sourceInputDataSources));
                copy.inputDataSources = null;
                if (copyInputDataSources!= null) {
                    List<InputDataSource> uniqueInputDataSourcesl = copy.getInputDataSources();
                    uniqueInputDataSourcesl.addAll(copyInputDataSources);
                }
            } else {
                copy.inputDataSources = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ExperimentalInputs();
    }

}
