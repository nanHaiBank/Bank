package com.lxit.ssdc.server_controller;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
//指定eureka客戶端的服务器名称
@FeignClient("tangjian")
public interface PandectService {
	
	@RequestMapping(value="/getProjects", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> getProjects(@RequestParam(name="contiding") String contiding);
	
	@RequestMapping(value="/clusterPandect", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> getClu(@RequestParam(name="id") Integer id);
	
	
	@RequestMapping("/planPandect")
	@ResponseBody
	public Map<String,Object> planPandect(@RequestParam(name="id")Integer id);
	
	@RequestMapping("/getNodes")
	@ResponseBody
	public Map<String,Object> getNode(@RequestParam("stage") String stage,@RequestParam("id") Integer id);
	
	@RequestMapping("/getComment")
	@ResponseBody
	public Map<String,Object> getComment(@RequestParam("id") Integer id);
     
}
