package com.lxit.sddc.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxit.sddc.bean.User;

@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.lxit.sddc.client.service"})
@RestController
public class FeignCotroller {

	@Autowired
	FeignService feignService;

	@RequestMapping("/hello")
	public User login(User user) {
		System.out.println(feignService.login(user));
		return feignService.login(user);
	}
}