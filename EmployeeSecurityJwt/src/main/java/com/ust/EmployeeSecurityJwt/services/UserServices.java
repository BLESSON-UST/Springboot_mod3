package com.ust.EmployeeSecurityJwt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.EmployeeSecurityJwt.model.User;
import com.ust.EmployeeSecurityJwt.repository.UserRepo;
@Service

public class UserServices {
	@Autowired
	private UserRepo repo;

	public User auth(User user) {
		// TODO Auto-generated method stub
		
		return repo.save(user);
	}

}
