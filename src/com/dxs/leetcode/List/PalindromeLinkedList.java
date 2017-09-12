package com.dxs.leetcode.List;

import java.util.Stack;

/**
 * Created by dengxusheng on 2017-09-12.
 * Given a singly linked list, determine if it is a palindrome.
     Follow up:
     Could you do it in O(n) time and O(1) space?

     解析：使用快慢指针来进行，当快指针到链表尾部时候，慢指针正好到链表中间，在这个同时当前半部分放到栈中，在扫描后半部分链表的时候，做出栈处理，比较是否相等，利用了栈先进后出的原理，时间复杂度O(n)，空间复杂度O(n)。
     要想空间复杂度为O(1)，就不能使用栈，在扫描后半链表的时候，将链表反转，然后在比较。
 */
public class PalindromeLinkedList {
    //空间复杂度O(n) 时间复杂度O(n)
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        Stack<Integer> stack = new Stack<>();
        stack.push(head.val);
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            stack.push(slow.val);
        }
        if(fast.next == null) stack.pop();
        while(slow.next != null){
            slow = slow.next;
            int temp = stack.pop();
            if(temp != slow.val) return false;
        }
        return true;
    }
    //空间复杂度O(1) 时间复杂度O(n)
    public boolean isPalindrome2(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode node = slow.next;
        ListNode pre = head;
        //后半截链表反转
        while(node.next != null){
            ListNode temp = node.next;
            node.next = temp.next;
            temp.next = slow.next;
            slow.next = temp;
        }

        while(slow.next != null){
            slow = slow.next;
            if(pre.val != slow.val) return false;
            pre = pre.next;
        }

        return true;
    }
}
