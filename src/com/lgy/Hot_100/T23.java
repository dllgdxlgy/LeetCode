package com.lgy.Hot_100;

import java.util.PriorityQueue;

/**
 * @author LGY
 * @create 2022-02-24 22:48
 */


public class T23 {

    /**
     * 暴力解法
     *
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {

//        //特殊情况
//        if (lists.length == 0 || lists[0] == null) {
//            return new ListNode();
//        }

        ListNode listNode = null;
        for (int i = 0; i < lists.length; i++) {
            listNode = merge_K_Lists(listNode, lists[i]);

        }


        return listNode;
    }

    public ListNode merge_K_Lists(ListNode listNode1, ListNode listNode2) {

        if (listNode1 == null || listNode2 == null) {
            return listNode1 != null ? listNode1 : listNode2;
        }

        ListNode head = new ListNode(0);
        ListNode tail = head, list1 = listNode1, list2 = listNode2;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }
        tail.next = (list1 != null ? list1 : list2);
        return head.next;


    }



}
