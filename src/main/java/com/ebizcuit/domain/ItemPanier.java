package com.ebizcuit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.ebizcuit.domain.article.AbstractArticle;

@Entity
public class ItemPanier {

	@Id @GeneratedValue
	private Long id;
	@ManyToOne
	private AbstractArticle article;
	private int quantity;
	
	public ItemPanier()
	{ }
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public AbstractArticle getArticle() {
		return article;
	}
	public void setArticle(AbstractArticle article) {
		this.article = article;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
