package com.uc.BoredNoMore.controllers;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.uc.BoredNoMore.dao.IActivityDAO;
import com.uc.BoredNoMore.dto.*;

@Controller
@RequestMapping("")
public class MainController {
	
	private IActivityDAO activityService;
	public MainController(IActivityDAO activityService) {
		this.activityService = activityService;
	}

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
	 * @return The template for finding activities
	 */
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	/**
	 * 
	 * @return The template for finding activities
	 */
	@GetMapping("/createaccount")
	public String createaccount() {
		return "createaccount";
	}
	
	/**
	 * 
	 * @return The template for adding custom activities
	 */
	@GetMapping("/addactivity")
	public String getAddActivity(Model model) {
		ActivityDTO activity = new ActivityDTO();
		model.addAttribute("activity", activity);
		return "addactivity";
	}
	
	/**
	 * Post the activity to the database and return to the activities page
	 * @return void
	 */
	@PostMapping("/addactivity")
	public String postAddActivity(@ModelAttribute("activity") ActivityDTO activity, RedirectAttributes redirectAttributes) {
		//TODO: Instantiate IActivityDAO and call ActivityDAO.addActivity(activity); to save to database
		this.activityService.saveActivity(activity);
		redirectAttributes.addFlashAttribute("message", "You successfully uploaded the activity" + activity.getActivity() + "!");
		return "redirect:/todo";
	}
	
	/**
	 * 
	 * @return The template for viewing and managing the Todo list
	 */
	@GetMapping("/todo")
	public String getTodo(Model todoListModel) {
		
		List<ActivityDTO> todo = activityService.getActivities();
		todoListModel.addAttribute("todoList", todo);
		return "todo";
	}
	
	@GetMapping("/updateActivity")
	public String viewUpdateForm(@RequestParam("activityId") int theID, Model theModel) 
	{
		ActivityDTO theActivity = activityService.getActivityByID(theID);
		theModel.addAttribute("myActivity", theActivity);
		return "/updateActivity";
		
	}
	
	@PostMapping("/save")
	public String saveActivity(@ModelAttribute("myActivity") ActivityDTO activity, RedirectAttributes redirectAttributes) {
		//TODO: Instantiate IActivityDAO and call ActivityDAO.addActivity(activity); to save to database
		this.activityService.saveActivity(activity);
		redirectAttributes.addFlashAttribute("message", "You successfully uploaded the activity" + activity.getActivity() + "!");
		return "redirect:/todo";
	}
	
	@GetMapping("/delete")
	public String deleteFaculty(@RequestParam("activity")int id) {
		activityService.deleteActivity(id);
		return "redirect:/todo";
	}
	
}
