package com.devback.uc.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Appartement")
public class Appartement {
 @javax.persistence.Id
 private long Id;
 private String name;
/* Etage etage;
 Chambre chambre1;
 Chambre chambre2;
 Chambre chambre3;*/
 public Appartement(long Id,String name/*,Etage etage,Chambre n1,Chambre n2, Chambre n3*/ ) {
	 super();
	 this.Id=Id;
	 this.name=name;
	/* this.etage=etage;
	 this.chambre1=n1;
	 this.chambre2=n2;
	 this.chambre3=n3;*/
 }
/*public Etage getEtage() {
	return etage;
}
public void setEtage(Etage etage) {
	this.etage = etage;
}*/
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
/*public Chambre getChambre1() {
	return chambre1;
}
public void setChambre1(Chambre chambre1) {
	this.chambre1 = chambre1;
}
public Chambre getChambre2() {
	return chambre2;
}
public void setChambre2(Chambre chambre2) {
	this.chambre2 = chambre2;
}
public Chambre getChambre3() {
	return chambre3;
}
public void setChambre3(Chambre chambre3){
	this.chambre3 = chambre3;
}*/
 
}
