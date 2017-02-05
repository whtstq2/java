package com.ktds.cepark.bank.program.dao;

import java.util.ArrayList;
import java.util.List;
import com.ktds.cepark.bank.program.vo.BankVO;

/**
 * 		System.out.println("1. 고객 등록");
		System.out.println("2. 고객 조회");
		System.out.println("3. 고객 정보 조회");
		System.out.println("4. 은행 준비금 확인");
		System.out.println("5. 출금");
		System.out.println("6. 입금");
		System.out.println("7. 종료");
 * @author 채은
 *
 */
public class BankDaoImpl implements BankDao{

	private List<BankVO> bankList;
	
	public BankDaoImpl () {
		bankList = new ArrayList <BankVO>();
	}
	
	@Override
	public List<BankVO> queryAllCus() {
		return bankList;
	}

	@Override
	public void verifyCusLevel(int index) {
		
	}

	@Override
	public void createNewCus(BankVO newCus) {
		bankList.add(newCus);
	}
	
	@Override
	public void seeCustomerInfo(int customerNum) {
		
	}

	@Override
	public void checkReserveMoney(int reserve) {
		
	}

	@Override
	public void withdrawMoney(int index, BankVO withdraw) {
		bankList.set(index, withdraw);
	}

	@Override
	public void depositMoney(int index, BankVO deposit) {
		bankList.set(index, deposit);
	}

}
