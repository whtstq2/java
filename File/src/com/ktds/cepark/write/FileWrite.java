package com.ktds.cepark.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {

	public void start() {

		String filePath ="D:\\makeFile.txt";
		
		try {
			//파일에 데이터를 쓸 수 있도록 지원해주는 클래스 
			FileWriter fileWriter = new FileWriter(filePath, true);
			//FileWriter(속성,append 속성) 이 참이기 때문에 실행 시킬때마다 글이 써진다 
			
			//메모리에 있는 내용을 손실시키지 않고 파일에 쓰도록 지원해주는 클래스
//			메모리의 데이터를 FileWriter에 전달해주는 역할
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
//			작성하려는 데이터를 메모리에 적절히 적재시킬 수 있도록 지원홰주는 클래스 
//			데이터를 BufferedWriter에게 전달해주는 역할 
			PrintWriter printWriter = new PrintWriter (bufferedWriter);
			
//			파일에 데이터를 작성한다 
			printWriter.println("파일에...작성합니다 너무 복잡해여 ㅠㅜ");
			
			//writer라는게 쓰이면 반드시 클로스해주어야함
//		   클로즈는 순서대로 마지막으로 나온거부터 닫아주는거다 (역순으로)
			//데이터가 A에서 B로 쭉 흘러가는데 만일 이걸 안닫아주면 계속 메모리가 흘러가서 memory leak가 생긴다 
//			 그래서 꼭 닫아주어야함 
			printWriter.close();
			bufferedWriter.close();
			fileWriter.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileWrite().start();
	}

}
