package com.ktds.cepark;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person khw = new Person();
		//public person �����ڰ� ����ȴ� �����͸� �⺻���� �־� �ְ� �ʹ� �ϸ� 
		// Person() �ȿ� �����͸� �־��ָ�ȴ� 
		//���� person�ҽ����Ͽ� �߰����� ������ �����ϵɶ� �˾Ƽ� ���Ƿ� �����ȴ�  
		khw.setName("������");
		khw.setJob("���α׷���");
		khw.introduce();
		
		Person ibj = new Person ();
		ibj.setName("�κ���");
		ibj.setJob("�౸����");
		ibj.introduce();
		
		Person pmw = new Person ();
		pmw.setName("�ڹο�");
		pmw.setJob("���");
		pmw.introduce();
		
		
		Person unknown = new Person();
		unknown.introduce();
		
		Person ksk = new Person("�载��", "����");
		ksk.introduce();
	}

}
