package com.repeat.controller;

import java.util.*;
public class RepeatController {
	Scanner sc = new Scanner(System.in);
	public void basicRepeat() {
//		for(int i = 0;i < 10; i++) {
//			System.out.println("안녕하세요");
//		}
//		
//		for(int i = 1; i <= 10; i++) {
//			System.out.print(i + " ");
//		}
//	
	
	//5번 실행하는 for문
//		for(int i = 0; i <5; i++) {
//			int temp = 10;
//			System.out.println(temp);
//		}
//		//1부터 100까지의 수를 출력하기
//		//1부터 100까지의 수에서 짝수만 출력하기
//		for(int i = 1; i <= 100; i++) {
//			System.out.print(i+" ");
//		}
//		System.out.println(" ");
//		for(int i = 1; i<= 100; i++) {
//			if(i % 2 == 0) {
//				System.out.print(i+" ");
//			}
//		}
//		System.out.println(" ");
//		//100부터 1까지 수 출력하기
//		for(int i = 100; i > 0; i--) {
//			System.out.print(i +" ");
//		}
		//친구 5명의 이름을 입력받고 출력하기
//		String[] fname = new String[5];
//		for(int i = 0; i < 5;i++) {
//			System.out.print("친구이름 입력: ");
//			fname[i] = sc.next();
//			//System.out.println(fname);
//		}
//		for(int j = 0; j < 5; j++) {
//			System.out.print(fname[j]+" ");
//		}
//		String name = "";
//		for(int i = 0; i<5;i++) {
//		System.out.print("이름을 입력: ");
//		name += sc.next() + " ";
//		
//		}
//		System.out.println(name);
		//숫자 4개를 입력받아 총합을 구하는 기능 구현하기
//		int result = 0;
//		for(int i = 0; i < 4; i++) {
//			System.out.print("숫자 입력: ");
//			result += sc.nextInt();
//			
//		}
//		System.out.println(result);
//		int count = 0;
//		for(;count<10;count++) {
//			System.out.println(count);
//		}
		String msg = "";
//		for(;!msg.equals("exit");) {
//			System.out.print("메시지입력: ");
//			msg = sc.next();
//			System.out.println(msg);
//		}
		//사용자가 "끝"이라는 메세지를 입력할때까지 입력을 받고 입력받은 내용 모두 출력하기
		String result = "";
//		for(;;) {
//			System.out.print("메시지 입력: ");
//			msg = sc.next();
//			if(msg.equals("끝")) {
//				break;
//			}else {
//				result += msg+" ";
//			}
//		}
//		System.out.println(result);
		for(;!msg.equals("끝");) {
			System.out.print("메시지 입력: ");
			msg = sc.next();
			
			if(!msg.equals("끝"))
				result += msg+" ";
			}
		
		System.out.println(result);
	}
	
	
	public void forApplication() {
		//1부터 사용자가 입력한 수까지 출력하기
		//입력값 : 4 -> 1 2 3 4
		System.out.print("숫자입력: ");
		int num = sc.nextInt();
		for(int i= 1; i <= num; i++ ) {
			System.out.print(i + " ");
		}
	
	
	}
	public void empInputData() {
		//3명의 사원정보를 입력받고 출력하는 기능
		//이름, 나이, 성별, 급여, 보너스(소수점)
		//한번에 출력
		System.out.print("입력할 사원수 : ");
		int empNum = sc.nextInt();
		String name = "";
		int age , salary= 0;
		char gender = ' ';
		double bonus = 0;
		String result = "";
		for(int i = 0;i < empNum; i++ ) {
			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("나이 : ");
			age = sc.nextInt();
			sc.nextLine();
			System.out.print("성별(남, 여) : ");
			gender = sc.nextLine().charAt(0);
			System.out.print("급여 : ");
			salary = sc.nextInt();
			System.out.print("보너스 : ");
			bonus = sc.nextDouble();
			result += name + " " + age + " "+ gender + " " + salary + " "+ bonus+ "\n";
//			System.out.printf("이름 : %s 나이 : %d 성별 : %c 급여 : %d 보너스 : %f\n", name, age, gender, salary, bonus);
		}
		System.out.println(result);
	}
	
	public void forApplication2() {
//		String msg = "안녕하세요 화요일이에요";
//		for(int i = 0;i < msg.length();i++) {
////			System.out.println(i);
//		
//			System.out.print(msg.charAt(i));
//		}
		System.out.print("알파벳 입력 : ");
		String alpa = sc.next();
		int count = 0;
		for(int i = 0; i < alpa.length();i++) {
			char check = alpa.charAt(i);
			if(check >= 'A' && check <= 'Z') {		
				count ++;
			}
		}
		if(count ==0) {
			System.out.println("대문자가 포함되어 있지 않습니다.");
		}else
			System.out.println("대문자가 포함되어 있습니다.");
		
	}
	public void forApplication3() {
		String test = "apple";
		int count = 0;
		for(int i=0;i<test.length();i++) {
			System.out.println(test.charAt(i));
			for(int j=0;j<test.length();j++) {
				if(i != j&&test.charAt(i)==test.charAt(j)) {
					count++;
				}
			}
		}
	}
	public void star() {
		for(int i = 0; i < 5;i++) {
			for(int j = 0; j<=i;j++) {
				System.out.print("*");
		}
			System.out.println();
	}
	}
	public void whileTest() {
		int menu = 0;
		while(menu!=9) {
			System.out.println("===== BS lunch ====");
			System.out.println("1. ");
		}
	}
	public void whileCalculator() {
		//두 개의 정수, 연산자를 입력받아 계산해주는 기능
		//계산이 끝나면 계속하시겠습니까? 문구 출력 후
		//Y를 선택하면 한번더 실행, N을 선택하면 프로그램을 종효합니다 출력 후 종료
		char select = ' ';
//		while(select == 'Y') {
		do{
			System.out.print("정수1 입력: ");
			int num1 = sc.nextInt();
			System.out.print("정수2 입력: ");
			int num2 = sc.nextInt();
			System.out.print("연산자 입력: ");
			char op = sc.next().charAt(0);
			double result = 0;
			switch(op) {
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case '*' : result = num1 * num2; break;
			case '/' : result = num1 * num2; break;
			case '%' : result = num1 * num2; break;
			}
			System.out.println("계산결과 : "+ result);
			
			System.out.print("계속하시겠습니까?(Y/N) : ");
			select = sc.next().charAt(0);
			
			
		}while(select=='Y');
		System.out.println("프로그램을 종료합니다.");
	}
	public void continueBreakTest() {
		System.out.print("알파벳 입력 : ");
		String alpa = sc.next();
		int i = 0;
		int count = 0;
		while(i != alpa.length()) {
			char select = alpa.charAt(i);
			if(select >='A' && select <= 'Z') {
				count++;
				break;
			}
			
			i++;
		}
		if(count>0)
			System.out.println("있다");
		else
			System.out.println("없다");
	}
	//자바에서 랜덤값을 출력하기
	//숫자로 출력 -> 임의의 실수(0 ~ 1)
	//Math.random() 기능 이용
	//Random클래스를 이용
	public void randomTest() {

		Random r = new Random();
		System.out.println(r.nextInt(10)); // 0 ~ 9
		
	}
	

}
