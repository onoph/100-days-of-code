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
	private Customer customer;
	
	private Command()
	{ }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Map<AbstractArticle, Integer> getOrder() {
		return order;
	}

	public void setOrder(Map<AbstractArticle, Integer> order) {
		this.order = order;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	
	
}
