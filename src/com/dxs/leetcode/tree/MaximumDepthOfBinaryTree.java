package com.dxs.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月20日 上午9:51:57
 * 
 */
public class MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
		int i = 0;
		int j = 0;
        if(root == null) return 0;
        if(root.left != null){
        	i = maxDepth(root.left);
        }
        if(root.right != null){
        	j = maxDepth(root.right);
        }
        return i > j ? i+1:j+1;
    }
	public int maxDepthDFS(TreeNode root) {
		if(root == null) return 0;
		Stack<TreeNode> s = new Stack<TreeNode>();
		Stack<Integer> val = new Stack<Integer>();
		s.push(root);
		val.push(1);
		int max = 0;
		while(!s.isEmpty()){
			TreeNode node = s.pop();
			int temp = val.pop();
			max = Math.max(max, temp);
			if(node.left != null){
				s.push(node.left);
				val.push(temp+1);
			}
			if(node.right != null){
				s.push(node.right);
				val.push(temp+1);
			}
		}
		return max;
    } 
	
	public int maxDepthBFS(TreeNode root) {
		if(root == null) return 0;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		int count = 0;
		while(!queue.isEmpty()){
			int size = queue.size();
			while(size-- > 0){
				TreeNode node = queue.poll();
				if(node.left != null) {
	                queue.offer(node.left);
	            }
	            if(node.right != null) {
	                queue.offer(node.right);
	            }
			}
			count++;
		}
		return count;
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
