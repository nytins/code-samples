package com.nytins.spring.mvc.service;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nytins.spring.restmvc.model.User;

@Service
public class UserService {
	private static final String USER_SERVICE_URL = "http://localhost:7070/spring-rest-example/users";
	private RestTemplate restTemplate = new RestTemplate();
	
	public User getUser(String id) {
		return restTemplate.getForObject(USER_SERVICE_URL + "/" + id, User.class);
	}
	
	public Collection<User> getAllUsers() {
		User[] users = restTemplate.getForObject(USER_SERVICE_URL, User[].class);
		return Arrays.asList(users);
	}

	public void addUser(User user) {
		restTemplate.postForObject(USER_SERVICE_URL, user,	User.class);
	}

	public void updateUser(User user) {
		restTemplate.put(USER_SERVICE_URL + "/" + user.getId(), user, User.class);
	}
}
