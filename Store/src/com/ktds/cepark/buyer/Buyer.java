package com.ktds.cepark.buyer;

import com.ktds.cepark.seller.Seller;
import com.ktds.cepark.vo.BasketVO;


public class Buyer {
	private BasketVO basketVO;


	
	
	public Buyer(int productQuantity, int money) {
		System.out.println("어휴 한글 왜이럼");
		
		basketVO.setProductQuantity(productQuantity);
		basketVO.setMoney(money);
		
		System.out.println(this);
		
	}
	
	
	public void buy(Seller seller) {
		seller.sell(this);
		basketVO.getProductQuantity();
	}

	public void pay(int money) {
		basketVO.getMoney();
	}
	
	
	@Override
	public String toString() {
		String message = String.format(" 자바에서 한글쓰지마: %d" , basketVO.getProductQuantity(),basketVO.getMoney());
		return message;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
