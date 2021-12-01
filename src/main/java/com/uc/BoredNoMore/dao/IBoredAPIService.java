package com.uc.BoredNoMore.dao;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.uc.BoredNoMore.dto.ActivityDTO;

/**
 * API calls from the Bored Api https://www.boredapi.com/
 * @author 
 *
 */
public interface IBoredAPIService {

	/**
	 * Fetch a random activity from the bored api
	 * @return ActivityDTO with random activity
	 */
	ModelAndView getRandomActivity();
	
}
