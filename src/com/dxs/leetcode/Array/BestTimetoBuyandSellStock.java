package com.dxs.leetcode.Array;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月19日 上午10:55:11
 * Say you have an array for which the ith element is the price of a given stock on day i.
	If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
	Example 1:

	Input: [7, 1, 5, 3, 6, 4]
	Output: 5

	max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)


	Example 2:

	Input: [7, 6, 4, 3, 1]
	Output: 0

	In this case, no transaction is done, i.e. max profit = 0.
	解析：寻找股票的最大利润，首先想到的是两个for循环，但是会超时，利用了简单的动态规划，动态规划需要学习。
 */
public class BestTimetoBuyandSellStock {
	//超时
	public static int maxProfit(int[] prices) {
		if(prices==null || prices.length == 0)
			return 0;
		
		int maxProfit = 0;
		
		for (int i = 0; i < prices.length; i++) {
			for (int j = i+1; j < prices.length; j++) {
				int price = prices[j] - prices[i];
				if(price > maxProfit){
					maxProfit = price;
				}
			}
		}
		
		return maxProfit;
    }
	
	public static int maxProfit2(int[] prices) {
		if(prices==null || prices.length == 0)
			return 0;
		int maxProfit = 0;
		
		int local = 0;
		
		for (int i = 0; i < prices.length-1; i++) {
			local = Math.max(local+prices[i+1]-prices[i], 0);
			maxProfit = Math.max(maxProfit, local);
		}
		return maxProfit;
    }
	public static void main(String[] args) {
		int[] prices = {7, 1, 5, 3, 6, 4};
		System.out.println(maxProfit2(prices));
	}

}
