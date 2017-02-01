package com.ktds.cepark.read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	private final String LOG_FOLDER_PATH = "D:\\logs";

	private final String LOG_FILE_PATH = LOG_FOLDER_PATH + "\\Calculator.log";

	public void start() {
		try {

			FileReader fr = new FileReader(LOG_FILE_PATH);
			BufferedReader br = new BufferedReader(fr);

			try {
				String line = null;
				while (true) {

					line = br.readLine();
					if (line == null) {
						break;
					}
					System.out.println(line);
					FileWriteHelper.log(line);
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new FileRead().start();
	}

}
