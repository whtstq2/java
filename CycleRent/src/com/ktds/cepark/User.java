package com.ktds.cepark;

public class User {

	private final int PRICE = 5000;
	private int lendCycleNum;
	private int myMoney;

	public int getLendCycleNum() {
		return lendCycleNum;
	}

	public void setLendCycleNum(int lendCycleNum) {
		this.lendCycleNum = lendCycleNum;
	}

	public int getMyMoney() {
		return myMoney;
	}

	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}

	public void lend(Shop shop) {

		this.lendCycleNum++;

		this.myMoney -= (PRICE * getLendCycleNum());

	}

}
