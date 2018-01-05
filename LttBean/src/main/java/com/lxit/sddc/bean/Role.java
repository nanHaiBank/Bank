package com.lxit.sddc.bean;

/**
 * 角色表
 * 
 * @author LongShao
 *
 */
public class Role {
	int id;// 角色Id

	String name;// 角色名
	String roleDes;// 角色描述
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoleDes() {
		return roleDes;
	}

	public void setRoleDes(String roleDes) {
		this.roleDes = roleDes;
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

	public Role() {
		super();
	}

	public Role(int id, String name, String roleDes, int createdBy, String createdDate, int lastUpdatedBy,
			String lastUpdateDate, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.roleDes = roleDes;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", roleDes=" + roleDes + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdateDate="
				+ lastUpdateDate + ", remark=" + remark + "]";
	}
}