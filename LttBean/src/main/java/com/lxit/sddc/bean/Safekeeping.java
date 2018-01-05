package com.lxit.sddc.bean;

/**
 * ���˷���
 * 
 * @author LongShao
 *
 */
public class Safekeeping {
	int id;// ���˷��Id

	int clusterId;// ����Id

	String oneNumber;// һ���ڵ������

	String oneReadNumber;// һ���ڵ����������

	String twoNumber;// �����ڵ������

	String twoReadNumber;// �����ڵ����������

	String oneRate;// һ��Ԥ��

	String twoRate;// ����Ԥ��

	String threeRate;// ����Ԥ��

	String accomplish;// �������

	String operationTime;// ����ʱ��

	int operationUser;// ������

	int lastName;// ����޸���

	String lastTime;// ����޸�ʱ��

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

	public int getClusterId() {
		return clusterId;
	}

	public void setClusterId(int clusterId) {
		this.clusterId = clusterId;
	}

	public String getOneNumber() {
		return oneNumber;
	}

	public void setOneNumber(String oneNumber) {
		this.oneNumber = oneNumber;
	}

	public String getOneReadNumber() {
		return oneReadNumber;
	}

	public void setOneReadNumber(String oneReadNumber) {
		this.oneReadNumber = oneReadNumber;
	}

	public String getTwoNumber() {
		return twoNumber;
	}

	public void setTwoNumber(String twoNumber) {
		this.twoNumber = twoNumber;
	}

	public String getTwoReadNumber() {
		return twoReadNumber;
	}

	public void setTwoReadNumber(String twoReadNumber) {
		this.twoReadNumber = twoReadNumber;
	}

	public String getOneRate() {
		return oneRate;
	}

	public void setOneRate(String oneRate) {
		this.oneRate = oneRate;
	}

	public String getTwoRate() {
		return twoRate;
	}

	public void setTwoRate(String twoRate) {
		this.twoRate = twoRate;
	}

	public String getThreeRate() {
		return threeRate;
	}

	public void setThreeRate(String threeRate) {
		this.threeRate = threeRate;
	}

	public String getAccomplish() {
		return accomplish;
	}

	public void setAccomplish(String accomplish) {
		this.accomplish = accomplish;
	}

	public String getOperationTime() {
		return operationTime;
	}

	public void setOperationTime(String operationTime) {
		this.operationTime = operationTime;
	}

	public int getOperationUser() {
		return operationUser;
	}

	public void setOperationUser(int operationUser) {
		this.operationUser = operationUser;
	}

	public int getLastName() {
		return lastName;
	}

	public void setLastName(int lastName) {
		this.lastName = lastName;
	}

	public String getLastTime() {
		return lastTime;
	}

	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
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

	public Safekeeping() {
		super();
	}

	public Safekeeping(int id, int clusterId, String oneNumber, String oneReadNumber, String twoNumber,
			String twoReadNumber, String oneRate, String twoRate, String threeRate, String accomplish,
			String operationTime, int operationUser, int lastName, String lastTime, int createdBy, String createdDate,
			int lastUpdatedBy, String lastUpdateDate, String remark) {
		super();
		this.id = id;
		this.clusterId = clusterId;
		this.oneNumber = oneNumber;
		this.oneReadNumber = oneReadNumber;
		this.twoNumber = twoNumber;
		this.twoReadNumber = twoReadNumber;
		this.oneRate = oneRate;
		this.twoRate = twoRate;
		this.threeRate = threeRate;
		this.accomplish = accomplish;
		this.operationTime = operationTime;
		this.operationUser = operationUser;
		this.lastName = lastName;
		this.lastTime = lastTime;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Safekeeping [id=" + id + ", clusterId=" + clusterId + ", oneNumber=" + oneNumber + ", oneReadNumber="
				+ oneReadNumber + ", twoNumber=" + twoNumber + ", twoReadNumber=" + twoReadNumber + ", oneRate="
				+ oneRate + ", twoRate=" + twoRate + ", threeRate=" + threeRate + ", accomplish=" + accomplish
				+ ", operationTime=" + operationTime + ", operationUser=" + operationUser + ", lastName=" + lastName
				+ ", lastTime=" + lastTime + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdateDate=" + lastUpdateDate + ", remark=" + remark
				+ "]";
	}
}