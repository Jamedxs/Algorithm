package com.dxs.leetcode.Array;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月27日 上午9:42:09
 * 
 */
public class ConstructtheRectangle {
	public static int[] constructRectangle(int area) {
		int[] res = {0,0};
		int min = Integer.MAX_VALUE;
        if(area == 0) return res;
        for (int i = 1; i <= area; i++) {
			if(area % i == 0){
				int j = area / i;
				if(i >= j && (i -j) <= min ){
					min = i - j;
					res[0] = i;
					res[1] = j;
				}
			}
		}
        return res;
    }
	
	public static int[] constructRectangle2(int area) {
		int[] res = new int[2];
        if(area == 0) return res;
        //开方根向下取整
        int i = (int) Math.sqrt(area);
        
        while(area % i != 0){
        	i--;
        }
        int j = area / i;
        res[0] = j;
        res[1] = i;
        
        return res;
    }
	public static void main(String[] args) {
		int area = 8;
		System.out.println(constructRectangle2(area));
	}

}
