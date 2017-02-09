package com.ktds.cepark.bank.program;

import java.util.Scanner;

import com.ktds.cepark.bank.program.biz.BankBiz;
import com.ktds.cepark.bank.program.biz.BankBizImpl;
import com.ktds.cepark.bank.program.dao.BankDao;
import com.ktds.cepark.bank.program.dao.BankDaoImpl;
import com.ktds.cepark.bank.program.vo.BankVO;

/**
 * 은행 프로그램 만들기
 * 기능 : 고객 등록, 기존 고객인지 확인, 고객 조회, 고객 정보 조회(예치금 정보, 이름 등)
, 은행 준비금 확인, 출금, 고객 입금

케이티 은행은 준비금 1,000,000원을 가진다.
고객은 신규 고객, 기존 고객으로 나뉜다.
신규 고객은 계좌를 만들며, 기본 5,000원을 예치해야만 한다.
기존 고객은 금액을 추가로 예치할 수 있다.
기존 고객은 금액을 찾을 수 있다.
단, 기존 고객은 한번에 하나의 행위만 가능하다.
Exit 를 입력하면 프로그램은 종료된다.
 * @author 채은
 *
 */

public class BankController {

	public void start () {
		
		BankController bankController = new BankController();
		BankDao bankDao = new BankDaoImpl();
		BankBiz bankBiz = new BankBizImpl();
		Scanner input= new Scanner(System.in);
		int chooseMenu=0;
		
		
		System.out.println("===KT은행 관리자 프로그램에 오신 것을 환영합니다===");
		System.out.println("1. 고객 번호입력");
		System.out.println("2. 전체 고객 조회");
		System.out.println("3. 종료");
		System.out.println("번호 입력");
		while (true) {
		
		chooseMenu = input.nextInt();
		
			if (chooseMenu==1) {
				bankBiz.verifyCusLevel();
				
			}
			else if ( chooseMenu ==2) {
				bankBiz.queryAllCus();
			}
			else if ( chooseMenu ==3) {
				System.out.println("종료");
				break;
				}
			else  {
				System.out.println("1에서 3의 숫자를 입력");
			}
		}
	}
	
	
	public static void main(String[] args) {
		new BankController().start();
	}

}
