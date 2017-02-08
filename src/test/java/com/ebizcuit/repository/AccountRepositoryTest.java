package com.ebizcuit.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.ebizcuit.domain.Account;
import com.ebizcuit.domain.Customer;

import static org.assertj.core.api.Assertions.assertThat;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@DirtiesContext
public class AccountRepositoryTest {

	
	@Autowired private AccountRepository repository;
	@Autowired private EntityManager em;
	
	@Test
	public void should_find_no_account()
	{
		Iterable<Account> accounts = repository.findAll();
		assertThat(accounts).isEmpty();
	}
	
	@Test
	public void should_add_an_account()
	{
		Account a = repository.save(new Account("toto", "password"));
		
		assertThat(a).hasFieldOrPropertyWithValue("username", "toto");
		assertThat(a).hasFieldOrPropertyWithValue("password", "password");
		assertThat(a).hasFieldOrProperty("id");
	}
	
	@Test
	public void should_delete_all_accounts()
	{
		em.persist(new Account("toto", "tata"));
		em.persist(new Account("titi", "tutu"));
		
		repository.deleteAll();
		
		assertThat(repository.findAll()).isEmpty();
	}
	
	@Test
	public void should_find_all_accounts()
	{
		Account a1 = new Account("toto", "tata");
		Account a2 = new Account("titi", "tutu");
		Account a3 = new Account("pepe", "kiki");
		
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		
		Iterable<Account> accounts = repository.findAll();
		assertThat(accounts).hasSize(3).contains(a1, a2, a3);
	}
	
	@Test
	public void shoud_find_account_by_id()
	{
		Account a = new Account("batman", "alfred");
		em.persist(a);
		Account a2 = new Account("catwoman", "cat");
		em.persist(a2);
		
		Account aFound = repository.findOne(a.getId());
		assertThat(aFound).isEqualTo(a);
	}
	
	@Test
	public void should_find_account_by_username()
	{
		Account a = new Account("superman", "kryptonite");
		em.persist(a);
		Account a2 = new Account("Clark Kent", "Loise Lane");
		em.persist(a2);
		
		Account aFound = repository.findByUsername("superman");
		assertThat(aFound).isEqualTo(a);
	}
	
}

