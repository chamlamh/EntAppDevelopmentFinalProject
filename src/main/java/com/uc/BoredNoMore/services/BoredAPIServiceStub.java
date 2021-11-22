package com.uc.BoredNoMore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.uc.BoredNoMore.dao.IBoredAPIService;
import com.uc.BoredNoMore.dto.ActivityDTO;
/**
 * I'm aware that this is more of a controller, however it makes more sense to be included in the microservice layer
 * @author Brad
 *
 */
@RestController
@RequestMapping("/bored")
public class BoredAPIServiceStub implements IBoredAPIService{
	
	@Autowired
	private RestTemplate restTemplate;

	/**
	 * returns a random activity from the bored api
	 */
	@RequestMapping("/random")
	@Override
	public ActivityDTO getRandomActivity() {
		ActivityDTO activity = restTemplate.getForObject("http://www.boredapi.com/api/activity/", ActivityDTO.class);
		return activity;
	}
	

}
