package com.inherit.model.vo;

public class BasicTest extends Parent {
	
	private int number;
	
	//생성자 활용하기
	public BasicTest() {
//		super("기본", 100.5); //부모클래스에 매개변수 생성자가 있으면 기본생성자 생성안됨.
		super(); //기본생성자 호출
	} //기본생성자
	
	public BasicTest(String title, int number, double weight) { //매개변수 생성자 -> 부모가 갖고있는 데이터도 추가해서 매개변수 설정
//		setTitle(title);
		super(title, weight); //무조건 맨 위에 있어야함
//		this(); //호출 불가 this도 맨 위에 있어야함
		this.number = number;
//		super.weight = weight; //부모클래스.변수
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	//부모클래스에 선언된 필드, 메소드에 접근하기
	//필드, 메소드는 접근제한자의 영향을 받는다.
	public String infoBasicTest() {
		return getTitle() + number + weight;
		//title은 private이기 때문에 직접접근은 불가능하고 getter/setter를 이용해서 접근해야한다.
	}
	
	
}
