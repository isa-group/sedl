package es.us.isa.sedl.core.analysis.statistic;

import es.us.isa.sedl.core.BasicExperiment;
import es.us.isa.sedl.core.analysis.datasetspecification.DatasetSpecification;
import es.us.isa.sedl.core.design.AnalysisSpecification;
import java.util.ArrayList;
import java.util.List;


public abstract class AbstractStatisticalAnalysisSpec extends AnalysisSpecification {	
    public abstract List<Statistic> getStatistic();
    
    public List<Statistic> getExpandedStatistics(BasicExperiment experiment)
    {
        List<Statistic> result=new ArrayList<Statistic>();
        Statistic auxiliaryStatistic=null;
        for(Statistic statistic:getStatistic())
        {
            List<DatasetSpecification> specs=statistic.getDatasetSpecification().expand(experiment);
            for(DatasetSpecification spec:specs)
            {
                auxiliaryStatistic=(Statistic)statistic.clone();
                auxiliaryStatistic.setDatasetSpecification(spec);
                result.add(auxiliaryStatistic);
            }
        }
        return result;
    }
}
