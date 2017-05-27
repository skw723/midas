package com.midasit.carte.admin.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.midasit.carte.admin.mapper.MenuMapper;
import com.midasit.carte.admin.model.MenuInfo;
import com.midasit.carte.common.mapper.CarteMapper;
import com.midasit.carte.common.mapper.ImageMapper;
import com.midasit.carte.common.model.CarteDetailInfo;
import com.midasit.carte.common.model.CarteInfo;
import com.midasit.carte.common.model.CarteSearchParam;
import com.midasit.carte.common.model.ImageInfo;

@Service
public class CarteControllService {
	@Autowired
	private MenuMapper menuMapper;
	@Autowired
	private ImageMapper imgMapper;
	@Autowired
	private CarteMapper carteMapper;

	@Transactional(rollbackFor = Exception.class)
	public void addCarte(MenuInfo menu, CarteInfo carte, MultipartFile file) throws Exception {
		addMenu(menu);
		addImage(file, menu.getMenuId());
		addCarte(carte, menu.getMenuId());
	}

	private void addMenu(MenuInfo menu) {
		menuMapper.insertMenuInfo(menu);
	}

	private void addCarte(CarteInfo carte, long menuId) {
		carte.setMenuId(menuId);
		carteMapper.insertCarteInfo(carte);
	}

	private void addImage(MultipartFile file, long menuId) throws Exception {
		if (file == null || file.getSize() == 0) {
			return;
		}
		File saveFile = new File("D:\\upload", file.getName() + menuId);
		file.transferTo(saveFile);
		ImageInfo image = new ImageInfo();
		image.setImgName(file.getName() + menuId);
		image.setImgPath(saveFile.getPath());
		image.setMenuId(menuId);
		imgMapper.insertImageInfo(image);
	}

	@Transactional(rollbackFor = Exception.class)
	public void modifyCarte(MenuInfo menu, CarteInfo carte, MultipartFile file) throws Exception {
		menuMapper.updateMenuInfo(menu);
		modifyAttachImage(file, menu.getMenuId());
	}

	private void modifyAttachImage(MultipartFile file, long menuId) throws Exception {
		if (file == null || file.getSize() == 0) {
			return;
		}
		imgMapper.deleteImageInfo(menuId);
		addImage(file, menuId);
	}

	public CarteDetailInfo getCarte(long carteId) {
		return carteMapper.selectCarteDetailInfo(carteId);
	}
	
	public List<CarteInfo> getCarteList(CarteSearchParam param) {
		return carteMapper.selectCarteInfoList(param);
	}
}