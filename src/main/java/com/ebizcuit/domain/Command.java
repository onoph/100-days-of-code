package com.ebizcuit.domain;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ebizcuit.domain.article.AbstractArticle;

@Document(collection="sequence")
public class Command {
	
	@Id
	private Long id;

	private Map<AbstractArticle, Integer> order;
	private Double totalPrice;
	private String commanditaire;
	private String address;
	
	private Command()
	{ }
	
	public Map<AbstractArticle, Integer> getOrder() {
		return order;
	}
	public void setOrder(Map<AbstractArticle, Integer> order) {
		this.order = order;
	}
	public String getCommanditaire() {
		return commanditaire;
	}
	public void setCommanditaire(String commanditaire) {
		this.commanditaire = commanditaire;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	
	
}
