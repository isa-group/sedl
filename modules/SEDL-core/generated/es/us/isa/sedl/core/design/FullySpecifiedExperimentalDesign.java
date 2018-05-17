//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.17 a las 12:43:04 AM CEST 
//


package es.us.isa.sedl.core.design;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * Custom experimental desgins must specify: the assignmet method used for grouping, the set of groups that are involved in the experiment, the 
 *                 experimental protocol (i.e. the specific sequence of treatments and measurements to be performed on each group of experimental individuals), and
 *                 the set of analyses to be performed on the results of the experiments.
 * 
 * <p>Clase Java para FullySpecifiedExperimentalDesign complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FullySpecifiedExperimentalDesign"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core/design}ExperimentalDesign"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assignmentMethod" type="{http://isa.us.es/sedl/core/design}AssignmentMethod"/&gt;
 *         &lt;element name="groups" type="{http://isa.us.es/sedl/core/design}Group" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="experimentalProtocol" type="{http://isa.us.es/sedl/core/design}ExperimentalProtocol"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="blockingVariables"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullySpecifiedExperimentalDesign", propOrder = {
    "assignmentMethod",
    "groups",
    "experimentalProtocol"
})
public class FullySpecifiedExperimentalDesign
    extends ExperimentalDesign
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElement(required = true)
    protected AssignmentMethod assignmentMethod;
    protected List<Group> groups;
    @XmlElement(required = true)
    protected ExperimentalProtocol experimentalProtocol;
    @XmlAttribute(name = "blockingVariables")
    protected List<String> blockingVariables;

    /**
     * Obtiene el valor de la propiedad assignmentMethod.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentMethod }
     *     
     */
    public AssignmentMethod getAssignmentMethod() {
        return assignmentMethod;
    }

    /**
     * Define el valor de la propiedad assignmentMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentMethod }
     *     
     */
    public void setAssignmentMethod(AssignmentMethod value) {
        this.assignmentMethod = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Group }
     * 
     * 
     */
    public List<Group> getGroups() {
        if (groups == null) {
            groups = new ArrayList<Group>();
        }
        return this.groups;
    }

    /**
     * Obtiene el valor de la propiedad experimentalProtocol.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentalProtocol }
     *     
     */
    public ExperimentalProtocol getExperimentalProtocol() {
        return experimentalProtocol;
    }

    /**
     * Define el valor de la propiedad experimentalProtocol.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentalProtocol }
     *     
     */
    public void setExperimentalProtocol(ExperimentalProtocol value) {
        this.experimentalProtocol = value;
    }

    /**
     * Gets the value of the blockingVariables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockingVariables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockingVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBlockingVariables() {
        if (blockingVariables == null) {
            blockingVariables = new ArrayList<String>();
        }
        return this.blockingVariables;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FullySpecifiedExperimentalDesign)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FullySpecifiedExperimentalDesign that = ((FullySpecifiedExperimentalDesign) object);
        {
            AssignmentMethod lhsAssignmentMethod;
            lhsAssignmentMethod = this.getAssignmentMethod();
            AssignmentMethod rhsAssignmentMethod;
            rhsAssignmentMethod = that.getAssignmentMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assignmentMethod", lhsAssignmentMethod), LocatorUtils.property(thatLocator, "assignmentMethod", rhsAssignmentMethod), lhsAssignmentMethod, rhsAssignmentMethod)) {
                return false;
            }
        }
        {
            List<Group> lhsGroups;
            lhsGroups = (((this.groups!= null)&&(!this.groups.isEmpty()))?this.getGroups():null);
            List<Group> rhsGroups;
            rhsGroups = (((that.groups!= null)&&(!that.groups.isEmpty()))?that.getGroups():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "groups", lhsGroups), LocatorUtils.property(thatLocator, "groups", rhsGroups), lhsGroups, rhsGroups)) {
                return false;
            }
        }
        {
            ExperimentalProtocol lhsExperimentalProtocol;
            lhsExperimentalProtocol = this.getExperimentalProtocol();
            ExperimentalProtocol rhsExperimentalProtocol;
            rhsExperimentalProtocol = that.getExperimentalProtocol();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "experimentalProtocol", lhsExperimentalProtocol), LocatorUtils.property(thatLocator, "experimentalProtocol", rhsExperimentalProtocol), lhsExperimentalProtocol, rhsExperimentalProtocol)) {
                return false;
            }
        }
        {
            List<String> lhsBlockingVariables;
            lhsBlockingVariables = (((this.blockingVariables!= null)&&(!this.blockingVariables.isEmpty()))?this.getBlockingVariables():null);
            List<String> rhsBlockingVariables;
            rhsBlockingVariables = (((that.blockingVariables!= null)&&(!that.blockingVariables.isEmpty()))?that.getBlockingVariables():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "blockingVariables", lhsBlockingVariables), LocatorUtils.property(thatLocator, "blockingVariables", rhsBlockingVariables), lhsBlockingVariables, rhsBlockingVariables)) {
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
            AssignmentMethod theAssignmentMethod;
            theAssignmentMethod = this.getAssignmentMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assignmentMethod", theAssignmentMethod), currentHashCode, theAssignmentMethod);
        }
        {
            List<Group> theGroups;
            theGroups = (((this.groups!= null)&&(!this.groups.isEmpty()))?this.getGroups():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groups", theGroups), currentHashCode, theGroups);
        }
        {
            ExperimentalProtocol theExperimentalProtocol;
            theExperimentalProtocol = this.getExperimentalProtocol();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "experimentalProtocol", theExperimentalProtocol), currentHashCode, theExperimentalProtocol);
        }
        {
            List<String> theBlockingVariables;
            theBlockingVariables = (((this.blockingVariables!= null)&&(!this.blockingVariables.isEmpty()))?this.getBlockingVariables():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "blockingVariables", theBlockingVariables), currentHashCode, theBlockingVariables);
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
        if (draftCopy instanceof FullySpecifiedExperimentalDesign) {
            final FullySpecifiedExperimentalDesign copy = ((FullySpecifiedExperimentalDesign) draftCopy);
            if (this.assignmentMethod!= null) {
                AssignmentMethod sourceAssignmentMethod;
                sourceAssignmentMethod = this.getAssignmentMethod();
                AssignmentMethod copyAssignmentMethod = ((AssignmentMethod) strategy.copy(LocatorUtils.property(locator, "assignmentMethod", sourceAssignmentMethod), sourceAssignmentMethod));
                copy.setAssignmentMethod(copyAssignmentMethod);
            } else {
                copy.assignmentMethod = null;
            }
            if ((this.groups!= null)&&(!this.groups.isEmpty())) {
                List<Group> sourceGroups;
                sourceGroups = (((this.groups!= null)&&(!this.groups.isEmpty()))?this.getGroups():null);
                @SuppressWarnings("unchecked")
                List<Group> copyGroups = ((List<Group> ) strategy.copy(LocatorUtils.property(locator, "groups", sourceGroups), sourceGroups));
                copy.groups = null;
                if (copyGroups!= null) {
                    List<Group> uniqueGroupsl = copy.getGroups();
                    uniqueGroupsl.addAll(copyGroups);
                }
            } else {
                copy.groups = null;
            }
            if (this.experimentalProtocol!= null) {
                ExperimentalProtocol sourceExperimentalProtocol;
                sourceExperimentalProtocol = this.getExperimentalProtocol();
                ExperimentalProtocol copyExperimentalProtocol = ((ExperimentalProtocol) strategy.copy(LocatorUtils.property(locator, "experimentalProtocol", sourceExperimentalProtocol), sourceExperimentalProtocol));
                copy.setExperimentalProtocol(copyExperimentalProtocol);
            } else {
                copy.experimentalProtocol = null;
            }
            if ((this.blockingVariables!= null)&&(!this.blockingVariables.isEmpty())) {
                List<String> sourceBlockingVariables;
                sourceBlockingVariables = (((this.blockingVariables!= null)&&(!this.blockingVariables.isEmpty()))?this.getBlockingVariables():null);
                @SuppressWarnings("unchecked")
                List<String> copyBlockingVariables = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "blockingVariables", sourceBlockingVariables), sourceBlockingVariables));
                copy.blockingVariables = null;
                if (copyBlockingVariables!= null) {
                    List<String> uniqueBlockingVariablesl = copy.getBlockingVariables();
                    uniqueBlockingVariablesl.addAll(copyBlockingVariables);
                }
            } else {
                copy.blockingVariables = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FullySpecifiedExperimentalDesign();
    }

}
