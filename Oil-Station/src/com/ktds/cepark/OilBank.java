package com.ktds.cepark;

public class OilBank {

	private int oilStock;
	private int pricePerLiter;
	private int budget;
	
	public void setOilStock(int oilStock) {
		this.oilStock = oilStock;
	}
	
	public int getOilStock() {
		return oilStock;
	}
	
	public void setPricePerLiter(int pricePerLiter) {
		this.pricePerLiter = pricePerLiter;
	}
	
	public int getPricePerLiter() {
		return pricePerLiter;
	}
	
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	public int getBudget() {
		return budget;
	}
	
	public void filling( Car car ) {
		this.oilStock -= car.getOilTankVolume(); // 그냥 최대 용량에서 이미 들어있는 것을 뺀 나머지
		
		System.out.println(this);
		car.fillOil(this); //filling의 호출자 = oilBank = this 
		
		this.budget += (pricePerLiter*car.getOilTankVolume()); //만땅에 대한 식
		
	}
	//주유소가 차에게 주유를 한다 
	//car 인스턴스 = car 
	
	
}
