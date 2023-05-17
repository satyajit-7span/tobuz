package com.tobuz.object;

import java.io.Serializable;

public class CategoryDTO implements Serializable{

	private long id ;
	
	private String name ;
	
	String sequence;
	
	String featuredCategory;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getFeaturedCategory() {
		return featuredCategory;
	}

	public void setFeaturedCategory(String featuredCategory) {
		this.featuredCategory = featuredCategory;
	}
	
	
}
