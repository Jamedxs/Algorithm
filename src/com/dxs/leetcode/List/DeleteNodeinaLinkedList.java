package com.dxs.leetcode.List;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月5日 上午9:49:57
 * 
 */
public class DeleteNodeinaLinkedList {
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
