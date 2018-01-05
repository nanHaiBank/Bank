package com.lxit.sddc.bean;

/**
 * 项目表
 * 
 * @author LongShao
 *
 */
public class Project {
	int id;// 项目Id

	String name;// 项目名称
	int companyId;// 公司Id
	String projectPhoto;// 项目图片
	int exploitPeriod;// 开发周期
	String landArea;// 用地面积（m2）
	String city;// 城市

	String ratio;// 容积率
	String landareamu;// 用地面积（亩）
	String tolerancearea;// 计容面积
	String floorArea;// 地上建筑面积

	String mayArea;// 可售计容面积
	String notManyArea;// 不售计容面积

	int parking;// 停车位
	String registerDate;// 登记日期
	int createdBy;// 创建人
	String createdDate;// 创建日期
	int lastUpdatedBy;// 最后修改人
	String lastUpdateDate;// 最后修改日期
	String remark;// 备注
	
	String completeDate; //实际完成时间
	

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

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getProjectPhoto() {
		return projectPhoto;
	}

	public void setProjectPhoto(String projectPhoto) {
		this.projectPhoto = projectPhoto;
	}

	public int getExploitPeriod() {
		return exploitPeriod;
	}

	public void setExploitPeriod(int exploitPeriod) {
		this.exploitPeriod = exploitPeriod;
	}

	public String getLandArea() {
		return landArea;
	}

	public void setLandArea(String landArea) {
		this.landArea = landArea;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRatio() {
		return ratio;
	}

	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

	public String getLandareamu() {
		return landareamu;
	}

	public void setLandareamu(String landareamu) {
		this.landareamu = landareamu;
	}

	public String getTolerancearea() {
		return tolerancearea;
	}

	public void setTolerancearea(String tolerancearea) {
		this.tolerancearea = tolerancearea;
	}

	public String getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(String floorArea) {
		this.floorArea = floorArea;
	}

	public String getMayArea() {
		return mayArea;
	}

	public void setMayArea(String mayArea) {
		this.mayArea = mayArea;
	}

	public String getNotManyArea() {
		return notManyArea;
	}

	public void setNotManyArea(String notManyArea) {
		this.notManyArea = notManyArea;
	}

	public int getParking() {
		return parking;
	}

	public void setParking(int parking) {
		this.parking = parking;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
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
	
	public String getCompleteDate() {
		return completeDate;
	}

	public void setCompleteDate(String completeDate) {
		this.completeDate = completeDate;
	}

	public Project() {
		super();
	}

	public Project(int id, String name, int companyId, String projectPhoto, int exploitPeriod, String landArea,
			String city, String ratio, String landareamu, String tolerancearea, String floorArea, String mayArea,
			String notManyArea, int parking, String registerDate, int createdBy, String createdDate, int lastUpdatedBy,
			String lastUpdateDate, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.companyId = companyId;
		this.projectPhoto = projectPhoto;
		this.exploitPeriod = exploitPeriod;
		this.landArea = landArea;
		this.city = city;
		this.ratio = ratio;
		this.landareamu = landareamu;
		this.tolerancearea = tolerancearea;
		this.floorArea = floorArea;
		this.mayArea = mayArea;
		this.notManyArea = notManyArea;
		this.parking = parking;
		this.registerDate = registerDate;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", companyId=" + companyId + ", projectPhoto=" + projectPhoto
				+ ", exploitPeriod=" + exploitPeriod + ", landArea=" + landArea + ", city=" + city + ", ratio=" + ratio
				+ ", landareamu=" + landareamu + ", tolerancearea=" + tolerancearea + ", floorArea=" + floorArea
				+ ", mayArea=" + mayArea + ", notManyArea=" + notManyArea + ", parking=" + parking + ", registerDate="
				+ registerDate + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", lastUpdatedBy="
				+ lastUpdatedBy + ", lastUpdateDate=" + lastUpdateDate + ", remark=" + remark + "]";
	}
}