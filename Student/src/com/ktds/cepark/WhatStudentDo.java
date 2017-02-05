package com.ktds.cepark;

public class WhatStudentDo {

	//속성 정의  이름, 성별, 좋아하는 과목 
	
	private String name= "Tom";
	private String course = "JAVA";
	
	
	
	private int grade = 100;
	
	//instance field에 대해서 setter를 만들어 주어야한다 
	/*
	 * name instance field를 갱신함.
	 */
	public void setName(String name) {
		//파라미터로 전달된 데이터의 길이가 3이면 변경을 해준다 
		if (name.length() ==3 ) {
	
		this.name = name;
		}
	}
	public void setCourse(String course) {
		//파라미터로 전달된 데이터의 길이가 0이면 변경을 하지 않는다 
		if (course.length()!=0) {
			this.course = course;
		}
	}
	
	
	
	public void play() {
			System.out.printf("%s는 시험 전날 무었을 했나\n",name);
			
			System.out.printf("놀았다\n");
			
			grade = 0;
			
			System.out.printf("%s의 %s성적은 %d이다.\n",name,course, grade);
			
			
		}
	
	public void study() {
			System.out.printf("%s는 시험 전날에 무었을 했나 \n", name);
			System.out.printf("공부했다\n");
		
			
			
			grade =100;
			
			System.out.printf("%s의 %s성적은 %d이다.\n",name,course, grade);
			
		}
	
	
		
	
	
}
