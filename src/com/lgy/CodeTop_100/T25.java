package com.lgy.CodeTop_100;

import com.lgy.JZoffer.entity.ListNode;

/**
 * K个一组反转链表
 * @author LGY
 * @create 2022-07-14 18:27
 */
public class T25 {

    public ListNode reverseKGroup(ListNode head, int k) {

        // 先判断是不是特殊情况
        if (head == null || head.next == null) {
            return head;
        }
        //创建一个头节点，并指向head；
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // 两个指针
        ListNode pre = dummy;
        ListNode end = dummy;
        while (end.next != null) {
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            if (end == null) {
                break;
            }
            ListNode next = end.next;
            end.next = null;

            ListNode start = pre.next;

            pre.next = reverse(start);
            start.next = next;

            pre = start;
            end = start;
        }
        return dummy.next;
    }

    //反转链表的方法
    public ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode next = null;

        while (head != null) {

            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;

    }
}
