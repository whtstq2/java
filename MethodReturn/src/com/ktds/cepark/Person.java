package com.ktds.cepark;

public class Person {
	
	private String name;
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
		this.name = name;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	/*GETTER
	 * public 가져올_멤버변수타입 set 가져올_멤버변수_명 () {
	 * 	return 가져올_멤버변수명;
	 * }
	 */
	public String getName() {
		return this .name;
	}
	
	public String getJob() {
		return this.job;
	}
	
	
	
	public void introduce() {
		
		String message = String.format ("이름 : %s, 직업: %s",name,job);
		System.out.println(message);
	}
	
	
	

}
