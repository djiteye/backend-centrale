package com.devback.uc.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devback.uc.Entity.Chambre;

import com.devback.uc.Repository.ChambreRepos;

@Service
public class ChambreService {
	@Autowired
    private ChambreRepos chambreR;
	 public List<Chambre> getChambres(){
		 List<Chambre> car= new ArrayList<>();
		 chambreR.findAll().forEach(ca -> {
			 car.add(ca);
			 });
		 return car;
	 }
	 public List<Chambre> getChambressh(){
		 List<Chambre> chsh=new ArrayList<>();
	    	for(Chambre chambre: chambreR.findAll()) {
	    		if(chambre.getGenre().equals("homme") && chambre.getPlace().equals("single")) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public List<Chambre> getChambresdh(){
		 List<Chambre> chsh=new ArrayList<>();
	    	for(Chambre chambre: chambreR.findAll()) {
	    		if(chambre.getGenre().equals("homme") && chambre.getPlace().equals("double")) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public List<Chambre> getChambresth(){
		 List<Chambre> chsh=new ArrayList<>();
	    	for(Chambre chambre: chambreR.findAll()) {
	    		if(chambre.getGenre().equals("homme") && chambre.getPlace().equals("triple")) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public List<Chambre> getChambressf(){
		 List<Chambre> chsh=new ArrayList<>();
	    	for(Chambre chambre: chambreR.findAll()) {
	    		if(chambre.getGenre().equals("femme") && chambre.getPlace().equals("single")) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public List<Chambre> getChambresdf(){
		 List<Chambre> chsh=new ArrayList<>();
	    	for(Chambre chambre: chambreR.findAll()) {
	    		if(chambre.getGenre().equals("femme") && chambre.getPlace().equals("double")) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public List<Chambre> getChambrestf(){
		 List<Chambre> chsh=new ArrayList<>();
	    	for(Chambre chambre: chambreR.findAll()) {
	    		if(chambre.getGenre().equals("femme") && chambre.getPlace().equals("triple")) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 
	 public Chambre getChambre(int id) {
		 Chambre other = null;
		return chambreR.findById(id).orElse(other);
	 }
	 
	 public void deleteChambre(long id) {
		 chambreR.deleteById(id);
	 }
	 public void addChambre(Chambre car) {
		 chambreR.save(car);
	 }
	 public void updateChambre(Chambre car, long id) {
		 chambreR.save(car);
	 }

}
