package com.lxit.sddc.bean;

/**
 * �����ڱ�
 * 
 * @author LongShao
 *
 */
public class Window {
	int id;// ������Id

	int Number;// ���

	int datePeriod;// ʱ������

	String startTime;// ��ʼʱ��

	String overTime;// ����ʱ��

	int lastName;// ��������

	String lastTime;// ������ʱ��

	int createUser;// ������

	String createTime;// ����ʱ��

	String remark;// ��ע

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