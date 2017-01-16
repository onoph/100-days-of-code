package com.ebizcuit.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ebizcuit.domain.article.Bizcuit;

public interface BizcuitRepository extends MongoRepository<Bizcuit, String>{

	public Bizcuit findByReference(String reference);
	public List<Bizcuit> findByName(String name);
	
}
