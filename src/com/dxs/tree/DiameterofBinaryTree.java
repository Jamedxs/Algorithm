package com.dxs.tree;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月17日 上午10:31:24
 * Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
Example:
Given a binary tree 

          1
         / \
        2   3
       / \     
      4   5    
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
Note: The length of path between two nodes is represented by the number of edges between them.
解析：求二叉树的直径，就是最长的距离。既是从root出来左子树到右子树的最长长度。立马想到的递归深度搜索，来求一个节点左或右的最长距离。
 */
public class DiameterofBinaryTree {
	int max = 0;
	public int diameterOfBinaryTree(TreeNode root) {
		dfsBinaryTree(root);
		return max;
    }
	public int dfsBinaryTree(TreeNode root){
		if(root == null)
			return 0;
		
		int left = dfsBinaryTree(root.left);
		int right = dfsBinaryTree(root.right);
		
		max = Math.max(max, left+right);
		
		return Math.max(left, right) + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
