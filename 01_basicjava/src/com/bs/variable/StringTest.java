package com.bs.variable;

public class StringTest {
	public static void main(String[] args) {
		//문자열 자료형 이용하기
		String name = "유병승";
		//String은 클래스이다!! -> 원래.. new 연산자를 이용해 생성해서 써야함.
		//java에서 기본자료형처럼 사용할 수 있게 해줌
		name = new String("김재훈");
		System.out.println(name);
		
		//문자열 타입의 값에 + 연산하면 대상되는 값을 결합해줌
		String msg = "유병승" + " java 선생님";
		System.out.println(msg);
		//다른 타입과 문자열 타입에 + 연산을 하면??? -> 결합연산!
		msg = 19 + "살 유병승";
		System.out.println(msg);
		
		int age = 19;
		name = "유병승";
		
		msg = name + age;//"유병승"+19
		System.out.println(msg);
		
		msg = 20 + (age + name);
		System.out.println(msg);
		
		//본인의 이름, 나이, 성별(M/F), 키, 주소, 전화번호를 각 변수에 저장하고
		//* 데이터에 맞는 자료형으로 선택
		//나의 이름은 000이고 나이는 00살이고 키는 000.00, 주소는 0000
		//성별은 0이다. 출력
		String name1 = "김현영";
		int age1 = 26;
		char gender = 'F';
		double height = 166.2;
		String address = "서울시 구로구";
		String number = "010-7171-0156";
		
		System.out.println("나의 이름은 " + name1 + "이고 나이는 " + age1 + "살이고 키는 " + height + ", 주소는 " + address + ", 성별은 " + gender + "이다.");
		
		
		//String은 클래스로 유용한 기능을 가지고 있음.
		//1. String변수에 저장된 문자열의 길이를 알려주는 기능(메소드)
		// - length();
		// "문자열".length();
		// 문자열변수명.length();
		System.out.println("유병승".length());
		System.out.println(address.length());
		int count = address.length();
		System.out.println(count);
		
		//2. 문자열 변수에 저장된 문자열의 특정문자만 가져오는 기능
		//charAt(번호)
		//"이다영".charAt(0) -> 이
		//name1.charAt(1) -> 현
		System.out.println("이다영".charAt(0));
		System.out.println(name1.charAt(1));
		char ch = "이다영".charAt(2);
		System.out.println(ch);
		//주의 없는 번호를 대입하면 에러가 발생함.
		//ch="윤지환".charAt(3);
		
		
		
		
		
	}
}
