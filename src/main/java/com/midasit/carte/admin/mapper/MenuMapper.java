package com.midasit.carte.admin.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.midasit.carte.common.model.UserInfo;

@Mapper
public interface MenuMapper {
	public UserInfo selectUserInfo(String userId);
}
