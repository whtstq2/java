package com.ktds.cepark;

public class Army {
	
	public final String JOB ="직업군인";
	//직업군인이라는 데이터를 JOB으로 

	public Person makeArmy(String name) {
		//army의 반환형은 Person이다.
		
		//외부에서 전달받은 이름을 이용해 person 객체를 생성한다
		//외부에서 전달받은 이름은 파라미터 문자열
		Person army = new Person(name, JOB);
		//오버로딩된 생성자를 이용
		
		
		// 생성된 person 객체를 반환한다 
		return army;
	}
	
	
	
	
}
