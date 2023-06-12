package com.devback.uc.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor

@Data
@Entity
@Table(name="chambre")
public class Chambre {

	@javax.persistence.Id
	private int id;
	
	private String place;
	private String genre;
	private String name;
	private String nom;
	private String prenom;
	private String nationalite;
	private Date date_de_reserv;
	private Date date_entre;
	private Date date_sortie;
	
	

	public Chambre(int id,String place,String genre, String name,String nom,String prenom,String nationalite,Date date_de_reserv,Date date_entre,Date date_sortie) {
		super();
		this.id=id;
		//this.appartement=appartement;
		this.place=place;
		this.genre=genre;
		this.name=name;
		this.nom=nom;
		this.prenom=prenom;
		this.nationalite=nationalite;
		this.date_de_reserv=date_de_reserv;
		this.date_entre=date_entre;
		this.date_sortie=date_sortie;
		
	}


	

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNationalite() {
		return nationalite;
	}


	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}


	public Date getDate_de_reserv() {
		return date_de_reserv;
	}


	public void setDate_de_reserv(Date date_de_reserv) {
		this.date_de_reserv = date_de_reserv;
	}


	public Date getDate_entre() {
		return date_entre;
	}


	public void setDate_entre(Date date_entre) {
		this.date_entre = date_entre;
	}


	public Date getDate_sortie() {
		return date_sortie;
	}


	public void setDate_sortie(Date date_sortie) {
		this.date_sortie = date_sortie;
	}


	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
