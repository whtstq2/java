package com.ktds.cepark.seller;

import com.ktds.cepark.buyer.Buyer;
import com.ktds.cepark.vo.BasketVO;

public class Seller {

	private final int PRICE = 2500;
	
	private BasketVO basketVO;
	
	public Seller (int productQuantity, int money) {
		System.out.println("판매자를 생성합니다");
		
		basketVO = new BasketVO();
		
		
		basketVO.setProductQuantity(productQuantity);
		basketVO.setMoney(money);
		
		System.out.println(this);
	}
	
	
	public void sell(Buyer buyer) {
		
		
		basketVO.minusproductQuantity();
		
		buyer.pay(PRICE);
		
		basketVO.plusMoney(PRICE);
	}
	
	
	public boolean isSoldOut() {
		boolean isSoldOut = basketVO.getProductQuantity() ==0;
		return isSoldOut;
	}
	

	
	@Override
	public String toString() {
		String message = String.format("노한글:%d, 예스한글: %d", 
				basketVO.getProductQuantity(), basketVO.getMoney());
		return message;
	}
	
	

}
