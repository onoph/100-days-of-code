package com.ebizcuit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ebizcuit.domain.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Long> {

	public Customer findById(Long id);
}
