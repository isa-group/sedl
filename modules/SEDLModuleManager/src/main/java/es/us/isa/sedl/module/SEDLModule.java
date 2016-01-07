package es.us.isa.sedl.module;


import es.us.isa.sedl.core.Experiment;
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
    
    SEDLModuleMarshaller getModuleMarshaller(String format, Experiment exp);
    
    SEDLModuleUnmarshaller getModuleUnmarshaller(String serializationFormat, String extensionPointID, Experiment experimentModel);
    
    Collection<AnalysisOperation> analysesToBePerformedOn(ExperimentalLifecyclePhase phase, Class<? extends Experiment> experimentType);
    
    Collection<Class<? extends Experiment>> getSpecificExperimentTypes();
    
}
