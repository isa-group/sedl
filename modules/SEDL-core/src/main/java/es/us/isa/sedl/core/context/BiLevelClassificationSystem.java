package es.us.isa.sedl.core.context;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BiLevelClassificationSystem extends ClassificationSystem {
    protected Map<ClassificationTerm,Set<ClassificationTerm>> classificationSystem;
    protected Map<ClassificationTerm,ClassificationTerm> parents;
    protected int indexingCharacters;
    protected String indexingSuffix;
    public ClassificationTerm getClassByCode(String code){
        ClassificationTerm result=null;
        return result;
    }    
    
    public BiLevelClassificationSystem(){
        classificationSystem=new HashMap<ClassificationTerm, Set<ClassificationTerm>>();
        classificationSystem=new HashMap<ClassificationTerm, Set<ClassificationTerm>>();
        indexingCharacters=1;
        indexingSuffix="";
    }        

    public Set<ClassificationTerm> getSubclasses(ClassificationTerm entry){
        return classificationSystem.get(entry);
    }
    
    public boolean isMainClass(ClassificationTerm entry){
        return classificationSystem.containsKey(entry);
    }
    
    public boolean isSubClass(ClassificationTerm entry){
        return parents.get(entry)!=null;
    }
    
    @Override
    public Set<ClassificationTerm> supportedClasses() {
        return parents.keySet();
    }

    @Override
    public boolean isValid(ClassificationTerm entry) {
        return parents.containsKey(entry);
    }

    @Override
    public Set<ClassificationTerm> matchingClasses(String desc){
        Set<ClassificationTerm> result=new HashSet<ClassificationTerm>();
        for(ClassificationTerm candidate:parents.keySet())
            if(candidate.getName().contains(desc))
                result.add(candidate);
        return result;
    }

    @Override
    public Object createNewInstance() {
        return new BiLevelClassificationSystem();
    }

    @Override
    public ClassificationTerm findByCode(String code) {
        ClassificationTerm result=null;
        for(ClassificationTerm candidate:parents.keySet()){
            if(candidate.getCode().equals(code))
            {
                result=candidate;
                break;                        
            }
        }
        return result;
    }            
    
    
    protected void init(String [][] mainCathegories, String[][] subCathegories){
        ClassificationTerm entry=null;
        ClassificationTerm parent=null;
        Set<ClassificationTerm> children=null;
        for(int i=0;i<mainCathegories.length;i++){
            entry=new ClassificationTerm();
            entry.setCode(mainCathegories[i][0]);
            entry.setName(mainCathegories[i][1]);
            entry.setClassificationSystem(this.getName());
            parents.put(entry,null);                    
        }
        for(int i=0;i<subCathegories.length;i++){
            entry=new ClassificationTerm();
            entry.setCode(mainCathegories[i][0]);
            entry.setName(mainCathegories[i][1]);
            entry.setClassificationSystem(this.getName());
            parent=this.findByCode(entry.getCode().substring(0, indexingCharacters)+indexingSuffix);
            if(parent!=null){
                parents.put(entry,parent);            
                children=classificationSystem.get(parent);
                if(children==null){
                    children=new HashSet<ClassificationTerm>();
                    classificationSystem.put(parent, children);
                }
                children.add(entry);
            }else
                System.out.println("Unable to find parent of classification:"+entry.getCode()+" - "+entry.getName());
        }
    }
    
}
