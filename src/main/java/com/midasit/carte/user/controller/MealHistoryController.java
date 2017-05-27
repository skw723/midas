package com.midasit.carte.user.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.midasit.carte.user.model.MealHistoryInfo;
import com.midasit.carte.user.service.MealHistoryControllService;

@RestController
public class MealHistoryController {
	@Autowired
	private MealHistoryControllService service;

	@RequestMapping(value = "addHistory")
	public String addHistory(Principal principal, MealHistoryInfo history) {
		service.addMealHistory(history, principal.getName());
		return "success";
	}
}
