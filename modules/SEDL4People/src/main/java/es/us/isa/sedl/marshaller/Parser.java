/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.marshaller;

import org.antlr.v4.runtime.ParserRuleContext;

/**
 *
 * @author José Antonio Parejo
 */
public interface Parser<X ,Y extends ParserRuleContext> {
    public X parse(String s, SEDL4PeopleExtendedListener listener);
    public X parse(Y context, SEDL4PeopleExtendedListener listener);
}
