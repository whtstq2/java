package com.ktds.cepark.bank.program;

import java.util.Scanner;

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
		Scanner input= new Scanner(System.in);
		int chooseMenu=0;
		chooseMenu = input.nextInt();
		
		System.out.println("===KT은행 관리자 프로그램에 오신 것을 환영합니다===");
		System.out.println("1. 고객 등록");
		System.out.println("2. 고객 조회");
		System.out.println("3. 고객 정보 조회");
		System.out.println("4. 은행 준비금 확인");
		System.out.println("5. 출금");
		System.out.println("6. 입금");
		System.out.println("7. 종료");
		
		while (true) {
			
			if (chooseMenu==1) {
				
				
			}
			else if (chooseMenu ==2) {
				
				
			}
			else if (chooseMenu==3) {

				
			}
			else if (chooseMenu ==4) {
				
			}
			else if (chooseMenu ==5) {
				
			}
			else if (chooseMenu ==6) {
				
			}
			else {
				break;
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		new BankController().start();
	}

}
