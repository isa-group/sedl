/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.marshaller.renderers;

import java.util.Locale;
import org.stringtemplate.v4.AttributeRenderer;

/**
 *
 * @author José Antonio Parejo
 * @param <T> Type to be Rendered
 */
public abstract class Renderer<T> implements AttributeRenderer {

    @Override
    public String toString(Object o, String format, Locale locale) {
        return render((T)o,format,locale);
    }
    
    public abstract String render(T object, String format, Locale locale);
    
    
}
