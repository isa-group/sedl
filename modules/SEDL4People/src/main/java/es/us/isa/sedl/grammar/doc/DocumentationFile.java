package es.us.isa.sedl.grammar.doc;

import java.util.ArrayList;
import java.util.List;

public class DocumentationFile {
	
	private String title;
	private List<Section> sections;
	private int levels;
	private int numEditors;
	
	public DocumentationFile() {
		this.title="EXEMPLAR";
		this.sections = new ArrayList<Section>();
		this.levels=0;
		this.numEditors=0;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	public int getLevels() {
		return levels;
	}

	public void setLevels(int levels) {
		this.levels = levels;
	}

	public int getNumEditors() {
		return numEditors;
	}

	public void setNumEditors(int numEditors) {
		this.numEditors = numEditors;
	}
	
	public void addSection(Section section){
		getSections().add(section);
	}
	
	public void addAllSections(List<Section> sections){
		getSections().addAll(sections);
	}
	
}
