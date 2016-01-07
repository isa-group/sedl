package es.us.isa.sedl.grammar.doc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import es.us.isa.sedl.sedl4people.grammar.test.CodeSample;
import es.us.isa.sedl.sedl4people.grammar.test.ExperimentalDescriptionSectionTest;


public class Documentation{
	
    private static String descriptionCommentStart="/**";
    private static String descriptionCommentEnd="**/";
    private static String errorDescriptionCommentStart="///E:";
    private static String semanticsSpecificationCommentStart="///S:";
    private static String assertionCommentStart="///A:";
    public static final String DEFAULT_BASE_PATH="src/main/resources/es/us/isa/sedl/grammar/samples";    
	    
    public List<CodeSample> codeSamples = new ArrayList<CodeSample>();
    
    public DocumentationFile docFile = new DocumentationFile();

	public static List<CodeSample> initializeCodeSamples(File file,String rule) throws IOException
    {
    	List<CodeSample> codeSamples = new ArrayList<CodeSample>();
    	
        if(file.exists())
        {
            if(file.isDirectory())
            {
            	File[] sampleFiles=file.listFiles();
                CodeSample codeSample=null;
                for(File f:sampleFiles){
                	
                    if(f.isFile()){
                    	String name=f.getName();
                    	boolean notDes = !name.equals("sampleDescription.txt");
                    	if(notDes){
                    		codeSample=loadCodeSampleFromFile(f,rule);
                            codeSamples.add(codeSample);
                    	}
                    }else
                    		 codeSamples.addAll(initializeCodeSamples(f,f.getName()));
                    	
                       
                }
            }else
                throw new InvalidParameterException("The specified code samples path is not a directory!");
        }else
            throw new InvalidParameterException("The specified code samples path '"+file.getAbsolutePath()+"' generated from does not exist!");
		
        return codeSamples;
    }
    
    public boolean isCorrectCodeSampleFile(File f, String rule) throws IOException{
        boolean res = true;
    	String [] contents=loadStucturedContents(f);
    	
    	boolean withErrors =  (contents[2]==null || contents[2]=="");    	
    	
    	res = withErrors;
    	
    	return res;

    }
    
    public static CodeSample loadCodeSampleFromFile(File f,String rule) throws IOException
    {
        String identifier=extractIdentifier(f.getName());
        String specificRule=extractSpecificRule(f.getName());
        if(specificRule==null)
            specificRule=rule;
        String [] contents=loadStucturedContents(f);
        String description=contents[0];
        String code=contents[1];
        
        return new CodeSample(identifier, description, specificRule, code);
    }
    
    private static String extractIdentifier(String name) {
        
        String result=name;
        int index=name.lastIndexOf('.');        
        if(name.contains("-"))
            index=name.lastIndexOf("-");
        if(index!=-1)
            result=name.substring(0, index-1);
        return result;
    }

    private static String extractSpecificRule(String name) {
        String result=null;        
        if(name.contains("-")){
            int index=name.lastIndexOf("-");
            result=name.substring(index+1);
        }
        return result;
    }
    
