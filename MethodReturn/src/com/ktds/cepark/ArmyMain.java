package com.ktds.cepark;

public class ArmyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//군인 객체를 만들어주는 클래스
		Army army = new Army();
		
		Person kdj = army.makeArmy("김도준");
		//반환되는 타입이 프리미티브에서 레퍼런스 타입으로 바뀜
		System.out.println(kdj.getName());
		System.out.println(kdj.getJob());
		
		Person jsm = army.makeArmy("조성만");
		System.out.println(jsm.getName());
		System.out.println(jsm.getJob());
	}

}
