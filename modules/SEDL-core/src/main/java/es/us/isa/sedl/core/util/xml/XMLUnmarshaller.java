/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.util.xml;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import es.us.isa.sedl.core.util.Error;

import es.us.isa.sedl.core.util.SEDLUnmarshaller;
import es.us.isa.sedl.core.Experiment;

/**
 *
 * @author japarejo
 */
public class XMLUnmarshaller<T> implements SEDLUnmarshaller{

//private static final Logger logger = Logger.getLogger(XMLUnmarshaller.class);
    /**
     * The bookmark file.
     */
    protected URI uri;
    
    protected List<Error> errors;

    public XMLUnmarshaller() {
        uri=null;
        errors=new ArrayList<Error>();
    }
    
    /**
     * Create an xml based loader of bookmarks.
     *
     * @param uri the bookmark file
     */
    public XMLUnmarshaller(final URI uri) {
        this.uri = uri;
    }

//
// BookmarksXMLLoader
//
    /**
     * Load bookmarks into a action list.
     *     
* @throws IOException If an I/O error occurred.
     * @throws FileNotFoundException If the resource was not found.
     */
    public T load(Class docClass) throws IOException {
        final InputStream in = getClass().getResourceAsStream("/" + uri.getPath());

        if (in == null) {
            errors.add(new Error(0, Error.ERROR_SEVERITY.FATAL, "Cannot find resource: " + uri));
            throw new FileNotFoundException("Cannot find resource: " + uri);
            
        }

        try {
            return load(docClass, in);
        } finally {
            in.close();
        }
    }

    public T load(Class docClass, final InputStream in) {
        errors.clear();
        T o = null;
        o = unmarshal(docClass, in);
        return o;
    }

    public T unmarshal(Class docClass, InputStream inputStream) {
        T res;
        res = null;
        try {
            String packageName = docClass.getPackage().getName();
            JAXBContext jc = JAXBContext.newInstance(packageName);
            Unmarshaller u = jc.createUnmarshaller();
            JAXBElement<T> doc = u.unmarshal(new StreamSource(inputStream), docClass);
            res = (T)doc.getValue();
        } catch (JAXBException ex) {
            Logger.getLogger(XMLUnmarshaller.class.getName()).log(Level.SEVERE, "Error while unmarshalling.", ex);
            errors.add(new Error(0, Error.ERROR_SEVERITY.FATAL, ex.getMessage()));
        }
        return res;
    }

    @Override
    public List<Error> getErrors() {
        return errors;
    }

    @Override
    public Experiment read(InputStream stream) {
        return (Experiment)load(Experiment.class,stream);
    }

    @Override
    public Experiment fromString(String experimentDescription) {
        return read(new ByteArrayInputStream(experimentDescription.getBytes()));
    }
            

}
