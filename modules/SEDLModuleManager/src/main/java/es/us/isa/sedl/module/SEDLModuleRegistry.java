package es.us.isa.sedl.module;


import es.us.isa.sedl.util.ImplementationsRegistry;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author japarejo
 */
public class SEDLModuleRegistry extends ImplementationsRegistry<SEDLModule> {

    private static Logger logger = Logger.getLogger(SEDLModuleRegistry.class.getName());

    public SEDLModuleRegistry() {
        super(SEDLModule.class,"es.us.isa.sedl.module");
        for(Class<? extends SEDLModule> c:subclassesById.values())
        {                           
                SEDLModule module=instantiate(c);
                if(module!=null)
                    for(String name:module.getModuleNames())
                        registerSubtype(name,c);
        }
    }

    public SEDLModule getModule(String moduleName) {
         SEDLModule result=null;
         result=instantiate(subclassesById.get(moduleName));
         return result;
    }

    @Override
    public void registerSubtype(String typeId, Class<? extends SEDLModule> subtypeClass) {
        super.registerSubtype(typeId, subtypeClass);

        SEDLModule module = instantiate(subtypeClass);
        if(module!=null){
            for (String moduleName : module.getModuleNames()) {
                if (subclassesById.containsKey(moduleName)) {
                    logger.log(Level.SEVERE, "The module name '" + moduleName + "' is duplicated, registered for modules " + subtypeClass.getSimpleName() + " and " + subclassesById.get(moduleName).getSimpleName());
                }
                subclassesById.put(moduleName, subtypeClass);
            }
        }

    }

    private SEDLModule instantiate(Class<? extends SEDLModule> subtypeClass) {
        SEDLModule result=null;
        try {
            if(subtypeClass!=null && !Modifier.isAbstract(subtypeClass.getModifiers())){
                Object obj=subtypeClass.getConstructor().newInstance();
                result=(SEDLModule)obj;
            }
        } catch (InstantiationException ex) {
            logger.log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            logger.log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            logger.log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            logger.log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            logger.log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            logger.log(Level.SEVERE, null, ex);
        }
        return result;
    }

}
