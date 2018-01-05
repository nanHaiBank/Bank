package com.lxit.ssdc.page_controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whalin.MemCached.MemCachedClient;

@Controller
public class PageController {

	@RequestMapping("/index")
	public String add(){
		return "首页";
	}

}
