package com.lxit.sddc.bean;

/**
 * �ƻ��ڵ��λ�м��
 * 
 * @author LongShao
 *
 */
public class PlanNodePost {
	int id;// ����

	int nodeId;// �ƻ��ڵ�Id

	int deptPostId;// ��λ�����м��Id

	String d_key;// ��λ����(���������ֵ��key)

	int userId;// ��λ��

	int createUser;// ������

	String createTime;// ����ʱ��

	int lastName;// ����޸���

	String lastTime;// ����޸�ʱ��

	String remark;// ��ע

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNodeId() {
		return nodeId;
	}

	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}

	public int getDeptPostId() {
		return deptPostId;
	}

	public void setDeptPostId(int deptPostId) {
		this.deptPostId = deptPostId;
	}

	public String getD_key() {
		return d_key;
	}

	public void setD_key(String d_key) {
		this.d_key = d_key;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCreateUser() {
		return createUser;
	}

	public void setCreateUser(int createUser) {
		this.createUser = createUser;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public int getLastName() {
		return lastName;
	}

	public void setLastName(int lastName) {
		this.lastName = lastName;
	}

	public String getLastTime() {
		return lastTime;
	}

	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public PlanNodePost() {
		super();
	}

	public PlanNodePost(int id, int nodeId, int deptPostId, String d_key, int userId, int createUser, String createTime,
			int lastName, String lastTime, String remark) {
		super();
		this.id = id;
		this.nodeId = nodeId;
		this.deptPostId = deptPostId;
		this.d_key = d_key;
		this.userId = userId;
		this.createUser = createUser;
		this.createTime = createTime;
		this.lastName = lastName;
		this.lastTime = lastTime;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "PlanNodePost [id=" + id + ", nodeId=" + nodeId + ", deptPostId=" + deptPostId + ", d_key=" + d_key
				+ ", userId=" + userId + ", createUser=" + createUser + ", createTime=" + createTime + ", lastName="
				+ lastName + ", lastTime=" + lastTime + ", remark=" + remark + "]";
	}
}