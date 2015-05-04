package com.dxs.qunaer;

public class DecryptionString {

	/**
	 * 给字符解密，解密的规则如下，a2bc3c5e6,解密之后的结果是：aabcbcbcccceeeeee,其中整数的值不超过整型的最大值
	 */
	public static void main(String[] args) {
		String s1 = "a2bc3d1";
		System.out.println(decode(s1));

	}
	private static boolean judgeNumber(char ch){
		if(ch >= '0' && ch <= '9') return true;
		else return false;
	}
	
	
	private static String decode(String str){
		int N = str.length();
		int k = 0;//记录数字下标
		StringBuilder sbNumber = new StringBuilder();
		StringBuilder sbCharacter = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		
		for (int i = 0; i < N; i++) {
			if(judgeNumber(str.charAt(i))){//如果为数字
				sbNumber.append(str.charAt(i));
				k = Integer.valueOf(sbNumber.toString());
				flag = true;
			}else{
				if(flag){
					for (int j = 0; j < k; j++) {
						sb.append(sbCharacter);
					}
					flag = false;
					sbNumber.delete(0, sbNumber.length());
					sbCharacter.delete(0, sbCharacter.length());
				}
				//字符 
				sbCharacter.append(str.charAt(i));
			}
		}
		for (int i = 0; i < k; i++) {//最后一位是数字的情况
			sb.append(sbCharacter);
		}
		return sb.toString();
	}
}
