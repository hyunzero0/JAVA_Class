package com.obj.run;

import com.obj.model.vo.Person;

public class ConstructorMain {

	public static void main(String[] args) {
		//클래스의 생성자 활용하기
		//클래스는 생성해서 이용을 해야한다. 
		// 클래스를 생성할때 이용하는것이 생성자다!
		// 모든 클래스선언에는 반드시 생성자선언 코드가 있어야한다.!
		Person p=new Person();//기본생성자를 호출한 구문
		System.out.println(p.name+" "+p.age+" "+p.height
				+" "+p.gender);
		//매개변수있는 생성자 호출하기
		Person p1=new Person("최주영",26,178.4,'여');
		Person p2=new Person("김중근",28,177.3,'여');
		
		System.out.println(p1.name+p1.age+p1.height+p1.gender);
		System.out.println(p2.name+p2.age+p2.height+p2.gender);
		
		//매개변수있는 생성자 이용하기
		//동물정보를 저장할 수 있는 클래스만들기 com.obj.model.vo
		//종류, 이름, 몸무게, 길이, 서식지
		//개 뽀삐 5kg 50cm 우리집
		//고양이 야옹이 3kg 40cm 짬통
		//거북이 꼬북이 1.2kg 5cm 어항속
		//객체를 생성할때 모든값이 세팅되어서 생성될 수 있게 하고
		//해당내용 출력하기
	}

}
