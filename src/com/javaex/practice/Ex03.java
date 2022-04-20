package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intA = {3, 6, 9};
		
		int[] intB;
		intB = intA; // 주소값 복사
		intB[0] = 20;
		intB[2] = 10;
		
		for (int i = 0; i < intA.length; i++) {
			System.out.println(intA[i]);
		}
		// A와 B가 같은 배열을 가리키고 있으므로 20, 6, 10 출력
	}
}
