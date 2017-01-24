package com.ktds.cepark.buyer;

import com.ktds.cepark.seller.Seller;

/**
 * 
 * Seller에게 상품을 구매하고 금액을 Seller에게 지불한다
 * 
 * @author 채은
 *
 */
public class Buyer {

	/**
	 * 상품갯수 변수 정의
	 */
	private int productQuantity;
	
	/**
	 * 구매자가 가진 금액 변수 정의 
	 */
	private int money;
	
	
	public Buyer(int productQuantity, int money) {
		System.out.println("구매자를 생성합니다");
		//초기값세팅
		setProductQuantity(productQuantity);
		setMoney(money);
		//현황출력하기 
		System.out.println(this);
		
	}
	
	public void setProductQuantity( int productQuantity) {
		this.productQuantity = productQuantity;
	}
	/**
	 * 상품갯수를 반환함 (출력용)
	 * @return
	 */
	public int getProductQuantity() {
		return this.productQuantity;
	}
	
	/** 
	 * 구매자의 가진 돈을 초기화 또는 갱신한
	 */
	
	public void setMoney( int money) {
		this.money = money;
	}
	/**
	 * 구매자가 가진 돈을 반환함(출력용)
	 * @return
	 */
	public int getMoney() {
		return this.money;
	}
	/**
	 * 구매하기 
	 * 구매자가 가진 상품 갯수에 1 더해준다 
	 */
	public void buy(Seller seller) {
		seller.sell(this);
		this.productQuantity++;
	}
	/**
	 * 구매자가 가진돈에서 지불할 돈을 뺀다 
	 * @param money : 지불할 금액
	 */
	public void pay(int money) {
		this.money-=money;
	}
	//buyer에게 줄돈= int money
	
	@Override
	public String toString() {
		String message = String.format("구매한 상품 갯수 : %d\n구매자가 가진 금액: %d" , this.productQuantity,this.money);
		return message;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
