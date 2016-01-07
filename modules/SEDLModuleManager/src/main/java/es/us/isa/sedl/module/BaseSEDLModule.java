package es.us.isa.sedl.module;

import es.us.isa.sedl.core.Experiment;
import es.us.isa.sedl.runtime.analysis.AnalysisOperation;
import es.us.isa.sedl.runtime.lifecycle.ExperimentalLifecyclePhase;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author japarejo
 */
public abstract class BaseSEDLModule implements SEDLModule {
    private Set<String> names;
    private List<Class<? extends Experiment>> experimentTypes;
    // format to unmarshaller
    protected Map<String, SEDLModuleUnmarshaller> unmarshallers;
    // format to marshaller
    protected Map<String, SEDLModuleMarshaller> marshallers;
    
    protected Map<Class<? extends Experiment>, ExperimentTypeAnalysisOperationSpecification> supportedAnalysisOperations;

    public BaseSEDLModule(Set<String> names,List<Class<? extends Experiment>> experimentTypes)
    {
        this(names, new HashMap<String, SEDLModuleUnmarshaller>(),
             new HashMap<String,SEDLModuleMarshaller>(),experimentTypes,
             new HashMap<Class<? extends Experiment>, ExperimentTypeAnalysisOperationSpecification>());
    }
    
    public BaseSEDLModule(Set<String> names, Map<String, SEDLModuleUnmarshaller> unmarshallers, Map<String, SEDLModuleMarshaller> marshallers, List<Class<? extends Experiment>> experimentTypes, Map<Class<? extends Experiment>, ExperimentTypeAnalysisOperationSpecification> supportedAnalysisOperations) {
        this.names = names;
        this.unmarshallers = unmarshallers;
        this.marshallers = marshallers;
        this.experimentTypes = experimentTypes;
        this.supportedAnalysisOperations = supportedAnalysisOperations;
    }

    
    
    @Override
    public Set<String> getModuleNames() {
        return names;
    }

    @Override
    public Set<String> supportedFormats() {
        return marshallers.keySet();
    }

    @Override
    public SEDLModuleMarshaller getModuleMarshaller(String format, Experiment exp){
        return marshallers.get(format);
    }    

    @Override
    public SEDLModuleUnmarshaller getModuleUnmarshaller(String serializationFormat, String extensionPointID, Experiment experimentModel) {
        return unmarshallers.get(serializationFormat);
    }

    @Override
    public Collection<AnalysisOperation> analysesToBePerformedOn(ExperimentalLifecyclePhase phase, Class<? extends Experiment> experimentType) {
        Set<AnalysisOperation> result=new HashSet<AnalysisOperation>();
        ExperimentTypeAnalysisOperationSpecification analisysOperationsSpec=null;
        for(Class<? extends Experiment> candidateExperimentType:supportedAnalysisOperations.keySet())
        {
            if(candidateExperimentType.isAssignableFrom(experimentType)){
                analisysOperationsSpec=supportedAnalysisOperations.get(candidateExperimentType);
                result.addAll(analisysOperationsSpec.getAnalysisOperationsByPhase().get(phase));
            }
        }
        return result;
    }

    @Override
    public Collection<Class<? extends Experiment>> getSpecificExperimentTypes() {
        return experimentTypes;
    }

    // Protected setters and getters for module creation:
    protected Map<Class<? extends Experiment>, ExperimentTypeAnalysisOperationSpecification> getSupportedAnalysisOperations() {
        return supportedAnalysisOperations;
    }

    protected Map<String, SEDLModuleMarshaller> getMarshallers() {
        return marshallers;
    }

    protected Map<String, SEDLModuleUnmarshaller> getUnmarshallers() {
        return unmarshallers;
    }
    
    
    
    
}
