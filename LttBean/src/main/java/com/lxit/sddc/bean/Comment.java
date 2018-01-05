package com.lxit.sddc.bean;

/**
 * 评论表
 * 
 * @author LongShao
 *
 */
public class Comment {
	int id;// 评论Id

	String Content;// 评论内容

	int taskId;// 任务Id

	int UserId;// 评论人

	String time;// 评论时间

	String d_key;// 操作(数据字典中的key)

	String accessory;// 附件

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

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getD_key() {
		return d_key;
	}

	public void setD_key(String d_key) {
		this.d_key = d_key;
	}

	public String getAccessory() {
		return accessory;
	}

	public void setAccessory(String accessory) {
		this.accessory = accessory;
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

	public Comment() {
		super();
	}

	public Comment(int id, String content, int taskId, int userId, String time, String d_key, String accessory,
			int createUser, String createTime, int lastName, String lastTime, String remark) {
		super();
		this.id = id;
		Content = content;
		this.taskId = taskId;
		UserId = userId;
		this.time = time;
		this.d_key = d_key;
		this.accessory = accessory;
		this.createUser = createUser;
		this.createTime = createTime;
		this.lastName = lastName;
		this.lastTime = lastTime;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", Content=" + Content + ", taskId=" + taskId + ", UserId=" + UserId + ", time="
				+ time + ", d_key=" + d_key + ", accessory=" + accessory + ", createUser=" + createUser
				+ ", createTime=" + createTime + ", lastName=" + lastName + ", lastTime=" + lastTime + ", remark="
				+ remark + "]";
	}
}