package com.midasit.carte.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.midasit.carte.admin.model.MenuInfo;
import com.midasit.carte.admin.service.CarteControllService;
import com.midasit.carte.common.model.CarteDetailInfo;
import com.midasit.carte.common.model.CarteInfo;
import com.midasit.carte.common.model.CarteSearchParam;

@Controller
public class CarteController {
	@Autowired
	private CarteControllService service;

	@RequestMapping(value = "addCarte")
	@ResponseBody
	@Secured("ROLE_ADMIN")
	public String addCarte(MenuInfo menu, CarteInfo carte, MultipartFile file) throws Exception {
		service.addCarte(menu, carte, file);
		return "success";
	}

	@RequestMapping(value = "modifyCarte")
	@ResponseBody
	@Secured("ROLE_ADMIN")
	public String modifyCarte(MenuInfo menu, CarteInfo carte, MultipartFile file) throws Exception {
		service.modifyCarte(menu, carte, file);
		return "success";
	}

	@RequestMapping(value = "getCarte")
	@ResponseBody
	public CarteDetailInfo getCarte(long carteId) {
		return service.getCarte(carteId);
	}

	@RequestMapping(value = "getCarteList")
	@ResponseBody
	public List<CarteInfo> getCarteList(CarteSearchParam param) {
		return service.getCarteList(param);
	}

	@RequestMapping(value = "deleteCarte")
	@ResponseBody
	@Secured("ROLE_ADMIN")
	public String deleteCarte(long carteId) {
		service.deleteCarte(carteId);
		return "success";
	}

	@RequestMapping(value = "addCarteForm")
	@Secured("ROLE_ADMIN")
	public String addCarteForm(HttpServletRequest req, String ymd) {
		req.setAttribute("ymd", ymd);
		return "carte/addCarteForm";
	}
	
	@RequestMapping(value = "carteView")
	@Secured("ROLE_ADMIN")
	public String carteView(@RequestParam("carteId") long carteId, ModelMap model) {
		model.addAttribute("carte", service.getCarte(carteId));
		return "carte/carteView";
	}
}
