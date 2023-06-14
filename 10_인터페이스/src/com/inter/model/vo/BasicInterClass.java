package com.inter.model.vo;

import com.inter.common.BasicInter;

//인터페이스 선언하기
public class BasicInterClass implements BasicInter {
	
	//인터페이스를 구현한 클래슨는 반드시 인터페이스가 선언한 추상메소드를
	//재정의(오버라이드) 해야한다.

	@Override
	public void test() {
		
	}
	
	@Override
	public int calc(int a, int b) {
		return a + b;
	}
	
	
}
