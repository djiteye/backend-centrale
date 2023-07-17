package com.devback.uc.Securite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import com.devback.uc.Entity.User;
import com.devback.uc.Repository.UserRepos;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	UserRepos userRepository;

	/*@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

		return UserDetailsImpl.build(user);
	}*/
	@Override
	public User loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username)
		.orElseThrow(() -> new UsernameNotFoundException("username not found"));
		//return UserDetailsImpl.build(user);
	}
	
	public User findById(String id) {
		return userRepository.findById(id)
				.orElseThrow(() -> new UsernameNotFoundException("user id not found"));
	}
  

}
