package com.biz.files.vo;

public class GradeVO {
	
	private String strNum;
	private String strName;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum;
	private float floatAvg;
	
	
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntSum() {
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public float getFloatAvg() {
		return floatAvg;
	}
	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}
	@Override
	public String toString() {
		return "GradeVO [strNum=" + strNum + ", strName=" + strName + ", intKor=" + intKor + ", intEng=" + intEng
				+ ", intMath=" + intMath + ", intSum=" + intSum + ", floatAvg=" + floatAvg + ", getStrNum()="
				+ getStrNum() + ", getStrName()=" + getStrName() + ", getIntKor()=" + getIntKor() + ", getIntEng()="
				+ getIntEng() + ", getIntMath()=" + getIntMath() + ", getIntSum()=" + getIntSum() + ", getFloatAvg()="
				+ getFloatAvg() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
