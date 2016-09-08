package com.rabbit.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

	@RequestMapping("/index")
	public String index(ModelMap map){
		map.addAttribute("host", "http://blog.didispace.com");
		return "index";
	}
	
}
