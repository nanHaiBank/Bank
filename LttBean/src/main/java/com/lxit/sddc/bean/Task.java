package com.lxit.sddc.bean;

/**
 * 任务表
 * 
 * @author LongShao
 *
 */
public class Task {
	int taskId;// 任务表Id

	int nodeType;// 任务类型(数据字典key)中期、到期、审核

	String businessMatter;// 业务事项

	int taskState;// 任务状态(数据字典key)待填报、审批中、已完成

	int nodeState;// 节点状态(数据字典key)红灯、黄灯、绿灯

	int warning;// 节点预警级别（数据字典key）一级、二级、三级预警

	String predictCompTime;//预计完成时间
	
	String faceCompTime;//实际完成时间
	
	int createdBy;// 创建人

	String createdDate;// 创建日期

	int lastUpdatedBy;// 最后修改人

	String lastUpdateDate;// 最后修改日期

	String remark;// 备注

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public int getNodeType() {
		return nodeType;
	}

	public void setNodeType(int nodeType) {
		this.nodeType = nodeType;
	}

	public String getBusinessMatter() {
		return businessMatter;
	}

	public void setBusinessMatter(String businessMatter) {
		this.businessMatter = businessMatter;
	}

	public int getTaskState() {
		return taskState;
	}

	public void setTaskState(int taskState) {
		this.taskState = taskState;
	}

	public int getNodeState() {
		return nodeState;
	}

	public void setNodeState(int nodeState) {
		this.nodeState = nodeState;
	}

	public int getWarning() {
		return warning;
	}

	public void setWarning(int warning) {
		this.warning = warning;
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

	public Task() {
		super();
	}

	public String getPredictCompTime() {
		return predictCompTime;
	}

	public void setPredictCompTime(String predictCompTime) {
		this.predictCompTime = predictCompTime;
	}

	public String getFaceCompTime() {
		return faceCompTime;
	}

	public void setFaceCompTime(String faceCompTime) {
		this.faceCompTime = faceCompTime;
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", nodeType=" + nodeType + ", businessMatter=" + businessMatter
				+ ", taskState=" + taskState + ", nodeState=" + nodeState + ", warning=" + warning
				+ ", predictCompTime=" + predictCompTime + ", faceCompTime=" + faceCompTime + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdateDate="
				+ lastUpdateDate + ", remark=" + remark + "]";
	}

	
}