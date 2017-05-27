package com.midasit.carte.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.midasit.carte.admin.model.MenuInfo;
import com.midasit.carte.admin.service.CarteControllService;

@RestController
@Secured("ROLE_ADMIN")
public class CarteController {
	@Autowired
	private CarteControllService service;

	@RequestMapping(value = "/carte", method = RequestMethod.POST)
	public String addCarte(MenuInfo menu, MultipartFile file) {
		service.addCarte(menu, file);
		return "";
	}
}
