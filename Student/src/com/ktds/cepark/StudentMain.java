package com.ktds.cepark;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WhatStudentDo sjm = new WhatStudentDo();
		//sjm.name = "�����"; 
		sjm.setName("�����");
		//���� ���� �̸��� �����ڰ� �ƴ϶�� ������ �̸��� ���´� 
		
		sjm.play();
		
		WhatStudentDo course = new WhatStudentDo();
		//���� ���� ������ ��ĭ�̸� ������ �̸��� ���´� 
		course.setName("Tim");
		
		course.setCourse("Math");
		
		course.play();
		course.study();
		
	}

}
