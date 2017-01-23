package com.ebizcuit.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ebizcuit.domain.Customer;
import com.ebizcuit.domain.Panier;

public interface PanierRepository extends CrudRepository<Panier, Long> {

	public List<Panier> findByCustomer(Customer customer); 
	
}
