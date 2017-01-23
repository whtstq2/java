package com.ktds.cepark;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WhatStudentDo sjm = new WhatStudentDo();
		//sjm.name = "고흥수"; 
		sjm.setName("고흥수");
		//만일 안의 이름이 세글자가 아니라면 기존의 이름이 나온다 
		
		sjm.play();
		
		WhatStudentDo course = new WhatStudentDo();
		//만일 안의 과목이 빈칸이면 기존의 이름이 나온다 
		course.setName("Tim");
		
		course.setCourse("Math");
		
		course.play();
		course.study();
		
	}

}
