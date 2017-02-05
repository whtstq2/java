package com.ktds.cepark.make;

import java.io.File;

/**
 * 폴더를 생성해주는 프로그램 
 * @author Admin
 *
 */
public class MakeDirectory {
	
	
	public void start() {
		String directoryPath = "D:\\game\\mobie\\pokimon\\go";
		
		//폴더 만들기 
		File game = new File(directoryPath);
		//폴더를 생성한다
		if (!game.exists()) {
			game.mkdir();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		new MakeDirectory().start();
		

	}

}
