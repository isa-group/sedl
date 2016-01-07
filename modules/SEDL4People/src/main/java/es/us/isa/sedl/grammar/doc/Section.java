package es.us.isa.sedl.grammar.doc;

import java.util.ArrayList;
import java.util.List;

import es.us.isa.sedl.sedl4people.grammar.test.CodeSample;

public class Section {

	private String id;
	private String name;
	private String description;
	private int level;
	private List<Section> subsections;
	private List<CodeSample> samples;
	
	public Section() {
		super();
		this.id = "id";
		this.name = "SectionName";
		this.description = "";
		this.level=0;
		this.subsections = new ArrayList<Section>();
		this.samples = new ArrayList<CodeSample>();
	}

	public Section(String id, String name, String description, int level) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.level=level;
		this.subsections = new ArrayList<Section>();
		this.samples = new ArrayList<CodeSample>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public List<Section> getSubsections() {
		return subsections;
	}

	public void setSubsections(List<Section> subsections) {
		this.subsections = subsections;
	}

	public List<CodeSample> getSamples() {
		return samples;
	}

	public void setSamples(List<CodeSample> samples) {
		this.samples = samples;
	}
	
	public void addSample(CodeSample sample){
		getSamples().add(sample);
	}

	public void addSubsection(Section subsection){
		getSubsections().add(subsection);
	}
}
