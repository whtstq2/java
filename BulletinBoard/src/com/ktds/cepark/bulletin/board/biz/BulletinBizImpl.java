package com.ktds.cepark.bulletin.board.biz;

import java.util.List;
import java.util.Scanner;


import com.ktds.cepark.bulletin.board.dao.BulletinDao;
import com.ktds.cepark.bulletin.board.dao.BulletinDaoImpl;
import com.ktds.cepark.bulletin.board.vo.BulletinVO;

public class BulletinBizImpl implements BulletinBiz{

	private Scanner input;
	private BulletinDao bulletinDao;
	
	public BulletinBizImpl() {
		input = new Scanner (System.in);
		bulletinDao = new BulletinDaoImpl();
	}
	@Override
	public void queryAllNews() {
		List <BulletinVO>bulletinList = bulletinDao.queryAllNews();
		System.out.println("-----------Whole Article List---------");
		for (BulletinVO bulletin: bulletinList) {
			printNewsHeadline(bulletin);
		}
		System.out.println("-------------------------------------");
	}
	
	private void printNewsHeadline (BulletinVO bulletin) {

		System.out.printf("article: %s, News stand: %s, Reporter: %s\n",
				bulletin.getNewsName(),bulletin.getNewsStand(),bulletin.getReporterName());

		}
	
	


	@Override
	public void addNewNews( ) {
	
		System.out.println("put new article");
		
		System.out.println("input the article name what you want");
		String newsHeadline = input.next();
		System.out.println("input the stand name");
		String newsStand = input.next();
		System.out.println("input the reporter name ");
		String reporter = input.next();
		
		BulletinVO bulletinVO = new BulletinVO();
		bulletinVO.setNewsName(newsHeadline);
		bulletinVO.setNewsStand(newsStand);
		bulletinVO.setReporterName(reporter);

		bulletinDao.addNewNews(bulletinVO);
		
	}
	
	
}
