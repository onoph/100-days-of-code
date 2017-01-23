package com.ebizcuit.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
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
		return (List<Customer>) repository.findAll();
	}
	
	/*
	@RequestMapping(method=RequestMethod.POST)
	public @ResponseBody Customer addCustomer(@RequestBody Customer customer){
		return repository.save(customer);
	}
	*/
	
	
	@RequestMapping(method=RequestMethod.PUT)
	public @ResponseBody Customer updateCustomer(@RequestBody Customer customer,
			@AuthenticationPrincipal UserDetails userDetails)
	{
		if(customer.getId() != null)
		{
			Customer customerDB = repository.findByUsername(customer.getUsername());
			if(customerDB != null && customerDB.getId().equals(customer.getId()))
				return repository.save(customer);
			return null;
		}else
			return null;
	}
	
	/*
	@RequestMapping(value="/{id}",  method=RequestMethod.GET)
	public @ResponseBody Customer getCustomer(@PathVariable Long id){
		return repository.findById(id);
	}
	*/
	
	
}
