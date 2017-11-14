package com.easyfact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/easyfact")
public class WebController {

	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String Hello(){
		return "index";
		
	}
}
