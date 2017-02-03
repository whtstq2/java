package com.ktds.cepark.three.drink.biz;

import java.util.Scanner;

import com.ktds.cepark.three.drink.dao.VendingDao;
import com.ktds.cepark.three.drink.dao.VendingDaoImpl;

public class VendingBizImpl implements VendingBiz {

	public static final int drinkingA = 1000;
	public static final int drinkingB = 1500;
	public static final int drinkingC = 900;
	public static final int productNumA = 1;
	public static final int productNumB = 2;
	public static final int productNumC = 3;
	public static final int productCountA = 3;
	public static final int productCountC = 3;
	public static final int productCountB = 3;
	public static final int reservedMoney = 50000;

	private int saleNumA;
	private int saleNumB;
	private int saleNumC;
	private int inputMoney;

	private VendingDao vendingDao;
	private Scanner sc;

	public VendingBizImpl() {
		vendingDao = new VendingDaoImpl();
		sc = new Scanner(System.in);
	}

	public int showingProduct(int inputMoney) {
			int selectDrink = 0;
			

			if (drinkingC > inputMoney) {
				System.out.println("살 수 있는 상품이 없습니다");
				
			} else if ((drinkingA <= inputMoney)&&(drinkingC>inputMoney)) {
				System.out.println("사이다를 살 수 있습니다");
			} else if ((drinkingC <= inputMoney)&& (drinkingB>inputMoney)){
				System.out.println("1: 콜라, 3: 사이다를 살 수 있습니다");
				System.out.println("구매할 음료의 번호를 입력하시오");
			
			} else if (drinkingB <= inputMoney) {
				System.out.println("1: 콜라 , 2: 환타, 3: 사이다를 살 수 있습니다");
				System.out.println("구매할 음료의 번호를 입력하시오");
			}
			selectDrink = sc.nextInt();
			vendingDao.showingProductNum(selectDrink);
			return selectDrink;
			

		
	}

	@Override
	public void showingProductNum(int selectDrink) {

		if (selectDrink == 1) {
			System.out.println("환타를 구매합니다.");
			saleNumA++;
			System.out.printf("가지고 있는 음료의 갯수는 콜라: %d, 환타: %d, 사이다: %d", saleNumA, saleNumB, saleNumC);
		} else if (selectDrink == 2) {
			System.out.println("콜라를 구매합니다.");
			saleNumB++;
			System.out.printf("가지고 있는 음료의 갯수는 콜라: %d, 환타: %d, 사이다: %d", saleNumA, saleNumB, saleNumC);
		} else {
			System.out.println("사이다를 구매합니다.");
			saleNumC++;
			System.out.printf("가지고 있는 음료의 갯수는 콜라: %d, 환타: %d, 사이다: %d", saleNumA, saleNumB, saleNumC);
		}
		vendingDao.incomeIncrease(saleNumA, saleNumB, saleNumC);
	}

	@Override
	public void changeMoney() {
		System.out.printf("남은 돈은: %d",
				(inputMoney - (saleNumA * drinkingA) - (saleNumB * drinkingB) - (saleNumC * drinkingC)));
	}

	@Override
	public void incomeIncrease() {

		System.out.printf("자판기의 돈: %d",
				reservedMoney + (saleNumA * drinkingA) + (saleNumB * drinkingB) + (saleNumC * drinkingC));
	}


}
