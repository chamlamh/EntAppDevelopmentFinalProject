package com.uc.BoredNoMore.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uc.BoredNoMore.dao.ActivityRepo;
import com.uc.BoredNoMore.dao.IActivityDAO;
import com.uc.BoredNoMore.dto.ActivityDTO;

@Service
public class ActivityServiceImpl implements IActivityDAO{
	
	private ActivityRepo activityRepo;
	
	@Autowired
	public ActivityServiceImpl (ActivityRepo activityRepo) {
		this.activityRepo = activityRepo;
	}

	@Override
	public void addActivity(ActivityDTO activity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteActivity(ActivityDTO activity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<ActivityDTO> getActivities() {
		return (ArrayList<ActivityDTO>) activityRepo.findAll();
	}

}
