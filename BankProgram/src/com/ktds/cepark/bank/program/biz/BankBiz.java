package com.ktds.cepark.bank.program.biz;

import java.util.List;

import com.ktds.cepark.bank.program.vo.BankVO;

public interface BankBiz {

	public List <BankVO> queryAllCus();
	
	public void verifyCusLevel();
	public void createNewCus();
	public void seeCustomerInfo();
	public void checkReserveMoney();
	public void withdrawMoney();
	public void depositMoney();
}
