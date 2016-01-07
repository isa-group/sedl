/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.sedl4json;



import es.us.isa.sedl.core.Experiment;
import es.us.isa.sedl.core.util.SEDLMarshaller;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author japarejo
 */
public class JSONMarshaller implements SEDLMarshaller {

    @Override
    public List<String> write(Experiment exp, OutputStream os) {
        List<String> result = new ArrayList<String>();
        try {
            ObjectMapper mapper = new ObjectMapper();
            SEDLModule module = new SEDLModule();
            /*for(Class c:module.getDynamicTypingClasses()) {
                mapper.addMixInAnnotations(c,TypeInfoConfiguration.class);
            }*/
            mapper.registerModule(module);
            module.configure(mapper);
            mapper.writeValue(os, exp);
        } catch (Exception ex) {
            Logger.getLogger(JSONMarshaller.class.getName()).log(Level.SEVERE, null, ex);
            result.add(ex.getMessage());
        }
        return result;
    }

    @Override
    public String asString(Experiment exp) {
        String result;
        try {
            ObjectMapper mapper = new ObjectMapper();
            SEDLModule module = new SEDLModule();
            /*for(Class c:module.getDynamicTypingClasses()) {
                mapper.addMixInAnnotations(c,TypeInfoConfiguration.class);
            }*/
            mapper.registerModule(module);
            module.configure(mapper);
            result=mapper.writeValueAsString(exp);
        } catch (Exception ex) {
            Logger.getLogger(JSONMarshaller.class.getName()).log(Level.SEVERE, null, ex);
            result="ERROR: "+ex.getMessage();
        }
        return result;
    }

    @JsonTypeInfo(
            include = JsonTypeInfo.As.PROPERTY,
    property = "@type",
    use = JsonTypeInfo.Id.NAME)
    private class TypeInfoConfiguration {
    }
}
