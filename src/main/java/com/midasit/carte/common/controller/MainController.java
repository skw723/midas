package com.midasit.carte.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping(value = { "", "/", "index" })
	public String main() {
		return "/main_menu/main_menu";
	}

	@RequestMapping(value = "customLogin")
	public String login() {
		return "/login/login";
	}

	@RequestMapping(value = "/denied")
	public String denied() {
		return "/denied";
	}
	
	@RequestMapping("carteMain")
	public String carteMain() {
		return "main_menu/calendar";
	}
}
