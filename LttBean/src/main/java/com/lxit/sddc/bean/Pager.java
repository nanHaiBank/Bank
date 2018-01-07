package com.lxit.sddc.bean;
import java.util.ArrayList;
import java.util.List;

public class Pager<T> {
	private int pageIndex; //��ǰҳ
	private int pageSize; //ÿҳ��ʾ������
	private int sumPage; //��ҳ��
	private int sumCount; //������
	private boolean isFirst;//
	private boolean isLast;//
	
	
	private List<T> data; //ÿҳ������
	
	
	public Pager() {//���췽��
		data = new ArrayList<T>();   //new�����ʼ��
	}
	
	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {  //�ж��������ҳ��С��1��ʱ�򶼶���һҳ
		if(pageIndex<1)
		{
			this.pageIndex = 1;
		}else{
			this.pageIndex = pageIndex;
		}		
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getSumPage() {
		return sumPage;
	}

	public void setSumPage(int sumPage) {
		this.sumPage = sumPage;
	}

	public int getSumCount() {
		return sumCount;
	}

	public void setSumCount(int sumCount) { //
		this.sumCount = sumCount;
		}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public boolean getIsFirst() {   //�ж����������ҳ����ʾ��ҳ����һҳ��     ֻ��ʾ��һҳ��βҳ����Ϊû�н�page.jspҳ���ifѭ����
		System.out.println(this.pageIndex);
		return this.pageIndex <= 1;
	}

	public boolean getIsLast() {   //�ж��������βҳ����ʾ��һҳ��βҳ�� ֻ��ʾ��ҳ����һҳ��...��
		return this.pageIndex >= this.sumPage;
	}

	@Override
	public String toString() {
		return "Pager [pageIndex=" + pageIndex + ", pageSize=" + pageSize + ", sumPage=" + sumPage + ", sumCount="
				+ sumCount + ", isFirst=" + isFirst + ", isLast=" + isLast + ", data=" + data + "]";
	}
	
	
	
}
