package com.nytins.spring.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class GreetingController {

	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String sayHello(@PathVariable String name, ModelMap model) {
		System.out.println("inside sayHello " + name);
		model.addAttribute("name", name);
		return "hello";
	}
}
