package com.io.controller;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;

public class IOController {
	
	public void filetest() {
		//java코드로 file(하드에 저장되어있음)을 다룰 수 있는 File클래스에 대해 알아보자.
		//1. File클래스 생성하기
//		File f = new File("test.txt"); //항상 매개변수(파일 경로)와 함께 생성, 상대경로 지정시 프로젝트 파일에 생성
		File f = new File("c:/Users/GDJ/wowfile.txt"); //절대경로
		//2. 지정된 파일 생성하기
		//createNewFile()메소드를 이용
		try{
			f.createNewFile(); //꼭 예외처리 해주기(try, catch)
			System.out.println("파일생성완료");
		} catch(IOException e) {
			e.printStackTrace(); //에러구문 출력
			System.out.println("파일생성실패");
		}
		//3. 내가 원하는 폴더 생성하기
		//mkdir(), mkdirs()메소드가 있음
		//mkdir() : 한 개 폴더만 생성할 수 있음
		//mkdirs() : 하위 폴더까지 여러 개의 폴더를 생성할 수 있음
		File dir = new File("../myfolder/a/b");
//		boolean result = dir.mkdir(); //boolean 반환
		boolean result = dir.mkdirs();
		System.out.println(result);
		
		//상대경로
		// ./ : 현재경로, 현재파일이 있는 위치와 동일한 위치
		// ../ : 상위폴더(바로 위에 있는)
		
		//절대경로 : root부터 전부 작성하는 것
		
		//사용자에게 폴더와 파일명을 입력받아 생성해주는 기능 구현
//		Scanner sc = new Scanner(System.in);
//		System.out.print("파일명 : ");
//		String fileName = sc.nextLine();
//		System.out.print("폴더명 : ");
//		String path = sc.nextLine();
//		makeFile(path, fileName);
		
		//file 삭제하기
		//File클래스에서 제공하는 delete()메소드를 이용함
		File delFile = new File("bs/bsfile.txt");
		delFile.delete();
		File delDir = new File("bs");
		delDir.delete();
		
		//이미 있는 파일에 대한 정보확인하기
		File info = new File("./myfolder/a/b/test.txt");
		//1. 파일명 확인 -> getName()
		System.out.println("파일명 : " + info.getName());
		//2. 부모파일명 확인 -> getParent()
		System.out.println("부모전체파일명 : " + info.getParent());
		//2-1. 부모파일을 File로 가져오기
		File parent = info.getParentFile();
		System.out.println("부모파일명 : " + parent.getName());
		//3. 경로 가져오기 -> getPath()
		System.out.println("경로가져오기 : " + info.getPath());
		//4. 불러온 파일이 폴더인지 파일인지 확인 -> isDrectory(), isFile()
		System.out.println("info 폴더니?" + info.isDirectory());
		System.out.println("info 파일이니?" + info.isFile());
		System.out.println("parent 폴더니?" + parent.isDirectory());
		System.out.println("parent 파일이니?" + parent.isFile());
		//5. 각종 정보확인
		//파일크기, 숨긴 파일 여부, 수정한 날짜, 절대경로
		System.out.println(info.length());
		System.out.println(info.isHidden());
		System.out.println(new Date(info.lastModified()));
		System.out.println(info.getAbsolutePath());
		System.out.println(info.canRead()); //읽기전용
		System.out.println(info.canExecute()); //실행할 수 있니?
		System.out.println(info.canWrite()); //수정할 수 있니? 
		
	}
	
	public void makeFile(String path, String fileName) {
		File dir = new File(path); //폴더 객체 생성
		File file = new File(path + "/" + fileName); //파일객체를 생성
		try {
			dir.mkdirs();
			file.createNewFile();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileManage() {
		File f = new File("c:/Windows/System32");
		//폴더에 있는 전체파일목록을 가져오기
		//문자열로 파일명을 가져오기
		String[] files = f.list();
		System.out.println(files.length);
		for(String fileName : files) {
			if(fileName.substring(fileName.indexOf(".") + 1).equals("exe")) {
				System.out.println(fileName);
			}
//			File temp = new File(fileName);
		}
		//File클래스로 가져오기
		File[] filesObj = f.listFiles();
		int count = 0;
		for(File temp : filesObj) {
//			System.out.println(temp);
			//실행용파일이 몇 개인지 출력하기
			if(!temp.canWrite()) {
				count++;
			}
		}
		System.out.println("실행용 파일 : " + count);
		
//		filesObj = f.listFiles(new FileFilter() {
//			@Override //필터 내 메소드 가져옴, 컨트롤 + 스페이스
//			public boolean accept(File pathname) {
//				// TODO Auto-generated method stub
//				return !pathname.canWrite();
//			}
//		});
		filesObj = f.listFiles((name) -> !name.canWrite());
		
		for(File temp: filesObj) {
			System.out.println(temp);
		}
		
		files = f.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
			// TODO Auto-generated method stub
			return name.contains("exe");
			}
		});
		files = f.list((dir, name) -> name.contains("exe"));
		
	}
}
