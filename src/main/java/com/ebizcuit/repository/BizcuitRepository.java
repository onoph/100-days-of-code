package com.ebizcuit.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ebizcuit.domain.article.Bizcuit;

public interface BizcuitRepository extends CrudRepository<Bizcuit, String>{

	public Bizcuit findByReference(String reference);
	public List<Bizcuit> findByName(String name);
	
}
