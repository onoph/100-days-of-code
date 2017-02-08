package com.ebizcuit.controller.api.publics;

import javax.security.auth.login.AccountException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebizcuit.domain.Customer;
import com.ebizcuit.service.RegisterService;

@RestController
@RequestMapping("/api/public/register")
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(method=RequestMethod.POST)
	public @ResponseBody Customer register(@RequestBody Customer customer, String password) throws AccountException{
		return registerService.registerNewCustomer(customer, password);
	}
	
}
