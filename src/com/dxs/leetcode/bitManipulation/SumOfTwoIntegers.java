package com.dxs.leetcode.bitManipulation;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月22日 下午3:37:44
 * 
 */
public class SumOfTwoIntegers {
	public static int getSum(int a, int b) {
		
        int j,k;
        do
        {
            j = a ^ b;
            k = (a & b) << 1;
     
            a = j;
            b = k;
        }
        while(b != 0);
       
        return a;
    }
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		System.out.println(getSum(a,b));

	}

}
