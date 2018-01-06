package com.lxit.ssdc.page_controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.sddc.bean.User;

@Component
// 指定eureka客戶端的服务器名称
@FeignClient("Ltt")
public interface LoginService {
	// 获取上方指定服务器名的地址加请求地址如：/long/say
	@RequestMapping(value = "LttController/logins", method = RequestMethod.POST)
	@ResponseBody
	public User logins(@RequestBody() User user);
}