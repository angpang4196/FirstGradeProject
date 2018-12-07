package com.biz.files.vo;

public class GradeVO {

	String strNum;
	String strName;

	int intKor;
	int intEng;
	int intMath;

	int intSum;
	float floatAvg;

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
		return "학번 : " + strNum + ", 이름 : " + strName + ", 국어 : " + intKor + ", 영어 : " + intEng + ", 수학 : " + intMath
				+ ", 총점 : " + intSum + ", 평균 : " + floatAvg + "";
	}

}
