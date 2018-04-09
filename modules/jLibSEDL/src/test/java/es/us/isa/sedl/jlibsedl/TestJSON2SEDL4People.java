/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.jlibsedl;

import es.us.isa.sedl.core.Experiment;
import es.us.isa.sedl.marshaller.SEDL4PeopleMarshaller;
import es.us.isa.sedl.marshaller.SEDL4PeopleUnmarshaller;
import es.us.isa.sedl.sedl4json.JSONMarshaller;

import es.us.isa.sedl.sedl4json.JSONUnmarshaller;
import org.junit.Test;

/**
 *
 * @author japarejo
 */
public class TestJSON2SEDL4People {
    @Test
    public void test()
    {
        String originalExperimentDescription = "/*  #===========================================================================#\n" +
"    #    Formal Experiment Description in SEDL                                  #\n" +
"    #===========================================================================#\n" +
"    # This experimental description is part of the laboratory package of the    #\n" +
"    # paper entitled:                                                           #\n" +
"    #                                                                           #\n" +
"    #  \"Can mindfulness make software engineers better?                         #\n" +
"    #   A replicated experiment to evaluate its effects in conceptual modeling\" #\n" +
"    #   To be submitted to the Journal of Systems and Software                  #\n" +
"    #                               (Special Issue on Replications)             #\n" +
"    #                                                                           #\n" +
"    #---------------------------------------------------------------------------#\n" +
"    #   Specifically, this document describes the baseline experiment,          #\n" +
"    #   described in :                                                          #\n" +
"    #   \"A controlled experiment to evaluate the effects of mindfulness in      #\n" +
"    #    software engineering\".                                                 #\n" +
"    #   In Proceedings of the 8th ACM/IEEE International Symposium on           #\n" +
"    #    Empirical Software Engineering and Measurement (ESEM '14). ACM,        #\n" +
"    #    New York, NY, USA. DOI=http://dx.doi.org/10.1145/2652524.2652539        #\n" +
"    #===========================================================================#\n" +
"    # Created on 2015/11/26 by J. A. Parejo                                     #\n" +
"    #===========================================================================#\n" +
"*/\n" +
"import Charts \n" +
"EXPERIMENT:Mind-1 version:1.0\n" +
"    \n" +
"Constants:\n" +
"    NSessions: 16   // Number of sessions of complimentary teaching (Mindfullness) taken by subjects\n" +
"    sessionsDuration: 10   // Number of minutes per session\n" +
"Variables:\n" +
"Factors:        \n" +
"    treatment enum \"MF\",    // Mindfulness\n" +
"                   \"PS\"     // Public Speaking\n" +
"    exercise enum \"Erasmus\",    // Erasmus exercise \n" +
"                  \"EoDP\"    // Degree Dissertation exercise \n" +
"Outcome:\n" +
"   Effectiveness float range [0,1]      // Number of correctly identified classes, attributes and associations / total classes and associations\n" +
"   Efficiency float range [0,1]         // Correctly identified elements per minute\n" +
"\n" +
"Hypothesis: \n" +
"    treatment impacts significantly on Effectiveness\n" +
"    treatment impacts significantly on Efficiency\n" +
"\n" +
"Design: \n" +
"  Sampling: Random\n" +
"  Assignment: Custom        // Thus this is a Quasi-Experiment\n" +
"  Groups:\n" +
"    G-MF() sizing 16,\n" +
"    G-PS() sizing 16\n" +
"  Protocol:\n" +
"    // First Exercise: Erasmus\n" +
"    Measurement G-PS(exercise:\"Erasmus\")\n" +
"    Measurement G-MF(exercise:\"Erasmus\")\n" +
"    // Mindfulness sessions:\n" +
"    Treatment G-MF(treatment:\"MF\")\n" +
"    // Public Speaking sessions: \n" +
"    Treatment G-PS(treatment:\"PS\")\n" +
"    // Second Exercise: Degree Dissertation\n" +
"    Measurement G-PS(exercise:\"EoDP\") \n" +
"    Measurement G-MF(exercise:\"EoDP\")\n" +
"    \n" +
"  Analyses:                  \n" +
"    DescriptiveStatitics:   \n" +
"        Avg(by exercise)\n" +
"        Avg(by treatment)\n" +
"        Avg(by treatment,exercise)\n" +
"        Median(by treatment,exercise)\n" +
"        StdDev(by treatment,exercise)\n" +
"   Charts:  \n" +
"        Charts::Histogram by treatment,exercise\n" +
"        Charts::BoxPlot by treatment,exercise\n" +
"    NHST:               \n" +
"        Kolmogorov-Smirnov(by exercise,treatment , 0.05)\n" +
"        Levene(by exercise,treatment,0.05)\n" +
"        TTest(where exercise=\"EoDP\" by treatment ,0.05)\n" +
"        Wilcoxon(where exercise=\"EoDP\" by treatment ,0.05)\n" +
"    \n" +
"Configuration:\n" +
"    C1:\n" +
"        Procedure:\n" +
"        Runs:\n" +
"            Baseline:\n" +
"                Result: \n" +
"                    File: 'data/Datos2014AnalysisR.csv'";
        
        System.out.println("=============== ORIGINAL EXPERIMENT DESCRIPTION ======================");
        System.out.println(originalExperimentDescription);
        
        SEDL4PeopleUnmarshaller sedl4PeopleUnmarshaller=new SEDL4PeopleUnmarshaller();
        Experiment result = sedl4PeopleUnmarshaller.fromString(originalExperimentDescription);
        
        JSONMarshaller jsonMarshaller=new JSONMarshaller();
        String jsonExperimentDescription=jsonMarshaller.asString(result);
        
        System.out.println("=============== JSON EXPERIMENT DESCRIPTION ======================");
        System.out.println(jsonExperimentDescription);
        
        JSONUnmarshaller instance = new JSONUnmarshaller();                
        SEDL4PeopleMarshaller marshaller =new SEDL4PeopleMarshaller();
        
        System.out.println("=============== REIFIED EXPERIMENT DESCRIPTION ======================");
        System.out.println(marshaller.asString(result));
    }
}
