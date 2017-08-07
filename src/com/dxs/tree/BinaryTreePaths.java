package com.dxs.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.print.attribute.standard.Fidelity;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年8月7日 上午9:09:12
 * Given a binary tree, return all root-to-leaf paths.
	For example, given the following binary tree:
	
	   1
	 /   \
	2     3
	 \
	  5
	All root-to-leaf paths are:
	["1->2->5", "1->3"]
 */
public class BinaryTreePaths {
	List<String> res = new ArrayList<String>();
	//递归
	public List<String> binaryTreePaths(TreeNode root) {
		if(root != null) findTreePaths(root,String.valueOf(root.val));
		return res;
	}
	
	private void findTreePaths(TreeNode node , String val){
		if(node.left == null && node.right == null) res.add(val);
		if(node.left != null) findTreePaths(node.left, val+"->"+node.left.val);
		if(node.right != null) findTreePaths(node.right, val+"->"+node.right.val);
	}
	
	//深度优先搜索
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
