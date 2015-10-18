package com.nytins.spring.rest.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.nytins.spring.rest.model.User;

@Service
public class UserService {
	
	Map<String, User> users;
	
	public UserService() {
		createUsers();
	}

	private void createUsers() {
		users = new HashMap<>();
		User user;
		
		user = new User("ammoos", "Ammoos", "ammoos@gmail.com");
		users.put(user.getId(), user);

		user = new User("neetus", "Neetus", "neetus@gmail.com");
		users.put(user.getId(), user);
	}
	
	public User getUser(String id) {
		return users.get(id);
	}
	
	public Collection<User> getAllUsers() {
		return users.values();
	}

	public void addUser(User user) {
		users.put(user.getId(), user);
	}
}
