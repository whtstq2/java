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
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Store().start();
		
		
		 
		 
	}

}
