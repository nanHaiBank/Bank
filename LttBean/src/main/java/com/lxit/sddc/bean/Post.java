package com.lxit.sddc.bean;

/**
 * 岗位表
 * 
 * @author LongShao
 *
 */
public class Post {
	int id;// 岗位Id

	String name;// 岗位名
	String des;// 岗位描述
	int createdBy;// 创建人
	String createdDate;// 创建日期
	int lastUpdatedBy;// 最后修改人
	String lastUpdateDate;// 最后修改日期
	String remark;// 备注

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
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

	public Post() {
		super();
	}

	public Post(int id, String name, String des, int createdBy, String createdDate, int lastUpdatedBy,
			String lastUpdateDate, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.des = des;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", name=" + name + ", des=" + des + ", createdBy=" + createdBy + ", createdDate="
				+ createdDate + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdateDate=" + lastUpdateDate + ", remark="
				+ remark + "]";
	}
}