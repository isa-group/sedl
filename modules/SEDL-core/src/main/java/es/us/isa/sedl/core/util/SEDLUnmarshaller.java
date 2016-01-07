/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.util;

import es.us.isa.sedl.core.util.Error;
import es.us.isa.sedl.core.Experiment;
import java.io.InputStream;
import java.util.List;
/**
 *
 * @author japarejo
 */
public interface SEDLUnmarshaller {
    Experiment fromString(String string);
    Experiment read(InputStream stream);
    List<Error> getErrors();
}
