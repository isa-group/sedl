package es.us.isa.sedl.core.analysis.datasetspecification;


import es.us.isa.jdataset.Column;
import es.us.isa.jdataset.DataSet;
import es.us.isa.jdataset.ListColumn;
import es.us.isa.jdataset.SimpleDataSet;
import es.us.isa.sedl.core.BasicExperiment;
import es.us.isa.sedl.core.design.ControllableFactor;
import es.us.isa.sedl.core.design.ExtensionDomain;
import es.us.isa.sedl.core.design.Level;
import es.us.isa.sedl.core.design.Outcome;
import es.us.isa.sedl.core.design.Variable;
import es.us.isa.sedl.core.design.VariableValuation;
import es.us.isa.sedl.core.design.Variables;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

public abstract class AbstractDatasetSpecification {
    public abstract List<Projection> getProjections();
    public abstract List<Filter> getFilters();    
    
    public List<GroupingProjection> getGroupings()
    {
        List<GroupingProjection> result=new ArrayList<GroupingProjection>();
        for(Projection p:getProjections())
            if(p instanceof GroupingProjection)
                result.add((GroupingProjection)p);
        return result;
    }
    
    public List<Projection> getNonGroupingProjections()
    {
        List<Projection> result=new ArrayList<Projection>();
        for(Projection p:getProjections())
            if(!(p instanceof GroupingProjection))
                result.add(p);
        return result;   
    }
    
    public List<ValuationFilter> getValuationFilters()
    {
        List<ValuationFilter> result=new ArrayList<ValuationFilter>();
        for(Filter f:getFilters())
        {
            if(f instanceof ValuationFilter)
                result.add((ValuationFilter)f);
        }
        return result;
    }
    
