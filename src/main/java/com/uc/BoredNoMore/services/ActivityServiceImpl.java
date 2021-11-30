package com.uc.BoredNoMore.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	public void saveActivity(ActivityDTO activity) {
		this.activityRepo.save(activity);
	}

	@Override
	public void deleteActivity(int id) {
		this.activityRepo.deleteById(id);
		
	}

	@Override
	public ArrayList<ActivityDTO> getActivities() {
		return (ArrayList<ActivityDTO>) activityRepo.findAll();
	}
	
	@Override
	public ActivityDTO getActivityByID(int id) {
		Optional<ActivityDTO> activityid =  activityRepo.findById(id);
		ActivityDTO myActivity = null;
		if(activityid.isPresent()) {
			myActivity = activityid.get();
		}
		else {
			throw new RuntimeException ("The activityID you've entered is invalid - " + id);
		}
		
		return myActivity;
	}
}
