/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.marshaller.renderers;

import es.us.isa.sedl.core.design.Group;
import es.us.isa.sedl.core.design.Literal;
import es.us.isa.sedl.core.design.VariableValuation;
import java.util.Locale;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

/**
 *
 * @author José Antonio Parejo
 */
public class GroupRenderer extends Renderer<Group>{

    private static final GroupRenderer instance=new GroupRenderer();
    private static final String templateGroupFile="templates/SEDL.stg";
    private static final String concreteGroupTemplate="concreteGroup";
    private ST template;
    private GroupRenderer(){
        STGroupFile group=new STGroupFile(templateGroupFile);
        template=group.getInstanceOf(concreteGroupTemplate);
    }
    
    public static GroupRenderer getInstance()
    {
        return instance;
    }
    
    @Override
    public String render(Group group, String format, Locale locale) {
        StringBuilder sb=new StringBuilder();
        if(group.isGroupSpecification()){
            sb.append(" by ");            
            int i=0;
            for(VariableValuation vv:group.getValuations()){
                if(vv.getLevel()==null || vv.getLevel()==null || "".equals(vv.getLevel())){
                    if(i!=0)
                        sb.append(", ");
                    sb.append(vv.getVariable());
                    i++;
                }
            }
            if(group.getValuations().isEmpty())
                sb.append(group.getName());
                
            if(group.getSizing()!=null){
                sb.append(" sizing ");
                Literal size =  (Literal) group.getSizing();
                sb.append(size.getValue());
            }
            
        }else{
            template.add("g", group);
            sb.append(template.render());
        }
        return sb.toString();
    }
    
}
