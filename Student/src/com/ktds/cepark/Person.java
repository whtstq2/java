package com.ktds.cepark;

public class Person {
	
	private String names;
	private String job;
	/*	name ="�͸�";
		job ="�˼� ����"; */
	
	public Person () {
		System.out.println("Person �⺻ ������ �����!");
		
	}
	
	public Person (String name, String job) {
		System.out.println("Person ������ �����!");
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
		
		String message = String.format ("�̸� : %s, ����: %s",names,job);
		System.out.println(message);
	}
	
	
	

}
