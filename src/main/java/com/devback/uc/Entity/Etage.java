package com.devback.uc.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Etage")
public class Etage {
	@Id
	private long Id;
	private String name;
	
	public Etage (long Id,String name) {
		super();
		this.Id=Id;
		this.name=name;
		
	}


	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
