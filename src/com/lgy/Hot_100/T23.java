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


    /**
     * 二刷
     * @param lists
     * @return
     */
    public ListNode mergeKLists_2(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        if(lists.length == 1 ){
            return lists[0];
        }
        ListNode res = lists[0];
        for(int i = 1;i < lists.length; i++){
            res = merge(res,lists[i]);
        }
        return res;
    }

    public ListNode merge(ListNode list1,ListNode list2){
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        ListNode root = new ListNode(-1);
        ListNode temp = root;

        while(list1!= null && list2 != null){
            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }
        if(list1!=null){
            temp.next = list1;
        }
        if(list2 != null){
            temp.next = list2;
        }

        return root.next;
    }


    /**
     * 三刷
     * @param lists
     * @return
     */
    public ListNode mergeKLists_3(ListNode[] lists) {
        if(lists.length == 0 ){
            return null;
        }

        ListNode list1 = lists[0];
        for(int i = 1;i < lists.length;i++){
            list1 = mergeLists(list1,lists[i]);
        }
        return list1;
    }
    public ListNode mergeLists(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }
        if(list1 != null){
            temp.next = list1;
        }else{
            temp.next = list2;
        }
        return dummy.next;
    }


}
