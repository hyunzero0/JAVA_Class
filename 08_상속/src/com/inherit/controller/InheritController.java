package com.inherit.controller;

import com.inherit.model.vo.BasicTest;
import com.inherit.model.vo.Employee;
import com.inherit.model.vo.OverrideChild;
import com.inherit.model.vo.Person;
import com.inherit.model.vo.Student;
import com.inherit.model.vo.Teacher;

public class InheritController {
	
	public void basicInheritTest() { 
		//기본 상속에 대해 알아보자
		//1. 모든 클래스는 Object 클래스를 상속받았다.
		//		*별도 선언코드가 없어도 상속받음(기본구조)
		BasicTest bt = new BasicTest();
		bt.equals("test"); //Object가 제공하고있음
		bt.hashCode();
		
		//클래스에 상속관계 설정하기
		//상속 : 두 개의 클래스 간의 부모(super), 자식(sub) 관계를 설정 -> 필요에 의해서
		//방법 : 클래스 선언부에 extends 예약어를 사용
		//예) public class Test(=자식, subclass) extends SuperTest(=부모, superclass) { 클래스선언부 }
		//	SuperTest 클래스에 선언된 내용을 Test가 가져와 쓰는 것
		BasicTest bt2 = new BasicTest();
		bt2.setTitle("처음상속해봄");
		System.out.println(bt2.getTitle());
		bt2.setNumber(100);
		System.out.println(bt2.getNumber());
		String result = bt2.infoBasicTest();
		System.out.println(result);
//		double test = weight; 상속없어서 접근 불가능
		
		//매개변수 있는 생성자로 생성하기
		BasicTest bt3 = new BasicTest("생성자", 100, 65.5);
		System.out.println(bt3.infoBasicTest());
		
		
		
		//학생 2명 저장하기
		//최주영, 26, 남, 010111, 경기도 안양시, 공공데이터, 선생을 갈굼, 상
		//정상준, 26, 남, 010222, 서울시 구로구, 공공데이터, 힘들어함, 중
//		joo.setName("최주영");
//		joo.setAge(26);
//		joo.setGender('남');
//		joo.setPhone("010111");
//		joo.setAddress("경기도 안양시");
//		joo.setJoinClass("공공데이터");
//		joo.setIssue("선생을 갈굼");
//		joo.setLevel('상');
//		System.out.println(joo.getName()
//				+" "+joo.getAge()
//				+" "+joo.getGender()
//				+" "+joo.getPhone()
//				+" "+joo.getAddress()
//				+" "+joo.getJoinClass()
//				+" "+joo.getIssue()
//				+" "+joo.getLevel()); -> set/getter로 설정하기
		Student s1 = new Student("최주영", 26, '남', "010111", "경기도 안양시", "공공데이터", "선생을 갈굼", '상');
		System.out.println(s1.studentInfo());
		Student s2 = new Student("정상준", 26, '남', "010222", "서울시 구로구", "공공데이터", "힘들어함", '중');
		System.out.println(s2.studentInfo());
		
		//선생 1명
		//유병승, 19, 남, 0101234, 경기도 시흥시, 웹프로그래밍, 100, 100
		Teacher t1 = new Teacher("유병승", 19, '남', "0101234", "경기도 시흥시", "웹프로그래밍", 100, 100);
		System.out.println(t1.teacherInfo());
		
		//직원 1명
		//홍길동, 20, 남, 010555, 강원도 산골, 행정팀, 50, 10
		Employee e1 = new Employee("홍길동", 20, '남', "010555", "강원도 산골", "행정팀", 50, 10);
		System.out.println(e1.employeeInfo());
		
	}
	
	public void overrideTest() {
		//override : 메소드를 재정의
		//클래스가 상속관계일 때 부모 클래스에 선언된 메소드를 자식 클래스가 재정의하는 것
		OverrideChild oc = new OverrideChild();
		oc.printMsg();
		
		Teacher t = new Teacher();
		Student s = new Student();
		System.out.println(t.info());
//		Person p = t;
//		p.info();
//		p = s;
//		p.info();
		
		//Object 클래스의 메소드를 재정의해서 사용
		//equals : 객체간의 동등성 비교를 하기 위해 선언한 메소드
		//hashCode : 객체의 유일한 값을 정수로 출력(주소)
		//toStirng : 생성된 객체의 대표하는 문자를 반환(필드의 값을 반환)
		//clone : 생성된 객체를 복사
		
		//equals 재정의하기
		Student s1 = new Student("최주영", 26, '남', "010111", "경기도 안양시", "공공데이터", "선생을 갈굼", '상');
		Student s2 = new Student("최주영", 26, '남', "010111", "경기도 안양시", "공공데이터", "선생을 갈굼", '상');
		Student s3 = new Student("정상준", 26, '남', "010222", "서울시 구로구", "공공데이터", "힘들어함", '중');
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
//		BasicTest bt = new BasicTest("test", 100, 10.5);
//		BasicTest bt2 = new BasicTest("test", 100, 10.5);
		
		//toString 메소드 오버라이딩
		//생성된 객체의 정보를 출력해주는 기능을 하는 메소드
		//클래스에 toString이 오버라이딩 되어있으면 변수명을 출력했을 때
		//자동으로 toString() 메소드를 호출하여 지정된 정보를 출력한다.
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s3);
		
		
		//hashCode 재정의
		//객체를 지칭하는 정수값을 출력해주는 함수
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		//clone : 객체복사 메소드
		//깊은복사를 구현
//		oc.clone();
		Student copyStudent = s1.clone();
		System.out.println(s1); 
		System.out.println(copyStudent);
		copyStudent.setAge(50);
		System.out.println(s1);
		System.out.println(copyStudent);
		
		
		//Teacher 
		//t = 유병승, 20, 여, 0101123, 경기도 광명시, 웹프로그래밍, 10, 100
		//t1 = 유병승, 19, 여, 0101123, 경기도 과천시, 웹프로그래밍, 5, 80
		//t3 = 유병승, 20, 여, 0101123, 경기도 이천시, 웹프로그래밍, 10, 100
		//세 객체를 모두 비교해서 같은 객체와 다른 객체를 구분하기
		//조건 : 이름, 나이, 과목, 경력이 동일하면 같은 객체
		//모든 객체의 정보를 변수를 이용해서 출력하기
		
		Teacher t1 = new Teacher("유병승", 20, '여', "0101123", "경기도 광명시", "웹프로그래밍", 10, 100);
		Teacher t2 = new Teacher("유병승", 19, '여', "0101123", "경기도 과천시", "웹프로그래밍", 5, 80);
		Teacher t3 = new Teacher("유병승", 20, '여', "0101123", "경기도 광명시", "웹프로그래밍", 10, 100);
		System.out.println(t1.equals(t2));
		System.out.println(t2.equals(t3));
		System.out.println(t3.equals(t1));
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}
	
	//StudentManage 업데이트
	//1. 저장된 학생과 동일한 학생은 저장하지 않는다.
	//2. 출력시 infoStudent()를 변수로 대체하기(변수만 써도 출력 가능하게)
	
	
}

