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
	 public List<ChambreA1> getChambresv(){
		 List<ChambreA1> chsh=new ArrayList<>();
	    	for(ChambreA1 chambre: chambreR.findAll()) {
	    		if(chambre.getNom()==null && chambre.getPrenom()==null) {
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
