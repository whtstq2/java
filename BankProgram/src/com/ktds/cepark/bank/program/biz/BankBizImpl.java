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
		System.out.println("6. 입금");
		System.out.println("6. 종료");
 * @author 채은
 *
 */

public class BankBizImpl implements BankBiz{
	
	private Scanner input;
	private BankDao bankDao;
	public int reserveFund  = 1000000;
	BankVO bankVO;
	
	public BankBizImpl () {
		input = new Scanner(System.in);
		bankDao = new BankDaoImpl();
	}
	
/**
 * 전체 목록
 * @return 
 */
	@Override
	public List<BankVO> queryAllCus() {
		System.out.println("전체 고객을 조회합니다.");
		
		List<BankVO> customerList = bankDao.queryAllCus();
		for (BankVO customer : customerList) {
			System.out.printf("고객이름 : %s\n", customer.getName());
		}
		return customerList;
	}
/**
 * level 판별
 */
	@Override
	public void verifyCusLevel() {
		List<BankVO> customerList = bankDao.queryAllCus();
		System.out.println("고객의 번호를 입력하시오");
		int customerNum = input.nextInt();
		
		for (int i=0; i < customerList.size(); i++) {
			if ( i == customerNum) {
				System.out.println("1. 입금");
				System.out.println("2. 출금");
				System.out.println("3. 고객 정보");
				System.out.println("선택하시오");
				
				int menuNum = input.nextInt();
				if ( menuNum ==1) {
					BankVO bankVO = new BankVO();
					bankDao.depositMoney(customerNum, bankVO);
				}
				else if ( menuNum == 2) {
					BankVO bankVO = new BankVO();
					bankDao.withdrawMoney(customerNum, bankVO);
				}
				else if (menuNum == 3) {
					
					bankDao.seeCustomerInfo(customerNum);
				}
			}
		}
		
		BankVO bankVO = new BankVO();
		bankDao.createNewCus(bankVO);
	}


	/**
	 * 은행 준비금 확인
	 */
	@Override
	public void checkReserveMoney() {
		
			System.out.printf("은행 준비금 : %s\n", reserveFund);
	}

//	* 케이티 은행은 준비금 1,000,000원을 가진다. 고객은 신규 고객, 기존 고객으로 나뉜다. 신규 고객은 계좌를 만들며, 기본
//	 * 5,000원을 예치해야만 한다. 기존 고객은 금액을 추가로 예치할 수 있다. 기존 고객은 금액을 찾을 수 있다. 단, 기존 고객은 한번에
//	 * 하나의 행위만 가능하다. Exit 를 입력하면 프로그램은 종료된다.
	
	/**
	 * 출금
	 */
	@Override
	public void withdrawMoney() {

		BankVO bankVO = new BankVO();
		reserveFund =-bankVO.getWithdraw();
		bankDao.checkReserveMoney(reserveFund);
	}
	
	/**
	 * 입금
	 */
	@Override
	public void depositMoney() {
		
		BankVO bankVO = new BankVO();
		reserveFund =+ bankVO.getDeposit();
		bankDao.checkReserveMoney(reserveFund);
	}

	@Override
	public void createNewCus(BankVO newCus) {
		// TODO Auto-generated method stub
		System.out.println("고객의 이름을 등록");
		String customerName = input.next();
		
		BankVO bankVO = new BankVO();
		bankVO.setName(customerName);
		
		bankDao.createNewCus(bankVO);
	}

	@Override
	public void seeCustomerInfo(int customerNum) {
		// TODO Auto-generated method stub
		List<BankVO> customerList = bankDao.queryAllCus();
		System.out.printf("고객이름 : %s\n", customerList.get(customerNum));
	}

}
