package com.midasit.carte.statistics.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.midasit.carte.statistics.model.StatisticsInfo;
import com.midasit.carte.statistics.model.StatisticsSearchParam;

@Mapper
public interface StatisticsMapper {
	public List<StatisticsInfo> selectStatisticsByUser(StatisticsSearchParam userId);
}
