//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:44:54 PM CET 
//


package es.us.isa.sedl.core.execution;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import es.us.isa.sedl.core.SedlEntity;
import es.us.isa.sedl.core.analysis.AnalysisResult;
import es.us.isa.sedl.core.configuration.ExperimentalSetting;
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
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Clase Java para Execution complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Execution"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://isa.us.es/sedl/core}SedlEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="log" type="{http://isa.us.es/sedl/core/execution}Log" minOccurs="0"/&gt;
 *         &lt;element name="results" type="{http://isa.us.es/sedl/core/execution}ExperimentalResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="experimentalSetting" type="{http://isa.us.es/sedl/core/configuration}ExperimentalSetting" minOccurs="0"/&gt;
 *         &lt;element name="analysisResults" type="{http://isa.us.es/sedl/core/analysis}AnalysisResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="finish" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Execution", propOrder = {
    "log",
    "results",
    "experimentalSetting",
    "analysisResults"
})
public class Execution
    extends SedlEntity
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected Log log;
    protected List<ExperimentalResult> results;
    protected ExperimentalSetting experimentalSetting;
    protected List<AnalysisResult> analysisResults;
    @XmlAttribute(name = "start", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Date start;
    @XmlAttribute(name = "finish", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Date finish;

    /**
     * Obtiene el valor de la propiedad log.
     * 
     * @return
     *     possible object is
     *     {@link Log }
     *     
     */
    public Log getLog() {
        return log;
    }

    /**
     * Define el valor de la propiedad log.
     * 
     * @param value
     *     allowed object is
     *     {@link Log }
     *     
     */
    public void setLog(Log value) {
        this.log = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the results property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExperimentalResult }
     * 
     * 
     */
    public List<ExperimentalResult> getResults() {
        if (results == null) {
            results = new ArrayList<ExperimentalResult>();
        }
        return this.results;
    }

    /**
     * Obtiene el valor de la propiedad experimentalSetting.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentalSetting }
     *     
     */
    public ExperimentalSetting getExperimentalSetting() {
        return experimentalSetting;
    }

    /**
     * Define el valor de la propiedad experimentalSetting.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentalSetting }
     *     
     */
    public void setExperimentalSetting(ExperimentalSetting value) {
        this.experimentalSetting = value;
    }

    /**
     * Gets the value of the analysisResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analysisResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalysisResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnalysisResult }
     * 
     * 
     */
    public List<AnalysisResult> getAnalysisResults() {
        if (analysisResults == null) {
            analysisResults = new ArrayList<AnalysisResult>();
        }
        return this.analysisResults;
    }

    /**
     * Obtiene el valor de la propiedad start.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStart() {
        return start;
    }

    /**
     * Define el valor de la propiedad start.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(Date value) {
        this.start = value;
    }

    /**
     * Obtiene el valor de la propiedad finish.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getFinish() {
        return finish;
    }

    /**
     * Define el valor de la propiedad finish.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinish(Date value) {
        this.finish = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Execution)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Execution that = ((Execution) object);
        {
            Log lhsLog;
            lhsLog = this.getLog();
            Log rhsLog;
            rhsLog = that.getLog();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "log", lhsLog), LocatorUtils.property(thatLocator, "log", rhsLog), lhsLog, rhsLog)) {
                return false;
            }
        }
        {
            List<ExperimentalResult> lhsResults;
            lhsResults = (((this.results!= null)&&(!this.results.isEmpty()))?this.getResults():null);
            List<ExperimentalResult> rhsResults;
            rhsResults = (((that.results!= null)&&(!that.results.isEmpty()))?that.getResults():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "results", lhsResults), LocatorUtils.property(thatLocator, "results", rhsResults), lhsResults, rhsResults)) {
                return false;
            }
        }
        {
            ExperimentalSetting lhsExperimentalSetting;
            lhsExperimentalSetting = this.getExperimentalSetting();
            ExperimentalSetting rhsExperimentalSetting;
            rhsExperimentalSetting = that.getExperimentalSetting();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "experimentalSetting", lhsExperimentalSetting), LocatorUtils.property(thatLocator, "experimentalSetting", rhsExperimentalSetting), lhsExperimentalSetting, rhsExperimentalSetting)) {
                return false;
            }
        }
        {
            List<AnalysisResult> lhsAnalysisResults;
            lhsAnalysisResults = (((this.analysisResults!= null)&&(!this.analysisResults.isEmpty()))?this.getAnalysisResults():null);
            List<AnalysisResult> rhsAnalysisResults;
            rhsAnalysisResults = (((that.analysisResults!= null)&&(!that.analysisResults.isEmpty()))?that.getAnalysisResults():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "analysisResults", lhsAnalysisResults), LocatorUtils.property(thatLocator, "analysisResults", rhsAnalysisResults), lhsAnalysisResults, rhsAnalysisResults)) {
                return false;
            }
        }
        {
            Date lhsStart;
            lhsStart = this.getStart();
            Date rhsStart;
            rhsStart = that.getStart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "start", lhsStart), LocatorUtils.property(thatLocator, "start", rhsStart), lhsStart, rhsStart)) {
                return false;
            }
        }
        {
            Date lhsFinish;
            lhsFinish = this.getFinish();
            Date rhsFinish;
            rhsFinish = that.getFinish();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "finish", lhsFinish), LocatorUtils.property(thatLocator, "finish", rhsFinish), lhsFinish, rhsFinish)) {
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
            Log theLog;
            theLog = this.getLog();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "log", theLog), currentHashCode, theLog);
        }
        {
            List<ExperimentalResult> theResults;
            theResults = (((this.results!= null)&&(!this.results.isEmpty()))?this.getResults():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "results", theResults), currentHashCode, theResults);
        }
        {
            ExperimentalSetting theExperimentalSetting;
            theExperimentalSetting = this.getExperimentalSetting();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "experimentalSetting", theExperimentalSetting), currentHashCode, theExperimentalSetting);
        }
        {
            List<AnalysisResult> theAnalysisResults;
            theAnalysisResults = (((this.analysisResults!= null)&&(!this.analysisResults.isEmpty()))?this.getAnalysisResults():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "analysisResults", theAnalysisResults), currentHashCode, theAnalysisResults);
        }
        {
            Date theStart;
            theStart = this.getStart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "start", theStart), currentHashCode, theStart);
        }
        {
            Date theFinish;
            theFinish = this.getFinish();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "finish", theFinish), currentHashCode, theFinish);
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
        if (draftCopy instanceof Execution) {
            final Execution copy = ((Execution) draftCopy);
            if (this.log!= null) {
                Log sourceLog;
                sourceLog = this.getLog();
                Log copyLog = ((Log) strategy.copy(LocatorUtils.property(locator, "log", sourceLog), sourceLog));
                copy.setLog(copyLog);
            } else {
                copy.log = null;
            }
            if ((this.results!= null)&&(!this.results.isEmpty())) {
                List<ExperimentalResult> sourceResults;
                sourceResults = (((this.results!= null)&&(!this.results.isEmpty()))?this.getResults():null);
                @SuppressWarnings("unchecked")
                List<ExperimentalResult> copyResults = ((List<ExperimentalResult> ) strategy.copy(LocatorUtils.property(locator, "results", sourceResults), sourceResults));
                copy.results = null;
                if (copyResults!= null) {
                    List<ExperimentalResult> uniqueResultsl = copy.getResults();
                    uniqueResultsl.addAll(copyResults);
                }
            } else {
                copy.results = null;
            }
            if (this.experimentalSetting!= null) {
                ExperimentalSetting sourceExperimentalSetting;
                sourceExperimentalSetting = this.getExperimentalSetting();
                ExperimentalSetting copyExperimentalSetting = ((ExperimentalSetting) strategy.copy(LocatorUtils.property(locator, "experimentalSetting", sourceExperimentalSetting), sourceExperimentalSetting));
                copy.setExperimentalSetting(copyExperimentalSetting);
            } else {
                copy.experimentalSetting = null;
            }
            if ((this.analysisResults!= null)&&(!this.analysisResults.isEmpty())) {
                List<AnalysisResult> sourceAnalysisResults;
                sourceAnalysisResults = (((this.analysisResults!= null)&&(!this.analysisResults.isEmpty()))?this.getAnalysisResults():null);
                @SuppressWarnings("unchecked")
                List<AnalysisResult> copyAnalysisResults = ((List<AnalysisResult> ) strategy.copy(LocatorUtils.property(locator, "analysisResults", sourceAnalysisResults), sourceAnalysisResults));
                copy.analysisResults = null;
                if (copyAnalysisResults!= null) {
                    List<AnalysisResult> uniqueAnalysisResultsl = copy.getAnalysisResults();
                    uniqueAnalysisResultsl.addAll(copyAnalysisResults);
                }
            } else {
                copy.analysisResults = null;
            }
            if (this.start!= null) {
                Date sourceStart;
                sourceStart = this.getStart();
                Date copyStart = ((Date) strategy.copy(LocatorUtils.property(locator, "start", sourceStart), sourceStart));
                copy.setStart(copyStart);
            } else {
                copy.start = null;
            }
            if (this.finish!= null) {
                Date sourceFinish;
                sourceFinish = this.getFinish();
                Date copyFinish = ((Date) strategy.copy(LocatorUtils.property(locator, "finish", sourceFinish), sourceFinish));
                copy.setFinish(copyFinish);
            } else {
                copy.finish = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Execution();
    }

}
