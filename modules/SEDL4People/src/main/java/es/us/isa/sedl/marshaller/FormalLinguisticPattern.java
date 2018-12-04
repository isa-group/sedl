/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.marshaller;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author japarejo
 */
public enum FormalLinguisticPattern {
    StructuredAbstract(true,"Context:","Goal:","Method:","Results:","Conclusions:"),
    GQM(false,"Analyze","for the purpose of", "with respect to","from the point of view of","in the context of");
    
    boolean phrasalPattern;
    private List<String> prefixes;
    private List<String> suffixes;

    private FormalLinguisticPattern(boolean phrasalPattern,String ... prefixes ) { 
        this.phrasalPattern=phrasalPattern;
        this.prefixes=Lists.newArrayList(prefixes);
        this.suffixes=new ArrayList<>();
        for(int i=0;i<prefixes.length;i++)
            this.suffixes.add("");
    }
    
    private FormalLinguisticPattern(boolean phrasalPattern,String[] prefixes,String[] suffixes ) { 
        this.phrasalPattern=phrasalPattern;
        int length=Math.max(prefixes.length,suffixes.length);
        this.prefixes=Lists.newArrayList(prefixes);
        this.suffixes=Lists.newArrayList(suffixes);
        for(int i=prefixes.length;i<length;i++)
            this.suffixes.add("");
        for(int i=suffixes.length;i<length;i++)
            this.suffixes.add("");   
    }
    
    public List<String> apply(List<String> text){        
        List<String> result=new ArrayList<>(text.size());        
        for(int i=0;i<text.size();i++){
            if(i<prefixes.size())
                result.add(apply(text.get(i),prefixes.get(i),suffixes.get(i)));
            else
                result.add(text.get(i));            
        }
        return result;
    }
    
    private String apply(String text, String prefix, String suffix){
        String result=text.trim();
        if(!text.startsWith(prefix)){
            if(!prefix.endsWith(" "))
                result=prefix+" "+result;
            else
                result=prefix+result;
        }
        if(!result.endsWith(suffix) && !(phrasalPattern && result.endsWith(suffix+"."))){            
            result=result+suffix;
        }
        if(phrasalPattern && !result.endsWith(".") && !result.endsWith(".</p>") && !result.endsWith(".</span>"))
            result+=". ";
        else 
            result+=" ";
        return result;
    }
    
    public List<String> extract(List<String> text){
        List<String> result=new ArrayList<>(text.size());        
        for(int i=0;i<text.size();i++){
            if(i<prefixes.size())
                result.add(extract(text.get(i),prefixes.get(i),suffixes.get(i)));
            else
                result.add(text.get(i));            
        }
        return result;
    }
    
    private String extract(String text, String prefix, String suffix){
        String result=text.trim();        
        if(result.startsWith(prefix))
            result=result.substring(prefix.length());
        if(result.endsWith(suffix))
            result=result.substring(0,result.length()-suffix.length());
        else if(result.endsWith(suffix+"."))
            result=result.substring(0,result.length()-(suffix.length()+1));
        return result;
    }
    
    
}
