package com.lxit.sddc.bean;

/**
 * ���ű�
 * 
 * @author LongShao
 *
 */
public class Cluster {
	int id;// ����Id

	String name;// ��������

	int landId;// �����ؿ�����

	String landArea;// �õ��������O��

	String landareamu;// �õ������Ķ��

	String overgArea;// ���Ͻ����������O��

	String floorArea;// ���½����������O��

	String mayArea;// ���ۼ����������O��

	String notMayArea;// �����ۼ����������O��

	int equityStall;// ��Ȩ��λ������

	int useEquityStall;// ʹ��Ȩ��λ������

	String clusterMessage;// ����������Ϣ

	int towerNumber;// ¥����

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

	public int getLandId() {
		return landId;
	}

	public void setLandId(int landId) {
		this.landId = landId;
	}

	public String getLandArea() {
		return landArea;
	}

	public void setLandArea(String landArea) {
		this.landArea = landArea;
	}

	public String getLandareamu() {
		return landareamu;
	}

	public void setLandareamu(String landareamu) {
		this.landareamu = landareamu;
	}

	public String getOvergArea() {
		return overgArea;
	}

	public void setOvergArea(String overgArea) {
		this.overgArea = overgArea;
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

	public String getNotMayArea() {
		return notMayArea;
	}

	public void setNotMayArea(String notMayArea) {
		this.notMayArea = notMayArea;
	}

	public int getEquityStall() {
		return equityStall;
	}

	public void setEquityStall(int equityStall) {
		this.equityStall = equityStall;
	}

	public int getUseEquityStall() {
		return useEquityStall;
	}

	public void setUseEquityStall(int useEquityStall) {
		this.useEquityStall = useEquityStall;
	}

	public String getClusterMessage() {
		return clusterMessage;
	}

	public void setClusterMessage(String clusterMessage) {
		this.clusterMessage = clusterMessage;
	}

	public int getTowerNumber() {
		return towerNumber;
	}

	public void setTowerNumber(int towerNumber) {
		this.towerNumber = towerNumber;
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

	public Cluster() {
		super();
	}

	public Cluster(int id, String name, int landId, String landArea, String landareamu, String overgArea,
			String floorArea, String mayArea, String notMayArea, int equityStall, int useEquityStall,
			String clusterMessage, int towerNumber, int createdBy, String createdDate, int lastUpdatedBy,
			String lastUpdateDate, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.landId = landId;
		this.landArea = landArea;
		this.landareamu = landareamu;
		this.overgArea = overgArea;
		this.floorArea = floorArea;
		this.mayArea = mayArea;
		this.notMayArea = notMayArea;
		this.equityStall = equityStall;
		this.useEquityStall = useEquityStall;
		this.clusterMessage = clusterMessage;
		this.towerNumber = towerNumber;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Cluster [id=" + id + ", name=" + name + ", landId=" + landId + ", landArea=" + landArea
				+ ", landareamu=" + landareamu + ", overgArea=" + overgArea + ", floorArea=" + floorArea + ", mayArea="
				+ mayArea + ", notMayArea=" + notMayArea + ", equityStall=" + equityStall + ", useEquityStall="
				+ useEquityStall + ", clusterMessage=" + clusterMessage + ", towerNumber=" + towerNumber
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", lastUpdatedBy=" + lastUpdatedBy
				+ ", lastUpdateDate=" + lastUpdateDate + ", remark=" + remark + "]";
	}
}