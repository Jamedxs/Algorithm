package com.dxs.leetcode.List;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月26日 上午9:58:43
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
	For example,
	Given 1->1->2, return 1->2.
	Given 1->1->2->3->3, return 1->2->3.
	
	解析：很经典的链表去重题目。设置两个节点，一个当前节点，一个next节点，然后判断重复。
 */
public class RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
       if(head == null || head.next == null) return head;
        //当前节点
        ListNode pCurrent = head;
        //下一个节点
        ListNode qNext = head.next;
        
        while(qNext != null){
        	if(pCurrent.val == qNext.val){
        		pCurrent.next = qNext.next;
        	}else{
        		pCurrent = pCurrent.next;
        	}
        	
        	qNext = qNext.next;
        }
		
		return head; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
