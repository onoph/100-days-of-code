package com.ebizcuit.domain.article;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.ebizcuit.domain.enums.TypeBizcuit;

@Entity
@DiscriminatorValue("BIZCUIT")
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
