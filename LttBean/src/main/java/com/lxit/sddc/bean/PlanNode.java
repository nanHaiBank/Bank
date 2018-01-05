package com.lxit.sddc.bean;

/**
 * 计划节点中间表
 * 
 * @author LongShao
 *
 */
public class PlanNode {
	int id;// 主键
	int planId;// 计划Id
	int nodeId;// 节点Id

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public int getNodeId() {
		return nodeId;
	}

	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}

	public PlanNode() {
		super();
	}

	public PlanNode(int id, int planId, int nodeId) {
		super();
		this.id = id;
		this.planId = planId;
		this.nodeId = nodeId;
	}

	@Override
	public String toString() {
		return "PlanNode [id=" + id + ", planId=" + planId + ", nodeId=" + nodeId + "]";
	}
}