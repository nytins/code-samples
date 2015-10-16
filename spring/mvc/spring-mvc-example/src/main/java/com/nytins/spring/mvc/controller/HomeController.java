package com.nytins.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nytins.spring.mvc.service.NameService;

@Controller
public class HomeController {
	
	@Autowired
	private NameService nameService;
	
	@RequestMapping("/")
	public String homePage(ModelMap model) {
		model.addAttribute("name", nameService.getName());
		return "home";
	}
}
