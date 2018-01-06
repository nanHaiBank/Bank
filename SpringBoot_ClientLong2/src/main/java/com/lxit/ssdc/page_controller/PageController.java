package com.lxit.ssdc.page_controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

	@RequestMapping("/index")
	public String add(){
		return "index";
	}
	
	@RequestMapping("/projectPandect")
	public void projectPandect(){};

}
