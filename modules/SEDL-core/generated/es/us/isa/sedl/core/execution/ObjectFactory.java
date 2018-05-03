//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.03 a las 09:36:25 AM CEST 
//


package es.us.isa.sedl.core.execution;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.us.isa.sedl.core.execution package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Execution_QNAME = new QName("http://isa.us.es/sedl/core/execution", "Execution");
    private final static QName _Log_QNAME = new QName("http://isa.us.es/sedl/core/execution", "Log");
    private final static QName _LogLine_QNAME = new QName("http://isa.us.es/sedl/core/execution", "LogLine");
    private final static QName _ExperimentalResult_QNAME = new QName("http://isa.us.es/sedl/core/execution", "ExperimentalResult");
    private final static QName _ResultsFile_QNAME = new QName("http://isa.us.es/sedl/core/execution", "ResultsFile");
    private final static QName _DataMapping_QNAME = new QName("http://isa.us.es/sedl/core/execution", "DataMapping");
    private final static QName _FileFormat_QNAME = new QName("http://isa.us.es/sedl/core/execution", "FileFormat");
    private final static QName _ColumnBasedDataMapping_QNAME = new QName("http://isa.us.es/sedl/core/execution", "ColumnBasedDataMapping");
    private final static QName _CSV_QNAME = new QName("http://isa.us.es/sedl/core/execution", "CSV");
    private final static QName _Excel_QNAME = new QName("http://isa.us.es/sedl/core/execution", "Excel");
    private final static QName _PlainText_QNAME = new QName("http://isa.us.es/sedl/core/execution", "PlainText");
    private final static QName _ByColumnLabel_QNAME = new QName("http://isa.us.es/sedl/core/execution", "ByColumnLabel");
    private final static QName _ByColumnIndex_QNAME = new QName("http://isa.us.es/sedl/core/execution", "ByColumnIndex");
    private final static QName _ColumnIndexMapper_QNAME = new QName("http://isa.us.es/sedl/core/execution", "ColumnIndexMapper");
    private final static QName _ToVariable_QNAME = new QName("http://isa.us.es/sedl/core/execution", "ToVariable");
    private final static QName _ToConstant_QNAME = new QName("http://isa.us.es/sedl/core/execution", "ToConstant");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.us.isa.sedl.core.execution
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Execution }
     * 
     */
    public Execution createExecution() {
        return new Execution();
    }

    /**
     * Create an instance of {@link Log }
     * 
     */
    public Log createLog() {
        return new Log();
    }

    /**
     * Create an instance of {@link LogLine }
     * 
     */
    public LogLine createLogLine() {
        return new LogLine();
    }

    /**
     * Create an instance of {@link ExperimentalResult }
     * 
     */
    public ExperimentalResult createExperimentalResult() {
        return new ExperimentalResult();
    }

    /**
     * Create an instance of {@link ResultsFile }
     * 
     */
    public ResultsFile createResultsFile() {
        return new ResultsFile();
    }

    /**
     * Create an instance of {@link DataMapping }
     * 
     */
    public DataMapping createDataMapping() {
        return new DataMapping();
    }

    /**
     * Create an instance of {@link FileFormat }
     * 
     */
    public FileFormat createFileFormat() {
        return new FileFormat();
    }

    /**
     * Create an instance of {@link ColumnBasedDataMapping }
     * 
     */
    public ColumnBasedDataMapping createColumnBasedDataMapping() {
        return new ColumnBasedDataMapping();
    }

    /**
     * Create an instance of {@link CSV }
     * 
     */
    public CSV createCSV() {
        return new CSV();
    }

    /**
     * Create an instance of {@link Excel }
     * 
     */
    public Excel createExcel() {
        return new Excel();
    }

    /**
     * Create an instance of {@link PlainText }
     * 
     */
    public PlainText createPlainText() {
        return new PlainText();
    }

    /**
     * Create an instance of {@link ByColumnLabel }
     * 
     */
    public ByColumnLabel createByColumnLabel() {
        return new ByColumnLabel();
    }

    /**
     * Create an instance of {@link ByColumnIndex }
     * 
     */
    public ByColumnIndex createByColumnIndex() {
        return new ByColumnIndex();
    }

    /**
     * Create an instance of {@link ColumnIndexMapper }
     * 
     */
    public ColumnIndexMapper createColumnIndexMapper() {
        return new ColumnIndexMapper();
    }

    /**
     * Create an instance of {@link ToVariable }
     * 
     */
    public ToVariable createToVariable() {
        return new ToVariable();
    }

    /**
     * Create an instance of {@link ToConstant }
     * 
     */
    public ToConstant createToConstant() {
        return new ToConstant();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Execution }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/execution", name = "Execution")
    public JAXBElement<Execution> createExecution(Execution value) {
        return new JAXBElement<Execution>(_Execution_QNAME, Execution.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Log }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/execution", name = "Log")
    public JAXBElement<Log> createLog(Log value) {
        return new JAXBElement<Log>(_Log_QNAME, Log.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogLine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/execution", name = "LogLine")
    public JAXBElement<LogLine> createLogLine(LogLine value) {
        return new JAXBElement<LogLine>(_LogLine_QNAME, LogLine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExperimentalResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/execution", name = "ExperimentalResult")
    public JAXBElement<ExperimentalResult> createExperimentalResult(ExperimentalResult value) {
        return new JAXBElement<ExperimentalResult>(_ExperimentalResult_QNAME, ExperimentalResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultsFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/execution", name = "ResultsFile")
    public JAXBElement<ResultsFile> createResultsFile(ResultsFile value) {
        return new JAXBElement<ResultsFile>(_ResultsFile_QNAME, ResultsFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/execution", name = "DataMapping")
    public JAXBElement<DataMapping> createDataMapping(DataMapping value) {
        return new JAXBElement<DataMapping>(_DataMapping_QNAME, DataMapping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/execution", name = "FileFormat")
    public JAXBElement<FileFormat> createFileFormat(FileFormat value) {
        return new JAXBElement<FileFormat>(_FileFormat_QNAME, FileFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColumnBasedDataMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/execution", name = "ColumnBasedDataMapping")
    public JAXBElement<ColumnBasedDataMapping> createColumnBasedDataMapping(ColumnBasedDataMapping value) {
        return new JAXBElement<ColumnBasedDataMapping>(_ColumnBasedDataMapping_QNAME, ColumnBasedDataMapping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CSV }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/execution", name = "CSV")
    public JAXBElement<CSV> createCSV(CSV value) {
        return new JAXBElement<CSV>(_CSV_QNAME, CSV.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Excel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/execution", name = "Excel")
    public JAXBElement<Excel> createExcel(Excel value) {
        return new JAXBElement<Excel>(_Excel_QNAME, Excel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlainText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/execution", name = "PlainText")
    public JAXBElement<PlainText> createPlainText(PlainText value) {
        return new JAXBElement<PlainText>(_PlainText_QNAME, PlainText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByColumnLabel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/execution", name = "ByColumnLabel")
    public JAXBElement<ByColumnLabel> createByColumnLabel(ByColumnLabel value) {
        return new JAXBElement<ByColumnLabel>(_ByColumnLabel_QNAME, ByColumnLabel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByColumnIndex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/execution", name = "ByColumnIndex")
    public JAXBElement<ByColumnIndex> createByColumnIndex(ByColumnIndex value) {
        return new JAXBElement<ByColumnIndex>(_ByColumnIndex_QNAME, ByColumnIndex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColumnIndexMapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/execution", name = "ColumnIndexMapper")
    public JAXBElement<ColumnIndexMapper> createColumnIndexMapper(ColumnIndexMapper value) {
        return new JAXBElement<ColumnIndexMapper>(_ColumnIndexMapper_QNAME, ColumnIndexMapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToVariable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/execution", name = "ToVariable")
    public JAXBElement<ToVariable> createToVariable(ToVariable value) {
        return new JAXBElement<ToVariable>(_ToVariable_QNAME, ToVariable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToConstant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/execution", name = "ToConstant")
    public JAXBElement<ToConstant> createToConstant(ToConstant value) {
        return new JAXBElement<ToConstant>(_ToConstant_QNAME, ToConstant.class, null, value);
    }

}
