//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.12.05 a las 03:15:37 PM CET 
//


package es.us.isa.sedl.core.design;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.us.isa.sedl.core.design package. 
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

    private final static QName _Design_QNAME = new QName("http://isa.us.es/sedl/core/design", "Design");
    private final static QName _SamplingMethod_QNAME = new QName("http://isa.us.es/sedl/core/design", "SamplingMethod");
    private final static QName _Population_QNAME = new QName("http://isa.us.es/sedl/core/design", "Population");
    private final static QName _ExperimentalDesign_QNAME = new QName("http://isa.us.es/sedl/core/design", "ExperimentalDesign");
    private final static QName _AnalysisSpecificationGroup_QNAME = new QName("http://isa.us.es/sedl/core/design", "AnalysisSpecificationGroup");
    private final static QName _Variables_QNAME = new QName("http://isa.us.es/sedl/core/design", "Variables");
    private final static QName _Variable_QNAME = new QName("http://isa.us.es/sedl/core/design", "Variable");
    private final static QName _Domain_QNAME = new QName("http://isa.us.es/sedl/core/design", "Domain");
    private final static QName _Outcome_QNAME = new QName("http://isa.us.es/sedl/core/design", "Outcome");
    private final static QName _Factor_QNAME = new QName("http://isa.us.es/sedl/core/design", "Factor");
    private final static QName _NonControllableFactor_QNAME = new QName("http://isa.us.es/sedl/core/design", "NonControllableFactor");
    private final static QName _ControllableFactor_QNAME = new QName("http://isa.us.es/sedl/core/design", "ControllableFactor");
    private final static QName _ExtensionDomain_QNAME = new QName("http://isa.us.es/sedl/core/design", "ExtensionDomain");
    private final static QName _Level_QNAME = new QName("http://isa.us.es/sedl/core/design", "Level");
    private final static QName _Constraint_QNAME = new QName("http://isa.us.es/sedl/core/design", "Constraint");
    private final static QName _FullySpecifiedExperimentalDesign_QNAME = new QName("http://isa.us.es/sedl/core/design", "FullySpecifiedExperimentalDesign");
    private final static QName _AssignmentMethod_QNAME = new QName("http://isa.us.es/sedl/core/design", "AssignmentMethod");
    private final static QName _Group_QNAME = new QName("http://isa.us.es/sedl/core/design", "Group");
    private final static QName _Sizing_QNAME = new QName("http://isa.us.es/sedl/core/design", "Sizing");
    private final static QName _ExperimentalProtocol_QNAME = new QName("http://isa.us.es/sedl/core/design", "ExperimentalProtocol");
    private final static QName _ExperimentalProtocolStep_QNAME = new QName("http://isa.us.es/sedl/core/design", "ExperimentalProtocolStep");
    private final static QName _ProtocolConstraint_QNAME = new QName("http://isa.us.es/sedl/core/design", "ProtocolConstraint");
    private final static QName _PredefinedExperimentalDesign_QNAME = new QName("http://isa.us.es/sedl/core/design", "PredefinedExperimentalDesign");
    private final static QName _Measurement_QNAME = new QName("http://isa.us.es/sedl/core/design", "Measurement");
    private final static QName _Treatment_QNAME = new QName("http://isa.us.es/sedl/core/design", "Treatment");
    private final static QName _Literal_QNAME = new QName("http://isa.us.es/sedl/core/design", "Literal");
    private final static QName _VariableSizing_QNAME = new QName("http://isa.us.es/sedl/core/design", "VariableSizing");
    private final static QName _SizingExpression_QNAME = new QName("http://isa.us.es/sedl/core/design", "SizingExpression");
    private final static QName _Nuisance_QNAME = new QName("http://isa.us.es/sedl/core/design", "Nuisance");
    private final static QName _Precedence_QNAME = new QName("http://isa.us.es/sedl/core/design", "Precedence");
    private final static QName _IntervalConstraint_QNAME = new QName("http://isa.us.es/sedl/core/design", "IntervalConstraint");
    private final static QName _FundamentalSetConstraint_QNAME = new QName("http://isa.us.es/sedl/core/design", "FundamentalSetConstraint");
    private final static QName _IntensionDomain_QNAME = new QName("http://isa.us.es/sedl/core/design", "IntensionDomain");
    private final static QName _VariableValuation_QNAME = new QName("http://isa.us.es/sedl/core/design", "VariableValuation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.us.isa.sedl.core.design
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Design }
     * 
     */
    public Design createDesign() {
        return new Design();
    }

    /**
     * Create an instance of {@link SamplingMethod }
     * 
     */
    public SamplingMethod createSamplingMethod() {
        return new SamplingMethod();
    }

    /**
     * Create an instance of {@link Population }
     * 
     */
    public Population createPopulation() {
        return new Population();
    }

    /**
     * Create an instance of {@link AnalysisSpecificationGroup }
     * 
     */
    public AnalysisSpecificationGroup createAnalysisSpecificationGroup() {
        return new AnalysisSpecificationGroup();
    }

    /**
     * Create an instance of {@link Variables }
     * 
     */
    public Variables createVariables() {
        return new Variables();
    }

    /**
     * Create an instance of {@link Outcome }
     * 
     */
    public Outcome createOutcome() {
        return new Outcome();
    }

    /**
     * Create an instance of {@link NonControllableFactor }
     * 
     */
    public NonControllableFactor createNonControllableFactor() {
        return new NonControllableFactor();
    }

    /**
     * Create an instance of {@link ControllableFactor }
     * 
     */
    public ControllableFactor createControllableFactor() {
        return new ControllableFactor();
    }

    /**
     * Create an instance of {@link ExtensionDomain }
     * 
     */
    public ExtensionDomain createExtensionDomain() {
        return new ExtensionDomain();
    }

    /**
     * Create an instance of {@link Level }
     * 
     */
    public Level createLevel() {
        return new Level();
    }

    /**
     * Create an instance of {@link FullySpecifiedExperimentalDesign }
     * 
     */
    public FullySpecifiedExperimentalDesign createFullySpecifiedExperimentalDesign() {
        return new FullySpecifiedExperimentalDesign();
    }

    /**
     * Create an instance of {@link AssignmentMethod }
     * 
     */
    public AssignmentMethod createAssignmentMethod() {
        return new AssignmentMethod();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link Sizing }
     * 
     */
    public Sizing createSizing() {
        return new Sizing();
    }

    /**
     * Create an instance of {@link ExperimentalProtocol }
     * 
     */
    public ExperimentalProtocol createExperimentalProtocol() {
        return new ExperimentalProtocol();
    }

    /**
     * Create an instance of {@link ExperimentalProtocolStep }
     * 
     */
    public ExperimentalProtocolStep createExperimentalProtocolStep() {
        return new ExperimentalProtocolStep();
    }

    /**
     * Create an instance of {@link PredefinedExperimentalDesign }
     * 
     */
    public PredefinedExperimentalDesign createPredefinedExperimentalDesign() {
        return new PredefinedExperimentalDesign();
    }

    /**
     * Create an instance of {@link Measurement }
     * 
     */
    public Measurement createMeasurement() {
        return new Measurement();
    }

    /**
     * Create an instance of {@link Treatment }
     * 
     */
    public Treatment createTreatment() {
        return new Treatment();
    }

    /**
     * Create an instance of {@link Literal }
     * 
     */
    public Literal createLiteral() {
        return new Literal();
    }

    /**
     * Create an instance of {@link VariableSizing }
     * 
     */
    public VariableSizing createVariableSizing() {
        return new VariableSizing();
    }

    /**
     * Create an instance of {@link SizingExpression }
     * 
     */
    public SizingExpression createSizingExpression() {
        return new SizingExpression();
    }

    /**
     * Create an instance of {@link Nuisance }
     * 
     */
    public Nuisance createNuisance() {
        return new Nuisance();
    }

    /**
     * Create an instance of {@link Precedence }
     * 
     */
    public Precedence createPrecedence() {
        return new Precedence();
    }

    /**
     * Create an instance of {@link IntervalConstraint }
     * 
     */
    public IntervalConstraint createIntervalConstraint() {
        return new IntervalConstraint();
    }

    /**
     * Create an instance of {@link FundamentalSetConstraint }
     * 
     */
    public FundamentalSetConstraint createFundamentalSetConstraint() {
        return new FundamentalSetConstraint();
    }

    /**
     * Create an instance of {@link IntensionDomain }
     * 
     */
    public IntensionDomain createIntensionDomain() {
        return new IntensionDomain();
    }

    /**
     * Create an instance of {@link VariableValuation }
     * 
     */
    public VariableValuation createVariableValuation() {
        return new VariableValuation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Design }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "Design")
    public JAXBElement<Design> createDesign(Design value) {
        return new JAXBElement<Design>(_Design_QNAME, Design.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SamplingMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "SamplingMethod")
    public JAXBElement<SamplingMethod> createSamplingMethod(SamplingMethod value) {
        return new JAXBElement<SamplingMethod>(_SamplingMethod_QNAME, SamplingMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Population }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "Population")
    public JAXBElement<Population> createPopulation(Population value) {
        return new JAXBElement<Population>(_Population_QNAME, Population.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExperimentalDesign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "ExperimentalDesign")
    public JAXBElement<ExperimentalDesign> createExperimentalDesign(ExperimentalDesign value) {
        return new JAXBElement<ExperimentalDesign>(_ExperimentalDesign_QNAME, ExperimentalDesign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnalysisSpecificationGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "AnalysisSpecificationGroup")
    public JAXBElement<AnalysisSpecificationGroup> createAnalysisSpecificationGroup(AnalysisSpecificationGroup value) {
        return new JAXBElement<AnalysisSpecificationGroup>(_AnalysisSpecificationGroup_QNAME, AnalysisSpecificationGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Variables }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "Variables")
    public JAXBElement<Variables> createVariables(Variables value) {
        return new JAXBElement<Variables>(_Variables_QNAME, Variables.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Variable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "Variable")
    public JAXBElement<Variable> createVariable(Variable value) {
        return new JAXBElement<Variable>(_Variable_QNAME, Variable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Domain }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "Domain")
    public JAXBElement<Domain> createDomain(Domain value) {
        return new JAXBElement<Domain>(_Domain_QNAME, Domain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Outcome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "Outcome")
    public JAXBElement<Outcome> createOutcome(Outcome value) {
        return new JAXBElement<Outcome>(_Outcome_QNAME, Outcome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Factor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "Factor")
    public JAXBElement<Factor> createFactor(Factor value) {
        return new JAXBElement<Factor>(_Factor_QNAME, Factor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonControllableFactor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "NonControllableFactor")
    public JAXBElement<NonControllableFactor> createNonControllableFactor(NonControllableFactor value) {
        return new JAXBElement<NonControllableFactor>(_NonControllableFactor_QNAME, NonControllableFactor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControllableFactor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "ControllableFactor")
    public JAXBElement<ControllableFactor> createControllableFactor(ControllableFactor value) {
        return new JAXBElement<ControllableFactor>(_ControllableFactor_QNAME, ControllableFactor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionDomain }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "ExtensionDomain")
    public JAXBElement<ExtensionDomain> createExtensionDomain(ExtensionDomain value) {
        return new JAXBElement<ExtensionDomain>(_ExtensionDomain_QNAME, ExtensionDomain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Level }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "Level")
    public JAXBElement<Level> createLevel(Level value) {
        return new JAXBElement<Level>(_Level_QNAME, Level.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Constraint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "Constraint")
    public JAXBElement<Constraint> createConstraint(Constraint value) {
        return new JAXBElement<Constraint>(_Constraint_QNAME, Constraint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FullySpecifiedExperimentalDesign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "FullySpecifiedExperimentalDesign")
    public JAXBElement<FullySpecifiedExperimentalDesign> createFullySpecifiedExperimentalDesign(FullySpecifiedExperimentalDesign value) {
        return new JAXBElement<FullySpecifiedExperimentalDesign>(_FullySpecifiedExperimentalDesign_QNAME, FullySpecifiedExperimentalDesign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignmentMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "AssignmentMethod")
    public JAXBElement<AssignmentMethod> createAssignmentMethod(AssignmentMethod value) {
        return new JAXBElement<AssignmentMethod>(_AssignmentMethod_QNAME, AssignmentMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Group }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "Group")
    public JAXBElement<Group> createGroup(Group value) {
        return new JAXBElement<Group>(_Group_QNAME, Group.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sizing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "Sizing")
    public JAXBElement<Sizing> createSizing(Sizing value) {
        return new JAXBElement<Sizing>(_Sizing_QNAME, Sizing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExperimentalProtocol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "ExperimentalProtocol")
    public JAXBElement<ExperimentalProtocol> createExperimentalProtocol(ExperimentalProtocol value) {
        return new JAXBElement<ExperimentalProtocol>(_ExperimentalProtocol_QNAME, ExperimentalProtocol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExperimentalProtocolStep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "ExperimentalProtocolStep")
    public JAXBElement<ExperimentalProtocolStep> createExperimentalProtocolStep(ExperimentalProtocolStep value) {
        return new JAXBElement<ExperimentalProtocolStep>(_ExperimentalProtocolStep_QNAME, ExperimentalProtocolStep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProtocolConstraint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "ProtocolConstraint")
    public JAXBElement<ProtocolConstraint> createProtocolConstraint(ProtocolConstraint value) {
        return new JAXBElement<ProtocolConstraint>(_ProtocolConstraint_QNAME, ProtocolConstraint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PredefinedExperimentalDesign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "PredefinedExperimentalDesign")
    public JAXBElement<PredefinedExperimentalDesign> createPredefinedExperimentalDesign(PredefinedExperimentalDesign value) {
        return new JAXBElement<PredefinedExperimentalDesign>(_PredefinedExperimentalDesign_QNAME, PredefinedExperimentalDesign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Measurement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "Measurement")
    public JAXBElement<Measurement> createMeasurement(Measurement value) {
        return new JAXBElement<Measurement>(_Measurement_QNAME, Measurement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Treatment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "Treatment")
    public JAXBElement<Treatment> createTreatment(Treatment value) {
        return new JAXBElement<Treatment>(_Treatment_QNAME, Treatment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Literal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "Literal")
    public JAXBElement<Literal> createLiteral(Literal value) {
        return new JAXBElement<Literal>(_Literal_QNAME, Literal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableSizing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "VariableSizing")
    public JAXBElement<VariableSizing> createVariableSizing(VariableSizing value) {
        return new JAXBElement<VariableSizing>(_VariableSizing_QNAME, VariableSizing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SizingExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "SizingExpression")
    public JAXBElement<SizingExpression> createSizingExpression(SizingExpression value) {
        return new JAXBElement<SizingExpression>(_SizingExpression_QNAME, SizingExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Nuisance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "Nuisance")
    public JAXBElement<Nuisance> createNuisance(Nuisance value) {
        return new JAXBElement<Nuisance>(_Nuisance_QNAME, Nuisance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Precedence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "Precedence")
    public JAXBElement<Precedence> createPrecedence(Precedence value) {
        return new JAXBElement<Precedence>(_Precedence_QNAME, Precedence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntervalConstraint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "IntervalConstraint")
    public JAXBElement<IntervalConstraint> createIntervalConstraint(IntervalConstraint value) {
        return new JAXBElement<IntervalConstraint>(_IntervalConstraint_QNAME, IntervalConstraint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FundamentalSetConstraint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "FundamentalSetConstraint")
    public JAXBElement<FundamentalSetConstraint> createFundamentalSetConstraint(FundamentalSetConstraint value) {
        return new JAXBElement<FundamentalSetConstraint>(_FundamentalSetConstraint_QNAME, FundamentalSetConstraint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntensionDomain }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "IntensionDomain")
    public JAXBElement<IntensionDomain> createIntensionDomain(IntensionDomain value) {
        return new JAXBElement<IntensionDomain>(_IntensionDomain_QNAME, IntensionDomain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableValuation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/design", name = "VariableValuation")
    public JAXBElement<VariableValuation> createVariableValuation(VariableValuation value) {
        return new JAXBElement<VariableValuation>(_VariableValuation_QNAME, VariableValuation.class, null, value);
    }

}
