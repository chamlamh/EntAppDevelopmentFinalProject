package com.uc.BoredNoMore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.uc.BoredNoMore.dao.IBoredAPIService;
import com.uc.BoredNoMore.dto.ActivityDTO;
/**
 * I'm aware that this is more of a controller, however it makes more sense to be included in the microservice layer
 * @author Brad
 *
 */
@RestController
@RequestMapping("/bored")
public class BoredAPIRestController implements IBoredAPIService{
	
	@Autowired
	private RestTemplate restTemplate;

	/**
	 * returns a random activity from the bored api and fills out an activity creation view
	 */
	@RequestMapping("/random")
	@Override
	public ModelAndView getRandomActivity() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("addactivity");
		ActivityDTO activity = restTemplate.getForObject("http://www.boredapi.com/api/activity/", ActivityDTO.class);
		modelAndView.addObject("activity", activity);
		return modelAndView;
	}
	

}
