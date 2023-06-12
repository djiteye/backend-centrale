package com.devback.uc.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devback.uc.Entity.Appartement;

import com.devback.uc.Repository.AppartementRepos;

@Service
public class AppartementService {
	@Autowired
    private AppartementRepos AppartementR;
	 public List<Appartement> getAppartements(){
		 List<Appartement> car= new ArrayList<>();
		 AppartementR.findAll().forEach(ca -> {
			 car.add(ca);
			 });
		 return car;
	 }
	 
	 public Appartement getAppartement(long id) {
		 Appartement other = null;
		return AppartementR.findById(id).orElse(other);
	 }
	 
	 public void deleteAppartement(long id) {
		 AppartementR.deleteById(id);
	 }
	 public void addAppartement(Appartement car) {
		 AppartementR.save(car);
	 }
	 public void updateAppartement(Appartement car, long id) {
		 AppartementR.save(car);
	 }

}
