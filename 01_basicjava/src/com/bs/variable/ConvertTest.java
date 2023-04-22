package com.bs.variable;

public class ConvertTest {
	public static void main(String[] args) {
		//형변환에 대해 알아보자
		//특정연산을 실행할 때는 피연산자의 타입이 동일해야한다.
		int num = 100;
		long lnum = num;
		System.out.println(10+180.5);
		float fnum=lnum;
		System.out.println(fnum);
		
		//강제형변환
		int num2 = (int)180.5;
		System.out.println(num2);
		
		int test = 290;
		byte bnum = (byte)test;
		System.out.println(bnum); //오버플로우
		
		//계산에서도 강제적 형변환
		//성적, 평균
		int kor = 90, eng = 54, math = 49;
		System.out.println((double)(kor + eng + math)/3);
		//System.out.println((kor + eng + math)/3.0); 2가지 방법(평소에 주의해야함)
		
		//단일문자(char) 형변환
		//char 내부적으로 코드표에 잇는 숫자를 저장
		char ch='A';
		int chInt = ch;
		System.out.println(chInt);
		chInt = 66;
		System.out.println(chInt);
		System.out.println((char)chInt);
		ch++; //(ch+1)
		System.out.println(ch);
		
		for(int i=0; i<10; i++) {
			System.out.println(ch++);
		}
		
		
	}
}
