package com.lxit.ssdc.page_controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lxit.sddc.bean.Jurisdiction;
import com.lxit.sddc.bean.User;

@RestController
public class SystemController {

	@Autowired
	SystemSerivce systemSerivce;
	
	@RequestMapping("/JurTree")
	@ResponseBody
	public List<Jurisdiction> JurisdicionTree(@RequestParam(value = "id", required = false) Integer id, HttpServletRequest request) {
		System.out.println("进来了");
		id = id == null ? 0 : id;
		User user = (User) request.getSession().getAttribute("user");
		System.out.println("$$$$$$$$userId========"+user);
		System.out.println("$$$$$$$$Id========"+id);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", 1);
		map.put("commandId", id);
		System.out.println("---------"+systemSerivce);
		List<Jurisdiction> list = systemSerivce.JurisdicionTree(map);
		for (Jurisdiction jurisdiction : list) {
			System.out.println("SystemController==============="+jurisdiction);
		}
		return list;
	}
}
