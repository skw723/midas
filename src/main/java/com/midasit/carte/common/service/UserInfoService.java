package com.midasit.carte.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.midasit.carte.common.mapper.UserInfoMapper;
import com.midasit.carte.common.model.UserInfo;

@Service
public class UserInfoService {
	@Autowired
	private UserInfoMapper userInfoMapper;

	public UserInfo getUserInfo(String userId) {
		return userInfoMapper.selectUserInfo(userId);
	}
}
