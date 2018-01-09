package com.lxit.sddc.bean;

/**
 * ģ��ڵ��
 * 
 * @author LongShao
 *
 */
public class TemplateNode {
	int id;// ģ��ڵ�Id

	int tempateId;// ģ��Id

	int nodeNumber;// ���

	int rank;// ����

	String stage;// �׶�

	String businessMatter;// ҵ������

	String planId;// �ƻ�Id

	String stateDate;// ��ʼ����

	int period;// ����

	String planIdOk;// �ڵ��������

	int sponDeptId;// ������(��˾�����м��Id)

	int recepDeptId;// ���ղ���(��˾�����м��Id)

	String assessState;// ����״̬,�Ƿ񿼺ˣ������ֵ�key��

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

	public int getTempateId() {
		return tempateId;
	}

	public void setTempateId(int tempateId) {
		this.tempateId = tempateId;
	}

	public int getNodeNumber() {
		return nodeNumber;
	}

	public void setNodeNumber(int nodeNumber) {
		this.nodeNumber = nodeNumber;
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

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getStateDate() {
		return stateDate;
	}

	public void setStateDate(String stateDate) {
		this.stateDate = stateDate;
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

	public int getSponDeptId() {
		return sponDeptId;
	}

	public void setSponDeptId(int sponDeptId) {
		this.sponDeptId = sponDeptId;
	}

	public int getRecepDeptId() {
		return recepDeptId;
	}

	public void setRecepDeptId(int recepDeptId) {
		this.recepDeptId = recepDeptId;
	}

	public String getAssessState() {
		return assessState;
	}

	public void setAssessState(String assessState) {
		this.assessState = assessState;
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

	public TemplateNode(int id, int tempateId, int nodeNumber, int rank, String stage, String businessMatter,
			String planId, String stateDate, int period, String planIdOk, int sponDeptId, int recepDeptId,
			String assessState, int assessStop, int createdBy, String createdDate, int lastUpdatedBy,
			String lastUpdateDate, String remark) {
		super();
		this.id = id;
		this.tempateId = tempateId;
		this.nodeNumber = nodeNumber;
		this.rank = rank;
		this.stage = stage;
		this.businessMatter = businessMatter;
		this.planId = planId;
		this.stateDate = stateDate;
		this.period = period;
		this.planIdOk = planIdOk;
		this.sponDeptId = sponDeptId;
		this.recepDeptId = recepDeptId;
		this.assessState = assessState;
		this.assessStop = assessStop;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.remark = remark;
	}

	public TemplateNode() {
		super();
	}

	@Override
	public String toString() {
		return "TemplateNode [id=" + id + ", tempateId=" + tempateId + ", nodeNumber=" + nodeNumber + ", rank=" + rank
				+ ", stage=" + stage + ", businessMatter=" + businessMatter + ", planId=" + planId + ", stateDate="
				+ stateDate + ", period=" + period + ", planIdOk=" + planIdOk + ", sponDeptId=" + sponDeptId
				+ ", recepDeptId=" + recepDeptId + ", assessState=" + assessState + ", assessStop=" + assessStop
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", lastUpdatedBy=" + lastUpdatedBy
				+ ", lastUpdateDate=" + lastUpdateDate + ", remark=" + remark + "]";
	}
}