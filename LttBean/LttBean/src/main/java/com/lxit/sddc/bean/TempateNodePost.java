package com.lxit.sddc.bean;

/**
 * 岗位节点模板中间表
 * 
 * @author LongShao
 *
 */
public class TempateNodePost {
	int id;
	int tempateNodeId;
	int deptPostId;
	String d_key;
	int createUser;
	String createTime;
	int lastName;
	String lastTime;
	String remark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTempateNodeId() {
		return tempateNodeId;
	}

	public void setTempateNodeId(int tempateNodeId) {
		this.tempateNodeId = tempateNodeId;
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

	public TempateNodePost() {
		super();
	}

	public TempateNodePost(int id, int tempateNodeId, int deptPostId, String d_key, int createUser, String createTime,
			int lastName, String lastTime, String remark) {
		super();
		this.id = id;
		this.tempateNodeId = tempateNodeId;
		this.deptPostId = deptPostId;
		this.d_key = d_key;
		this.createUser = createUser;
		this.createTime = createTime;
		this.lastName = lastName;
		this.lastTime = lastTime;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "TempateNodePost [id=" + id + ", tempateNodeId=" + tempateNodeId + ", deptPostId=" + deptPostId
				+ ", d_key=" + d_key + ", createUser=" + createUser + ", createTime=" + createTime + ", lastName="
				+ lastName + ", lastTime=" + lastTime + ", remark=" + remark + "]";
	}
}