package com.ebizcuit.service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.security.auth.login.AccountException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

import com.ebizcuit.domain.Account;
import com.ebizcuit.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository repo;
	
	public Account addAccount(Account account) throws AccountException
	{
		validateAccount(account);
		return repo.save(account);
	}
	
	public void validateAccount(Account account) throws AccountException
	{
		if(account.getUsername() == null)
			throw new AccountException("No username supplied");
		if(account.getPassword() == null)
			throw new AccountException("No password supplied");
		List<Account> all = repo.findAll();
		List<Account> sameUser = all.stream()
			.filter(findAccountWithUsername(account.getUsername()))
			.collect(Collectors.toList());
		if(sameUser.size() > 0)
			throw new AccountException("Account with existing user already exists");;
	}
	
	public Predicate<Account> findAccountWithUsername(String username){
		String lowerUser = username.toLowerCase();
		return a -> a.getUsername().toLowerCase().equals(lowerUser);
	}
	
}
