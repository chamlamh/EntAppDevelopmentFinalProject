package com.uc.BoredNoMore.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uc.BoredNoMore.dto.ActivityDTO;


public interface ActivityRepo extends JpaRepository<ActivityDTO, Integer>{
	

}
