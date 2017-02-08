package com.ebizcuit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebizcuit.domain.User;
import com.ebizcuit.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public UserService()
	{}
	
	public User getByUsername(String username)
	{
		return userRepository.findByUsername(username);
	}
}
