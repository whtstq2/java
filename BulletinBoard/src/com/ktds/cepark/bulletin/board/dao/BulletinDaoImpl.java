package com.ktds.cepark.bulletin.board.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktds.cepark.bulletin.board.vo.BulletinVO;

public class BulletinDaoImpl implements BulletinDao {

	private List<BulletinVO> bulletinList;
	
	public BulletinDaoImpl () {
		bulletinList = new ArrayList <BulletinVO>();
	}
	
	
	@Override
	public List<BulletinVO> queryAllNews() {

		return bulletinList;
	}

	@Override
	public void addNewNews(BulletinVO newNews) {
		bulletinList.add(newNews);
	}

}
