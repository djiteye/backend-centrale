package com.devback.uc.Controller;
import java.util.HashSet;
//import java.util.List;
import java.util.Optional;
import java.util.Set;
//import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
/*import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;*/
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devback.uc.Entity.ERole;
import com.devback.uc.Entity.Role;
import com.devback.uc.Entity.User;
import com.devback.uc.Payload.Request.LoginRequest;
import com.devback.uc.Payload.Request.SignupRequest;
//import com.devback.uc.Payload.Response.JwtResponse;
import com.devback.uc.Payload.Response.MessageResponse;
import com.devback.uc.Repository.RoleRepos;
import com.devback.uc.Repository.UserRepos;
//import com.devback.uc.Securite.UserDetailsImpl;
import com.devback.uc.Securite.Jwt.JwtUtils;
import com.devback.uc.Service.RoleService;





@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {
	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserRepos userRepository;

	@Autowired
	RoleRepos roleRepository;

	@Autowired
	PasswordEncoder encoder;
	
	@Autowired
    private RoleService roleService;

	@Autowired
	JwtUtils jwtUtils;

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
		System.out.println("les informations d'authentification sont: "+ loginRequest.getUsername()+" "+ loginRequest.getPassword());
		Optional<User> princip= userRepository.findByUsername(loginRequest.getUsername());
		LoginRequest pr= new LoginRequest(princip.get().getUsername(), princip.get().getPassword());
		LoginRequest cr= new LoginRequest(loginRequest.getUsername(), loginRequest.getPassword());
		System.out.println("les informations d'authentification du principal sont: "+ pr.getUsername()+" "+ pr.getPassword());
		System.out.println("les informations d'authentification du crential sont: "+ cr.getUsername()+" "+ cr.getPassword());
		
		if(encoder.matches(cr.getPassword(),pr.getPassword())/*pr.getPassword().equals(cr.getPassword())*/) {
			return ResponseEntity.ok(princip);
		}
		else{
			return (ResponseEntity<?>) ResponseEntity.internalServerError();}
	 
	  /*  Authentication authentication = authenticationManager.authenticate(
	            new UsernamePasswordAuthenticationToken(pr,cr));

	    SecurityContextHolder.getContext().setAuthentication(authentication);
	    String jwt = jwtUtils.generateJwtToken(authentication);

	    UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
	    List<String> roles = userDetails.getAuthorities().stream()
	            .map(GrantedAuthority::getAuthority)
	            .collect(Collectors.toList());

	    JwtResponse jwtResponse = new JwtResponse(jwt,
	            userDetails.getId(),
	            userDetails.getUsername(),
	            userDetails.getEmail(),
	            userDetails.getGenre(),
	            roles);

	    return ResponseEntity.ok(jwtResponse);*/
	}

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
		
	
		if (userRepository.existsByUsername(signUpRequest.getUsername())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Error: Username is already taken!"));
		}

		if (userRepository.existsByEmail(signUpRequest.getEmail())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Error: Email is already in use!"));
		}

		// Create new user's account
		User user = new User(signUpRequest.getId(),
				             signUpRequest.getUsername(), 
							 signUpRequest.getEmail(),
							 encoder.encode(signUpRequest.getPassword()),
							 signUpRequest.getGenre()
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
		Set<String> strRoles = signUpRequest.getRoles();
		Set<Role> roles = new HashSet<>();

		if (strRoles.isEmpty()) {
			Role userRole = roleRepository.findByName(ERole.ROLE_USER)
					.orElseThrow(() -> new RuntimeException("Error: Role is not found1."));
			//roleRepository.save(userRole);
			//Role userRole=new Role(ERole.ROLE_USER);
			roles.add(userRole);
			
		} else {
			strRoles.forEach(role -> {
				switch (role) {
				case "admin":
					Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(adminRole);

					break;
				case "mod":
					Role modRole = roleRepository.findByName(ERole.ROLE_MODERATOR)
							.orElseThrow(() -> new RuntimeException("Error: Role is not found2."));
					roles.add(modRole);
					

					break;
				default:
					Role userRole = roleRepository.findByName(ERole.ROLE_USER)
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(userRole);
				}
			});
		}

		user.setRole(roles);
		userRepository.save(user);

		return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
	}
	
	}
