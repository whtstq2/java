package com.ktds.cepark.explore;
/**
 * //안의 폴더마다 반복하여 내용물을 확인한다 
		// 폴더면 다시 하위 폴더를 확인하고 파일이면 파일명을 출력한다 
 */

import java.io.File;

public class FileSystemExplore3 {
	
	public void printFileSystem( String path)  {
		
		//1.File 객체 생성 (path 정보를 가지는 파일을 만듬)
		File directory = new File(path);
		
		//1-1. directory 안의 내용을 탐색
		String [] contents = directory.list(); //list()라는 메소드는 String을 인식하니까 
		File file = null; // 변수 선언은 반복문 안에 만들지 않는다  레퍼런스의 초기 값은 null로 
		
		for (String content : contents) {
			//문자열을 파일 객체로 바꿔주어 밑의 if구문을 실행 할 수 있게 한다 
			//content와 
			file = new File(directory.getAbsolutePath() + File.separator + content);
			
		
		//2. directory 객체의 내용이 폴더인지 파일인지 구분한다
		if ( file.isDirectory()) {
			//2-1. 폴더일 경우 폴더 내부를 검색
			printFileSystem(file.getAbsolutePath());
		}
		
		else {
			//2-2. 파일일 경우 파일의 경로를 출력 
			System.out.println(file.getAbsolutePath());
			
		}
		}
		
	}
	
	
	
	
	

}
