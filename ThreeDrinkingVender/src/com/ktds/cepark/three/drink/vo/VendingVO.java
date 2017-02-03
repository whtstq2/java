package com.ktds.cepark.three.drink.vo;



public class VendingVO {
	
	public static final int drinkingA =1000;
	public static final int drinkingB =1500;
	public static final int drinkingC = 900;
	public static final int productNumA = 1;
	public static final int productNumB = 2;
	public static final int productNumC =3;
	public static final int productCountA = 3;
	public static final int productCountC = 3;
	public static final int productCountB = 3;
	public static final int reservedMoney = 50000;

	
	private int saleNumA;
	private int saleNumB;
	private int saleNumC;
	private int buyerMoney;
	
	public int getSaleNumA() {
		return saleNumA;
	}

	public void setSaleNumA(int saleNumA) {
		this.saleNumA = saleNumA;
	}

	public int getSaleNumB() {
		return saleNumB;
	}

	public void setSaleNumB(int saleNumB) {
		this.saleNumB = saleNumB;
	}

	public int getSaleNumC() {
		return saleNumC;
	}

	public void setSaleNumC(int saleNumC) {
		this.saleNumC = saleNumC;
	}

	public int getBuyerMoney() {
		return buyerMoney;
	}

	public void setBuyerMoney(int buyerMoney) {
		this.buyerMoney = buyerMoney;
	}

	
}
