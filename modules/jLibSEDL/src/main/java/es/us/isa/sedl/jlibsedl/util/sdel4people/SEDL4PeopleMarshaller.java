/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.jlibsedl.util.sdel4people;


import es.us.isa.sedl.core.Experiment;
import es.us.isa.sedl.core.util.SEDLMarshaller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author japarejo
 */
public class SEDL4PeopleMarshaller implements SEDLMarshaller{

    @Override
    public List<String> write(Experiment exp, OutputStream os) throws IOException {
        return Collections.EMPTY_LIST;
    }

    @Override
    public String asString(Experiment exp) {
        return "";
    }
 }