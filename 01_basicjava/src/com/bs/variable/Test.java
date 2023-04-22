package com.bs.variable;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		//학생정보를 입력받고 출력하는 기능 구현하기
		//이름, 나이, 성별(남,여), 학년, 반, 번호, 키, 주소, 이메일 입력받고
		//입력받은 내용을 출력하기
		//com.bs.variable.StudentInfo 클래스를 생성해서 구현할 것.
		//1. 입력받은 값을 출력
		//2. 한번에 출력
		//유병승 19 남 1 3 3 180.5 경기도 시흥시 teacherdev09@gmail.com
		
		System.out.println("당신의 이름은 : ");
		String name = sc.next();
		System.out.println(name);
		
		System.out.println("당신의 나이는 : ");
		int age = sc.nextInt();
		System.out.println(age);
		
		System.out.println("당신의 성별은(남/여) : ");
		char gender = sc.next().charAt(0);
		System.out.println(gender);
		
		System.out.println("당신의 학년은 : ");
		int grade = sc.nextInt();
		System.out.println(grade);
		
		System.out.println("당신의 반은 : ");
		int classNumber = sc.nextInt();
		System.out.println(classNumber);
		
		System.out.println("당신의 번호는 : ");
		int number = sc.nextInt();
		System.out.println(number);
		
		System.out.println("당신의 키는 : ");
		Double height = sc.nextDouble();
		System.out.println(height);
		
		System.out.println("당신의 주소는 : ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println(address);
		
		System.out.println("당신의 이메일은 :");
		String email = sc.next(); //위에 nextLine을 써서 비울 필요 없음
		System.out.println(email);
		
		String studentInfo = name + " " + age + " " + gender + " " + grade + " " + classNumber + " " + number + " " + height + " " + address + " " + email;
		System.out.println(studentInfo);
	
	
			
		
		
		
		

	}

}
