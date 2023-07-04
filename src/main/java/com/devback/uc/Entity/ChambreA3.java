package com.devback.uc.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor

@Data
@Entity
@Table(name="chambreA3")
public class ChambreA3 {

	@javax.persistence.Id
	private int id;
	private String appartement;
	private String place;
	private String genre;
	private String name;
	private String nom;
	private String prenom;
	private String nationalite;
	private String passeport;
	private LocalDate date_de_reserv;
	private LocalDateTime date_arrive;
	private LocalDate date_entre;
	private Date date_sortie;
	private boolean valider;
	
	

	public ChambreA3(int id,String appartement,String place,String genre, String name,String nom,String prenom,String nationalite,String passeport,LocalDate date_de_reserv,LocalDateTime date_arrive,LocalDate date_entre,Date date_sortie,boolean valider) {
		super();
		this.id=id;
		this.appartement=appartement;
		this.place=place;
		this.genre=genre;
		this.name=name;
		this.nom=nom;
		this.prenom=prenom;
		this.nationalite=nationalite;
		this.passeport=passeport;
		this.date_de_reserv=date_de_reserv;
		this.date_arrive=date_arrive;
		this.date_entre=date_entre;
		this.date_sortie=date_sortie;
		this.valider=valider;
		
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getAppartement() {
		return appartement;
	}



	public void setAppartement(String appartement) {
		this.appartement = appartement;
	}



	public String getPlace() {
		return place;
	}



	public void setPlace(String place) {
		this.place = place;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
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



	public String getPasseport() {
		return passeport;
	}



	public void setPasseport(String passeport) {
		this.passeport = passeport;
	}



	public LocalDate getDate_de_reserv() {
		return date_de_reserv;
	}



	public void setDate_de_reserv(LocalDate date_de_reserv) {
		this.date_de_reserv = date_de_reserv;
	}



	public LocalDateTime getDate_arrive() {
		return date_arrive;
	}



	public void setDate_arrive(LocalDateTime date_arrive) {
		this.date_arrive = date_arrive;
	}



	public LocalDate getDate_entre() {
		return date_entre;
	}



	public void setDate_entre(LocalDate date_entre) {
		this.date_entre = date_entre;
	}



	public Date getDate_sortie() {
		return date_sortie;
	}



	public void setDate_sortie(Date date_sortie) {
		this.date_sortie = date_sortie;
	}



	public boolean isValider() {
		return valider;
	}



	public void setValider(boolean valider) {
		this.valider = valider;
	}
}
