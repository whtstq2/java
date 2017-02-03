package com.ktds.cepark.three.drink.biz;

public interface VendingBiz{

	public void showingProductNum(int selectDrink);
	
	public void changeMoney();
	
	public int showingProduct(int inputMoney);
	
	public void incomeIncrease();
}
