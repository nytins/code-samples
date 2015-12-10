package com.nytins.spring.restmvc.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	
	@Size(min=2, message="ID must be atleast 2 characters")
	String id;
	
	@NotEmpty(message="Name must not be empty")
	String name;
	
	@Email(message="Invalid email address")
	String email;
	
	public User() { }

	public User(String id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return String.format("{id: %s, name: %s, email: %s}", id, name, email);
	}

}
