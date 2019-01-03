package es.us.isa.sedl.core.design;

import es.us.isa.sedl.core.ControlledExperiment;
import es.us.isa.sedl.core.analysis.datasetspecification.DatasetSpecification;
import es.us.isa.sedl.core.analysis.statistic.Statistic;
import es.us.isa.sedl.core.design.AnalysisSpecificationGroup;
import java.util.ArrayList;
import java.util.List;


public abstract class AbstractStatisticalAnalysisSpec extends AnalysisSpecificationGroup {	
    public abstract List<Statistic> getStatistic();
    
    public List<Statistic> getExpandedStatistics(ControlledExperiment experiment)
    {
        List<Statistic> result=new ArrayList<Statistic>();
        Statistic auxiliaryStatistic=null;
        for(Statistic statistic:getStatistic())
        {
            List<DatasetSpecification> specs=null;
            if(statistic.getDatasetSpecification()!=null){
                specs=statistic.getDatasetSpecification().expand(experiment);
                for(DatasetSpecification spec:specs)
                {
                    auxiliaryStatistic=(Statistic)statistic.clone();
                    auxiliaryStatistic.setDatasetSpecification(spec);
                    result.add(auxiliaryStatistic);
                }
            }else
                result.add(statistic);
        }
        return result;
    }
}
