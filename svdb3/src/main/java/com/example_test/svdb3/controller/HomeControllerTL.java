package com.example_test.svdb3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example_test.svdb3.data.Data;
import com.example_test.svdb3.service.HomeService;

@Controller
public class HomeControllerTL {

	HomeService homeService;
	
	public HomeControllerTL(HomeService homeService) {
		this.homeService = homeService;
	}
	
	@GetMapping("helloTL")
	public String getHelloTL(Model model) {
		model.addAttribute("stringAAfficher", "MOI");
		return "test";
	}
	
	
	@GetMapping("form")
	public String getForm(Model model) {
		return "form";
	}
	
	@PostMapping("submit")
	public String postForm(Model model,
			@RequestParam String name) {
		homeService.addToList(name);
		model.addAttribute("listeAAfficher",
				homeService.getList());
		return "formPost";
	}
	
}
