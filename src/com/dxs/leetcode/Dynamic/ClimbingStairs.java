package com.dxs.leetcode.Dynamic;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年8月11日 上午9:09:41
 * You are climbing a stair case. It takes n steps to reach to the top.
	Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
	Note: Given n will be a positive integer.
	
	解析：此题可以使用动态规划来解，状态dp[i] 为经过i步到达top需要的爬梯子方式。
	状态转换方程为 dp[i] = dp[i-1] +dp[i-2]
 */
public class ClimbingStairs {
	public int climbStairs(int n) {
        if(n == 1) return 1;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
        return dp[n];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
