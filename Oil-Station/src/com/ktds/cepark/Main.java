package com.ktds.cepark;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OilBank oilBank = new OilBank(); //파라미터를 받아주는 생성자가 없으니까 빈칸
		oilBank.setOilStock(5000);
		oilBank.setPricePerLiter(1480);
		oilBank.setBudget(0);
		
		Car car = new Car("무쏘", 50, 10000000);
		
		System.out.println(oilBank);
		oilBank.filling( car);
		
		System.out.println("=====주유소======");
		System.out.println(oilBank.getOilStock());
		System.out.println(oilBank.getBudget());
		
		System.out.println("=====자동차======");
		System.out.println(car.getModelName());
		System.out.println(car.getOilTankVolume());
		System.out.println(car.getMoney());
	}

}
