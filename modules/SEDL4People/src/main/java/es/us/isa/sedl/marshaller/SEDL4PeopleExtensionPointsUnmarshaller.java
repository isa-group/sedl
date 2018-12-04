/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.marshaller;

import es.us.isa.sedl.core.Experiment;
import es.us.isa.sedl.core.ExtensionPointElement;
import java.util.List;
import java.util.Map;

/**
 *
 * @author japarejo
 */
public interface SEDL4PeopleExtensionPointsUnmarshaller {    
       
    public List<es.us.isa.sedl.core.util.Error> unmarshall(List<String> importedModules, Map<String, List<ExtensionPointElement>> extensionPointsInstantiations, Experiment experiment); 

}
