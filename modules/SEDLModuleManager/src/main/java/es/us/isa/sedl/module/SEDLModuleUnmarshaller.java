package es.us.isa.sedl.module;

import es.us.isa.sedl.core.Experiment;
import es.us.isa.sedl.core.ExtensionPointElement;
import es.us.isa.sedl.core.util.Error;
import java.util.Collection;

/**
 *
 * @author japarejo
 */
public interface SEDLModuleUnmarshaller {

    public Collection<? extends Error> unmarshall(ExtensionPointElement element, Experiment experiment); 

}
