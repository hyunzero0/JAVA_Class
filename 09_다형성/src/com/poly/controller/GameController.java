package com.poly.controller;

import com.poly.model.vo.Character; //캐릭터 임포트(다른 클래스에 캐릭터가 있음)

public class GameController {
	
	private Character c;
	
	public GameController() {
		// TODO Auto-generated constructor stub
	}
	
	public GameController(Character c) {
		super();
		this.c = c;
	}
	
	public void attack() {
		c.attack();
	}
	
	public void defence() {
		c.defence();
	}
	
	public void printCharacter() {
		System.out.println(c);
	}
}
