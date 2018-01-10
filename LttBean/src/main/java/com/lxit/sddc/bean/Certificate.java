package com.lxit.sddc.bean;

/**
 * ֤����
 * 
 * @author LongShao
 *
 */
public class Certificate {
	int id;// ֤��Id

	String numxber;// ֤����

	int clusterId;// ��������

	String dictionariesId;// ֤������

	String landArea;// �õ����

	String acquireDate;// ȡ��ʱ��

	String uploadingFile;// �ϴ��ļ�

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

	public String getNumxber() {
		return numxber;
	}

	public void setNumxber(String numxber) {
		this.numxber = numxber;
	}

	public int getClusterId() {
		return clusterId;
	}

	public void setClusterId(int clusterId) {
		this.clusterId = clusterId;
	}

	public String getDictionariesId() {
		return dictionariesId;
	}

	public void setDictionariesId(String dictionariesId) {
		this.dictionariesId = dictionariesId;
	}

	public String getLandArea() {
		return landArea;
	}

	public void setLandArea(String landArea) {
		this.landArea = landArea;
	}

	public String getAcquireDate() {
		return acquireDate;
	}

	public void setAcquireDate(String acquireDate) {
		this.acquireDate = acquireDate;
	}

	public String getUploadingFile() {
		return uploadingFile;
	}

	public void setUploadingFile(String uploadingFile) {
		this.uploadingFile = uploadingFile;
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

	public Certificate(int id, String numxber, int clusterId, String dictionariesId, String landArea,
			String acquireDate, String uploadingFile, int createdBy, String createdDate, int lastUpdatedBy,
			String lastUpdateDate, String remark) {
		super();
		this.id = id;
		this.numxber = numxber;
		this.clusterId = clusterId;
		this.dictionariesId = dictionariesId;
		this.landArea = landArea;
		this.acquireDate = acquireDate;
		this.uploadingFile = uploadingFile;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.remark = remark;
	}

	public Certificate() {
		super();
	}

	@Override
	public String toString() {
		return "Certificate [id=" + id + ", numxber=" + numxber + ", clusterId=" + clusterId + ", dictionariesId="
				+ dictionariesId + ", landArea=" + landArea + ", acquireDate=" + acquireDate + ", uploadingFile="
				+ uploadingFile + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", lastUpdatedBy="
				+ lastUpdatedBy + ", lastUpdateDate=" + lastUpdateDate + ", remark=" + remark + "]";
	}
}