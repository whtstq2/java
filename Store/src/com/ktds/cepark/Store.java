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
		
		
		System.out.println("���Ϳ� ���Ű��� ȯ���մϴ�");
		Buyer jjh = new Buyer (100,500000);
		Seller mjk = new Seller (100, 5000000);
		
		System.out.println("���̾�: ��ǰ �� ��Կ�. �� ��ǰ �ϳ��� �ּ���");
		mjk.sell();
		jjh.buy();
		
		System.out.println("����: 2500���Դϴ�");
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
