package com.zyman.zym.serviceImpl;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.zyman.zym.dto.UserDTO;
import com.zyman.zym.service.UserService;

public class UserServiceImpl implements UserService{

	public UserDetailsService userRegist(String ID, String Name, String Password) {
		UserDTO user = new UserDTO(ID, Name, Password);
		
		UserDetails userDetails = User.withDefaultPasswordEncoder()
				                      .username(user.getID())
				                      .password(user.getPassword())
				                      .roles("USER")
				                      .build();
		
		return new InMemoryUserDetailsManager(userDetails);
	}
}
