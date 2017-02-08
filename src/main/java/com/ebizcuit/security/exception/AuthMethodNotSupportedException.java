package com.ebizcuit.security.exception;

import org.springframework.security.authentication.AuthenticationServiceException;

public class AuthMethodNotSupportedException extends AuthenticationServiceException {

	public AuthMethodNotSupportedException(String msg)
	{
		super(msg);
	}
	
}
