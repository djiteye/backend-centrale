package com.devback.uc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devback.uc.Entity.User;
import com.devback.uc.Service.UserService;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
    private UserService userService;
	
	@GetMapping("/listU")
	public List<User> getUsers(){
		return userService.getUsers();
		}
	@GetMapping("/U/{id}")
	public User getChambre(@PathVariable Long id) {
		return userService.getUser(id);
	}
	@DeleteMapping("/deleteU/{id}")
	public void delete(@PathVariable Long id) {
		userService.deleteUser(id);
	}
}
