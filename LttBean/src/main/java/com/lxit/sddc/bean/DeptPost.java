package com.lxit.sddc.bean;

/**
 * 部门岗位中间表
 * 
 * @author LongShao
 *
 */
public class DeptPost {
	int id;// 中间表id

	int companyDeptId;// 公司部门中间表Id
	int postId;// 岗位Id
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

	public int getCompanyDeptId() {
		return companyDeptId;
	}

	public void setCompanyDeptId(int companyDeptId) {
		this.companyDeptId = companyDeptId;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
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

	public DeptPost() {
		super();
	}

	public DeptPost(int id, int companyDeptId, int postId, int createdBy, String createdDate, int lastUpdatedBy,
			String lastUpdateDate, String remark) {
		super();
		this.id = id;
		this.companyDeptId = companyDeptId;
		this.postId = postId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "DeptPost [id=" + id + ", companyDeptId=" + companyDeptId + ", postId=" + postId + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdateDate="
				+ lastUpdateDate + ", remark=" + remark + "]";
	}
}