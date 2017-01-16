package com.ebizcuit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebizcuit.domain.Command;
import com.ebizcuit.repository.CommandRepository;

@RestController
@RequestMapping("/command")
public class CommandController {

	@Autowired
	private CommandRepository repository;
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Command> getAllCommands(){
		return repository.findAll();
	}
	
}
