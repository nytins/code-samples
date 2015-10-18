package com.nytins.spring.rest.client;

import org.springframework.web.client.RestTemplate;

import com.nytins.spring.rest.model.User;

public class RestClient {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		
		User user = new User("neetus", "Nithin", "nytins@gmail.com");
		
//		restTemplate.postForObject("http://localhost:8080/spring-rest-example/users", user,	User.class);
		restTemplate.put("http://localhost:8080/spring-rest-example/users/ammoos", user, User.class);
		
		user = restTemplate.getForObject("http://localhost:8080/spring-rest-example/users/ammoos", User.class);
		
		System.out.println(user);
	}
}
