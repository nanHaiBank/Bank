package com.lxit.sddc.bean;

/**
 * ���ر�
 * 
 * @author LongShao
 *
 */
public class Land {
	int id;// ����Id
	String name;// ��������
	String landproJect;// ���ع滮���
	String landCurrent;// ���ؿ�����״
	String landArea;// �õ��������O��
	String landAreamu;// �õ������Ķ��

	String toleranceArea;// �������
	String ratio;// �ݻ���
	String landDownIssue;// ������������
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLandproJect() {
		return landproJect;
	}

	public void setLandproJect(String landproJect) {
		this.landproJect = landproJect;
	}

	public String getLandCurrent() {
		return landCurrent;
	}

	public void setLandCurrent(String landCurrent) {
		this.landCurrent = landCurrent;
	}

	public String getLandArea() {
		return landArea;
	}

	public void setLandArea(String landArea) {
		this.landArea = landArea;
	}

	public String getLandAreamu() {
		return landAreamu;
	}

	public void setLandAreamu(String landAreamu) {
		this.landAreamu = landAreamu;
	}

	public String getToleranceArea() {
		return toleranceArea;
	}

	public void setToleranceArea(String toleranceArea) {
		this.toleranceArea = toleranceArea;
	}

	public String getRatio() {
		return ratio;
	}

	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

	public String getLandDownIssue() {
		return landDownIssue;
	}

	public void setLandDownIssue(String landDownIssue) {
		this.landDownIssue = landDownIssue;
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

	public Land() {
		super();
	}

	public Land(int id, String name, String landproJect, String landCurrent, String landArea, String landAreamu,
			String toleranceArea, String ratio, String landDownIssue, int createdBy, String createdDate,
			int lastUpdatedBy, String lastUpdateDate, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.landproJect = landproJect;
		this.landCurrent = landCurrent;
		this.landArea = landArea;
		this.landAreamu = landAreamu;
		this.toleranceArea = toleranceArea;
		this.ratio = ratio;
		this.landDownIssue = landDownIssue;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Land [id=" + id + ", name=" + name + ", landproJect=" + landproJect + ", landCurrent=" + landCurrent
				+ ", landArea=" + landArea + ", landAreamu=" + landAreamu + ", toleranceArea=" + toleranceArea
				+ ", ratio=" + ratio + ", landDownIssue=" + landDownIssue + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdateDate="
				+ lastUpdateDate + ", remark=" + remark + "]";
	}
}