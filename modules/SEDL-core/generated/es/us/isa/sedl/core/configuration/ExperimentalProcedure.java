//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.06 a las 05:46:41 PM CEST 
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
 *       &lt;sequence&gt;
 *         &lt;element name="tasks" type="{http://isa.us.es/sedl/core/configuration}ExperimentalTask" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExperimentalProcedure", propOrder = {
    "tasks"
})
public class ExperimentalProcedure
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected List<ExperimentalTask> tasks;

    /**
     * Gets the value of the tasks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tasks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTasks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExperimentalTask }
     * 
     * 
     */
    public List<ExperimentalTask> getTasks() {
        if (tasks == null) {
            tasks = new ArrayList<ExperimentalTask>();
        }
        return this.tasks;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ExperimentalProcedure)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ExperimentalProcedure that = ((ExperimentalProcedure) object);
        {
            List<ExperimentalTask> lhsTasks;
            lhsTasks = (((this.tasks!= null)&&(!this.tasks.isEmpty()))?this.getTasks():null);
            List<ExperimentalTask> rhsTasks;
            rhsTasks = (((that.tasks!= null)&&(!that.tasks.isEmpty()))?that.getTasks():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tasks", lhsTasks), LocatorUtils.property(thatLocator, "tasks", rhsTasks), lhsTasks, rhsTasks)) {
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
            List<ExperimentalTask> theTasks;
            theTasks = (((this.tasks!= null)&&(!this.tasks.isEmpty()))?this.getTasks():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tasks", theTasks), currentHashCode, theTasks);
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
        if (draftCopy instanceof ExperimentalProcedure) {
            final ExperimentalProcedure copy = ((ExperimentalProcedure) draftCopy);
            if ((this.tasks!= null)&&(!this.tasks.isEmpty())) {
                List<ExperimentalTask> sourceTasks;
                sourceTasks = (((this.tasks!= null)&&(!this.tasks.isEmpty()))?this.getTasks():null);
                @SuppressWarnings("unchecked")
                List<ExperimentalTask> copyTasks = ((List<ExperimentalTask> ) strategy.copy(LocatorUtils.property(locator, "tasks", sourceTasks), sourceTasks));
                copy.tasks = null;
                if (copyTasks!= null) {
                    List<ExperimentalTask> uniqueTasksl = copy.getTasks();
                    uniqueTasksl.addAll(copyTasks);
                }
            } else {
                copy.tasks = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ExperimentalProcedure();
    }

}
