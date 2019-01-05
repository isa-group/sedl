//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:49:52 PM CET 
//


package es.us.isa.sedl.core.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
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


/**
 * An experimental producedure is a detailed description of the steps that should be performed for
 * 		conducting the experiment in the especific context of its configuration. 
 * 		In this sense, the experimental procedure can be a much richer and detailed description than 
 * 		the experimental protocol, that only specifies the experimentation process in terms of group treatments
 * 		and dependent variable measurements.
 * 		The use of an appropriate language for describing experimental procedures is a key point for the achieving
 * 		exactly replicable experiment and even for the automatic experimental replication in those enviroments that
 * 		could alow it (such as for instance computer science). 
 * 		This element has been declared abstract to emphasize the need os specifying a concrete type of procedure
 * 		in this sense, the elements that extend the experimentalProcedureType element would define a experimental 
 * 		procedure description language. This is one of the main extension points of SEDL that should be used to 
 * 		define domain specific experimental procedures description languages in the scientific areas that require it.
 * 		However, for simple applications, we provide a basic experimental procedure description language based on the
 * 		 execution of a sequence of tasks (that are another possible extension point if no control flow or decission 
 * 		 structures are needed), and an specific type of task that enables the execution of commands in a OS shell for
 * 		 enabling the replication of Computer Science experiments as described below.
 * 
 * 
 * <p>Clase Java para ExperimentalProcedure complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExperimentalProcedure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExperimentalProcedure")
@XmlSeeAlso({
    TaskBasedExperimentalProcedure.class
})
public abstract class ExperimentalProcedure
    implements Cloneable, CopyTo, Equals, HashCode
{


    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ExperimentalProcedure)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        return target;
    }

}
