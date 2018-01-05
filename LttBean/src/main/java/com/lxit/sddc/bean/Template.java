package com.lxit.sddc.bean;

/**
 * 模板表
 * 
 * @author LongShao
 *
 */
public class Template {
	int id;// 模板Id

	int templateType;// 模板类型

	int templatecial;// 模板业态

	String templateName;// 模板名称

	String file;// 文件

	int templateState;// 模板状态（发布、未发布、已下线）

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

	public int getTemplateType() {
		return templateType;
	}

	public void setTemplateType(int templateType) {
		this.templateType = templateType;
	}

	public int getTemplatecial() {
		return templatecial;
	}

	public void setTemplatecial(int templatecial) {
		this.templatecial = templatecial;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public int getTemplateState() {
		return templateState;
	}

	public void setTemplateState(int templateState) {
		this.templateState = templateState;
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

	public Template() {
		super();
	}

	public Template(int id, int templateType, int templatecial, String templateName, String file, int templateState,
			int createdBy, String createdDate, int lastUpdatedBy, String lastUpdateDate, String remark) {
		super();
		this.id = id;
		this.templateType = templateType;
		this.templatecial = templatecial;
		this.templateName = templateName;
		this.file = file;
		this.templateState = templateState;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Template [id=" + id + ", templateType=" + templateType + ", templatecial=" + templatecial
				+ ", templateName=" + templateName + ", file=" + file + ", templateState=" + templateState
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", lastUpdatedBy=" + lastUpdatedBy
				+ ", lastUpdateDate=" + lastUpdateDate + ", remark=" + remark + "]";
	}
}