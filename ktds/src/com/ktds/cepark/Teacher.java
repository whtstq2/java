package com.ktds.cepark;

public class Teacher {

	
	

	public void teach(String subject, Student student) {
		// TODO Auto-generated method stub
		
		System.out.println(subject + "를 가르칩니다");
		student.study(subject); // 학생이 과목을 공부한다 
	}
	
	
	
}
