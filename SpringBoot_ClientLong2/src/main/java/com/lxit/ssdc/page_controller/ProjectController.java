package com.lxit.ssdc.page_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.sddc.bean.Dictionaries;
import com.lxit.sddc.bean.Project;

@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.lxit.ssdc" })
@Controller
public class ProjectController {

	@Autowired
	ProjectServices projectServices;

	/**
	 * 进入项目页面
	 * 
	 * @return
	 */
	@RequestMapping("/project")
	public String project() {
		return "project";
	}

	/**
	 * 进入项目列表页面
	 * 
	 * @return
	 */
	@RequestMapping("/projectList")
	public String projectList() {
		return "projectList";
	}

	/**
	 * 进入土地详情页面
	 * 
	 * @return
	 */
	@RequestMapping("/landparticulars")
	public String landparticulars() {
		return "landparticulars";
	}
	/**
	 * 进入项目信息页面
	 * 
	 * @return
	 */
	@RequestMapping("/projectxin")
	public String projectxin() {
		return "projectxin";
	}

	/**
	 * 创建项目
	 * 
	 * @param project
	 * @return
	 */
	@RequestMapping("/insertProject")
	@ResponseBody
	public boolean insertProject(Project project) {
		System.out.println(project);
		return true;
	}

	/**
	 * 查询项目状态
	 * 
	 * @return
	 */
	@RequestMapping("/projectState")
	@ResponseBody
	public List<Dictionaries> projectState() {
		return projectServices.projectState();
	}

	/**
	 * 查询项目列表
	 * 
	 * @return
	 */
	@RequestMapping("/projectLists")
	@ResponseBody
	public List<Project> projectLists(Project project) {
		System.out.println("===============-=-=-=-=-="+project);
		return projectServices.projectLists(project);
	}
}