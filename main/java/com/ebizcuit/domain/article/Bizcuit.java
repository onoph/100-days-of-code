package com.ebizcuit.domain.article;

import com.ebizcuit.domain.enums.TypeBizcuit;

public class Bizcuit extends AbstractArticle{

	public Bizcuit(){
		super();
	}
	
	private TypeBizcuit type;

	public TypeBizcuit getType() {
		return type;
	}

	public void setType(TypeBizcuit type) {
		this.type = type;
	}
	
	
	
	
}
