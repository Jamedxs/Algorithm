package com.dxs.leetcode.Array;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月26日 下午2:22:42
 * 
 */
public class RangeAdditionII {
	public int maxCount(int m, int n, int[][] ops) {
        if(ops == null || ops.length == 0){
        	return m * n;
        }
        
        for (int[] op : ops) {
			m = Math.min(m, op[0]);
			n = Math.min(n, op[1]);
		}
        return m * n;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
