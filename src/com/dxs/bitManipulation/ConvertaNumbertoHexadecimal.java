package com.dxs.bitManipulation;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月19日 上午9:25:52
 * 
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
