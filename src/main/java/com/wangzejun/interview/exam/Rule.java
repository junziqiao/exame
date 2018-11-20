package com.wangzejun.interview.exam;

public class Rule {
	
	/**
	 * 被那些数整除
	 */
	private int[] diviseNums;
	
	/**
	 * 需要包含整数
	 */
	private String[] containNums;
	
	/**
	 * 结果
	 */
	private String result;

	public int[] getDiviseNums() {
		return diviseNums;
	}

	public void setDiviseNums(int[] diviseNums) {
		this.diviseNums = diviseNums;
	}

	public String[] getContainNums() {
		return containNums;
	}

	public void setContainNums(String[] containNums) {
		this.containNums = containNums;
	}
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public boolean isOkContainNums(){
		return diviseNums!=null&&diviseNums.length>0;
	}
	
	public boolean isOkDiviseNums(){
		return diviseNums!=null&&diviseNums.length>0;
	}
	
}
