package com.array.controller;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ArrayController {
	public void basicArray() {
		//기본배열 활용하기
		//배열은 기본으로 제공되는 저장공간으로 생성(new)해서 사용을 한다.
		//배열의 저장구조는 선형구조임.
		//저장순서가 있고 저장소를 지칭하는 번호(인덱스)를 가진다.
		//배열 선언하기
		//배열자료형 -> 기본자료형[]
		int[] intArr; //배열을 저장할 수 있는 변수를 선언
//		intArr = 10; 안돼!! 타입 다름(int랑 int배열)
		//원하는 크기만큼의 배열을 생성해서 할당을 해야한다.
		//배열생성하기 -> new연산자를 이용해서 생성!
		//new 자료형[원하는 개수(길이)]
		intArr = new int[3]; //intArr 에는 주소저장
		//기본으로 생성했을 때 각 저장소는 자료형의 기본값으로 초기화된다.
		//정수형(byte, short, int, long) : 0으로 초기화
		//실수형(float, double) : 0으로 초기화
		//문자열(String) : null 로 초기화
		//문자(char) : ' ' -> 공백으로 초기화
		
		//배열생성 후 각 저장공간 활용하려면
		//인덱스 번호로 각 저장공간을 불러올 수 있다.
		//인덱스 번호는 선언한 길이에 -1한 있다.
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		//초과한 인덱스번호를 호출하면??
//		System.out.println(intArr[3]); 
		//Exception 인덱스 번호 초과범위뜨면 길이를 바꾸거나 인덱스 번호 바꾸기
		
		//배열에 값 저장하기
		intArr[0] = 1;
		intArr[1] = 200;
		intArr[2] = -5;
		
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		
		//친구이름 저장하기
		//친구 3명의 이름을 저장하는 배열을 만들고
		//자신의 스터디원을 저장 후 출력하기
		String names[];
		names = new String[3]; 
//		String[] names = new String[3]; //한 번에 선언
		
		names[0] = "김중근";
		names[1] = "윤준호";
		names[2] = "홍승우";
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);

		names[0].length();
		names[0].charAt(0);
				
		//for문과 같이 배열이용하기
		for(int i = 0; i < 3; i++) {
			System.out.println(intArr[i]);
		}
		
		//for문 이용해서 이름출력하기
		for(int i = 0; i < 3; i++) { //(int i = 0; i < names.length; i++) 할당된만큼만 불러옴
			System.out.println(names[i]);
		}
		//배열에서 저장소의 길이를 제공하는 변수가 있음.
		//배열변수명.length;
		System.out.println(intArr.length);
		System.out.println(names.length);
		
		
		//반복문을 이용해서 배열을 초기화
		//int형 배열 10개를 할당하고 각 저장공간에 1~10까지 수를 대입하기
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//학생 5명의 키를 입력받아 저장하는 기능 구현하기
		//저장 후 출력하기
		Scanner sc = new Scanner(System.in);
		
//		double[] height = new double[5]; //인원 수 바뀌면 [] 안 수만 변경하면 아래 변수 수정 안해도 됨
//		for(int i = 0; i < height.length; i++) {
//			System.out.print("키 : ");
//			height[i] = sc.nextDouble();
//		}
//		for(int i = 0; i < height.length; i++) {
//			System.out.print(height[i] + " ");
//		}
//		System.out.println();
		
		//배열선언시에 대입할 값이 정해져잇다면
		//배열선언과 동시에 값을 초기화할 수 있다.
		char[] alpha = {'a', 'b', 'c', 'd', 'e'}; //1번 선언방법
		for(int i = 0; i < alpha.length; i++)
			System.out.println(i + " " + alpha[i]);
		
		char[] alpha2 = new char[] {'A', 'B', 'C', 'D'}; //2번 선언방법
		for(int i = 0; i < alpha2.length; i++) {
			System.out.println(i + " " + alpha2[i]);
		}
		
//		alpha = {'가', '나', '다', '라'}; -> 선언한 뒤 값 수정 불가능
		alpha = new char[] {'가', '나', '다', '라'}; //-> 선언 초기화 다시하는 법(heap 영역에 새로운 char 생김)
		
		
		//배열의 단점 : 배열은 한번 선언된 길이는 변경되지 않는다.
		String[] names2 = new String[3];
		names2[0] = "유병승";
		names2[1] = "홍길동";
		names2[2] = "피카츄";
//		names3[3] = "리자몽"; -> 자동으로 길이가 증가하지 않는다.
		names2 = new String[4]; //이전의 데이터가 사라짐
		
		//배열은 저장된 데이터를 전체 순회해서 원하는 데이터를 찾을 수 있음.
		int[] numbers2 = {10, 20, 30, 40, 50, 60};
		
		//30이상인 값의 개수를 구하는 기능
		int count = 0;
		for(int i = 0; i < numbers2.length; i++) {
			if(numbers2[i] >= 30) {
				count++;
			}
		}
		System.out.println("30이상인 수의 개수 : " + count);
		
		//저장된 학생이름 중 김씨 학생의 수를 구하는 기능
		//버전업 사용자가 요청한 성씨를 학생수를 구하는 기능
//		String[] studentName = {"김현영", "김찬은", "김중근", "김재훈","김예린", "강민기", "윤지환",
//				"윤준호", "윤나라", "나빈", "이성진", "이동제", "이다영", "조윤진", "정상준", "이은지"};
//		
//		int count2 = 0;
//		System.out.print("찾을 성씨를 입력하세요. : ");
//		char fName = sc.next().charAt(0);
//	
//		for(int i = 0; i < studentName.length; i++) {
//			if(studentName[i].charAt(0) == fName) {
//				count2++;
//			}
//		}
//		System.out.println(fName + "씨 성을 가진 학생 수 : " + count2);
		
		
		//정수 10개를 랜덤으로 저장하는 기능 만들기
		//1~100 수를 랜덤하게 저장
		Random r = new Random();
		
		int[] su = new int[10];
		
		for(int i = 0; i < su.length; i++) {
			int ran = r.nextInt(100) + 1; //(int)(Math.random() * 100) + 1; 로도 가능
			su[i] = ran;
			System.out.print(ran + " ");
		}
		System.out.println();
		//최대값, 최소값을 찾아내기 
		int maxNum = su[0];
		int minNum = su[0];
				
		for(int i = 0; i < su.length; i++) {
			if(su[i] > maxNum) {
				maxNum = su[i];
			}
		}
		System.out.println("최대값 : " + maxNum);
		
		for(int i = 0; i < su.length; i++) {
			if(su[i] < minNum) {
			}
		}
		System.out.println("최소값 : " + minNum);
		
		//배열은 선형구조로 순서가 있음
		//순서는 인덱스번호를 기준으로 순서를 정함
		//값을 정렬할 수 있다. -> 정렬 알고리즘 따로 공부
		//배열의 저장값 위치변경하기 -> swap
		int[] testArr = {4, 3, 6, 2, 7, 5, 1};
		for(int i = 0; i < testArr.length; i++) {
			System.out.print(testArr[i] + " ");
		}
		
//		int temp = testArr[0]; -> 정렬 변경
//		testArr[0] = testArr[1];
//		testArr[1] = temp;
		
//		for(int i = 0; i < testArr.length; i++) {
//			for(int j = 0; j < i; j++) {
//				if(testArr[i] < testArr[j]) { //거꾸로 바꿀 땐 부등호 수정
//					int t = testArr[i];
//					testArr[i] = testArr[j];
//					testArr[j] = t;
//					
//				}
//			}
//		} 
		System.out.println();
		for(int i = 0; i < testArr.length; i++) {
			System.out.print(testArr[i] + " ");
		}
		
		Arrays.sort(testArr); //정렬 기능 제공  
		System.out.println();
		for(int i = 0; i < testArr.length; i++) {
			System.out.print(testArr[i] + " ");
		}
		
		//배열 길이를 정하면 고정
		String[] oriName = {"유병승", "홍길동", "김유신"};
		oriName = new String[6];
		
	}
	
	public void arraysCopyTest() {
		//배열의 복사를 알아보자.
		//배열의 복사
		//1. 얕은 복사 : 원본값을 공유하는 방식
		//2. 깊은 복사 : 별도의 저장공간을 생성해서 데이터를 따로 관리하는 방식
		int[] num = {1, 2, 3, 4, 5};
		
		//얕은 복사 -> 주소를 복사
		int[] copyNum = num;
		System.out.println(num); //변수 이름만 쓰면 주소 값인 것을 확인
		System.out.println("num " + Arrays.toString(num)); //전체 값 확인가능
		System.out.println("copyNum " + Arrays.toString(copyNum));
		System.out.println("num[0] : " + num[0]);
		System.out.println("copyNum[0] : " + copyNum[0]);
		//얕은 복사는 주소값을 공유하기 때문에 저장소가 한 개!
		num[0] = 100;
		System.out.println("num[0] : " + num[0]);
		System.out.println("copyNum[0] : " + copyNum[0]);
		
		//깊은 복사 -> 값 자체를 복사해서 새로운 저장소에 저장(원본, 사본 나뉨)
		int[] deepCopy = new int[num.length];
		for(int i = 0; i < num.length; i++) {
			deepCopy[i] = num[i];
		}
		System.out.println("num : " + Arrays.toString(num));
		System.out.println("deepCopy : " + Arrays.toString(deepCopy));
		num[1] = 200;
		System.out.println("num : " + Arrays.toString(num));
		System.out.println("deepCopy : " + Arrays.toString(deepCopy));
		
		//java에서 제공하는 기능을 이용해서 깊은 복사하기
		//Arrays클래스에서 제공하는 copyof() 기능 이용하기
		int[] copy2 = Arrays.copyOf(num,num.length); //num을 기준으로 num.lenght번 까지 복사할거야
		//만약 num.length 에 2 가 들어가면 아래 copy2[3]은 에러가 남.
		//그 길이까지만 복사하기 때문에
		System.out.println("copy2 : " + Arrays.toString(copy2));
		copy2[3] = -100;
		System.out.println("num : " + Arrays.toString(num));
		System.out.println("copy2 : " + Arrays.toString(copy2));
		
		//배열 전체를 깊은 복사할 때는 clone() 이용해도 된다.
		copy2 = num.clone();
		System.out.println("copy2 : " + Arrays.toString(copy2));
		
		//System.arraycopy() 이용하기
		//첫 번째 : 원본 배열
		//두 번째 : 원본 배열의 시작 인덱스
		//세 번째 : 복사될 배열
		//네 번째 : 복사될 배열의 시작 인덱스
		//다섯 번째 : 복사할 데이터 수(길이)
		String[] names = {"유병승", "홍길동", "김유신"}; //3개
		String[] extend = new String[names.length + 5]; //3+5=8개
		System.arraycopy(names, 0, extend, 3, names.length);
		for(int i = 0; i < extend.length; i++) {
			System.out.print(extend[i] + " ");
		}
		System.out.println();
		
		
	}
	
	public void doubleArray() {
		//2차원 배열에 대해 알아보자
		//배열저장소 두 개가 연결되어있는 구조
		//저장소는 바둑판처럼 저장구조를 가지고 있음
		int[][] intArr;
		intArr = new int[3][3];
		System.out.println(intArr);
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[0][0]);
		System.out.println(intArr[0][1]);
		System.out.println(intArr[0][2]);
		System.out.println(intArr[1][0]);
		System.out.println(intArr[1][1]);
		System.out.println(intArr[1][2]);
		
		for(int i = 0; i < intArr.length; i++) {
			for(int j = 0; j < intArr[i].length; j ++) {
				System.out.print(intArr[i][j]);
			}
			System.out.println();
		}
		intArr[0][0] = 1;
		intArr[0][1] = 2;
		intArr[0][2] = 3;
		intArr[1][0] = 4;
		intArr[1][1] = 5;
		intArr[1][2] = 6;
		intArr[2][0] = 7;
		intArr[2][1] = 8;
		intArr[2][2] = 9;
		for(int i = 0; i < intArr.length; i++) {
			for(int j = 0; j < intArr[i].length; j++) {
				System.out.print(intArr[i][j]);
			}
			System.out.println();
		}
		
		//3*3 2차원 배열을 생성하고
		//123
		//123
		//123 을 각 인덱스에 저장하고 출력하기
		int[][] su = new int[3][3];
		for(int i = 0; i < su.length; i++) {
			for(int j = 0; j < su[i].length; j++) {
				System.out.print(su[i][j] = j + 1);
			}
			System.out.println();
		}
		
		//1 2 3 4
		//5 6 7 8
		//9101112 를 저장하고 출력하기
		int[][] su2 = new int[3][4];
