/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.util;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import org.reflections.Reflections;

/**
 *
 * @author japarejo
 * @param <T> Interface for which we seek implementations.
 */
public class ImplementationsRegistry<T>  {

    private String packageToScan;
    private final Class<T> extensionPointClass;
    private  ServiceLoader<T> loader;
    private  Set<Class<? extends T>> subclasses;        
    protected  Map<String, Class<? extends T>> subclassesById;

    public ImplementationsRegistry(Class<T> theClass) {
        this(theClass,theClass.getPackage().getName());
    }
    public ImplementationsRegistry(Class<T> theClass,String packageToScan) {
        extensionPointClass=theClass;
        this.loader = ServiceLoader.load(theClass);
        subclasses=new HashSet<Class<? extends T>>();
        subclassesById=new HashMap<String, Class<? extends T>>();
        this.packageToScan=packageToScan;
        refreshRegistry();        
    }  

    public void refreshRegistry() {
        // We use  org.Reflections for static identification of subclasses         
        Reflections reflections = new Reflections(packageToScan);
        Set<Class<?>> subTypes = (Set<Class<?>>) reflections.getSubTypesOf((Class) extensionPointClass);
        for(Class<?> classOfType:subTypes)
        {
            if(classOfType!=null)
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
        subclassesById.put(typeId, subtypeClass);
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
        return result;        
    }    
    
}
