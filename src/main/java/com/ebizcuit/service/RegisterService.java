package com.ebizcuit.service;

import javax.security.auth.login.AccountException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebizcuit.domain.Account;
import com.ebizcuit.domain.Customer;
import com.ebizcuit.repository.AccountRepository;
import com.ebizcuit.repository.CustomerRepository;

@Service
public class RegisterService {

	@Autowired
	private CustomerRepository customerRepo;
	@Autowired
	private AccountRepository accountRepo;
	
	@Transactional
	public Customer registerNewCustomer(Customer c, String password) throws AccountException
	{
		Account aDB = accountRepo.findByUsername(c.getUsername());
		if(aDB != null){
			throw new AccountException("Account with same username already exists");
		}
		Account a = new Account(c.getUsername(), password);
		customerRepo.save(c);
		accountRepo.save(a);
		return c;
	}
	
	
}
