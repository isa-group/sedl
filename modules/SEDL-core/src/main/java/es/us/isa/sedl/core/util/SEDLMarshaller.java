/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.util;

	
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import es.us.isa.sedl.core.EmpiricalStudy;

/**
 *
 * @author japarejo
 */
public interface SEDLMarshaller {
    List<String> write(final EmpiricalStudy exp, final OutputStream os) throws IOException;
    String asString(EmpiricalStudy exp);
}
