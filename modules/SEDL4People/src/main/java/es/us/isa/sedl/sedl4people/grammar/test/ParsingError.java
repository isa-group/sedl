/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.sedl4people.grammar.test;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.IntervalSet;

/**
 *
 * @author japarejo
 */
public class ParsingError {
        private Integer line;
        private Integer charPositionInLine;        
        private Token offendingToken;
        private IntervalSet expectedTokens;
        private String message;        

        public ParsingError(Integer line, Integer charPositionInLine, Token offendingToken, IntervalSet expectedTokens, String message) {
            this.line = line;
            this.charPositionInLine = charPositionInLine;
            this.offendingToken = offendingToken;
            this.expectedTokens = expectedTokens;
            this.message = message;
        }

        /**
         * @return the line
         */
        public Integer getLine() {
            return line;
        }

        /**
         * @param line the line to set
         */
        public void setLine(Integer line) {
            this.line = line;
        }

        /**
         * @return the charPositionInLine
         */
        public Integer getCharPositionInLine() {
            return charPositionInLine;
        }

        /**
         * @param charPositionInLine the charPositionInLine to set
         */
        public void setCharPositionInLine(Integer charPositionInLine) {
            this.charPositionInLine = charPositionInLine;
        }

        /**
         * @return the offendingToken
         */
        public Token getOffendingToken() {
            return offendingToken;
        }

        /**
         * @param offendingToken the offendingToken to set
         */
        public void setOffendingToken(Token offendingToken) {
            this.offendingToken = offendingToken;
        }

        /**
         * @return the expectedTokens
         */
        public IntervalSet getExpectedTokens() {
            return expectedTokens;
        }

        /**
         * @param expectedTokens the expectedTokens to set
         */
        public void setExpectedTokens(IntervalSet expectedTokens) {
            this.expectedTokens = expectedTokens;
        }

        /**
         * @return the message
         */
        public String getMessage() {
            return message;
        }

        /**
         * @param message the message to set
         */
        public void setMessage(String message) {
            this.message = message;
        }
        
        
    
}
