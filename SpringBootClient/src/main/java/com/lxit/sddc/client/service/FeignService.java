package com.lxit.sddc.client.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
// 指定eureka客戶端的服务器名称
@FeignClient("Ltt")
public interface FeignService {
	// 获取上方指定服务器名的地址加请求地址如：/long/say
	@RequestMapping(value = "/LttController/login", method = RequestMethod.POST)
	public String login();
}