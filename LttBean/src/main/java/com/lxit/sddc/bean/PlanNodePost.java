package com.lxit.sddc.bean;

/**
 * 计划节点岗位中间表
 * 
 * @author LongShao
 *
 */
public class PlanNodePost {
	int id;// 主键

	int nodeId;// 计划节点Id

	int deptPostId;// 岗位部门中间表Id

	String d_key;// 岗位类型(引用数据字典的key)

	int userId;// 岗位人

	int createUser;// 创建人

	String createTime;// 创建时间

	int lastName;// 最后修改人

	String lastTime;// 最后修改时间

	String remark;// 备注

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