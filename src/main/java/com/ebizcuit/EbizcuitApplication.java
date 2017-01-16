package com.ebizcuit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ebizcuit.domain.Account;
import com.ebizcuit.domain.article.Bizcuit;
import com.ebizcuit.domain.enums.TypeBizcuit;
import com.ebizcuit.repository.AccountRepository;
import com.ebizcuit.repository.BizcuitRepository;

@SpringBootApplication
@EnableAutoConfiguration
public class EbizcuitApplication implements CommandLineRunner {

	@Autowired
	private BizcuitRepository repository;
	@Autowired
	private AccountRepository accountRepo;
	
	public static void main(String[] args)
	{
		SpringApplication.run(EbizcuitApplication.class, args);
	}
	

	public void run(String... arg0) throws Exception {
		repository.deleteAll();
		Bizcuit b = new Bizcuit();
		b.setReference("COOKIE_CHOCO_1");
		b.setPrice(2.00);
		b.setType(TypeBizcuit.CHOCO);
		b.setName("Cookie choco");
		
		Bizcuit b2 = new Bizcuit();
		b2.setReference("COOKIE_PEPITE");
		b2.setPrice(2.50);
		b2.setType(TypeBizcuit.COOKIE);
		b2.setName("Cookie pepite");
		
		repository.save(b);
		repository.save(b2);
		
		accountRepo.save(new Account("user", "password"));
	}
}
