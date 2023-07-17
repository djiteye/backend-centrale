package com.devback.uc.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devback.uc.Entity.ChambreA1;
import com.devback.uc.Repository.ChambreA1Repos;

@Service
public class ChambreA1Service {
	@Autowired
    private ChambreA1Repos chambreR;
	 public List<ChambreA1> getChambres(){
		 List<ChambreA1> car= new ArrayList<>();
		 chambreR.findAll().forEach(ca -> {
			 car.add(ca);
			 });
		 return car;
	 }
	 //chambre dispos
	 public List<ChambreA1> getChambresv(){
		 List<ChambreA1> chsh=new ArrayList<>();
	    	for(ChambreA1 chambre: chambreR.findAll()) {
	    		if(chambre.getNom()==null && chambre.getPrenom()==null) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 //chambre réellement valider 
	 public List<ChambreA1> getChambresrva(){
		 List<ChambreA1> chsh=new ArrayList<>();
	    	for(ChambreA1 chambre: chambreR.findAll()) {
	    		if(chambre.getDate_entre()!=null && chambre.getDate_sortie()!=null) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 //chambre réellement vide
	 public List<ChambreA1> getChambresrvi(){
		 List<ChambreA1> chsh=new ArrayList<>();
	    	for(ChambreA1 chambre: chambreR.findAll()) {
	    		if(chambre.getDate_entre()==null && chambre.getDate_sortie()==null) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public List<ChambreA1> getChambressv(){
		 List<ChambreA1> chsh=new ArrayList<>();
	    	for(ChambreA1 chambre: chambreR.findAll()) {
	    		if(chambre.getPlace().toString().equals("single") && chambre.getNom()==null && chambre.getPrenom()==null) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public List<ChambreA1> getChambresdv(){
		 List<ChambreA1> chsh=new ArrayList<>();
	    	for(ChambreA1 chambre: chambreR.findAll()) {
	    		if(chambre.getNom()==null && chambre.getPrenom()==null && chambre.getPlace().toString().equals("double")) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public List<ChambreA1> getChambrestv(){
		 List<ChambreA1> chsh=new ArrayList<>();
	    	for(ChambreA1 chambre: chambreR.findAll()) {
	    		if(chambre.getNom()==null && chambre.getPrenom()==null && chambre.getPlace().toString().equals("triple")) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 //chambres reservées
	 public List<ChambreA1> getChambresnv(){
		 List<ChambreA1> chsh=new ArrayList<>();
	    	for(ChambreA1 chambre: chambreR.findAll()) {
	    		if(chambre.getNom()!=null && chambre.getPrenom()!=null) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public List<ChambreA1> getChambresva(){
		 List<ChambreA1> chsh=new ArrayList<>();
	    	for(ChambreA1 chambre: chambreR.findAll()) {
	    		if(chambre.isValider()==true) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public ChambreA1 getChambre(int id) {
		 ChambreA1 other = null;
		return chambreR.findById(id).orElse(other);
	 }
	 
	 public void deleteChambre(int id) {
		 chambreR.deleteById(id);
	 }
	 public void addChambre(ChambreA1 car) {
		 chambreR.save(car);
	 }
	 public void updateChambre(ChambreA1 car, int id) {
		 chambreR.save(car);
	 }
	 public void deleteChambres() {
		 chambreR.deleteAll();
	 }
	 
     
}
