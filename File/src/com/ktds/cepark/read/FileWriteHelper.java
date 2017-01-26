package com.ktds.cepark.read;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteHelper {
	
	
	private final String LOG_FOLDER_PATH = "D:\\logs";
	
	private final String LOG_FILE_PATH =LOG_FOLDER_PATH + "\\Calculator.log";
	
	public void log(String message) {
		
		// D:\\logs 폴더 생성 
		makeLogsFolder();
		
		
//		D:\\logs\\Calculator.log 파일 생성
		makeCalculatorLogFile();
		
//		D: \logs\\Calculator.log 파일에 message를 기록
		writeLog(message);
		
	}
	private void makeLogsFolder ( ) {
		File logsFolder = new File(LOG_FOLDER_PATH);
		if (!logsFolder.exists()) {
			logsFolder.mkdirs();
			
		}
		else if ( !logsFolder.isDirectory()) {
			logsFolder.mkdirs();
		}
	}
	private void makeCalculatorLogFile() {
		File logFile = new File( LOG_FILE_PATH);
		
		if (!logFile.exists()) {
		try {
			logFile.createNewFile();
		}
		catch(IOException e) {
			e.printStackTrace();
			
			}
		}
		
	}

	private void writeLog(String message) {
		
		
		try{
			FileWriter fw = new FileWriter(LOG_FILE_PATH, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter (bw);
			
			out.println(message);
			out.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
	
	
	
}
