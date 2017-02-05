package com.ktds.cepark;

import com.ktds.cepark.helper.FileWriteHelper;

public class Calculator {
	
	
	private FileWriteHelper fileWriteHelper;
	
	public Calculator() {
		fileWriteHelper = new FileWriteHelper();
	}
	
	public void start () {
		int result = 10+70;
		String message = String.format("%d + %d = %d", 10, 70,result);
		System.out.println(message);
		
		
		fileWriteHelper.log(message);
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		 
		
		new Calculator().start();
	}

}
