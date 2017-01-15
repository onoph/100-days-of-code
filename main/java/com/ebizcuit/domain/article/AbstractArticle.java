package com.ebizcuit.domain.article;

import org.springframework.data.annotation.Id;

public class AbstractArticle {

	@Id
	protected String reference;
	protected String name;
	protected Double price;
	
	protected AbstractArticle()
	{}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
		
	
}
