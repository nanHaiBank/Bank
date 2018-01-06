package com.lxit.sddc.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.lxit.sddc.client.service"})
@Controller
public class FeignCotroller {

	@Autowired
	FeignService feignService;

	@RequestMapping("/hello")
	public String login() {
		return "index";
	}
}