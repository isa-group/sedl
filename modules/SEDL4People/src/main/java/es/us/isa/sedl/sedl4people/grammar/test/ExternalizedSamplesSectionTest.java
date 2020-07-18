/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.sedl4people.grammar.test;

import es.us.isa.sedl.grammar.SEDL4PeopleParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.antlr.v4.runtime.Token;
import org.junit.Test;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/**
 * This class creates a set of tests
 * 
 * 
 * @author japarejo
 */
public abstract class ExternalizedSamplesSectionTest extends ExperimentalDescriptionSectionTest{

    private String path;
    private String descriptionCommentStart="/**";
    private String descriptionCommentEnd="**/";
    private String errorDescriptionCommentStart="///E:";
    private String semanticsSpecificationCommentStart="///S:";
    private String semanticSpecsBeanFileSeparator="<";    
    private String assertionCommentStart="///A:";
    public static final String DEFAULT_BASE_PATH="src/main/resources/es/us/isa/sedl/grammar/samples";    
    
    public ExternalizedSamplesSectionTest(String description) throws IOException
    {
        this("",description);
        String className=this.getClass().getSimpleName();
        className=className.replaceAll("Test", "");
        className=className.replaceAll("test", "");
        String firstChar=className.substring(0,1);
        className=className.replaceFirst(firstChar, firstChar.toLowerCase());
        this.ruleName=className;
        this.path=DEFAULT_BASE_PATH+"/"+className;
        initializeCodeSamples();
        
    }
    
    public ExternalizedSamplesSectionTest(String rule,String description) throws IOException
    {
        this(rule,description,DEFAULT_BASE_PATH+"/"+rule);
    }
    
    public ExternalizedSamplesSectionTest(String rule,String description,String path) throws IOException
    {
        super(rule,description);        
        if(rule!=""){
            this.path=path;
            initializeCodeSamples();
        }
        
    }
    
    public void initializeCodeSamples() throws IOException
    {
        File samplesPath=new File(path);
        if(samplesPath.exists())
        {
            if(samplesPath.isDirectory())
            {
                initializeCodeSamples(samplesPath,this.getRuleName());
            }else
                throw new InvalidParameterException("The specified code samples path '"+path+"' is not a directory!");
        }else
            throw new InvalidParameterException("The specified code samples path '"+samplesPath.getAbsolutePath()+"' generated from '"+path+"' does not exist!");
    }
                    
    public CodeSample loadCodeSampleFromFile(File f,String rule) throws IOException
    {
        String identifier=extractIdentifier(f.getName());
        String specificRule=extractSpecificRule(f.getName());
        String path=f.getParent();
        if(specificRule==null)
            specificRule=rule;
        String [] contents=loadStucturedContents(f);
        String description=contents[0];
        String code=contents[1];
        List<ParsingError> errors=generateParsingErrors(contents[2]);
        List<SemanticsSpec> semantics=generateSemanticSpecs(path,contents[3]);
        List<String> assertions=generateSematicAssertions(contents[4]);
        return new CodeSample(identifier, description, specificRule, code, errors,semantics,assertions);
    }            

    private String extractIdentifier(String name) {
        
        String result=name;
        /*int index=name.lastIndexOf('.');        
        if(name.contains("-"))
            index=name.lastIndexOf("-");
        if(index!=-1)
            result=name.substring(0, index-1);*/
        return result;
    }

    private String extractSpecificRule(String name) {
        String result=null;        
        if(name.contains("-")){
            int index=name.lastIndexOf("-");
            result=name.substring(index+1);        
            if(Character.isUpperCase(result.charAt(0)))
                result=Character.toLowerCase(result.charAt(0))+result.substring(1);
        }
        if(!Arrays.asList(SEDL4PeopleParser.ruleNames).contains(result))
            result=null;
        return result;
    }
    
