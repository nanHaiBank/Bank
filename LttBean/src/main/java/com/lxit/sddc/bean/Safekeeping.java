package com.lxit.sddc.bean;

/**
 * 考核封存表
 * 
 * @author LongShao
 *
 */
public class Safekeeping {
	int id;// 考核封存Id

	int clusterId;// 组团Id

	String oneNumber;// 一级节点完成率

	String oneReadNumber;// 一级节点延期完成数

	String twoNumber;// 二级节点完成数

	String twoReadNumber;// 二级节点延期完成数

	String oneRate;// 一级预警

	String twoRate;// 二级预警

	String threeRate;// 三级预警

	String accomplish;// 总完成率

	String operationTime;// 操作时间

	int operationUser;// 操作人

	int lastName;// 最后修改人

	String lastTime;// 最后修改时间

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