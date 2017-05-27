package com.midasit.carte.statistics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.midasit.carte.statistics.mapper.StatisticsMapper;
import com.midasit.carte.statistics.model.StatisticsInfo;
import com.midasit.carte.statistics.model.StatisticsSearchParam;

@Service
public class StatisticsService {
	@Autowired
	private StatisticsMapper mapper;

	public List<StatisticsInfo> getStatisticsByUser(StatisticsSearchParam param) {
		return mapper.selectStatisticsByUser(param);
	}
}
