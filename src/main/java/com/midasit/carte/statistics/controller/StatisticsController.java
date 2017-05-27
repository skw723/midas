package com.midasit.carte.statistics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.midasit.carte.statistics.model.StatisticsInfo;
import com.midasit.carte.statistics.model.StatisticsSearchParam;
import com.midasit.carte.statistics.service.StatisticsService;

@RestController
public class StatisticsController {
	@Autowired
	private StatisticsService service;
	
	@RequestMapping(value = "statisticsByUser")
	public List<StatisticsInfo> statisticsByUser(StatisticsSearchParam param) {
		return service.getStatisticsByUser(param);
	}
}
