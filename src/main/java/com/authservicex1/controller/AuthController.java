package com.authservicex1.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authservicex1.dto.APIResponse;
import com.authservicex1.dto.LoginDto;
import com.authservicex1.dto.UserDto;
import com.authservicex1.service.AuthService;
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
	
	private AuthService authService;
	
	private AuthenticationManager authManager;
	public AuthController(AuthService authService,AuthenticationManager authManager) {
		
		this.authService = authService;
		this.authManager = authManager;
	}
	
	@PostMapping("/register/")

		
		public ResponseEntity<APIResponse<String>> register(@RequestBody UserDto dto) {
	        APIResponse<String> response = authService.register(dto);
	        return new ResponseEntity<>(response, HttpStatusCode.valueOf(response.getStatus()));
	}
	 
	 @PostMapping("/login")
	 public ResponseEntity<APIResponse<String>> loginCheck(@RequestBody LoginDto loginDto){
		 
		 APIResponse<String> response = new APIResponse<>();
		 
		 UsernamePasswordAuthenticationToken token = 
				 new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword());
		 try {
			 Authentication authenticate = authManager.authenticate(token);
			 
			 if(authenticate.isAuthenticated()) {
				 response.setMessage("Login Sucessful");
				 response.setStatus(200);
				 response.setData("User has logged");
				 return new ResponseEntity<>(response, HttpStatusCode.valueOf(response.getStatus()));
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 response.setMessage("Failed");
		 response.setStatus(401);
		 response.setData("Un-Authorized Access");
		 return new ResponseEntity<>(response, HttpStatusCode.valueOf(response.getStatus()));
		 
	 }
}
