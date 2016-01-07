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
public class DoubleIteratorFactory implements IteratorFactory{
    private double step;

    public static final double DEFAULT_PRECISION=0.01;
    
    public DoubleIteratorFactory()
    {
        this(DEFAULT_PRECISION);
    }
        
    public DoubleIteratorFactory(double step) {
        this.step = step;
    }

    @Override
    public Iterator<Level> create(IntervalConstraint constraint) {
        return new DoubleIntervalIterator(constraint,step);
    }
    
    
    private class DoubleIntervalIterator implements Iterator<Level>{

        private double step;
        private double current;
        private double threshold;

        public DoubleIntervalIterator(IntervalConstraint interval,double step) {
            this.step=step;
            if(interval.getMin()!=null)
                this.current=Double.parseDouble(interval.getMin());
            else
                this.current=Double.MIN_VALUE;            
            if(interval.getMax()!=null)
                this.threshold=Double.parseDouble(interval.getMax());
            else
                this.current=Double.MAX_VALUE;
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
