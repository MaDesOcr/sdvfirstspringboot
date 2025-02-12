package com.example_test.svdb3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example_test.svdb3.service.HomeService;

@RestController
public class HomeController {

	/*@Autowired
	HomeService homeService;*/
	
	HomeService homeService;
	
	public HomeController(HomeService homeService) {
		this.homeService = homeService;
	}
	
	@GetMapping("/hello")
	public String hello() {
		return homeService.getHello();
	}
	
	@GetMapping("/hello2")
	public String hello(@RequestParam String s) {
		return homeService.getHello().concat(" " + s);
	}
	
}
