package com.lxit.ssdc;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whalin.MemCached.MemCachedClient;


@Controller
public class User {

	@Resource
	MemCachedClient  memCachedClient;
	
	@RequestMapping("/add")
	public String add(){
		memCachedClient.set("123", 321);
		Integer str = (Integer) memCachedClient.get("123");
		System.out.println(str);
		return "首页";
	}

}
