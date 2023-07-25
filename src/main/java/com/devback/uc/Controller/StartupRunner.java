package com.devback.uc.Controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.devback.uc.Entity.ERole;
import com.devback.uc.Entity.RefreshToken;
import com.devback.uc.Entity.Role;
import com.devback.uc.Entity.User;
//import com.devback.uc.Repository.RefreshTokenRepository;
import com.devback.uc.Repository.RoleRepos;
import com.devback.uc.Repository.UserRepos;
import com.devback.uc.Securite.UserDetailsServiceImpl;
import com.devback.uc.Securite.Jwt.JwtUtils;
import com.devback.uc.Service.RoleService;
import com.devback.uc.Service.UserService;

@Component
public class StartupRunner{

	 @Autowired
		UserRepos userRepository;

		@Autowired
		RoleRepos roleRepository;

		@Autowired
		PasswordEncoder encoder;
		
		@Autowired
		UserService userService;
		
		@Autowired
		UserDetailsServiceImpl userDetailsServiceImpl;
		
		/*@Autowired
		private RefreshTokenRepository refreshTokenRepository;*/
		
		@Autowired
	    private RoleService roleService;
		

		@Autowired
		private JwtUtils jwtUtils;
		
		
		
	 @EventListener(ContextRefreshedEvent.class)
	    public void userdefault() {
		

			
			long idd= this.userService.getUsers().size();
			if(idd==0) {
				User user = new User(//signUpRequest.getId(),
			             //Id,
			             "AdminiMaison", 
						 "AdminMaison@gmail.com",
						 encoder.encode("AdminMaison2023@"),
						 "femme"
						 );

		Role ROLE_ADMIN= new Role(ERole.ROLE_ADMIN);
		Role ROLE_MODERATOR= new Role(ERole.ROLE_MODERATOR);
		Role ROLE_USER= new Role(ERole.ROLE_USER);
		if(this.roleService.lista().size()== 0) {
		this.roleService.createRole(ROLE_ADMIN);}
		if(this.roleService.listm().size()== 0) {
		this.roleService.createRole(ROLE_MODERATOR);}
		if(this.roleService.listu().size()== 0) {
		this.roleService.createRole(ROLE_USER);}
		//Set<String> strRoles = user.getRoles();
		Set<Role> roles = new HashSet<>();
		Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
				.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
		roles.add(adminRole );

		user.setRole(roles);
		userRepository.save(user);
		RefreshToken refreshToken = new RefreshToken();
		refreshToken.setOwner(user);
		//refreshTokenRepository.save(refreshToken);

		String accessToken = jwtUtils.generateAccessToken(user);
		String refreshTokenString = jwtUtils.generateRefreshToken(user, refreshToken.getId());

		//return ResponseEntity.ok(new TokenDTO(user.getId(), accessToken, refreshTokenString));
		System.out.println("l'utilisateur par defaut a été créer");
				
			}else {
				System.out.println("l'utilisateur par defaut existe déjà");
			}
	    }
}
