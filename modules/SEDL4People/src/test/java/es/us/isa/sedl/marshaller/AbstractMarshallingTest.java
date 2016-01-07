/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.marshaller;

import es.us.isa.sedl.core.design.Group;
import es.us.isa.sedl.core.design.Level;
import es.us.isa.sedl.marshaller.renderers.GroupRenderer;
import es.us.isa.sedl.marshaller.renderers.LevelRenderer;
import java.security.InvalidParameterException;
import junit.framework.TestCase;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

/**
 *
 * @author José Antonio Parejo
 */
public class AbstractMarshallingTest  extends TestCase{

    protected STGroup group;
        
        
    @Override
    protected void setUp() throws Exception
    {        
        String stringTemplateFile="templates/SEDL.stg";
        group=new STGroupFile(stringTemplateFile);     
        group.registerRenderer(Group.class, GroupRenderer.getInstance());
        group.registerRenderer(Level.class, LevelRenderer.getInstance());
    }
    
    protected ST getTemplate(String templateName, Object model, String modelName){
        ST result=group.getInstanceOf(templateName);
        if(result!=null)
            result.add(modelName,model);
        else
            throw new InvalidParameterException("There is no template with name: '"+templateName+"'");
        return result;
    }        
    
    public void testSpurious(){}
}
