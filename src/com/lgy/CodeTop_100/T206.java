package com.lgy.CodeTop_100;

import com.lgy.JZoffer.entity.ListNode;

/**
 * @author LGY
 * @create 2022-07-12 13:25
 */
public class T206 {


    /**
     * 迭代
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
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

    /**
     * 递归
     *
     * @param head
     * @return
     */
    public ListNode reverseList_1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode root = reverseList_1(head.next);
        head.next.next = head;
        head.next = null;
        return root;
    }


    /**
     * 第二遍——反转链表
     *
     * @param head
     * @return
     */
    public ListNode reverseList_2(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode pre = null;
        ListNode end = head;

        while (head != null) {
            head = head.next;
            end.next = pre;
            pre = end;
            end = head;

        }
        return pre;
    }

}
