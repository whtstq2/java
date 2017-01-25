package com.ktds.cepark;

public class Car {
	
	private String modelName;
	
	private int oilTankVolume;
	private int money;
	private int oilStock; //탱크에 들어있는 내용물 
	
	public Car(String modelName, int oilTankVolume, int money) {
		
		this.modelName = modelName;
		this.oilTankVolume = oilTankVolume;
		this.money = money;
	}
	
	
	
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getOilTankVolume() {
		return oilTankVolume;
	}
	public void setOilTankVolume(int oilTankVolume) {
		this.oilTankVolume = oilTankVolume;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	
	public int getOilStock() {
		return oilStock;
	}



	public void setOilStock(int oilStock) {
		this.oilStock = oilStock;
	}



	public void fillOil(OilBank oilBank) {
		
		oilStock = oilTankVolume; //전체를 채워준다 ( 반드시 꽉채우는 로직) 
		this.money -= (oilTankVolume* oilBank.getPricePerLiter());
		// this.money와 그냥 money라고 해도 같다 
		// 인스턴스 변수를 ㄴㅏ타내기위해 그냥 쓰는 것 
	}
	
	
	
	
	
	
	

}
