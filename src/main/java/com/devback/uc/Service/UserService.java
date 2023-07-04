package com.devback.uc.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devback.uc.Entity.User;
import com.devback.uc.Repository.UserRepos;

@Service
public class UserService {

	@Autowired
    private UserRepos userR;
	 public List<User> getUsers(){
		 List<User> car= new ArrayList<>();
		 userR.findAll().forEach(ca -> { 
			 car.add(ca);
			 });
		 return car;
	 }
	 public User getUser(Long id) {
		 User other = null;
		return userR.findById(id).orElse(other);
	 }
	 
	 public void deleteUser(Long id) {
		 userR.deleteById(id);
	 }
	/* public void addUser(User car) {
		 userR.save(car);
	 }
	 public void updateChambre(ChambreA1 car, int id) {
		 chambreR.save(car);
	 }
	 public void deleteChambres() {
		 chambreR.deleteAll();
	 }*/
	 
}
