package com.ktds.cepark.make;

import java.io.File;

/**
 * 폴더를 생성해주는 프로그램 
 * @author Admin
 *
 */
public class MakeDirectories {
	//여러가지의 depth로 만들어진 폴더를 한꺼번에 만들 땐 mkdirs()를 쓴다 
		//mkdir()는 마지막의 gp폴더를 만들어주는 것이기 때문에 mobie이랑 pokimon이 없어서 안만들어짐
	
	public void start() {
		String directoryPath = "D:\\game";
		
		//폴더 만들기 
		File game = new File(directoryPath);
		//폴더를 생성한다
		if (!game.exists()) {
		game.mkdirs();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		new MakeDirectories().start();
		

	}

}
