package com.inherit.model.vo;

public class Parent {
	private String title;
	
	protected double weight;
	
	public Parent() {} //기본 생성자
	
	public Parent(String title, double weight) { //매개변수 생성자
		this.title = title;
		this.weight = weight;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
}
