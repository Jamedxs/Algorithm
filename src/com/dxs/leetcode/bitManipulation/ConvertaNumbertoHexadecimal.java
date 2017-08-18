package com.dxs.leetcode.bitManipulation;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月19日 上午9:25:52
 * Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.
	Note:
	1. All letters in hexadecimal (a-f) must be in lowercase.
	2. The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented by a single zero character '0'; otherwise, the first character in the hexadecimal string will not be the zero character.
	3. The given number is guaranteed to fit within the range of a 32-bit signed integer.
	4. You must not use any method provided by the library which converts/formats the number to hex directly.
	Example 1:
	Input:
	26
	Output:
	"1a"
	Example 2:
	Input:
	-1
	Output:
	"ffffffff"
	解析：将一个十进制数转换成16进制，需要考虑十进制数位负的情况，如果不考虑负数的情况下，可以将十进制数除以16来计算，考虑到负数的情况下就需要转换成二进制来进行复杂的取反+1计算。
     参考了网上的代码，发现还有一张简单的方法，就是将十进制数想象成二进制数，位与 0xF （1111）  在十六进制char数组中找到，然后将十进制数右移四位，再找下一个数。

 */
public class ConvertaNumbertoHexadecimal {
	public static String toHex(int num) {
		if(num == 0) return "0";
		
		char[] ch = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		
		String res = "";
		
		while(num != 0){
			res = ch[num & 0xF] +res;
			num = num >>> 4;
		}
		
		return res;
    }
	public static void main(String[] args) {
		int num = 26;
		System.out.println(toHex(num));
	}

}
