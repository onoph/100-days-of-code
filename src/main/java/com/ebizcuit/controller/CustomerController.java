package com.ebizcuit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebizcuit.domain.Customer;
import com.ebizcuit.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerRepository repository;
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody List<Customer> getCustomers(){
		return repository.findAll();
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public @ResponseBody Customer addCustomer(@RequestBody Customer customer){
		return repository.save(customer);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public @ResponseBody Customer updateCustomer(@RequestBody Customer customer){
		if(customer.getId() != null)
			return repository.save(customer);
		else
			return null;
	}
	
	@RequestMapping(value="/{id}",  method=RequestMethod.GET)
	public @ResponseBody Customer getCustomer(@PathVariable Long id){
		return repository.findById(id);
	}
	
	
	
}
