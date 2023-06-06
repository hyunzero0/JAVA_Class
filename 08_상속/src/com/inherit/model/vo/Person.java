package com.inherit.model.vo;

public class Person {
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String address;
	
	//기본생성자 ctrl + space + enter
	public Person() {
		// TODO Auto-generated constructor stub
	}

	//매개변수 생성자 alt + s -> a -> g
	public Person(String name, int age, char gender, String phone, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}
	
	//멤버변수별 setter/getter
	//alt + s -> r -> a -> r
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	protected String infoPerson() { //미리 선언해두면 좋음, 접근제한자 public이면 Controller 에서도 사용되기 때문에 public으로
		return name + " " + age + " " + phone + " " + address;
	}
	
	public String info() {
		return infoPerson();
	}
	
}
