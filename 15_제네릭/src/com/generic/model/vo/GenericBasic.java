package com.generic.model.vo;

public class GenericBasic<T, E> {
	
	private T data; //설계할 때 자료형 정하지않음. 생성할 때 타입을 결정.
	private E element;
	
	public GenericBasic() {
		// TODO Auto-generated constructor stub
	}
	
	public GenericBasic(T data) {
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	
	
	
	
}
