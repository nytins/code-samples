package com.nytins.spring.rest.client;

import org.springframework.web.client.RestTemplate;

import com.nytins.spring.restmvc.model.User;

public class RestClient {
	private static final String USER_SERVICE_URL = "http://localhost:7070/spring-rest-example/users";
	
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		
		User user = new User("a", "a", "a@gmail.com");
//		restTemplate.postForObject(USER_SERVICE_URL, user,	User.class);
//		restTemplate.put(USER_SERVICE_URL + "/ammoos", user, User.class);
//		user = restTemplate.getForObject(USER_SERVICE_URL + "/a", User.class);

		User[] users = restTemplate.getForObject(USER_SERVICE_URL, User[].class);
		for (User u: users)
			System.out.println(u);
	}
}
	