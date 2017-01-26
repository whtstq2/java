package com.ktds.cepark.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite2 {

	public void start() {

		String filePath ="D:\\makeFile.txt";
		
		try {
			
			PrintWriter printWriter = 
					new PrintWriter (new BufferedWriter(new FileWriter(filePath, true)));
//			객체를 한번 밖에 안쓰니까 그냥 안에서 만들어준다 
//			한줄로 써버리기..!!!
			
//			파일에 데이터를 작성한다 
			printWriter.println("파일에...작성합니다 너무 복잡해여 ㅠㅜ");
			
			//writer라는게 쓰이면 반드시 클로스해주어야함
//		   클로즈는 순서대로 마지막으로 나온거부터 닫아주는거다 (역순으로)
			//데이터가 A에서 B로 쭉 흘러가는데 만일 이걸 안닫아주면 계속 메모리가 흘러가서 memory leak가 생긴다 
//			 그래서 꼭 닫아주어야함 
			printWriter.close();
			}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileWrite2().start();
	}

}
