package com.ktds.cepark;

public class Calculator {
	
	
	public void printComputeResult () {
		int result = 1+1;
		System.out.println(result);
	}
	/**
	 * printComputeResult method over loading
	 * �޼ҵ��� �̸��� ������ �Ķ������ ������ ������ �ٸ� �޼ҵ� 
	 * 
	 * @param numberOne
	 * @param numberTwo
	 */
	
	public void printComputeResult (int numberOne, int numberTwo) {
		int result = numberOne+ numberTwo;
		System.out.println(result);
	}
/**
 * 
 * ���� �ΰ��� ���� �޾� ���� �� ����ϰ� ��ȯ�Ѵ�
 * 
 * @param numberOne : int ù��° ����
 * @param numberTwo : int �ι�° ����
 * @return numberOne*numberTwo
 */
	public int printMultiplicationResult (int numberOne, int numberTwo) {
		int result = numberOne*numberTwo;
		System.out.println(result);
		return result;
	}
	
	
	
}
