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
 * 		Experimental Outputs are a description of the expected output of the experiment. It 
 * 		contains a set of output data sources.
 * 
 * 
 * <p>Clase Java para ExperimentalOutputs complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExperimentalOutputs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="outputDataSources" type="{http://isa.us.es/sedl/core/configuration}OutputDataSource" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExperimentalOutputs", propOrder = {
    "outputDataSources"
})
public class ExperimentalOutputs
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected List<OutputDataSource> outputDataSources;

    /**
     * Gets the value of the outputDataSources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputDataSources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputDataSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputDataSource }
     * 
     * 
     */
    public List<OutputDataSource> getOutputDataSources() {
        if (outputDataSources == null) {
            outputDataSources = new ArrayList<OutputDataSource>();
        }
        return this.outputDataSources;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ExperimentalOutputs)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ExperimentalOutputs that = ((ExperimentalOutputs) object);
        {
            List<OutputDataSource> lhsOutputDataSources;
            lhsOutputDataSources = (((this.outputDataSources!= null)&&(!this.outputDataSources.isEmpty()))?this.getOutputDataSources():null);
            List<OutputDataSource> rhsOutputDataSources;
            rhsOutputDataSources = (((that.outputDataSources!= null)&&(!that.outputDataSources.isEmpty()))?that.getOutputDataSources():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outputDataSources", lhsOutputDataSources), LocatorUtils.property(thatLocator, "outputDataSources", rhsOutputDataSources), lhsOutputDataSources, rhsOutputDataSources)) {
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
            List<OutputDataSource> theOutputDataSources;
            theOutputDataSources = (((this.outputDataSources!= null)&&(!this.outputDataSources.isEmpty()))?this.getOutputDataSources():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outputDataSources", theOutputDataSources), currentHashCode, theOutputDataSources);
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
        if (draftCopy instanceof ExperimentalOutputs) {
            final ExperimentalOutputs copy = ((ExperimentalOutputs) draftCopy);
            if ((this.outputDataSources!= null)&&(!this.outputDataSources.isEmpty())) {
                List<OutputDataSource> sourceOutputDataSources;
                sourceOutputDataSources = (((this.outputDataSources!= null)&&(!this.outputDataSources.isEmpty()))?this.getOutputDataSources():null);
                @SuppressWarnings("unchecked")
                List<OutputDataSource> copyOutputDataSources = ((List<OutputDataSource> ) strategy.copy(LocatorUtils.property(locator, "outputDataSources", sourceOutputDataSources), sourceOutputDataSources));
                copy.outputDataSources = null;
                if (copyOutputDataSources!= null) {
                    List<OutputDataSource> uniqueOutputDataSourcesl = copy.getOutputDataSources();
                    uniqueOutputDataSourcesl.addAll(copyOutputDataSources);
                }
            } else {
                copy.outputDataSources = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ExperimentalOutputs();
    }

}
