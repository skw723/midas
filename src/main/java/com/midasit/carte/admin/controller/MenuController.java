package com.midasit.carte.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.midasit.carte.admin.model.MenuInfo;
import com.midasit.carte.admin.model.MenuSearchParam;
import com.midasit.carte.admin.service.MenuControllService;

@RestController
public class MenuController {
	@Autowired
	private MenuControllService service;

	@RequestMapping("getMenuList")
	public List<MenuInfo> getMenuList(MenuSearchParam param) {
		return service.getMenuList(param);
	}
}
