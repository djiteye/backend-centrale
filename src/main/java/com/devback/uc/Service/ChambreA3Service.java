package com.devback.uc.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devback.uc.Entity.ChambreA3;

import com.devback.uc.Repository.ChambreA3Repos;

@Service
public class ChambreA3Service {

	@Autowired
    private ChambreA3Repos chambreR;
	 public List<ChambreA3> getChambres(){
		 List<ChambreA3> car= new ArrayList<>();
		 chambreR.findAll().forEach(ca -> {
			 car.add(ca);
			 });
		 return car;
	 }
	 public List<ChambreA3> getChambresv(){
		 List<ChambreA3> chsh=new ArrayList<>();
	    	for(ChambreA3 chambre: chambreR.findAll()) {
	    		if(chambre.getNom()==null && chambre.getPrenom()==null) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public List<ChambreA3> getChambressv(){
		 List<ChambreA3> chsh=new ArrayList<>();
	    	for(ChambreA3 chambre: chambreR.findAll()) {
	    		if(chambre.getPlace().toString().equals("single") && chambre.getNom()==null && chambre.getPrenom()==null) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public List<ChambreA3> getChambresdv(){
		 List<ChambreA3> chsh=new ArrayList<>();
	    	for(ChambreA3 chambre: chambreR.findAll()) {
	    		if(chambre.getNom()==null && chambre.getPrenom()==null && chambre.getPlace().toString().equals("double")) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public List<ChambreA3> getChambrestv(){
		 List<ChambreA3> chsh=new ArrayList<>();
	    	for(ChambreA3 chambre: chambreR.findAll()) {
	    		if(chambre.getNom()==null && chambre.getPrenom()==null && chambre.getPlace().toString().equals("triple")) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public List<ChambreA3> getChambresnv(){
		 List<ChambreA3> chsh=new ArrayList<>();
	    	for(ChambreA3 chambre: chambreR.findAll()) {
	    		if(chambre.getNom()!=null && chambre.getPrenom()!=null) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public List<ChambreA3> getChambresva(){
		 List<ChambreA3> chsh=new ArrayList<>();
	    	for(ChambreA3 chambre: chambreR.findAll()) {
	    		if(chambre.isValider()==true) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public ChambreA3 getChambre(int id) {
		 ChambreA3 other = null;
		return chambreR.findById(id).orElse(other);
	 }
	 
	 public void deleteChambre(int id) {
		 chambreR.deleteById(id);
	 }
	 public void addChambre(ChambreA3 car) {
		 chambreR.save(car);
	 }
	 public void updateChambre(ChambreA3 car, int id) {
		 chambreR.save(car);
	 }
	 public void deleteChambres() {
		 chambreR.deleteAll();
	 }
	 
}
