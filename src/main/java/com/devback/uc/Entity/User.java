package com.devback.uc.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
@Table(name="User")
public class User {
	@javax.persistence.Id
	private long Id;
	private String username;
	private String email;
	private String password;
	private String genre;
	private String role;
	public User(long Id, String username, String email, String password, String genre, String role) {
		super();
		this.Id=Id;
		this.username=username;
		this.email=email;
		this.password=password;
		this.genre=genre;
		this.role=role;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	

}
