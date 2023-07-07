package com.devback.uc.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devback.uc.Entity.ERole;
import com.devback.uc.Entity.Role;
import com.devback.uc.Service.RoleService;

@RestController
@RequestMapping("/api/roles")
@CrossOrigin(origins = "http://localhost:4200")
public class RoleController {
	@Autowired
    private RoleService roleService;

   
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createRole(@RequestBody Role role) {
        Role createdRole = roleService.createRole(role);
        return ResponseEntity.ok(createdRole);
    }

    @GetMapping("/{name}")
    public ResponseEntity<?> getRoleByName(@PathVariable ERole name) {
        Optional<Role> role = roleService.findByName(name);
        return ResponseEntity.ok(role);
    }
    
    @GetMapping("/R/{id}")
    public ResponseEntity<?> getRole(@PathVariable long id) {
        //Optional<Role> role = roleService.findByName(name);
    	String rn=roleService.getRole(id); 
    	return  ResponseEntity.ok(rn);
        //return ResponseEntity.ok(rn);
    }
}
