package com.midasit.carte.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.midasit.carte.common.model.LoginUserDetails;
import com.midasit.carte.common.model.UserInfo;

@Service
public class LoginUserDetailsService implements UserDetailsService {
	@Autowired
	private UserInfoService userInfoService;

	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		UserInfo userInfo = userInfoService.getUserInfo(userId);
		return new LoginUserDetails(userInfo.getUserId(), userInfo.getPassword(), AuthorityUtils.createAuthorityList(userInfo.getRoleName()));
	}
}
