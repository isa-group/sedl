/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.sedl4people.grammar.test;

import es.us.isa.sedl.grammar.SEDL4PeopleLexer;
import es.us.isa.sedl.grammar.SEDL4PeopleParser;
import java.io.IOException;
import java.io.InputStream;
import junit.framework.TestCase;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author japarejo
 */
public class SEDL4PeopleGrammarTest extends TestCase {
    protected SEDL4PeopleLexer lexer;
    protected CommonTokenStream tokens;
    protected SEDL4PeopleParser parser;

    	    

    protected void setup(InputStream stream, BaseErrorListener errorListener) throws IOException
    {
        lexer= new SEDL4PeopleLexer(new ANTLRInputStream(stream));
        tokens = new CommonTokenStream(lexer);
        parser= new SEDL4PeopleParser(tokens);
        if(errorListener!=null){
            lexer.addErrorListener(errorListener);
            parser.addErrorListener(errorListener);
        }
        
    	
    }
}
