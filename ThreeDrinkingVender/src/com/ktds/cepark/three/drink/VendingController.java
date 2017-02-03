package com.ktds.cepark.three.drink;

import java.util.Scanner;

import com.ktds.cepark.three.drink.biz.VendingBiz;
import com.ktds.cepark.three.drink.biz.VendingBizImpl;

/**
 * 자판기 요소: 자판기 준비금, 음료가격, 상품 번호, 자판기의 상품 갯수,
 * 
 * 구매자 요소: 고객의 상품갯수, 고객의 돈 (입력끝, 비교)
 * 
 * 메뉴 입력받을 자리, 상품 번호 입력 받을 자리
 * 
 * 기능 상품 갯수 늘고 줄고 준비금 감소 거스름돈 주기& 돈이 모자라면 반환 살수있는 상품 보여주기 수익 증가 종료 ( 재고 끝, 고객의
 * 금액이 0)
 * 
 * @author 채은
 *
 */

public class VendingController {

	public void start() {
		Scanner input = new Scanner(System.in);
		VendingBiz vendingDao = new VendingBizImpl();
		
		 int inputMoney;
		System.out.println("============채은자판기===========");
		System.out.println("가진 돈을 입력하시오");
		inputMoney = input.nextInt();
		vendingDao.showingProduct(inputMoney);
	}

	public static void main(String[] args) {
		new VendingController().start();
	}
}
