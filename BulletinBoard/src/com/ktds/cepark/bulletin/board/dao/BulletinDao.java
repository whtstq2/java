package com.ktds.cepark.bulletin.board.dao;

import java.util.List;

import com.ktds.cepark.bulletin.board.vo.BulletinVO;

public interface BulletinDao {

//	System.out.println(" 1. 기사 조회");
//	System.out.println("2. 기사 등록");
//	System.out.println("3. 종료 ");
	
	/**
	 * 기사 조회
	 * @return 하나의 기사 반환 
	 */
	public List<BulletinVO> queryAllNews ();
	
	/**
	 * 기사 검색 
	 * @param index 기사 제목
	 * @return 기사 
	 */
	public void  addNewNews (BulletinVO newNews);
	
	
}
