package com.midasit.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.midasit.sample.mapper.TestMapper;

@Controller
public class TestController {
	@Autowired
	private TestMapper mapper;

	@RequestMapping(value = {"", "/", "index"})
	public String index() {
		return "index";
	}

	@RequestMapping("/get/{id}")
	@ResponseBody
	@Secured("ROLE_R1")
	public String get(@PathVariable long id) {
		return mapper.selectValue(id);
	}

	@RequestMapping("/get2/{id}")
	@ResponseBody
	@Secured("ROLE_R2")
	public String get2(@PathVariable long id) {
		return mapper.selectValue(id);
	}
	
	@RequestMapping("/denied")
	public String denied() {
		return "denied";
	}
}
