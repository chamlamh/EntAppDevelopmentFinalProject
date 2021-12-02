package com.uc.BoredNoMore.dao;

import java.util.ArrayList;

import com.uc.BoredNoMore.dto.ActivityDTO;
import com.uc.BoredNoMore.dto.TodoDTO;

/**
 * Add,Delete, and Get activity lists from database calls here
 * @author Xavier Baszuk
 *
 */
public interface IActivityDAO {

	/**
	 * Add activity to database
	 * @return void
	 */
	void saveActivity(ActivityDTO activity);
	
	/**
	 * Delete activity from database
	 * @return void
	 */
	void deleteActivity(int id);
	
	/**
	 * Get activity from database with list
	 * @return ActivityDTO list
	 */
	ArrayList<ActivityDTO> getActivities();
	
	/**
	 * 
	 * @param id id of the activity record
	 * @return A single activity that has a given ID
	 */
	ActivityDTO getActivityByID(int id);

	/**
	 * Marks an activity as finished.
	 * @param id of the activity to mark as finished
	 */
	void finishActivity(int id);
	
}

