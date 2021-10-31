package com.uc.BoredNoMore.controllers;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.uc.BoredNoMore.dto.*;

@Controller
@RequestMapping()
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
	public String getAddActivity(Model model) {
		model.addAttribute("activity", new ActivityDTO());
		return "addactivity";
	}
	
	/**
	 * Post the activity to the database and return to the activities page
	 * @return void
	 */
	@PostMapping("/addactivity")
	public String postAddActivity(@ModelAttribute ActivityDTO activity, RedirectAttributes redirectAttributes) {
		//TODO: Instantiate IActivityDAO and call ActivityDAO.addActivity(activity); to save to database
		redirectAttributes.addFlashAttribute("message", "You successfully uploaded the activity" + activity.getActivity() + "!");
		return "redirect:/activity";
	}
	
	/**
	 * 
	 * @return The template for viewing and managing the Todo list
	 */
	@GetMapping("/todo")
	public String getTodo() {
		return "todo";
	}
	
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	

	
}
