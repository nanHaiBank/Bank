package com.lxit.sddc.bean;

/**
 * �û���ɫ��
 * 
 * @author LongShao
 *
 */
public class UserRole {
	int id;// �û���ɫ��Id

	int userId;// �û�Id
	int roleId;// ��ɫId
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public UserRole() {
		super();
	}

	public UserRole(int id, int userId, int roleId, int createdBy, String createdDate, int lastUpdatedBy,
			String lastUpdateDate, String remark) {
		super();
		this.id = id;
		this.userId = userId;
		this.roleId = roleId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "UserRole [id=" + id + ", userId=" + userId + ", roleId=" + roleId + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdateDate="
				+ lastUpdateDate + ", remark=" + remark + "]";
	}
}