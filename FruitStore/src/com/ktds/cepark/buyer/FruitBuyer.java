package com.ktds.cepark.buyer;


import com.ktds.cepark.seller.FruitSeller;

public class FruitBuyer {
	
	// ���� : ���� ��, �� (�ʱ� ��, �� ��, ������ )
	
	private final int applePrice = 1000;
	
	public int buyApple;
	
	private int money;
	
	
	public  FruitBuyer (int buyApple, int money) {
		System.out.println("�����ڰ� ��Ÿ����!");
		setBuyApple(buyApple);
		setMoney(money);
		
		System.out.println(this);
		
	}
	
	public void setBuyApple(int buyApple ) {
		this.buyApple = buyApple;
	}
	
	public int getBuyApple() {
		return buyApple;
	}
	
	public void setMoney( int money) {
		this.money = money;
	}
	
	public int getMoney () {
		return money;
	}
	
	/**
	 * ��� ��� 
	 * @param seller
	 */
	
	
	
	public void buy (FruitSeller seller) {
		
		this.money -= (this.buyApple * applePrice);
	}
	/**
	 * ��� ��� ���� �� , ������ �ִ�  ��� ���� 
	 */
	
	@Override
	public String toString ( ) {
		String message = String.format("�մ��� ������ �ִ� ��� ����: %d, ���� ��:%d", this.buyApple, this.money);
		return message;
	}
	
	
	

}
