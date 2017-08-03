package com.dxs.bitManipulation;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年8月3日 上午9:49:49
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
	Example:
	Given num = 16, return true. Given num = 5, return false.
	Follow up: Could you solve it without loops/recursion?
	
	解析：判断一个数是否位4的次方，除4。

 */
public class PowerofFour {
	public boolean isPowerOfFour(int num) {
		while (num != 0 && (num % 4 == 0)) {
            num /= 4;
        }
        return num == 1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
