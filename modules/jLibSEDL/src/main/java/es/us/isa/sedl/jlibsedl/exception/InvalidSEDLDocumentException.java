/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.jlibsedl.exception;

import java.util.List;
import es.us.isa.sedl.core.util.Error;

/**
 *
 * @author japarejo
 */
public class InvalidSEDLDocumentException extends Exception {

    public InvalidSEDLDocumentException(List<Error> errors) {
        super(generateMessage(errors));
    }

    public static String generateMessage(List<Error> errors) {
        StringBuilder builder = new StringBuilder();
        for (Error error : errors) {
            if (error.getLineNo() >= 0) {
                builder.append("Line: ").append(error.getLineNo());
            }
            builder.append(" - ").append(error.getSeverity().name());
            builder.append(":  ").append(error.getMessage());
            builder.append(System.getProperty("line.separator"));
        }
        return builder.toString();
    }
}
