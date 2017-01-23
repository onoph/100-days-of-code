package com.ebizcuit.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebizcuit.domain.Customer;
import com.ebizcuit.domain.Panier;
import com.ebizcuit.repository.CustomerRepository;
import com.ebizcuit.repository.PanierRepository;

@RestController
@RequestMapping("/panier")
public class PanierController {

	@Autowired
	private PanierRepository repository;
	@Autowired
	private CustomerRepository customerRepo;
	
	@RequestMapping(value="/listAll", method = RequestMethod.GET)
	public @ResponseBody List<Panier> getAllCommands(@AuthenticationPrincipal
			final UserDetails userDetails){
		Customer c = customerRepo.findByUsername(userDetails.getUsername());
		if(c != null)
			return repository.findByCustomer(c);
		else
			return null;
	}
	
	
}
