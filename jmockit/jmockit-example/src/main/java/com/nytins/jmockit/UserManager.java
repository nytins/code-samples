package com.nytins.jmockit;

public class UserManager {

	 private UserService userService;

	public UserManager(UserService userService) {
		this.userService = userService;
	}
	
	public UserManager() {
	}
	
	public static void main(String[] args) {
		UserManager userManager = new UserManager();
	}
}
