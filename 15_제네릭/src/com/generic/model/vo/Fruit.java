package com.generic.model.vo;

public class Fruit {
	private String name;
	private String live;
	private int su;
	private int price;
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	public Fruit(String name, String live, int su, int price) {
		super();
		this.name = name;
		this.live = live;
		this.su = su;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLive() {
		return live;
	}

	public void setLive(String live) {
		this.live = live;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", live=" + live + ", su=" + su + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	
}
