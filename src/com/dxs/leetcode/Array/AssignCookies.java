package com.dxs.leetcode.Array;

import java.util.Arrays;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月28日 上午9:47:24
 * Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie. Each child i has a greed factor gi, which is the minimum size of a cookie that the child will be content with; and each cookie j has a size sj. If sj >= gi, we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.
	Note:
	You may assume the greed factor is always positive. 
	You cannot assign more than one cookie to one child.
	Example 1:
	Input: [1,2,3], [1,1]
	Output: 1
	Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
	And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
	You need to output 1.
	Example 2:
	Input: [1,2], [1,2,3]
	Output: 2
	Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2. 
	You have 3 cookies and their sizes are big enough to gratify all of the children, 
	You need to output 2.
	解析：分蛋糕，因为题意没说是否有序，先将两个数组都排序，然后在一次循环即可得到结果。遍历蛋糕数组s的时候，因为都是已经排序好的数组，当孩子数组g分到蛋糕之后即可++，给下一个孩子进行分蛋糕。	
 * 
 */
public class AssignCookies {
	
	public static int findContentChildren(int[] g, int[] s) {
        //先将两个数组进行排序
		Arrays.sort(g);
		Arrays.sort(s);
		int count = 0;
		for (int i = 0; i < s.length && count < g.length; i++) {
			if(g[count] <= s[i]) count++;
		}
		
		return count;
    }
	public static void main(String[] args) {
		int[] g = {10,9,8,7};
		int[] s = {5,6,7,8};
		System.out.println(findContentChildren(g,s));
	}
}
