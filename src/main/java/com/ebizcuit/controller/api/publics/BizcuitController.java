package com.ebizcuit.controller.api.publics;

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
@RequestMapping("/api/public/bizcuit")
public class BizcuitController {

	@Autowired
	private BizcuitRepository repository;
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public @ResponseBody List<Bizcuit> getAllBizcuits()
	{
		return (List<Bizcuit>) repository.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public @ResponseBody Bizcuit insertBizcuit(@RequestBody Bizcuit bizcuit)
	{
		return repository.save(bizcuit);
	}
	
}
