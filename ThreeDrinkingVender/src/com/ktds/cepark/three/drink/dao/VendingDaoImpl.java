package com.ktds.cepark.three.drink.dao;

public class VendingDaoImpl implements VendingDao {

	private int selectDrink =0;
	
	public VendingDaoImpl() {

	}

	@Override
	public void showingProductNum(int selectDrink) {

	}

	@Override
	public void changeMoney() {

	}

	@Override
	public int showingProduct(int inputMoney) {
		return selectDrink;
	}

	@Override
	public void incomeIncrease(int saleNumA, int saleNumB, int saleNumC) {

	}

}
