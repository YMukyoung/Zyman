package com.zyman.zym.controller.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {

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
		return "/auth/regist";
	}
}
