package com.lxit.sddc.bean;

/**
 * 角色权限中间表
 * 
 * @author LongShao
 *
 */
public class RoleJurisdicton {
	int id;// Id

	int jurisdictionId;// 权限Id
	int roleId;// 角色Id
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

	public int getJurisdictionId() {
		return jurisdictionId;
	}

	public void setJurisdictionId(int jurisdictionId) {
		this.jurisdictionId = jurisdictionId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
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

	public RoleJurisdicton(int id, int jurisdictionId, int roleId, int createdBy, String createdDate, int lastUpdatedBy,
			String lastUpdateDate, String remark) {
		super();
		this.id = id;
		this.jurisdictionId = jurisdictionId;
		this.roleId = roleId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.remark = remark;
	}

	public RoleJurisdicton() {
		super();
	}

	@Override
	public String toString() {
		return "RoleJurisdicton [id=" + id + ", jurisdictionId=" + jurisdictionId + ", roleId=" + roleId
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", lastUpdatedBy=" + lastUpdatedBy
				+ ", lastUpdateDate=" + lastUpdateDate + ", remark=" + remark + "]";
	}
}