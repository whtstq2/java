package com.ktds.cepark;

public class Army {
	
	public final String JOB ="��������";
	//���������̶�� �����͸� JOB���� 

	public Person makeArmy(String name) {
		//army�� ��ȯ���� Person�̴�.
		
		//�ܺο��� ���޹��� �̸��� �̿��� person ��ü�� �����Ѵ�
		//�ܺο��� ���޹��� �̸��� �Ķ���� ���ڿ�
		Person army = new Person(name, JOB);
		//�����ε��� �����ڸ� �̿�
		
		
		// ������ person ��ü�� ��ȯ�Ѵ� 
		return army;
	}
	
	
	
	
}
