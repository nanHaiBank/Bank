package com.lxit.sddc.bean;

/**
 * 计划表
 * 
 * @author LongShao
 *
 */
public class Plan {
	public Plan() {

	}

	int id;// 计划Id

	String name;// 计划名称

	int templateId;// 模板Id

	int planCommercial;// 计划业态

	int exploitPeriod;// 开发周期

	String securitDate;// 摘牌日

	String CommercialDate;// 开工日

	String planType;// 计划类型

	String planStateKey;// 计划状态

	String saleDate;// 开售日

	String buildingDate;// 交楼日

	int clusterId;// 组团Id

	int createdBy;// 创建人

	String createdDate;// 创建日期

	int lastUpdatedBy;// 最后修改人

	String lastUpdateDate;// 最后修改日期

	String remark;// 备注

	private String businessMatter;// 业务事项

	private int rank;// 节点级别

	private String nodeType;// 类别

	private String planIdOk;// 完成日期
	
	private int nid;//节点id
	
	private int taskId;//任务id
	

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

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public String getPlanStateKey() {
		return planStateKey;
	}

	public void setPlanStateKey(String planStateKey) {
		this.planStateKey = planStateKey;
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

	public String getBusinessMatter() {
		return businessMatter;
	}

	public void setBusinessMatter(String businessMatter) {
		this.businessMatter = businessMatter;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getNodeType() {
		return nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public String getPlanIdOk() {
		return planIdOk;
	}

	public void setPlanIdOk(String planIdOk) {
		this.planIdOk = planIdOk;
	}

	@Override
	public String toString() {
		return "Plan [id=" + id + ", name=" + name + ", templateId=" + templateId + ", planCommercial=" + planCommercial
				+ ", exploitPeriod=" + exploitPeriod + ", securitDate=" + securitDate + ", CommercialDate="
				+ CommercialDate + ", planType=" + planType + ", planStateKey=" + planStateKey + ", saleDate="
				+ saleDate + ", buildingDate=" + buildingDate + ", clusterId=" + clusterId + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdateDate="
				+ lastUpdateDate + ", remark=" + remark + ", businessMatter=" + businessMatter + ", rank=" + rank
				+ ", nodeType=" + nodeType + ", planIdOk=" + planIdOk + ", nid=" + nid + ", taskId=" + taskId + "]";
	}

	public Plan(int id, String name, int templateId, int planCommercial, int exploitPeriod, String securitDate,
			String commercialDate, String planType, String planStateKey, String saleDate, String buildingDate,
			int clusterId, int createdBy, String createdDate, int lastUpdatedBy, String lastUpdateDate, String remark,
			String businessMatter, int rank, String nodeType, String planIdOk) {
		super();
		this.id = id;
		this.name = name;
		this.templateId = templateId;
		this.planCommercial = planCommercial;
		this.exploitPeriod = exploitPeriod;
		this.securitDate = securitDate;
		CommercialDate = commercialDate;
		this.planType = planType;
		this.planStateKey = planStateKey;
		this.saleDate = saleDate;
		this.buildingDate = buildingDate;
		this.clusterId = clusterId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.remark = remark;
		this.businessMatter = businessMatter;
		this.rank = rank;
		this.nodeType = nodeType;
		this.planIdOk = planIdOk;
	}

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public Plan(int id, String name, int templateId, int planCommercial, int exploitPeriod, String securitDate,
			String commercialDate, String planType, String planStateKey, String saleDate, String buildingDate,
			int clusterId, int createdBy, String createdDate, int lastUpdatedBy, String lastUpdateDate, String remark,
			String businessMatter, int rank, String nodeType, String planIdOk, int nid, int taskId) {
		super();
		this.id = id;
		this.name = name;
		this.templateId = templateId;
		this.planCommercial = planCommercial;
		this.exploitPeriod = exploitPeriod;
		this.securitDate = securitDate;
		CommercialDate = commercialDate;
		this.planType = planType;
		this.planStateKey = planStateKey;
		this.saleDate = saleDate;
		this.buildingDate = buildingDate;
		this.clusterId = clusterId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.remark = remark;
		this.businessMatter = businessMatter;
		this.rank = rank;
		this.nodeType = nodeType;
		this.planIdOk = planIdOk;
		this.nid = nid;
		this.taskId = taskId;
	}
	

}