package es.us.isa.sedl.error;

import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

import es.us.isa.sedl.core.util.Error.ERROR_SEVERITY;

public class SEDL4PeopleErrorListener extends BaseErrorListener {

	public static SEDL4PeopleErrorListener INSTANCE = new SEDL4PeopleErrorListener();
	private List<SEDL4PeopleError> errors = new LinkedList<SEDL4PeopleError>();
	
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
				Object offendingSymbol, int line, int charPositionInLine,
				String msg, RecognitionException e) {
		int charEndOffset = charPositionInLine;
		if (  offendingSymbol != null && offendingSymbol instanceof Token ) {
			charEndOffset = ((Token) offendingSymbol).getStopIndex() - ((Token)offendingSymbol).getStartIndex();
		}
		
//		System.out.println("SEDL4PeopleErrorListener ERROR:\n" + "line " + line + ":" + charPositionInLine+1 + ":" + charEndOffset+1 + " " + msg);
		
		errors.add(new SEDL4PeopleError(Integer.valueOf(line).intValue() -1 , charPositionInLine + 1, charEndOffset + 1,  ERROR_SEVERITY.ERROR, "line " + line + ":"
				+ charPositionInLine + " " + msg ));
		
	}
	
	public List<SEDL4PeopleError> getErrors() {
		return errors;
	}

	public boolean hasErrors() {
		return !errors.isEmpty();
	}

	public void clearErrors() {
		errors.clear();
	}

	@Override
	public String toString() {
		return "SEDL4PeopleErrorListener [errors=" + errors + "]";
	}
	
	

}
