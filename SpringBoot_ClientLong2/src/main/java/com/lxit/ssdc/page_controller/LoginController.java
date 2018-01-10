package com.lxit.ssdc.page_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.sddc.bean.User;

@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.lxit.ssdc" })
@Controller
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/login")
	@ResponseBody
	public User login(User user) {
		return loginService.logins(user);
	}

	/**
	 * 跳转到首页
	 * 
	 * @return
	 */
	@RequestMapping("/home")
	public String homes() {
		return "home";
	}
}