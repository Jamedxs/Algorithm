package com.dxs.sring;
/**
 * @author dengxusheng
 * 2015年9月18日
 */
public class Test1 {

	public static void main(String[] args) {
		byte b1 = 1,b2 = 2,b3,b6,b8;
		//b3 = (b1+b2);
		//b6=b4+b5;
		//b8=(b1+b4);
		//b7=(b2+b5);
		//System.out.println(b3+b6);
	}
	
	public static int test(int b){
		try {
			b += 10;
			return b;
		} catch (RuntimeException e) {
			
		} catch (Exception e2) {
			
		}finally {
			b += 10;
			return b;
		}
	}

}
