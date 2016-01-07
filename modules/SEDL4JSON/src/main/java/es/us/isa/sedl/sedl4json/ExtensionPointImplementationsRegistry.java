/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.sedl4json;


import java.util.HashSet;
import java.util.ServiceLoader;
import java.util.Set;
import org.reflections.Reflections;

/**
 *
 * @author japarejo
 */
public class ExtensionPointImplementationsRegistry<T>  {

    private Class<T> extensionPointClass;
    private ServiceLoader<T> loader;
    private Set<Class<? extends T>> subclasses;        

    public ExtensionPointImplementationsRegistry(Class<T> theClass) {
        extensionPointClass=theClass;
        this.loader = ServiceLoader.load(theClass);
        subclasses=new HashSet<Class<? extends T>>();
        refreshRegistry();
        
    }

    

    public void refreshRegistry() {
        // We use  org.Reflections for static identification of subclasses 
        Reflections reflections = new Reflections(extensionPointClass.getPackage().getName());
        Set<Class<?>> subTypes = (Set<Class<?>>) reflections.getSubTypesOf((Class) extensionPointClass);
        for(Class<?> classOfType:subTypes)
        {
            // By default we use the className as type identifier:
            registerSubtype(getPropertyName((Class<? extends T>)classOfType), (Class<? extends T>)classOfType);
        }        
        // and a ServiceLoader for dynamic identification of subclasses
        loader.reload();
        
        
        
        Class<? extends T> classOfType;
        for(T type:loader)
        {
            classOfType=(Class<? extends T>)type.getClass();
            // By default we use the className as type identifier:
            registerSubtype(getPropertyName(classOfType), classOfType);
        }
        
    }

    public void registerSubtype(String typeId, Class<? extends T> subtypeClass) {        
        subclasses.add(subtypeClass);
    }

    public Set<Class<? extends T>> getSubClasses() {
        return subclasses;
    }
    
    public String getPropertyName(Class<? extends T> classOfType)
    {
        String result=classOfType.getName();
        if(result.contains(".")) {
            result=result.substring(result.lastIndexOf(".")+1);
        }
        //result=result.substring(0,1).toLowerCase()+result.substring(1);
        return result;
        //return "@type";
    }    
    
}
