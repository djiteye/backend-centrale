package com.devback.uc.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.devback.uc.Entity.ERole;
import com.devback.uc.Entity.Role;
import com.devback.uc.Repository.RoleRepos;

@Service
public class RoleService {
	@Autowired
    private RoleRepos roleRepository;

    
    public RoleService(RoleRepos roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    public Optional<Role> findByName(ERole name) {
        return roleRepository.findByName(name);
    }
    
    public List<Role> lista(){
    	List<Role> a= new ArrayList<>();
    	for(Role rl: roleRepository.findAll()) {
    		if(rl.getName().toString().equals("ROLE_ADMIN")) {
    			a.add(rl);
    		}
    	}
		return a;
    	
    }
    public List<Role> listm(){
    	List<Role> a= new ArrayList<>();
    	for(Role rl: roleRepository.findAll()) {
    		if(rl.getName().toString().equals("ROLE_MODERATOR")) {
    			a.add(rl);
    		}
    	}
		return a;
    	
    }
    public List<Role> listu(){
    	List<Role> a= new ArrayList<>();
    	for(Role rl: roleRepository.findAll()) {
    		if(rl.getName().toString().equals("ROLE_USER")) {
    			a.add(rl);
    		}
    	}
		return a;
    	
    }
}

