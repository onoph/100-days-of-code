package com.ebizcuit.domain;

import com.ebizcuit.domain.article.AbstractArticle;

public class ItemPanier {

	
	private Long id;
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
