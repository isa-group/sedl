/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.jlibsedl.util;

import com.google.common.collect.Lists;
import es.us.isa.sedl.core.ControlledExperiment;
import es.us.isa.sedl.core.EmpiricalStudy;
import es.us.isa.sedl.core.configuration.Configuration;
import es.us.isa.sedl.core.configuration.CommandExperimentalTask;
import es.us.isa.sedl.core.configuration.ExperimentalProcedure;
import es.us.isa.sedl.core.configuration.TaskBasedExperimentalProcedure;
import es.us.isa.sedl.jlibsedl.JLibSEDL;
import es.us.isa.sedl.jlibsedl.SEDLDocument;
import es.us.isa.sedl.jlibsedl.SerializationFormat;

import java.io.File;
import java.util.List;


/**
 *
 * @author japarejo
 */
public class GenerateSampleExperiments {
    public static final String DEFAULT_BASE_PATH="./src/main/resources/samples";
    public static void main(String [] args)
    {        
        
        String basePath=DEFAULT_BASE_PATH;
        if(args.length!=0) {
            basePath=args[0];
        }
        List<EmpiricalStudy> experiments=Lists.newArrayList(createEmptyExperiment(),createSimpleExperiment(),createSimpleCommandExperiment());
        File f;
        for(EmpiricalStudy experiment:experiments)
        {
            for(SerializationFormat format:SerializationFormat.values())
            {
                f=new File(basePath+File.separator+experiment.getName()+"."+format.getValidFileExtensions().get(0));
                JLibSEDL.saveDocument(experiment, f);
            }
        }
    }
        
        public static EmpiricalStudy createEmptyExperiment() {
        // Create Experiment:               
        EmpiricalStudy experiment=new ControlledExperiment();
        experiment.setName("Empty_Experiment");
        experiment.setId("Empty_Experiment");                
        experiment.setVersion("1.0.0-SNAPSHOT");        
        
        return experiment;
    }
    
    
    public static EmpiricalStudy createSimpleExperiment() {
        // Create Experiment:               
        EmpiricalStudy experiment=new ControlledExperiment();
        experiment.setName("SimpleExperiment");
        experiment.setId("SimpleExperiment");                
        experiment.setVersion("1.0.0-SNAPSHOT");        
        return experiment;
    }

    public static EmpiricalStudy createSimpleCommandExperiment() {
        ControlledExperiment result = new ControlledExperiment();
        result.setName("SimpleCommandExperiment");
        result.setVersion("1.0.0-SNAPSHOT");        
        result.setId(result.getName());
        Configuration config = new Configuration();
        config.setId("executableConfig");
        TaskBasedExperimentalProcedure exScheme = new TaskBasedExperimentalProcedure();
        CommandExperimentalTask command = new CommandExperimentalTask();
        command.setName("mkdir");
        command.getParameters().add("DONE");
        command.setPath("");
        exScheme.getTasks().add(command);
        config.setExperimentalProcedure(exScheme);
        result.getConfigurations().add(config);
        return result;
    }
    
    private EmpiricalStudy createComplexDocument() {
        return null;
    }

    private SEDLDocument createMOEDLDocument() {
        return null;
    }
}
