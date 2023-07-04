package com.devback.uc.Entity;



import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "roles")
public class Role {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private String id;
	
	private ERole name;
	  
	  public Role(ERole name) {
		  //super();
		    this.name = name;
		  }

	  public Role() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ERole getName() {
		return name;
	}

	public void setName(ERole name) {
		this.name = name;
	}
	/*public List<Role> getRoles() {
		return roless;
	}

	public void setRoles(List<Role> roles) {
		this.roless = roles;
	}
	private List<Role> roless=new ArrayList<>();
	 Role ROLE_ADMIN= new Role(ERole.ROLE_ADMIN);
	 Role ROLE_MODERATOR= new Role(ERole.ROLE_MODERATOR);
	 Role ROLE_USER= new Role(ERole.ROLE_USER);
	//roless.add(new Role(ERole.ROLE_ADMIN));
	 */

	

}
