package com.ktds.cepark;

/**
 * 사는 사람
 * 
 * 김밥 사는 갯수 라면 사는 갯수 돈 가진돈-사용한돈
 * 
 * 산다
 * 
 * @author park
 *
 */

public class Buyer {

	private final int rollPrice = 1500;
	private final int noodlePrice = 2000;

	private int rollBuyNum;
	private int noodleBuyNum;
	private int money;

	public int getRollBuyNum() {
		return rollBuyNum;
	}

	public void setRollBuyNum(int rollBuyNum) {
		this.rollBuyNum = rollBuyNum;
	}

	public int getNoodleBuyNum() {
		return noodleBuyNum;
	}

	public void setNoodleBuyNum(int noodleBuyNum) {
		this.noodleBuyNum = noodleBuyNum;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public buy() {
		rollBuyNum++;
		noodleBuyNum++;
		
		this.money -=  (getRollBuyNum()*rollPrice + getNoodleBuyNum()*noodlePrice);
		
	}
	
	
	
}
