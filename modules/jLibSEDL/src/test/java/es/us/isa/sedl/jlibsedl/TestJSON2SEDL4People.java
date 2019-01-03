/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.jlibsedl;

import es.us.isa.sedl.core.EmpiricalStudy;
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
"import Charts\n" +
"import RScripts\n" +
"//Context: Mindfulness is a meditation technique whose main goal is to keep the mind calm and to educate attention by focusing only on one thing at a time, usually breathing. The reported benefits of its continued practice can be of interest for Software Engineering students and practitioners, especially in tasks like conceptual modeling, in which concentration and clearness of mind are crucial. \n" +
"//Goal: In order to evaluate whether Software Engineering students enhance their conceptual modeling performance after several weeks of mindfulness practice, a series of three controlled experiments were carried out at the University of Seville during three consecutive academic years (2013–2016). \n" +
"//Method: Subjects were divided into two groups. While the experimental group practiced mindfulness, the control group was trained in public speaking as a placebo treatment. All the subjects developed two conceptual models based on a transcript of an interview, one before and another one after the treatment. The results were compared in terms of conceptual modeling quality (the percentage of model elements correctly identified) and productivity (the number of model elements correctly identified per unit of time). \n" +
"//Results: The results of the series of experiments reveal that the subjects who practiced mindfulness developed slightly better conceptual models (their quality was 8.16 % higher) and they did it faster (they were 46,67 % more productive) than the control group, even if they did not have a previous interest in meditation. \n" +
"//Conclusions: The practice of mindfulness improves the performance of Software Engineering students in conceptual modeling, especially their productivity. More experimentation is needed in order to confirm the outcomes in other Software Engineering tasks and populations. \n" +
"EXPERIMENT: Mind-1 version: 1.0 \n" +
"	//Analyze the practice of mindfulness \n" +
"	//for the purpose of evaluating its effects \n" +
"	//with respect to conceptual modeling performance \n" +
"	//from the point of view of the researchers \n" +
"	//in the context of second–year students of the Degree in Software Engineering at the University of Seville. \n" +
"Subjects:\n" +
"	//She did almost everything\n" +
"	Beatriz Bernardez Jimenez (beat@us.es) from 'University of Sevilla' as Responsible\n" +
"	//Human compiler and excellent writer\n" +
"	Amador Duran Toro (amador@us.es) from 'University of Sevilla' as Collaborator\n" +
"	//Statistics and experimental methodology support\n" +
"	Jose Antonio Parejo Maestre (japarejo@us.es) from 'University of Sevilla' as Collaborator\n" +
"	//Big Boss\n" +
"	Antonio Ruiz-Cortes (aruiz@us.es) from 'University of Sevilla' as Collaborator\n" +
"Constants:\n" +
"	NSessions : 16\n" +
"	sessionsDuration : 10\n" +
"Variables :\n" +
"	Factors :\n" +
"		//This factor represents the treatment allocated to the subjects in the training workshops.\n" +
"		treatment enum\n" +
"			/*In the mindfulness workshops, the sessions were face-to–face, four days a week.\n" +
"All the sessions followed the same dynamics: the students and the researcher responsible for conducting\n" +
"the session met in a classroom; they all sat down, lights were turned off and curtains were drawn letting only some dim light in the room; when they all were in silence, an alarm was programmed; during the first five minutes, the subjects were guided in their body scan; then, during the remaining time, they were invited to focus solely on their breathing. Sometimes, the researcher asked 'where is your mind now?' in order to re–focus them on breathing. In the event a student were late, they were instructed to enter the\n" +
"room making as less noise as possible and sit on one of the chairs that were intentionally left empty near the door.*/\n" +
"			 'MF',\n" +
"			//In the public speaking workshops, the subjects were given some basic guidelines on how to prepare a talk, some notions on non–verbal communication and some seminal talks were commented. Later, they were invited to look for related videos in the Internet and to prepare a script of a public presentation on a topic of their interest.\n" +
"			 'PS'\n" +
"		//This factor represents the conceptual modeling exercises done before and after the treatment\n" +
"		exercise enum\n" +
"			/*\n" +
"			    Number of words in the interview transcript: 951\n" +
"                Number of classes ($CLASS_R$):               8\n" +
"                Number of associations ($ASSOC_R$):          10\n" +
"                Number of attributes ( $ATTR_R$):            17\n" +
"                Average number of attributes per class:      2,29\n" +
"            */\n" +
"			 'Erasmus',\n" +
"			 /*\n" +
"			    Number of words in the interview transcript: 1223\n" +
"                Number of classes ($CLASS_R$):               8\n" +
"                Number of associations ($ASSOC_R$):          10\n" +
"                Number of attributes ( $ATTR_R$):            24\n" +
"                Average number of attributes per class:      3\n" +
"            */\n" +
"			 'EoDP'\n" +
"	Outcome :\n" +
"		//Conceptual modeling effectiveness is defined as the percentage of semantic quality achieved by a subject\n" +
"		Effectiveness float range [0,1] \n" +
"		/* Conceptual modeling efficiency is defined as the quotient between the achieved semantic quality\n" +
"               and the time in minutes spent by a subject in finishing a conceptual modeling exercise*/\n" +
"		Efficiency float range [0,1] \n" +
"Hypothesis: \n" +
"	// Mindfullness helps students make better conceptual models\n" +
"	H1: treatment impacts significantly on Effectiveness\n" +
"	// Mindfullness helps students make conceptual models faster\n" +
"	H2: treatment impacts significantly on Efficiency\n" +
"// Our Design is based on a classic mixed factorial design with repeated measures\n"  +
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
"	Analyses :\n" +
"		 DescriptiveStatitics:   \n" +
"                   Avg(by exercise)\n" +
"                   Avg(by treatment)\n" +
"                   Avg(by treatment,exercise)\n" +
"                   Median(by treatment,exercise)\n" +
"                   StdDev(by treatment,exercise)\n" +
"                NHST:               \n" +
"                   Kolmogorov-Smirnov(by exercise,treatment , 0.05)\n" +
"                   Levene(by exercise,treatment,0.05)\n" +
"                   TTest(where exercise=\"EoDP\" by treatment ,0.05)\n" +
"                   Wilcoxon(where exercise=\"EoDP\" by treatment ,0.05)" +
"Configuration:\n" +
"	C1:\n" +
"		Procedure :\n" +
"		Runs:\n" +
"			Baseline:\n" +
"                           Log: 'Log execution specification'\n"+                        
"                           Result:\n" +
"				File: 'LabPack/data/Datos2014AnalysisR.csv'";
        
        System.out.println("=============== ORIGINAL EXPERIMENT DESCRIPTION ======================");
        System.out.println(originalExperimentDescription);
        
        SEDL4PeopleUnmarshaller sedl4PeopleUnmarshaller=new SEDL4PeopleUnmarshaller();
        EmpiricalStudy result = sedl4PeopleUnmarshaller.fromString(originalExperimentDescription);
        if(!sedl4PeopleUnmarshaller.getErrors().isEmpty()){
            System.out.println("ERRORS FOUND!:");
            for(es.us.isa.sedl.core.util.Error error:sedl4PeopleUnmarshaller.getErrors())
                System.out.println(error.getMessage());
        }
        
        JSONMarshaller jsonMarshaller=new JSONMarshaller();
        String jsonExperimentDescription=jsonMarshaller.asString(result);
        
        System.out.println("=============== JSON EXPERIMENT DESCRIPTION ======================");
        System.out.println(jsonExperimentDescription);
        
        JSONUnmarshaller instance = new JSONUnmarshaller();          
        EmpiricalStudy result2 = instance.fromString(jsonExperimentDescription);
        SEDL4PeopleMarshaller marshaller =new SEDL4PeopleMarshaller();
        String reifiedExperimentDescription=marshaller.asString(result);
        assertEquals(result,result2);
        
        System.out.println("=============== REIFIED EXPERIMENT DESCRIPTION ======================");
        System.out.println(reifiedExperimentDescription);
        System.out.println("=============== REIFIED EXPERIMENT DESCRIPTION ======================");
        EmpiricalStudy result3=sedl4PeopleUnmarshaller.fromString(reifiedExperimentDescription);
                
        assertEquals(result2,result3);
    }
}
