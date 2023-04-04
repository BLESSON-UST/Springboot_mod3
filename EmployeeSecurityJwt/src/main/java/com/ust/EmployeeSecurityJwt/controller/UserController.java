package com.ust.EmployeeSecurityJwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.EmployeeSecurityJwt.model.User;
import com.ust.EmployeeSecurityJwt.services.UserServices;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserServices usrsrvs;
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome to UST";
	}
	
	@PostMapping("/auth")
	public User save(User user)
	{
		return usrsrvs.auth(user);
	}

}
