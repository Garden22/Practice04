package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		int[] LottoNums = new int[6];
		int random;
		int count;
		
		
		for (int i = 0; i < LottoNums.length; i++) { // for문 한 번 돌 떄 숫자 하나 생성 + 프린트
			
			count = 0;
			
			while (true) { // 겹치지 않는 숫자 얻었을 때 break됨
				random = (int)(Math.random()*45) + 1; // 난수 생성
				
				for (int j = 0; j < i; j++) {
					if (LottoNums[j] != random) { // 기존 배열에 n이 없다면 count + 1
						count += 1;
					} 
				}
				
				if (count == i) { // i-1까지의 수를 확인, index가 아니라 개수 체크이므로 +1
					break; // 조건 만족하면 겹치지 않는 수이므로 break, 아니라면 다시 수 생성
				}
			}
			
			LottoNums[i] = random;
			System.out.print(random + " ");
		}
	}
}