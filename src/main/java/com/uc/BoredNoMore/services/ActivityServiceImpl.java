package com.uc.BoredNoMore.services;

import java.util.ArrayList;
import java.util.List;

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
	public void deleteActivity(ActivityDTO activity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<ActivityDTO> getActivities() {
		return (ArrayList<ActivityDTO>) activityRepo.findAll();
	}
	
	@Override
	public List<ActivityDTO> findAll() {
		// TODO Auto-generated method stub
		return activityRepo.findAllByOrderByLastNameAsc();
	}
}
