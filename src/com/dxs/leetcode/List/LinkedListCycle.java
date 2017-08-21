package com.dxs.leetcode.List;

/**
 * Created by dengxusheng on 2017-08-21.
 * Given a linked list, determine if it has a cycle in it.
     Follow up:
     Can you solve it without using extra space?

     解析：判断一个链表是否有环，由于这个环并不是完全的闭环，可以在中间的位置形成环，就需要用到快慢指针，一个快指针和一个慢指针，如果存在环，两个指针一定会相遇的。
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fastNode = head;
        ListNode slowNode = head;

        while (fastNode != null && fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if(slowNode == fastNode) return true;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
