//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.07.14 a las 12:52:39 PM CEST 
//


package es.us.isa.sedl.core.context;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.us.isa.sedl.core.context package. 
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

    private final static QName _Person_QNAME = new QName("http://isa.us.es/sedl/core/context", "Person");
    private final static QName _Stakeholder_QNAME = new QName("http://isa.us.es/sedl/core/context", "Stakeholder");
    private final static QName _Organization_QNAME = new QName("http://isa.us.es/sedl/core/context", "Organization");
    private final static QName _Project_QNAME = new QName("http://isa.us.es/sedl/core/context", "Project");
    private final static QName _People_QNAME = new QName("http://isa.us.es/sedl/core/context", "People");
    private final static QName _ClassificationTerm_QNAME = new QName("http://isa.us.es/sedl/core/context", "ClassificationTerm");
    private final static QName _ClassificationSystem_QNAME = new QName("http://isa.us.es/sedl/core/context", "ClassificationSystem");
    private final static QName _Context_QNAME = new QName("http://isa.us.es/sedl/core/context", "Context");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.us.isa.sedl.core.context
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Stakeholder }
     * 
     */
    public Stakeholder createStakeholder() {
        return new Stakeholder();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link Project }
     * 
     */
    public Project createProject() {
        return new Project();
    }

    /**
     * Create an instance of {@link People }
     * 
     */
    public People createPeople() {
        return new People();
    }

    /**
     * Create an instance of {@link ClassificationTerm }
     * 
     */
    public ClassificationTerm createClassificationTerm() {
        return new ClassificationTerm();
    }

    /**
     * Create an instance of {@link Context }
     * 
     */
    public Context createContext() {
        return new Context();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/context", name = "Person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stakeholder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/context", name = "Stakeholder")
    public JAXBElement<Stakeholder> createStakeholder(Stakeholder value) {
        return new JAXBElement<Stakeholder>(_Stakeholder_QNAME, Stakeholder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/context", name = "Organization")
    public JAXBElement<Organization> createOrganization(Organization value) {
        return new JAXBElement<Organization>(_Organization_QNAME, Organization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Project }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/context", name = "Project")
    public JAXBElement<Project> createProject(Project value) {
        return new JAXBElement<Project>(_Project_QNAME, Project.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link People }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/context", name = "People")
    public JAXBElement<People> createPeople(People value) {
        return new JAXBElement<People>(_People_QNAME, People.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationTerm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/context", name = "ClassificationTerm")
    public JAXBElement<ClassificationTerm> createClassificationTerm(ClassificationTerm value) {
        return new JAXBElement<ClassificationTerm>(_ClassificationTerm_QNAME, ClassificationTerm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationSystem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/context", name = "ClassificationSystem")
    public JAXBElement<ClassificationSystem> createClassificationSystem(ClassificationSystem value) {
        return new JAXBElement<ClassificationSystem>(_ClassificationSystem_QNAME, ClassificationSystem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Context }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isa.us.es/sedl/core/context", name = "Context")
    public JAXBElement<Context> createContext(Context value) {
        return new JAXBElement<Context>(_Context_QNAME, Context.class, null, value);
    }

}
