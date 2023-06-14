package com.collection.controller;

import java.util.ArrayList;

import com.collection.common.Person;
import com.collection.common.PersonAscending;
import com.collection.common.PersonDecending;

public class PersonController {
		
	public static void main(String[] args) {
		
		
//		1. 위 데이터를 사용자에게 입력받아 리스트에 저장 후 전체 데이터 출력하기
		ArrayList people = new ArrayList();
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.println("==== " + (i + 1) + "번 입력 ====");
//			System.out.print("이름 : ");
//			String name = sc.next();
//			System.out.print("나이 : ");
//			int age = sc.nextInt();
//			System.out.print("성별(남/여) : ");
//			char gender = sc.next().charAt(0);
//			System.out.print("키 : ");
//			double height = sc.nextDouble();
//			System.out.print("몸무게 : ");
//			double weight = sc.nextDouble();
//		
//			persons.add(new Person(name, age, gender, height, weight));
//		}
//		for(int i = 0; i < persons.size(); i++) {
//			System.out.println(persons.get(i));
//		}
		
//		1.처리 후에는 저장하여 사용할것 * 계속입력하지말고 코드로 작성해서 2번 부터는 해결
		people.add(new Person("유병승", 19, '남', 180.5, 65.5));
		people.add(new Person("홍길동", 44, '여', 155.5, 45.5));
		people.add(new Person("고길동", 20, '남', 175.5, 70.5));
		people.add(new Person("선덕여왕", 35, '여', 150.2, 50.5));
		people.add(new Person("김두환", 42, '남', 188.2, 95.5));
		
//		2. 저장한 데이터 중 키가 180이상인 사람의 나이를 1씩 증가 시킨 후 모든 데이터 출력하기
		System.out.println("===== 2. 키 180이상, 나이 +1 =====");
		for(int i = 0; i < people.size(); i++) {
			Person p = (Person)people.get(i);
			if(p.getHeight() >= 180) {
				p.setAge(p.getAge() + 1);
			}
		}
		for(int i = 0; i < people.size(); i++) {
			Person p = (Person)people.get(i);
			if(p.getHeight() >= 180) {
				System.out.println(p);
			}
		}
		
//		3. 나이가 40세 이상인 사람만 출력하기
		System.out.println("===== 3. 나이 40세 이상 =====");
		for(int i = 0; i < people.size(); i++) {
			Person p = (Person)people.get(i);
			if(p.getAge() >= 40) {
				System.out.println(p);
			}
		}
		
//		4. 사원을 이름(내림차순)순으로 정렬하기
		System.out.println("===== 4. 이름 기준 내림차순 =====");
		people.sort(new PersonDecending());
		people.forEach((o) -> System.out.println(o));
		
//		5. 사원을 키(오름차순)순으로 정렬하기
		System.out.println("===== 5. 키 기준 오름차순 =====");
		people.sort(new PersonAscending());
		people.forEach((o) -> System.out.println(o));
		
		
//		6. 2번 인덱스에 최주영,26,남,177.3,70.5 저장하기(추가)
		System.out.println("===== 6. 2번 인덱스에 추가 =====");
		people.add(2, new Person("최주영", 26, '남', 177.3, 70.5));
		for(int i = 0; i < people.size(); i++) {
			System.out.println(i + " " + people.get(i));
		}
		
//		7. 3번 인덱스 값을 이동제,25,175.3,68.3 으로 변경하기
		System.out.println("===== 7. 3번 인덱스 수정 =====");
		people.set(3, new Person("이동제", 25, '남', 175.3, 68.3));
		for(int i = 0; i < people.size(); i++) {
			System.out.println(i + " " + people.get(i));
		}
		
//		8. 고길동, 20, 남, 175.5, 70.5이 리스트에 있는지 확인하고 없으면 추가하기
		System.out.println("===== 8. 고길동 있는지 확인 후 없으면 추가 =====");
		boolean result = people.contains(new Person("고길동", 20, '남', 175.5, 70.5));
		if(!result) {
			//추가
			people.add(new Person("고길동", 20, '남', 175.5, 70.5));
		}	
		people.forEach((o) -> System.out.println(o));
		
		
//		9. 이름이 선덕여왕인 사람의 위치를 찾아서 그 위치에 주몽,58,남,189.4,90.3을 추가하기
		
		
//		10. 4번 인덱스의 사람 삭제하기
		System.out.println("===== 10. 4번 인덱스 삭제 =====");
		people.remove(4);
		for(int i = 0; i < people.size(); i++) {
			System.out.println(i + " " + people.get(i));
		}
		
//		11. 김두환, 42, 남, 188.2, 95.5 사람 삭제하기 //나이 추가돼서 43
		System.out.println("===== 11. 김두환 삭제 =====");
		people.remove(new Person("김두환", 43, '남', 188.2, 95.5));
		for(int i = 0; i < people.size(); i++) {
			System.out.println(i + " " + people.get(i));
		}
		
//		12. 리스트에 값이 있는지 없는지 확인하고 값이 있으면 사람있어요~~ 출력 없으면 사람없어요~~ 출력
		System.out.println("===== 12. 리스트 값 저장유무 =====");
		if(!people.isEmpty()) {
			System.out.println("사람있어요~~");
		} else {
			System.out.println("사람없어요~~");
		}
		
//		13. 리스트에 있는 모든데이터 삭제하기
		System.out.println("===== 13. 모든 데이터 삭제 =====");
		people.clear();
		people.forEach((o) -> System.out.println(o));
	
	}

}
