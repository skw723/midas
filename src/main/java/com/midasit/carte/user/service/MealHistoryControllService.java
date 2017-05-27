package com.midasit.carte.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.midasit.carte.user.mapper.MealHistoryMapper;
import com.midasit.carte.user.model.MealHistoryInfo;

@Service
public class MealHistoryControllService {
	@Autowired
	private MealHistoryMapper mealHistoryMapper; 
	
	public void addMealHistory(MealHistoryInfo history, String userId) {
		history.setUserId(userId);
		mealHistoryMapper.insertMealHistoryInfo(history);
	}
}
