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
	
	@ResponseBody
	@RequestMapping("/getClusterPlan")
	public Map<String,Object> getClusterPlan(@RequestParam("id") Integer id){
		return pandectService.getClu(id);
	}
	
	@RequestMapping("/planPandet")
	public void planPandet(){};
	
	@ResponseBody
	@RequestMapping("/getPlanPandet")
	public Map<String,Object> getPlanPandet(@RequestParam("id") Integer id){
		return pandectService.planPandect(id);
	}
	
	@ResponseBody
	@RequestMapping("/getNode")
	public Map<String,Object> getNode(@RequestParam("stage") String stage,@RequestParam("id") Integer id){
		System.out.println(stage);
		return pandectService.getNode(stage, id);
	}
	
	@RequestMapping("/nodePandect")
	public void nodePandect(){}
	
	@ResponseBody
	@RequestMapping("/getCommentPandect")
	public Map<String,Object> getCommentPandect(@RequestParam("id") Integer id ){
		return pandectService.getComment(id);
	}

}
