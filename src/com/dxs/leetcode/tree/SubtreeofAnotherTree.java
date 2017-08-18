package com.dxs.leetcode.tree;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月20日 上午9:59:08
 * Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.
Example 1:
Given tree s:
     3
    / \
   4   5
  / \
 1   2

Given tree t:
   4 
  / \
 1   2

Return true, because t has the same structure and node values with a subtree of s.
Example 2:
Given tree s:
     3
    / \
   4   5
  / \
 1   2
    /
   0

Given tree t:
   4
  / \
 1   2

Return false.


解析：求一个树t是否是s 的子树。这道题我没想出来，两种解法都参考了答案，惭愧。感觉答案写的很好，值得学习。

 */
public class SubtreeofAnotherTree {
	public boolean isSubtree(TreeNode s, TreeNode t) {
        String tree1 = treeToString(s,true);
        String tree2 = treeToString(t, true);
        return tree1.indexOf(tree2) >= 0;
    }
	
	public String treeToString(TreeNode node,boolean left){
		if(node == null){
			if(left)
				return "lnull";
			else
				return "rnull";
		}
		return "#"+node.val + " " + treeToString(node.left,true) + " " + treeToString(node.right,false);
	}
	
	
	public boolean isSubtree2(TreeNode s, TreeNode t) {
        return s!=null && ( equals(s,t) || isSubtree2(s.left,t) || isSubtree2(s.right,t) );
    }
	public boolean equals(TreeNode x, TreeNode y){
		if(x == null && y == null)
			return true;
		if(x == null || y == null)
			return false;
		
		return x.val==y.val && equals(x.left,y.left) && equals(x.right,y.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
