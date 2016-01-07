/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.module;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 *
 * @author japarejo
 */
public interface SEDLModuleMarshaller<T> {
    List<String> write(final T extensionPointRealization, final OutputStream os,String modulePrefix) throws IOException;
    String asString(T extensionPointRealization,String modulePrefix);
}
