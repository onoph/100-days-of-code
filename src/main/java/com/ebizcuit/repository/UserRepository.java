package com.ebizcuit.repository;

import org.springframework.data.repository.CrudRepository;

import com.ebizcuit.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

	public User findByUsername(String username);
	
}
