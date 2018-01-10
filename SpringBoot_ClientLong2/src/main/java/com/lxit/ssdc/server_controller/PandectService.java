package com.lxit.ssdc.server_controller;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
//指定eureka客戶端的服务器名称
@FeignClient("tangjian")
public interface PandectService {
	
	@RequestMapping("/getProjects")
	@ResponseBody
	public Map<String,Object> getProjects(@RequestParam(name="contiding",required=false)String contiding);

     
}
