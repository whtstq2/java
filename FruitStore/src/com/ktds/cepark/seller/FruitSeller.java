package com.ktds.cepark.seller;

import com.ktds.cepark.buyer.FruitBuyer;


public class FruitSeller {

	// 변수 생성: 사과 가격,현재 가지고 있는 돈, 현재 사과 갯수  
	
	
	
	private final int applePrice = 1000;
	
	private int money;
	
	private int appleNum;
	
	private int buyApple;
	
	
	//재고확인, 판매금 확인, 판다 
	
	public   FruitSeller(int money, int appleNum) {
		System.out.println("사과가게 주인 발견!");
		
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
	 * 판매하기
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
	 * 판매수익 확인하기, 재고확인하기 
	 */
	@Override
	public String toString () {
		String message = String.format("주인이 가지고 있는 돈: %d, 가지고 있는 사과: %d" , this.money, this.appleNum);
		return message;
	}
	
	
	

	
	/**
	 * 판매자 확인하기 
	 */
	
}
