package com.ktds.cepark;

public class ArmyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���� ��ü�� ������ִ� Ŭ����
		Army army = new Army();
		
		Person kdj = army.makeArmy("�赵��");
		//��ȯ�Ǵ� Ÿ���� ������Ƽ�꿡�� ���۷��� Ÿ������ �ٲ�
		System.out.println(kdj.getName());
		System.out.println(kdj.getJob());
		
		Person jsm = army.makeArmy("������");
		System.out.println(jsm.getName());
		System.out.println(jsm.getJob());
	}

}
