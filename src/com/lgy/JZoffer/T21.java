package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.ListNode;

/**
 * T21. 删除链表的倒数第 n 个结点
 * https://leetcode.cn/problems/SLwz0R/
 * @author LGY
 * @create 2022-07-01 23:08
 */
public class T21 {

    /**
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // write code here
        ListNode root = new ListNode(0);
        root.next = head;
        ListNode right = root;
        ListNode left = root;

        int i = 0;
        while(i <= n){
            right = right.next;
            i++;
        }
        while(right != null){
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;

        return root.next;
    }
}
