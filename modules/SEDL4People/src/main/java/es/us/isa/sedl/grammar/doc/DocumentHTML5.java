package es.us.isa.sedl.grammar.doc;

import java.util.ArrayList;
import java.util.List;

public class DocumentHTML5 {

	final String DOCTYPE = "<!DOCTYPE html>\n";
	
	private String css;
	private String title;
	private String body;
	private List<ElementHTML5> elements = new ArrayList<ElementHTML5>(); 
	
	public DocumentHTML5() {
		super();
	}
	
	public DocumentHTML5(String css, String title, String body) {
		super();
		this.css = css;
		this.title = title;
		this.body = body;
	}

	public DocumentHTML5(String css, String title, List<ElementHTML5> elements) {
		super();
		this.css = css;
		this.title = title;
		this.elements = elements;
	}

	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public List<ElementHTML5> getElements() {
		return elements;
	}

	public void setElements(List<ElementHTML5> elements) {
		this.elements = elements;
	}
	
	public List<ElementHTML5> addElement(ElementHTML5 newElement) {
		elements.add(newElement);
		return elements;
	}
	
	public List<ElementHTML5> addElements(List<ElementHTML5> newElements) {
		elements.addAll(newElements);
		return elements;
	}

	public String toHTML()
    {
			
		StringBuilder html= new StringBuilder();
				
		int num_editors = 0;
    	
    	
    	StringBuilder htmlBody= new StringBuilder();
    	
    	for(ElementHTML5 e:elements){
    		
    		if(e.id!=null && e.id.equals("editor")){
    			num_editors++;
    			e.setId("editor"+num_editors);
    			e.setCssClass("editor");
    		}
    			
    		htmlBody.append(e.toString());
    			
    	}
    	
    	String css = getCss();
    	String title = (new ElementHTML5("title", getTitle())).toString();
    	
    	
		html.append(new ElementHTML5("head",title +Documentation.generateACEEditorsScript()));

    	if(css!=null && css!="")
    		html.append(new ElementHTML5("head", "<link rel=\"stylesheet\" href="+css+">"));
    	
    	
    	
    	String body = (new ElementHTML5("body", htmlBody.toString(), "", "")).toString();

    	html.append(body);
    	
    	//return DOCTYPE + new ElementHTML5("html", html.toString()).toString();
    	return htmlBody.toString();
    	
    }
}
