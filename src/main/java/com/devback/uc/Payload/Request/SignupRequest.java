package com.devback.uc.Payload.Request;

import java.util.Set;

import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/
//import javax.persistence.Id;
import javax.validation.constraints.Email;

//import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class SignupRequest {
	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;*/
	
    private String username;
 
    @Email
    private String email;
    
    private String genre;
    
    private String password;
    
    private Set<String> roles;
    
    
    
    
    public SignupRequest( String a, String e, String g , String p, Set<String> r) {
    	//this.id=id;
    	this.username=a;
    	this.email=e;
    	this.genre=g;
    	this.password=p;
    	this.roles=r;
    	
    }

	
	/*public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}*/

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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Set<String> getRoles() {
		return roles;
	}

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    

}
