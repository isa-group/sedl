package es.us.isa.sedl.grammar.doc;

import java.util.List;

public class ElementHTML5 {

	String tag;
	String content;
	String id;
	String cssClass;	
	
    public ElementHTML5() {
		super();
	}
    public ElementHTML5(String tag, String content) {
		super();
		this.tag = tag;
		this.content = content;
	}
    
    public ElementHTML5(String tag, String content, String id, String cssClass) {
		super();
		this.tag = tag;
		this.content = content;
		this.id = id;
		this.cssClass = cssClass;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCssClass() {
		return cssClass;
	}

	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	}

	public String toString(){
		
		StringBuilder elementHTML5= new StringBuilder();
		
		elementHTML5.append("<"+tag+"");
    	
    	if(id!=null && id!="")
    		elementHTML5.append(" id='"+id+"'");
    	
    	if(cssClass!=null && cssClass!="")
    		elementHTML5.append(" class='"+cssClass+"'");
    	
    	elementHTML5.append(">");
    	
    	if(content!=null)
    		elementHTML5.append(content.trim());
    	
    	elementHTML5.append("</"+tag+">\n");
    	    	
    	return elementHTML5.toString();
	}
	
	
	public  ElementHTML5(ElementHTML5 collapseTrigger, List<ElementHTML5> collapsibleContent, String id){
		
		String collapseLinkContent = "<a role=\"button\" data-toggle=\"collapse\" href=\"#"+id+"\" aria-expanded=\"false\" aria-controls=\""+id+"\">"+collapseTrigger.content+"</a>";
		
		String collapsibleDivContent = "";
		
		
	
		
		ElementHTML5 newH = new ElementHTML5(collapseTrigger.getTag(), collapseLinkContent, "", "");
		
		for(ElementHTML5 e:collapsibleContent){
			collapsibleDivContent+=e.toString();
		}
		collapsibleDivContent += "<br>";
		
		ElementHTML5 div = new ElementHTML5("div", collapsibleDivContent, id, "collapse");
		
		this.tag="div";
		this.content=newH.toString()+div.toString();
	}
	
}
