/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.jlibsedl.util.sdel4people;


import es.us.isa.sedl.core.EmpiricalStudy;
import es.us.isa.sedl.core.util.SEDLUnmarshaller;
import es.us.isa.sedl.core.util.Error;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

/**
 *
 * @author japarejo
 */
public class SEDL4PeopleUnmarshaller implements SEDLUnmarshaller{

    @Override
    public EmpiricalStudy read(InputStream stream) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Error> getErrors() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public EmpiricalStudy fromString(String string) {
        return read(new ByteArrayInputStream(string.getBytes()));
    }
    
}
