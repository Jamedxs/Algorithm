package com.dxs.leetcode.List;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月10日 上午9:16:08
 * 
 */
public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		ListNode newHead = null;
		while(head != null){
			ListNode pHead = head.next;
			head.next = newHead;
			newHead = head;
			head = pHead;
		}
		
		return newHead;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
