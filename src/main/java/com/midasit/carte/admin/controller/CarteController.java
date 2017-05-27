package com.midasit.carte.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.midasit.carte.admin.model.MenuInfo;
import com.midasit.carte.admin.service.CarteControllService;
import com.midasit.carte.common.model.CarteDetailInfo;
import com.midasit.carte.common.model.CarteInfo;
import com.midasit.carte.common.model.CarteSearchParam;

@RestController
@Secured("ROLE_ADMIN")
public class CarteController {
	@Autowired
	private CarteControllService service;

	@RequestMapping(value = "addCarte")
	public String addCarte(MenuInfo menu, CarteInfo carte, MultipartFile file) throws Exception {
		service.addCarte(menu, carte, file);
		return "success";
	}

	@RequestMapping(value = "modifyCarte")
	public String modifyCarte(MenuInfo menu, CarteInfo carte, MultipartFile file) throws Exception {
		service.modifyCarte(menu, carte, file);
		return "success";
	}

	@RequestMapping(value = "getCarte")
	public CarteDetailInfo getCarte(long carteId) {
		return service.getCarte(carteId);
	}

	@RequestMapping(value = "getCarteList")
	public List<CarteInfo> getCarteList(CarteSearchParam param) {
		return service.getCarteList(param);
	}

	@RequestMapping(value = "deleteCarte")
	public String deleteCarte(long carteId) {
		service.deleteCarte(carteId);
		return "success";
	}
}
