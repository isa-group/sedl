/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.design;

import es.us.isa.sedl.core.configuration.ComplexParameter;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author José Antonio Parejo
 */
public abstract class AbstractGroup {
    
    //public List<ComplexParameter> complexValuations;
    
    public abstract List<VariableValuation> getValuations();
    
    public abstract Sizing getSizing();
    
    public abstract String getName();
    
    public AbstractGroup(){
        //complexValuations=new ArrayList<ComplexParameter>();
    }

    /*public List<ComplexParameter> getComplexValuations() {
        return complexValuations;
    }*/
        
    
    public List<Group> expandGroups()
    {
        List<Group> result=new ArrayList<Group>();
        List<VariableValuation> abstractValuations=getAbstractValuations(getValuations());
        
        if(abstractValuations.isEmpty()){
            Group g=new Group();
            g.setName(getName());
            g.setSizing(getSizing());
            g.getValuations().addAll(getValuations());
            result.add(g);
        }else{
            List<VariableValuation> concreteValuations=new ArrayList();
            for(VariableValuation vv:getValuations())
                if(!abstractValuations.contains(vv))
                    concreteValuations.add(vv);
            expandGroups(abstractValuations,concreteValuations,0,result);
        }
        return result;
    }

    public boolean isGroupSpecification() {
        boolean result=false;
        for(VariableValuation vv:getValuations())
        {
            if(vv.getLevel()==null || vv.getLevel().equals(""))
            {
                result=true;
                break;
            }
        }
        if(getValuations().isEmpty())
            result=true;
        return result;
    }

    private List<VariableValuation> getAbstractValuations(List<VariableValuation> valuations) {
        List<VariableValuation> result=new ArrayList<VariableValuation>();
        for(VariableValuation vv:valuations)
            if(vv.getLevel()==null || vv.getLevel().equals(""))
                result.add(vv);
        return result;
    }

    private void expandGroups(List<VariableValuation> abstractValuations,List<VariableValuation> concreteValuations, int i, List<Group> result) {        
       Variable v=abstractValuations.get(i).getVariable();
       VariableValuation valuation=null;
       valuation.setVariable(v);               
       if(v.getDomain().isFinite())
       {
            for(Level l:v.getDomain().getLevels()){
                valuation=new VariableValuation();
                valuation.setLevel(l);
                valuation.setVariable(v);
                concreteValuations.add(valuation);
                if(i<abstractValuations.size()-1)
                {
                    expandGroups(abstractValuations,concreteValuations,i+1,result);
                }else{
                    result.add(createGroup(abstractValuations,concreteValuations));
                }
                concreteValuations.remove(valuation);
            }
       }else
           throw new InvalidParameterException("The domain of variable '"+v.getName()+"' is infinite, you can´t use it to define the groups of the experiment!");
    }

    private Group createGroup(List<VariableValuation> abstractValuations, List<VariableValuation> concreteValuations) {
        Group result=new Group();
        result.setSizing(getSizing());
        result.getValuations().addAll(concreteValuations);
        result.setName(generateGroupName(abstractValuations,concreteValuations));
        return result;
    }

    private String generateGroupName(List<VariableValuation> abstractValuations, List<VariableValuation> concreteValuations) {
        String result="G-";
        int index=concreteValuations.size()-abstractValuations.size();
        VariableValuation valuation=null;
        for(int i=index;i<concreteValuations.size();i++)
        {
            result+=concreteValuations.get(i).getLevel().getValue();
            if(i!=concreteValuations.size()-1)
                result+="-";
        }
        return result;
    }   
}
