package com.yellotech.TestingSpringBoot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	//localhost:8080
	@GetMapping("/")
	public String index() {
		System.out.println("MY Frist Spring Application ");
		return "index.html";
	}
	
	@RequestMapping("/edu") // mvc
	public String myEdu() {
		return "education.html";
	}
	
	
}
