package com.ebizcuit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebizcuit.domain.article.Bizcuit;
import com.ebizcuit.repository.BizcuitRepository;

@RestController
@RequestMapping("/bizcuit")
public class BizcuitController {

	@Autowired
	private BizcuitRepository repository;
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody List<Bizcuit> getAllBizcuits()
	{
		return repository.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public @ResponseBody Bizcuit insertBizcuit(@RequestBody Bizcuit bizcuit)
	{
		return repository.save(bizcuit);
	}
	
	
	
	/*
	@RequestMapping(value = "/bizcuit", method=RequestMethod.GET)
	public @ResponseBody Bizcuit getBizcuitByReference(@RequestParam("reference") String ref)
	{
		return repository.findByReference(ref);
	}
	
	@RequestMapping(value = "/bizcuit", method = RequestMethod.GET)
	public @ResponseBody List<Bizcuit> getBizcuitByName(@RequestParam("name") String name)
	{
		return repository.findByName(name);
	}
	*/
}
