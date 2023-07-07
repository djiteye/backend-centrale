package com.devback.uc.Entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Data
@Entity
@Table(name="User")
public class User {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String username;
	private String email;
	private String password;
	private String genre;
	//private String role;
	@DBRef
	  private Set<Role> roles;
	public User(Long id, String username, String email, String password, String genre) {
		super();
		this.id=id;
		this.username=username;
		this.email=email;
		this.password=password;
		this.genre=genre;
		//this.roles=role;
	}
	public User() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Set<Role> getRole() {
		return roles;
	}
	public void setRole(Set<Role> role) {
		this.roles = role;
	}
	public User orElse(User other) {
		// TODO Auto-generated method stub
		return null;
	}
	public Role orElse(Role other) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
