package com.ebizcuit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ebizcuit.domain.Account;

public interface AccountRepository extends MongoRepository<Account, Long> {

	public Account findByUsername(String username);
	
}
