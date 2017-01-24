package com.ktds.cepark.buyer;


import com.ktds.cepark.seller.FruitSeller;

public class FruitBuyer {
	
	// 변수 : 산사과 수, 돈 (초기 돈, 쓴 돈, 남은돈 )
	
	private final int applePrice = 1000;
	
	public int buyApple;
	
	private int money;
	
	
	public  FruitBuyer (int buyApple, int money) {
		System.out.println("구매자가 나타났다!");
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
	 * 사과 사기 
	 * @param seller
	 */
	
	
	
	public void buy (FruitSeller seller) {
		
		this.money -= (this.buyApple * applePrice);
	}
	/**
	 * 사과 사고 남은 돈 , 가지고 있는  사과 갯수 
	 */
	
	@Override
	public String toString ( ) {
		String message = String.format("손님이 가지고 있는 사과 갯수: %d, 남은 돈:%d", this.buyApple, this.money);
		return message;
	}
	
	
	

}
