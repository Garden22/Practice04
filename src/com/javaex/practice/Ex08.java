package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		int[] LottoNums = new int[6];
		int random = 0;
		int count;
		
		for (int i = 0; i < LottoNums.length; i++) {
			count = 0;
			
			while (true) {
				random = (int)(Math.random()*45) + 1;
				
				for (int j = 0; j < i; j++) {
					if (LottoNums[j] != random) {
						count += 1;
					} else {
						break;
					}
				}
				if (count == i) {
					break;
				}
			}
			LottoNums[i] = random;
			System.out.print(random + " ");
		}
	}
}
