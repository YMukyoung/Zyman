package com.zyman.zym.service;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
	
	public UserDetailsService userRegist(String id, String name, String password);
}
