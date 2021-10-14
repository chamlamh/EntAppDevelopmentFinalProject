package com.uc.BoredNoMore.controllers;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@PostConstruct
	private void loadData() {
		//this is where we would potentially get auth information in the future.
		
		//with the user information, we can pull in data regarding todo list and custom activities
	}
	
	/**
	 * 
	 * @return the home screen template
	 */
	@GetMapping("/")
	public String getHome() {
		return "index";
	}
	
	/**
	 * 
	 * @return The template for finding activities
	 */
	@GetMapping("/activity")
	public String getActivities() {
		return "activities";
	}
	
	/**
	 * 
	 * @return The template for adding custom activities
	 */
	@GetMapping("/addactivity")
	public String getAddActivity() {
		return "addactivity";
	}
	
	/**
	 * 
	 * @return The template for viewing and managing the Todo list
	 */
	@GetMapping("/todo")
	public String getTodo() {
		return "todo";
	}
	
}
