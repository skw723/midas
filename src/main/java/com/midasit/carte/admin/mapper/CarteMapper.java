package com.midasit.carte.admin.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.midasit.carte.common.model.UserInfo;

@Mapper
public interface CarteMapper {
	public UserInfo selectUserInfo(String userId);
}