    public List<DatasetSpecification> expand(BasicExperiment experiment)
    {
        List<DatasetSpecification> result=new ArrayList<DatasetSpecification>();
        List<Variable> variablesToExpand=findVariablesToExpand(experiment.getDesign().getVariables());
        List<Filter> nonExpandableFilters=generateNonExpandableFilers();        
        List<Set<VariableValuation>> expandedValuations=expandValuations(variablesToExpand);
        DatasetSpecification dss=null;
        if(expandedValuations.isEmpty())
        {
            try {
                result.add((DatasetSpecification)this.clone());
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(AbstractDatasetSpecification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }else{
            for(Set<VariableValuation> valuations:expandedValuations)
            {
                result.add(createSimpleDSS(valuations,nonExpandableFilters));                
            }
        }
        if(getNonGroupingProjections().isEmpty())
            generateDefaultProjections(result,experiment);
        return result;
    }
    
    private List<Filter> generateNonExpandableFilers()
    {
        List<Filter> result=new ArrayList<Filter>();
        Filter aux;
        for(Filter f:this.getFilters())
            if(f instanceof ValuationFilter){
                aux=generateNonExpandableFilter((ValuationFilter)f);
                if(aux!=null && (!(aux instanceof ValuationFilter) || !((ValuationFilter)aux).getVariableValuations().isEmpty()))
                    result.add(aux);
            }else
                result.add(f);
        return result;
    }
    
    protected Filter generateNonExpandableFilter(ValuationFilter valuationFilter) {
        ValuationFilter result=(ValuationFilter)valuationFilter.clone();
        List<VariableValuation> valuations=new ArrayList<VariableValuation>();
        for(VariableValuation vv:valuationFilter.getVariableValuations())
            if(vv.getLevel()!=null)
                valuations.add(vv);
        result.getVariableValuations().clear();
        result.getVariableValuations().addAll(valuations);
        return result;
    }
    
    protected List<Variable> findVariablesToExpand(Variables variables)
    {
        List<Variable> result=new ArrayList<Variable>();
        for(ValuationFilter vf:this.getValuationFilters())
            for(VariableValuation vv:vf.getVariableValuations())
                if(vv.getLevel()==null)
                    result.add(variables.getVariableByName(vv.getVariable()));
        return result;
    }
    
    protected List<Set<VariableValuation>> expandValuations(List<Variable> variables)
    {
        List<Set<VariableValuation>> result=new ArrayList<Set<VariableValuation>>();                    
        expandValuations(result,variables,0);        
        return result;
    }
    
    protected void expandValuations(List<Set<VariableValuation>> result,List<Variable> variables,int index)
    {        
        if(index<variables.size())
        {
            Variable v=variables.get(index);
            VariableValuation vv;
            if(v.getDomain().isFinite()){
                if(result.isEmpty()){
                    for(Level l:v.getDomain().getLevels())
                    {
                        Set<VariableValuation> vvset=new HashSet<VariableValuation>();
                        vv=new VariableValuation();
                        vv.setVariable(v.getName());
                        vv.setLevel(l.getValue());
                        vvset.add(vv);
                        result.add(vvset);
                    }
                }else{
                    List<Set<VariableValuation>> auxiliaryResult=new ArrayList<Set<VariableValuation>>();
                    for(Set<VariableValuation> svv:result)
                    {
                        for(Level l:v.getDomain().getLevels())
                        {
                            Set<VariableValuation> vvset=new HashSet<VariableValuation>(svv);
                            vv=new VariableValuation();
                            vv.setVariable(v.getName());
                            vv.setLevel(l.getValue());
                            vvset.add(vv);
                            auxiliaryResult.add(vvset);
                        }
                    }
                    result.clear();;
                    result.addAll(auxiliaryResult);
                }
            }else
                throw new InvalidParameterException("Variable '"+v.getName()+"' has an infinite domain, thus cannot be used for expansions!");
            expandValuations(result, variables, index+1);
        }
        
        
    }

    protected DatasetSpecification createSimpleDSS(Set<VariableValuation> valuations, List<Filter> nonExpandableFilters) {
        DatasetSpecification result=null;
        try {
            result=(DatasetSpecification)this.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(AbstractDatasetSpecification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        List<Filter> actualFilters=new ArrayList<Filter>(nonExpandableFilters);
        ValuationFilter f=new ValuationFilter();
        f.getVariableValuations().addAll(valuations);
        actualFilters.add(f);
        result.getFilters().clear();
        result.getFilters().addAll(actualFilters);
        
        return result;
    }
    
    public DataSet apply(DataSet dataset)
    {
        return apply(dataset,null);
    }
    
    public DataSet apply(DataSet dataset, BasicExperiment experiment)
    {
                
        List<String> observation=null;
        DataSet result=applyFiltersAndProjections(dataset,experiment);                
        if(!getGroupings().isEmpty()){                        
            result=applyGroupings(result,experiment);                    
        }        
        return result;
    }

    private DataSet applyFiltersAndProjections(DataSet dataset, BasicExperiment exp) {
        DataSet result=applyProjections(dataset,exp);
        List<String> observation;
        boolean includeRow=true;
        for(int i=0;i<dataset.getNRows();i++)
        {            
            includeRow=true;
            for(Filter f:getFilters())
            {                
                if(!f.accept(dataset,i)){
                    includeRow=false;
                    break;
                }
            }
            if(includeRow)
                copyRow(result,i,dataset);
        }
        return result;
    }
    
    private void copyRow(DataSet result, int i, DataSet origin)
    {
        for(Column column:result.getColumns())
        {
            column.set(i, origin.getColumn(column.getName()).get(i));
        }
    }

    private DataSet applyProjections(DataSet dataset,BasicExperiment exp) {
        DataSet result=new SimpleDataSet();        
        Collection<Column<?>> columns;
        List<Projection> applicableProjections=getNonGroupingProjections();
        if(applicableProjections.isEmpty())
            applicableProjections.add(generateDefaultProjection(dataset,exp));
        for(Projection p:applicableProjections)
        {
            columns=p.apply(dataset);
            for(Column c:columns)
                result.addColumn(c.getType(),c.getName());        
        }                
        return result;
    }
    
    private Projection generateDefaultProjection(DataSet dataset,BasicExperiment experiment)
    {
        Projection projection=new Projection();
        if(experiment==null || !getGroupings().isEmpty()){
            if(dataset!=null){
                for(Column c:dataset.getColumns())
                    projection.getProjectedVariables().add(c.getName());
            }else if(experiment!=null)
                for(Variable v:experiment.getDesign().getVariables().getVariables())
                    projection.getProjectedVariables().add(v.getName());
        }else{
            List<Outcome> outcomes=experiment.getDesign().getOutcomes();
            for(Outcome outcome:outcomes)
            {
                projection.getProjectedVariables().add(outcome.getName());
            }
        }
        return projection;
    }
    
    private void generateDefaultProjections(List<DatasetSpecification> result, BasicExperiment experiment) {        
        Projection projection=generateDefaultProjection(null,experiment);
        for(DatasetSpecification spec:result)
            spec.getProjections().add(projection);
    }
    
    
    private DataSet applyGroupings(DataSet dataset, BasicExperiment experiment)
    {
        List<Variable> groupingVariables=new ArrayList<Variable>();
        Variable variable=null;
        for(GroupingProjection gp:getGroupings()){
            for(String variableName:gp.getProjectedVariables()){
                if(experiment!=null){
                    variable=experiment.getDesign().getVariables().getVariableByName(variableName);
                }else
                    variable=generateEspureousVariable(variableName,dataset);
                groupingVariables.add(variable);
            }
        }
        List<Set<VariableValuation>> groups=expandValuations(groupingVariables);
        DataSet result=new SimpleDataSet();
        ValuationFilter valuationFilter=new ValuationFilter();
        Column newColumn=null;
        String columnName=null;
        for(Set<VariableValuation> group:groups){
            valuationFilter.getVariableValuations().clear();
            valuationFilter.getVariableValuations().addAll(group);
            for(Column c:dataset.getColumns()){
                if(!inValuationSet(c.getName(),group)){
                    columnName=generateGroupingName(c,group);
                    result.addColumn(c.getType(), columnName);
                    newColumn=result.getColumn(columnName);
                    for(int i=0;i<dataset.getNRows();i++)
                    {
                        if(valuationFilter.accept(dataset, i))
                            newColumn.add(c.get(i));
                    }          
                }      
            }
        }
        return result;
    }
    
    private String generateGroupingName(Column c,Set<VariableValuation> group){
         StringBuilder sb=new StringBuilder(c.getName()+"|");
         boolean first=true;
         for(VariableValuation val:group)
         {
             if(!first)
                 sb.append("_AND_");
             sb.append(val.getVariable());
             sb.append("=");
             sb.append(val.getLevel());
             first=false;
         }   
         return sb.toString();
    }

    private Variable generateEspureousVariable(String variableName, DataSet dataset) {
        ControllableFactor cf=new ControllableFactor();
        cf.setName(variableName);
        ExtensionDomain domain=new ExtensionDomain();
        Set values=new HashSet();
        for(int i=0;i<dataset.getNRows();i++)
            values.add(dataset.getColumn(variableName).get(i));
        Level level=null;        
        for(Object value:values){
           level=new Level();
           level.setValue(value.toString());
           domain.getLevels().add(level);
        }
        cf.setDomain(domain);
        return cf;
    }

    private boolean inValuationSet(String name, Set<VariableValuation> group) {
        for(VariableValuation v:group)
        {
            if(v.getVariable().equals(name))
                return true;
        }
        return false;
    }
    

    
    
}
