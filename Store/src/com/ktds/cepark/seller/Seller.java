package com.ktds.cepark.seller;

import com.ktds.cepark.buyer.Buyer;

public class Seller {
	/**
	 * ��ǰ����
	 */
	private final int PRICE = 2500;
	
	/**
	 * �Ǹ��ڰ� ���� �ݾ�
	 */
	private int money;
	
	/**
	 * �Ǹ��ڰ� ���� ��ǰ�� ���� 
	 */
	private int productQuantity;
	
	// ������ 500,50000�� �޾Ƽ� �����ϴ� ���� money, productQuantity
	public Seller (int productQuantity, int money) {
		System.out.println("�Ǹ��ڸ� �����մϴ�");
		
		setProductQuantity(productQuantity);
		setMoney(money);
		
		System.out.println(this);
	}
	
	public void setMoney(int money) {
		this.money = money;
		// �����͸� ������ ���� �ü� �ְ� ���ִ� �޼ҵ� set
	}
	
	public int getMoney() {
		return this.money;
		// �����͸� ������ �������� �޼ҵ� get
	}
	
	public void setProductQuantity( int productQuantity) {
		 this.productQuantity = productQuantity;
	}
	
	public int getProductQuantity() {
		return this.productQuantity;
	}
	
	
	/**
	 * �Ǹ��ϱ�
	 */
	public void sell(Buyer buyer) {
		//�Ǹ��ڰ� ���� ��ǰ�� �������� �ϳ��� �A�� 
		this.productQuantity--;
		//�����ڴ� ���� �����Ѵ� 
		buyer.pay(PRICE);
		//�Ǹ��ڰ� ���� �ݾ׿��� ��ǰ�� ���ݸ�ŭ ���Ѵ�
		this.money+=PRICE;
	}
	/**
	 * ����ľ��ϱ�
	 * @return : boolean ��� ������ false, ��� ������ true.
	 */
	
	public boolean isSoldOut() {
		boolean isSoldOut = this.productQuantity ==0;
		return isSoldOut;
	}
	
	/**
	 * �Ǹ��� ��Ȳ �ľ��ϱ�
	 */
	
	@Override
	public String toString() {
		String message = String.format("�Ǹ����� ��ǰ����:%d, �Ǹ��ڰ� ���� �ݾ�: %d", 
				this.productQuantity, this.money);
		return message;
	}
	
	

}
