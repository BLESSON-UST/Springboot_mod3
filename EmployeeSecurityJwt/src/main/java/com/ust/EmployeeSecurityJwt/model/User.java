package com.ust.EmployeeSecurityJwt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_tb1")
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String password;
	private String email;
	private String phnum;
	public User(int id, String name, String password, String email, String phnum) {
		
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.phnum = phnum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhnum() {
		return phnum;
	}
	public void setPhnum(String phnum) {
		this.phnum = phnum;
	}
	
	
	
	
	
	

}
