package com.lxit.sddc.bean;

/**
 * �ڵ���ʷ��¼��
 * 
 * @author LongShao
 *
 */
public class NodeHistory {
	int id;// ����

	int nodeId;// �ڵ�Id

	int number;// ���

	int rank;// ����

	String stage;// �׶�

	String businessMatter;// ҵ������

	String nodeDate;// �ڵ��������

	int period;// ����

	String planIdOk;// �ƻ��������

	int sponsorDeptId;// ��������(��˾�����м��Id)

	int receptionDeptId;// ���ղ���(��˾�����м��Id)

	int assessState;// ����״̬,�Ƿ񿼺ˣ������ֵ�key��

	int alter;// ���״̬,������K���������ļƻ���ʷ��¼����

	int assessStop;// �Ƿ�����

	int createdBy;// ������

	String createdDate;// ��������

	int lastUpdatedBy;// ����޸���

	String lastUpdateDate;// ����޸�����

	String remark;// ��ע

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNodeId() {
		return nodeId;
	}

	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
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

	public int getAssessState() {
		return assessState;
	}

	public void setAssessState(int assessState) {
		this.assessState = assessState;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public int getAssessStop() {
		return assessStop;
	}

	public void setAssessStop(int assessStop) {
		this.assessStop = assessStop;
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

	public NodeHistory() {
		super();
	}

	public NodeHistory(int id, int nodeId, int number, int rank, String stage, String businessMatter, String nodeDate,
			int period, String planIdOk, int sponsorDeptId, int receptionDeptId, int assessState, int alter,
			int assessStop, int createdBy, String createdDate, int lastUpdatedBy, String lastUpdateDate,
			String remark) {
		super();
		this.id = id;
		this.nodeId = nodeId;
		this.number = number;
		this.rank = rank;
		this.stage = stage;
		this.businessMatter = businessMatter;
		this.nodeDate = nodeDate;
		this.period = period;
		this.planIdOk = planIdOk;
		this.sponsorDeptId = sponsorDeptId;
		this.receptionDeptId = receptionDeptId;
		this.assessState = assessState;
		this.alter = alter;
		this.assessStop = assessStop;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "NodeHistory [id=" + id + ", nodeId=" + nodeId + ", number=" + number + ", rank=" + rank + ", stage="
				+ stage + ", businessMatter=" + businessMatter + ", nodeDate=" + nodeDate + ", period=" + period
				+ ", planIdOk=" + planIdOk + ", sponsorDeptId=" + sponsorDeptId + ", receptionDeptId=" + receptionDeptId
				+ ", assessState=" + assessState + ", alter=" + alter + ", assessStop=" + assessStop + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdateDate="
				+ lastUpdateDate + ", remark=" + remark + "]";
	}
}