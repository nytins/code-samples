package com.nytins.spring.mvc.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.nytins.spring.mvc.model.User;
import com.nytins.spring.mvc.service.UserService;

import mockit.Expectations;
import mockit.Mocked;
import mockit.Tested;
import mockit.Verifications;

public class UserControllerTest {
	
	@Mocked
	private UserService userService;
	
	@Mocked 
	private BindingResult bindingResult;
	
	@Tested
	private UserController userController;
	
	@Before
	public void setup() {
		userController = new UserController(userService);
	}

	//@Test
	public void shouldShowAllUsers(@Mocked final Model model) {
		assertEquals("users/all", userController.showAllUsers(model));
	}
	
	@Test
	public void addNewUserWhenErrorsPresent() {
		new Expectations() {{
			bindingResult.hasErrors(); result = true;
		}};
		
		String result = userController.addNewUser(new User(), bindingResult);
		assertEquals("users/edit", result);
		
		new Verifications() {{
			userService.addUser((User) any); times = 0;
		}};
	}
	
	@Test
	public void addNewUserWhenNoErrors() {
		final User user = new User("id", "name", "a@b.com");

		new Expectations() {{
			bindingResult.hasErrors(); result = false;
		}};
		
		String result = userController.addNewUser(user, bindingResult);
		assertEquals("redirect:/users", result);
		
		new Verifications() {{
			userService.addUser(user); times = 1;
		}};
	}
}
