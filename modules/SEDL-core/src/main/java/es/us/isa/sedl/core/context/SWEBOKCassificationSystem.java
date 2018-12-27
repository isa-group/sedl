/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.context;

/**
 *
 * @author japarejo
 */
public class SWEBOKCassificationSystem extends BiLevelClassificationSystem {

    public SWEBOKCassificationSystem() {
        this.name="SWEBOK";
        this.url="https://www.computer.org/web/swebok";
        String[][] mainCathegories={
           {"01-","Software Requirements"},       
           {"02-","Software Design"},
           {"03-","Software Construction"},
           {"04-","Software Testing"},
           {"05-","Software Maintenance"},
           {"06-","Software Configuration Management"},       
           {"07-","Software Engineering Management"},
           {"08-","Software Engineering Process"},
           {"09-","Software Engineering Models and Methods"},
           {"10-","Software Quality"},
           {"11-","Software Engineering Professional Practice"},
           {"12-","Software Engineering Economics"},
           {"13-","Computing Foundations"},
           {"14-","Mathematical Foundations"},
           {"15-","Engineering Foundations"}
        };
        
        String[][] subCathegories={
           {"01-1","Software Requirements Fundamentals"},
           {"01-1.1","Definition of a Software Requirement"},
           {"01-1.2","Product and Process Requirements"},
           {"01-1.3","Functional and Nonfunctional Requirements"},
           {"01-1.4","Emergent Properties"},
           {"01-1.5","Quantifiable Requirements"},
           {"01-1.6","System Requirements and Software Requirements"},
           {"01-2","Requirements Process"},
           {"01-2.1","Process Models"},
           {"01-2.2","Process Actors"},
           {"01-2.3","Process Support and Management"},
           {"01-2.4","Process Quality and Improvement"},
           {"01-3","Requirements Elicitation"},
           {"01-3.1","Requirements Sources"},
           {"01-3.2","Elicitation Techniques"},
           {"01-4","Requirements Analysis"},
           {"01-4.1","Requirements Classification"},
           {"01-4.2","Conceptual Modeling"},
           {"01-4.3","Architectural Design and Requirements Allocation"},
           {"01-4.4","Requirements Negotiation"},
           {"01-4.5","Formal Analysis"},
           {"01-5","Requirements Specification"},
           {"01-5.1","System Definition Document"},
           {"01-5.2","System Requirements Specification"},
           {"01-5.3","Software Requirements Specification"},
           {"01-6","Requirements Validation"},
           {"01-6.1","Requirements Reviews"},
           {"01-6.2","Prototyping"},
           {"01-6.3","Model Validation"},
           {"01-6.4","Acceptance Tests"},
           {"01-7","Practical Considerations"},
           {"01-7.1","Iterative Nature of the Requirements Process"},
           {"01-7.2","Change Management"},
           {"01-7.3","Requirements Attributes"},
           {"01-7.4","Requirements Tracing"},
           {"01-7.5","Measuring Requirements"},
           {"01-8","Software Requirements Tools"},
           {"02-1","Software Design Fundamentals"},
           {"02-1.1","General Design Concepts"},
           {"02-1.2","Context of Software Design"},
           {"02-1.3","Software Design Process"},
           {"02-1.4","Software Design Principles"},
           {"02-2","Key Issues in Software Design"},
           {"02-2.1","Concurrency"},
           {"02-2.2","Control and Handling of Events"},
           {"02-2.3","Data Persistence"},
           {"02-2.4","Distribution of Components"},
           {"02-2.5","Error and Exception Handling and Fault Tolerance"},
           {"02-2.6","Interaction and Presentation"},
           {"02-2.7","Security"},
           {"02-3","Software Structure and Architecture"},
           {"02-3.1","Architectural Structures and Viewpoints"},
           {"02-3.2","Architectural Styles"},
           {"02-3.3","Design Patterns"},
           {"02-3.4","Architecture Design Decisions"},
           {"02-3.5","Families of Programs and Frameworks"},
           {"02-4","User Interface Design"},
           {"02-4.1","General User Interface Design Principles"},
           {"02-4.2","User Interface Design Issues"},
           {"02-4.3","The Design of User Interaction Modalities"},
           {"02-4.4","The Design of Information Presentation"},
           {"02-4.5","User Interface Design Process"},
           {"02-4.6","Localization and Internationalization"},
           {"02-4.7","Metaphors and Conceptual Models"},
           {"02-5","Software Design Quality Analysis and Evaluation"},
           {"02-5.1","Quality Attributes"},
           {"02-5.2","Quality Analysis and Evaluation Techniques"},
           {"02-5.3","Measures"},
           {"02-6","Software Design Notations"},
           {"02-6.1","Structural Descriptions (Static View)"},
           {"02-6.2","Behavioral Descriptions (Dynamic View)"},
           {"02-7","Software Design Strategies and Methods"},
           {"02-7.1","General Strategies"},
           {"02-7.2","Function-Oriented (Structured) Design"},
           {"02-7.3","Object-Oriented Design"},
           {"02-7.4","Data Structure-Centered Design"},
           {"02-7.5","Component-Based Design (CBD)"},
           {"02-7.6","Other Methods"},
           {"02-8","Software Design Tools"},           
           {"03-1","Software Construction Fundamentals"},
           {"03-1.1","Minimizing Complexity"},
           {"03-1.2","Anticipating Change"},
           {"03-1.3","Constructing for Verification"},
           {"03-1.4","Reuse"},
           {"03-1.5","Standards in Construction"},
           {"03-2","Managing Construction"},
           {"03-2.1","Construction in Life Cycle Models"},
           {"03-2.2","Construction Planning"},
           {"03-2.3","Construction Measurement"},
           {"03-3","Practical Considerations"},
           {"03-3.1","Construction Design"},
           {"03-3.2","Construction Languages"},
           {"03-3.3","Coding"},
           {"03-3.4","Construction Testing"},
           {"03-3.5","Construction for Reuse"},
           {"03-3.6","Construction with Reuse"},
           {"03-3.7","Construction Quality"},
           {"03-3.8","Integration"},
           {"03-4","Construction Technologies"},
           {"03-4.1","API Design and Use"},
           {"03-4.2","Object-Oriented Runtime Issues"},
           {"03-4.3","Parameterization and Generics"},
           {"03-4.4","Assertions, Design by Contract, and Defensive Programming"},
           {"03-4.5","Error Handling, Exception Handling, and Fault Tolerance"},
           {"03-4.6","Executable Models"},
           {"03-4.7","State-Based and Table-Driven Construction Techniques"},
           {"03-4.8","Runtime Configuration and Internationalization"},
           {"03-4.9","Grammar-Based Input Processing"},
           {"03-4.10","Concurrency Primitives"},
           {"03-4.11","Middleware"},
           {"03-4.12","Construction Methods for Distributed Software"},
           {"03-4.13","Constructing Heterogeneous Systems"},
           {"03-4.14","Performance Analysis and Tuning"},
           {"03-4.15","Platform Standards"},
           {"03-4.16","Test-First Programming"},
           {"03-5","Software Construction Tools"},
           {"03-5.1","Development Environments"},
           {"03-5.2","GUI Builders"},
           {"03-5.3","Unit Testing Tools"},
           {"03-5.4","Profiling, Performance Analysis, and Slicing Tools"},
           {"04-1","Software Testing Fundamentals"},
           {"04-1.1","Testing-Related Terminology"},
           {"04-1.2","Key Issues"},
           {"04-1.3","Relationship of Testing to Other Activities"},
           {"04-2","Test Levels"},
           {"04-2.1","The Target of the Test"},
           {"04-2.2","Objectives of Testing"},
           {"04-3","Test Techniques"},
           {"04-3.1","Based on the Software Engineer’s Intuition and Experience"},
           {"04-3.2","Input Domain-Based Techniques"},
           {"04-3.3","Code-Based Techniques"},
           {"04-3.4","Fault-Based Techniques"},
           {"04-3.5","Usage-Based Techniques"},
           {"04-3.6","Model-Based Testing Techniques"},
           {"04-3.7","Techniques Based on the Nature of the Application"},
           {"04-3.8","Selecting and Combining Techniques"},
           {"04-4","Test-Related Measures"},
           {"04-4.1","Evaluation of the Program Under Test"},
           {"04-4.2","Evaluation of the Tests Performed"},
           {"04-5","Test Process"},
           {"04-5.1","Practical Considerations"},
           {"04-5.2","Test Activities"},
           {"04-6","Software Testing Tools"},
           {"04-6.1","Testing Tool Support"},
           {"04-6.2","Categories of Tools"},           
           {"05-1","Software Maintenance Fundamentals"},
           {"05-1.1","Definitions and Terminology"},
           {"05-1.2","Nature of Maintenance"},
           {"05-1.3","Need for Maintenance"},
           {"05-1.4","Majority of Maintenance Costs"},
           {"05-1.5","Evolution of Software"},
           {"05-1.6","Categories of Maintenance"},
           {"05-2","Key Issues in Software Maintenance"},
           {"05-2.1","Technical Issues"},
           {"05-2.2","Management Issues"},
           {"05-2.3","Maintenance Cost Estimation"},
           {"05-2.4","Software Maintenance Measurement"},
           {"05-3","Maintenance Process"},
           {"05-3.1","Maintenance Processes"},
           {"05-3.2","Maintenance Activities"},
           {"05-4","Techniques for Maintenance"},
           {"05-4.1","Program Comprehension"},
           {"05-4.2","Reengineering"},
           {"05-4.3","Reverse Engineering"},
           {"05-4.4","Migration"},
           {"05-4.5","Retirement"},
           {"05-5","Software Maintenance Tools"},           
           {"06-1","Management of the SCM Process"},
           {"06-1.1","Organizational Context for SCM"},
           {"06-1.2","Constraints and Guidance for the SCM Process"},
           {"06-1.3","Planning for SCM"},
           {"06-1.4","SCM Plan"},
           {"06-1.5","Surveillance of Software Configuration Management"},
           {"06-2","Software Configuration Identification"},
           {"06-2.1","Identifying Items to Be Controlled"},
           {"06-2.2","Software Library"},
           {"06-3","Software Configuration Control"},
           {"06-3.1","Requesting, Evaluating, and Approving Software Changes"},
           {"06-3.2","Implementing Software Changes"},
           {"06-3.3","Deviations and Waivers"},
           {"06-4","Software Configuration Status Accounting"},
           {"06-4.1","Software Configuration Status Information"},
           {"06-4.2","Software Configuration Status Reporting"},
           {"06-5","Software Configuration Auditing"},
           {"06-5.1","Software Functional Configuration Audit"},
           {"06-5.2","Software Physical Configuration Audit"},
           {"06-5.3","In-Process Audits of a Software Baseline"},
           {"06-6","Software Release Management and Delivery"},
           {"06-6.1","Software Building"},
           {"06-6.2","Software Release Management"},
           {"06-7","Software Configuration Management Tools"},           
           {"07-1","Initiation and Scope Definition"},
           {"07-1.1","Determination and Negotiation of Requirements"},
           {"07-1.2","Feasibility Analysis"},
           {"07-1.3","Process for the Review and Revision of Requirements"},
           {"07-2","Software Project Planning"},
           {"07-2.1","Process Planning"},
           {"07-2.2","Determine Deliverables"},
           {"07-2.3","Effort, Schedule, and Cost Estimation"},
           {"07-2.4","Resource Allocation"},
           {"07-2.5","Risk Management"},
           {"07-2.6","Quality Management"},
           {"07-2.7","Plan Management"},
           {"07-3","Software Project Enactment"},
           {"07-3.1","Implementation of Plans"},
           {"07-3.2","Software Acquisition and Supplier Contract Management"},
           {"07-3.3","Implementation of Measurement Process"},
           {"07-3.4","Monitor Process"},
           {"07-3.5","Control Process"},
           {"07-3.6","Reporting"},
           {"07-4","Review and Evaluation"},
           {"07-4.1","Determining Satisfaction of Requirements"},
           {"07-4.2","Reviewing and Evaluating Performance"},
           {"07-5","Closure"},
           {"07-5.1","Determining Closure"},
           {"07-5.2","Closure Activities"},
           {"07-6","Software Engineering Measurement"},
           {"07-6.1","Establish and Sustain Measurement Commitment"},
           {"07-6.2","Plan the Measurement Process"},
           {"07-6.3","Perform the Measurement Process"},
           {"07-6.4","Evaluate Measurement"},
           {"07-7","Software Engineering Management Tools"},           
           {"08-1","Software Process Definition"},
           {"08-1.1","Software Process Management"},
           {"08-1.2","Software Process Infrastructure"},
           {"08-2","Software Life Cycles"},
           {"08-2.1","Categories of Software Processes"},
           {"08-2.2","Software Life Cycle Models"},
           {"08-2.3","Software Process Adaptation"},
           {"08-2.4","Practical Considerations"},
           {"08-3","Software Process Assessment and Improvement"},
           {"08-3.1","Software Process Assessment Models"},
           {"08-3.2","Software Process Assessment Methods"},
           {"08-3.3","Software Process Improvement Models"},
           {"08-3.4","Continuous and Staged Software Process Ratings"},
           {"08-4","Software Measurement"},
           {"08-4.1","Software Process and Product Measurement"},
           {"08-4.2","Quality of Measurement Results"},
           {"08-4.3","Software Information Models"},
           {"08-4.4","Software Process Measurement Techniques"},
           {"08-5","Software Engineering Process Tools"},           
           {"09-1","Modeling"},
           {"09-1.1","Modeling Principles"},
           {"09-1.2","Properties and Expression of Models"},
           {"09-1.3","Syntax, Semantics, and Pragmatics"},
           {"09-1.4","Preconditions, Postconditions, and Invariants"},
           {"09-2","Types of Models"},
           {"09-2.1","Information Modeling"},
           {"09-2.2","Behavioral Modeling"},
           {"09-2.3","Structure Modeling"},
           {"09-3","Analysis of Models"},
           {"09-3.1","Analyzing for Completeness"},
           {"09-3.2","Analyzing for Consistency"},
           {"09-3.3","Analyzing for Correctness"},
           {"09-3.4","Traceability"},
           {"09-3.5","Interaction Analysis"},
           {"09-4","Software Engineering Methods"},
           {"09-4.1","Heuristic Methods"},
           {"09-4.2","Formal Methods"},
           {"09-4.3","Prototyping Methods"},
           {"09-4.4","Agile Methods"},
           {"10-1","Software Quality Fundamentals"},
           {"10-1.1","Software Engineering Culture and Ethics"},
           {"10-1.2","Value and Costs of Quality"},
           {"10-1.3","Models and Quality Characteristics"},
           {"10-1.4","Software Quality Improvement"},
           {"10-1.5","Software Safety"},
           {"10-2","Software Quality Management Processes"},
           {"10-2.1","Software Quality Assurance"},
           {"10-2.2","Verification & Validation"},
           {"10-2.3","Reviews and Audits"},
           {"10-3","Practical Considerations"},
           {"10-3.1","Software Quality Requirements"},
           {"10-3.2","Defect Characterization"},
           {"10-3.3","Software Quality Management Techniques"},
           {"10-3.4","Software Quality Measurement"},
           {"10-4","Software Quality Tools"},           
           {"11-1","Professionalism"},
           {"11-1.1","Accreditation, Certification, and Licensing"},
           {"11-1.2","Codes of Ethics and Professional Conduct"},
           {"11-1.3","Nature and Role of Professional Societies"},
           {"11-1.4","Nature and Role of Software Engineering Standards"},
           {"11-1.5","Economic Impact of Software"},
           {"11-1.6","Employment Contracts"},
           {"11-1.7","Legal Issues"},
           {"11-1.8","Documentation"},
           {"11-1.9","Tradeoff Analysis"},
           {"11-2","Group Dynamics and Psychology"},
           {"11-2.1","Dynamics of Working in Teams/Groups"},
           {"11-2.2","Individual Cognition"},
           {"11-2.3","Dealing with Problem Complexity"},
           {"11-2.4","Interacting with Stakeholders"},
           {"11-2.5","Dealing with Uncertainty and Ambiguity"},
           {"11-2.6","Dealing with Multicultural Environments"},
           {"11-3","Communication Skills"},
           {"11-3.1","Reading, Understanding, and Summarizing"},
           {"11-3.2","Writing"},
           {"11-3.3","Team and Group Communication"},
           {"11-3.4","Presentation Skills"},           
           {"12-1","Software Engineering Economics Fundamentals"},
           {"12-1.1","Finance"},
           {"12-1.2","Accounting"},
           {"12-1.3","Controlling"},
           {"12-1.4","Cash Flow"},
           {"12-1.5","Decision-Making Process"},
           {"12-1.6","Valuation"},
           {"12-1.7","Inflation"},
           {"12-1.8","Depreciation"},
           {"12-1.9","Taxation"},
           {"12-1.10","Time-Value of Money"},
           {"12-1.11","Efficiency"},
           {"12-1.12","Effectiveness"},
           {"12-1.13","Productivity"},
           {"12-2","Life Cycle Economics"},
           {"12-2.1","Product"},
           {"12-2.2","Project"},
           {"12-2.3","Program"},
           {"12-2.4","Portfolio"},
           {"12-2.5","Product Life Cycle"},
           {"12-2.6","Project Life Cycle"},
           {"12-2.7","Proposals"},
           {"12-2.8","Investment Decisions"},
           {"12-2.9","Planning Horizon"},
           {"12-2.10","Price and Pricing"},
           {"12-2.11","Cost and Costing"},
           {"12-2.12","Performance Measurement"},
           {"12-2.13","Earned Value Management"},
           {"12-2.14","Termination Decisions"},
           {"12-2.15","Replacement and Retirement Decisions"},
           {"12-3","Risk and Uncertainty"},
           {"12-3.1","Goals, Estimates, and Plans"},
           {"12-3.2","Estimation Techniques"},
           {"12-3.3","Addressing Uncertainty"},
           {"12-3.4","Prioritization"},
           {"12-3.5","Decisions under Risk"},
           {"12-3.6","Decisions under Uncertainty"},
           {"12-4","Economic Analysis Methods"},
           {"12-4.1","For-Profit Decision Analysis"},
           {"12-4.2","Minimum Acceptable Rate of Return"},
           {"12-4.3","Return on Investment"},
           {"12-4.4","Return on Capital Employed"},
           {"12-4.5","Cost-Benefit Analysis"},
           {"12-4.6","Cost-Effectiveness Analysis"},
           {"12-4.7","Break-Even Analysis"},
           {"12-4.8","Business Case"},
           {"12-4.9","Multiple Attribute Evaluation"},
           {"12-4.10","Optimization Analysis"},
           {"12-5","Practical Considerations"},
           {"12-5.1","The “Good Enough” Principle"},
           {"12-5.2","Friction-Free Economy"},
           {"12-5.3","Ecosystems"},
           {"12-5.4","Offshoring and Outsourcing"},           
           {"13-1","Problem Solving Techniques"},
           {"13-1.1","Definition of Problem Solving"},
           {"13-1.2","Formulating the Real Problem"},
           {"13-1.3","Analyze the Problem"},
           {"13-1.4","Design a Solution Search Strategy"},
           {"13-1.5","Problem Solving Using Programs"},
           {"13-2","Abstraction"},
           {"13-2.1","Levels of Abstraction"},
           {"13-2.2","Encapsulation"},
           {"13-2.3","Hierarchy"},
           {"13-2.4","Alternate Abstractions"},
           {"13-3","Programming Fundamentals"},
           {"13-3.1","The Programming Process"},
           {"13-3.2","Programming Paradigms"},
           {"13-4","Programming Language Basics"},
           {"13-4.1","Programming Language Overview"},
           {"13-4.2","Syntax and Semantics of Programming Languages"},
           {"13-4.3","Low-Level Programming Languages"},
           {"13-4.4","High-Level Programming Languages"},
           {"13-4.5","Declarative vs","Imperative Programming Languages"},
           {"13-5","Debugging Tools and Techniques"},
           {"13-5.1","Types of Errors"},
           {"13-5.2","Debugging Techniques"},
           {"13-5.3","Debugging Tools"},
           {"13-6","Data Structure and Representation"},
           {"13-6.1","Data Structure Overview"},
           {"13-6.2","Types of Data Structure"},
           {"13-6.3","Operations on Data Structures"},
           {"13-7","Algorithms and Complexity"},
           {"13-7.1","Overview of Algorithms"},
           {"13-7.2","Attributes of Algorithms"},
           {"13-7.3","Algorithmic Analysis"},
           {"13-7.4","Algorithmic Design Strategies"},
           {"13-7.5","Algorithmic Analysis Strategies"},
           {"13-8","Basic Concept of a System"},
           {"13-8.1","Emergent System Properties"},
           {"13-8.2","Systems Engineering"},
           {"13-8.3","Overview of a Computer System"},
           {"13-9","Computer Organization"},
           {"13-9.1","Computer Organization Overview"},
           {"13-9.2","Digital Systems"},
           {"13-9.3","Digital Logic"},
           {"13-9.4","Computer Expression of Data"},
           {"13-9.5","The Central Processing Unit (CPU)"},
           {"13-9.6","Memory System Organization"},
           {"13-9.7","Input and Output (I/O)"},
           {"13-10","Compiler Basics"},
           {"13-10.1","Compiler/Interpreter Overview"},
           {"13-10.2","Interpretation and Compilation"},
           {"13-10.3","The Compilation Process"},
           {"13-11","Operating Systems Basics"},
           {"13-11.1","Operating Systems Overview"},
           {"13-11.2","Tasks of an Operating System"},
           {"13-11.3","Operating System Abstractions"},
           {"13-11.4","Operating Systems Classification"},
           {"13-12","Database Basics and Data Management"},
           {"13-12.1","Entity and Schema"},
           {"13-12.2","Database Management Systems (DBMS)"},
           {"13-12.3","Database Query Language"},
           {"13-12.4","Tasks of DBMS Packages"},
           {"13-12.5","Data Management"},
           {"13-12.6","Data Mining"},
           {"13-13","Network Communication Basics"},
           {"13-13.1","Types of Network"},
           {"13-13.2","Basic Network Components"},
           {"13-13.3","Networking Protocols and Standards"},
           {"13-13.4","The Internet"},
           {"13-13.5","Internet of Things"},
           {"13-13.6","Virtual Private Network (VPN)"},
           {"13-14","Parallel and Distributed Computing"},
           {"13-14.1","Parallel and Distributed Computing Overview"},
           {"13-14.2","Difference between Parallel and Distributed Computing"},
           {"13-14.3","Parallel and Distributed Computing Models"},
           {"13-14.4","Main Issues in Distributed Computing"},
           {"13-15","Basic User Human Factors"},
           {"13-15.1","Input and Output"},
           {"13-15.2","Error Messages"},
           {"13-15.3","Software Robustness"},
           {"13-16","Basic Developer Human Factors"},
           {"13-16.1","Structure"},
           {"13-16.2","Comments"},
           {"13-17","Secure Software Development and Maintenance"},
           {"13-17.1","Software Requirements Security"},
           {"13-17.2","Software Design Security"},
           {"13-17.3","Software Construction Security"},
           {"13-17.4","Software Testing Security"},
           {"13-17.5","Build Security into Software Engineering Process"},
           {"13-17.6","Software Security Guidelines"},           
           {"14-1","Set, Relations, Functions"},
           {"14-1.1","Set Operations"},
           {"14-1.2","Properties of Set"},
           {"14-1.3","Relation and Function"},
           {"14-2","Basic Logic"},
           {"14-2.1","Propositional Logic"},
           {"14-2.2","Predicate Logic"},
           {"14-3","Proof Techniques"},
           {"14-3.1","Methods of Proving Theorems"},
           {"14-4","Basics of Counting"},
           {"14-5","Graphs and Trees"},
           {"14-5.1","Graphs"},
           {"14-5.2","Trees"},
           {"14-6","Discrete Probability"},
           {"14-7","Finite State Machines"},
           {"14-8","Grammars"},
           {"14-8.1","Language Recognition"},
           {"14-9","Numerical Precision, Accuracy, and Errors"},
           {"14-10","Number Theory"},
           {"14-10.1","Divisibility"},
           {"14-10.2","Prime Number, GCD"},
           {"14-11","Algebraic Structures"},
           {"14-11.1","Group"},
           {"14-11.2","Rings"},           
           {"15-1","Empirical Methods and Experimental Techniques"},
           {"15-1.1","Designed Experiment"},
           {"15-1.2","Observational Study"},
           {"15-1.3","Retrospective Study"},
           {"15-2","Statistical Analysis"},
           {"15-2.1","Unit of Analysis (Sampling Units), Population, and Sample"},
           {"15-2.2","Concepts of Correlation and Regression"},
           {"15-3","Measurement"},
           {"15-3.1","Levels (Scales) of Measurement"},
           {"15-3.2","Direct and Derived Measures"},
           {"15-3.3","Reliability and Validity"},
           {"15-3.4","Assessing Reliability"},
           {"15-4","Engineering Design"},
           {"15-4.1","Engineering Design in Engineering Education"},
           {"15-4.2","Design as a Problem Solving Activity"},
           {"15-4.3","Steps Involved in Engineering Design"},
           {"15-5","Modeling, Simulation, and Prototyping"},
           {"15-5.1","Modeling"},
           {"15-5.2","Simulation"},
           {"15-5.3","Prototyping"},
           {"15-6","Standards"},
           {"15-7","Root Cause Analysis"},
           {"15-7.1","Techniques for Conducting Root Cause Analysis"}        
        };
    }
    
    
}