package com.dxs.leetcode.Dynamic;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年8月14日 上午9:36:13
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
	Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
	
	解析：抢到抢劫房子，要求不能抢相邻的房子，意味着要在int数组中不能选取连续的数。
	用到动态规划 先维护一个数组dp[i] 为偷到i个房子后获得的金钱总和。分析一个数组int[] nums = {3,2,4,5,6}
	dp[0] = 3 dp[1]=dp[0]+4=7  dp[2] = dp[1]+6=13
	
	dp[i] = max( dp[i-1] , dp[i-2]+nums[i]  )
	需要初始化 dp[0] = nums[0]   dp[1] = max(nums[0],nums[1])
 */
public class HouseRobber {
	public int rob(int[] nums) {
		int len = nums.length;
		if(nums == null || len <= 0) return 0;
        int[] dp = new int[len];
        if(len < 2) return nums[0];
        //初始化dp[0]和dp[1]
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < len; i++) {
			dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
		}
        return dp[len-1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
