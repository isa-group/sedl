/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.util;

import es.us.isa.sedl.core.util.Error;
import es.us.isa.sedl.core.EmpiricalStudy;
import java.io.InputStream;
import java.util.List;
/**
 *
 * @author japarejo
 */
public interface SEDLUnmarshaller {
    EmpiricalStudy fromString(String string);
    EmpiricalStudy read(InputStream stream);
    List<Error> getErrors();
}
