package com.midasit.carte.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.midasit.carte.admin.model.MenuInfo;
import com.midasit.carte.admin.model.MenuSearchParam;

@Mapper
public interface MenuMapper {
	public void insertMenuInfo(MenuInfo menu);

	public void updateMenuInfo(MenuInfo menu);

	public List<MenuInfo> selectMenuInfo(MenuSearchParam param);
}