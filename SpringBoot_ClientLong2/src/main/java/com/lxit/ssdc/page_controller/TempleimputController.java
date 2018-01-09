package com.lxit.ssdc.page_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.sddc.bean.Dictionaries;
import com.lxit.sddc.bean.Template;
import com.lxit.sddc.bean.TemplateNode;

@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.lxit.ssdc" })
@Controller
public class TempleimputController {

	@Autowired
	TemplCountService templCountService;

	/**
	 * 进入查看模板页面
	 * 
	 * @return
	 */
	@RequestMapping("/selectTempl")
	public String selectTempl() {
		return "selectTempl";
	}

	/**
	 * 进入模板导入页面
	 * 
	 * @return
	 */
	@RequestMapping("/templeimList")
	public String templeimList() {
		return "templeimList";
	}

	/**
	 * 模板导入操作
	 * 
	 * @param template
	 * @return
	 */
	@RequestMapping("/templCont")
	public Template templCont(Template template) {
		return template;
	}

	/**
	 * 进入模板列表页面
	 * 
	 * @return
	 */
	@RequestMapping("/Templeimput")
	public String Templeimput() {
		return "Templeimput";
	}

	/**
	 * 查询模板列表
	 * 
	 * @return
	 */
	@RequestMapping("/templ")
	@ResponseBody
	public List<Template> templ(Template template) {
		return templCountService.templ(template);
	}

	/**
	 * 查询模板类型
	 * 
	 * @return
	 */
	@RequestMapping("/disType")
	@ResponseBody
	public List<Dictionaries> disType() {
		return templCountService.disType();
	}

	/**
	 * 查询模板业态
	 * 
	 * @return
	 */
	@RequestMapping("/disCommercial")
	@ResponseBody
	public List<Dictionaries> disCommercial() {
		return templCountService.disCommercial();
	}

	/**
	 * 查询模板状态
	 * 
	 * @return
	 */
	@RequestMapping("/disStart")
	@ResponseBody
	public List<Dictionaries> disStart() {
		return templCountService.disStart();
	}

	/**
	 * 发布模板
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/isses")
	@ResponseBody
	public boolean isses(Integer id) {
		return templCountService.isses(id);
	}

	/**
	 * 模板下线
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/showing")
	@ResponseBody
	public boolean showing(Integer id) {
		return templCountService.showing(id);
	}

	/**
	 * 模板上线
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/theaters")
	@ResponseBody
	public boolean theaters(Integer id) {
		return templCountService.theaters(id);
	}

	/**
	 * 查询指定模板信息
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/showingmb")
	@ResponseBody
	public Template showingmb(Integer id) {
		return templCountService.showingmb(id);
	}

	/**
	 * 查询模板节点信息
	 * 
	 * @return
	 */
	@RequestMapping("/mbnodemessage")
	@ResponseBody
	public List<TemplateNode> mbnodemessage( Integer id) {
		return templCountService.mbnodemessage(id);
	}
}