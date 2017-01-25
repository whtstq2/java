package com.ktds.cepark;

/**
 * 
 * 파는 사람 김밥 재고 1500 라면 재고 2000 돈 (기존 돈 + 수익 ) 판다
 * 
 * @author park
 *
 */
public class Seller {

	private final int rollPrice = 1500;
	private final int noodlePrice = 2000;

	private int rollNum;
	private int noodleNum;
	private int money;

		public int getRollNum() {
			return rollNum;
		}
	
		public void setRollNum(int rollNum) {
			this.rollNum = rollNum;
		}
	
		public int getNoodleNum() {
			return noodleNum;
		}
	
		public void setNoodleNum(int noodleNum) {
			this.noodleNum = noodleNum;
		}
	
		public int getMoney() {
			return money;
		}
	
		public void setMoney(int money) {
			this.money = money;
		}
		
		public sell() {
			rollNum--;
			noodleNum--;
			
			this.money += (getRollNum()*rollPrice + getNoodleNum()*noodlePrice);
		}
		
		
		
		}

}
