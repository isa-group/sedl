/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.design;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author José Antonio Parejo
 */
public abstract class AbstractIntensionDomain extends Domain {
    
        public abstract List<Constraint> getConstraint();
    
        @JsonIgnore
        @Override
        public List<Level> getLevels() {
        if (!isFinite()) {
            throw new InvalidParameterException("You cannot get the set of levels of an infinite domain.");
        }
        IntervalConstraint intConst = null;
        FundamentalSet set = FundamentalSet.R;
        for (Constraint c : getConstraint()) {
            if (c instanceof IntervalConstraint) {
                intConst = (IntervalConstraint) c;
            } else if (c instanceof FundamentalSetConstraint) {
                set = ((FundamentalSetConstraint) c).getFundamentalSet();
            }
        }
        List<Level> result = new ArrayList<Level>();
        IteratorFactory iterFactory = set.getIteratorFactory();
        Iterator<Level> iterator = iterFactory.create(intConst);
        while (iterator.hasNext()) {
            result.add(iterator.next());
        }
        return result;
    }

    @Override
    public Boolean isFinite() {
        boolean result = false;
        boolean hasBounds = false;
        FundamentalSet set = FundamentalSet.R;
        for (Constraint c : getConstraint()) {
            if (c instanceof IntervalConstraint) {
                IntervalConstraint intConst = (IntervalConstraint) c;
                hasBounds = (intConst.getMax() != null && intConst.getMin() != null);
            } else if (c instanceof FundamentalSetConstraint) {
                set = ((FundamentalSetConstraint) c).getFundamentalSet();
            }
        }
        result = set.isFinite() || (hasBounds && set.isIntervalNumerable());
        return result;
    }
    
    public boolean contains(Level l)
    {
        for(Constraint c:getConstraint())
        {
            if(!c.isMetBy(l))
                return false;
        }
        return true;
    }

}
