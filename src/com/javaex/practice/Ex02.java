package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		
		double[] dArray = {1.2, 3.3, 6.7};
		
		for (int i = 1; i <= dArray.length; i++) {
			System.out.println(dArray[dArray.length - i]);
		}
	}
}
