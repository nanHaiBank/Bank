package com.lxit.sddc.bean;

/**
 * �����ֵ�
 * 
 * @author LongShao
 *
 */
public class Dictionaries {
	int id;// �ֵ�Id

	String key;// ����key

	String value;// ����ֵ

	String type;// ��������

	String des;// ����

	int switchs;// ���ݿ���(0,1)

	int createUser;// ������

	String createTime;// ����ʱ��

	int lastName;// ����޸���

	String lastTime;// ����޸�ʹʱ��

	String remark;// ��ע

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public int getSwitchs() {
		return switchs;
	}

	public void setSwitchs(int switchs) {
		this.switchs = switchs;
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

	public Dictionaries() {
		super();
	}

	public Dictionaries(int id, String key, String value, String type, String des, int switchs, int createUser,
			String createTime, int lastName, String lastTime, String remark) {
		super();
		this.id = id;
		this.key = key;
		this.value = value;
		this.type = type;
		this.des = des;
		this.switchs = switchs;
		this.createUser = createUser;
		this.createTime = createTime;
		this.lastName = lastName;
		this.lastTime = lastTime;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Dictionaries [id=" + id + ", key=" + key + ", value=" + value + ", type=" + type + ", des=" + des
				+ ", switchs=" + switchs + ", createUser=" + createUser + ", createTime=" + createTime + ", lastName="
				+ lastName + ", lastTime=" + lastTime + ", remark=" + remark + "]";
	}
}