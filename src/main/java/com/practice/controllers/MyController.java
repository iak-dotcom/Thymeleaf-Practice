package com.practice.controllers;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("name", "Imran Khan");
		model.addAttribute("currentDate", new Date().toLocaleString());
		System.out.println("inside about handler..");
		return "about";
	}

	// Handling Iteration
	@GetMapping("/example-loop")
	public String iterateHandler(Model model) {
		// create a list,set collection
		List<String> names = List.of("James", "John", "Jimmy", "Sam");
		model.addAttribute("names", names);
		return "iterate";
	}

	// Handler for conditional statements
	@GetMapping("/condition")
	public String conditionHandler(Model model) {
		model.addAttribute("isActive", false);
		model.addAttribute("gender", "F");
		System.out.println("Conditional Method Executed..");
		List<Integer> list = List.of(1232, 2, 32, 32);
		model.addAttribute("myList", list);
		return "condition";
	}

	//Handler for including fragments
	@GetMapping("/service")
	public String serviceHandler(Model model) {
		
	model.addAttribute("title", "This is dynamic value");
	model.addAttribute("subtitle", LocalDateTime.now().toString());
		return "service";
	}
	//For newAbout
	@GetMapping("/aboutnew")
	public String aboutNew() {
		return "aboutnew";
	}
	//For newAbout
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
}
