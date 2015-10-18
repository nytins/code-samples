package com.nytins.spring.rest.client;

import org.springframework.web.client.RestTemplate;

import com.nytins.spring.rest.model.User;

public class RestClient {

	public static void main(String[] args) {
		User user = new RestTemplate().getForObject("http://localhost:8080/spring-rest-example/users/ammoos", 
				User.class);
		System.out.println(user);
	}
}
