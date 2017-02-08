package com.ebizcuit.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public @ResponseBody String handleException(Exception e)
	{
		return e.getMessage();
	}
}
