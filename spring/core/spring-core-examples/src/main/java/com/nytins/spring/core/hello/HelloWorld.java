package com.nytins.spring.core.hello;

public class HelloWorld {

	private String message;
	
	public HelloWorld(String message) {
		super();
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
