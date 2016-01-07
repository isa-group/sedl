/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.sedl4people.grammar.test;

/**
 *
 * @author japarejo
 */
public class SemanticsSpec {
        private final String expression;        
        private final Object semantics; 

        public SemanticsSpec(String propertyAccessExpresion, Object semantics) {
            this.expression = propertyAccessExpresion;
            this.semantics = semantics;
        }

        public String getExpression() {
            return expression;
        }

        public Object getSemantics() {
            return semantics;
        }
    
}
