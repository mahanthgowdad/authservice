package com.authservicex1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
@RequestMapping("/api/v1/welcome")
public class WelcomeController {
	
	@GetMapping("/Hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/Hi")
	public String hi() {
		return "hi";
	}
	
	

}
