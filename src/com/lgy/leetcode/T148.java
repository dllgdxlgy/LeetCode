package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * T148 排序链表
 *
 * @author LGY
 * @create 2022-08-25 15:55
 */
public class T148 {

    /**
     * 方法一：自顶向下归并排序
     * @param head
     * @return
     */
    public ListNode sortList(ListNode head) {

//        if(head == null ||head.next == null){
//            return head;
//        }
//        ListNode slow = head;
//        ListNode fast = head;
//        ListNode temp = head;
//        while(fast != null && fast.next != null){
//            temp = slow;
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        temp.next = null;
//        fast = slow;
//        slow = head;
        return sortList(head, null);
    }

    public ListNode sortList(ListNode head, ListNode tail) {
        if (head == null) {
            return head;
        }
        if (head.next == tail) {
            head.next = null;
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

//        while (fast != tail) {
//            slow = slow.next;
//            fast = fast.next;
//            if (fast != tail) {
//                fast = fast.next;
//            }
//        }
        while(fast!=tail && fast.next!=tail){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow;
        ListNode list1 = sortList(head, mid);
        ListNode list2 = sortList(mid, tail);
        ListNode res = merge(list1, list2);
        return res;
    }

    private ListNode merge(ListNode list1, ListNode list2) {

        ListNode dummyNode = new ListNode(0);
        ListNode temp = dummyNode;
        ListNode listNode1 = list1;
        ListNode listNode2 = list2;

        while (listNode1 != null && listNode2 != null) {
            if (listNode1.val <= listNode2.val) {
                temp.next = listNode1;
                listNode1 = listNode1.next;
            } else {
                temp.next = listNode2;
                listNode2 = listNode2.next;
            }
            temp = temp.next;
        }
        if (listNode1 != null) {
            temp.next = listNode1;
        }
        if (listNode2 != null) {
            temp.next = listNode2;
        }
        return dummyNode.next;
    }


    /**
     * 方法一：自己做的，但是是不合格的，空间复杂度太高
     *
     * @param head
     * @return
     */
    public ListNode sortList_1(ListNode head) {

        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        // list 转为 int[] 数组
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();

        Arrays.sort(arr);

        ListNode dummy = new ListNode(-1);
        temp = dummy;

        for (int i = 0; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return dummy;
    }


}
