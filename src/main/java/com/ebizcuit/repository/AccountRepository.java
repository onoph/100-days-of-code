package com.ebizcuit.repository;

import org.springframework.data.repository.CrudRepository;

import com.ebizcuit.domain.Account;

public interface AccountRepository extends CrudRepository<Account, Long> {

	public Account findByUsername(String username);
	
}