//		for(int i = 0; i < su2.length; i++) {
//			for(int j = 0; j < su2[i].length; j++) {
//				System.out.print(su2[i][j] = i * 4 + j + 1);
//			}
//			System.out.println();
//		}
		
		int count=0;
		int[][] numbers3 = new int[3][4];
		
		for(int i=0;i<numbers3.length;i++) {
			for(int j=0;j<numbers3[i].length;j++) {
				numbers3[i][j]=++count;
			}
		}
		
		for(int i=0;i<numbers3.length;i++) {
			for(int j=0;j<numbers3[i].length;j++) {
				//System.out.printf("%-2d ",numbers3[i][j]);
				if(numbers3[i][j]<10) {
					System.out.print("0"+numbers3[i][j]+" ");
				}else {
					System.out.print(numbers3[i][j]+" ");
				}
			}
			System.out.println();
		}
		
		//2차원배열의 선언과 동시에 초기화
		String[][] study = {{"김중근", "홍승우", "윤준호", "김현영"},
							{"김찬은", "홍성현", "나빈", "이성진"},
							{"김재훈", "이다영", "조장흠"},
							{"김예린", "윤나라", "최인호", "최주영", "이동제"},
							{"강민기", "윤지환", "최솔"},
							{"조윤진", "정상준", "최하리", "이은지"}};
		for(int i = 0; i < study.length; i++) {
			for(int j = 0; j < study[i].length; j++) {
				System.out.print(study[i][j] + " ");
			}
			System.out.println();
		}
		
		//최주영의 조를 찾기
		for(int i = 0; i < study.length; i++) {
			for(int j = 0; j < study[i].length; j++) {
				if(study[i][j].equals("최주영")) {
					System.out.println("조 : " + (i + 1) + "\n인원 : " + study[i].length + "명");
					break;
				} 
			} 
		}
		
		
		//입력받은 사람의 조를 찾기
		//없는 이름을 입력하면 없는 조원입니다. 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		String msg = "없는 조원입니다.";
		
