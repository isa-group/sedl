/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.core.design;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author japarejo
 */
@XmlType(name = "FundamentalSet")
@XmlEnum
public enum FundamentalSet {
    N(false,true, new IntegerIteratorFactory()), 
    Z(false,true, new IntegerIteratorFactory()), 
    R(false,false,new DoubleIteratorFactory()),
    B(true,true, new BooleanIteratorFactory());
    
    boolean finite;
    boolean intervalNumerable;
    IteratorFactory iteratorFactory;

    private FundamentalSet(boolean finite, boolean intervalNumerable,IteratorFactory iteratorFactory) {
        this.finite = finite;
        this.intervalNumerable = intervalNumerable;
        this.iteratorFactory=iteratorFactory;
    }

    
    
    public boolean isFinite() {
        return finite;
    }

    public boolean isIntervalNumerable() {
        return intervalNumerable;
    }

    public IteratorFactory getIteratorFactory() {
        return iteratorFactory;
    }
    
    
}
