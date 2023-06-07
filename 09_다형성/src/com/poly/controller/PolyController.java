package com.poly.controller;

import java.util.Scanner;

import com.poly.model.vo.AbstractChildClass;
import com.poly.model.vo.AbstractClassTest;
import com.poly.model.vo.Animal;
import com.poly.model.vo.Cat;
import com.poly.model.vo.Chicken;
import com.poly.model.vo.Cow;
import com.poly.model.vo.Dog;
import com.poly.model.vo.DynamicBindTest;
import com.poly.model.vo.Employee;
import com.poly.model.vo.Person;
import com.poly.model.vo.PolyTest;
import com.poly.model.vo.PolyTest2;
import com.poly.model.vo.PolyTestParent;
import com.poly.model.vo.Student;
import com.poly.model.vo.Teacher;

public class PolyController {
	
	public void basicTest() {
		//다형성에 대해 알아보자
		//상속관계에 있는 클래스의 부모클래스 타입으로 선언된 변수에는
		//자식클래스 객체를 저장할 수 있게 하는 기술
		PolyTestParent ptp = new PolyTestParent();
		ptp = new PolyTest(); //상속관계일 때 저장가능!
		ptp = new PolyTest2();
		
		Object o; //최상위 클래스 뭐든 저장가능
		o = new PolyTestParent();
		o = new String("이것도 저장되니?");
		o = new Scanner(System.in);
		
		//자식클래스로 선언된 변수에는 부모클래스의 객체를 저장할 수 있을까?
		//불가능하다.
		PolyTest pt;
//		pt = new PolyTestParent();
		
		//부모타입에 저장된 자식클래스는 업캐스팅되어 저장되기 때문에 
		//자식클래스가 선언한 내용(메소드, 변수 등)을 읽을 수 없다.
		ptp = new PolyTest();
		
		ptp.setParentData("부모멤버에 저장");
		String temp = ptp.getParentData();
		System.out.println(temp);
		
		//자식메소드에 접근하기 -> 불가능
//		ptp.setChildData("부모타입에서 저장시키기");
		
		PolyTest pt2 = new PolyTest();
		pt2.setChildData("저장하기");
		pt2.setParentData("부모접근하기");
		
		//부모타입에 저장된 자식클래스객체의 멤버메소드에 접근하려면
		//형변환을 해야한다.
		pt2 = (PolyTest)ptp;
		System.out.println(pt2.getChildData());
		System.out.println(pt2 == ptp); //true -> 얕은 복사
		
//		ptp = pt2;		ptp -> PolyTestParent/ pt2 -> PolyTest
//		ptp.getChildData();
		
		ptp = (PolyTest)ptp;
//		ptp.getChildData(); //형변환 
		
		ptp = new PolyTest2(); //ptp에는 많은 클래스가 저장되어있음
		((PolyTest2)ptp).getPolyTest(); //접근하기 위해 형변환
		
	}
	
	public void testPerson() {
		Person p;
		p = new Student("유병승", 19, 1, "실용음악");
		System.out.println(p.getName() + " " + p.getAge() + " " +
				((Student)p).getGrade() + " " + ((Student)p).getMajor());
				//우선순위 확인 (Student)p.getGrade()는 . 이 우선이라 에러
//		p = new Teacher("유병승", 19, "웹프로그래밍", 100);
//		System.out.println(p.getName() + " " + p.getAge() + " " + 
//				((Teacher)p).getSubject() + " " + ((Teacher)p).getSalary());
		
		printPerson(p);
		printPerson(new Student("최주영", 26, 2, "컴공"));
		printPerson(new Teacher("유병승", 19, "web", 100));
//		printPerson(new PolyTest()); //Person을 상속받은 객체에 대해서만 받을 수 있음
		printPerson(new Employee());
		
		PolyTestDao dao = new PolyTestDao(new Teacher());
		PolyTestDao dao2 = new PolyTestDao(new Student());
		
		Teacher t = new Teacher("유병승", 19, "web", 100);
		Teacher t2 = new Teacher("유병승", 20, "web", 100);
		System.out.println(t.equals(t2)); //t를 넣을 수 있는 건 equals에 Object로 선언
		
		
	}
	
	public void printPerson(Person p) {
		//instancecof
		if(p instanceof Student) {
		System.out.println(p.getName() + " " + p.getAge() + " " + 
				((Student)p).getGrade() + " " + ((Student)p).getMajor());
		} else if(p instanceof Teacher) {
			System.out.println(p.getName() + " " + p.getAge() + " " + 
					((Teacher)p).getSubject() + " " + ((Teacher)p).getSalary());
		}
		
	}
	
