package com.lxit.sddc.bean;

/**
 * 土地表
 * 
 * @author LongShao
 *
 */
public class Land {
	int id;// 土地Id
	String name;// 土地名称
	String landproJect;// 土地规划情况
	String landCurrent;// 土地开发现状
	String landArea;// 用地面积（万㎡）
	String landAreamu;// 用地面积（亩）

	String toleranceArea;// 计容面积
	String ratio;// 容积率
	String landDownIssue;// 土地遗留问题
	int createdBy;// 创建人
	String bhzutuan;// 包含组团

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

	public String getBhzutuan() {
		return bhzutuan;
	}

	public void setBhzutuan(String bhzutuan) {
		this.bhzutuan = bhzutuan;
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

	public Land(int id, String name, String landproJect, String landCurrent, String landArea, String landAreamu,
			String toleranceArea, String ratio, String landDownIssue, int createdBy, String bhzutuan,
			String createdDate, int lastUpdatedBy, String lastUpdateDate, String remark) {
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
		this.bhzutuan = bhzutuan;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.remark = remark;
	}

	public Land() {
		super();
	}

	@Override
	public String toString() {
		return "Land [id=" + id + ", name=" + name + ", landproJect=" + landproJect + ", landCurrent=" + landCurrent
				+ ", landArea=" + landArea + ", landAreamu=" + landAreamu + ", toleranceArea=" + toleranceArea
				+ ", ratio=" + ratio + ", landDownIssue=" + landDownIssue + ", createdBy=" + createdBy + ", bhzutuan="
				+ bhzutuan + ", createdDate=" + createdDate + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdateDate="
				+ lastUpdateDate + ", remark=" + remark + "]";
	}
}