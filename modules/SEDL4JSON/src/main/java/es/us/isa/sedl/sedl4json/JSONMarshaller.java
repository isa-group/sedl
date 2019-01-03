/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.sedl4json;




import es.us.isa.sedl.core.EmpiricalStudy;
import es.us.isa.sedl.core.design.AbstractIntensionDomain;
import es.us.isa.sedl.core.design.IntensionDomain;
import es.us.isa.sedl.core.util.SEDLMarshaller;

import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

/**
 *
 * @author japarejo
 */
public class JSONMarshaller implements SEDLMarshaller {

    @Override
    public List<String> write(EmpiricalStudy exp, OutputStream os) {
        List<String> result = new ArrayList<String>();
        try {
            ObjectMapper mapper = buildObjectMapper();
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
    public String asString(EmpiricalStudy exp) {
        String result;
        try {
            ObjectMapper mapper = buildObjectMapper();
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
    
    private ObjectMapper buildObjectMapper() {
        ObjectMapper mapper=new ObjectMapper();
        mapper.configure(SerializationConfig.Feature.INDENT_OUTPUT,true);        
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        mapper.setDateFormat(df);
        // We configure additional mixins:        
        mapper.getSerializationConfig().addMixInAnnotations(IntensionDomain.class,IgnoreGetLevels.class);
        mapper.getSerializationConfig().addMixInAnnotations(AbstractIntensionDomain.class,IgnoreGetLevels.class);
        return mapper;
    }
    
    class IgnoreGetLevels {
        @JsonIgnore public List<es.us.isa.sedl.core.design.Level> getLevels(){return Collections.EMPTY_LIST;}
    }
}
