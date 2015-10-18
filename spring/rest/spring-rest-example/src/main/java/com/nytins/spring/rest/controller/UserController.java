package com.nytins.spring.rest.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nytins.spring.rest.model.User;
import com.nytins.spring.rest.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Inject
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public @ResponseBody User getUser(@PathVariable String id) {
		System.out.println("getUser - " + id);
		return userService.getUser(id);
	}
}
