package com.dxs.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月5日 上午10:21:00
 * 
 */
public class SameTree {
	//递归
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val == q.val){
        	return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }
	
	public boolean isSameTreeDFS(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        
        Stack<TreeNode> pStack = new Stack<TreeNode>();
        Stack<TreeNode> qStack = new Stack<TreeNode>();
        
        pStack.push(p);
        qStack.push(q);
        
        while(!pStack.isEmpty() && !qStack.isEmpty()){
        	
        	TreeNode pNode = pStack.pop();
        	TreeNode qNode = qStack.pop();
        	
        	if(pNode.val != qNode.val){
        		return false;
        	}
        	
        	if(pNode.left != null) pStack.push(pNode.left);
        	if(qNode.left != null) qStack.push(qNode.left);
        	if(pStack.size() != qStack.size()) return false;
        		
        	if(pNode.right != null) pStack.push(pNode.right);
        	if(qNode.right != null) qStack.push(qNode.right);
        	if(pStack.size() != qStack.size()) return false;
        	
        }
        return pStack.size() == qStack.size();
    }
	
	public boolean isSameTreeBFS(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        
        Queue<TreeNode> pQueue = new LinkedList<TreeNode>();
        Queue<TreeNode> qQueue = new LinkedList<TreeNode>();
        
        pQueue.offer(p);
        qQueue.offer(q);
        
        while(!pQueue.isEmpty() && !qQueue.isEmpty()){
        	int pSize = pQueue.size();
        	int qSize = qQueue.size();
        	while(pSize-- > 0 && qSize-- > 0){
        		TreeNode pNode = pQueue.poll();
            	TreeNode qNode = qQueue.poll();
            	
            	if(pNode.val != qNode.val){
            		return false;
            	}
            	
            	if(pNode.left != null) pQueue.offer(pNode.left);
            	if(qNode.left != null) qQueue.offer(qNode.left);
            	if(pQueue.size() != qQueue.size()) return false;
            		
            	if(pNode.right != null) pQueue.offer(pNode.right);
            	if(qNode.right != null) qQueue.offer(qNode.right);
            	if(pQueue.size() != qQueue.size()) return false;
        	}
        }
        return pQueue.size() == qQueue.size();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
