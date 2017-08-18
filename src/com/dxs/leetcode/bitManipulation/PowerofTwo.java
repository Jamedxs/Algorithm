package com.dxs.leetcode.bitManipulation;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月24日 上午10:08:43
 * Given an integer, write a function to determine if it is a power of two.
	解析：判断一个数是否为2的次方。 一个数若为2的次方，那2进制中最高位为1，其余位为0。
	可以使用，我们只要每次判断最低位是否为1，然后向右移位，最后统计1的个数即可判断是否是2的次方数，代码如isPowerOfTwo2所示。
	
	参考网上的答案后，看到另外一种解法，值得学习，由于最高位位1其余位位0，当n-1后最高位为0，其余位为1，两个数想与后为0，见isPowerOfTwo3
 */
public class PowerofTwo {
	public static boolean isPowerOfTwo(int n) {
		if(n < 0)
			return false;
        String str = Integer.toBinaryString(n);
        if(str.charAt(0) != '1'){
			return false;
		}
        for (int i = 1; i < str.length(); i++) {
			if(str.charAt(i) != '0')
				return false;
		}
        
        return true;
    }
	
	public static boolean isPowerOfTwo2(int n) {
		int res = 0;
		while(n > 0){
			res += (n & 1);
			n >>= 1;
		}
		return res == 1;
    }
	
	public static boolean isPowerOfTwo3(int n) {
		if(n < 0) return false;
		if((n & (n - 1)) == 0) return true;
		return false;
    }
	
	
	
	public static void main(String[] args) {
		int n = -2147483648;
		System.out.println(isPowerOfTwo(n));
	}

}
