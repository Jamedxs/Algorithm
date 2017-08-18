package com.dxs.leetcode.bitManipulation;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月7日 上午10:51:50
 * 
 */
public class NumberComplement {
	
	public static int findComplement(int num) {
		String str = Integer.toBinaryString(num);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '1'){
				sb.append("0");
			}else{
				sb.append("1");
			}
		}
		int res = Integer.valueOf(sb.toString(),2);
		return res;
    }


	public static void main(String[] args) {
		int num = 5;
		System.out.println(findComplement(num));
	}

}
