package com.ktds.cepark;

public class Person {
	
	private String names;
	private String job;
	/*	name ="익명";
		job ="알수 없음"; */
	
	public Person () {
		System.out.println("Person 기본 생성자 실행됨!");
		
	}
	
	public Person (String name, String job) {
		System.out.println("Person 생성자 실행됨!");
		setName(name);
		setJob(job);
	}
	
	public void setName(String name) {
		this.names = name;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	
	public void introduce() {
		
		String message = String.format ("이름 : %s, 직업: %s",names,job);
		System.out.println(message);
	}
	
	
	

}