    private static String[] loadStucturedContents(File f) throws IOException {
        @SuppressWarnings("resource")
		BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream(f)));
        StringBuilder descriptionBuilder=new StringBuilder();
        StringBuilder codeBuilder=new StringBuilder();
        StringBuilder errorsBuilder=new StringBuilder();
        StringBuilder semanticsBuilder=new StringBuilder();
        StringBuilder assertionsBuilder=new StringBuilder();
        // WE LOAD THE DESCRIPTION:
        String firstLine=reader.readLine();
        if(firstLine==null)
            throw new InvalidParameterException("The specified input file '"+f.getAbsolutePath()+"/' is empty");
        firstLine.trim();
        if(!firstLine.startsWith(descriptionCommentStart))
            throw new InvalidParameterException("The specified input file '"+f.getAbsolutePath()+"/' does not conform to the code samples format (It should start with a multiline comment '"+descriptionCommentStart+"' in the first line to provide a description)");
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

	public static void main(String[] args) throws IOException {
		
    	File file=new File(DEFAULT_BASE_PATH);
		@SuppressWarnings("unused")
		List<CodeSample> codes = new ArrayList<CodeSample>();
		
		codes = initializeCodeSamples(file,"TEST");
		
		DocumentationFile doc = generateDocumentationFile(file,"TEST",0);
		DocumentHTML5 html = generateDocumentHTML5(doc);
		genererateDocumentationFile(html);
		addSamplesDocumentation(html);
	}
    

    
    private static DocumentHTML5 generateDocumentHTML5(DocumentationFile doc ) {
		
    	List<Section> sections = doc.getSections();
    	List<ElementHTML5> elements = new ArrayList<>();
    	
    	for(Section s: sections){
    	  		
    		ElementHTML5 section = generateSectionHTML(s);
    		elements.add(section);
    		
    	}
    	
    	DocumentHTML5 document = new DocumentHTML5("", "", elements);
        	
		return document;
    	
    }
    
	private static ElementHTML5 generateSectionHTML(Section section) {

		List<ElementHTML5> subsectionsHTML = new ArrayList<ElementHTML5>();
		List<ElementHTML5> samplesHTML = new ArrayList<ElementHTML5>();

		if (section.getSubsections() != null && !section.getSubsections().isEmpty()) {

			List<Section> subsections = section.getSubsections();

			for (Section sub : subsections) {
				ElementHTML5 subHTML = generateSectionHTML(sub);
				subsectionsHTML.add(subHTML);
			}
		}

		if (section.getSamples() != null && !section.getSamples().isEmpty()) {

			List<CodeSample> samples = section.getSamples();

			
			
			for (CodeSample cs : samples) {

				
				
				ElementHTML5 collapseTrigger = new ElementHTML5("h5", generateSectionName(cs.getSpecificRule()));

				List<ElementHTML5> collapsibleContent = new ArrayList<ElementHTML5>();

				collapsibleContent.add(new ElementHTML5("p", cs.getDescription(), "", "description"));
				collapsibleContent.add(new ElementHTML5("pre", cs.getCode(), "editor", "code"));

				ElementHTML5 collapsePair = new ElementHTML5(collapseTrigger, collapsibleContent,
						generateId(section.getId()+cs.getSpecificRule().substring(0, 5) + cs.getIdentifier()));

				samplesHTML.add(collapsePair);
			}
		}

		if (!samplesHTML.isEmpty()) {
			ElementHTML5 button = new ElementHTML5("button", "Show samples");
			ElementHTML5 collapsePairForSamples = new ElementHTML5(button, samplesHTML,generateId("idSamp" + section.getName()));
			subsectionsHTML.add(collapsePairForSamples);
		}

		ElementHTML5 sectionCollapseTrigger = new ElementHTML5("h" + String.valueOf(section.getLevel()),
				section.getName());
		ElementHTML5 sectionDescriptionElement = new ElementHTML5("p", section.getDescription());
		subsectionsHTML.add(0, sectionDescriptionElement);
		ElementHTML5 collapsePairFinal = new ElementHTML5(sectionCollapseTrigger, subsectionsHTML,generateId(section.getName()));

		return collapsePairFinal;

	}
    	
    private static String getSectionDescription(File file) {
	
    	String content="";

		
			content = FileUtils.readFile(file.getAbsolutePath()+"/sampleDescription.txt", StandardCharsets.UTF_8);
		
    	ExperimentalDescriptionSectionTest test = null;
    	String res =content;
    	if (res==null || res.equals("")){
    		try {
    			
    			File f = new File("es.us.isa.sedl.sedl4people.grammar.test.sections."+file.getName().substring(0, 1).toUpperCase()+file.getName().substring(1)+"Test");
    			if(f.exists() && !f.isDirectory()) {  
    			
    			
                Class<?> classDefinition = Class.forName("es.us.isa.sedl.sedl4people.grammar.test.sections."+file.getName().substring(0, 1).toUpperCase()+file.getName().substring(1)+"Test");
                test = (ExperimentalDescriptionSectionTest) classDefinition.newInstance();
    			}
            } catch (InstantiationException e) {
                System.out.println(e);
            } catch (IllegalAccessException e) {
                System.out.println(e);
            } catch (ClassNotFoundException e) {
                System.out.println(e);
            }
            if (test!=null && test.getSectionDescription()!=null)
            	res=test.getSectionDescription();
    	}
        
        
        return res;
    	
	}
    
    static String generateSectionName(String name){
    	
    	int index=name.lastIndexOf('-');
    	if(index!=-1)
    		name=name.substring(index+1,name.length());
    	
    	 return name.replaceAll(
    		      String.format("%s|%s|%s",
    		         "(?<=[A-Z])(?=[A-Z][a-z])",
    		         "(?<=[^A-Z])(?=[A-Z])",
    		         "(?<=[A-Za-z])(?=[^A-Za-z])"
    		      ),
    		      " "
    		   );
    }
    
    public static void genererateDocumentationFile(DocumentHTML5 document){	
    	String content = document.toHTML();
    	FileUtils.writeFile("src/main/resources/samples.html", content);
    }
    
    

    
    
    static String generateACEEditorsScript(){
    	StringBuilder script= new StringBuilder();
    	
    	script.append("<link rel=\"stylesheet\" href=\"https://exemplar.us.es/css/bootstrap.css\">"+
    	        "<script type=\"text/javascript\" src=\"https://exemplar.us.es/js/vendor/jquery.js\"></script>"+
    			"<script type=\"text/javascript\" src=\"https://exemplar.us.es/js/vendor/bootstrap.js\"></script>"+
    			"<script src=\"https://exemplar.us.es/js/ace/ace.js\" type=\"text/javascript\" charset=\"utf-8\"></script>"+
    			"<script>");
    	
    	
    		script.append(FileUtils.readFile("src/main/resources/editors.js", Charset.defaultCharset()));
		
    	
    	script.append("</script>");
    	
    	return script.toString();
    }
    
     
    
    public static DocumentationFile generateDocumentationFile(File file,String rule, int level)
    {
    	
    	DocumentationFile doc = new DocumentationFile();
    	
    	String title = "SEDL";
    	   
    
    	doc.setTitle(title);
    
        if(file.exists())
        {
            if(file.isDirectory())
            {
            	if(level==0){
            		title=file.getName().toUpperCase();
            		doc.setTitle(title);
            		level++;
            		
            		File[] sections=file.listFiles();

	                for(File f:sections){
	                	
						doc.addSection(generateSubsection(f, level));
                    }
                }
            }else
                throw new InvalidParameterException("The specified code samples path is not a directory!");
        }else
            throw new InvalidParameterException("The specified code samples path '"+file.getAbsolutePath()+"' generated from does not exist!");
		
        return doc;
    }

	public static Section generateSubsection(File file, int level) {

		Section subsection = new Section();
		@SuppressWarnings("unused")
		String sectionDescription = "";

		if (file.exists()) {
			if (file.isDirectory()) {
				subsection.setName(generateSectionName(file.getName()));
				subsection.setLevel(level);
				subsection.setDescription(getSectionDescription(file));
				level++;

				File[] sampleFiles = file.listFiles();
				CodeSample codeSample = null;

				for (File f : sampleFiles) {

					if (f.isFile()) {

						String name = f.getName();
						boolean notDes = !name.equals("sampleDescription.txt");
						if (notDes) {

							try {
								codeSample = loadCodeSampleFromFile(f, f.getName());
							} catch (IOException e) {
								e.printStackTrace();
							}
							subsection.addSample(codeSample);

						} else {
							sectionDescription = FileUtils.readFile(f.getAbsolutePath(), Charset.defaultCharset());
							
						}

					} else {
						level++;
						Section subsectionAux = generateSubsection(f, level);
						if (subsectionAux != null)
							subsection.addSubsection(subsectionAux);
						level--;
					}
				}
			} else
				throw new InvalidParameterException("The specified code samples path is not a directory!");
		} else
			throw new InvalidParameterException(
					"The specified code samples path '" + file.getAbsolutePath() + "' generated from does not exist!");

		return subsection;
	}

	private static String generateId(String data){
    	String id = data.replaceAll("\\s+", "");
    	Random r = new Random();
    	id+=String.valueOf(r.nextInt());
    	return id;
    }
    
    static void addSamplesDocumentation(DocumentHTML5 doc){
    	
    	String langElements = "//////LANGELEMENTS//////";
    	
    	StringBuilder html= new StringBuilder();
    	StringBuilder script = new StringBuilder();
    	
    	html.append(FileUtils.readFile("src/main/resources/SEDLTemplate.html", Charset.defaultCharset()));
			int startIndex = html.indexOf(langElements);
	        int lastIndex = startIndex + langElements.length();  
	        html.replace(startIndex, lastIndex, FileUtils.readFile("src/main/resources/samples.html", Charset.defaultCharset()));
	        
	        FileUtils.writeFile("src/main/resources/SEDL.html", html.toString());
	        
    }
    
    
}
