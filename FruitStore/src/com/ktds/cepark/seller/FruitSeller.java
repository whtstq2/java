package com.ktds.cepark.seller;

import com.ktds.cepark.buyer.FruitBuyer;


public class FruitSeller {

	// ���� ����: ��� ����,���� ������ �ִ� ��, ���� ��� ����  
	
	
	
	private final int applePrice = 1000;
	
	private int money;
	
	private int appleNum;
	
	private int buyApple;
	
	
	//���Ȯ��, �Ǹű� Ȯ��, �Ǵ� 
	
	public   FruitSeller(int money, int appleNum) {
		System.out.println("������� ���� �߰�!");
		
		setMoney(money);
		setAppleNum(appleNum);
		//setBuyApple(buyApple);
		
		System.out.println(this);
	}
	
	
	
	
	public void setMoney (int money) {
		
		this.money = money;
		
	}
	
	public int getMoney () {
		
		return money;
	}
	
	public void setAppleNum (int appleNum) {
		this.appleNum = appleNum;
	}
	
	public int getAppleNum () {
		return appleNum;
	}
	/*
	public void setBuyApple (int buyApple ) {
		this.buyApple = buyApple;
	}
	
	public int getBuyApple () {
		return buyApple;
	}*/
	
	/**
	 * �Ǹ��ϱ�
	 */
	
	public void sell(FruitBuyer buyer) {
		
		//buyer.buy(buyApple);-??
		this.appleNum-=buyApple;
		this.money += (applePrice*buyApple);
	}
	
	public boolean isSoldOut() {
		boolean isSoldOut = this.appleNum ==0;
		return isSoldOut;
	}
	
	/**
	 * �Ǹż��� Ȯ���ϱ�, ���Ȯ���ϱ� 
	 */
	@Override
	public String toString () {
		String message = String.format("������ ������ �ִ� ��: %d, ������ �ִ� ���: %d" , this.money, this.appleNum);
		return message;
	}
	
	
	

	
	/**
	 * �Ǹ��� Ȯ���ϱ� 
	 */
	
}
