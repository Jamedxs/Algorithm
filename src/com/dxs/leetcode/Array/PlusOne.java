package com.dxs.leetcode.Array;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年8月3日 上午9:27:50
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
	You may assume the integer do not contain any leading zero, except the number 0 itself.
	The digits are stored such that the most significant digit is at the head of the list.
	解析：一个非负数，用数组表示，然后+1，返回。注意是否由进位。

 */
public class PlusOne {
	public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
			if(digits[i] == 9){
				digits[i] = 0;
			}else{
				digits[i]++;
				return digits;
			}
		}
        
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        for (int i = 1; i < newDigits.length; i++) {
        	newDigits[i] = digits[i-1];
		}
        
        return newDigits;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
