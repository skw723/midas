package com.midasit.carte.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.midasit.carte.user.model.MealHistoryInfo;

@Mapper
public interface MealHistoryMapper {
	public void insertMealHistoryInfo(MealHistoryInfo history);
}
