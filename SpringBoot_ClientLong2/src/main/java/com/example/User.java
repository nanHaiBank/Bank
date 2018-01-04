package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class User {

	@RequestMapping("/add")
	public String add(){
		return "首页";
	}

}