	public Person makePerson(int type) {
		Person p;
		switch(type) {
			case 1 : p = new Student(); break;
			case 2 : p = new Student(); break;
			case 3 : p = new Teacher(); break;
			case 4 : p = new Employee(); break;
			default : p = null; break;
		}
		return p;
	}
	
	public void objArrPolyTest() {
		//객체배열의 다형성 적용하기
		Person[] persons = new Person[9]; //t + s + e
		persons = new Person[] {
				new Student("최주영", 26, 2, "컴공"),
				new Student("이동제", 25, 1, "자동차"),
				new Teacher("유병승", 19, "web", 100),
				new Teacher("이다영", 25, "java", 80),
				new Employee("김현영", 26, "디자인", "개발자"),
				new Employee("최솔", 29, "연구팀", "개발자")
		};
		
		Teacher[] teachers = new Teacher[4];
		Student[] students = new Student[3];
		Employee[] employees = new Employee[2];
		
		//나이가 20살 이상인 사람 찾기 위해서 하나하나(타입마다) 다 써줘야함
		Teacher[] teacherAge = new Teacher[teachers.length];
		int index = 0;
		for(Teacher t : teachers) {
			if(t != null && t.getAge() >= 20) {
				teacherAge[index++] = t;
			}
		}
		
		
		//다형성을 이용하면 한번에 묶어서 Person으로 찾아낼 수 있음
		index = 0;
		Person[] ageSearch = new Person[persons.length];
		for(Person p : persons) {
			if(p != null && p.getAge() > 25) {
				ageSearch[index++] = p;
			}
		}
		for(Person p : ageSearch) {
			if(p != null) {
				System.out.println(p.getName() + p.getAge());
			}
		}
		
		//persons에 저장된 student, teacher, employee의 수와
		//전체 저장사람 수를 구하시오
		int studentCount = 0;
		int teacherCount = 0;
		int employeeCount = 0;
		int totalCount = 0;

		//내 풀이
//		for(Person p : persons) {
//			if(p instanceof Student) {
//				studentCount++;
//			} else if(p instanceof Teacher) {
//				teacherCount++;
//			} else if(p instanceof Employee) {
//				employeeCount++;
//			}
//		}
//		System.out.println("학생 수 : " + studentCount);
//		System.out.println("선생 수 : " + teacherCount);
//		System.out.println("사원 수 : " + employeeCount);
//		System.out.println("총 인원 수 : " + (studentCount + teacherCount + employeeCount));
	
		//선생님 풀이
		for(int i = 0; i < persons.length; i++) {
			if(persons[i] != null) {
				if(persons[i] instanceof Student) {
					studentCount++;
				} else if(persons[i] instanceof Teacher) {
					teacherCount++;
				} else if(persons[i] instanceof Employee) {
					employeeCount++;
				}
				totalCount++;
			}
		}
		System.out.println("학생 : " + studentCount + " 선생 : " + teacherCount +
				" 사원 : " + employeeCount + " 총 인원 : " + totalCount);
	}
	
	public void dynamicBind() {
		DynamicBindTest dbt = new DynamicBindTest();
		System.out.println(dbt.toString());
		Object obj = new DynamicBindTest();
		//원래는 obj(= Object)를 실행하는게 맞지만 오버라이딩 되어있는 상태이기 때문에 형변환 없이 DynamicBindTest 데이터 출력가능
		System.out.println(obj.toString());
		
		Animal a = new Cat();
//		System.out.println(((Cat)a).catbark());
		a.bark();
		a = new Dog();
//		System.out.println(((Dog)a).dogBark()); //동적바인딩을 사용하면 이렇게 안해도 됨
		a.bark();
		
		//저장된 동물의 울음소리 출력하는 기능
		Animal[] animals = new Animal[10];
		animals[0] = new Dog("뽀삐", "강아지", 6);
		animals[1] = new Cat("뽀송", "고양이", 3);
		animals[2] = new Dog("복실이", "강아지", 7);
		animals[3] = new Cat("뽀짝이", "고양이", 3);
		animals[4] = new Dog("바둑이", "강아지", 5);
		animals[5] = new Cow("워낭소리", "소", 13);
		animals[6] = new Chicken();
		
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] != null) {
				animals[i].bark();
			}
		}
		
		
	}
	
	public void abstractClassTest() {
		//추상클래스 이용하기
		//자료형으로는 이용이 가능하다.
		AbstractClassTest act;
//		act = new AbstractClassTest(); 추상클래스는 생성불가(미완성 클래스)
		act = new AbstractChildClass();
		act.getTitle();
		act.getWriter(); 
		//final = 넌 상속 불가능해 , abstract = 반드시 상속해서 사용해야해
		
	}
	
	
}
