package com.ktds.cepark.three.drink.dao;




public interface VendingDao {
	/**
	 * 가지고 있던 음료의 갯수에서 하나 씩 뺀다
	 * @param object 
	 * 
	 * @param newNum
	 */
	public void showingProductNum(int selectDrink);

	/**
	 * 고객이 입력한 돈에서 구매한 음료의 가격 뺀다
	 * 
	 * @param change
	 */
	public void changeMoney();

	/**
	 * 고객의 거스름돈changeMoney 보다 크거나 같은 가격을 가진 음료만 보여준다
	 * 
	 * @return
	 */
	public int showingProduct(int inputMoney);

	/**
	 * 기존 자판기의 준비금 50000에 나가는 음료의 가격을 더한다
	 * @param C가 팔린 개수 
	 * @param B가 팔린 개수
	 * @param A가 팔린 개수
	 * 
	 * @param money
	 */
	public void incomeIncrease(int saleNumA, int saleNumB, int saleNumC);



	

}
