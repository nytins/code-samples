package com.nytins.spring.mvc.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nytins.spring.mvc.service.NameService;

@Controller
public class HomeController {
	
	@Inject
	private NameService nameService;
	
	@RequestMapping("/")
	public String homePage(ModelMap model) {
		model.addAttribute("name", nameService.getName());
		return "home";
	}
}
