package com.ebizcuit.repository;


import org.springframework.data.repository.CrudRepository;

import com.ebizcuit.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	public Customer findById(Long id);
	public Customer findByUsername(String username);
}
