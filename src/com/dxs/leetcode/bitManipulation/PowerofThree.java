package com.dxs.leetcode.bitManipulation;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月25日 上午9:04:54
 * Given an integer, write a function to determine if it is a power of three.
	Follow up:
	Could you do it without using any loop / recursion?
	Credits:
	Special thanks to @dietpepsi for adding this problem and creating all test cases.
	
	解析：判断一个数是否为3的次方。 正常想法就是除3，看最后余数是否为1.见代码1
	由于输入是int，正数范围是0-231，在此范围中允许的最大的3的次方数为319=1162261467，那么我们只要看这个数能否被n整除即可，参见代码2：
 */
public class PowerofThree {
	public boolean isPowerOfThree(int n) {
		while(n > 0 && n % 3 == 0){
			n /= 3;
		}
		return n == 1;
    }
	
	public boolean isPowerOfThree2(int n) {
		if(n <= 0) return false;
		if(1162261467 % n == 0) return true;
		return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
