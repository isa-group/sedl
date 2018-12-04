/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.marshaller.renderers;

import es.us.isa.sedl.core.design.Level;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author José Antonio Parejo
 */
public class LevelRenderer extends Renderer<Level>{

    private static final LevelRenderer instance=new LevelRenderer();
    
    private LevelRenderer(){        
    }
    
    public static LevelRenderer getInstance()
    {
        return instance;
    }
    
    @Override
    public String render(Level level, String format, Locale locale) {
        String result=level.getValue();
        if(isString(result))
            result="\""+result+"\"";
        return result;
    }

    private boolean isString(String result) {
        return !isNumber(result) && !isBoolean(result) && !isObject(result);
    }

    private boolean isNumber(String result) {
        return StringUtils.isNumeric(result);
    }

    private boolean isBoolean(String result) {          
        return "true".equalsIgnoreCase(result) || "false".equalsIgnoreCase(result);  
    }

    private boolean isObject(String result) {
        return result.contains("(") && result.contains(":") && result.endsWith(")");
    }
    
}
