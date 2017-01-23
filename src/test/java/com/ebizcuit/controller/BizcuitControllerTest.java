package com.ebizcuit.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.ebizcuit.controller.api.publics.BizcuitController;
import com.ebizcuit.domain.article.Bizcuit;
import com.ebizcuit.repository.AccountRepository;
import com.ebizcuit.repository.BizcuitRepository;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@WebMvcTest(BizcuitController.class)
public class BizcuitControllerTest {

	@Autowired
	private MockMvc mock;
	
	@MockBean
	private BizcuitRepository repository;
	@MockBean
	private AccountRepository accountRepo;
	
	@Before
	public void setup()
	{
		repository.deleteAll();
		Bizcuit b = getCookieTest();
		repository.save(b);
	}
	
	@Test
	public void testGetAll() throws Exception{
		given(this.repository.findAll())
			.willReturn(getIterableCookies());
		this.mock.perform(get("/api/bizcuit").accept(MediaType.APPLICATION_JSON))
				  .andExpect(status().isOk()).andExpect(content().contentType("application/json"));
	}
	
	private List<Bizcuit> getIterableCookies()
	{
		Bizcuit b = getCookieTest();
		List<Bizcuit> result = new ArrayList<>();
		result.add(b);
		return result;
	}
	
	private Bizcuit getCookieTest()
	{
		Bizcuit b = new Bizcuit();
		b.setName("Cookie de test");
		b.setPrice(2.00);
		b.setReference("COOKIE_TEST");
		return b;
	}	
	
	
}
