package com.uc.BoredNoMore.dao;

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
	void addActivity(ActivityDTO activity);
	
	/**
	 * Delete activity from database
	 * @return void
	 */
	void deleteActivity(ActivityDTO activity);
	
	/**
	 * Get activity from database with list
	 * @return ActivityDTO list
	 */
	ActivityDTO getActivities(TodoDTO todoList);
	
	
}
