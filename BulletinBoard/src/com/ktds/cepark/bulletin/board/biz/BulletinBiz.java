package com.ktds.cepark.bulletin.board.biz;

public interface BulletinBiz {

//	System.out.println(" 1. 기사 조회");
//	System.out.println("2. 기사 등록");
//	System.out.println("3. 종료 ");
	/**
	 * 전체 뉴스 기사 제목 조회
	 */
	public void queryAllNews ();
		
	
	/**
	 * 뉴스 기사 제목 등록
	 */
	public void addNewNews();
		
	
}
