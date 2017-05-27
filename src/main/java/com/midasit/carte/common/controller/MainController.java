package com.midasit.carte.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping(value = { "", "/", "index" })
	public String main() {
		return "index";
	}
	
	@RequestMapping(value = "customLogin")
	public String login() {
		return "login/login";
	}
}
