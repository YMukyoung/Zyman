package com.zyman.zym.controller.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zyman.zym.service.UserService;

@Controller
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	UserService userService;
	
	@GetMapping("/login")
	public String goLoginPage() {
		return "/auth/login";
	}
	
	@GetMapping("/regist")
	public String goRegistPage() {
		return "/auth/regist";
	}
	
	@PostMapping("/regist")
	public String regist() {
		userService.userRegist(null, null, null);
		return "/";
	}
}
