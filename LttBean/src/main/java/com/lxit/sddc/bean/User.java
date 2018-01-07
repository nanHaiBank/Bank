package com.lxit.sddc.bean;

/**
 * �û���
 * 
 * @author LongShao
 *
 */
public class User {
	int id;// �û�Id

	String userName;// �û���
	String pass;// �û�����
	int deptPostId;// ���Ÿ�λ�м��Id
	String name;// ����
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getDeptPostId() {
		return deptPostId;
	}

	public void setDeptPostId(int deptPostId) {
		this.deptPostId = deptPostId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", pass=" + pass + ", deptPostId=" + deptPostId + ", name="
				+ name + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", lastUpdatedBy="
				+ lastUpdatedBy + ", lastUpdateDate=" + lastUpdateDate + ", remark=" + remark + "]";
	}

	public User() {
		super();
	}

	public User(int id, String userName, String pass, int deptPostId, String name, int createdBy, String createdDate,
			int lastUpdatedBy, String lastUpdateDate, String remark) {
		super();
		this.id = id;
		this.userName = userName;
		this.pass = pass;
		this.deptPostId = deptPostId;
		this.name = name;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.remark = remark;
	}
}