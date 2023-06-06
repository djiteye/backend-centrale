package com.devback.uc.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devback.uc.Entity.User;
import com.devback.uc.Repository.UserRepos;


@RestController
@RequestMapping(value="User")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	public UserRepos repo;
	
		@PostMapping("/login")
		public ResponseEntity<?> loginUser(@RequestBody User userData){
			System.out.println(userData);
        Optional<User> user= repo.findByUsername(userData.getUsername());

			if(user.isPresent() && user.get().getPassword().equals(userData.getPassword())) {
				return ResponseEntity.ok(user);
			}
			else{
				return (ResponseEntity<?>) ResponseEntity.internalServerError();}
		} 
		
		
		@PostMapping("/register")
		public ResponseEntity<?>  registerUser(@RequestBody User data) {
			System.out.println("user register called");
			System.out.println(data);
			return ResponseEntity.ok(repo.save(data));
		}
}
