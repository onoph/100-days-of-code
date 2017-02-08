package com.ebizcuit.domain;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ebizcuit.repository.UserRole;

@Entity
@Table(name="user")
public class User {

	@Id @GeneratedValue
	private Long id;
	private String username;
	private String password;
	
    @OneToMany
    @JoinColumn(name="APP_USER_ID", referencedColumnName="ID")
    private List<UserRole> roles;
    
    public User() { }
    
    public User(Long id, String username, String password, List<UserRole> roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public List<UserRole> getRoles() {
		return roles;
	}

	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}
	
	
	
}
