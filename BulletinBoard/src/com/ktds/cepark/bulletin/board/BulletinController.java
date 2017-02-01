package com.ktds.cepark.bulletin.board;

import java.util.Scanner;

import com.ktds.cepark.bulletin.board.biz.BulletinBiz;
import com.ktds.cepark.bulletin.board.biz.BulletinBizImpl;

public class BulletinController {
	
	public void start() {
		
		BulletinBiz bulletinBiz = new BulletinBizImpl();
		
		Scanner input = new Scanner(System.in);
		int chooseMenu = 0;
		
		while(true) {
		
		System.out.println("==========뉴스게시판 프로그램==========");
		System.out.println(" 1. 기사 조회");
		System.out.println("2. 기사 등록");
		System.out.println("3. 종료 ");
		System.out.println("============================");
		System.out.println("메뉴를 선택하시오");
		
		chooseMenu = input.nextInt();
		
		if (chooseMenu == 1) {
			bulletinBiz.queryAllNews();
			

			
		} else if (chooseMenu == 2) {
			bulletinBiz.addNewNews();

		} else {
			break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BulletinController().start();
	}

}
