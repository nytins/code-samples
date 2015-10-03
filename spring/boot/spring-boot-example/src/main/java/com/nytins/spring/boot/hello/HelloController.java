package com.nytins.spring.boot.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World";
	}
	
	@RequestMapping("/user/{user}")
	@ResponseBody
	String greeting(@PathVariable String user) {
		return "Hello " + user;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloController.class, args);
	}
}