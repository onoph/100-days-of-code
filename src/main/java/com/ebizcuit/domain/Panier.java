package com.ebizcuit.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;


@Entity
public class Panier {
	
	@Id
	@GeneratedValue
	private Long id;

	private List<ItemPanier> items;
	private Double totalPrice;
	
	private Customer customer;
	
	private Panier()
	{ }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<ItemPanier> getItems() {
		return items;
	}

	public void setItems(List<ItemPanier> items) {
		this.items = items;
	}
	
	
	
}
