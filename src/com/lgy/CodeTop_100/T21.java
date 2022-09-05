package com.lgy.CodeTop_100;

import com.lgy.JZoffer.entity.ListNode;

/**
 * @author LGY
 * @create 2022-07-15 14:24
 */
public class T21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null)return list2;
        if(list2 == null)return list1;
        ListNode root = new ListNode(-1);
        ListNode temp = root;
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
        if(list1!=null){
            temp.next = list1;
        }
        if(list2 != null){
            temp.next = list2;
        }

        return root.next;
    }

    /**
     * 递归
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists_1(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }else if (list2 == null){
            return list1;
        }else if(list1.val < list2.val){
            list1.next = mergeTwoLists_1(list1.next,list2);
            return list1;
        }else {
            list2.next = mergeTwoLists_1(list1,list2.next);
            return list2;
        }
    }


    /**
     * 第二遍——合并两个有序链表
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists_2(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

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
        }
        if(list2!= null){
            temp.next = list2;
        }
        return dummy.next;
    }
}
