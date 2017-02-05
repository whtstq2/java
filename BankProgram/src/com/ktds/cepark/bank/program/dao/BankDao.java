package com.ktds.cepark.bank.program.dao;

import java.util.List;

import com.ktds.cepark.bank.program.vo.BankVO;

/**
 * 은행 프로그램 만들기 기능 : 고객 등록, 기존 고객인지 확인, 고객 조회, 고객 정보 조회(예치금 정보, 이름 등) , 은행 준비금
 * 확인, 출금, 고객 입금
 * 
 * 케이티 은행은 준비금 1,000,000원을 가진다. 고객은 신규 고객, 기존 고객으로 나뉜다. 
 * 신규 고객은 계좌를 만들며, 
 * 기본 5,000원을 예치해야만 한다. 
 * 기존 고객은 금액을 추가로 예치할 수 있다. 
 * 기존 고객은 금액을 찾을 수 있다. 
 * 단, 기존 고객은 한번에 하나의 행위만 가능하다. 
 * Exit 를 입력하면 프로그램은 종료된다.
 * 
 * @author 채은
 */
public interface BankDao {

	public List <BankVO> queryAllCus();
	
	public void verifyCusLevel(int index);
	public void createNewCus(Bank newBank );
	public void seeCustomerInfo(int index );
	public void checkReserveMoney(int reserve);
	public void withdrawMoney(int index, int output);
	public void depositMoney(int index, int input);
	
}
