package com.ktds.cepark.bank.program.biz;

import java.util.List;
import java.util.Scanner;

import com.ktds.cepark.bank.program.dao.BankDao;
import com.ktds.cepark.bank.program.dao.BankDaoImpl;
import com.ktds.cepark.bank.program.vo.BankVO;
import com.ktds.cepark.bank.program.vo.BankVO.*;

/**
 * 		System.out.println("1. 고객 등록");
		System.out.println("2. 고객 조회");
		System.out.println("3. 고객 정보 조회");
		System.out.println("4. 은행 준비금 확인");
		System.out.println("5. 출금");
		System.out.println("6. 종료");
 * @author 채은
 *
 */

public class BankBizImpl implements BankBiz{
	
	private Scanner input;
	private BankDao bankDao;

	public BankBizImpl () {
		input = new Scanner(System.in);
		bankDao = new BankDaoImpl();
	}
	
/**
 * 전체 목록
 */
	@Override
	public List<BankVO> queryAllCus() {
		System.out.println("전체 고객을 조회합니다.");
		
		List<BankVO> customerList = bankDao.queryAllCus();
		for (BankVO customer : customerList) {
			System.out.printf("고객이름 : %s\n", customer.getName());
		}
		
	}
/**
 * level 판별
 */
	@Override
	public void verifyCusLevel() {
		System.out.println("고객의 번호를 입력하시오");
		
	}
/**
 * 고객등록 
 */
	@Override
	public void createNewCus() {
		
	}
/**
 * 고객정보 
 */
	@Override
	public void seeCustomerInfo() {
		
	}

	/**
	 * 은행 준비금 확인
	 */
	@Override
	public void checkReserveMoney() {
		List<BankVO> bankList = bankDao.checkReserveMoney(reserve);;
		for (BankVO bank : bankList) {
			System.out.printf("은행 준비금 : %s\n", bank.getReserveFund());
		}
	}

//	* 케이티 은행은 준비금 1,000,000원을 가진다. 고객은 신규 고객, 기존 고객으로 나뉜다. 신규 고객은 계좌를 만들며, 기본
//	 * 5,000원을 예치해야만 한다. 기존 고객은 금액을 추가로 예치할 수 있다. 기존 고객은 금액을 찾을 수 있다. 단, 기존 고객은 한번에
//	 * 하나의 행위만 가능하다. Exit 를 입력하면 프로그램은 종료된다.
	
	/**
	 * 출금
	 */
	@Override
	public void withdrawMoney() {
		
	}
	
	/**
	 * 입금
	 */
	@Override
	public void depositMoney() {
		if (name ) {
			
		}
	}

}
