package com.lxit.sddc.bean;

/**
 * Ȩ�ޱ�
 * 
 * @author LongShao
 *
 */
public class Jurisdiction {
	int id;// Ȩ��Id

	String text;// Ȩ����
	int commandId;// �������˵�
	String url;// ���ӵ���url
	String state;// ����ͼ��
	String iconCls;// ͼ��
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public int getCommandId() {
		return commandId;
	}

	public void setCommandId(int commandId) {
		this.commandId = commandId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public Jurisdiction(int id, String text, int commandId, String url, String state, String iconCls, int createdBy,
			String createdDate, int lastUpdatedBy, String lastUpdateDate, String remark) {
		super();
		this.id = id;
		this.text = text;
		this.commandId = commandId;
		this.url = url;
		this.state = state;
		this.iconCls = iconCls;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.remark = remark;
	}

	public Jurisdiction() {
		super();
	}

	@Override
	public String toString() {
		return "Jurisdiction [id=" + id + ", text=" + text + ", commandId=" + commandId + ", url=" + url + ", state="
				+ state + ", iconCls=" + iconCls + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdateDate=" + lastUpdateDate + ", remark=" + remark
				+ "]";
	}

}