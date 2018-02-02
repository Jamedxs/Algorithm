package com.dxs.leetcode.bitManipulation;

public class PrimeNumberofSetBitsinBinaryRepresentation {

    public static int countPrimeSetBits(int L, int R) {
        int res = 0;
        for (int i = L; i <= R ; i++) {
            String str = Integer.toBinaryString(i);
            int num = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == '1'){
                    num++;
                }
            }

            if(isPrimeNumber(num)){
                res++;
            }
        }
        return res;
    }

    public static boolean isPrimeNumber(int num){
        if(num == 2){
            return true;
        }
        if(num < 2 || num % 2 == 0){
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int L = 6, R = 10;
        System.out.println(countPrimeSetBits(L,R));
    }

}
