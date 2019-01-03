/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.jlibsedl;

import es.us.isa.sedl.core.EmpiricalStudy;
import es.us.isa.sedl.core.util.Error;
import es.us.isa.sedl.core.util.SEDLMarshaller;
import es.us.isa.sedl.core.util.SEDLUnmarshaller;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author japarejo
 */
public class JLibSEDL {
    
    public static final SerializationFormat DEFAULT_SERIALIZATION_FORMAT = SerializationFormat.SEDL4People;

    public static SEDLDocument createDocument() {
        return new SEDLDocument();
    }

    public static boolean isSEDL(InputStream stream,SerializationFormat format) {
        SEDLDocument document = null;
        try
        {
            document=readDocument(stream,format);
        }catch(Exception ex){
            if(document!=null)
                document.getErrors().add(new Error(-1, Error.ERROR_SEVERITY.FATAL, ex.getMessage()));
            else
                System.out.println(ex.getMessage());
        }
        return document != null && document.getExperiment() != null;
    }

    public static boolean isSEDL(File f) {
        boolean result = false;
        if (f != null) {
            if (f.exists() && f.isFile()) {
                try {
                    result = isSEDL(new FileInputStream(f),inferSerializationFormat(f));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(JLibSEDL.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return result;
    }

    public static SEDLDocument readDocument(File f) throws FileNotFoundException {
        SEDLDocument result = null;
        if (f != null) {
            if (f.exists() && f.isFile()) {                
                    result = readDocument(new BufferedInputStream(new FileInputStream(f)),inferSerializationFormat(f));                
            }else {
                throw new FileNotFoundException("File '"+f.getAbsolutePath()+"' not found.");
            }
        }
        return result;
    }
    
    public static SerializationFormat inferSerializationFormat(File f)
    {
        return inferSerializationFormat(f.getName());
    }
    
    public static SerializationFormat inferSerializationFormat(String s)
    {
        SerializationFormat result=DEFAULT_SERIALIZATION_FORMAT;
        String extension=s.substring(s.lastIndexOf(".")+1);
        for(SerializationFormat format:SerializationFormat.values())
        {
            if(format.getValidFileExtensions().contains(extension)){
                result=format;
                break;
            }
        }
        return result;
    }

    public static SEDLDocument readDocument(InputStream stream, SerializationFormat format) {                
        return readDocument(stream,format.getUnmarshaller());
    }

    private static SEDLDocument readDocument(InputStream stream,SEDLUnmarshaller unmarshaller) {        
        EmpiricalStudy experiment = unmarshaller.read(stream);                                 
        return new SEDLDocument(experiment, unmarshaller.getErrors());
    }

    public static SEDLDocument readDocument(URI uri)
    {
        if(uri==null)
            return null;
        return readDocument(uri,inferSerializationFormat(uri.toString()));
    }
    
    public static SEDLDocument readDocument(URI uri, SerializationFormat format) {
        SEDLDocument result = null;
        List<Error> errors = new ArrayList<Error>();
        if (uri != null) {
            InputStream in = null;
            try {
                in = uri.toURL().openStream();
                if (in == null) {
                    result = readDocument(in, format);
                } else {
                    errors.add(new Error(0, Error.ERROR_SEVERITY.FATAL, "Cannot find resource: " + uri));
                }
            } catch (MalformedURLException ex) {
                Logger.getLogger(JLibSEDL.class.getName()).log(Level.SEVERE, null, ex);
                errors.add(new Error(0, Error.ERROR_SEVERITY.FATAL, ex.getLocalizedMessage()));
            } catch (IOException ioEx) {
                errors.add(new Error(0, Error.ERROR_SEVERITY.FATAL, ioEx.getLocalizedMessage()));
            } finally {
                try {
                    if (in != null) {
                        in.close();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(JLibSEDL.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (result == null) {
                result = new SEDLDocument(null, errors);
            }
        }
        return result;
    }

    public static List<Error> saveDocument(EmpiricalStudy exp, OutputStream stream) {
        return saveDocument(exp, stream, DEFAULT_SERIALIZATION_FORMAT);
    }
    
    public static List<Error> saveDocument(EmpiricalStudy exp, OutputStream stream, SerializationFormat format) {       
        return saveDocument(exp,stream,format.getMarshaller());
    }

    public static List<Error> saveDocument(EmpiricalStudy exp, OutputStream stream,SEDLMarshaller marshaller) {
        List<Error> errors = new ArrayList<Error>();
        if (stream != null) {
            try {                
                List<String> marshallingErrors = marshaller.write(exp, stream);
                stream.flush();
                stream.close();
                for (String error : marshallingErrors) {
                    errors.add(new Error(0, Error.ERROR_SEVERITY.FATAL, "["+marshaller.getClass().getSimpleName()+" ERROR]:" + error));
                }
            } catch (IOException ex) {
                Logger.getLogger(JLibSEDL.class.getName()).log(Level.SEVERE, null, ex);
                errors.add(new Error(0, Error.ERROR_SEVERITY.FATAL, ex.getLocalizedMessage()));
            }
        } else {
            errors.add(new Error(0, Error.ERROR_SEVERITY.FATAL, "Null output stream!"));
        }
        return errors;
    }
    
    public static String getXML(EmpiricalStudy exp, OutputStream stream, SEDLMarshaller marshaller) {
        if (stream != null) {
            try {                
                marshaller.write(exp, stream);
                stream.flush();
                
                stream.close();
//                for (String error : marshallingErrors) {
//                    errors.add(new Error(0, Error.ERROR_SEVERITY.FATAL, "["+marshaller.getClass().getSimpleName()+" ERROR]:" + error));
//                }
            } catch (IOException ex) {
                Logger.getLogger(JLibSEDL.class.getName()).log(Level.SEVERE, null, ex);
//                errors.add(new Error(0, Error.ERROR_SEVERITY.FATAL, ex.getLocalizedMessage()));
            }
        } else {
//            errors.add(new Error(0, Error.ERROR_SEVERITY.FATAL, "Null output stream!"));
        }
        return stream.toString();
    }

    public static List<Error> saveDocument(EmpiricalStudy experiment, File f) {
        List<Error> errors = new ArrayList<Error>();
        if (f != null) {
            try {
                errors = saveDocument(experiment, new BufferedOutputStream(new FileOutputStream(f)),inferSerializationFormat(f));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(JLibSEDL.class.getName()).log(Level.SEVERE, null, ex);
                errors.add(new Error(0, Error.ERROR_SEVERITY.INFO, "[EROR Opening file]: " + ex.getLocalizedMessage()));
            }
        } else {
            errors.add(new Error(0, Error.ERROR_SEVERITY.FATAL, "Null file!"));
        }
        return errors;
    }

    public static String XMLasString(SEDLDocument document) {

        OutputStream output = new OutputStream() {
            private StringBuilder string = new StringBuilder();

            @Override
            public void write(int b) throws IOException {
                this.string.append((char) b);
            }

            @Override
            public String toString() {
                return this.string.toString();
            }
        };
        List<Error> errors = saveDocument(document.getExperiment(), output);
        return output.toString();
    }
    
    private static SEDLDocument readDocumentSEDL4People(InputStream stream) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private static SEDLDocument readDocumentJSON(InputStream stream) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private static void saveDocumentSEDL4People(EmpiricalStudy exp, OutputStream stream) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private static void saveDocumentJSON(EmpiricalStudy exp, OutputStream stream) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    private String getAs(EmpiricalStudy exp, SerializationFormat format)
    {
        String result=null;
        switch(format){
            
        }
        return result;
    }
    
    
}
