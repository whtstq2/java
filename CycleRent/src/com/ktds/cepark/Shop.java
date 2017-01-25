package com.ktds.cepark;

public class Shop {

	private final int PRICE = 5000;
	private int cycleNum;
	private int profit;

	public int getCycleNum() {
		return cycleNum;
	}

	public void setCycleNum(int cycleNum) {
		this.cycleNum = cycleNum;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

	public void rent(User user) {
		this.cycleNum -= user.getLendCycleNum();

		user.lend(this);

		this.profit += (user.getLendCycleNum() * PRICE);

	}

}
