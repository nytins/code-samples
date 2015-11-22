package com.nytins.beanvalidation;

import javax.validation.constraints.Min;

public class Person {

	@Min(value=2, message="First name must be atleast 2 characters long.")
	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
