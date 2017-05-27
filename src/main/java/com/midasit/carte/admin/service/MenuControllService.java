package com.midasit.carte.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.midasit.carte.admin.mapper.MenuMapper;
import com.midasit.carte.admin.model.MenuInfo;
import com.midasit.carte.admin.model.MenuSearchParam;

@Service
public class MenuControllService {
	@Autowired
	private MenuMapper mapper;

	public List<MenuInfo> getMenuList(MenuSearchParam param) {
		return mapper.selectMenuInfo(param);
	}
}
