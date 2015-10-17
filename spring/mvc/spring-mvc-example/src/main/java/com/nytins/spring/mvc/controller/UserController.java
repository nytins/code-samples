package com.nytins.spring.mvc.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nytins.spring.mvc.model.User;
import com.nytins.spring.mvc.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Inject
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public String showAllUsers(Model model) {
		System.out.println("showAllUsers");
		model.addAttribute("allUsers", userService.getAllUsers());
		return "users/all";
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "new")
	public String newUser(Model model) {
		System.out.println("newUser");
		model.addAttribute("user", new User());
		return "users/edit";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String addNewUser(@Valid User user, BindingResult bindingResult) {
		System.out.println("addNewUser - " + user);

		if (bindingResult.hasErrors())
			return "users/edit";
		
		userService.addUser(user);
		return "redirect:/users";
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET, params = "edit")
	public String editUser(@PathVariable String id, Model model) {
		System.out.println("editUser - " + id);
		model.addAttribute("user", userService.getUser(id));
		return "users/edit";
	}

	@RequestMapping(value="/{id}", method = RequestMethod.POST, params = "edit")
	public String editUser(@Valid User user, BindingResult bindingResult) {
		System.out.println("editUser - " + user);

		if (bindingResult.hasErrors())
			return "users/edit";
		
		userService.addUser(user);
		return "redirect:/users";
	}
}
