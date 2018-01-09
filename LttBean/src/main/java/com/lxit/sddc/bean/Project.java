package com.lxit.sddc.bean;

/**
 * ��Ŀ��
 * 
 * @author LongShao
 *
 */
public class Project {
	int id;// ��ĿId
	String name;// ��Ŀ����
	int companyId;// ��˾Id
	String projectPhoto;// ��ĿͼƬ
	int exploitPeriod;// ��������
	String landArea;// �õ������m2��
	String city;// ����
	String ratio;// �ݻ���
	String landareamu;// �õ������Ķ��
	String projectState;// ��Ŀ״̬
	String tolerancearea;// �������
	String floorArea;// ���Ͻ������

	String mayArea;// ���ۼ������
	String notManyArea;// ���ۼ������

	int parking;// ͣ��λ
	String registerDate;// �Ǽ�����
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

	public String getProjectState() {
		return projectState;
	}

	public void setProjectState(String projectState) {
		this.projectState = projectState;
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

	public Project(int id, String name, int companyId, String projectPhoto, int exploitPeriod, String landArea,
			String city, String ratio, String landareamu, String projectState, String tolerancearea, String floorArea,
			String mayArea, String notManyArea, int parking, String registerDate, int createdBy, String createdDate,
			int lastUpdatedBy, String lastUpdateDate, String remark) {
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
		this.projectState = projectState;
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

	public Project() {
		super();
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", companyId=" + companyId + ", projectPhoto=" + projectPhoto
				+ ", exploitPeriod=" + exploitPeriod + ", landArea=" + landArea + ", city=" + city + ", ratio=" + ratio
				+ ", landareamu=" + landareamu + ", projectState=" + projectState + ", tolerancearea=" + tolerancearea
				+ ", floorArea=" + floorArea + ", mayArea=" + mayArea + ", notManyArea=" + notManyArea + ", parking="
				+ parking + ", registerDate=" + registerDate + ", createdBy=" + createdBy + ", createdDate="
				+ createdDate + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdateDate=" + lastUpdateDate + ", remark="
				+ remark + "]";
	}
}