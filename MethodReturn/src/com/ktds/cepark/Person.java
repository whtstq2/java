package com.ktds.cepark;

public class Person {
	
	private String name;
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
		this.name = name;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	/*GETTER
	 * public ������_�������Ÿ�� set ������_�������_�� () {
	 * 	return ������_���������;
	 * }
	 */
	public String getName() {
		return this .name;
	}
	
	public String getJob() {
		return this.job;
	}
	
	
	
	public void introduce() {
		
		String message = String.format ("�̸� : %s, ����: %s",name,job);
		System.out.println(message);
	}
	
	
	

}
