package com.inherit.model.vo;

//상속불가능한 클래스(상속 받는 건 가능하지만 이 클래스 자체는 상속불가)
public final class FinalTestClass {
	private String test;
	
	public void setTest(String test) {
		this.test = test;
	}
	
	public String getTest() {
		return test;
	}
	
}
