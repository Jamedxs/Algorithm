package com.dxs.leetcode.List;
/*
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */

public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int val = 0;
		ListNode t1 = l1;	  //l1链表的标志指针
		ListNode t2 = l2;	  //l2链表的标志指针
		ListNode l3 = new ListNode(0);   //返回结果链表
		ListNode t3 = l3;     //l3链表的标志指针
		
		while(t1 != null || t2 != null){
			if(t1 != null){
				val += t1.val;
				t1 = t1.next;
			}
			if(t2 != null){
				val += t2.val;
				t2 = t2.next;
			}
			t3.next = new ListNode(val%10);
			t3 = t3.next;
			val /= 10;
		}
		if(val == 1){
			t3.next = new ListNode(1);
		}
		
		return l3.next;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		addTwoNumbers(l1,l2);

	}

}
