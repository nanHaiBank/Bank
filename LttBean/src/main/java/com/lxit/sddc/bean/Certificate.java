package com.lxit.sddc.bean;
     
/**
 * 证件表
 * 
 * @author LongShao
 *
 */
public class Certificate {
	int id;// 证件Id

	String numxber;// 证件号

	int clusterId;// 所属组团

	int dictionariesId;// 证件类型

	String landArea;// 用地面积

	String acquireDate;// 取得时间

	String uploadingFile;// 上传文件

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

	public int getDictionariesId() {
		return dictionariesId;
	}

	public void setDictionariesId(int dictionariesId) {
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

	public Certificate() {
		super();
	}

	public Certificate(int id, String numxber, int clusterId, int dictionariesId, String landArea, String acquireDate,
			String uploadingFile, int createdBy, String createdDate, int lastUpdatedBy, String lastUpdateDate,
			String remark) {
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

	@Override
	public String toString() {
		return "Certificate [id=" + id + ", numxber=" + numxber + ", clusterId=" + clusterId + ", dictionariesId="
				+ dictionariesId + ", landArea=" + landArea + ", acquireDate=" + acquireDate + ", uploadingFile="
				+ uploadingFile + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", lastUpdatedBy="
				+ lastUpdatedBy + ", lastUpdateDate=" + lastUpdateDate + ", remark=" + remark + "]";
	}
}