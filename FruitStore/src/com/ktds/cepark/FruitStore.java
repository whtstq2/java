package com.ktds.cepark;

import com.ktds.cepark.buyer.FruitBuyer;
import com.ktds.cepark.seller.FruitSeller;

/**
 * 과일 가게 프로그램
 * 1. 사과과일 가게의 등장인물을 정한다: 가게, 주인 , 손님
 * 2. 등장인물의 역할을 정한다 
 * 주인: 판다, 재고확인, 판매금 확인  
 * 손님: 산다, 남은 돈 확인 , 산 물건 갯수 확인 
 * 가게: 주인, 손님 
 * @author Admin
 *
 */



public class FruitStore {
	
	public void start(){

			FruitSeller seller = new FruitSeller(100, 100000);
			FruitBuyer buyer = new FruitBuyer(10, 20000);
					buyer.buy(seller);
			
			System.out.println("========구매를 마친 후========");
			
			System.out.println(seller);		
			System.out.println(buyer);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new FruitStore().start();
	}

}
