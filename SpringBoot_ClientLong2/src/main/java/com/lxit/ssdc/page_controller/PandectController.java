package com.lxit.ssdc.page_controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.ssdc.server_controller.PandectService;

@Controller
public class PandectController {

	@Resource
	PandectService pandectService;
	
	@ResponseBody
	@RequestMapping(value="/getPandect")
	public Map<String,Object> getPandect(@RequestParam(name="contiding",required=false) String contiding){
		System.out.println(contiding);
		return pandectService.getProjects(contiding);
	}
	
	@RequestMapping("/clusterPandect")
	public void clusterPandect(){};

}
