package com.midasit.sample.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
	public String selectValue(long id);
}
