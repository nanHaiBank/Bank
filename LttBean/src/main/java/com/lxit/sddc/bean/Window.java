package com.lxit.sddc.bean;

/**
 * 窗口期表
 * 
 * @author LongShao
 *
 */
public class Window {
	int id;// 窗口期Id

	int Number;// 序号

	int datePeriod;// 时间周期

	String startTime;// 开始时间

	String overTime;// 结束时间

	int lastName;// 最后操作人

	String lastTime;// 最后操作时间

	int createUser;// 创建人

	String createTime;// 创建时间

	String remark;// 备注

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}

	public int getDatePeriod() {
		return datePeriod;
	}

	public void setDatePeriod(int datePeriod) {
		this.datePeriod = datePeriod;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getOverTime() {
		return overTime;
	}

	public void setOverTime(String overTime) {
		this.overTime = overTime;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Window() {
		super();
	}

	public Window(int id, int number, int datePeriod, String startTime, String overTime, int lastName, String lastTime,
			int createUser, String createTime, String remark) {
		super();
		this.id = id;
		Number = number;
		this.datePeriod = datePeriod;
		this.startTime = startTime;
		this.overTime = overTime;
		this.lastName = lastName;
		this.lastTime = lastTime;
		this.createUser = createUser;
		this.createTime = createTime;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Window [id=" + id + ", Number=" + Number + ", datePeriod=" + datePeriod + ", startTime=" + startTime
				+ ", overTime=" + overTime + ", lastName=" + lastName + ", lastTime=" + lastTime + ", createUser="
				+ createUser + ", createTime=" + createTime + ", remark=" + remark + "]";
	}
}