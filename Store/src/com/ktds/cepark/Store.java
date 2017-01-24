package com.ktds.cepark;


import com.ktds.cepark.seller.Seller;
import com.ktds.cepark.buyer.Buyer;

public class Store {

	public void start() {
		
		
		Buyer lyj = new Buyer (0,50000);
		Seller nym = new Seller(500,50000);
		
		lyj.buy(nym);
		
		System.out.println(lyj);
		System.out.println(nym);
		
		/*
		Buyer ljs = new Buyer(0,5000000);
		
		Buyer jgu = ljs;
		
		ljs.buy();
		
		System.out.println(ljs);
		System.out.println(jgu);
		
		
		System.out.println("장터에 오신것을 환영합니다");
		Buyer jjh = new Buyer (100,500000);
		Seller mjk = new Seller (100, 5000000);
		
		System.out.println("바이어: 상품 좀 살게요. 이 상품 하나만 주세요");
		mjk.sell();
		jjh.buy();
		
		System.out.println("셀러: 2500원입니다");
		jjh.pay(2500);
		
		System.out.println(mjk);
		System.out.println(jjh);
		*/
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Store().start();
		
		
		 
		 
	}

}
