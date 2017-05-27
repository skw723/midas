package com.midasit.carte.common.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.midasit.carte.common.model.UserInfo;

@Mapper
public interface UserInfoMapper {
	public UserInfo selectUserInfo(String userId);
}
