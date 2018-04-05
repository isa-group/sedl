//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.05 a las 07:27:38 PM CEST 
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
 * <p>Clase Java para ComplexParameter complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ComplexParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/configuration}Parameter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parameters" type="{http://isa.us.es/sedl/core/configuration}Parameter" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexParameter", propOrder = {
    "parameters"
})
public class ComplexParameter
    extends Parameter
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected List<Parameter> parameters;

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parameter }
     * 
     * 
     */
    public List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<Parameter>();
        }
        return this.parameters;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ComplexParameter)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ComplexParameter that = ((ComplexParameter) object);
        {
            List<Parameter> lhsParameters;
            lhsParameters = (((this.parameters!= null)&&(!this.parameters.isEmpty()))?this.getParameters():null);
            List<Parameter> rhsParameters;
            rhsParameters = (((that.parameters!= null)&&(!that.parameters.isEmpty()))?that.getParameters():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parameters", lhsParameters), LocatorUtils.property(thatLocator, "parameters", rhsParameters), lhsParameters, rhsParameters)) {
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
            List<Parameter> theParameters;
            theParameters = (((this.parameters!= null)&&(!this.parameters.isEmpty()))?this.getParameters():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parameters", theParameters), currentHashCode, theParameters);
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
        if (draftCopy instanceof ComplexParameter) {
            final ComplexParameter copy = ((ComplexParameter) draftCopy);
            if ((this.parameters!= null)&&(!this.parameters.isEmpty())) {
                List<Parameter> sourceParameters;
                sourceParameters = (((this.parameters!= null)&&(!this.parameters.isEmpty()))?this.getParameters():null);
                @SuppressWarnings("unchecked")
                List<Parameter> copyParameters = ((List<Parameter> ) strategy.copy(LocatorUtils.property(locator, "parameters", sourceParameters), sourceParameters));
                copy.parameters = null;
                if (copyParameters!= null) {
                    List<Parameter> uniqueParametersl = copy.getParameters();
                    uniqueParametersl.addAll(copyParameters);
                }
            } else {
                copy.parameters = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ComplexParameter();
    }

}
