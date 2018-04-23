/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.sedl4json;

import com.google.common.collect.Lists;
import es.us.isa.sedl.core.Experiment;
import es.us.isa.sedl.core.design.IntensionDomain;
import es.us.isa.sedl.core.util.Error;
import es.us.isa.sedl.core.util.SEDLUnmarshaller;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.PropertyNamingStrategy;

/**
 *
 * @author japarejo
 */
public class JSONUnmarshaller implements SEDLUnmarshaller {

    List<Error> errors = Collections.EMPTY_LIST;

    @Override
    public Experiment read(InputStream stream) {
        Experiment result = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            DateFormat df=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
            mapper.setDateFormat(df);
            //mapper.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
            SEDLModule module = new SEDLModule();
            mapper.registerModule(module);
            module.configure(mapper);
            result = mapper.readValue(stream, Experiment.class);
        } catch (Exception ex) {
            Logger.getLogger(JSONUnmarshaller.class.getName()).log(Level.SEVERE, null, ex);
            errors = Lists.newArrayList(new Error(0, Error.ERROR_SEVERITY.FATAL, ex.getLocalizedMessage()));
        }
        return result;
    }

    @Override
    public List<Error> getErrors() {
        return errors;
    }

    @Override
    public Experiment fromString(String experimentDescription) {
        return read(new ByteArrayInputStream(experimentDescription.getBytes()));
    }


}
