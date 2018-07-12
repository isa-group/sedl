//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.06.26 a las 12:16:30 PM CEST 
//


package es.us.isa.sedl.core.context;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import es.us.isa.sedl.core.SEDLEntity;
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
 * Projects have a name, a code, an optional type (that could be used to define the EU FP project type or other taxonomy of projects), 
 * 					and an optional program (e.g the 7th FP), and an optional website (URL). 
 * 
 * 
 * <p>Clase Java para Project complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Project"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core}SEDLEntity"&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.eclipse.org/uml2/5.0.0/Types}String" /&gt;
 *       &lt;attribute name="code" use="required" type="{http://www.eclipse.org/uml2/5.0.0/Types}String" /&gt;
 *       &lt;attribute name="program" use="required" type="{http://www.eclipse.org/uml2/5.0.0/Types}String" /&gt;
 *       &lt;attribute name="type" use="required" type="{http://www.eclipse.org/uml2/5.0.0/Types}String" /&gt;
 *       &lt;attribute name="website" use="required" type="{http://www.eclipse.org/uml2/5.0.0/Types}String" /&gt;
 *       &lt;attribute name="participant" use="required"&gt;
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
@XmlType(name = "Project")
public class Project
    extends SEDLEntity
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "code", required = true)
    protected String code;
    @XmlAttribute(name = "program", required = true)
    protected String program;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "website", required = true)
    protected String website;
    @XmlAttribute(name = "participant", required = true)
    protected List<String> participant;

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad program.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgram() {
        return program;
    }

    /**
     * Define el valor de la propiedad program.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgram(String value) {
        this.program = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad website.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Define el valor de la propiedad website.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    /**
     * Gets the value of the participant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParticipant() {
        if (participant == null) {
            participant = new ArrayList<String>();
        }
        return this.participant;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Project)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Project that = ((Project) object);
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsCode;
            lhsCode = this.getCode();
            String rhsCode;
            rhsCode = that.getCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
                return false;
            }
        }
        {
            String lhsProgram;
            lhsProgram = this.getProgram();
            String rhsProgram;
            rhsProgram = that.getProgram();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "program", lhsProgram), LocatorUtils.property(thatLocator, "program", rhsProgram), lhsProgram, rhsProgram)) {
                return false;
            }
        }
        {
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            String lhsWebsite;
            lhsWebsite = this.getWebsite();
            String rhsWebsite;
            rhsWebsite = that.getWebsite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "website", lhsWebsite), LocatorUtils.property(thatLocator, "website", rhsWebsite), lhsWebsite, rhsWebsite)) {
                return false;
            }
        }
        {
            List<String> lhsParticipant;
            lhsParticipant = (((this.participant!= null)&&(!this.participant.isEmpty()))?this.getParticipant():null);
            List<String> rhsParticipant;
            rhsParticipant = (((that.participant!= null)&&(!that.participant.isEmpty()))?that.getParticipant():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "participant", lhsParticipant), LocatorUtils.property(thatLocator, "participant", rhsParticipant), lhsParticipant, rhsParticipant)) {
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
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
        }
        {
            String theProgram;
            theProgram = this.getProgram();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "program", theProgram), currentHashCode, theProgram);
        }
        {
            String theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            String theWebsite;
            theWebsite = this.getWebsite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "website", theWebsite), currentHashCode, theWebsite);
        }
        {
            List<String> theParticipant;
            theParticipant = (((this.participant!= null)&&(!this.participant.isEmpty()))?this.getParticipant():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "participant", theParticipant), currentHashCode, theParticipant);
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
        if (draftCopy instanceof Project) {
            final Project copy = ((Project) draftCopy);
            if (this.name!= null) {
                String sourceName;
                sourceName = this.getName();
                String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
            if (this.code!= null) {
                String sourceCode;
                sourceCode = this.getCode();
                String copyCode = ((String) strategy.copy(LocatorUtils.property(locator, "code", sourceCode), sourceCode));
                copy.setCode(copyCode);
            } else {
                copy.code = null;
            }
            if (this.program!= null) {
                String sourceProgram;
                sourceProgram = this.getProgram();
                String copyProgram = ((String) strategy.copy(LocatorUtils.property(locator, "program", sourceProgram), sourceProgram));
                copy.setProgram(copyProgram);
            } else {
                copy.program = null;
            }
            if (this.type!= null) {
                String sourceType;
                sourceType = this.getType();
                String copyType = ((String) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType));
                copy.setType(copyType);
            } else {
                copy.type = null;
            }
            if (this.website!= null) {
                String sourceWebsite;
                sourceWebsite = this.getWebsite();
                String copyWebsite = ((String) strategy.copy(LocatorUtils.property(locator, "website", sourceWebsite), sourceWebsite));
                copy.setWebsite(copyWebsite);
            } else {
                copy.website = null;
            }
            if ((this.participant!= null)&&(!this.participant.isEmpty())) {
                List<String> sourceParticipant;
                sourceParticipant = (((this.participant!= null)&&(!this.participant.isEmpty()))?this.getParticipant():null);
                @SuppressWarnings("unchecked")
                List<String> copyParticipant = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "participant", sourceParticipant), sourceParticipant));
                copy.participant = null;
                if (copyParticipant!= null) {
                    List<String> uniqueParticipantl = copy.getParticipant();
                    uniqueParticipantl.addAll(copyParticipant);
                }
            } else {
                copy.participant = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Project();
    }

}
