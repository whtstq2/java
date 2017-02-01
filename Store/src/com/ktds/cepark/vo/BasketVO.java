package com.ktds.cepark.vo;

public class BasketVO {

	private int money;
	private int productQuantity;
	
	public void minusproductQuantity() {
		this.productQuantity--;
	}
	public void plusMoney( int money) {
		this.money += money;
	}
	
	public void plusProductQuantity() {
		this.productQuantity++;
	}
	public void minusMoney( int money) {
		this.money -=money;
	}
	
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	
	
	
}
