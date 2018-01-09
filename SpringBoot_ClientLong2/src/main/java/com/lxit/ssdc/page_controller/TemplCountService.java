package com.lxit.ssdc.page_controller;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.sddc.bean.Dictionaries;
import com.lxit.sddc.bean.Template;
import com.lxit.sddc.bean.TemplateNode;

@Component
// 指定eureka客戶端的服务器名称
@FeignClient("Ltt")
public interface TemplCountService {
	/**
	 * 查询模板列表
	 * 
	 * @param templateType
	 * @param templatecial
	 * @param templateState
	 * @return
	 */
	@RequestMapping(value = "LttController/templ", method = RequestMethod.POST)
	@ResponseBody
	public List<Template> templ(@RequestBody Template template);

	/**
	 * 查询模板类型
	 * 
	 * @return
	 */
	@RequestMapping(value = "LttController/disType", method = RequestMethod.POST)
	@ResponseBody
	public List<Dictionaries> disType();

	/**
	 * 查询模板业态
	 * 
	 * @return
	 */
	@RequestMapping(value = "LttController/disCommercial", method = RequestMethod.POST)
	@ResponseBody
	public List<Dictionaries> disCommercial();

	/**
	 * 查询模板状态
	 * 
	 * @return
	 */
	@RequestMapping(value = "LttController/disStart", method = RequestMethod.POST)
	@ResponseBody
	public List<Dictionaries> disStart();

	@RequestMapping(value = "LttController/isses", method = RequestMethod.POST)
	@ResponseBody
	public boolean isses(@RequestBody Integer id);

	/**
	 * 模板下线
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "LttController/showing", method = RequestMethod.POST)
	@ResponseBody
	public boolean showing(@RequestBody Integer id);

	/**
	 * 模板上线
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "LttController/theaters", method = RequestMethod.POST)
	@ResponseBody
	public boolean theaters(@RequestBody Integer id);

	/**
	 * 查询模板信息
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "LttController/showingmb", method = RequestMethod.POST)
	@ResponseBody
	public Template showingmb(@RequestBody Integer id);

	/**
	 * 查询模板节点信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "LttController/mbnodemessage", method = RequestMethod.POST)
	@ResponseBody
	public List<TemplateNode> mbnodemessage(@RequestBody Integer id);
}