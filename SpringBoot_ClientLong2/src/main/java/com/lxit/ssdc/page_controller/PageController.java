package com.lxit.ssdc.page_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	/**
	 * 跳转到登陆页面
	 * 
	 * @return
	 */
	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	/**
	 * 跳转到首页
	 * 
	 * @return
	 */
	@RequestMapping("/homePage")
	public String homePage() {
		return "homePage";
	}
}