package com.lgy.CodeTop_100;

import com.lgy.JZoffer.entity.ListNode;

/**
 * @author LGY
 * @create 2022-07-12 13:25
 */
public class T206 {


    /**
     * 迭代
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode pre = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    /**
     * 递归
     * @param head
     * @return
     */
    public ListNode reverseList_1(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode root = reverseList_1(head.next);
        head.next.next = head;
        head.next = null;
        return root;
    }

    // 反转链表II, 也需要做。

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode pre = dummy;
        for(int i = 0;i < left-1; i++){
            pre = pre.next;
        }
        ListNode l = pre;

        for(int i = left-1; i< right;i++){
            pre = pre.next;
        }
        ListNode right_node = pre;
        ListNode r = pre.next;
        pre.next = null;

        ListNode left_node = l.next;
        l.next = null;

        right_node = left_node;
        ListNode h =  reverse(left_node);


        l.next = h;
        right_node.next=r;
        return dummy.next;
    }
    public ListNode reverse(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode pre = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

}
