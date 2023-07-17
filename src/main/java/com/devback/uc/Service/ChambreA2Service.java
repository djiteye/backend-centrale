package com.devback.uc.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devback.uc.Entity.ChambreA2;
import com.devback.uc.Repository.ChambreA2Repos;

@Service
public class ChambreA2Service {

	@Autowired
    private ChambreA2Repos chambreR;
	 public List<ChambreA2> getChambres(){
		 List<ChambreA2> car= new ArrayList<>();
		 chambreR.findAll().forEach(ca -> {
			 car.add(ca);
			 });
		 return car;
	 }
	 public List<ChambreA2> getChambresvi(){
		 List<ChambreA2> chsh=new ArrayList<>();
	    	for(ChambreA2 chambre: chambreR.findAll()) {
	    		if(chambre.getNom()==null && chambre.getPrenom()==null) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public List<ChambreA2> getChambressv(){
		 List<ChambreA2> chsh=new ArrayList<>();
	    	for(ChambreA2 chambre: chambreR.findAll()) {
	    		if(chambre.getPlace().toString().equals("single") && chambre.getNom()==null && chambre.getPrenom()==null) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public List<ChambreA2> getChambresdv(){
		 List<ChambreA2> chsh=new ArrayList<>();
	    	for(ChambreA2 chambre: chambreR.findAll()) {
	    		if(chambre.getNom()==null && chambre.getPrenom()==null && chambre.getPlace().toString().equals("double")) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public List<ChambreA2> getChambrestv(){
		 List<ChambreA2> chsh=new ArrayList<>();
	    	for(ChambreA2 chambre: chambreR.findAll()) {
	    		if(chambre.getNom()==null && chambre.getPrenom()==null && chambre.getPlace().toString().equals("triple")) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public List<ChambreA2> getChambresnvf(){
		 List<ChambreA2> chsh=new ArrayList<>();
	    	for(ChambreA2 chambre: chambreR.findAll()) {
	    		if(chambre.getNom()!=null && chambre.getPrenom()!=null) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public List<ChambreA2> getChambresva(){
		 List<ChambreA2> chsh=new ArrayList<>();
	    	for(ChambreA2 chambre: chambreR.findAll()) {
	    		if(chambre.isValider()==true) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 public ChambreA2 getChambre(int id) {
		 ChambreA2 other = null;
		return chambreR.findById(id).orElse(other);
	 }
	 
	 public void deleteChambre(int id) {
		 chambreR.deleteById(id);
	 }
	 public void addChambre(ChambreA2 car) {
		 chambreR.save(car);
	 }
	 public void updateChambre(ChambreA2 car, int id) {
		 chambreR.save(car);
	 }
	 public void deleteChambres() {
		 chambreR.deleteAll();
	 }
	 
	 //chambre dispos
	 public List<ChambreA2> getChambresv(){
		 List<ChambreA2> chsh=new ArrayList<>();
	    	for(ChambreA2 chambre: chambreR.findAll()) {
	    		if(chambre.getNom()==null && chambre.getPrenom()==null) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 //chambre réellement valider 
	 public List<ChambreA2> getChambresrva(){
		 List<ChambreA2> chsh=new ArrayList<>();
	    	for(ChambreA2 chambre: chambreR.findAll()) {
	    		if(chambre.getDate_entre()!=null && chambre.getDate_sortie()!=null) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	 //chambre réellement vide
	 public List<ChambreA2> getChambresrvi(){
		 List<ChambreA2> chsh=new ArrayList<>();
	    	for(ChambreA2 chambre: chambreR.findAll()) {
	    		if(chambre.getDate_entre()==null && chambre.getDate_sortie()==null) {
	    			chsh.add(chambre);
	    		}
	    	}
			return chsh; 
	     }
	//chambres reservées
		 public List<ChambreA2> getChambresnv(){
			 List<ChambreA2> chsh=new ArrayList<>();
		    	for(ChambreA2 chambre: chambreR.findAll()) {
		    		if(chambre.getNom()!=null && chambre.getPrenom()!=null) {
		    			chsh.add(chambre);
		    		}
		    	}
				return chsh; 
		     }
}