    /**
    *
    */
    private String[] loadStucturedContents(File f) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream(f)));
        StringBuilder descriptionBuilder=new StringBuilder();
        StringBuilder codeBuilder=new StringBuilder();
        StringBuilder errorsBuilder=new StringBuilder();
        StringBuilder semanticsBuilder=new StringBuilder();
        StringBuilder assertionsBuilder=new StringBuilder();
        // WE LOAD THE DESCRIPTION:
        String firstLine=reader.readLine();
        if(firstLine==null)
            throw new InvalidParameterException("The specified input file '"+f.getAbsolutePath()+"/"+f.getName()+"' is empty");
        firstLine.trim();
        if(!firstLine.startsWith(descriptionCommentStart))
            throw new InvalidParameterException("The specified input file '"+f.getAbsolutePath()+"/"+f.getName()+"' does not conform to the code samples format (It should start with a multiline comment '"+descriptionCommentStart+"' in the first line to provide a description)");
        else if(!firstLine.contains(descriptionCommentEnd))
            codeBuilder.append("\n");
        String line=firstLine.replace(descriptionCommentStart, "");        
        while(line!=null && !line.contains(descriptionCommentEnd))
        {
            line=line.trim();
            descriptionBuilder.append(line).append("\n");
            codeBuilder.append("\n");
            line=reader.readLine();
        }
        codeBuilder.append("\n");
        line=line.replace(descriptionCommentEnd, "");
        descriptionBuilder.append(line);
        
        // WE LOAD THE CODE AND ERRORS:
        line=reader.readLine();
        while(line!=null)
        {
            line=line.trim();
            if(line.startsWith(errorDescriptionCommentStart))               // IT IS AN ERROR SPECIFICATION:
                errorsBuilder.append(line.replace(errorDescriptionCommentStart, "")).append("\n");
            else if(line.startsWith(semanticsSpecificationCommentStart))    // IT IS A SEMANTICS SPECIFICATION:  
                semanticsBuilder.append(line.replace(semanticsSpecificationCommentStart, "")).append("\n");
            else if(line.startsWith(assertionCommentStart))    // IT IS AN ASSERTION SPECIFICATION:  
                assertionsBuilder.append(line.replace(assertionCommentStart, "")).append("\n");
            else                        // IT IS ACTUAL CODE:
                codeBuilder.append(line).append("\n");
            line=reader.readLine();
        }
        String [] result={descriptionBuilder.toString(),
                          codeBuilder.toString(),
                          errorsBuilder.toString(),
                          semanticsBuilder.toString(),
                          assertionsBuilder.toString()};
        return result;                
    }

    private List<ParsingError> generateParsingErrors(String errorsDescription) {
        String[] errorsDescriptions=errorsDescription.split("\n");
        List<ParsingError> errors=new ArrayList<ParsingError>(errorsDescriptions.length);
        for(String errDesc:errorsDescriptions)
            if(!errDesc.trim().isEmpty())
                errors.add(generateParsinError(errDesc));
        return errors;
    }

    private void initializeCodeSamples(File samplesPath,String rule) throws IOException {
        File[] sampleFiles=samplesPath.listFiles();
                CodeSample codeSample=null;
                for(File file:sampleFiles){
                    if(file.isFile()){
                    	String name=file.getName();
                    	boolean notDes = !name.equals("sampleDescription.txt");
                    	if(notDes){
                    		codeSample=loadCodeSampleFromFile(file,rule);
                            codeSamples.add(codeSample);
                    	}
                       
                    }else
                        initializeCodeSamples(file,extractSpecificRule(file.getName())!=null?extractSpecificRule(file.getName()):rule);
                }
    }

    private ParsingError generateParsinError(String errDesc) {       
        String locationSpec=extractLocationSpec(errDesc);
        //String tokenNameSpec=extractTokenNameSpec(errDesc);
        String errorDescription=extractErrorDescription(errDesc);
        Integer line=null;
        Integer column=null;
        Token token=null;
        if(locationSpec!=null){
            String lineSpec=locationSpec;
            String columnSpec=null;
            if(locationSpec.contains(",")){
                lineSpec=locationSpec.substring(0,locationSpec.indexOf(","));
                columnSpec=locationSpec.substring(locationSpec.indexOf(",")+1);
            }            
            line=Integer.decode(lineSpec);            
            if(columnSpec!=null)
                column=Integer.decode(columnSpec);
        }
        //if(tokenNameSpec!=null)
            
        ParsingError result=new ParsingError(line,column, token, null, errorDescription);
        return result;
    }

    private String extractLocationSpec(String errDesc) {
        String result=null;
        if(errDesc.contains("[") && errDesc.contains("]"))
        {
            result=errDesc.substring(errDesc.indexOf("[")+1,errDesc.lastIndexOf("]"));
        }
        return result;    
    }

    private String extractErrorDescription(String errDesc) {
        String result=null;
        /*if(errDesc.contains("}"))
            result=errDesc.substring(errDesc.lastIndexOf("}")+1);
        else*/ if(errDesc.contains("]"))
            result=errDesc.substring(errDesc.lastIndexOf("]")+1);
        else
           result=errDesc; 
        return result;
    }

    /*private String extractTokenNameSpec(String errDesc) {
        String result=null;
        if(errDesc.contains("{") && errDesc.contains("}"))
        {
            result=errDesc.substring(errDesc.indexOf("{")+1,errDesc.lastIndexOf("}"));
        }
        return result;    
    }*/
    
    @Test
    public void testCorrectCodeSamples()
    {
        String rule=null;
        boolean generatesNoErrors;
        String message=null;
        for(CodeSample sample:getCorrectCodeSamples()){
            System.out.println("Testing that code sample '"+sample.getIdentifier()
                    +"' is syntactically correct!");
            System.out.println("====== CONTENT ======");
            System.out.println(sample.getCode());
            System.out.println("====== END CONTENT ======");
            if(sample.getSpecificRule()==null)
                rule=this.getRuleName();
            else
                rule=sample.getSpecificRule();
            System.out.println("Using rule "+rule+" for parsing...");
            generatesNoErrors=generatesNoErrors(rule,sample.getCode().trim());
            message="The code sample '"+sample.getIdentifier()+"' at '"+
                      path+"' should not generate errors, but "+errors.size()+" errors "+
                      "were found: \n";
            for(ParsingError error:errors){
                if(error.getLine()!=null)
                    message+="Line "+error.getLine()+": ";
                message+=error.getMessage()+"\n";
            }                    
            assertTrue(message,generatesNoErrors);
        }
    }
    
    @Test
    public void testFailingCodeSamples()
    {
        String rule=null;
        boolean generatesCorrectNumberOfErrors=false;
        String message=null;
        for(CodeSample sample:getFailingCodeSamples()){
            System.out.println("Testing that code sample '"+sample.getIdentifier()
                    +"' is not syntactically correct and contains exactly "+sample.getExpectedErrors().size()+" errors!");
            if(sample.getSpecificRule()==null)
                rule=this.getRuleName();
            else
                rule=sample.getSpecificRule();
            generatesCorrectNumberOfErrors=generatesNErrors(sample.getExpectedErrors().size(), rule, sample.getCode());
            message="The code sample '"+sample.getIdentifier()+"' at '"+path+
                      "' should generate"+sample.getExpectedErrors().size()+
                      " errors, but "+errors.size()+" were found: \n";
            for(ParsingError error:errors){
                if(error.getLine()!=null)
                    message+="Line "+error.getLine()+": ";
                message+=error.getMessage()+"\n";
            }
            // Additionally we test that check
            boolean existsMatchingError=false;
            for(ParsingError expectedError:sample.getExpectedErrors())
            {
                existsMatchingError=existMatchingError(expectedError);
                if(!existsMatchingError){
                    message=" There is not an actual error on line "+expectedError.getLine();
                    if(expectedError.getCharPositionInLine()!=null)
                        message+=" and column "+expectedError.getCharPositionInLine();
                    message+=" when it was expected ('"+expectedError.getMessage()+"')";
                    assertTrue(message,existsMatchingError);
                }
            }
        }
    }

    public Collection<CodeSample> getCorrectCodeSamples() {
        List<CodeSample> result=new ArrayList<CodeSample>();
        for(CodeSample codeSample:codeSamples)
            if(codeSample.getExpectedErrors().isEmpty())
                result.add(codeSample);
        return result;
        
    }

    private Collection<CodeSample> getFailingCodeSamples() {
        List<CodeSample> result=new ArrayList<CodeSample>();
        for(CodeSample codeSample:codeSamples)
            if(!codeSample.getExpectedErrors().isEmpty())
                result.add(codeSample);
        return result;
    }

    private boolean existMatchingError(ParsingError expectedError) {
        boolean result=false;
        if(expectedError.getLine()!=null)
        {
            for(ParsingError actuallyFoundError:errors)
            {
                if(expectedError.getLine().equals(actuallyFoundError.getLine()))
                {
                    if(expectedError.getCharPositionInLine()!=null){
                        if(expectedError.getCharPositionInLine().equals(actuallyFoundError.getCharPositionInLine()))
                            result=true;
                    }else
                        result=true;
                }
            }
        }else
            result=true;
        return result;
    }

    private List<SemanticsSpec> generateSemanticSpecs(String path, String string) {
        
        List<SemanticsSpec> result=new ArrayList<SemanticsSpec>();
        if(!"".equals(string)){
            String []specs=string.split("\n");
            String []parts;
            String beanFile;
            String accesorExpression;
            for(String spec:specs)
            {
                if(spec.contains(semanticSpecsBeanFileSeparator))
                {
                    parts=spec.split(semanticSpecsBeanFileSeparator);
                    accesorExpression=parts[0];
                    beanFile=parts[1];
                    Object bean=loadBean(path,beanFile);
                    result.add(new SemanticsSpec(accesorExpression, bean));
                }else{
                   throw new InvalidParameterException("The semantic spec. '"+spec+"'  does not provide a bean file.");
                }
            }
        }
        return result;
    }
    
    private Object loadBean(String path, String beanFile)
    {
        String fullPathToFile=path+beanFile;
        FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext(fullPathToFile);
        Object result=null;
        for(String beanName:ctx.getBeanDefinitionNames())
            result=ctx.getBean(beanName);
        return result;
        
    }

    private List<String> generateSematicAssertions(String assertionsCode) {
        List<String> result=new ArrayList<String>();
        if(!"".equals(assertionsCode)){
            String []assertions=assertionsCode.split("\n");
            for(String assertion:assertions)
                result.add(assertion);
        }
        return result;
    }
}
