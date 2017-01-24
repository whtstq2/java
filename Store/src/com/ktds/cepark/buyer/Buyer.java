package com.ktds.cepark.buyer;

import com.ktds.cepark.seller.Seller;

/**
 * 
 * Seller���� ��ǰ�� �����ϰ� �ݾ��� Seller���� �����Ѵ�
 * 
 * @author ä��
 *
 */
public class Buyer {

	/**
	 * ��ǰ���� ���� ����
	 */
	private int productQuantity;
	
	/**
	 * �����ڰ� ���� �ݾ� ���� ���� 
	 */
	private int money;
	
	
	public Buyer(int productQuantity, int money) {
		System.out.println("�����ڸ� �����մϴ�");
		//�ʱⰪ����
		setProductQuantity(productQuantity);
		setMoney(money);
		//��Ȳ����ϱ� 
		System.out.println(this);
		
	}
	
	public void setProductQuantity( int productQuantity) {
		this.productQuantity = productQuantity;
	}
	/**
	 * ��ǰ������ ��ȯ�� (��¿�)
	 * @return
	 */
	public int getProductQuantity() {
		return this.productQuantity;
	}
	
	/** 
	 * �������� ���� ���� �ʱ�ȭ �Ǵ� ������
	 */
	
	public void setMoney( int money) {
		this.money = money;
	}
	/**
	 * �����ڰ� ���� ���� ��ȯ��(��¿�)
	 * @return
	 */
	public int getMoney() {
		return this.money;
	}
	/**
	 * �����ϱ� 
	 * �����ڰ� ���� ��ǰ ������ 1 �����ش� 
	 */
	public void buy(Seller seller) {
		seller.sell(this);
		this.productQuantity++;
	}
	/**
	 * �����ڰ� ���������� ������ ���� ���� 
	 * @param money : ������ �ݾ�
	 */
	public void pay(int money) {
		this.money-=money;
	}
	//buyer���� �ٵ�= int money
	
	@Override
	public String toString() {
		String message = String.format("������ ��ǰ ���� : %d\n�����ڰ� ���� �ݾ�: %d" , this.productQuantity,this.money);
		return message;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
