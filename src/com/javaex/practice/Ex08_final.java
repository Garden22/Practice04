package com.javaex.practice;

class Ex_08_fianl {
	
    public static void main(String[] args) {

        int [] LottoNums = new int[6];
        int [] ref = new int[46];
        int random;

        for (int i = 0; i < ref.length; i++) {
            ref[i] = i;
        }

        for (int i = 0; i < LottoNums.length; i++) {

            while (true) {
                random = (int)(Math.random()*45) + 1;

                if (ref[random] != 0) {
                    break;
                }
            }
            LottoNums[i] = random;
            ref[random] = 0;
            System.out.print(random + " ");
        }
    }
}
