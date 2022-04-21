package com.javaex.practice;

public class Ex08_1 {

	public static void main(String[] args) {
		
		int[] LottoNums = new int[6];
		int random;
		int count;
		
		
		for (int i = 0; i < LottoNums.length; i++) {
			
			count = 100;
			do {
				random = (int)(Math.random()*45) + 1;
				
				for (int j = 0; j < i; j++) {
					if (LottoNums[j] != random) {
						count += 1;						
					} 
				}
			} while (count != 100 + i);
			
			LottoNums[i] = random;
			System.out.print(random + " ");
		}
	}
}
