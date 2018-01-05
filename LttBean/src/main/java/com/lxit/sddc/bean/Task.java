package com.lxit.sddc.bean;

/**
 * �����
 * 
 * @author LongShao
 *
 */
public class Task {
	int taskId;// �����Id

	int nodeType;// ��������(�����ֵ�key)���ڡ����ڡ����

	String businessMatter;// ҵ������

	int taskState;// ����״̬(�����ֵ�key)����������С������

	int nodeState;// �ڵ�״̬(�����ֵ�key)��ơ��Ƶơ��̵�

	int warning;// �ڵ�Ԥ�����������ֵ�key��һ��������������Ԥ��

	String adjunct;// ����

	int createdBy;// ������

	String createdDate;// ��������

	int lastUpdatedBy;// ����޸���

	String lastUpdateDate;// ����޸�����

	String remark;// ��ע

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

	public String getAdjunct() {
		return adjunct;
	}

	public void setAdjunct(String adjunct) {
		this.adjunct = adjunct;
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

	public Task(int taskId, int nodeType, String businessMatter, int taskState, int nodeState, int warning,
			String adjunct, int createdBy, String createdDate, int lastUpdatedBy, String lastUpdateDate,
			String remark) {
		super();
		this.taskId = taskId;
		this.nodeType = nodeType;
		this.businessMatter = businessMatter;
		this.taskState = taskState;
		this.nodeState = nodeState;
		this.warning = warning;
		this.adjunct = adjunct;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", nodeType=" + nodeType + ", businessMatter=" + businessMatter
				+ ", taskState=" + taskState + ", nodeState=" + nodeState + ", warning=" + warning + ", adjunct="
				+ adjunct + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", lastUpdatedBy="
				+ lastUpdatedBy + ", lastUpdateDate=" + lastUpdateDate + ", remark=" + remark + "]";
	}
}