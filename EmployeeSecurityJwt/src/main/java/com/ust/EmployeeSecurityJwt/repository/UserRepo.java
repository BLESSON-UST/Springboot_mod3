package com.ust.EmployeeSecurityJwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.EmployeeSecurityJwt.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
