package com.devback.uc.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devback.uc.Entity.Etage;
import com.devback.uc.Repository.EtageRepos;


@Service
public class EtageService {
	@Autowired
    private EtageRepos etageR;
    
	
	 public List<Etage> getEtages(){
		 List<Etage> car= new ArrayList<>();
		 etageR.findAll().forEach(ca -> {
			 car.add(ca);
			 });
		 return car;
	 }
	 
	 public Etage getEtage(long id) {
		 Etage other = null;
		return etageR.findById(id).orElse(other);
	 }
	 
	 public void deleteEtage(long id) {
		 etageR.deleteById(id);
	 }
	 public void addVoiture(Etage car) {
		  etageR.save(car);
	 }
	 public void updateVoiture(Etage car, long id) {
		  etageR.save(car);
	 }

}
