package com.nytins.spring.rest.controller;

import java.util.Collection;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.nytins.spring.rest.service.UserService;
import com.nytins.spring.restmvc.model.User;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Inject
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Collection<User> getAllUsers() {
		System.out.println("getAllUsers");
		return userService.getAllUsers();
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void createUser(@RequestBody User user) {
		System.out.println("createUser - " + user);
		userService.addUser(user);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public @ResponseBody User getUser(@PathVariable String id) {
		System.out.println("getUser - " + id);
		return userService.getUser(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateUser(@PathVariable String id, @RequestBody User user) {
		System.out.printf("updateUser - id: %s, user: %s\n", id, user);
		userService.updateUser(id, user);
	}
}
