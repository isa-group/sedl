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
public class IntegerIteratorFactory implements IteratorFactory{
    private int step;

    public static final int DEFAULT_STEP=1;

    public IntegerIteratorFactory() {
        this(DEFAULT_STEP);
    }    
    
    public IntegerIteratorFactory(int step) {
        this.step = step;
    }        
    
    @Override
    public Iterator<Level> create(IntervalConstraint constraint) {
        return new IntegerIntervalIterator(constraint,step);
    }
    
    
    private class IntegerIntervalIterator implements Iterator<Level>{

        private int step;
        private int current;
        private int threshold;

        public IntegerIntervalIterator(IntervalConstraint interval, int step) {
            this.step=step;
            if(interval.getMin()!=null)
                this.current=Integer.parseInt(interval.getMin());
            else
                this.current=Integer.MIN_VALUE;            
            if(interval.getMax()!=null)
                this.threshold=Integer.parseInt(interval.getMax());
            else
                this.current=Integer.MAX_VALUE;
        }                
        
        @Override
        public boolean hasNext() {
            return current<=threshold;
        }

        @Override
        public Level next() {
            Level result=new Level();
            result.setValue(String.valueOf(current));
            current=current+step;
            return result;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
}
