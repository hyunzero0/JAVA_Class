package com.bs.practice.chap02.loop;

import java.util.*;
public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if(num > 0) {
			for(int i=1;i<=num;i++) {
				System.out.print(i + " ");
			}
		}else
			System.out.println("1 이상의 숫자를 입력해주세요.");
	}
	
	public void practice2() {
		int num = 0;
		while(num < 1) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
		}
		for(int i=1;i<=num;i++) {
			System.out.print(i + " ");	
		}
	}
	
	public void practice3() {
		int num = 0;
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		if(num > 0) {
			for(int i = num; i > 0;i--) {
				System.out.print(i + " ");
				
			}
		}else
			System.out.println("1이상의 숫자를 입력해주세요.");
	}
	
	public void practice4() {
		int num = 0;
		while(num < 1) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
		}
		for(int i = num; i > 0;i--) {
			System.out.print(i + " ");		
		}
		
	}
	
	public void practice5() {
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int result = 0;
		String resultView ="";
		for(int i=1;i<=num;i++) {
			result += i;
			if(i < num)
				resultView += i + " + ";
			else
				resultView += i + " = ";
		}
		System.out.println(resultView + result);
	}
	
	public void practice6() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		String result = "";
		if(num1 < 1 || num2 < 1)
			System.out.println("1 이상의 숫자를 입력해주세요.");
		else if(num1 <= num2){
			for(int i = num1 ; i <= num2; i++ ) {
				result += i +" ";
			}
		}else {
			for(int i = num2 ; i <= num1; i++ ) {
				result += i +" ";
		}
		
	}
		System.out.println(result);
	}
	
	public void practice7() {
		int num1, num2 = 0;
	
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();
			if(num1>0 && num2 >0) break;
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		String result = "";
		if(num1 < 1 || num2 < 1)
			System.out.println("1 이상의 숫자를 입력해주세요.");
		else if(num1 <= num2){
			for(int i = num1 ; i <= num2; i++ ) {
				result += i +" ";
			}
		}else {
			for(int i = num2 ; i <= num1; i++ ) {
				result += i +" ";
			}
			
		}
		System.out.println(result);
	}
	
	public void practice8() {
		System.out.print("숫자 : ");
		int guNum = sc.nextInt();
		System.out.println("==== "+guNum+"단 ====");
		for(int i = 1; i < 10;i++) {
			System.out.println(guNum +" * "+ i + " = "+ (guNum * i));
		}
		
	}
	
	public void practice9() {
		System.out.print("숫자 : ");
		int guNum = sc.nextInt();
		if(guNum>9)
			System.out.println("9이하의 숫자만 입력해주세요.");
		else {
			for(int i = guNum;i < 10;i++) {
				System.out.println("==== "+i+"단 ====");
				for(int j = 1; j < 10;j++) {
					System.out.println(i +" * "+ j + " = "+ (i * j));
				}	
			}
		}
	}
	
	public void practice10() {
		int guNum = 0;
	
		while(true) {
			System.out.print("숫자 : ");
			guNum = sc.nextInt();
			if(guNum > 9)
				System.out.println("9이하의 숫자만 입력해주세요.");
			else
				break;
		}
		for(int i = guNum;i < 10;i++) {
			System.out.println("==== "+i+"단 ====");
			for(int j = 1; j < 10;j++) {
				System.out.println(i +" * "+ j + " = "+ (i * j));
			}
	    }	
	}
	
	public void practice11() {
		System.out.print("시작 숫자 : ");
		int sNum = sc.nextInt();
		System.out.print("공차 : ");
		int tNum = sc.nextInt();
		String result = "";
		for(int i = 0; i < 10; i++ ) {
			result += sNum + " ";
			sNum += tNum;
		}
		System.out.println(result);
	}
	
	public void practice12() {
		String op = "";
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			op = sc.next();
			if(op.equals("exit")) break;
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			if(op.equals("/") && num2 == 0) {
				System.out.println("0으로 나룰 수 없습니다. 다시 입력해주세요.");
				continue;
			}
			switch(op){
			case "+" : System.out.println(num1 +" + "+ num2 +" = "+ (num1 + num2));break;
			case "-" : System.out.println(num1 +" - "+ num2 +" = "+ (num1 - num2));break;
			case "*" : System.out.println(num1 +" * "+ num2 +" = "+ (num1 * num2));break;
			case "/" : System.out.println(num1 +" / "+ num2 +" = "+ (num1 / num2));break;
			case "%" : System.out.println(num1 +" % "+ num2 +" = "+ (num1 % num2));break;
			default : System.out.println("없는 연산자입니다. 다시 입력해주세요."); continue;
				
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void practice13() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice14() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			for(int j = 0;j < num-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}











