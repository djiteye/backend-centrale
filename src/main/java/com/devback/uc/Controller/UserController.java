package com.devback.uc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devback.uc.Entity.User;
import com.devback.uc.Repository.UserRepos;
//import com.devback.uc.Securite.UserDetailsImpl;
import com.devback.uc.Service.UserService;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
    private UserService userService;
	
	@Autowired
	private UserRepos userRepos;
	
	@GetMapping("/listU")
	public List<User> getUsers(){
		return userService.getUsers();
		}
	@GetMapping("/U/{id}")
	public User getChambre(@PathVariable String id) {
		return userService.getUser(id);
	}
	@DeleteMapping("/deleteU/{id}")
	public void delete(@PathVariable String id) {
		userService.deleteUser(id);
	}
	 @GetMapping("/me")
	    public ResponseEntity<?> me(@AuthenticationPrincipal UserDetails userDetails) {
		    
	        return ResponseEntity.ok(userDetails);
	    }

	    @GetMapping("/{id}")
	    //@PreAuthorize("#user.id == #id")
	    public ResponseEntity<?> me(@AuthenticationPrincipal User user, @PathVariable String id) {
	        return ResponseEntity.ok(userRepos.findById(id));
	    }
}
