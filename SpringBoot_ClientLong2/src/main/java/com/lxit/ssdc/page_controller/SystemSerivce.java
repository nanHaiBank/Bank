package com.lxit.ssdc.page_controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.sddc.bean.Jurisdiction;

@Component
// 指定eureka客戶端的服务器名称
@FeignClient("system-clientserver")
public interface SystemSerivce {
	//@RequestMapping(value = "/system/JurisdicionTree", method = RequestMethod.POST)
	@RequestMapping("/system/JurisdicionTree")
	@ResponseBody
	public List<Jurisdiction> JurisdicionTree(@RequestBody Map<String, Object> map);

}
