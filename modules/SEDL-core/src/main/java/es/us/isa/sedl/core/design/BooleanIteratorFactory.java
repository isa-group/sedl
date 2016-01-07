/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.core.design;

import java.util.Iterator;

/**
 *
 * @author japarejo
 */
public class BooleanIteratorFactory implements IteratorFactory{

    @Override
    public Iterator<Level> create(IntervalConstraint constraint) {
        return new BooleanIterator();
    }
    
    private class BooleanIterator implements Iterator<Level>
    {
        int current;
        
        public BooleanIterator()
        {
            current=0;
        }
        
        @Override
        public boolean hasNext() {
            return current<2;
        }

        @Override
        public Level next() {
            Level result=new Level();
            result.setValue(String.valueOf(current==1));
            current++;
            return result;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
