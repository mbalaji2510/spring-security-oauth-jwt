package com.infosys.springsecurity.oauth.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccessController {
	
	@GetMapping("/login")
	public String login() {
		return "Welcome Kishore";	
	}

}
