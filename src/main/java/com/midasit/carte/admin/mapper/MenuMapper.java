package com.midasit.carte.admin.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.midasit.carte.admin.model.MenuInfo;

@Mapper
public interface MenuMapper {
	public void insertMenuInfo(MenuInfo menu);
	public void updateMenuInfo(MenuInfo menu);
}