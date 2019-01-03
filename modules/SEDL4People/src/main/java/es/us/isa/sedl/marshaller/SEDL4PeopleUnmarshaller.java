package es.us.isa.sedl.marshaller;


import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.google.common.collect.Lists;
import es.us.isa.sedl.core.EmpiricalStudy;

import es.us.isa.sedl.core.util.Error;
import es.us.isa.sedl.core.util.SEDLUnmarshaller;
import es.us.isa.sedl.error.SEDL4PeopleErrorListener;
import es.us.isa.sedl.grammar.SEDL4PeopleLexer;
import es.us.isa.sedl.grammar.SEDL4PeopleParser;



public class SEDL4PeopleUnmarshaller implements SEDLUnmarshaller {

    public static final int SEDL = 2;
    public static final int COMMENTS = 2;
    
    private List<Error> errors = new ArrayList<Error>();
    private SEDL4PeopleErrorListener errorListener;
    private SEDL4PeopleExtendedListener listener;
    private SEDL4PeopleExtensionPointsUnmarshaller epUnmarshaller;
    CommonTokenStream tokens;
    CommonTokenStream comments;
    
    
    
    @Override
    public EmpiricalStudy read(InputStream stream) {
    	
        EmpiricalStudy result=null;        
        errors.clear();
        errorListener = new  SEDL4PeopleErrorListener();
        errorListener.clearErrors();
        try { 	
        	
            SEDL4PeopleLexer lexer = new SEDL4PeopleLexer(new ANTLRInputStream(stream));
    	    lexer.addErrorListener(errorListener);
    	    tokens = new CommonTokenStream(lexer);            
    	    
    	    SEDL4PeopleParser parser = new SEDL4PeopleParser(tokens);

    	    parser.addErrorListener(errorListener);
    	    		
    	    ParseTreeWalker walker = new ParseTreeWalker(); 
    	    listener = new SEDL4PeopleExtendedListener(errorListener,tokens);
    	    walker.walk(listener, parser.document());
    	    parser.addParseListener(listener);
            if(epUnmarshaller!=null)
                errors.addAll(getEpUnmarshaller().unmarshall(parser.getImportedModules(),listener.getExtensionPointsInstantiations(),listener.getExperimentModel()));
    	    if (errorListener.hasErrors()) {
    	    	errors.addAll(errorListener.getErrors());
    	    	result = null;
    	    } else {
    	    	 	result = listener.getExperimentModel();
    	    }
    	    
        } catch (Exception ex) {
            if ( errorListener.hasErrors() ) {
    	    	errors.addAll(errorListener.getErrors());
    	    	result = null;
            } else
            	errors = Lists.newArrayList(new Error(0, Error.ERROR_SEVERITY.FATAL, ex.getLocalizedMessage()));        
            ex.printStackTrace();
        }
        return result;
    }

    
   
    public List<Error> getErrors() {
        return errors;
    }

	public CommonTokenStream getTokens() {
		return tokens;
	}

	public SEDL4PeopleExtendedListener getListener() {
		return listener;
	}

	public SEDL4PeopleErrorListener getErrorListener() {
		return errorListener;
	}


	public EmpiricalStudy fromString(String experimentDescription) {
        return read(new ByteArrayInputStream(experimentDescription.getBytes()));
    }

    /**
     * @return the epUnmarshaller
     */
    public SEDL4PeopleExtensionPointsUnmarshaller getEpUnmarshaller() {
        return epUnmarshaller;
    }

    /**
     * @param epUnmarshaller the epUnmarshaller to set
     */
    public void setEpUnmarshaller(SEDL4PeopleExtensionPointsUnmarshaller epUnmarshaller) {
        this.epUnmarshaller = epUnmarshaller;
    }
    
}
