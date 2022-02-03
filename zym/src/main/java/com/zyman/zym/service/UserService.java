package com.zyman.zym.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
	public UserDetailsService userRegist(String id, String name, String password);
}
