/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.marshaller;

import es.us.isa.sedl.core.Experiment;
import es.us.isa.sedl.core.analysis.datasetspecification.DatasetSpecification;
import es.us.isa.sedl.core.design.Group;
import es.us.isa.sedl.core.design.Level;
import es.us.isa.sedl.core.util.SEDLMarshaller;
import es.us.isa.sedl.marshaller.renderers.GroupRenderer;
import es.us.isa.sedl.marshaller.renderers.LevelRenderer;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

/**
 *
 * @author José Antonio Parejo
 */
public class SEDL4PeopleStringTemplateMarshaller  implements SEDLMarshaller {

    public static final String templateFileName="templates/SEDL.stg";
    
    private STGroup group;
    private ST st;
    
    public SEDL4PeopleStringTemplateMarshaller()
    {
        group = new STGroupFile(templateFileName);
        group.registerRenderer(Group.class, GroupRenderer.getInstance());
        group.registerRenderer(Level.class,LevelRenderer.getInstance());
        st=group.getInstanceOf("document");
        
    }
    
    @Override
    public List<String> write(Experiment exp, OutputStream os) throws IOException {
        os.write(asString(exp).getBytes(Charset.forName("UTF-8")));
        return Collections.EMPTY_LIST;
    }

    @Override
    public String asString(Experiment exp) {                        
        st.add("e",exp);
        return st.render();
    }
    
    public String asString(DatasetSpecification ds)
    {
        String result="";    
        if(ds!=null){
            ST dsST=group.getInstanceOf("document");
            dsST.add("dataSetSpecification",ds);
            result= dsST.render();
        }
        return result;
    }
    
    
}
