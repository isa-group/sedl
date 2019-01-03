/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.module.sedl4people;


import es.us.isa.sedl.module.SEDLModule;
import es.us.isa.sedl.module.SEDLModuleRegistry;
import es.us.isa.sedl.module.SEDLModuleUnmarshaller;
import es.us.isa.sedl.core.EmpiricalStudy;
import es.us.isa.sedl.core.ExtensionPointElement;
import es.us.isa.sedl.core.util.Error;
import es.us.isa.sedl.marshaller.SEDL4PeopleExtensionPointsUnmarshaller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author japarejo
 */
public class SEDL4PeopleExtensionPointsUnmarshallerImplementation implements SEDL4PeopleExtensionPointsUnmarshaller {

    private final SEDLModuleRegistry registry=new SEDLModuleRegistry();
    
    public List<Error> unmarshall(List<String> importedModules, Map<String, List<ExtensionPointElement>> extensionPointsInstantiations, EmpiricalStudy experiment) {
        List<Error> errors=new ArrayList<Error>();
        SEDLModule module;
        SEDLModuleUnmarshaller unmarshaller;
        List<ExtensionPointElement> elements;
        
        
        for(String moduleName:importedModules)
        {            
            module=registry.getModule(moduleName);            
            if(module!=null){
                for(String extensionPointID:extensionPointsInstantiations.keySet())
                {                
                    elements=extensionPointsInstantiations.get(extensionPointID);
                    for(ExtensionPointElement element:elements){                
                        if(module.getModuleNames().contains(element.getElementIdentifier())){
                            unmarshaller=module.getModuleUnmarshaller("SEDL4People", extensionPointID, experiment);                
                            errors.addAll(unmarshaller.unmarshall(element,experiment));                            
                        }
                    }
                }
            }else{
                Error error=new Error(0, Error.ERROR_SEVERITY.ERROR, "'"+moduleName+"' is not a valid module name.");
                errors.add(error);
            }
        }
        return errors;
    }
    
}
