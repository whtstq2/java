package com.ktds.cepark;

public class WhatStudentDo {

	//�Ӽ� ����  �̸�, ����, �����ϴ� ���� 
	
	private String name= "Tom";
	private String course = "JAVA";
	
	
	
	private int grade = 100;
	
	//instance field�� ���ؼ� setter�� ����� �־���Ѵ� 
	/*
	 * name instance field�� ������.
	 */
	public void setName(String name) {
		//�Ķ���ͷ� ���޵� �������� ���̰� 3�̸� ������ ���ش� 
		if (name.length() ==3 ) {
	
		this.name = name;
		}
	}
	public void setCourse(String course) {
		//�Ķ���ͷ� ���޵� �������� ���̰� 0�̸� ������ ���� �ʴ´� 
		if (course.length()!=0) {
			this.course = course;
		}
	}
	
	
	
	public void play() {
			System.out.printf("%s�� ���� ���� ������ �߳�\n",name);
			
			System.out.printf("��Ҵ�\n");
			
			grade = 0;
			
			System.out.printf("%s�� %s������ %d�̴�.\n",name,course, grade);
			
			
		}
	
	public void study() {
			System.out.printf("%s�� ���� ������ ������ �߳� \n", name);
			System.out.printf("�����ߴ�\n");
		
			
			
			grade =100;
			
			System.out.printf("%s�� %s������ %d�̴�.\n",name,course, grade);
			
		}
	
	
		
	
	
}
