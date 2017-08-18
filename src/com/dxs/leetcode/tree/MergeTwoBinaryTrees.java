package com.dxs.leetcode.tree;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月12日 上午11:27:10
 * 
 */
public class MergeTwoBinaryTrees {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if(t1 == null) return t2;
		if(t2 == null) return t1;
		//根节点相加
		t1.val += t2.val;
		//递归左子树
		t1.left = mergeTrees(t1.left,t2.left);
		//递归右子树
		t1.right = mergeTrees(t1.right,t2.right);
		return t1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
