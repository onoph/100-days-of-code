package com.ebizcuit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebizcuit.domain.Account;
import com.ebizcuit.repository.AccountRepository;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private AccountRepository repo;
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody Account login(@RequestBody Account account)
	{
		Account accountDB = repo.findByUsername(account.getUsername());
		if(accountDB != null 
			&& accountDB.getPassword().equals(account.getPassword()))
			return accountDB;
		return null;
	}
	
}
