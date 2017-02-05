package com.ktds.cepark;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shop shop = new Shop();

		shop.setCycleNum(100);
		shop.setProfit(0);

		User user = new User();

		user.setLendCycleNum(0);
		user.setMyMoney(11000);

		shop.rent(user);

		System.out.println("======================");
		System.out.println(" 자전거 대여료 현황");
		System.out.println("-----------------------------------------");
		System.out.println("자전거 보유 수 : " + shop.getCycleNum() + "대");
		System.out.println("대여료 총 합 :" + shop.getProfit() + "원");

		System.out.println("\n\n======================");
		System.out.println(" 자전거 대여료 현황");
		System.out.println("-----------------------------------------");
		System.out.println("자전거 보유 수 : " + user.getLendCycleNum() + "대");
		System.out.println("보유금액 :" + user.getMyMoney() + "원");

	}
}
