/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.sedl4json;

import com.google.common.collect.Lists;
import es.us.isa.sedl.core.Experiment;
import es.us.isa.sedl.core.analysis.AnalysisResult;
import es.us.isa.sedl.core.analysis.datasetspecification.Filter;
import es.us.isa.sedl.core.analysis.datasetspecification.Projection;
import es.us.isa.sedl.core.analysis.statistic.Statistic;
import es.us.isa.sedl.core.analysis.statistic.StatisticalTestAssertion;
import es.us.isa.sedl.core.configuration.ExperimentalEnvironment;
import es.us.isa.sedl.core.configuration.ExperimentalTask;
import es.us.isa.sedl.core.configuration.Parameter;
import es.us.isa.sedl.core.design.AnalysisSpecification;
import es.us.isa.sedl.core.design.Domain;
import es.us.isa.sedl.core.design.ExperimentalDesign;
import es.us.isa.sedl.core.design.ExperimentalProtocolStep;
import es.us.isa.sedl.core.design.Sizing;
import es.us.isa.sedl.core.design.Constraint;
import es.us.isa.sedl.core.design.Variable;
import es.us.isa.sedl.core.execution.ExperimentalResult;
import es.us.isa.sedl.core.hypothesis.Assertion;
import es.us.isa.sedl.core.hypothesis.Hypothesis;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Logger;
import org.codehaus.jackson.Version;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.module.SimpleModule;

/**
 *
 * @author japarejo
 */
public class SEDLModule extends SimpleModule {

    private static final String NAME = "SEDLDeserializationModule";
    private static String VERSION;
    Set<Class> extensionPoints;
    Map<Class, ExtensionPointImplementationsRegistry> extensionPointsRegistries;

    public SEDLModule() {
        super(NAME, buildVersion(VERSION));
        extensionPoints = new HashSet<Class>();
        extensionPointsRegistries = new HashMap<Class, ExtensionPointImplementationsRegistry>();
        initializeClasses();
        registerDeserializers();
        registerTypeInfoMixins();
        VERSION = getVersion();
    }

    public void refreshExtensionPointsRegistries() {
        for (ExtensionPointImplementationsRegistry epr : extensionPointsRegistries.values()) {
            epr.refreshRegistry();
        }
    }

    public static String getVersion() {
        InputStream is;
        String result = "";
        try {
            URL url = Version.class.getResource("configuration.properties");
            if (url == null) {
                return result;
            }
            is = url.openStream();
            Properties props = new Properties();
            props.load(is);
            result = props.getProperty("version");
            is.close();
        } catch (IOException ex) {
            Logger.getLogger(SEDLModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return result;
    }

    public static final Version buildVersion(String myVersion) {
        if (myVersion == null || myVersion.equals("")) {
            return new Version(0, 0, 0, null);
        }
        String[] versionValues = myVersion.split(".");
        if (versionValues.length == 1) {
            return Version.unknownVersion();
        }
        Integer mainVersion = Integer.parseInt(versionValues[0]);
        Integer secondaryVersion = Integer.parseInt(versionValues[1]);
        Integer buildVersion = 0;
        String snapshotInfo = null;
        if (versionValues.length > 2) {
            if (!versionValues[2].contains("-")) {
                buildVersion = Integer.parseInt(versionValues[2]);
            } else {
                String[] additionalVersionInfo = versionValues[2].split("-");
                buildVersion = Integer.parseInt(additionalVersionInfo[0]);
                snapshotInfo = additionalVersionInfo[1];
            }
        }
        return new Version(mainVersion, secondaryVersion, buildVersion, snapshotInfo);
    }

    private final void registerDeserializers() {
        List<Class> classesToRegister = Lists.newArrayList(extensionPoints);
        for (Class c : classesToRegister) {
            addDeserializer(c);
        }
    }

    private void initializeClasses() {
        // Variation Points of the own Experiment descrition
        extensionPoints.add(Experiment.class);
        // Variation Points of Analysis
        extensionPoints.add(Hypothesis.class);
        extensionPoints.add(Assertion.class);
        // Variation Points of Design
        extensionPoints.add(Parameter.class);
        extensionPoints.add(Variable.class);
        extensionPoints.add(Domain.class);
        extensionPoints.add(Constraint.class);
        extensionPoints.add(Sizing.class);
        extensionPoints.add(ExperimentalDesign.class);
        extensionPoints.add(ExperimentalProtocolStep.class);
        // Variation Points of Configuration
        extensionPoints.add(ExperimentalTask.class);
        extensionPoints.add(ExperimentalEnvironment.class);
        extensionPoints.add(ExperimentalResult.class);
        // Variation Points of Execution

        // Variation Points of Analysis
        extensionPoints.add(AnalysisSpecification.class);
        extensionPoints.add(AnalysisResult.class);
        extensionPoints.add(Filter.class);
        extensionPoints.add(Projection.class);
        extensionPoints.add(StatisticalTestAssertion.class);
        // Statistical Analysis:
        extensionPoints.add(Statistic.class);

    }

    public void addDeserializer(Class<?> classToAdd) {
        ExtensionPointImplementationsRegistry ged = new ExtensionPointImplementationsRegistry(classToAdd);
        if (!ged.getSubClasses().isEmpty()) {
            extensionPointsRegistries.put(classToAdd, ged);
            for (Object c : ged.getSubClasses()) {
                //this.setMixInAnnotation((Class<?>)c, TypeInfoConfiguration.class);                
                this.getDynamicTypingClasses().add((Class<?>) c);
                addDeserializer((Class<?>) c);
            }
        }
        //this.registerSubtypes(ged.getSubClasses());
    }

    private void registerTypeInfoMixins() {
        /*for (Class c : extensionPoints) {
            this.setMixInAnnotation(c, TypeInfoConfiguration.class);
        }*/
    }

    public Set<Class> getDynamicTypingClasses() {
        return extensionPoints;
    }

    public void configure(ObjectMapper mapper) {
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        for (Class<?> c : extensionPoints) {
            mapper.getDeserializationConfig().addMixInAnnotations(c, TypeInfoConfiguration.class);
            mapper.getSerializationConfig().addMixInAnnotations(c, TypeInfoConfiguration.class);
            mapper.registerSubtypes(c);
        }
    }

    @JsonTypeInfo(
            include = JsonTypeInfo.As.PROPERTY,
            property = "@type",
            use = JsonTypeInfo.Id.NAME)
    private class TypeInfoConfiguration {
    }

}
