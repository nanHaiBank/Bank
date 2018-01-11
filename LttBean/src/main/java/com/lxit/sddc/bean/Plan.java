package com.lxit.sddc.bean;

/**
 * 计划表
 * 
 * @author LongShao
 *
 */
public class Plan {
	int id;// 计划Id

	String name;// 计划名称

	int templateId;// 模板Id

	int planCommercial;// 计划业态

	int exploitPeriod;// 开发周期

	String securitDate;//摘牌日
	
	String commercialDate;//开工日
	
	String planType;//计划类型
		
	String planStateKey;//计划状态

	String saleDate;// 开售日

	String buildingDate;// 交楼日

	int clusterId;// 组团Id

	int createdBy;// 创建人

	String createdDate;// 创建日期

	int lastUpdatedBy;// 最后修改人

	String lastUpdateDate;// 最后修改日期

	String remark;// 备注

	int green;//计划中绿灯
	int red;//计划中的红灯
	
	String projectName;//项目名称
	
	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public String getPlanStateKey() {
		return planStateKey;
	}

	public void setPlanStateKey(String planStateKey) {
		this.planStateKey = planStateKey;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTemplateId() {
		return templateId;
	}

	public void setTemplateId(int templateId) {
		this.templateId = templateId;
	}

	public int getPlanCommercial() {
		return planCommercial;
	}

	public void setPlanCommercial(int planCommercial) {
		this.planCommercial = planCommercial;
	}

	public int getExploitPeriod() {
		return exploitPeriod;
	}

	public void setExploitPeriod(int exploitPeriod) {
		this.exploitPeriod = exploitPeriod;
	}

	public String getSecuritDate() {
		return securitDate;
	}

	public void setSecuritDate(String securitDate) {
		this.securitDate = securitDate;
	}


	public String getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(String saleDate) {
		this.saleDate = saleDate;
	}

	public String getBuildingDate() {
		return buildingDate;
	}

	public void setBuildingDate(String buildingDate) {
		this.buildingDate = buildingDate;
	}

	public int getClusterId() {
		return clusterId;
	}

	public void setClusterId(int clusterId) {
		this.clusterId = clusterId;
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

	public Plan() {
		super();
	}

	public String getCommercialDate() {
		return commercialDate;
	}

	public void setCommercialDate(String commercialDate) {
		this.commercialDate = commercialDate;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	


}