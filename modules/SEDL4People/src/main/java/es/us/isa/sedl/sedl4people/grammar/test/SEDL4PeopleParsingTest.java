
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.sedl4people.grammar.test;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.IntervalSet;
/**
 *
 * @author japarejo
 */
public class SEDL4PeopleParsingTest extends SEDL4PeopleGrammarTest {
    private static Logger log=Logger.getLogger(SEDL4PeopleParsingTest.class.getName());
    protected List<ParsingError> errors;

    public SEDL4PeopleParsingTest() {
        this.errors=new ArrayList<ParsingError>();
    }
    
    public void setup(String input) throws IOException
    {
        InputStream is = new BufferedInputStream(new ByteArrayInputStream(input.getBytes()));
        setup(is);
    }
    
    public void setup(File f) throws IOException
    {
        InputStream is = new BufferedInputStream(new FileInputStream(f));
    }
    
    public void setup(InputStream stream) throws IOException
    {
        errors.clear();
        super.setup(stream, new LexicalErrorListener(errors));
    }

    private void parse(String syntaxRule, String code) {
        try {
            Method method=parser.getClass().getMethod(syntaxRule, null);
            method.invoke(parser);            
        } catch (NoSuchMethodException ex) {
            log.log(Level.SEVERE, null, ex);
            System.out.println("Unable to find method '"+syntaxRule+"' on parser");
            fail(ex.getMessage());
        } catch (SecurityException ex) {
            log.log(Level.SEVERE, null, ex);
            fail(ex.getMessage());
        } catch (IllegalAccessException ex) {
            log.log(Level.SEVERE, null, ex);
            fail(ex.getMessage());
        } catch (IllegalArgumentException ex) {
            log.log(Level.SEVERE, null, ex);
            fail(ex.getMessage());
        } catch (InvocationTargetException ex) {
            log.log(Level.SEVERE, null, ex);
            fail(ex.getMessage());
        }
    }
    
    public boolean generatesNoErrors(String syntaxRule,String code)
    {
        boolean result=false;
        try {
            setup(code);            
            parse(syntaxRule,code);
            result=errors.isEmpty();
            
        } catch (IOException ex) {
            log.log(Level.SEVERE, null, ex);
            errors.add(new ParsingError(0, 0, null, IntervalSet.EMPTY_SET, ex.getMessage()));
        }
        return result;
    }
    
    public boolean generatesNErrors(int n,String syntaxRule,String code)
    {
        boolean result=false;
        parse(syntaxRule,code);
        result=errors.size()==n;
        return result;
    }
    
    public boolean generatesErrorsAtLines(int []lines,String syntaxRule,String code)
    {
        boolean result=false;
        parse(syntaxRule,code);
        result=errors.isEmpty();
        return result;
    }        
    
    private class LexicalErrorListener extends BaseErrorListener
    {
      private List<ParsingError> errors;

        public LexicalErrorListener(List<ParsingError> errors) {
            this.errors = errors;
        }
      
      @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
							Object offendingSymbol,
							int line,
							int charPositionInLine,
							String msg,
							RecognitionException e)
	{
            Token offendingToken=null;
            IntervalSet expectedTokens=IntervalSet.EMPTY_SET;
            if(e!=null){
                offendingToken=e.getOffendingToken();
                expectedTokens=e.getExpectedTokens();
            }else if(offendingSymbol!=null)
                msg+="("+offendingSymbol.toString()+") ";
            ParsingError error=new ParsingError(line, charPositionInLine, offendingToken, expectedTokens, msg);
            errors.add(error);   
        }
      
    }
        
    
    
}
