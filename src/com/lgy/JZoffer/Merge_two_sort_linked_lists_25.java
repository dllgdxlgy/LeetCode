package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.ListNode;

/**
 * 合并两个递增链表
 *
 * @author LGY
 * @create 2021-12-26 10:11
 */
public class Merge_two_sort_linked_lists_25 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // 1. 先判断是不是特殊情况
        if (l1 == null || (l1 == null && l2 == null))return l2;
        if (l1 == null)return l1;

        // 1. 创建伪头部
        ListNode node = new ListNode(-1);
        ListNode cur = node;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;

            } else {
                cur.next = l2;
                l2 = l2.next;

            }
            cur = cur.next;
        }

        if (l1 == null){
            cur.next = l2;
        }else {
            cur.next = l1;
        }


        return node.next;
    }
}
