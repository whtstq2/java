package com.ktds.cepark;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person khw = new Person();
		//public person 생성자가 실행된다 데이터를 기본으로 넣어 주고 싶다 하면 
		// Person() 안에 데이터를 넣어주면된다 
		//만약 person소스파일에 추가하지 않으면 컴파일될때 알아서 임의로 생성된다  
		khw.setName("김형우");
		khw.setJob("프로그래머");
		khw.introduce();
		
		Person ibj = new Person ();
		ibj.setName("인병주");
		ibj.setJob("축구선수");
		ibj.introduce();
		
		Person pmw = new Person ();
		pmw.setName("박민우");
		pmw.setJob("백수");
		pmw.introduce();
		
		
		Person unknown = new Person();
		unknown.introduce();
		
		Person ksk = new Person("김슬기", "감독");
		ksk.introduce();
	}

}
