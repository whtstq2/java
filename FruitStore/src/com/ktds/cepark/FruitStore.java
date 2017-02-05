package com.ktds.cepark;

import com.ktds.cepark.buyer.FruitBuyer;
import com.ktds.cepark.seller.FruitSeller;

/**
 * ���� ���� ���α׷�
 * 1. ������� ������ �����ι��� ���Ѵ�: ����, ���� , �մ�
 * 2. �����ι��� ������ ���Ѵ� 
 * ����: �Ǵ�, ���Ȯ��, �Ǹű� Ȯ��  
 * �մ�: ���, ���� �� Ȯ�� , �� ���� ���� Ȯ�� 
 * ����: ����, �մ� 
 * @author Admin
 *
 */



public class FruitStore {
	
	public void start(){

			FruitSeller seller = new FruitSeller(100, 100000);
			FruitBuyer buyer = new FruitBuyer(10, 20000);
					buyer.buy(seller);
			
			System.out.println("========���Ÿ� ��ģ ��========");
			
			System.out.println(seller);		
			System.out.println(buyer);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new FruitStore().start();
	}

}
