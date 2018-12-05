/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.design;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author José Antonio Parejo
 */
public abstract class AbstractFullySpecifiedExperimentalDesign extends ExperimentalDesign {
    public abstract List<Group> getGroups();
    
    public List<Group> getFullSetOfGroups(Variables vars)
    {
        List<Group> result=getGroups();
        if(result.size()==1)
        {
            Group g=result.get(0);
            if(g.isGroupSpecification())
                result=g.expandGroups(vars);
        }
        return result;
    }
       
    
}
