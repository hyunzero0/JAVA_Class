package com.exception.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.exception.common.MyException;
import com.exception.common.MyException2;

public class ExceptionController {
	
	public void uncheckedException() {
		//발생하는 예외에 대해서 처리하지 않아도 되는 예외
		//ArithmeticException : 수학적으로 계산이 불가능할 때 발생하는 Exception
		int su = 10;
		int su2 = 0;
//		System.out.println(su / su2);
		
		//ArrayIndexOutOfBoundsException
		//배열의 인덱스 범위를 초과해서 접근할 때 발생하는 예외
		int[] intArr = new int[5];
//		System.out.println(intArr[5]);
		
		//ClassCastException
		//클래스형변환을 잘못했을 때
		Object o = new String("안녕");
//		Integer num = (Integer)o;
		
		//NullPointException
		//참조형 변수에 null값이 있을 때 접근연산자를 사용하면 발생하는 Exception
		String name = null;
//		name.length();
		
		//NumberFormatException
		//문자열을 숫자형으로 변환할 때 변환불가능한 문자가 있는 경우
//		su = Integer.parseInt(name);
		
		//InputMissMatchException
		//입력값의 타입이 일치하지않을 때
		Scanner sc = new Scanner(System.in);
		su = sc.nextInt(); //int형 말고 다른 타입 입력
		
		//RuntimeException이 발생하면 발생하는 순간 프로그램은 종료됨
		System.out.println("이건 실행하니");
		
	}
	
	public void exceptionResolve() throws FileNotFoundException, IOException {
		//Exception 발생 시 해결하는 방법
		//1. try~catch문을 이용해서 직접 예외를 처리하기
		//2. throws 예약어를 이용해서 예외처리를 위임하기
		
//		1.
		//try~catch문으로 발생하는 예외를 처리해보자
		int[] intArr = {1, 2, 3, 4, 5};
		try {
			int a = intArr[5];
//			System.out.println(a);
		} catch(ArrayIndexOutOfBoundsException e) { //발생했을 때만 실행
//			System.out.println("인덱스부족해!");
			int[] temp = new int[intArr.length + 5];
			System.arraycopy(intArr, 0, temp, 0, intArr.length);
			intArr = temp;
			int a = intArr[5]; 
//			System.out.println(a);
		}
//		System.out.println(a);
		System.out.println("실행되니?");
		
		String name = null;
		try {
			if(name.length() < 2) {
				System.out.println("이름은 두 글자 이상 작성해주세요");
			} else {
				System.out.println(name + "참 멋진 이름이네요");
			}
			System.out.println("try문 안에 이건 실행되니?"); //실행안됨, 이미 Exception 뜸
		} catch(NullPointerException e) {
			System.out.println("name이 null이면 처리할 수 없습니다.");
		}
		System.out.println("예외처리 후 실행되는 로직");
		
		//try문에 선언된 내용은 try문 내부에서 사용이 가능함
		int test = 19;
		String number = "십구";
		try {
			int result = test + Integer.parseInt(number);
		} catch(NumberFormatException e) {
			System.out.println(test);
			System.out.println(number);
			int catchNum = 100; //지역변수 -> 밖에서 사용 불가능
		}
		System.out.println(test);
//		System.out.println(catchNum); //지역변수 밖
		
		//try~catch문을 작성했을 때 catch문을 여러 개 작성할 수 있다.
		String[] names = {"유병승", null, "최하리"};
		try {
			for(int i = 0; i <= names.length; i++) {
				if(names[i].length() > 2) {
					System.out.println(names[i]);
				}
			} 
		} catch(NullPointerException | ArrayIndexOutOfBoundsException e) { //처리되는 로직이 같을 때 써도 됨.
			//예외객체의 정보를 확인할 수 있음
			System.out.println(e.getMessage());
			e.printStackTrace(); //출력구문 출력
			System.out.println("예외발생 예외발생!!");
		}
//		} catch(NullPointerException e) {
//			System.out.println("널포인트Exception");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스가 부족해");
//		}
		
		
		//부모 Exception은 자식 Exception이 발생했을 때 모두 처리할 수 있다.
		Object o = new String("test");
		try {
			int a = (int)o;
			a = intArr[11];
			new FileInputStream("test"); //얘는 체크드익셉션임. IOException
		} catch(Exception e) { //ClassCastException(자식) 대신 RuntimeException(부모)로 가능, Exception은 모든 예외의 부모
			System.out.println(e.getMessage());
			System.out.println("예외처리");
//		} catch(ClassCastException e) { //위에 범위가 더 큰 Exception이 있어서 불가능, 순서가 위로 가면 괜찮음
//			System.out.println("형변환 에러!!");
		}
		
		
		//예외처리 구문에서 반드시 실행해야할 구문이 있는 경우
		//finally{예외가 발생하던 안하던 무조건 실행되는 구문} -> finally, catch는 단독 사용 불가능
		try {
			String n = "adfa";
			n.length();
		} catch(NullPointerException e) {
			System.out.println("catch문");
			return;
		} finally {
			System.out.println("반드시 실행해!");			
		}
		
		//개발자가 원하는 순간에 Exception을 발생시킬 수 있음
		exceptionTest("오호~ 내가 발생시키기!");
//		exceptionTest(10);
		
		
//		2.
		//throws로 예외처리하기
		//예외가 발생하는 코드가 있는 메소드 선언부에 선언을 함
		throwsTest();
		
	}
	
	public void throwsTest() throws IOException { //예외를 위임
		FileInputStream fis = new FileInputStream("test.txt");
		
	}
	
	private void exceptionTest(Object o) {
		if(o instanceof String) {
			System.out.println(o);
		} else {
			//직접예외를 발생시키기
			throw new IllegalArgumentException();
		}
	}
	
	public void checkedException() {
		//checkedException예외가 발생하면
		//무조건 예외처리를 해줘야하는 Exception들
		//IOException, Exception
		try {
			throw new IOException();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
//		throw new FileNotFoundException();
//		throw new EOFException();
//		throw new SQLException();
	}
	
	public void makeMyException() {
		//나만의 예외 만들기
		//Exception, RuntimeException, IOException을 상속받는 클래스를 선언(IO는 잘 안그럼)
		try {
			//checked Exception(Exception에게 상속받음)
			throw new MyException("나의 예외발생!!");
		} catch(MyException e) {
			
		}
		//unchecked Exception(상속받은거 확인)
		throw new MyException2("runtimeexception 상속받은 나의 exception");
	}
}
