package com.nytins.spring.mvc.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {

	@Size(min=3, message="ID must be atleast 3 characters.")
	private String id;
	private String fullName;
	
	@Pattern(regexp="^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]+", message="Not a valid Email address.")
	private String email;

	public User() {	}
	
	public User(String id, String fullName, String email) {
		this.id = id;
		this.fullName = fullName;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return String.format("{id:%s, fullName:%s, email:%s}", id, fullName, email);
	}
	
	public String getId() {
		return id;
	}	
	public void setId(String id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
