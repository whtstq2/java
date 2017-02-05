package com.ktds.cepark;

public class Recursion {

	public void call(int index) {
		System.out.println("Recursion.call() 호출 중...." + index);

		if (index >= 0) {
			call(--index);
		}

		// 0이 되면 호출을 막아주는 프로그램
	}
}
