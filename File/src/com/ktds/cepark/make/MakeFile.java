package com.ktds.cepark.make;

import java.io.File;
import java.io.IOException;
/**
 * 파일을 위치에 만드는 프로그램
 * D드라이브에 txt파일을 만들어준다
 * @author Admin
 *
 */

public class MakeFile {
	
	public void start () {
		
		String filePath = "D:\\makeFile.txt";
		
		File textFile = new File(filePath);  // 파일이 존재하든 아니든 파일 객체를 만들어준다 
		try {
			//파일을 실제 저장소에 만든다 
			if (!textFile.exists() ) {
				
			
			textFile.createNewFile();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MakeFile().start();
		
		
		

	}

}
