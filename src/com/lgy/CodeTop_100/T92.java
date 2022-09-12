package com.lgy.CodeTop_100;

import com.lgy.JZoffer.entity.ListNode;

/**
 * @author LGY
 * @create 2022-07-17 17:16
 */
public class T92 {

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

    /**
     * 二刷
     * @param head
     * @param left
     * @param right
     * @return
     */
    public ListNode reverseBetween_1(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(1);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i = 0;i < left-1; i++){
            pre = pre.next;
        }
        ListNode left_node = pre;
        ListNode start = left_node.next;

        for(int i = left - 1;i < right; i++ ){
            pre = pre.next;
        }
        ListNode end = pre;
        ListNode right_node = end.next;

        left_node.next = null;
        end.next =null;
        ListNode h = reverse_1(start);
        left_node.next = h;
        start.next = right_node;
        return dummy.next;

    }

    public ListNode reverse_1(ListNode head){
        if(head == null){
            return head;
        }
        ListNode pre = null;
        ListNode next = head;

        while(head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    /**
     * 三刷
     * @param head
     * @param left
     * @param right
     * @return
     */
    public ListNode reverseBetween_3(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode next = dummy;
        int left_num = 0;
        int right_num = 0;

        while(left_num < left-1){
            pre = pre.next;
            left_num++;
        }
        ListNode start = pre.next;
        right_num = left_num;
        next = pre;
        while(right_num < right){
            next = next.next;
            right_num++;
        }
        ListNode end = next;
        next = next.next;
        pre.next = null;
        end.next = null;

        pre.next = reverse_3(start);
        start.next = next;
        return dummy.next;

    }

    public ListNode reverse_3(ListNode root){
        ListNode pre = null;
        ListNode end = null;

        while(root != null){
            end = root;
            root = root.next;
            end.next = pre;
            pre = end;
        }
        return pre;
    }
}
