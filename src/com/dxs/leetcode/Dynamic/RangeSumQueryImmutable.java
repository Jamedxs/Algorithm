package com.dxs.leetcode.Dynamic;

/**
 * Created by dengxusheng on 2017-10-10.
 * 解析：动态规划的题目，题目要求给出数组范围，然后输出数组范围内和的值。新new一个和的数组sum，然后将范围内的值都放到sum内，然后返回得到范围内的值。
 */
public class RangeSumQueryImmutable {

    private int[] sum;

    public void NumArray(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i+1] =  sum[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j+1] - sum[i];
    }
}
