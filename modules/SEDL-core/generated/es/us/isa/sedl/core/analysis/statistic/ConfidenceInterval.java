//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:22:58 PM CET 
//


package es.us.isa.sedl.core.analysis.statistic;

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
 * <p>Clase Java para ConfidenceInterval complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConfidenceInterval"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/analysis/statistic}InferentialStatistic"&gt;
 *       &lt;attribute name="confidenceLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfidenceInterval")
public class ConfidenceInterval
    extends AbstractConfidenceInterval
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "confidenceLevel", required = true)
    protected double confidenceLevel;

    /**
     * Obtiene el valor de la propiedad confidenceLevel.
     * 
     */
    public double getConfidenceLevel() {
        return confidenceLevel;
    }

    /**
     * Define el valor de la propiedad confidenceLevel.
     * 
     */
    public void setConfidenceLevel(double value) {
        this.confidenceLevel = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ConfidenceInterval)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ConfidenceInterval that = ((ConfidenceInterval) object);
        {
            double lhsConfidenceLevel;
            lhsConfidenceLevel = (true?this.getConfidenceLevel(): 0.0D);
            double rhsConfidenceLevel;
            rhsConfidenceLevel = (true?that.getConfidenceLevel(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "confidenceLevel", lhsConfidenceLevel), LocatorUtils.property(thatLocator, "confidenceLevel", rhsConfidenceLevel), lhsConfidenceLevel, rhsConfidenceLevel)) {
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
            double theConfidenceLevel;
            theConfidenceLevel = (true?this.getConfidenceLevel(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "confidenceLevel", theConfidenceLevel), currentHashCode, theConfidenceLevel);
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
        if (draftCopy instanceof ConfidenceInterval) {
            final ConfidenceInterval copy = ((ConfidenceInterval) draftCopy);
            double sourceConfidenceLevel;
            sourceConfidenceLevel = (true?this.getConfidenceLevel(): 0.0D);
            double copyConfidenceLevel = strategy.copy(LocatorUtils.property(locator, "confidenceLevel", sourceConfidenceLevel), sourceConfidenceLevel);
            copy.setConfidenceLevel(copyConfidenceLevel);
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ConfidenceInterval();
    }

}
