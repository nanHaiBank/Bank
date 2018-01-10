package com.lxit.ssdc.page_controller;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.sddc.bean.Certificate;
import com.lxit.sddc.bean.Cluster;
import com.lxit.sddc.bean.Dictionaries;
import com.lxit.sddc.bean.Land;
import com.lxit.sddc.bean.Project;

@Component
// 指定eureka客戶端的服务器名称
@FeignClient("Ltt")
public interface ProjectServices {
	/**
	 * 查询项目状态
	 * 
	 * @return
	 */
	@RequestMapping(value = "LttController/projectState", method = RequestMethod.POST)
	@ResponseBody
	public List<Dictionaries> projectState();

	/**
	 * 查询项目列表
	 * 
	 * @return
	 */
	@RequestMapping(value = "LttController/projectLists", method = RequestMethod.POST)
	@ResponseBody
	public List<Project> projectLists(@RequestBody Project project);

	/**
	 * 查询指定项目信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "LttController/onlyProject", method = RequestMethod.POST)
	@ResponseBody
	public Project onlyProject(@RequestBody Integer id);

	/**
	 * 查询项目下的土地
	 * 
	 * @return
	 */
	@RequestMapping(value = "LttController/landSelect", method = RequestMethod.POST)
	@ResponseBody
	public Land landSelect(@RequestBody Integer id);

	/**
	 * 查询土地下的组团
	 * 
	 * @return
	 */
	@RequestMapping(value = "LttController/zutuanSelect", method = RequestMethod.POST)
	@ResponseBody
	public Cluster zutuanSelect();

	/**
	 * 查询组团下的证照
	 * 
	 * @return
	 */
	@RequestMapping(value = "LttController/zhenzhaoSelect", method = RequestMethod.POST)
	@ResponseBody
	public Certificate zhenzhaoSelect();
}