//		int j = 0 ;
//		for(int i = 0; i < study.length; i++) {
//			for(j = 0; j < study[i].length; j++) {
//				if(study[i][j].equals(name)) {
//					msg = "조 : " + (i + 1) + "\n인원 : " + study[i].length + "명";
//					break;
//				} 
//			} 
//		}
//		System.out.println(msg);
		
		
		//+조원 이름 나열
		int j = 0 ;
		for(int i = 0; i < study.length; i++) {
			for(j = 0; j < study[i].length; j++) {
				if(study[i][j].equals(name)) {
					msg = "\n조 : " + (i + 1) + "\n인원 : " + study[i].length + "명";
					for(int k = 0; k < study[i].length; k++) {
						System.out.print(study[i][k] + " ");
						//or msg += Arrays.toString(study[i]); -> 배열이기 때문에
					}
				} 
			} 
		}
		System.out.println(msg);
		
	}
	
	//배열에 대한 배열 데이터에 순회할 때 편리하게 해보자.
	public void extraTest() {
		int[] intArr = {1, 2, 3, 4, 5, 6};
		//기본 for문 이용해서 각 인덱스에 접근함
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		//forEach문을 이용해서 데이터 순회하기
		//for(자료형 변수명 : 배열명 || CollectionFramework) { }
		System.out.println("forEach문을 이용해서 출력하기");
		for(int d : intArr) {
			if(d % 2 == 0) {
				System.out.println(d);
			}
		}
		//forEach문은 배열에 있는 값을 수정할 때는 사용할 수 없다.
		String[] hobby = {"농구", "자전거", "게임", "코딩"};
		for(String h : hobby) {
			if(h.equals("코딩")) h = "운동"; //안바뀜 h는 지역변수이기도 해서 직접 배열 주소에서 수정해야함.
		}
		
		//배열에 중복값 없이 저장하기
		//임의의 정수 10개 저장하기(1~50)
		int[] random = new int[10];
		for(int i = 0; i < random.length; i++) {
			random[i] = (int)(Math.random() * 10) + 1;
			for(int j = 0; j < i; j++) {
				if(random[i] == random[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i : random) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//로또 만들기
		//1~45 번호를 중복값 없이 6자리 저장		
		Random r = new Random();
		
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int l : lotto) {
			System.out.print(l + " ");
		}
		System.out.println();
		
//		up&down게임만들기
//		랜덤으로 1~50까지의 수중 한개를 저장
//		사용자에게 값을 입력받아 랜덤값과 비교하고 랜덤값이 크면 up출력
//		작으면 Down출력 맞추면 정답입니다!! 짝짝짝! 출력 정답을 맞출때까지 진행!
		
//		Scanner sc = new Scanner(System.in);
//		
//		int ran = r.nextInt(50) + 1; //랜덤값
//		System.out.println(ran);
//		int su = 0;
//		while(ran != su) {
//			System.out.print("값 입력 : ");
//			su = sc.nextInt();
//			if(ran < su) {
//				//up
//				System.out.println("up!");
//			} else if(ran > su) {
//				//down
//				System.out.println("down!");
//			} else {
//				System.out.println("정답입니다!! 짝짝짝!");
//				//정답
//			}
//		}
		
		
		
	}
}
