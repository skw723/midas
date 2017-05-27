package com.midasit.carte.common.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.midasit.carte.common.model.UserInfo;

@Mapper
public interface ImageMapper {
	public UserInfo selectUserInfo(String userId);
}
