package com.dxs.leetcode.Array;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月3日 上午10:15:43
 * 
 */
public class BestTimetoBuyandSellStockII {
	public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length - 1; i++) {
			if(prices[i+1] > prices[i]){
				res += prices[i+1] - prices[i];
			}
		}
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
