package com.venkatasai.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BasicAuthenticationController {
	
	
	@GetMapping(path="/basicauth")
	public AuthenticationBean hellowWorldBean() {
		return new AuthenticationBean("You are authenticated");
	}
	


}
