package es.us.isa.sedl.module;


import es.us.isa.sedl.core.EmpiricalStudy;
import es.us.isa.sedl.runtime.analysis.AnalysisOperation;
import es.us.isa.sedl.runtime.lifecycle.ExperimentalLifecyclePhase;

import java.util.Collection;
import java.util.Set;

/**
 *
 * @author japarejo
 */
public interface SEDLModule {    
    Set<String> getModuleNames();
    
    Set<String> supportedFormats();
    
    SEDLModuleMarshaller getModuleMarshaller(String format, EmpiricalStudy exp);
    
    SEDLModuleUnmarshaller getModuleUnmarshaller(String serializationFormat, String extensionPointID, EmpiricalStudy experimentModel);
    
    Collection<AnalysisOperation> analysesToBePerformedOn(ExperimentalLifecyclePhase phase, Class<? extends EmpiricalStudy> experimentType);
    
    Collection<Class<? extends EmpiricalStudy>> getSpecificExperimentTypes();
    
}
