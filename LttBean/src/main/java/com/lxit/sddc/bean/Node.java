﻿package com.lxit.sddc.bean;

import java.util.List;

/**
 * 节点表
 * 
 * @author LongShao
 *
 */
public class Node {
	int id;// 主键

	int planId;// 计划Id

	int number;// 序号

	int rank;// 级别

	String stage;// 阶段

	String businessMatter;// 业务事项

	String nodeDate;// 节点日期

	int period;// 周期

	String planIdOk;// 计划完成日期

	int sponsorDeptId;// 开发部门(公司部门中间表Id)

	int receptionDeptId;// 接收部门(公司部门中间表Id)

	String assessState;// 考核状态,是否考核（数据字典Id）

	String assessStop;// 是否启用 

	int createdBy;// 创建人

	String createdDate;// 创建日期

	int lastUpdatedBy;// 最后修改人

	String lastUpdateDate;// 最后修改日期

	String remark;// 备注

	Task tasks;
	
	List<Comment> comments;//评论操作表 
	
	String planName;
	
	String faceCompTime;//实际完成日期
	
	String rname;//接收
	
	String tname;//发布
	
	

	
	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getFaceCompTime() {
		return faceCompTime;
	}

	public void setFaceCompTime(String faceCompTime) {
		this.faceCompTime = faceCompTime;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public Task getTasks() {
		return tasks;
	}

	public void setTasks(Task tasks) {
		this.tasks = tasks;
	}
	String deptName;//发起岗位名称
	
	private int taskId;//任务id
	
	private String sendname;//发生部门
	
	private String takename;//接受部门

	private String planIDate;//计划完成日期
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getBusinessMatter() {
		return businessMatter;
	}

	public void setBusinessMatter(String businessMatter) {
		this.businessMatter = businessMatter;
	}

	public String getNodeDate() {
		return nodeDate;
	}

	public void setNodeDate(String nodeDate) {
		this.nodeDate = nodeDate;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public String getPlanIdOk() {
		return planIdOk;
	}

	public void setPlanIdOk(String planIdOk) {
		this.planIdOk = planIdOk;
	}

	public int getSponsorDeptId() {
		return sponsorDeptId;
	}

	public void setSponsorDeptId(int sponsorDeptId) {
		this.sponsorDeptId = sponsorDeptId;
	}

	public int getReceptionDeptId() {
		return receptionDeptId;
	}

	public void setReceptionDeptId(int receptionDeptId) {
		this.receptionDeptId = receptionDeptId;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public int getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(int lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public String getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Node() {
		super();
	}

	public String getAssessState() {
		return assessState;
	}

	public void setAssessState(String assessState) {
		this.assessState = assessState;
	}

	public String getAssessStop() {
		return assessStop;
	}

	public void setAssessStop(String assessStop) {
		this.assessStop = assessStop;
	}


	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getSendname() {
		return sendname;
	}

	public void setSendname(String sendname) {
		this.sendname = sendname;
	}

	public String getTakename() {
		return takename;
	}

	public void setTakename(String takename) {
		this.takename = takename;
	}

	public String getPlanIDate() {
		return planIDate;
	}

	public void setPlanIDate(String planIDate) {
		this.planIDate = planIDate;
	}
	
	
	
}