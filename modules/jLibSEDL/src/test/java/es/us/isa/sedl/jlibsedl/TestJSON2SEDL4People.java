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
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author japarejo
 */
public class TestJSON2SEDL4People {
    @Test
    public void test()
    {
        String originalExperimentDescription = 
"//Context: Mindfulness is a meditation technique whose main goal is to keep the mind calm and to educate attention by focusing only on one thing at a time, usually breathing. The reported benefits of its continued practice can be of interest for Software Engineering students and practitioners, especially in tasks like conceptual modeling, in which concentration and clearness of mind are crucial. \n" +
"//Goal: In order to evaluate whether Software Engineering students enhance their conceptual modeling performance after several weeks of mindfulness practice, a series of three controlled experiments were carried out at the University of Seville during three consecutive academic years (2013–2016). \n" +
"//Method: Subjects were divided into two groups. While the experimental group practiced mindfulness, the control group was trained in public speaking as a placebo treatment. All the subjects developed two conceptual models based on a transcript of an interview, one before and another one after the treatment. The results were compared in terms of conceptual modeling quality (the percentage of model elements correctly identified) and productivity (the number of model elements correctly identified per unit of time). \n" +
"//Results: The results of the series of experiments reveal that the subjects who practiced mindfulness developed slightly better conceptual models (their quality was 8.16% higher) and they did it faster (they were 46,67% more productive) than the control group, even if they did not have a previous interest in meditation. \n" +
"//Conclusions: The practice of mindfulness improves the performance of Software Engineering students in conceptual modeling, especially their productivity. More experimentation is needed in order to confirm the outcomes in other Software Engineering tasks and populations. \n" +
"EXPERIMENT: Baseline version: 1.0 \n" +
"//Analyze the practice of mindfulness\n" +
"//for the purpose of evaluating its effects\n" +
"//with respect to conceptual modeling performance\n" +
"//from the point of view of the researchers\n" +
"//in the context of second–year students of the Degree in Software Engineering at the University of Seville\n" +
"Subjects:\n" +
"	Beatriz Bernardez Jimenez (beat@us.es) from 'University of Sevilla' as Responsible\n" +
"	Amador Durán Toro (amador@us.es) from 'University of Sevilla' as Collaborator\n" +
"	José Antonio Parejo Maestre (japarejo@us.es) from 'University of Sevilla' as Collaborator\n" +
"	Antonio Ruiz Cortés (aruiz@us.es) from 'University of Sevilla' as Collaborator\n" +
"Constants:\n" +
"	NSessions : 16\n" +
"	sessionsDuration : 10\n" +
"Variables :\n" +
"	Factors :\n" +
"		treatment enum 'MF', 'PS'\n" +
"		exercise enum 'Erasmus', 'EoDP'\n" +
"	Outcome :\n" +
"		Effectiveness float range [0,1] \n" +
"		Efficiency float range [0,1] \n" +
"Hypothesis: \n" +
"	H1: treatment impacts significantly on Effectiveness\n" +
"	H2: treatment impacts significantly on Efficiency\n" +
"Design :\n" +
"	Sampling : Random\n" +
"	Assignment : Custom\n" +
"	Groups : G-MF() sizing 16,G-PS() sizing 16\n" +
"	Protocol : \n" +
"		Measurement G-PS(exercise:'Erasmus' )\n" +
"		Measurement G-MF(exercise:'Erasmus' )\n" +
"		Treatment G-MF(treatment:'MF' )\n" +
"		Treatment G-PS(treatment:'PS' )\n" +
"		Measurement G-PS(exercise:'EoDP' )\n" +
"		Measurement G-MF(exercise:'EoDP' )\n" +
"\n" +
"	Analyses :\n" +
"		DescriptiveStatistics:\n" +
"			Avg(by exercise)\n" +
"			Avg(by treatment)\n" +
"			Avg(by treatment,exercise)\n" +
"			Median(by treatment,exercise)\n" +
"			StdDev(by treatment,exercise)\n" +
"		NHST:\n" +
"			Kolmogorov-Smirnov(by exercise,treatment, 0.05)\n" +
"			Levene(by exercise,treatment, 0.05)\n" +
"			TTest(by treatment, 0.05)\n" +
"			ANOVA(by treatment,exercise, 0.05)\n" +
"Configuration:\n" +
"	C1:\n" +
"		Procedure :\n" +
"		Runs:\n" +
"			Baseline:\n" +
"				Result:\n" +
"					File: 'data/Datos2014AnalysisR.csv'";
        
        System.out.println("=============== ORIGINAL EXPERIMENT DESCRIPTION ======================");
        System.out.println(originalExperimentDescription);
        
        SEDL4PeopleUnmarshaller sedl4PeopleUnmarshaller=new SEDL4PeopleUnmarshaller();
        Experiment result = sedl4PeopleUnmarshaller.fromString(originalExperimentDescription);
        
        JSONMarshaller jsonMarshaller=new JSONMarshaller();
        String jsonExperimentDescription=jsonMarshaller.asString(result);
        
        System.out.println("=============== JSON EXPERIMENT DESCRIPTION ======================");
        System.out.println(jsonExperimentDescription);
        
        JSONUnmarshaller instance = new JSONUnmarshaller();          
        Experiment result2 = instance.fromString(jsonExperimentDescription);
        SEDL4PeopleMarshaller marshaller =new SEDL4PeopleMarshaller();
        String reifiedExperimentDescription=marshaller.asString(result);
        assertEquals(result,result2);
        
        System.out.println("=============== REIFIED EXPERIMENT DESCRIPTION ======================");
        System.out.println(reifiedExperimentDescription);
        System.out.println("=============== REIFIED EXPERIMENT DESCRIPTION ======================");
        Experiment result3=sedl4PeopleUnmarshaller.fromString(reifiedExperimentDescription);
                
        assertEquals(result2,result3);
    }
}
