package com.ebizcuit.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.ebizcuit.domain.Account;
import com.ebizcuit.repository.AccountRepository;


@Configuration
public class WebSecurityConfiguration extends GlobalAuthenticationConfigurerAdapter {

	@Autowired
	AccountRepository repository;
	
	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception{
		
	}
	
	@Bean
	UserDetailsService userDetailsService(){
		return new UserDetailsService() {
			@Override
			public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
				// TODO Auto-generated method stub
				Account account = repository.findByUsername(username);
				if(account != null){
					return new User(account.getUsername(), account.getPassword(), true,
							true, true, true, AuthorityUtils.createAuthorityList("USER"));
				}else{
					throw new UsernameNotFoundException("Can't find user "+username);
				}
			}
		};
	}
	
	
}
