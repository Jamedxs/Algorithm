package com.dxs.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月25日 上午9:35:32
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
	For example:
	Given binary tree [3,9,20,null,null,15,7],
	
	    3
	   / \
	  9  20
	    /  \
	   15   7
	return its bottom-up level order traversal as:
	[
	  [15,7],
	  [9,20],
	  [3]
	]
	解析：将一个二叉树，从下到上变成list输出。我的想法是先利用广度优先搜索，将list存到栈中，然后在将栈中的list推出来，得到从下到上的list
 */
public class BinaryTreeLevelOrderTraversalII {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(root == null) return list;
		
		Stack<List<Integer>> stack = new Stack<List<Integer>>();
		//广度优先搜索
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		queue.offer(root);
		
		while(!queue.isEmpty()){
			int size = queue.size();
			List<Integer> nodeList = new ArrayList<Integer>();
			while(size-- > 0){
				TreeNode node = queue.poll();
				if(node == null){
					continue;
				}
				nodeList.add(node.val);
				if(node.left != null){
					queue.offer(node.left);
				}
				if(node.right != null){
					queue.offer(node.right);
				}
			}
			stack.push(nodeList);
		}
		
		
		while(!stack.isEmpty()){
			List<Integer> arrayList = stack.pop();
			list.add(arrayList);
		}
		
		return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
