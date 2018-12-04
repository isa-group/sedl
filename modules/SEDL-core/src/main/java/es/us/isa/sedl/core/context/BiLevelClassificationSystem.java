package es.us.isa.sedl.core.context;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BiLevelClassificationSystem extends ClassificationSystem {
    protected Map<ClassificationEntry,Set<ClassificationEntry>> classificationSystem;
    protected Map<ClassificationEntry,ClassificationEntry> parents;
    protected int indexingCharacters;
    protected String indexingSuffix;
    public ClassificationEntry getClassByCode(String code){
        ClassificationEntry result=null;
        return result;
    }    
    
    public BiLevelClassificationSystem(){
        classificationSystem=new HashMap<ClassificationEntry, Set<ClassificationEntry>>();
        classificationSystem=new HashMap<ClassificationEntry, Set<ClassificationEntry>>();
        indexingCharacters=1;
        indexingSuffix="";
    }        

    public Set<ClassificationEntry> getSubclasses(ClassificationEntry entry){
        return classificationSystem.get(entry);
    }
    
    public boolean isMainClass(ClassificationEntry entry){
        return classificationSystem.containsKey(entry);
    }
    
    public boolean isSubClass(ClassificationEntry entry){
        return parents.get(entry)!=null;
    }
    
    @Override
    public Set<ClassificationEntry> supportedClasses() {
        return parents.keySet();
    }

    @Override
    public boolean isValid(ClassificationEntry entry) {
        return parents.containsKey(entry);
    }

    @Override
    public Set<ClassificationEntry> matchingClasses(String desc){
        Set<ClassificationEntry> result=new HashSet<ClassificationEntry>();
        for(ClassificationEntry candidate:parents.keySet())
            if(candidate.getName().contains(desc))
                result.add(candidate);
        return result;
    }

    @Override
    public Object createNewInstance() {
        return new BiLevelClassificationSystem();
    }

    @Override
    public ClassificationEntry findByCode(String code) {
        ClassificationEntry result=null;
        for(ClassificationEntry candidate:parents.keySet()){
            if(candidate.getCode().equals(code))
            {
                result=candidate;
                break;                        
            }
        }
        return result;
    }            
    
    
    protected void init(String [][] mainCathegories, String[][] subCathegories){
        ClassificationEntry entry=null;
        ClassificationEntry parent=null;
        Set<ClassificationEntry> children=null;
        for(int i=0;i<mainCathegories.length;i++){
            entry=new ClassificationEntry();
            entry.setCode(mainCathegories[i][0]);
            entry.setName(mainCathegories[i][1]);
            entry.setOrganization(this);
            parents.put(entry,null);                    
        }
        for(int i=0;i<subCathegories.length;i++){
            entry=new ClassificationEntry();
            entry.setCode(mainCathegories[i][0]);
            entry.setName(mainCathegories[i][1]);
            entry.setOrganization(this);
            parent=this.findByCode(entry.getCode().substring(0, indexingCharacters)+indexingSuffix);
            if(parent!=null){
                parents.put(entry,parent);            
                children=classificationSystem.get(parent);
                if(children==null){
                    children=new HashSet<ClassificationEntry>();
                    classificationSystem.put(parent, children);
                }
                children.add(entry);
            }else
                System.out.println("Unable to find parent of classification:"+entry.getCode()+" - "+entry.getName());
        }
    }
    
}
