package com.lxit.sddc.bean;

/**
 * 计划草稿表
 * 
 * @author LongShao
 *
 */
public class PlanDraft {
	int id;// 计划Id

	String name;// 计划名称
	int templateId;// 模板Id
	int planCommercial;// 计划业态
	int exploitPeriod;// 开发周期
	String securitDate;// 摘牌日
	String CommercialDate;// 开工日

	String saleDate;// 开售日
	String buildingDate;// 交楼日
	int clusterId;// 组团Id
	int createdBy;// 创建人
	String createdDate;// 创建日期

	int lastUpdatedBy;// 最后修改人
	String lastUpdateDate;// 最后修改日期
	String remark;// 备注

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

	public String getCommercialDate() {
		return CommercialDate;
	}

	public void setCommercialDate(String commercialDate) {
		CommercialDate = commercialDate;
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

	public PlanDraft() {
		super();
	}

	public PlanDraft(int id, String name, int templateId, int planCommercial, int exploitPeriod, String securitDate,
			String commercialDate, String saleDate, String buildingDate, int clusterId, int createdBy,
			String createdDate, int lastUpdatedBy, String lastUpdateDate, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.templateId = templateId;
		this.planCommercial = planCommercial;
		this.exploitPeriod = exploitPeriod;
		this.securitDate = securitDate;
		CommercialDate = commercialDate;
		this.saleDate = saleDate;
		this.buildingDate = buildingDate;
		this.clusterId = clusterId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "PlanDraft [id=" + id + ", name=" + name + ", templateId=" + templateId + ", planCommercial="
				+ planCommercial + ", exploitPeriod=" + exploitPeriod + ", securitDate=" + securitDate
				+ ", CommercialDate=" + CommercialDate + ", saleDate=" + saleDate + ", buildingDate=" + buildingDate
				+ ", clusterId=" + clusterId + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdateDate=" + lastUpdateDate + ", remark=" + remark
				+ "]";
	}
}